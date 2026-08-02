package org.chromium.base.metrics;

import internal.org.jni_zero.JNINamespace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.chromium.base.Callback;
import org.chromium.base.TimeUtils;

@JNINamespace("base::android")
/* loaded from: classes10.dex */
final class NativeUmaRecorder implements UmaRecorder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final Map<String, Long> mNativeHints = Collections.synchronizedMap(new HashMap());
    private Map<Callback<String>, Long> mUserActionTestingCallbackNativePtrs;

    public interface Natives {
        long addActionCallbackForTesting(Callback<String> callback);

        long createHistogramSnapshotForTesting();

        void destroyHistogramSnapshotForTesting(long snapshotPtr);

        long[] getHistogramSamplesForTesting(String name);

        int getHistogramTotalCountForTesting(String name, long snapshotPtr);

        int getHistogramValueCountForTesting(String name, int sample, long snapshotPtr);

        long recordBooleanHistogram(String name, long nativeHint, boolean sample);

        long recordExponentialHistogram(String name, long nativeHint, int sample, int min, int max, int numBuckets);

        long recordLinearHistogram(String name, long nativeHint, int sample, int min, int max, int numBuckets);

        long recordSparseHistogram(String name, long nativeHint, int sample);

        void recordUserAction(String name, long millisSinceEvent);

        void removeActionCallbackForTesting(long callbackId);
    }

    NativeUmaRecorder() {
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordBooleanHistogram(String name, boolean sample) {
        long nativeHint = getNativeHint(name);
        maybeUpdateNativeHint(name, nativeHint, NativeUmaRecorderJni.get().recordBooleanHistogram(name, nativeHint, sample));
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordExponentialHistogram(String name, int sample, int min, int max, int numBuckets) {
        long nativeHint = getNativeHint(name);
        maybeUpdateNativeHint(name, nativeHint, NativeUmaRecorderJni.get().recordExponentialHistogram(name, nativeHint, sample, min, max, numBuckets));
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordLinearHistogram(String name, int sample, int min, int max, int numBuckets) {
        long nativeHint = getNativeHint(name);
        maybeUpdateNativeHint(name, nativeHint, NativeUmaRecorderJni.get().recordLinearHistogram(name, nativeHint, sample, min, max, numBuckets));
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordSparseHistogram(String name, int sample) {
        long nativeHint = getNativeHint(name);
        maybeUpdateNativeHint(name, nativeHint, NativeUmaRecorderJni.get().recordSparseHistogram(name, nativeHint, sample));
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordUserAction(String name, long elapsedRealtimeMillis) {
        NativeUmaRecorderJni.get().recordUserAction(name, TimeUtils.elapsedRealtimeMillis() - elapsedRealtimeMillis);
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public int getHistogramValueCountForTesting(String name, int sample) {
        return NativeUmaRecorderJni.get().getHistogramValueCountForTesting(name, sample, 0L);
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public int getHistogramTotalCountForTesting(String name) {
        return NativeUmaRecorderJni.get().getHistogramTotalCountForTesting(name, 0L);
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public List<HistogramBucket> getHistogramSamplesForTesting(String name) {
        long[] histogramSamplesForTesting = NativeUmaRecorderJni.get().getHistogramSamplesForTesting(name);
        ArrayList arrayList = new ArrayList(histogramSamplesForTesting.length);
        for (int i = 0; i < histogramSamplesForTesting.length; i += 3) {
            arrayList.add(new HistogramBucket((int) histogramSamplesForTesting[i], histogramSamplesForTesting[i + 1], (int) histogramSamplesForTesting[i + 2]));
        }
        return arrayList;
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void addUserActionCallbackForTesting(Callback<String> callback) {
        long addActionCallbackForTesting = NativeUmaRecorderJni.get().addActionCallbackForTesting(callback);
        if (this.mUserActionTestingCallbackNativePtrs == null) {
            this.mUserActionTestingCallbackNativePtrs = Collections.synchronizedMap(new HashMap());
        }
        this.mUserActionTestingCallbackNativePtrs.put(callback, Long.valueOf(addActionCallbackForTesting));
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void removeUserActionCallbackForTesting(Callback<String> callback) {
        Long remove;
        Map<Callback<String>, Long> map = this.mUserActionTestingCallbackNativePtrs;
        if (map == null || (remove = map.remove(callback)) == null) {
            return;
        }
        NativeUmaRecorderJni.get().removeActionCallbackForTesting(remove.longValue());
    }

    private long getNativeHint(String name) {
        Long l = this.mNativeHints.get(name);
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    private void maybeUpdateNativeHint(String name, long oldHint, long newHint) {
        if (oldHint != newHint) {
            this.mNativeHints.put(name, Long.valueOf(newHint));
        }
    }
}
