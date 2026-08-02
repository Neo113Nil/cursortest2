package org.chromium.base.metrics;

import java.util.Collections;
import java.util.List;
import org.chromium.base.Callback;

/* loaded from: classes10.dex */
class NoopUmaRecorder implements UmaRecorder {
    @Override // org.chromium.base.metrics.UmaRecorder
    public void addUserActionCallbackForTesting(Callback<String> callback) {
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public int getHistogramTotalCountForTesting(String name) {
        return 0;
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public int getHistogramValueCountForTesting(String name, int sample) {
        return 0;
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordBooleanHistogram(String name, boolean sample) {
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordExponentialHistogram(String name, int sample, int min, int max, int numBuckets) {
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordLinearHistogram(String name, int sample, int min, int max, int numBuckets) {
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordSparseHistogram(String name, int sample) {
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordUserAction(String name, long elapsedRealtimeMillis) {
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void removeUserActionCallbackForTesting(Callback<String> callback) {
    }

    NoopUmaRecorder() {
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public List<HistogramBucket> getHistogramSamplesForTesting(String name) {
        return Collections.EMPTY_LIST;
    }
}
