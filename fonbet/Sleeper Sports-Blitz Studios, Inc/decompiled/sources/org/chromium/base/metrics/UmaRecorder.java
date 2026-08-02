package org.chromium.base.metrics;

import com.google.errorprone.annotations.DoNotMock;
import java.util.List;
import org.chromium.base.Callback;

@DoNotMock("Use HistogramWatcher for histograms or UserActionTester for user actions instead.")
/* loaded from: classes10.dex */
public interface UmaRecorder {
    void addUserActionCallbackForTesting(Callback<String> callback);

    List<HistogramBucket> getHistogramSamplesForTesting(String name);

    int getHistogramTotalCountForTesting(String name);

    int getHistogramValueCountForTesting(String name, int sample);

    void recordBooleanHistogram(String name, boolean sample);

    void recordExponentialHistogram(String name, int sample, int min, int max, int numBuckets);

    void recordLinearHistogram(String name, int sample, int min, int max, int numBuckets);

    void recordSparseHistogram(String name, int sample);

    void recordUserAction(String name, long elapsedRealtimeMillis);

    void removeUserActionCallbackForTesting(Callback<String> callback);
}
