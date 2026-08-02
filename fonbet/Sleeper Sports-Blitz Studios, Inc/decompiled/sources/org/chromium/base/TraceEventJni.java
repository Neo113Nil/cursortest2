package org.chromium.base;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.base.TraceEvent;

/* loaded from: classes10.dex */
class TraceEventJni implements TraceEvent.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    TraceEventJni() {
    }

    public static TraceEvent.Natives get() {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && jniTestInstanceHolder.value != null) {
            return (TraceEvent.Natives) jniTestInstanceHolder.value;
        }
        return new TraceEventJni();
    }

    public static void setInstanceForTesting(TraceEvent.Natives impl) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = impl;
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void addViewDump(int id, int parentId, boolean isShown, boolean isDirty, String className, String resourceName, long activityProtoPtr) {
        GEN_JNI.org_chromium_base_TraceEvent_addViewDump(id, parentId, isShown, isDirty, className, resourceName, activityProtoPtr);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void begin(String name, String arg) {
        GEN_JNI.org_chromium_base_TraceEvent_begin(name, arg);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void beginToplevel(String target) {
        GEN_JNI.org_chromium_base_TraceEvent_beginToplevel(target);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void beginWithIntArg(String name, int arg) {
        GEN_JNI.org_chromium_base_TraceEvent_beginWithIntArg(name, arg);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void end(String arg, long flow) {
        GEN_JNI.org_chromium_base_TraceEvent_end(arg, flow);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void endToplevel() {
        GEN_JNI.org_chromium_base_TraceEvent_endToplevel();
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void finishAsync(long id) {
        GEN_JNI.org_chromium_base_TraceEvent_finishAsync(id);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void initViewHierarchyDump(long id, Object list) {
        GEN_JNI.org_chromium_base_TraceEvent_initViewHierarchyDump(id, list);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void instant(String name, String arg) {
        GEN_JNI.org_chromium_base_TraceEvent_instant(name, arg);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void instantAndroidIPC(String name, long durMs) {
        GEN_JNI.org_chromium_base_TraceEvent_instantAndroidIPC(name, durMs);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void instantAndroidToolbar(int blockReason, int allowReason, int snapshotDiff) {
        GEN_JNI.org_chromium_base_TraceEvent_instantAndroidToolbar(blockReason, allowReason, snapshotDiff);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void registerEnabledObserver() {
        GEN_JNI.org_chromium_base_TraceEvent_registerEnabledObserver();
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public long startActivityDump(String name, long dumpProtoPtr) {
        return GEN_JNI.org_chromium_base_TraceEvent_startActivityDump(name, dumpProtoPtr);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void startAsync(String name, long id) {
        GEN_JNI.org_chromium_base_TraceEvent_startAsync(name, id);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void startupActivityStart(long activityId, long startTimeMs) {
        GEN_JNI.org_chromium_base_TraceEvent_startupActivityStart(activityId, startTimeMs);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void startupLaunchCause(long activityId, long startTimeMs, int launchCause) {
        GEN_JNI.org_chromium_base_TraceEvent_startupLaunchCause(activityId, startTimeMs, launchCause);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void startupTimeToFirstVisibleContent2(long activityId, long startTimeMs, long durationMs) {
        GEN_JNI.org_chromium_base_TraceEvent_startupTimeToFirstVisibleContent2(activityId, startTimeMs, durationMs);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public boolean viewHierarchyDumpEnabled() {
        return GEN_JNI.org_chromium_base_TraceEvent_viewHierarchyDumpEnabled();
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void webViewStartupFirstInstance(long startTimeMs, long durationMs, boolean includedGlobalStartup) {
        GEN_JNI.org_chromium_base_TraceEvent_webViewStartupFirstInstance(startTimeMs, durationMs, includedGlobalStartup);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void webViewStartupNotFirstInstance(long startTimeMs, long durationMs) {
        GEN_JNI.org_chromium_base_TraceEvent_webViewStartupNotFirstInstance(startTimeMs, durationMs);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void webViewStartupStage1(long startTimeMs, long durationMs) {
        GEN_JNI.org_chromium_base_TraceEvent_webViewStartupStage1(startTimeMs, durationMs);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void webViewStartupStartChromiumLocked(long startTimeMs, long durationMs, int startCallSite, int finishCallSite, int startupMode) {
        GEN_JNI.org_chromium_base_TraceEvent_webViewStartupStartChromiumLocked(startTimeMs, durationMs, startCallSite, finishCallSite, startupMode);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void webViewStartupTotalFactoryInit(long startTimeMs, long durationMs) {
        GEN_JNI.org_chromium_base_TraceEvent_webViewStartupTotalFactoryInit(startTimeMs, durationMs);
    }
}
