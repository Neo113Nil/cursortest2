package com.vk.push.core.backoff;

import com.vk.push.core.utils.RandomUtils;
import xsna.qlb0;
import xsna.zcl;

/* compiled from: ExponentialBackOff.kt */
/* loaded from: classes5.dex */
public final class ExponentialBackOff implements BackOff {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final double e;
    public long f;

    /* compiled from: ExponentialBackOff.kt */
    public static final class Builder {
        public long a = 100;
        public long b = 600000;
        public long c = 100;
        public long d = 1000;
        public double e = 2.0d;

        public final Builder averageDeviation(long j) {
            if (j < 0) {
                throw new IllegalStateException(qlb0.a(j, "average deviation should be positive: ", " <= 0").toString());
            }
            this.d = j;
            return this;
        }

        public final BackOff build() {
            return new ExponentialBackOff(this.a, this.b, this.c, this.d, this.e, null);
        }

        public final Builder initialBackOff(long j) {
            if (j <= 0) {
                throw new IllegalStateException(qlb0.a(j, "initial back off should be positive: ", " < 0").toString());
            }
            this.a = j;
            return this;
        }

        public final Builder maxBackOff(long j) {
            if (j <= 0) {
                throw new IllegalStateException(qlb0.a(j, "max back off should be positive: ", " < 0").toString());
            }
            this.b = j;
            return this;
        }

        public final Builder scaleFactor(double d) {
            if (d > 1.0d) {
                this.e = d;
                return this;
            }
            throw new IllegalStateException(("scale factor should be above one: " + d + " < 1").toString());
        }

        public final Builder standardDeviation(long j) {
            if (j <= 0) {
                throw new IllegalStateException(qlb0.a(j, "standard deviation should be positive: ", " < 0").toString());
            }
            this.c = j;
            return this;
        }
    }

    public ExponentialBackOff(long j, long j2, long j3, long j4, double d, zcl zclVar) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = d;
        this.f = j;
    }

    @Override // com.vk.push.core.backoff.BackOff
    public long getNextBackOff() {
        double d = this.f * this.e;
        double nextGaussian = (RandomUtils.INSTANCE.nextGaussian() * this.c) + this.d;
        long j = (long) d;
        long j2 = this.b;
        if (j > j2) {
            j = j2;
        }
        long j3 = j + ((long) nextGaussian);
        this.f = j3;
        return j3;
    }

    @Override // com.vk.push.core.backoff.BackOff
    public void resetBackOff() {
        this.f = this.a;
    }
}
