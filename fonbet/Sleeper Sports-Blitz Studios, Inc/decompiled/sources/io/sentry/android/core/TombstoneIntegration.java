package io.sentry.android.core;

import android.app.ApplicationExitInfo;
import android.content.Context;
import io.sentry.Attachment;
import io.sentry.DateUtils;
import io.sentry.Hint;
import io.sentry.ILogger;
import io.sentry.IScopes;
import io.sentry.Integration;
import io.sentry.SentryEnvelopeItem;
import io.sentry.SentryEvent;
import io.sentry.SentryItemType;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.ApplicationExitInfoHistoryDispatcher;
import io.sentry.android.core.NativeEventCollector;
import io.sentry.android.core.cache.AndroidEnvelopeCache;
import io.sentry.android.core.internal.tombstone.NativeExceptionMechanism;
import io.sentry.android.core.internal.tombstone.TombstoneParser;
import io.sentry.hints.Backfillable;
import io.sentry.hints.BlockingFlushHint;
import io.sentry.hints.NativeCrashExit;
import io.sentry.protocol.DebugMeta;
import io.sentry.protocol.Mechanism;
import io.sentry.protocol.SentryException;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryThread;
import io.sentry.transport.CurrentDateProvider;
import io.sentry.transport.ICurrentDateProvider;
import io.sentry.util.HintUtils;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import j$.time.Instant;
import j$.time.format.DateTimeFormatter;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes9.dex */
public class TombstoneIntegration implements Integration, Closeable {
    private final Context context;
    private final ICurrentDateProvider dateProvider;
    private SentryAndroidOptions options;

    public TombstoneIntegration(Context context) {
        this(context, CurrentDateProvider.getInstance());
    }

    TombstoneIntegration(Context context, ICurrentDateProvider iCurrentDateProvider) {
        this.context = ContextUtils.getApplicationContext(context);
        this.dateProvider = iCurrentDateProvider;
    }

    @Override // io.sentry.Integration
    public void register(IScopes iScopes, SentryOptions sentryOptions) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) Objects.requireNonNull(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.options = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "TombstoneIntegration enabled: %s", Boolean.valueOf(this.options.isTombstoneEnabled()));
        if (this.options.isTombstoneEnabled()) {
            if (this.options.getCacheDirPath() == null) {
                this.options.getLogger().log(SentryLevel.INFO, "Cache dir is not set, unable to process Tombstones", new Object[0]);
                return;
            }
            try {
                sentryOptions.getExecutorService().submit(new ApplicationExitInfoHistoryDispatcher(this.context, iScopes, this.options, this.dateProvider, new TombstonePolicy(this.options, this.context)));
            } catch (Throwable th) {
                sentryOptions.getLogger().log(SentryLevel.DEBUG, "Failed to start tombstone processor.", th);
            }
            sentryOptions.getLogger().log(SentryLevel.DEBUG, "TombstoneIntegration installed.", new Object[0]);
            IntegrationUtils.addIntegrationToSdkVersion(AndroidEnvelopeCache.LAST_TOMBSTONE_MARKER_LABEL);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        SentryAndroidOptions sentryAndroidOptions = this.options;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "TombstoneIntegration removed.", new Object[0]);
        }
    }

    public static class TombstonePolicy implements ApplicationExitInfoHistoryDispatcher.ApplicationExitInfoPolicy {
        private final Context context;
        private final NativeEventCollector nativeEventCollector;
        private final SentryAndroidOptions options;

        @Override // io.sentry.android.core.ApplicationExitInfoHistoryDispatcher.ApplicationExitInfoPolicy
        public int getTargetReason() {
            return 5;
        }

        public TombstonePolicy(SentryAndroidOptions sentryAndroidOptions, Context context) {
            this.options = sentryAndroidOptions;
            this.nativeEventCollector = new NativeEventCollector(sentryAndroidOptions);
            this.context = context;
        }

        @Override // io.sentry.android.core.ApplicationExitInfoHistoryDispatcher.ApplicationExitInfoPolicy
        public String getLabel() {
            return AndroidEnvelopeCache.LAST_TOMBSTONE_MARKER_LABEL;
        }

        @Override // io.sentry.android.core.ApplicationExitInfoHistoryDispatcher.ApplicationExitInfoPolicy
        public boolean shouldReportHistorical() {
            return this.options.isReportHistoricalTombstones();
        }

        @Override // io.sentry.android.core.ApplicationExitInfoHistoryDispatcher.ApplicationExitInfoPolicy
        public Long getLastReportedTimestamp() {
            return AndroidEnvelopeCache.lastReportedTombstone(this.options);
        }

        @Override // io.sentry.android.core.ApplicationExitInfoHistoryDispatcher.ApplicationExitInfoPolicy
        public ApplicationExitInfoHistoryDispatcher.Report buildReport(ApplicationExitInfo applicationExitInfo, boolean z) {
            long timestamp;
            InputStream traceInputStream;
            long timestamp2;
            long timestamp3;
            try {
                traceInputStream = applicationExitInfo.getTraceInputStream();
                if (traceInputStream == null) {
                    ILogger logger = this.options.getLogger();
                    SentryLevel sentryLevel = SentryLevel.WARNING;
                    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_INSTANT;
                    timestamp3 = applicationExitInfo.getTimestamp();
                    logger.log(sentryLevel, "No tombstone InputStream available for ApplicationExitInfo from %s", dateTimeFormatter.format(Instant.ofEpochMilli(timestamp3)));
                    return null;
                }
                TombstoneParser tombstoneParser = new TombstoneParser(traceInputStream, this.options.getInAppIncludes(), this.options.getInAppExcludes(), this.context.getApplicationInfo().nativeLibraryDir);
                try {
                    SentryEvent parse = tombstoneParser.parse();
                    tombstoneParser.close();
                    timestamp2 = applicationExitInfo.getTimestamp();
                    parse.setTimestamp(DateUtils.getDateTime(timestamp2));
                    TombstoneHint tombstoneHint = new TombstoneHint(this.options.getFlushTimeoutMillis(), this.options.getLogger(), timestamp2, z);
                    Hint createWithTypeCheckHint = HintUtils.createWithTypeCheckHint(tombstoneHint);
                    try {
                        SentryEvent mergeWithMatchingNativeEvents = mergeWithMatchingNativeEvents(timestamp2, parse, createWithTypeCheckHint);
                        if (mergeWithMatchingNativeEvents != null) {
                            parse = mergeWithMatchingNativeEvents;
                        }
                    } catch (Throwable th) {
                        this.options.getLogger().log(SentryLevel.WARNING, "Failed to merge native event with tombstone, continuing without merge: %s", th.getMessage());
                    }
                    return new ApplicationExitInfoHistoryDispatcher.Report(parse, createWithTypeCheckHint, tombstoneHint);
                } finally {
                }
            } catch (Throwable th2) {
                ILogger logger2 = this.options.getLogger();
                SentryLevel sentryLevel2 = SentryLevel.WARNING;
                DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ISO_INSTANT;
                timestamp = applicationExitInfo.getTimestamp();
                logger2.log(sentryLevel2, "Failed to parse tombstone from %s: %s", dateTimeFormatter2.format(Instant.ofEpochMilli(timestamp)), th2.getMessage());
                return null;
            }
        }

        private SentryEvent mergeWithMatchingNativeEvents(long j, SentryEvent sentryEvent, Hint hint) {
            NativeEventCollector.NativeEventData findAndRemoveMatchingNativeEvent = this.nativeEventCollector.findAndRemoveMatchingNativeEvent(j);
            if (findAndRemoveMatchingNativeEvent == null) {
                this.options.getLogger().log(SentryLevel.DEBUG, "No matching native event found for tombstone.", new Object[0]);
                return null;
            }
            this.options.getLogger().log(SentryLevel.DEBUG, "Found matching native event for tombstone, removing from outbox: %s", findAndRemoveMatchingNativeEvent.getFile().getName());
            if (!this.nativeEventCollector.deleteNativeEventFile(findAndRemoveMatchingNativeEvent)) {
                return null;
            }
            SentryEvent event = findAndRemoveMatchingNativeEvent.getEvent();
            mergeNativeCrashes(event, sentryEvent);
            addNativeAttachmentsToTombstoneHint(findAndRemoveMatchingNativeEvent, hint);
            return event;
        }

        private void addNativeAttachmentsToTombstoneHint(NativeEventCollector.NativeEventData nativeEventData, Hint hint) {
            for (SentryEnvelopeItem sentryEnvelopeItem : nativeEventData.getEnvelope().getItems()) {
                try {
                    String fileName = sentryEnvelopeItem.getHeader().getFileName();
                    if (sentryEnvelopeItem.getHeader().getType() == SentryItemType.Attachment && fileName != null) {
                        hint.addAttachment(new Attachment(sentryEnvelopeItem.getData(), fileName, sentryEnvelopeItem.getHeader().getContentType(), sentryEnvelopeItem.getHeader().getAttachmentType(), false));
                    }
                } catch (Throwable th) {
                    this.options.getLogger().log(SentryLevel.DEBUG, "Failed to process envelope item: %s", th.getMessage());
                }
            }
        }

        private void mergeNativeCrashes(SentryEvent sentryEvent, SentryEvent sentryEvent2) {
            List<SentryException> exceptions = sentryEvent2.getExceptions();
            DebugMeta debugMeta = sentryEvent2.getDebugMeta();
            List<SentryThread> threads = sentryEvent2.getThreads();
            if (exceptions == null || exceptions.isEmpty() || debugMeta == null || threads == null) {
                return;
            }
            Mechanism mechanism = exceptions.get(0).getMechanism();
            if (mechanism != null) {
                mechanism.setType(NativeExceptionMechanism.TOMBSTONE_MERGED.getValue());
            }
            if (sentryEvent.getMessage() == null || sentryEvent.getMessage().getMessage() == null || sentryEvent.getMessage().getMessage().isEmpty()) {
                sentryEvent.setMessage(sentryEvent2.getMessage());
            }
            sentryEvent.setExceptions(exceptions);
            sentryEvent.setDebugMeta(debugMeta);
            sentryEvent.setThreads(threads);
        }
    }

    public static final class TombstoneHint extends BlockingFlushHint implements Backfillable, NativeCrashExit {
        private final boolean shouldEnrich;
        private final long tombstoneTimestamp;

        @Override // io.sentry.hints.DiskFlushNotification
        public boolean isFlushable(SentryId sentryId) {
            return true;
        }

        @Override // io.sentry.hints.DiskFlushNotification
        public void setFlushable(SentryId sentryId) {
        }

        public TombstoneHint(long j, ILogger iLogger, long j2, boolean z) {
            super(j, iLogger);
            this.tombstoneTimestamp = j2;
            this.shouldEnrich = z;
        }

        @Override // io.sentry.hints.NativeCrashExit
        public Long timestamp() {
            return Long.valueOf(this.tombstoneTimestamp);
        }

        @Override // io.sentry.hints.Backfillable
        public boolean shouldEnrich() {
            return this.shouldEnrich;
        }
    }
}
