package org.chromium.base.metrics;

import androidx.collection.SieveCacheKt;
import java.util.List;
import org.apache.commons.lang3.time.DateUtils;

/* loaded from: classes10.dex */
public class RecordHistogram {
    private static int clampToInt(long value) {
        if (value > SieveCacheKt.NodeLinkMask) {
            return Integer.MAX_VALUE;
        }
        if (value < SieveCacheKt.NodeMetaAndPreviousMask) {
            return Integer.MIN_VALUE;
        }
        return (int) value;
    }

    public static void recordBooleanHistogram(String name, boolean sample) {
        UmaRecorderHolder.get().recordBooleanHistogram(name, sample);
    }

    public static void recordEnumeratedHistogram(String name, int sample, int max) {
        recordExactLinearHistogram(name, sample, max);
    }

    public static void recordCount1MHistogram(String name, int sample) {
        UmaRecorderHolder.get().recordExponentialHistogram(name, sample, 1, 1000000, 50);
    }

    public static void recordCount100Histogram(String name, int sample) {
        UmaRecorderHolder.get().recordExponentialHistogram(name, sample, 1, 100, 50);
    }

    public static void recordCount1000Histogram(String name, int sample) {
        UmaRecorderHolder.get().recordExponentialHistogram(name, sample, 1, 1000, 50);
    }

    public static void recordCount100000Histogram(String name, int sample) {
        UmaRecorderHolder.get().recordExponentialHistogram(name, sample, 1, 100000, 50);
    }

    public static void recordCustomCountHistogram(String name, int sample, int min, int max, int numBuckets) {
        UmaRecorderHolder.get().recordExponentialHistogram(name, sample, min, max, numBuckets);
    }

    public static void recordLinearCountHistogram(String name, int sample, int min, int max, int numBuckets) {
        UmaRecorderHolder.get().recordLinearHistogram(name, sample, min, max, numBuckets);
    }

    public static void recordPercentageHistogram(String name, int sample) {
        recordExactLinearHistogram(name, sample, 101);
    }

    public static void recordSparseHistogram(String name, int sample) {
        UmaRecorderHolder.get().recordSparseHistogram(name, sample);
    }

    public static void recordTimesHistogram(String name, long durationMs) {
        recordCustomTimesHistogramMilliseconds(name, durationMs, 1L, 10000L, 50);
    }

    public static void recordMediumTimesHistogram(String name, long durationMs) {
        recordCustomTimesHistogramMilliseconds(name, durationMs, 1L, 180000L, 50);
    }

    @Deprecated
    public static void deprecatedRecordMediumTimesHistogram(String name, long durationMs) {
        recordCustomTimesHistogramMilliseconds(name, durationMs, 10L, 180000L, 50);
    }

    public static void recordLongTimesHistogram(String name, long durationMs) {
        recordCustomTimesHistogramMilliseconds(name, durationMs, 1L, DateUtils.MILLIS_PER_HOUR, 50);
    }

    public static void recordLongTimesHistogram100(String name, long durationMs) {
        recordCustomTimesHistogramMilliseconds(name, durationMs, 1L, DateUtils.MILLIS_PER_HOUR, 100);
    }

    public static void recordCustomTimesHistogram(String name, long durationMs, long min, long max, int numBuckets) {
        recordCustomTimesHistogramMilliseconds(name, durationMs, min, max, numBuckets);
    }

    public static void recordMicroTimesHistogram(String name, long durationMicros) {
        recordCustomMicroTimesHistogram(name, durationMicros, 1L, 1000000L, 50);
    }

    public static void recordCustomMicroTimesHistogram(String name, long durationMicros, long min, long max, int numBuckets) {
        UmaRecorderHolder.get().recordExponentialHistogram(name, clampToInt(durationMicros), clampToInt(min), clampToInt(max), numBuckets);
    }

    public static void recordMemoryKBHistogram(String name, int sizeInKB) {
        UmaRecorderHolder.get().recordExponentialHistogram(name, sizeInKB, 1000, 500000, 50);
    }

    public static void recordMemoryMediumMBHistogram(String name, int sizeInMB) {
        UmaRecorderHolder.get().recordExponentialHistogram(name, sizeInMB, 1, 4000, 100);
    }

    public static void recordExactLinearHistogram(String name, int sample, int max) {
        UmaRecorderHolder.get().recordLinearHistogram(name, sample, 1, max, max + 1);
    }

    private static void recordCustomTimesHistogramMilliseconds(String name, long duration, long min, long max, int numBuckets) {
        UmaRecorderHolder.get().recordExponentialHistogram(name, clampToInt(duration), clampToInt(min), clampToInt(max), numBuckets);
    }

    @Deprecated
    public static int getHistogramValueCountForTesting(String name, int sample) {
        return UmaRecorderHolder.get().getHistogramValueCountForTesting(name, sample);
    }

    @Deprecated
    public static int getHistogramTotalCountForTesting(String name) {
        return UmaRecorderHolder.get().getHistogramTotalCountForTesting(name);
    }

    public static List<HistogramBucket> getHistogramSamplesForTesting(String name) {
        return UmaRecorderHolder.get().getHistogramSamplesForTesting(name);
    }
}
