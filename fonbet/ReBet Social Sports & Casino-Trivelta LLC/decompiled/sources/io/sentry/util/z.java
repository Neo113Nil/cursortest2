package io.sentry.util;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class z implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicLong f52817c = new AtomicLong(System.nanoTime());
    private static final long serialVersionUID = -4257915988930727506L;

    /* renamed from: a, reason: collision with root package name */
    public long f52818a;

    /* renamed from: b, reason: collision with root package name */
    public long f52819b;

    public z() {
        this(a(), a());
    }

    public static long a() {
        AtomicLong atomicLong;
        long j10;
        long j11;
        do {
            atomicLong = f52817c;
            j10 = atomicLong.get();
            long j12 = (j10 >> 12) ^ j10;
            long j13 = j12 ^ (j12 << 25);
            j11 = (j13 ^ (j13 >> 27)) * 2685821657736338717L;
        } while (!atomicLong.compareAndSet(j10, j11));
        return j11;
    }

    public void b(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            this.f52818a = (this.f52818a * 6364136223846793005L) + this.f52819b;
            bArr[i10] = (byte) ((((r1 >>> 22) ^ r1) >>> ((int) ((r1 >>> 61) + 22))) >>> 24);
        }
    }

    public double c() {
        long j10 = this.f52818a * 6364136223846793005L;
        long j11 = this.f52819b;
        long j12 = j10 + j11;
        long j13 = (((j12 >>> 22) ^ j12) >>> ((int) ((j12 >>> 61) + 22))) & BodyPartID.bodyIdMax;
        this.f52818a = (j12 * 6364136223846793005L) + j11;
        return (((j13 >>> 6) << 27) + (((((r0 >>> 22) ^ r0) >>> ((int) ((r0 >>> 61) + 22))) & BodyPartID.bodyIdMax) >>> 5)) / 9.007199254740992E15d;
    }

    public void d(long j10, long j11) {
        long j12 = (j11 << 1) | 1;
        this.f52819b = j12;
        this.f52818a = j12 + j10;
    }

    public z(long j10, long j11) {
        d(j10, j11);
    }
}
