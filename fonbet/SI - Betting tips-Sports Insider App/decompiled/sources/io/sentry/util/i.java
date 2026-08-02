package io.sentry.util;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicLong f17166c = new AtomicLong(System.nanoTime());
    private static final long serialVersionUID = -4257915988930727506L;

    /* renamed from: a, reason: collision with root package name */
    public long f17167a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17168b;

    public i() {
        long a7 = a();
        long a10 = (a() << 1) | 1;
        this.f17168b = a10;
        this.f17167a = a10 + a7;
    }

    public static long a() {
        AtomicLong atomicLong;
        long j;
        long j6;
        do {
            atomicLong = f17166c;
            j = atomicLong.get();
            long j10 = (j >> 12) ^ j;
            long j11 = j10 ^ (j10 << 25);
            j6 = (j11 ^ (j11 >> 27)) * 2685821657736338717L;
        } while (!atomicLong.compareAndSet(j, j6));
        return j6;
    }

    public final void b(byte[] bArr) {
        for (int i5 = 0; i5 < bArr.length; i5++) {
            this.f17167a = (this.f17167a * 6364136223846793005L) + this.f17168b;
            bArr[i5] = (byte) ((((r1 >>> 22) ^ r1) >>> ((int) ((r1 >>> 61) + 22))) >>> 24);
        }
    }

    public final double c() {
        long j = this.f17167a * 6364136223846793005L;
        long j6 = this.f17168b;
        long j10 = j + j6;
        long j11 = (((j10 >>> 22) ^ j10) >>> ((int) ((j10 >>> 61) + 22))) & 4294967295L;
        this.f17167a = (j10 * 6364136223846793005L) + j6;
        return (((j11 >>> 6) << 27) + (((((r0 >>> 22) ^ r0) >>> ((int) ((r0 >>> 61) + 22))) & 4294967295L) >>> 5)) / 9.007199254740992E15d;
    }
}
