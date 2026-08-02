package io.sentry.util;

import io.sentry.Breadcrumb;
import io.sentry.Hint;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.protocol.SentryException;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.protocol.SentryStackTrace;
import io.sentry.protocol.SentryThread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class EventSizeLimitingUtils {
    private static final int FRAMES_PER_SIDE = 250;
    private static final int MAX_FRAMES_PER_STACK = 500;

    private EventSizeLimitingUtils() {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051 A[Catch: all -> 0x006f, TryCatch #1 {all -> 0x006f, blocks: (B:2:0x0000, B:7:0x0007, B:9:0x000e, B:12:0x0046, B:15:0x0051, B:17:0x005b, B:26:0x003a, B:21:0x002e), top: B:1:0x0000, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SentryEvent limitEventSize(SentryEvent sentryEvent, Hint hint, SentryOptions sentryOptions) {
        SentryEvent execute;
        SentryEvent removeAllBreadcrumbs;
        try {
            if (sentryOptions.isEnableEventSizeLimiting() && !isSizeOk(sentryEvent, sentryOptions)) {
                sentryOptions.getLogger().log(SentryLevel.INFO, "Event %s exceeds %d bytes limit. Reducing size by dropping fields.", sentryEvent.getEventId(), 1048576L);
                SentryOptions.OnOversizedEventCallback onOversizedEvent = sentryOptions.getOnOversizedEvent();
                if (onOversizedEvent != null) {
                    try {
                        execute = onOversizedEvent.execute(sentryEvent, hint);
                        if (isSizeOk(execute, sentryOptions)) {
                            return execute;
                        }
                    } catch (Throwable th) {
                        sentryOptions.getLogger().log(SentryLevel.ERROR, "The onOversizedEvent callback threw an exception. It will be ignored and automatic reduction will continue.", th);
                    }
                    removeAllBreadcrumbs = removeAllBreadcrumbs(execute, sentryOptions);
                    if (!isSizeOk(removeAllBreadcrumbs, sentryOptions)) {
                        return removeAllBreadcrumbs;
                    }
                    SentryEvent truncateStackFrames = truncateStackFrames(removeAllBreadcrumbs, sentryOptions);
                    if (!isSizeOk(truncateStackFrames, sentryOptions)) {
                        sentryOptions.getLogger().log(SentryLevel.WARNING, "Event %s still exceeds size limit after reducing all fields. Event may be rejected by server.", sentryEvent.getEventId());
                    }
                    return truncateStackFrames;
                }
                execute = sentryEvent;
                removeAllBreadcrumbs = removeAllBreadcrumbs(execute, sentryOptions);
                if (!isSizeOk(removeAllBreadcrumbs, sentryOptions)) {
                }
            }
            return sentryEvent;
        } catch (Throwable th2) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "An error occurred while limiting event size. Event will be sent as-is.", th2);
            return sentryEvent;
        }
    }

    private static boolean isSizeOk(SentryEvent sentryEvent, SentryOptions sentryOptions) {
        return JsonSerializationUtils.byteSizeOf(sentryOptions.getSerializer(), sentryOptions.getLogger(), sentryEvent) <= 1048576;
    }

    private static SentryEvent removeAllBreadcrumbs(SentryEvent sentryEvent, SentryOptions sentryOptions) {
        List<Breadcrumb> breadcrumbs = sentryEvent.getBreadcrumbs();
        if (breadcrumbs != null && !breadcrumbs.isEmpty()) {
            sentryEvent.setBreadcrumbs(null);
            sentryOptions.getLogger().log(SentryLevel.DEBUG, "Removed breadcrumbs to reduce size of event %s", sentryEvent.getEventId());
        }
        return sentryEvent;
    }

    private static SentryEvent truncateStackFrames(SentryEvent sentryEvent, SentryOptions sentryOptions) {
        List<SentryException> exceptions = sentryEvent.getExceptions();
        if (exceptions != null) {
            Iterator<SentryException> it = exceptions.iterator();
            while (it.hasNext()) {
                SentryStackTrace stacktrace = it.next().getStacktrace();
                if (stacktrace != null) {
                    truncateStackFramesInStackTrace(stacktrace, sentryEvent, sentryOptions, "Truncated exception stack frames of event %s");
                }
            }
        }
        List<SentryThread> threads = sentryEvent.getThreads();
        if (threads != null) {
            Iterator<SentryThread> it2 = threads.iterator();
            while (it2.hasNext()) {
                SentryStackTrace stacktrace2 = it2.next().getStacktrace();
                if (stacktrace2 != null) {
                    truncateStackFramesInStackTrace(stacktrace2, sentryEvent, sentryOptions, "Truncated thread stack frames for event %s");
                }
            }
        }
        return sentryEvent;
    }

    private static void truncateStackFramesInStackTrace(SentryStackTrace sentryStackTrace, SentryEvent sentryEvent, SentryOptions sentryOptions, String str) {
        List<SentryStackFrame> frames = sentryStackTrace.getFrames();
        if (frames == null || frames.size() <= 500) {
            return;
        }
        ArrayList arrayList = new ArrayList(500);
        arrayList.addAll(frames.subList(0, 250));
        arrayList.addAll(frames.subList(frames.size() - 250, frames.size()));
        sentryStackTrace.setFrames(arrayList);
        sentryOptions.getLogger().log(SentryLevel.DEBUG, str, sentryEvent.getEventId());
    }
}
