package org.chromium.base;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.util.Printer;
import android.view.View;
import android.view.ViewGroup;
import internal.org.jni_zero.JNINamespace;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.base.TraceEvent;
import org.chromium.base.task.PostTask;

@JNINamespace("base::android")
/* loaded from: classes10.dex */
public class TraceEvent implements AutoCloseable {
    private static volatile boolean sEnabled;
    private static boolean sEventNameFilteringEnabled;
    private static volatile boolean sUiThreadReady;
    private final String mName;

    interface Natives {
        void addViewDump(int id, int parentId, boolean isShown, boolean isDirty, String className, String resourceName, long activityProtoPtr);

        void begin(String name, String arg);

        void beginToplevel(String target);

        void beginWithIntArg(String name, int arg);

        void end(String arg, long flow);

        void endToplevel();

        void finishAsync(long id);

        void initViewHierarchyDump(long id, Object list);

        void instant(String name, String arg);

        void instantAndroidIPC(String name, long durMs);

        void instantAndroidToolbar(int blockReason, int allowReason, int snapshotDiff);

        void registerEnabledObserver();

        long startActivityDump(String name, long dumpProtoPtr);

        void startAsync(String name, long id);

        void startupActivityStart(long activityId, long startTimeMs);

        void startupLaunchCause(long activityId, long startTimeMs, int launchCause);

        void startupTimeToFirstVisibleContent2(long activityId, long startTimeMs, long durationMs);

        boolean viewHierarchyDumpEnabled();

        void webViewStartupFirstInstance(long startTimeMs, long durationMs, boolean includedGlobalStartup);

        void webViewStartupNotFirstInstance(long startTimeMs, long durationMs);

        void webViewStartupStage1(long startTimeMs, long durationMs);

        void webViewStartupStartChromiumLocked(long startTimeMs, long durationMs, int startCallSite, int finishCallSite, int startupMode);

        void webViewStartupTotalFactoryInit(long startTimeMs, long durationMs);
    }

    static class BasicLooperMonitor implements Printer {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        static final String FILTERED_EVENT_NAME = "Looper.dispatch: EVENT_NAME_FILTERED";
        static final String LOOPER_TASK_PREFIX = "Looper.dispatch: ";
        private static final int SHORTEST_LOG_PREFIX_LENGTH = 18;
        private String mCurrentTarget;

        BasicLooperMonitor() {
        }

        @Override // android.util.Printer
        public void println(final String line) {
            if (line.startsWith(">")) {
                beginHandling(line);
            } else {
                endHandling(line);
            }
        }

        void beginHandling(final String line) {
            boolean enabled = EarlyTraceEvent.enabled();
            if (TraceEvent.sEnabled || enabled) {
                this.mCurrentTarget = getTraceEventName(line);
                if (TraceEvent.sEnabled) {
                    TraceEventJni.get().beginToplevel(this.mCurrentTarget);
                } else {
                    EarlyTraceEvent.begin(this.mCurrentTarget, true);
                }
            }
        }

        void endHandling(final String line) {
            boolean enabled = EarlyTraceEvent.enabled();
            if ((TraceEvent.sEnabled || enabled) && this.mCurrentTarget != null) {
                if (TraceEvent.sEnabled) {
                    TraceEventJni.get().endToplevel();
                } else {
                    EarlyTraceEvent.end(this.mCurrentTarget, true);
                }
            }
            this.mCurrentTarget = null;
        }

        static String getTraceEventName(String line) {
            if (TraceEvent.sEventNameFilteringEnabled) {
                return FILTERED_EVENT_NAME;
            }
            return LOOPER_TASK_PREFIX + getTarget(line) + "(" + getTargetName(line) + ")";
        }

        private static String getTarget(String logLine) {
            int indexOf = logLine.indexOf(40, SHORTEST_LOG_PREFIX_LENGTH);
            int indexOf2 = indexOf == -1 ? -1 : logLine.indexOf(41, indexOf);
            return indexOf2 != -1 ? logLine.substring(indexOf + 1, indexOf2) : "";
        }

        private static String getTargetName(String logLine) {
            int indexOf = logLine.indexOf(125, SHORTEST_LOG_PREFIX_LENGTH);
            int indexOf2 = indexOf == -1 ? -1 : logLine.indexOf(58, indexOf);
            if (indexOf2 == -1) {
                indexOf2 = logLine.length();
            }
            return indexOf != -1 ? logLine.substring(indexOf + 2, indexOf2) : "";
        }
    }

    private static final class IdleTracingLooperMonitor extends BasicLooperMonitor implements MessageQueue.IdleHandler {
        private static final long FRAME_DURATION_MILLIS = 16;
        private static final String IDLE_EVENT_NAME = "Looper.queueIdle";
        private static final long MIN_INTERESTING_BURST_DURATION_MILLIS = 48;
        private static final long MIN_INTERESTING_DURATION_MILLIS = 16;
        private static final String TAG = "TraceEvt_LooperMonitor";
        private boolean mIdleMonitorAttached;
        private long mLastIdleStartedAt;
        private long mLastWorkStartedAt;
        private int mNumIdlesSeen;
        private int mNumTasksSeen;
        private int mNumTasksSinceLastIdle;

        private IdleTracingLooperMonitor() {
        }

        private final void syncIdleMonitoring() {
            if (TraceEvent.sEnabled && !this.mIdleMonitorAttached) {
                this.mLastIdleStartedAt = TimeUtils.elapsedRealtimeMillis();
                Looper.myQueue().addIdleHandler(this);
                this.mIdleMonitorAttached = true;
                android.util.Log.v(TAG, "attached idle handler");
                return;
            }
            if (!this.mIdleMonitorAttached || TraceEvent.sEnabled) {
                return;
            }
            Looper.myQueue().removeIdleHandler(this);
            this.mIdleMonitorAttached = false;
            android.util.Log.v(TAG, "detached idle handler");
        }

        @Override // org.chromium.base.TraceEvent.BasicLooperMonitor
        final void beginHandling(final String line) {
            if (this.mNumTasksSinceLastIdle == 0) {
                TraceEvent.end(IDLE_EVENT_NAME);
            }
            this.mLastWorkStartedAt = TimeUtils.elapsedRealtimeMillis();
            syncIdleMonitoring();
            super.beginHandling(line);
        }

        @Override // org.chromium.base.TraceEvent.BasicLooperMonitor
        final void endHandling(final String line) {
            long elapsedRealtimeMillis = TimeUtils.elapsedRealtimeMillis() - this.mLastWorkStartedAt;
            if (elapsedRealtimeMillis > 16) {
                traceAndLog(5, "observed a task that took " + elapsedRealtimeMillis + "ms: " + line);
            }
            super.endHandling(line);
            syncIdleMonitoring();
            this.mNumTasksSeen++;
            this.mNumTasksSinceLastIdle++;
        }

        private static void traceAndLog(int level, String message) {
            TraceEvent.instant("TraceEvent.LooperMonitor:IdleStats", message);
            android.util.Log.println(level, TAG, message);
        }

        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            long elapsedRealtimeMillis = TimeUtils.elapsedRealtimeMillis();
            if (this.mLastIdleStartedAt == 0) {
                this.mLastIdleStartedAt = elapsedRealtimeMillis;
            }
            long j = elapsedRealtimeMillis - this.mLastIdleStartedAt;
            this.mNumIdlesSeen++;
            TraceEvent.begin(IDLE_EVENT_NAME, this.mNumTasksSinceLastIdle + " tasks since last idle.");
            if (j > MIN_INTERESTING_BURST_DURATION_MILLIS) {
                traceAndLog(3, this.mNumTasksSeen + " tasks and " + this.mNumIdlesSeen + " idles processed so far, " + this.mNumTasksSinceLastIdle + " tasks bursted and " + j + "ms elapsed since last idle");
            }
            this.mLastIdleStartedAt = elapsedRealtimeMillis;
            this.mNumTasksSinceLastIdle = 0;
            return true;
        }
    }

    private static final class LooperMonitorHolder {
        private static final BasicLooperMonitor sInstance;

        private LooperMonitorHolder() {
        }

        static {
            BasicLooperMonitor basicLooperMonitor;
            if (CommandLine.getInstance().hasSwitch(BaseSwitches.ENABLE_IDLE_TRACING)) {
                basicLooperMonitor = new IdleTracingLooperMonitor();
            } else {
                basicLooperMonitor = new BasicLooperMonitor();
            }
            sInstance = basicLooperMonitor;
        }
    }

    private TraceEvent(String name, String arg) {
        this.mName = name;
        begin(name, arg);
    }

    private TraceEvent(String name, int arg) {
        this.mName = name;
        begin(name, arg);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        end(this.mName);
    }

    public static TraceEvent scoped(String name, String arg) {
        if (EarlyTraceEvent.enabled() || enabled()) {
            return new TraceEvent(name, arg);
        }
        return null;
    }

    public static TraceEvent scoped(String name, int arg) {
        if (EarlyTraceEvent.enabled() || enabled()) {
            return new TraceEvent(name, arg);
        }
        return null;
    }

    public static TraceEvent scoped(String name) {
        return scoped(name, (String) null);
    }

    public static void setEnabled(boolean enabled) {
        if (enabled) {
            EarlyTraceEvent.disable();
        }
        if (sEnabled != enabled) {
            sEnabled = enabled;
            ThreadUtils.getUiThreadLooper().setMessageLogging(enabled ? LooperMonitorHolder.sInstance : null);
        }
        if (sEnabled) {
            EarlyTraceEvent.dumpActivityStartupEvents();
        }
        if (sUiThreadReady) {
            ViewHierarchyDumper.updateEnabledState();
        }
    }

    public static void setEventNameFilteringEnabled(boolean enabled) {
        sEventNameFilteringEnabled = enabled;
    }

    public static boolean eventNameFilteringEnabled() {
        return sEventNameFilteringEnabled;
    }

    public static void maybeEnableEarlyTracing(boolean readCommandLine) {
        if (readCommandLine) {
            EarlyTraceEvent.maybeEnableInBrowserProcess();
        }
        if (EarlyTraceEvent.enabled()) {
            ThreadUtils.getUiThreadLooper().setMessageLogging(LooperMonitorHolder.sInstance);
        }
    }

    public static void onNativeTracingReady() {
        TraceEventJni.get().registerEnabledObserver();
    }

    static void onUiThreadReady() {
        sUiThreadReady = true;
        if (sEnabled) {
            ViewHierarchyDumper.updateEnabledState();
        }
    }

    public static boolean enabled() {
        return sEnabled;
    }

    public static void instant(String name) {
        if (sEnabled) {
            TraceEventJni.get().instant(name, null);
        }
    }

    public static void instant(String name, String arg) {
        if (sEnabled) {
            TraceEventJni.get().instant(name, arg);
        }
    }

    public static void instantAndroidIPC(String name, long durMs) {
        if (sEnabled) {
            TraceEventJni.get().instantAndroidIPC(name, durMs);
        }
    }

    public static void instantAndroidToolbar(int blockReason, int allowReason, int snapshotDiff) {
        if (sEnabled) {
            TraceEventJni.get().instantAndroidToolbar(blockReason, allowReason, snapshotDiff);
        }
    }

    public static void webViewStartupTotalFactoryInit(long startTimeMs, long durationMs) {
        if (sEnabled) {
            TraceEventJni.get().webViewStartupTotalFactoryInit(startTimeMs, durationMs);
        }
    }

    public static void webViewStartupStage1(long startTimeMs, long durationMs) {
        if (sEnabled) {
            TraceEventJni.get().webViewStartupStage1(startTimeMs, durationMs);
        }
    }

    public static void webViewStartupFirstInstance(long startTimeMs, long durationMs, boolean includedGlobalStartup) {
        if (sEnabled) {
            TraceEventJni.get().webViewStartupFirstInstance(startTimeMs, durationMs, includedGlobalStartup);
        }
    }

    public static void webViewStartupNotFirstInstance(long startTimeMs, long durationMs) {
        if (sEnabled) {
            TraceEventJni.get().webViewStartupNotFirstInstance(startTimeMs, durationMs);
        }
    }

    public static void webViewStartupStartChromiumLocked(long startTimeMs, long durationMs, int startCallSite, int finishCallSite, int startupMode) {
        if (sEnabled) {
            TraceEventJni.get().webViewStartupStartChromiumLocked(startTimeMs, durationMs, startCallSite, finishCallSite, startupMode);
        }
    }

    public static void startupActivityStart(long activityId, long startTimeMs) {
        if (sEnabled) {
            TraceEventJni.get().startupActivityStart(activityId, startTimeMs);
        } else {
            EarlyTraceEvent.startupActivityStart(activityId, startTimeMs);
        }
    }

    public static void startupLaunchCause(long activityId, int launchCause) {
        if (sEnabled) {
            TraceEventJni.get().startupLaunchCause(activityId, SystemClock.uptimeMillis(), launchCause);
        } else {
            EarlyTraceEvent.startupLaunchCause(activityId, launchCause);
        }
    }

    public static void startupTimeToFirstVisibleContent2(long activityId, long startTimeMs, long durationMs) {
        if (sEnabled) {
            TraceEventJni.get().startupTimeToFirstVisibleContent2(activityId, startTimeMs, durationMs);
        }
    }

    public static void snapshotViewHierarchy() {
        if (sEnabled && TraceEventJni.get().viewHierarchyDumpEnabled()) {
            begin("instantAndroidViewHierarchy");
            final ArrayList<ActivityInfo> snapshotViewHierarchyState = snapshotViewHierarchyState();
            if (snapshotViewHierarchyState.isEmpty()) {
                end("instantAndroidViewHierarchy");
                return;
            }
            final long hashCode = snapshotViewHierarchyState.hashCode();
            PostTask.postTask(0, new Runnable() { // from class: org.chromium.base.TraceEvent$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    TraceEventJni.get().initViewHierarchyDump(hashCode, snapshotViewHierarchyState);
                }
            });
            end("instantAndroidViewHierarchy", null, hashCode);
        }
    }

    public static void startAsync(String name, long id) {
        EarlyTraceEvent.startAsync(name, id);
        if (sEnabled) {
            TraceEventJni.get().startAsync(name, id);
        }
    }

    public static void finishAsync(String name, long id) {
        EarlyTraceEvent.finishAsync(name, id);
        if (sEnabled) {
            TraceEventJni.get().finishAsync(id);
        }
    }

    public static void begin(String name) {
        begin(name, (String) null);
    }

    public static void begin(String name, String arg) {
        EarlyTraceEvent.begin(name, false);
        if (sEnabled) {
            TraceEventJni.get().begin(name, arg);
        }
    }

    public static void begin(String name, int arg) {
        EarlyTraceEvent.begin(name, false);
        if (sEnabled) {
            TraceEventJni.get().beginWithIntArg(name, arg);
        }
    }

    public static void end(String name) {
        end(name, null);
    }

    public static void end(String name, String arg) {
        end(name, arg, 0L);
    }

    public static void end(String name, String arg, long flow) {
        EarlyTraceEvent.end(name, false);
        if (sEnabled) {
            TraceEventJni.get().end(arg, flow);
        }
    }

    public static ArrayList<ActivityInfo> snapshotViewHierarchyState() {
        if (!ApplicationStatus.isInitialized()) {
            return new ArrayList<>();
        }
        ArrayList<ActivityInfo> arrayList = new ArrayList<>(2);
        for (Activity activity : ApplicationStatus.getRunningActivities()) {
            arrayList.add(new ActivityInfo(activity.getClass().getName()));
            ViewHierarchyDumper.dumpView(arrayList.get(arrayList.size() - 1), 0, activity.getWindow().getDecorView().getRootView());
        }
        return arrayList;
    }

    public static void dumpViewHierarchy(long dumpProtoPtr, Object list) {
        String str;
        if (ApplicationStatus.isInitialized()) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = (ActivityInfo) it.next();
                long startActivityDump = TraceEventJni.get().startActivityDump(activityInfo.mActivityName, dumpProtoPtr);
                Iterator<ViewInfo> it2 = activityInfo.mViews.iterator();
                while (it2.hasNext()) {
                    ViewInfo next = it2.next();
                    try {
                        if (next.mRes != null) {
                            if (next.mId != 0 && next.mId != -1) {
                                str = next.mRes.getResourceName(next.mId);
                            }
                            str = "__no_id__";
                        } else {
                            str = "__no_resources__";
                        }
                    } catch (Resources.NotFoundException unused) {
                        str = "__name_not_found__";
                    }
                    TraceEventJni.get().addViewDump(next.mId, next.mParentId, next.mIsShown, next.mIsDirty, next.mClassName, str, startActivityDump);
                }
            }
        }
    }

    public static class ViewInfo {
        private final String mClassName;
        private final int mId;
        private final boolean mIsDirty;
        private final boolean mIsShown;
        private final int mParentId;
        private final Resources mRes;

        public ViewInfo(int id, int parentId, boolean isShown, boolean isDirty, String className, Resources res) {
            this.mId = id;
            this.mParentId = parentId;
            this.mIsShown = isShown;
            this.mIsDirty = isDirty;
            this.mClassName = className;
            this.mRes = res;
        }
    }

    public static class ActivityInfo {
        public String mActivityName;
        public ArrayList<ViewInfo> mViews = new ArrayList<>(125);

        public ActivityInfo(String activityName) {
            this.mActivityName = activityName;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class ViewHierarchyDumper implements MessageQueue.IdleHandler {
        private static final long MIN_VIEW_DUMP_INTERVAL_MILLIS = 1000;
        private static ViewHierarchyDumper sInstance;
        private long mLastDumpTs;

        private ViewHierarchyDumper() {
        }

        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            long elapsedRealtimeMillis = TimeUtils.elapsedRealtimeMillis();
            long j = this.mLastDumpTs;
            if (j != 0 && elapsedRealtimeMillis - j <= 1000) {
                return true;
            }
            this.mLastDumpTs = elapsedRealtimeMillis;
            TraceEvent.snapshotViewHierarchy();
            return true;
        }

        public static void updateEnabledState() {
            PostTask.runOrPostTask(7, new Runnable() { // from class: org.chromium.base.TraceEvent$ViewHierarchyDumper$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    TraceEvent.ViewHierarchyDumper.setEnabled(TraceEventJni.get().viewHierarchyDumpEnabled());
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void dumpView(ActivityInfo collection, int parentId, View v) {
            ThreadUtils.assertOnUiThread();
            int id = v.getId();
            collection.mViews.add(new ViewInfo(id, parentId, v.isShown(), v.isDirty(), v.getClass().getSimpleName(), v.getResources()));
            if (v instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    dumpView(collection, id, viewGroup.getChildAt(i));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void setEnabled(boolean value) {
            ThreadUtils.assertOnUiThread();
            ViewHierarchyDumper viewHierarchyDumper = sInstance;
            if (viewHierarchyDumper == null && value) {
                sInstance = new ViewHierarchyDumper();
                Looper.myQueue().addIdleHandler(sInstance);
            } else {
                if (viewHierarchyDumper == null || value) {
                    return;
                }
                Looper.myQueue().removeIdleHandler(sInstance);
                sInstance = null;
            }
        }
    }
}
