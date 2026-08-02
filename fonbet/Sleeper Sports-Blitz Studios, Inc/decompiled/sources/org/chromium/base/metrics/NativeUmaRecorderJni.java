package org.chromium.base.metrics;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.base.Callback;
import org.chromium.base.metrics.NativeUmaRecorder;

/* loaded from: classes10.dex */
public class NativeUmaRecorderJni implements NativeUmaRecorder.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    public static NativeUmaRecorder.Natives get() {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && jniTestInstanceHolder.value != null) {
            return (NativeUmaRecorder.Natives) jniTestInstanceHolder.value;
        }
        return new NativeUmaRecorderJni();
    }

    public static void setInstanceForTesting(NativeUmaRecorder.Natives impl) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = impl;
    }

    @Override // org.chromium.base.metrics.NativeUmaRecorder.Natives
    public long addActionCallbackForTesting(Callback callback) {
        return GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_addActionCallbackForTesting(callback);
    }

    @Override // org.chromium.base.metrics.NativeUmaRecorder.Natives
    public long createHistogramSnapshotForTesting() {
        return GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_createHistogramSnapshotForTesting();
    }

    @Override // org.chromium.base.metrics.NativeUmaRecorder.Natives
    public void destroyHistogramSnapshotForTesting(long snapshotPtr) {
        GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_destroyHistogramSnapshotForTesting(snapshotPtr);
    }

    @Override // org.chromium.base.metrics.NativeUmaRecorder.Natives
    public long[] getHistogramSamplesForTesting(String name) {
        return (long[]) GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_getHistogramSamplesForTesting(name);
    }

    @Override // org.chromium.base.metrics.NativeUmaRecorder.Natives
    public int getHistogramTotalCountForTesting(String name, long snapshotPtr) {
        return GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_getHistogramTotalCountForTesting(name, snapshotPtr);
    }

    @Override // org.chromium.base.metrics.NativeUmaRecorder.Natives
    public int getHistogramValueCountForTesting(String name, int sample, long snapshotPtr) {
        return GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_getHistogramValueCountForTesting(name, sample, snapshotPtr);
    }

    @Override // org.chromium.base.metrics.NativeUmaRecorder.Natives
    public long recordBooleanHistogram(String name, long nativeHint, boolean sample) {
        return GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_recordBooleanHistogram(name, nativeHint, sample);
    }

    @Override // org.chromium.base.metrics.NativeUmaRecorder.Natives
    public long recordExponentialHistogram(String name, long nativeHint, int sample, int min, int max, int numBuckets) {
        return GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_recordExponentialHistogram(name, nativeHint, sample, min, max, numBuckets);
    }

    @Override // org.chromium.base.metrics.NativeUmaRecorder.Natives
    public long recordLinearHistogram(String name, long nativeHint, int sample, int min, int max, int numBuckets) {
        return GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_recordLinearHistogram(name, nativeHint, sample, min, max, numBuckets);
    }

    @Override // org.chromium.base.metrics.NativeUmaRecorder.Natives
    public long recordSparseHistogram(String name, long nativeHint, int sample) {
        return GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_recordSparseHistogram(name, nativeHint, sample);
    }

    @Override // org.chromium.base.metrics.NativeUmaRecorder.Natives
    public void recordUserAction(String name, long millisSinceEvent) {
        GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_recordUserAction(name, millisSinceEvent);
    }

    @Override // org.chromium.base.metrics.NativeUmaRecorder.Natives
    public void removeActionCallbackForTesting(long callbackId) {
        GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_removeActionCallbackForTesting(callbackId);
    }
}
