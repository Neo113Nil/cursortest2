package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class s implements f0 {
    public final h a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.m b = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(new byte[10]);
    public int c = 0;
    public int d;
    public com.fyber.inneractive.sdk.player.exoplayer2.util.v e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public s(h hVar) {
        this.a = hVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, boolean z) {
        int i;
        if (z) {
            int i2 = this.c;
            if (i2 != 2 && i2 == 3) {
                this.a.b();
            }
            this.c = 1;
            this.d = 0;
        }
        while (true) {
            int i3 = nVar.c;
            int i4 = nVar.b;
            int i5 = i3 - i4;
            if (i5 <= 0) {
                return;
            }
            int i6 = this.c;
            if (i6 == 0) {
                nVar.e(i5 + i4);
            } else if (i6 != 1) {
                if (i6 == 2) {
                    if (a(nVar, this.b.a, Math.min(10, this.i)) && a(nVar, (byte[]) null, this.i)) {
                        this.b.b(0);
                        long j = C.TIME_UNSET;
                        this.l = C.TIME_UNSET;
                        if (this.f) {
                            this.b.c(4);
                            this.b.c(1);
                            this.b.c(1);
                            long a = (this.b.a(3) << 30) | (this.b.a(15) << 15) | this.b.a(15);
                            this.b.c(1);
                            if (!this.h && this.g) {
                                this.b.c(4);
                                this.b.c(1);
                                this.b.c(1);
                                this.b.c(1);
                                this.e.b(this.b.a(15) | (this.b.a(3) << 30) | (this.b.a(15) << 15));
                                this.h = true;
                            }
                            j = this.e.b(a);
                            this.l = j;
                        }
                        this.a.a(this.k, j);
                        this.c = 3;
                        this.d = 0;
                    }
                } else if (i6 == 3) {
                    int i7 = this.j;
                    int i8 = i7 == -1 ? 0 : i5 - i7;
                    if (i8 > 0) {
                        i5 -= i8;
                        nVar.d(i4 + i5);
                    }
                    this.a.a(nVar);
                    int i9 = this.j;
                    if (i9 != -1) {
                        int i10 = i9 - i5;
                        this.j = i10;
                        if (i10 == 0) {
                            this.a.b();
                            this.c = 1;
                            this.d = 0;
                        }
                    }
                }
            } else if (a(nVar, this.b.a, 9)) {
                this.b.b(0);
                if (this.b.a(24) != 1) {
                    this.j = -1;
                    i = 0;
                } else {
                    this.b.c(8);
                    int a2 = this.b.a(16);
                    this.b.c(5);
                    this.k = this.b.b();
                    this.b.c(2);
                    this.f = this.b.b();
                    this.g = this.b.b();
                    this.b.c(6);
                    int a3 = this.b.a(8);
                    this.i = a3;
                    if (a2 == 0) {
                        this.j = -1;
                    } else {
                        this.j = (a2 - 3) - a3;
                    }
                    i = 2;
                }
                this.c = i;
                this.d = 0;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        this.e = vVar;
        this.a.a(jVar, e0Var);
    }

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, byte[] bArr, int i) {
        int min = Math.min(nVar.c - nVar.b, i - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            nVar.e(nVar.b + min);
        } else {
            nVar.a(bArr, this.d, min);
        }
        int i2 = this.d + min;
        this.d = i2;
        return i2 == i;
    }
}
