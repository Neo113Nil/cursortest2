package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import defpackage.lnb;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class o implements h {
    public final x a;
    public String b;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r c;
    public n d;
    public boolean e;
    public long l;
    public long m;
    public final boolean[] f = new boolean[3];
    public final r g = new r(32);
    public final r h = new r(33);
    public final r i = new r(34);
    public final r j = new r(39);
    public final r k = new r(40);
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n n = new com.fyber.inneractive.sdk.player.exoplayer2.util.n();

    public o(x xVar) {
        this.a = xVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        byte[] bArr;
        int i5;
        byte[] bArr2;
        int i6;
        int i7;
        String str;
        int i8;
        float f;
        long j2;
        int i9;
        int i10;
        boolean z;
        boolean z2;
        boolean z3;
        while (true) {
            int i11 = nVar.c;
            int i12 = nVar.b;
            int i13 = i11 - i12;
            if (i13 <= 0) {
                return;
            }
            byte[] bArr3 = nVar.a;
            this.l += i13;
            this.c.a(i13, nVar);
            while (i12 < i11) {
                int a = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(bArr3, i12, i11, this.f);
                if (a == i11) {
                    a(bArr3, i12, i11);
                    return;
                }
                int i14 = a + 3;
                int i15 = (bArr3[i14] & 126) >> 1;
                int i16 = a - i12;
                if (i16 > 0) {
                    a(bArr3, i12, a);
                }
                int i17 = i11 - a;
                long j3 = this.l - i17;
                int i18 = i16 < 0 ? -i16 : 0;
                long j4 = this.m;
                if (this.e) {
                    n nVar2 = this.d;
                    i2 = 5;
                    if (nVar2.j && nVar2.g) {
                        nVar2.m = nVar2.c;
                        nVar2.j = false;
                    } else if (nVar2.h || nVar2.g) {
                        j = j4;
                        if (nVar2.i) {
                            long j5 = nVar2.b;
                            i = i17;
                            i3 = i18;
                            nVar2.a.a(nVar2.l, nVar2.m ? 1 : 0, (int) (j5 - nVar2.k), i + ((int) (j3 - j5)), null);
                        } else {
                            i = i17;
                            i3 = i18;
                        }
                        nVar2.k = nVar2.b;
                        nVar2.l = nVar2.e;
                        nVar2.i = true;
                        nVar2.m = nVar2.c;
                        i4 = i11;
                        bArr = bArr3;
                        i5 = i14;
                        i6 = i15;
                        i7 = i;
                        i8 = 16;
                    }
                    i4 = i11;
                    bArr = bArr3;
                    i5 = i14;
                    i6 = i15;
                    j = j4;
                    i7 = i17;
                    i8 = 16;
                    i3 = i18;
                } else {
                    j = j4;
                    i = i17;
                    i2 = 5;
                    i3 = i18;
                    this.g.a(i3);
                    this.h.a(i3);
                    this.i.a(i3);
                    r rVar = this.g;
                    if (rVar.c) {
                        r rVar2 = this.h;
                        if (rVar2.c) {
                            r rVar3 = this.i;
                            if (rVar3.c) {
                                com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar4 = this.c;
                                String str2 = this.b;
                                int i19 = rVar.e;
                                byte[] bArr4 = new byte[rVar2.e + i19 + rVar3.e];
                                i4 = i11;
                                bArr = bArr3;
                                System.arraycopy(rVar.d, 0, bArr4, 0, i19);
                                i5 = i14;
                                System.arraycopy(rVar2.d, 0, bArr4, rVar.e, rVar2.e);
                                System.arraycopy(rVar3.d, 0, bArr4, rVar.e + rVar2.e, rVar3.e);
                                com.fyber.inneractive.sdk.player.exoplayer2.util.o oVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.o(rVar2.d, 0, rVar2.e);
                                oVar.d(44);
                                int b = oVar.b(3);
                                oVar.f();
                                oVar.d(88);
                                oVar.d(8);
                                int i20 = 0;
                                for (int i21 = 0; i21 < b; i21++) {
                                    if (oVar.c()) {
                                        i20 += 89;
                                    }
                                    if (oVar.c()) {
                                        i20 += 8;
                                    }
                                }
                                oVar.d(i20);
                                if (b > 0) {
                                    oVar.d((8 - b) * 2);
                                }
                                oVar.d();
                                int d = oVar.d();
                                if (d == 3) {
                                    oVar.f();
                                }
                                int d2 = oVar.d();
                                int d3 = oVar.d();
                                if (oVar.c()) {
                                    int d4 = oVar.d();
                                    int d5 = oVar.d();
                                    bArr2 = bArr4;
                                    int d6 = oVar.d();
                                    i7 = i;
                                    int d7 = oVar.d();
                                    str = str2;
                                    int i22 = (d == 1 || d == 2) ? 2 : 1;
                                    i6 = i15;
                                    int i23 = d == 1 ? 2 : 1;
                                    d2 = lnb.x(d4, d5, i22, d2);
                                    d3 = lnb.x(d6, d7, i23, d3);
                                } else {
                                    bArr2 = bArr4;
                                    i6 = i15;
                                    i7 = i;
                                    str = str2;
                                }
                                int i24 = d3;
                                int i25 = d2;
                                oVar.d();
                                oVar.d();
                                int d8 = oVar.d();
                                for (int i26 = oVar.c() ? 0 : b; i26 <= b; i26++) {
                                    oVar.d();
                                    oVar.d();
                                    oVar.d();
                                }
                                oVar.d();
                                oVar.d();
                                oVar.d();
                                oVar.d();
                                oVar.d();
                                oVar.d();
                                if (oVar.c() && oVar.c()) {
                                    int i27 = 0;
                                    while (i27 < 4) {
                                        for (int i28 = 0; i28 < 6; i28 += i27 == 3 ? 3 : 1) {
                                            if (oVar.c()) {
                                                int min = Math.min(64, 1 << ((i27 << 1) + 4));
                                                if (i27 > 1) {
                                                    oVar.e();
                                                }
                                                for (int i29 = 0; i29 < min; i29++) {
                                                    oVar.e();
                                                }
                                            } else {
                                                oVar.d();
                                            }
                                        }
                                        i27++;
                                    }
                                }
                                oVar.d(2);
                                if (oVar.c()) {
                                    oVar.d(8);
                                    oVar.d();
                                    oVar.d();
                                    oVar.f();
                                }
                                int d9 = oVar.d();
                                boolean z4 = false;
                                int i30 = 0;
                                for (int i31 = 0; i31 < d9; i31++) {
                                    if (i31 != 0) {
                                        z4 = oVar.c();
                                    }
                                    if (z4) {
                                        oVar.f();
                                        oVar.d();
                                        for (int i32 = 0; i32 <= i30; i32++) {
                                            if (oVar.c()) {
                                                oVar.f();
                                            }
                                        }
                                    } else {
                                        int d10 = oVar.d();
                                        int d11 = oVar.d();
                                        int i33 = d10 + d11;
                                        for (int i34 = 0; i34 < d10; i34++) {
                                            oVar.d();
                                            oVar.f();
                                        }
                                        for (int i35 = 0; i35 < d11; i35++) {
                                            oVar.d();
                                            oVar.f();
                                        }
                                        i30 = i33;
                                    }
                                }
                                if (oVar.c()) {
                                    for (int i36 = 0; i36 < oVar.d(); i36++) {
                                        oVar.d(d8 + 5);
                                    }
                                }
                                oVar.d(2);
                                if (oVar.c() && oVar.c()) {
                                    int b2 = oVar.b(8);
                                    if (b2 == 255) {
                                        i8 = 16;
                                        int b3 = oVar.b(16);
                                        int b4 = oVar.b(16);
                                        if (b3 != 0 && b4 != 0) {
                                            f = b3 / b4;
                                            rVar4.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(str, "video/hevc", -1, i25, i24, Collections.singletonList(bArr2), -1, f, null, -1, null, null));
                                            this.e = true;
                                        }
                                    } else {
                                        i8 = 16;
                                        float[] fArr = com.fyber.inneractive.sdk.player.exoplayer2.util.l.b;
                                        if (b2 < 17) {
                                            f = fArr[b2];
                                            rVar4.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(str, "video/hevc", -1, i25, i24, Collections.singletonList(bArr2), -1, f, null, -1, null, null));
                                            this.e = true;
                                        }
                                    }
                                } else {
                                    i8 = 16;
                                }
                                f = 1.0f;
                                rVar4.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(str, "video/hevc", -1, i25, i24, Collections.singletonList(bArr2), -1, f, null, -1, null, null));
                                this.e = true;
                            }
                        }
                    }
                    i4 = i11;
                    bArr = bArr3;
                    i5 = i14;
                    i6 = i15;
                    i7 = i;
                    i8 = 16;
                }
                if (this.j.a(i3)) {
                    r rVar5 = this.j;
                    int a2 = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(rVar5.e, rVar5.d);
                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.n;
                    nVar3.a = this.j.d;
                    nVar3.c = a2;
                    nVar3.b = 0;
                    nVar3.e(i2);
                    j2 = j;
                    com.fyber.inneractive.sdk.player.exoplayer2.text.cea.a.a(j2, this.n, this.a.b);
                } else {
                    j2 = j;
                }
                if (this.k.a(i3)) {
                    r rVar6 = this.k;
                    int a3 = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(rVar6.e, rVar6.d);
                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar4 = this.n;
                    nVar4.a = this.k.d;
                    nVar4.c = a3;
                    nVar4.b = 0;
                    nVar4.e(5);
                    com.fyber.inneractive.sdk.player.exoplayer2.text.cea.a.a(j2, this.n, this.a.b);
                }
                long j6 = this.m;
                if (this.e) {
                    n nVar5 = this.d;
                    nVar5.g = false;
                    nVar5.h = false;
                    nVar5.e = j6;
                    nVar5.d = 0;
                    nVar5.b = j3;
                    i9 = i6;
                    if (i9 >= 32) {
                        if (nVar5.j || !nVar5.i) {
                            i10 = i8;
                            z = false;
                        } else {
                            i10 = i8;
                            z = false;
                            nVar5.a.a(nVar5.l, nVar5.m ? 1 : 0, (int) (j3 - nVar5.k), i7, null);
                            nVar5.i = false;
                        }
                        if (i9 <= 34) {
                            z2 = true;
                            nVar5.h = !nVar5.j;
                            nVar5.j = true;
                            z3 = (i9 >= i10 || i9 > 21) ? z : z2;
                            nVar5.c = z3;
                            if (!z3 && i9 > 9) {
                                z2 = z;
                            }
                            nVar5.f = z2;
                        }
                    } else {
                        i10 = i8;
                        z = false;
                    }
                    z2 = true;
                    if (i9 >= i10) {
                    }
                    nVar5.c = z3;
                    if (!z3) {
                        z2 = z;
                    }
                    nVar5.f = z2;
                } else {
                    i9 = i6;
                    this.g.b(i9);
                    this.h.b(i9);
                    this.i.b(i9);
                }
                this.j.b(i9);
                this.k.b(i9);
                i12 = i5;
                i11 = i4;
                bArr3 = bArr;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.b = e0Var.e;
        e0Var.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a = jVar.a(e0Var.d, 2);
        this.c = a;
        this.d = new n(a);
        this.a.a(jVar, e0Var);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(this.f);
        r rVar = this.g;
        rVar.b = false;
        rVar.c = false;
        r rVar2 = this.h;
        rVar2.b = false;
        rVar2.c = false;
        r rVar3 = this.i;
        rVar3.b = false;
        rVar3.c = false;
        r rVar4 = this.j;
        rVar4.b = false;
        rVar4.c = false;
        r rVar5 = this.k;
        rVar5.b = false;
        rVar5.c = false;
        n nVar = this.d;
        nVar.f = false;
        nVar.g = false;
        nVar.h = false;
        nVar.i = false;
        nVar.j = false;
        this.l = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z, long j) {
        this.m = j;
    }

    public final void a(byte[] bArr, int i, int i2) {
        if (this.e) {
            n nVar = this.d;
            if (nVar.f) {
                int i3 = nVar.d;
                int i4 = (i + 2) - i3;
                if (i4 < i2) {
                    nVar.g = (bArr[i4] & 128) != 0;
                    nVar.f = false;
                } else {
                    nVar.d = (i2 - i) + i3;
                }
            }
        } else {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }
}
