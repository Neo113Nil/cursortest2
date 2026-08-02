package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import defpackage.zzl;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class o extends l {
    public n n;
    public int o;
    public boolean p;
    public r q;
    public p r;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, long j, j jVar) {
        int i;
        int i2;
        long j2;
        int i3;
        boolean z = false;
        if (this.n != null) {
            return false;
        }
        n nVar2 = null;
        int i4 = 1;
        if (this.q == null) {
            this.q = s.a(nVar);
        } else if (this.r == null) {
            s.a(3, nVar, false);
            nVar.b((int) nVar.e());
            long e = nVar.e();
            String[] strArr = new String[(int) e];
            for (int i5 = 0; i5 < e; i5++) {
                strArr[i5] = nVar.b((int) nVar.e());
            }
            if ((nVar.j() & 1) == 0) {
                zzl.t("framing bit expected to be set");
                return false;
            }
            this.r = new p();
        } else {
            int i6 = nVar.c;
            byte[] bArr = new byte[i6];
            System.arraycopy(nVar.a, 0, bArr, 0, i6);
            int i7 = this.q.a;
            int i8 = 5;
            s.a(5, nVar, false);
            int j3 = nVar.j() + 1;
            m mVar = new m(nVar.a);
            int i9 = 8;
            mVar.b(nVar.b * 8);
            int i10 = 0;
            while (true) {
                int i11 = 4;
                int i12 = 16;
                if (i10 < j3) {
                    boolean z2 = z;
                    if (mVar.a(24) != 5653314) {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("expected code book to start with [0x56, 0x43, 0x42] at " + ((mVar.c * 8) + mVar.d));
                    }
                    int a = mVar.a(16);
                    int a2 = mVar.a(24);
                    long[] jArr = new long[a2];
                    long j4 = 0;
                    if (mVar.a()) {
                        i = i4;
                        i2 = i9;
                        int a3 = mVar.a(i8) + 1;
                        int i13 = z2 ? 1 : 0;
                        while (i13 < a2) {
                            int i14 = z2 ? 1 : 0;
                            for (int i15 = a2 - i13; i15 > 0; i15 >>>= 1) {
                                i14++;
                            }
                            int a4 = mVar.a(i14);
                            int i16 = z2 ? 1 : 0;
                            while (i16 < a4 && i13 < a2) {
                                jArr[i13] = a3;
                                i13++;
                                i16++;
                                j3 = j3;
                            }
                            a3++;
                            j3 = j3;
                        }
                    } else {
                        boolean a5 = mVar.a();
                        i2 = i9;
                        int i17 = z2 ? 1 : 0;
                        while (i17 < a2) {
                            if (!a5) {
                                i3 = i4;
                                jArr[i17] = mVar.a(i8) + 1;
                            } else if (mVar.a()) {
                                i3 = i4;
                                jArr[i17] = mVar.a(i8) + 1;
                            } else {
                                i3 = i4;
                                jArr[i17] = 0;
                            }
                            i17++;
                            i4 = i3;
                        }
                        i = i4;
                    }
                    int i18 = j3;
                    int a6 = mVar.a(4);
                    if (a6 > 2) {
                        zzl.t(com.fyber.inneractive.sdk.player.exoplayer2.m.a("lookup type greater than 2 not decodable: ", a6));
                        return z2;
                    }
                    int i19 = i;
                    if (a6 == i19 || a6 == 2) {
                        mVar.b(32);
                        mVar.b(32);
                        int a7 = mVar.a(4) + i19;
                        mVar.b(i19);
                        if (a6 == i19) {
                            if (a != 0) {
                                j2 = (long) Math.floor(Math.pow(a2, 1.0d / a));
                            }
                            mVar.b((int) (a7 * j4));
                        } else {
                            j2 = a2 * a;
                        }
                        j4 = j2;
                        mVar.b((int) (a7 * j4));
                    }
                    i10++;
                    i9 = i2;
                    z = z2 ? 1 : 0;
                    j3 = i18;
                    i4 = 1;
                    i8 = 5;
                } else {
                    boolean z3 = z;
                    int i20 = i9;
                    int i21 = 6;
                    int a8 = mVar.a(6) + 1;
                    for (int i22 = z3 ? 1 : 0; i22 < a8; i22++) {
                        if (mVar.a(16) != 0) {
                            zzl.t("placeholder of time domain transforms not zeroed out");
                            return z3;
                        }
                    }
                    int i23 = 1;
                    int a9 = mVar.a(6) + 1;
                    int i24 = z3 ? 1 : 0;
                    while (i24 < a9) {
                        int a10 = mVar.a(i12);
                        if (a10 == 0) {
                            int i25 = i20;
                            mVar.b(i25);
                            mVar.b(16);
                            mVar.b(16);
                            mVar.b(6);
                            mVar.b(i25);
                            int a11 = mVar.a(4) + 1;
                            int i26 = z3 ? 1 : 0;
                            while (i26 < a11) {
                                mVar.b(i25);
                                i26++;
                                i25 = 8;
                            }
                        } else {
                            if (a10 != i23) {
                                zzl.t(com.fyber.inneractive.sdk.player.exoplayer2.m.a("floor type greater than 1 not decodable: ", a10));
                                return z3;
                            }
                            int a12 = mVar.a(5);
                            int[] iArr = new int[a12];
                            int i27 = -1;
                            for (int i28 = z3 ? 1 : 0; i28 < a12; i28++) {
                                int a13 = mVar.a(i11);
                                iArr[i28] = a13;
                                if (a13 > i27) {
                                    i27 = a13;
                                }
                            }
                            int i29 = i27 + 1;
                            int[] iArr2 = new int[i29];
                            int i30 = z3 ? 1 : 0;
                            while (i30 < i29) {
                                iArr2[i30] = mVar.a(3) + 1;
                                int a14 = mVar.a(2);
                                int i31 = i20;
                                if (a14 > 0) {
                                    mVar.b(i31);
                                }
                                int i32 = z3 ? 1 : 0;
                                for (int i33 = 1; i32 < (i33 << a14); i33 = 1) {
                                    mVar.b(i31);
                                    i32++;
                                    i31 = 8;
                                }
                                i30++;
                                i20 = 8;
                            }
                            mVar.b(2);
                            int a15 = mVar.a(4);
                            int i34 = z3 ? 1 : 0;
                            int i35 = i34;
                            int i36 = i35;
                            while (i34 < a12) {
                                i35 += iArr2[iArr[i34]];
                                while (i36 < i35) {
                                    mVar.b(a15);
                                    i36++;
                                }
                                i34++;
                            }
                        }
                        i24++;
                        i20 = 8;
                        i21 = 6;
                        i23 = 1;
                        i11 = 4;
                        i12 = 16;
                    }
                    int i37 = i21;
                    int a16 = mVar.a(i37) + 1;
                    int i38 = z3 ? 1 : 0;
                    while (i38 < a16) {
                        if (mVar.a(16) > 2) {
                            zzl.t("residueType greater than 2 is not decodable");
                            return z3;
                        }
                        mVar.b(24);
                        mVar.b(24);
                        mVar.b(24);
                        int a17 = mVar.a(i37) + 1;
                        int i39 = 8;
                        mVar.b(8);
                        int[] iArr3 = new int[a17];
                        for (int i40 = z3 ? 1 : 0; i40 < a17; i40++) {
                            iArr3[i40] = ((mVar.a() ? mVar.a(5) : z3 ? 1 : 0) * 8) + mVar.a(3);
                        }
                        int i41 = z3 ? 1 : 0;
                        while (i41 < a17) {
                            int i42 = z3 ? 1 : 0;
                            while (i42 < i39) {
                                if ((iArr3[i41] & (1 << i42)) != 0) {
                                    mVar.b(i39);
                                }
                                i42++;
                                i39 = 8;
                            }
                            i41++;
                            i39 = 8;
                        }
                        i38++;
                        i37 = 6;
                    }
                    int i43 = 1;
                    int a18 = mVar.a(i37) + 1;
                    int i44 = z3 ? 1 : 0;
                    while (i44 < a18) {
                        if (mVar.a(16) == 0) {
                            int a19 = mVar.a() ? mVar.a(4) + 1 : i43;
                            if (mVar.a()) {
                                int a20 = mVar.a(8) + 1;
                                for (int i45 = z3 ? 1 : 0; i45 < a20; i45++) {
                                    int i46 = i7 - 1;
                                    int i47 = z3 ? 1 : 0;
                                    for (int i48 = i46; i48 > 0; i48 >>>= 1) {
                                        i47++;
                                    }
                                    mVar.b(i47);
                                    int i49 = z3 ? 1 : 0;
                                    while (i46 > 0) {
                                        i49++;
                                        i46 >>>= 1;
                                    }
                                    mVar.b(i49);
                                }
                            }
                            if (mVar.a(2) != 0) {
                                zzl.t("to reserved bits must be zero after mapping coupling steps");
                                return z3;
                            }
                            if (a19 > 1) {
                                for (int i50 = z3 ? 1 : 0; i50 < i7; i50++) {
                                    mVar.b(4);
                                }
                            }
                            for (int i51 = z3 ? 1 : 0; i51 < a19; i51++) {
                                mVar.b(8);
                                mVar.b(8);
                                mVar.b(8);
                            }
                        }
                        i44++;
                        i43 = 1;
                    }
                    int a21 = mVar.a(6);
                    int i52 = a21 + 1;
                    q[] qVarArr = new q[i52];
                    for (int i53 = z3 ? 1 : 0; i53 < i52; i53++) {
                        boolean a22 = mVar.a();
                        mVar.a(16);
                        mVar.a(16);
                        mVar.a(8);
                        qVarArr[i53] = new q(a22);
                    }
                    if (!mVar.a()) {
                        zzl.t("framing bit after modes not set as expected");
                        return z3;
                    }
                    int i54 = z3 ? 1 : 0;
                    while (a21 > 0) {
                        i54++;
                        a21 >>>= 1;
                    }
                    nVar2 = new n(this.q, bArr, qVarArr, i54);
                }
            }
        }
        this.n = nVar2;
        if (nVar2 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.n.a.f);
        arrayList.add(this.n.b);
        r rVar = this.n.a;
        jVar.a = com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, MimeTypes.AUDIO_VORBIS, rVar.c, -1, rVar.a, (int) rVar.b, arrayList, null, null);
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int i;
        byte b = nVar.a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        n nVar2 = this.n;
        boolean z = nVar2.c[(b >> 1) & (255 >>> (8 - nVar2.d))].a;
        r rVar = nVar2.a;
        if (!z) {
            i = rVar.d;
        } else {
            i = rVar.e;
        }
        long j = this.p ? (this.o + i) / 4 : 0;
        nVar.d(nVar.c + 4);
        byte[] bArr = nVar.a;
        int i2 = nVar.c;
        bArr[i2 - 4] = (byte) (j & 255);
        bArr[i2 - 3] = (byte) ((j >>> 8) & 255);
        bArr[i2 - 2] = (byte) ((j >>> 16) & 255);
        bArr[i2 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final void a(boolean z) {
        super.a(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final void a(long j) {
        this.g = j;
        this.p = j != 0;
        r rVar = this.q;
        this.o = rVar != null ? rVar.d : 0;
    }
}
