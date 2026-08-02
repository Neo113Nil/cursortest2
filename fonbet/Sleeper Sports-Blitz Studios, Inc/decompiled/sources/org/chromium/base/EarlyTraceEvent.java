package org.chromium.base;

import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import internal.org.jni_zero.JNINamespace;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@JNINamespace("base::android")
/* loaded from: classes10.dex */
public class EarlyTraceEvent {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String BACKGROUND_STARTUP_TRACING_ENABLED_KEY = "bg_startup_tracing";
    static final int STATE_DISABLED = 0;
    static final int STATE_ENABLED = 1;
    static final int STATE_FINISHED = 2;
    private static final String TRACE_CONFIG_FILENAME = "/data/local/chrome-trace-config.json";
    public static final String TRACE_EARLY_JAVA_IN_CHILD_SWITCH = "trace-early-java-in-child";
    private static final String TRACE_STARTUP_SWITCH = "trace-startup";
    static List<AsyncEvent> sAsyncEvents;
    private static boolean sCachedBackgroundStartupTracingFlag;
    private static volatile boolean sEnabledInChildProcessBeforeCommandLine;
    static List<Event> sEvents;
    static volatile int sState;
    static final Object sLock = new Object();
    static final List<ActivityStartupEvent> sActivityStartupEvents = new ArrayList();
    static final List<ActivityLaunchCauseEvent> sActivityLaunchCauseEvents = new ArrayList();

    interface Natives {
        void recordEarlyAsyncBeginEvent(String name, long id, long timeNanos);

        void recordEarlyAsyncEndEvent(long id, long timeNanos);

        void recordEarlyBeginEvent(String name, long timeNanos, int threadId, long threadMillis);

        void recordEarlyEndEvent(String name, long timeNanos, int threadId, long threadMillis);

        void recordEarlyToplevelBeginEvent(String name, long timeNanos, int threadId, long threadMillis);

        void recordEarlyToplevelEndEvent(String name, long timeNanos, int threadId, long threadMillis);
    }

    static final class Event {
        final boolean mIsStart;
        final boolean mIsToplevel;
        final String mName;
        final int mThreadId = Process.myTid();
        final long mTimeNanos = System.nanoTime();
        final long mThreadTimeMillis = SystemClock.currentThreadTimeMillis();

        Event(String name, boolean isStart, boolean isToplevel) {
            this.mIsStart = isStart;
            this.mIsToplevel = isToplevel;
            this.mName = name;
        }
    }

    static final class AsyncEvent {
        final long mId;
        final boolean mIsStart;
        final String mName;
        final long mTimeNanos = System.nanoTime();

        AsyncEvent(String name, long id, boolean isStart) {
            this.mName = name;
            this.mId = id;
            this.mIsStart = isStart;
        }
    }

    static final class ActivityStartupEvent {
        final long mId;
        final long mTimeMs;

        ActivityStartupEvent(long id, long timeMs) {
            this.mId = id;
            this.mTimeMs = timeMs;
        }
    }

    static final class ActivityLaunchCauseEvent {
        final long mId;
        final int mLaunchCause;
        final long mTimeMs = SystemClock.uptimeMillis();

        ActivityLaunchCauseEvent(long id, int launchCause) {
            this.mId = id;
            this.mLaunchCause = launchCause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void maybeEnableInBrowserProcess() {
        boolean z;
        ThreadUtils.assertOnUiThread();
        if (sState != 0) {
            return;
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            boolean z2 = true;
            if (CommandLine.getInstance().hasSwitch(TRACE_STARTUP_SWITCH)) {
                z = true;
            } else {
                try {
                    z = new File(TRACE_CONFIG_FILENAME).exists();
                } catch (SecurityException unused) {
                    z = false;
                }
            }
            if (ContextUtils.getAppSharedPreferences().getBoolean(BACKGROUND_STARTUP_TRACING_ENABLED_KEY, false)) {
                if (z) {
                    setBackgroundStartupTracingFlag(false);
                    sCachedBackgroundStartupTracingFlag = false;
                } else {
                    sCachedBackgroundStartupTracingFlag = true;
                    if (z2) {
                        return;
                    }
                    enable();
                    return;
                }
            }
            z2 = z;
            if (z2) {
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static void earlyEnableInChildWithoutCommandLine() {
        sEnabledInChildProcessBeforeCommandLine = true;
        enable();
    }

    public static void onCommandLineAvailableInChildProcess() {
        if (sEnabledInChildProcessBeforeCommandLine) {
            synchronized (sLock) {
                if (!CommandLine.getInstance().hasSwitch(TRACE_EARLY_JAVA_IN_CHILD_SWITCH)) {
                    reset();
                } else {
                    if (sState == 0) {
                        enable();
                    }
                }
            }
        }
    }

    public static void enable() {
        synchronized (sLock) {
            if (sState != 0) {
                return;
            }
            sEvents = new ArrayList();
            sAsyncEvents = new ArrayList();
            sState = 1;
        }
    }

    static void disable() {
        synchronized (sLock) {
            if (enabled()) {
                if (!sEvents.isEmpty()) {
                    dumpEvents(sEvents);
                    sEvents.clear();
                }
                if (!sAsyncEvents.isEmpty()) {
                    dumpAsyncEvents(sAsyncEvents);
                    sAsyncEvents.clear();
                }
                sState = 2;
                sEvents = null;
                sAsyncEvents = null;
            }
        }
    }

    public static void reset() {
        synchronized (sLock) {
            sState = 0;
            sEvents = null;
            sAsyncEvents = null;
        }
    }

    static boolean enabled() {
        return sState == 1;
    }

    static void setBackgroundStartupTracingFlag(boolean enabled) {
        StrictModeContext allowDiskWrites = StrictModeContext.allowDiskWrites();
        try {
            ContextUtils.getAppSharedPreferences().edit().putBoolean(BACKGROUND_STARTUP_TRACING_ENABLED_KEY, enabled).apply();
            if (allowDiskWrites != null) {
                allowDiskWrites.close();
            }
        } catch (Throwable th) {
            if (allowDiskWrites != null) {
                try {
                    allowDiskWrites.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static boolean getBackgroundStartupTracingFlag() {
        return sCachedBackgroundStartupTracingFlag;
    }

    public static void begin(String name, boolean isToplevel) {
        if (enabled()) {
            Event event = new Event(name, true, isToplevel);
            synchronized (sLock) {
                if (enabled()) {
                    sEvents.add(event);
                }
            }
        }
    }

    public static void end(String name, boolean isToplevel) {
        if (enabled()) {
            Event event = new Event(name, false, isToplevel);
            synchronized (sLock) {
                if (enabled()) {
                    sEvents.add(event);
                }
            }
        }
    }

    public static void startAsync(String name, long id) {
        if (enabled()) {
            AsyncEvent asyncEvent = new AsyncEvent(name, id, true);
            synchronized (sLock) {
                if (enabled()) {
                    sAsyncEvents.add(asyncEvent);
                }
            }
        }
    }

    public static void finishAsync(String name, long id) {
        if (enabled()) {
            AsyncEvent asyncEvent = new AsyncEvent(name, id, false);
            synchronized (sLock) {
                if (enabled()) {
                    sAsyncEvents.add(asyncEvent);
                }
            }
        }
    }

    public static void startupActivityStart(long activityId, long startTimeMs) {
        ActivityStartupEvent activityStartupEvent = new ActivityStartupEvent(activityId, startTimeMs);
        synchronized (sLock) {
            sActivityStartupEvents.add(activityStartupEvent);
        }
    }

    public static void startupLaunchCause(long activityId, int launchCause) {
        ActivityLaunchCauseEvent activityLaunchCauseEvent = new ActivityLaunchCauseEvent(activityId, launchCause);
        synchronized (sLock) {
            sActivityLaunchCauseEvents.add(activityLaunchCauseEvent);
        }
    }

    static List<Event> getMatchingCompletedEventsForTesting(String eventName) {
        synchronized (sLock) {
            ArrayList arrayList = new ArrayList();
            if (!enabled()) {
                return arrayList;
            }
            for (Event event : sEvents) {
                if (event.mName.equals(eventName)) {
                    arrayList.add(event);
                }
            }
            return arrayList;
        }
    }

    private static void dumpEvents(List<Event> events) {
        for (Event event : events) {
            if (event.mIsStart) {
                if (event.mIsToplevel) {
                    EarlyTraceEventJni.get().recordEarlyToplevelBeginEvent(event.mName, event.mTimeNanos, event.mThreadId, event.mThreadTimeMillis);
                } else {
                    EarlyTraceEventJni.get().recordEarlyBeginEvent(event.mName, event.mTimeNanos, event.mThreadId, event.mThreadTimeMillis);
                }
            } else if (event.mIsToplevel) {
                EarlyTraceEventJni.get().recordEarlyToplevelEndEvent(event.mName, event.mTimeNanos, event.mThreadId, event.mThreadTimeMillis);
            } else {
                EarlyTraceEventJni.get().recordEarlyEndEvent(event.mName, event.mTimeNanos, event.mThreadId, event.mThreadTimeMillis);
            }
        }
    }

    private static void dumpAsyncEvents(List<AsyncEvent> events) {
        for (AsyncEvent asyncEvent : events) {
            if (asyncEvent.mIsStart) {
                EarlyTraceEventJni.get().recordEarlyAsyncBeginEvent(asyncEvent.mName, asyncEvent.mId, asyncEvent.mTimeNanos);
            } else {
                EarlyTraceEventJni.get().recordEarlyAsyncEndEvent(asyncEvent.mId, asyncEvent.mTimeNanos);
            }
        }
    }

    public static void dumpActivityStartupEvents() {
        synchronized (sLock) {
            List<ActivityStartupEvent> list = sActivityStartupEvents;
            if (!list.isEmpty()) {
                for (ActivityStartupEvent activityStartupEvent : list) {
                    TraceEventJni.get().startupActivityStart(activityStartupEvent.mId, activityStartupEvent.mTimeMs);
                }
                sActivityStartupEvents.clear();
            }
            List<ActivityLaunchCauseEvent> list2 = sActivityLaunchCauseEvents;
            if (!list2.isEmpty()) {
                for (ActivityLaunchCauseEvent activityLaunchCauseEvent : list2) {
                    TraceEventJni.get().startupLaunchCause(activityLaunchCauseEvent.mId, activityLaunchCauseEvent.mTimeMs, activityLaunchCauseEvent.mLaunchCause);
                }
                sActivityLaunchCauseEvents.clear();
            }
        }
    }
}
