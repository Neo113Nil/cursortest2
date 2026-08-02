package io.agora.base.internal.video;

import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.Logging;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class YuvConverterStats {
    private static final float CONFIDENCE_LEVEL_99_Z = 2.576f;
    private static final long STATS_SAMPLE_COUNT = 240;
    private static final String TAG = "YuvConverterStats";
    private final int height;
    private final YuvConvertMethod method;
    private final int width;
    private final List<Integer> timeSpentUsCache = new ArrayList();
    private float calLowerBound = 0.0f;
    private float calUpperBound = 0.0f;
    private int calAvgUs = 0;
    private int calMaxUs = 0;

    public enum YuvConvertMethod {
        GL_READ_PIXELS(0),
        PBO(1),
        HARDWARE_BUFFER(2);

        final int value;

        YuvConvertMethod(int i10) {
            this.value = i10;
        }
    }

    public YuvConverterStats(int i10, int i11, YuvConvertMethod yuvConvertMethod) {
        this.width = i10;
        this.height = i11;
        this.method = yuvConvertMethod;
    }

    private static float[] CalculateConfidenceBound(int[] iArr) {
        float CalculateMean = CalculateMean(iArr);
        float CalculateStandardDeviation = (float) ((CalculateStandardDeviation(iArr, CalculateMean) / Math.sqrt(iArr.length)) * 2.5759999752044678d);
        return new float[]{CalculateMean - CalculateStandardDeviation, CalculateMean + CalculateStandardDeviation};
    }

    private static int CalculateMax(int[] iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            i10 = Math.max(i10, i11);
        }
        return i10;
    }

    private static float CalculateMean(int[] iArr) {
        long j10 = 0;
        for (int i10 : iArr) {
            j10 += i10;
        }
        return (j10 * 1.0f) / iArr.length;
    }

    private static float CalculateStandardDeviation(int[] iArr, float f10) {
        long j10 = 0;
        for (int i10 : iArr) {
            j10 += (long) Math.pow(i10 - f10, 2.0d);
        }
        return (float) Math.sqrt((j10 * 1.0f) / (iArr.length - 1));
    }

    @CalledByNative
    private int getAvgUs() {
        return this.calAvgUs;
    }

    @CalledByNative
    private int getMaxUs() {
        return this.calMaxUs;
    }

    @CalledByNative
    public int getHeight() {
        return this.height;
    }

    @CalledByNative
    public int getMethod() {
        return this.method.value;
    }

    @CalledByNative
    public int getWidth() {
        return this.width;
    }

    public boolean stats(int i10) {
        this.timeSpentUsCache.add(Integer.valueOf(i10));
        boolean z10 = false;
        if (this.timeSpentUsCache.size() >= STATS_SAMPLE_COUNT) {
            int[] iArr = new int[this.timeSpentUsCache.size()];
            for (int i11 = 0; i11 < this.timeSpentUsCache.size(); i11++) {
                iArr[i11] = this.timeSpentUsCache.get(i11).intValue();
            }
            float CalculateMean = CalculateMean(iArr);
            int CalculateMax = CalculateMax(iArr);
            if (CalculateMean < this.calLowerBound || CalculateMean > this.calUpperBound) {
                float[] CalculateConfidenceBound = CalculateConfidenceBound(iArr);
                this.calLowerBound = CalculateConfidenceBound[0];
                z10 = true;
                this.calUpperBound = CalculateConfidenceBound[1];
                this.calAvgUs = (int) CalculateMean;
                this.calMaxUs = CalculateMax;
                Logging.i(TAG, "method=" + this.method + ", calAvgUs=" + this.calAvgUs + ", calMaxUs=" + this.calMaxUs);
            }
            this.timeSpentUsCache.clear();
        }
        return z10;
    }
}
