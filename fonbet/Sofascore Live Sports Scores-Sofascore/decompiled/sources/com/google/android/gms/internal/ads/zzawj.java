package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import defpackage.x5n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzawj {
    public int a;
    public zzawe b;
    public zzavs c;
    public zzavv d;

    public zzawj(zzavv zzavvVar) {
        this(zzawe.b, 0, new zzavt());
        this.d = zzavvVar;
    }

    public static final void g(long j) {
        long[] jArr = {141540322, 456640674, 1141397064, 993500330, 1614820873, 3337980909L, 410218731, 1716462158, 477127367};
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        if (j % (((((((~j2) & j3) | j4) + ((j2 & j5) | j6)) - j7) + jArr[6]) ^ (jArr[7] % 477127367)) != 0) {
            throw new zzawh();
        }
    }

    public final void a(long j) {
        long[] jArr = {2139842053, 728564241, 750932242, 1403848321, 1892818418, 4558981222L, 1919655804, 1856374729, 899334107};
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        long j8 = jArr[6];
        long j9 = jArr[7];
        g(j);
        long j10 = j / (((((((~j2) & j3) | j4) + ((j2 & j5) | j6)) - j7) + j8) ^ (j9 % 899334107));
        if (j10 < 0 || j10 > this.b.a.length) {
            throw new zzawi();
        }
        this.a = (int) j10;
    }

    public final long b() {
        long[] jArr = {491705403, 818579170, 1201981453, 810223590, 1243973916, 3701563257L, 554701476, 1889947178, 1780695788};
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        return this.a * (((((((~j) & j2) | j3) + ((j & j4) | j5)) - jArr[5]) + jArr[6]) ^ (jArr[7] % 1780695788));
    }

    public final long c() {
        try {
            zzavs zzavsVar = this.c;
            zzawe zzaweVar = this.b;
            this.a = this.a + 1;
            return zzavsVar.b(zzaweVar, r2);
        } catch (IndexOutOfBoundsException e) {
            throw new zzawi(e);
        }
    }

    public final int d() {
        try {
            zzavs zzavsVar = this.c;
            zzawe zzaweVar = this.b;
            int i = this.a;
            this.a = i + 1;
            int b = zzavsVar.b(zzaweVar, i) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            zzavs zzavsVar2 = this.c;
            zzawe zzaweVar2 = this.b;
            int i2 = this.a;
            this.a = i2 + 1;
            int b2 = b | ((zzavsVar2.b(zzaweVar2, i2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
            zzavs zzavsVar3 = this.c;
            zzawe zzaweVar3 = this.b;
            int i3 = this.a;
            this.a = i3 + 1;
            int b3 = b2 | ((zzavsVar3.b(zzaweVar3, i3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
            zzavs zzavsVar4 = this.c;
            zzawe zzaweVar4 = this.b;
            int i4 = this.a;
            this.a = i4 + 1;
            return (zzavsVar4.b(zzaweVar4, i4) << 24) | b3;
        } catch (IndexOutOfBoundsException e) {
            throw new zzawi(e);
        }
    }

    public final zzawe e(long j) {
        int[] iArr = {1667674495, 1502201381, 1197125461, 478240810, 622476187, -1652496091, 840440151, 1203013321, 774318984};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int y = x5n.y((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        g(b() + j);
        int i9 = this.a;
        long j2 = i9;
        zzawe zzaweVar = this.b;
        long j3 = (j >> ((i8 % 774318984) ^ y)) + j2;
        if (j3 > zzaweVar.a.length || j3 < j2) {
            throw new zzawi();
        }
        try {
            int i10 = (int) j3;
            zzawe a = this.c.a(zzaweVar, i9, i10);
            this.a = i10;
            return a;
        } catch (IndexOutOfBoundsException e) {
            throw new AssertionError(zzawc.a("CEiv6BFfPnitUE+D"), e);
        }
    }

    public final long f() {
        int i = 0;
        long j = 0;
        while (i < 64) {
            try {
                zzavs zzavsVar = this.c;
                zzawe zzaweVar = this.b;
                int i2 = this.a;
                this.a = i2 + 1;
                byte b = zzavsVar.b(zzaweVar, i2);
                j |= (b & Byte.MAX_VALUE) << i;
                if (i == 63) {
                    if (b > 1) {
                        throw new zzawg();
                    }
                    i = 63;
                }
                if ((b & 128) == 0) {
                    return (-(j & 1)) ^ (j >>> 1);
                }
                i += 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzawi(e);
            }
        }
        throw new zzawg();
    }

    public zzawj() {
        this(new zzavv(1));
    }

    public zzawj(zzawe zzaweVar, int i, zzavs zzavsVar) {
        this.b = zzaweVar;
        this.a = i;
        this.c = zzavsVar;
    }
}
