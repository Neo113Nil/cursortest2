package org.chromium.base;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.base.EarlyTraceEvent;

/* loaded from: classes10.dex */
class EarlyTraceEventJni implements EarlyTraceEvent.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    EarlyTraceEventJni() {
    }

    public static EarlyTraceEvent.Natives get() {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && jniTestInstanceHolder.value != null) {
            return (EarlyTraceEvent.Natives) jniTestInstanceHolder.value;
        }
        return new EarlyTraceEventJni();
    }

    public static void setInstanceForTesting(EarlyTraceEvent.Natives impl) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = impl;
    }

    @Override // org.chromium.base.EarlyTraceEvent.Natives
    public void recordEarlyAsyncBeginEvent(String name, long id, long timeNanos) {
        GEN_JNI.org_chromium_base_EarlyTraceEvent_recordEarlyAsyncBeginEvent(name, id, timeNanos);
    }

    @Override // org.chromium.base.EarlyTraceEvent.Natives
    public void recordEarlyAsyncEndEvent(long id, long timeNanos) {
        GEN_JNI.org_chromium_base_EarlyTraceEvent_recordEarlyAsyncEndEvent(id, timeNanos);
    }

    @Override // org.chromium.base.EarlyTraceEvent.Natives
    public void recordEarlyBeginEvent(String name, long timeNanos, int threadId, long threadMillis) {
        GEN_JNI.org_chromium_base_EarlyTraceEvent_recordEarlyBeginEvent(name, timeNanos, threadId, threadMillis);
    }

    @Override // org.chromium.base.EarlyTraceEvent.Natives
    public void recordEarlyEndEvent(String name, long timeNanos, int threadId, long threadMillis) {
        GEN_JNI.org_chromium_base_EarlyTraceEvent_recordEarlyEndEvent(name, timeNanos, threadId, threadMillis);
    }

    @Override // org.chromium.base.EarlyTraceEvent.Natives
    public void recordEarlyToplevelBeginEvent(String name, long timeNanos, int threadId, long threadMillis) {
        GEN_JNI.org_chromium_base_EarlyTraceEvent_recordEarlyToplevelBeginEvent(name, timeNanos, threadId, threadMillis);
    }

    @Override // org.chromium.base.EarlyTraceEvent.Natives
    public void recordEarlyToplevelEndEvent(String name, long timeNanos, int threadId, long threadMillis) {
        GEN_JNI.org_chromium_base_EarlyTraceEvent_recordEarlyToplevelEndEvent(name, timeNanos, threadId, threadMillis);
    }
}
