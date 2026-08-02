package io.sentry;

import io.sentry.protocol.SentryStackFrame;
import io.sentry.protocol.SentryStackTrace;
import io.sentry.protocol.SentryThread;
import io.sentry.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class SentryThreadFactory {
    private final SentryStackTraceFactory sentryStackTraceFactory;

    public SentryThreadFactory(SentryStackTraceFactory sentryStackTraceFactory) {
        this.sentryStackTraceFactory = (SentryStackTraceFactory) Objects.requireNonNull(sentryStackTraceFactory, "The SentryStackTraceFactory is required.");
    }

    List<SentryThread> getCurrentThread(boolean z) {
        HashMap hashMap = new HashMap();
        Thread currentThread = Thread.currentThread();
        hashMap.put(currentThread, currentThread.getStackTrace());
        return getCurrentThreads(hashMap, null, false, z);
    }

    List<SentryThread> getCurrentThreads(List<Long> list, boolean z, boolean z2) {
        return getCurrentThreads(Thread.getAllStackTraces(), list, z, z2);
    }

    List<SentryThread> getCurrentThreads(List<Long> list, boolean z) {
        return getCurrentThreads(Thread.getAllStackTraces(), list, false, z);
    }

    List<SentryThread> getCurrentThreads(Map<Thread, StackTraceElement[]> map, List<Long> list, boolean z, boolean z2) {
        Thread currentThread = Thread.currentThread();
        if (map.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!map.containsKey(currentThread)) {
            map.put(currentThread, currentThread.getStackTrace());
        }
        for (Map.Entry<Thread, StackTraceElement[]> entry : map.entrySet()) {
            Thread key = entry.getKey();
            arrayList.add(getSentryThread((key == currentThread && !z) || !(list == null || !list.contains(Long.valueOf(key.getId())) || z), entry.getValue(), entry.getKey(), z2));
        }
        return arrayList;
    }

    private SentryThread getSentryThread(boolean z, StackTraceElement[] stackTraceElementArr, Thread thread, boolean z2) {
        List<SentryStackFrame> stackFrames;
        SentryThread sentryThread = new SentryThread();
        sentryThread.setName(thread.getName());
        sentryThread.setPriority(Integer.valueOf(thread.getPriority()));
        sentryThread.setId(Long.valueOf(thread.getId()));
        sentryThread.setDaemon(Boolean.valueOf(thread.isDaemon()));
        sentryThread.setState(thread.getState().name());
        sentryThread.setCrashed(Boolean.valueOf(z));
        if (z2 && (stackFrames = this.sentryStackTraceFactory.getStackFrames(stackTraceElementArr, false)) != null && !stackFrames.isEmpty()) {
            SentryStackTrace sentryStackTrace = new SentryStackTrace(stackFrames);
            sentryStackTrace.setSnapshot(true);
            sentryThread.setStacktrace(sentryStackTrace);
        }
        return sentryThread;
    }
}
