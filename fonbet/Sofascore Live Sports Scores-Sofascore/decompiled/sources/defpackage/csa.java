package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class csa implements l1c {
    public final dsa a;
    public final int b;
    public final boolean c;
    public final float d;
    public final l1c e;
    public final float f;
    public final boolean g;
    public final ku3 h;
    public final kx4 i;
    public final long j;
    public final List k;
    public final int l;
    public final int m;
    public final int n;
    public final ewd o;
    public final int p;
    public final int q;

    public csa(dsa dsaVar, int i, boolean z, float f, l1c l1cVar, float f2, boolean z2, ku3 ku3Var, kx4 kx4Var, long j, List list, int i2, int i3, int i4, ewd ewdVar, int i5, int i6) {
        this.a = dsaVar;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = l1cVar;
        this.f = f2;
        this.g = z2;
        this.h = ku3Var;
        this.i = kx4Var;
        this.j = j;
        this.k = list;
        this.l = i2;
        this.m = i3;
        this.n = i4;
        this.o = ewdVar;
        this.p = i5;
        this.q = i6;
    }

    @Override // defpackage.l1c
    public final Map a() {
        return this.e.a();
    }

    @Override // defpackage.l1c
    public final void b() {
        this.e.b();
    }

    @Override // defpackage.l1c
    public final Function1 c() {
        return this.e.c();
    }

    public final csa d(int i, boolean z) {
        dsa dsaVar;
        int i2;
        int i3;
        int i4;
        if (this.g) {
            return null;
        }
        List list = this.k;
        if (list.isEmpty() || (dsaVar = this.a) == null) {
            return null;
        }
        int i5 = dsaVar.q;
        int i6 = this.b - i;
        if (i6 < 0 || i6 >= i5) {
            return null;
        }
        dsa dsaVar2 = (dsa) CollectionsKt.Y(list);
        dsa dsaVar3 = (dsa) CollectionsKt.h0(list);
        if (dsaVar2.s || dsaVar3.s) {
            return null;
        }
        int i7 = dsaVar2.o;
        int i8 = this.m;
        int i9 = this.l;
        if (i < 0) {
            if (Math.min((i7 + dsaVar2.q) - i9, (dsaVar3.o + dsaVar3.q) - i8) <= (-i)) {
                return null;
            }
        } else if (Math.min(i9 - i7, i8 - dsaVar3.o) <= i) {
            return null;
        }
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            dsa dsaVar4 = (dsa) list.get(i10);
            boolean z2 = dsaVar4.c;
            int[] iArr = dsaVar4.w;
            if (!dsaVar4.s) {
                dsaVar4.o += i;
                int length = iArr.length;
                for (int i11 = 0; i11 < length; i11++) {
                    int i12 = i11 & 1;
                    if ((z2 && i12 != 0) || (!z2 && i12 == 0)) {
                        iArr[i11] = iArr[i11] + i;
                    }
                }
                if (z) {
                    int size2 = dsaVar4.b.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        lqa a = dsaVar4.m.a(i13, dsaVar4.k);
                        if (a != null) {
                            long j = a.l;
                            if (z2) {
                                i2 = i10;
                                i3 = (int) (j >> 32);
                                i4 = ((int) (j & 4294967295L)) + i;
                            } else {
                                i2 = i10;
                                i3 = ((int) (j >> 32)) + i;
                                i4 = (int) (j & 4294967295L);
                            }
                            a.l = (i4 & 4294967295L) | (i3 << 32);
                        } else {
                            i2 = i10;
                        }
                        i13++;
                        i10 = i2;
                    }
                }
            }
            i10++;
        }
        return new csa(this.a, i6, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q);
    }

    public final long e() {
        l1c l1cVar = this.e;
        return (l1cVar.getWidth() << 32) | (l1cVar.getHeight() & 4294967295L);
    }

    @Override // defpackage.l1c
    public final int getHeight() {
        return this.e.getHeight();
    }

    @Override // defpackage.l1c
    public final int getWidth() {
        return this.e.getWidth();
    }
}
