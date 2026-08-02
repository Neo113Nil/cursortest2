package io.sentry.util;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class s implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    static final AtomicLong f68595c = new AtomicLong(System.nanoTime());

    /* renamed from: a, reason: collision with root package name */
    private long f68596a;

    /* renamed from: b, reason: collision with root package name */
    private long f68597b;

    public s() {
        long a11 = a();
        long a12 = (a() << 1) | 1;
        this.f68597b = a12;
        this.f68596a = a12 + a11;
    }

    private static long a() {
        AtomicLong atomicLong;
        long j11;
        long j12;
        do {
            atomicLong = f68595c;
            j11 = atomicLong.get();
            long j13 = (j11 >> 12) ^ j11;
            long j14 = j13 ^ (j13 << 25);
            j12 = (j14 ^ (j14 >> 27)) * 2685821657736338717L;
        } while (!atomicLong.compareAndSet(j11, j12));
        return j12;
    }

    public final void b(byte[] bArr) {
        for (int i11 = 0; i11 < bArr.length; i11++) {
            this.f68596a = (this.f68596a * 6364136223846793005L) + this.f68597b;
            bArr[i11] = (byte) ((((r1 >>> 22) ^ r1) >>> ((int) ((r1 >>> 61) + 22))) >>> 24);
        }
    }

    public final double d() {
        long j11 = this.f68596a * 6364136223846793005L;
        long j12 = this.f68597b;
        long j13 = j11 + j12;
        long j14 = (((j13 >>> 22) ^ j13) >>> ((int) ((j13 >>> 61) + 22))) & 4294967295L;
        this.f68596a = (j13 * 6364136223846793005L) + j12;
        return (((j14 >>> 6) << 27) + (((((r0 >>> 22) ^ r0) >>> ((int) ((r0 >>> 61) + 22))) & 4294967295L) >>> 5)) / 9.007199254740992E15d;
    }
}
