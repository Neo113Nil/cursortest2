package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a0 implements v {
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.m a = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(new byte[5]);
    public final SparseArray b = new SparseArray();
    public final SparseIntArray c = new SparseIntArray();
    public final int d;
    public final /* synthetic */ b0 e;

    public a0(b0 b0Var, int i) {
        this.e = b0Var;
        this.d = i;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar;
        char c;
        f0 a;
        int i;
        int i2;
        int i3;
        if (nVar.j() != 2) {
            return;
        }
        b0 b0Var = this.e;
        int i4 = b0Var.a;
        int i5 = 0;
        if (i4 == 1 || i4 == 2 || b0Var.i == 1) {
            vVar = (com.fyber.inneractive.sdk.player.exoplayer2.util.v) b0Var.b.get(0);
        } else {
            vVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.v(((com.fyber.inneractive.sdk.player.exoplayer2.util.v) b0Var.b.get(0)).a);
            this.e.b.add(vVar);
        }
        nVar.e(nVar.b + 2);
        int o = nVar.o();
        int i6 = 5;
        nVar.e(nVar.b + 5);
        com.fyber.inneractive.sdk.player.exoplayer2.util.m mVar = this.a;
        nVar.a(mVar.a, 0, 2);
        mVar.b(0);
        int i7 = 4;
        this.a.c(4);
        int i8 = 12;
        nVar.e(nVar.b + this.a.a(12));
        b0 b0Var2 = this.e;
        if (b0Var2.a == 2 && b0Var2.k == null) {
            d0 d0Var = new d0(21, null, null, new byte[0]);
            b0 b0Var3 = this.e;
            b0Var3.k = b0Var3.e.a(21, d0Var);
            b0 b0Var4 = this.e;
            b0Var4.k.a(vVar, b0Var4.h, new e0(o, 21, 8192));
        }
        this.b.clear();
        this.c.clear();
        int i9 = nVar.c - nVar.b;
        while (i9 > 0) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.m mVar2 = this.a;
            nVar.a(mVar2.a, i5, i6);
            mVar2.b(i5);
            int a2 = this.a.a(8);
            int i10 = 3;
            this.a.c(3);
            int a3 = this.a.a(13);
            this.a.c(i7);
            int a4 = this.a.a(i8);
            int i11 = nVar.b;
            int i12 = i11 + a4;
            int i13 = -1;
            String str = null;
            ArrayList arrayList = null;
            while (nVar.b < i12) {
                int j = nVar.j();
                int j2 = nVar.b + nVar.j();
                if (j == i6) {
                    long k = nVar.k();
                    if (k != b0.l) {
                        if (k != b0.m) {
                            if (k == b0.n) {
                                i3 = 36;
                                i13 = i3;
                            }
                        }
                        i3 = 135;
                        i13 = i3;
                    }
                    i3 = 129;
                    i13 = i3;
                } else {
                    if (j != 106) {
                        if (j != 122) {
                            if (j == 123) {
                                i3 = 138;
                                i13 = i3;
                            } else if (j == 10) {
                                str = nVar.b(i10).trim();
                            } else if (j == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (nVar.b < j2) {
                                    String trim = nVar.b(i10).trim();
                                    nVar.j();
                                    byte[] bArr = new byte[4];
                                    nVar.a(bArr, 0, 4);
                                    arrayList2.add(new c0(trim, bArr));
                                    i9 = i9;
                                    i10 = 3;
                                }
                                i = i9;
                                i2 = 4;
                                arrayList = arrayList2;
                                i13 = 89;
                                int i14 = nVar.b;
                                nVar.e((j2 - i14) + i14);
                                i7 = i2;
                                i9 = i;
                                i6 = 5;
                                i10 = 3;
                            }
                        }
                        i3 = 135;
                        i13 = i3;
                    }
                    i3 = 129;
                    i13 = i3;
                }
                i = i9;
                i2 = 4;
                int i142 = nVar.b;
                nVar.e((j2 - i142) + i142);
                i7 = i2;
                i9 = i;
                i6 = 5;
                i10 = 3;
            }
            int i15 = i9;
            int i16 = i7;
            nVar.e(i12);
            d0 d0Var2 = new d0(i13, str, arrayList, Arrays.copyOfRange(nVar.a, i11, i12));
            if (a2 == 6) {
                a2 = i13;
            }
            i9 = i15 - (a4 + 5);
            b0 b0Var5 = this.e;
            int i17 = b0Var5.a == 2 ? a2 : a3;
            if (b0Var5.g.get(i17)) {
                c = 21;
            } else {
                b0 b0Var6 = this.e;
                if (b0Var6.a == 2) {
                    c = 21;
                    if (a2 == 21) {
                        a = b0Var6.k;
                        if (this.e.a == 2 || a3 < this.c.get(i17, 8192)) {
                            this.c.put(i17, a3);
                            this.b.put(i17, a);
                        }
                    }
                } else {
                    c = 21;
                }
                a = b0Var6.e.a(a2, d0Var2);
                if (this.e.a == 2) {
                }
                this.c.put(i17, a3);
                this.b.put(i17, a);
            }
            i7 = i16;
            i5 = 0;
            i6 = 5;
            i8 = 12;
        }
        int size = this.c.size();
        for (int i18 = 0; i18 < size; i18++) {
            int keyAt = this.c.keyAt(i18);
            this.e.g.put(keyAt, true);
            f0 f0Var = (f0) this.b.valueAt(i18);
            if (f0Var != null) {
                b0 b0Var7 = this.e;
                if (f0Var != b0Var7.k) {
                    f0Var.a(vVar, b0Var7.h, new e0(o, keyAt, 8192));
                }
                this.e.f.put(this.c.valueAt(i18), f0Var);
            }
        }
        b0 b0Var8 = this.e;
        if (b0Var8.a == 2) {
            if (b0Var8.j) {
                return;
            }
            b0Var8.h.b();
            b0 b0Var9 = this.e;
            b0Var9.i = 0;
            b0Var9.j = true;
            return;
        }
        b0Var8.f.remove(this.d);
        b0 b0Var10 = this.e;
        int i19 = b0Var10.a == 1 ? 0 : b0Var10.i - 1;
        b0Var10.i = i19;
        if (i19 == 0) {
            b0Var10.h.b();
            this.e.j = true;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
    }
}
