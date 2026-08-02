package L2;

import java.util.Arrays;

/* loaded from: classes.dex */
public class D {
    private long[] mTimeSamples;
    private float[] mDataSamples = new float[20];

    /* renamed from: a, reason: collision with root package name */
    public int f6770a = 0;

    public D() {
        long[] jArr = new long[20];
        this.mTimeSamples = jArr;
        Arrays.fill(jArr, Long.MIN_VALUE);
    }

    public void a(long j10, float f10) {
        int i10 = (this.f6770a + 1) % 20;
        this.f6770a = i10;
        this.mTimeSamples[i10] = j10;
        this.mDataSamples[i10] = f10;
    }

    public float b() {
        float c10;
        int i10 = this.f6770a;
        if (i10 == 0 && this.mTimeSamples[i10] == Long.MIN_VALUE) {
            return 0.0f;
        }
        long j10 = this.mTimeSamples[i10];
        int i11 = 0;
        long j11 = j10;
        while (true) {
            long j12 = this.mTimeSamples[i10];
            if (j12 == Long.MIN_VALUE) {
                break;
            }
            float f10 = j10 - j12;
            float abs = Math.abs(j12 - j11);
            if (f10 > 100.0f || abs > 40.0f) {
                break;
            }
            if (i10 == 0) {
                i10 = 20;
            }
            i10--;
            i11++;
            if (i11 >= 20) {
                break;
            }
            j11 = j12;
        }
        if (i11 < 2) {
            return 0.0f;
        }
        if (i11 == 2) {
            int i12 = this.f6770a;
            int i13 = i12 == 0 ? 19 : i12 - 1;
            long[] jArr = this.mTimeSamples;
            float f11 = jArr[i12] - jArr[i13];
            if (f11 == 0.0f) {
                return 0.0f;
            }
            float[] fArr = this.mDataSamples;
            c10 = (fArr[i12] - fArr[i13]) / f11;
        } else {
            int i14 = this.f6770a;
            int i15 = ((i14 - i11) + 21) % 20;
            int i16 = (i14 + 21) % 20;
            long j13 = this.mTimeSamples[i15];
            float f12 = this.mDataSamples[i15];
            int i17 = i15 + 1;
            float f13 = 0.0f;
            for (int i18 = i17 % 20; i18 != i16; i18 = (i18 + 1) % 20) {
                long j14 = this.mTimeSamples[i18];
                float f14 = j14 - j13;
                if (f14 != 0.0f) {
                    float f15 = this.mDataSamples[i18];
                    float f16 = (f15 - f12) / f14;
                    f13 += (f16 - c(f13)) * Math.abs(f16);
                    if (i18 == i17) {
                        f13 *= 0.5f;
                    }
                    f12 = f15;
                    j13 = j14;
                }
            }
            c10 = c(f13);
        }
        return c10 * 1000.0f;
    }

    public final float c(float f10) {
        return (float) (Math.signum(f10) * Math.sqrt(Math.abs(f10) * 2.0f));
    }
}
