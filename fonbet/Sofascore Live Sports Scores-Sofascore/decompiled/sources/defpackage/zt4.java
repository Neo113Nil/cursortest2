package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zt4 extends du4 implements Comparable {
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final boolean m;

    public zt4(int i, nsj nsjVar, int i2, vt4 vt4Var, int i3, String str) {
        super(i, nsjVar, i2);
        int i4;
        int i5 = 0;
        this.f = hu4.d(i3, false);
        int i6 = this.d.d;
        int i7 = vt4Var.u;
        hv9 hv9Var = vt4Var.s;
        int i8 = i6 & (~i7);
        this.g = (i8 & 1) != 0;
        this.h = (i8 & 2) != 0;
        hv9 z = hv9Var.isEmpty() ? hv9.z("") : hv9Var;
        int i9 = 0;
        while (true) {
            if (i9 >= z.size()) {
                i4 = 0;
                i9 = Integer.MAX_VALUE;
                break;
            } else {
                i4 = hu4.b(this.d, (String) z.get(i9), vt4Var.v);
                if (i4 > 0) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        this.i = i9;
        this.j = i4;
        int i10 = this.d.e;
        int i11 = vt4Var.t;
        int bitCount = (i10 == 0 || i10 != i11) ? Integer.bitCount(i10 & i11) : Integer.MAX_VALUE;
        this.k = bitCount;
        this.m = (this.d.e & 1088) != 0;
        int b = hu4.b(this.d, str, hu4.f(str) == null);
        this.l = b;
        boolean z2 = i4 > 0 || (hv9Var.isEmpty() && bitCount > 0) || this.g || (this.h && b > 0);
        if (hu4.d(i3, vt4Var.K) && z2) {
            i5 = 1;
        }
        this.e = i5;
    }

    @Override // defpackage.du4
    public final int a() {
        return this.e;
    }

    @Override // defpackage.du4
    public final boolean b(du4 du4Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zt4 zt4Var) {
        w63 c = w63.a.c(this.f, zt4Var.f);
        Integer valueOf = Integer.valueOf(this.i);
        Integer valueOf2 = Integer.valueOf(zt4Var.i);
        Comparator comparator = h4g.a;
        w63 b = c.b(valueOf, valueOf2, comparator);
        int i = zt4Var.j;
        int i2 = this.j;
        w63 a = b.a(i2, i);
        int i3 = zt4Var.k;
        int i4 = this.k;
        w63 c2 = a.a(i4, i3).c(this.g, zt4Var.g);
        Boolean valueOf3 = Boolean.valueOf(this.h);
        Boolean valueOf4 = Boolean.valueOf(zt4Var.h);
        if (i2 == 0) {
            comparator = x5d.a;
        }
        w63 a2 = c2.b(valueOf3, valueOf4, comparator).a(this.l, zt4Var.l);
        if (i4 == 0) {
            a2 = a2.d(this.m, zt4Var.m);
        }
        return a2.e();
    }
}
