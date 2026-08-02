package io.radar.sdk.util;

import android.content.Context;
import io.radar.sdk.Radar;
import io.radar.sdk.RadarSettings;
import io.radar.sdk.model.RadarLog;
import io.radar.sdk.util.RadarLogBuffer;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RadarSimpleLogBuffer.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\b\u0000\u0018\u0000 *2\u00020\u0001:\u0001*B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0016J\u0015\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0002¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\rH\u0016J*\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&H\u0016J\u0016\u0010'\u001a\u00020\u001b2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0)H\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lio/radar/sdk/util/RadarSimpleLogBuffer;", "Lio/radar/sdk/util/RadarLogBuffer;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "lock", "", "logBuffer", "Ljava/util/concurrent/LinkedBlockingDeque;", "Lio/radar/sdk/model/RadarLog;", "persistentLogFeatureFlag", "", "timer", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "getFlushableLogs", "Lio/radar/sdk/util/Flushable;", "getLogFilesInTimeOrder", "", "Ljava/io/File;", "()[Ljava/io/File;", "isValidJson", "json", "", "persistLogs", "", "purgeOldestLogs", "readFromFileStorage", "setPersistentLogFeatureFlag", "write", "level", "Lio/radar/sdk/Radar$RadarLogLevel;", "type", "Lio/radar/sdk/Radar$RadarLogType;", "message", "createdAt", "Ljava/util/Date;", "writeToFileStorage", "logs", "", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarSimpleLogBuffer implements RadarLogBuffer {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String KEY_PURGED_LOG_LINE = "----- purged oldest logs -----";

    @Deprecated
    public static final int MAX_MEMORY_BUFFER_SIZE = 200;

    @Deprecated
    public static final int MAX_PERSISTED_BUFFER_SIZE = 500;

    @Deprecated
    public static final int PURGE_AMOUNT = 250;
    private static int fileCounter = 0;

    @Deprecated
    public static final String logFileDir = "radar_logs";
    private final Context context;
    private final Object lock;
    private final LinkedBlockingDeque<RadarLog> logBuffer;
    private boolean persistentLogFeatureFlag;
    private final ScheduledExecutorService timer;

    public RadarSimpleLogBuffer(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.lock = new Object();
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.timer = newScheduledThreadPool;
        this.logBuffer = new LinkedBlockingDeque<>();
        this.persistentLogFeatureFlag = RadarSettings.INSTANCE.getSdkConfiguration(getContext()).getUseLogPersistence();
        File file = new File(getContext().getFilesDir(), logFileDir);
        if (!file.exists()) {
            file.mkdir();
        }
        newScheduledThreadPool.scheduleWithFixedDelay(new Runnable() { // from class: io.radar.sdk.util.RadarSimpleLogBuffer$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                RadarSimpleLogBuffer._init_$lambda$0(RadarSimpleLogBuffer.this);
            }
        }, 2L, 2L, TimeUnit.SECONDS);
    }

    @Override // io.radar.sdk.util.RadarLogBuffer
    public Context getContext() {
        return this.context;
    }

    /* compiled from: RadarSimpleLogBuffer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lio/radar/sdk/util/RadarSimpleLogBuffer$Companion;", "", "()V", "KEY_PURGED_LOG_LINE", "", "MAX_MEMORY_BUFFER_SIZE", "", "MAX_PERSISTED_BUFFER_SIZE", "PURGE_AMOUNT", "fileCounter", "getFileCounter", "()I", "setFileCounter", "(I)V", "logFileDir", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int getFileCounter() {
            return RadarSimpleLogBuffer.fileCounter;
        }

        public final void setFileCounter(int i) {
            RadarSimpleLogBuffer.fileCounter = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(RadarSimpleLogBuffer this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.persistLogs();
    }

    @Override // io.radar.sdk.util.RadarLogBuffer
    public void setPersistentLogFeatureFlag(boolean persistentLogFeatureFlag) {
        this.persistentLogFeatureFlag = persistentLogFeatureFlag;
    }

    @Override // io.radar.sdk.util.RadarLogBuffer
    public void write(Radar.RadarLogLevel level, Radar.RadarLogType type, String message, Date createdAt) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        synchronized (this.lock) {
            this.logBuffer.put(new RadarLog(level, message, type, createdAt));
            if (this.persistentLogFeatureFlag) {
                if (this.logBuffer.size() > 200) {
                    persistLogs();
                }
            } else if (this.logBuffer.size() > 500) {
                purgeOldestLogs();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // io.radar.sdk.util.RadarLogBuffer
    public void persistLogs() {
        synchronized (this.lock) {
            if (this.persistentLogFeatureFlag && this.logBuffer.size() > 0) {
                writeToFileStorage(this.logBuffer);
                this.logBuffer.clear();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getLogFilesInTimeOrder$lambda$3(File file, File file2) {
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Long longOrNull = StringsKt.toLongOrNull(StringsKt.replace$default(name, "_", "", false, 4, (Object) null));
        long longValue = longOrNull != null ? longOrNull.longValue() : 0L;
        String name2 = file2.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        Long longOrNull2 = StringsKt.toLongOrNull(StringsKt.replace$default(name2, "_", "", false, 4, (Object) null));
        return Intrinsics.compare(longValue, longOrNull2 != null ? longOrNull2.longValue() : 0L);
    }

    private final File[] getLogFilesInTimeOrder() {
        return new RadarFileStorage(getContext()).sortedFilesInDirectory(logFileDir, new Comparator() { // from class: io.radar.sdk.util.RadarSimpleLogBuffer$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int logFilesInTimeOrder$lambda$3;
                logFilesInTimeOrder$lambda$3 = RadarSimpleLogBuffer.getLogFilesInTimeOrder$lambda$3((File) obj, (File) obj2);
                return logFilesInTimeOrder$lambda$3;
            }
        });
    }

    private final boolean isValidJson(String json) {
        try {
            new JSONObject(json);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    private final LinkedBlockingDeque<RadarLog> readFromFileStorage() {
        File[] logFilesInTimeOrder = getLogFilesInTimeOrder();
        LinkedBlockingDeque<RadarLog> linkedBlockingDeque = new LinkedBlockingDeque<>();
        if (logFilesInTimeOrder != null && logFilesInTimeOrder.length != 0) {
            Iterator it = ArrayIteratorKt.iterator(logFilesInTimeOrder);
            while (it.hasNext()) {
                File file = (File) it.next();
                RadarFileStorage radarFileStorage = new RadarFileStorage(getContext());
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                String readFileAtPath = radarFileStorage.readFileAtPath(logFileDir, name);
                String str = readFileAtPath;
                if (str == null || str.length() == 0 || !isValidJson(readFileAtPath)) {
                    file.delete();
                } else {
                    RadarLog fromJson = RadarLog.INSTANCE.fromJson(new JSONObject(readFileAtPath));
                    if (fromJson != null) {
                        linkedBlockingDeque.add(fromJson);
                    }
                }
            }
        }
        return linkedBlockingDeque;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeToFileStorage(Collection<RadarLog> logs) {
        for (RadarLog radarLog : logs) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Locale locale = Locale.US;
            int i = fileCounter;
            fileCounter = i + 1;
            String format = String.format(locale, "%04d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            String str = (radarLog.getCreatedAt().getTime() / 1000) + '_' + format;
            RadarFileStorage radarFileStorage = new RadarFileStorage(getContext());
            String jSONObject = radarLog.toJson().toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
            radarFileStorage.writeData(logFileDir, str, jSONObject);
        }
    }

    @Override // io.radar.sdk.util.RadarLogBuffer
    public Flushable<RadarLog> getFlushableLogs() {
        File file;
        final ArrayList arrayList = new ArrayList();
        synchronized (this.lock) {
            if (this.persistentLogFeatureFlag) {
                persistLogs();
                purgeOldestLogs();
                readFromFileStorage().drainTo(arrayList);
                File[] logFilesInTimeOrder = getLogFilesInTimeOrder();
                int min = Integer.min(arrayList.size(), logFilesInTimeOrder != null ? logFilesInTimeOrder.length : 0);
                for (int i = 0; i < min; i++) {
                    if (logFilesInTimeOrder != null && (file = logFilesInTimeOrder[i]) != null) {
                        file.delete();
                    }
                }
                Unit unit = Unit.INSTANCE;
            } else {
                Integer.valueOf(this.logBuffer.drainTo(arrayList));
            }
        }
        return new Flushable<RadarLog>() { // from class: io.radar.sdk.util.RadarSimpleLogBuffer$getFlushableLogs$2
            @Override // io.radar.sdk.util.Flushable
            public List<RadarLog> get() {
                return arrayList;
            }

            @Override // io.radar.sdk.util.Flushable
            public void onFlush(boolean success) {
                boolean z;
                LinkedBlockingDeque linkedBlockingDeque;
                if (success) {
                    return;
                }
                z = this.persistentLogFeatureFlag;
                if (z) {
                    this.writeToFileStorage(arrayList);
                    this.purgeOldestLogs();
                    return;
                }
                CollectionsKt.reverse(arrayList);
                List<RadarLog> list = arrayList;
                RadarSimpleLogBuffer radarSimpleLogBuffer = this;
                for (RadarLog radarLog : list) {
                    linkedBlockingDeque = radarSimpleLogBuffer.logBuffer;
                    if (!linkedBlockingDeque.offerFirst(radarLog)) {
                        radarSimpleLogBuffer.purgeOldestLogs();
                    }
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void purgeOldestLogs() {
        File file;
        if (this.persistentLogFeatureFlag) {
            File[] logFilesInTimeOrder = getLogFilesInTimeOrder();
            if (logFilesInTimeOrder == null || logFilesInTimeOrder.length == 0) {
                return;
            }
            boolean z = false;
            while (true) {
                if ((logFilesInTimeOrder != null ? logFilesInTimeOrder.length : 0) <= 500) {
                    return;
                }
                int min = Integer.min(250, logFilesInTimeOrder != null ? logFilesInTimeOrder.length : 0);
                for (int i = 0; i < min; i++) {
                    if (logFilesInTimeOrder != null && (file = logFilesInTimeOrder[i]) != null) {
                        file.delete();
                    }
                }
                if (!z) {
                    writeToFileStorage(CollectionsKt.listOf(new RadarLog(Radar.RadarLogLevel.DEBUG, KEY_PURGED_LOG_LINE, null, null, 8, null)));
                    z = true;
                }
                logFilesInTimeOrder = getLogFilesInTimeOrder();
            }
        } else {
            this.logBuffer.drainTo(new ArrayList(), 250);
            RadarLogBuffer.DefaultImpls.write$default(this, Radar.RadarLogLevel.DEBUG, null, KEY_PURGED_LOG_LINE, null, 8, null);
        }
    }
}
