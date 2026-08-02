package defpackage;

import androidx.media3.common.b;
import java.util.Comparator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class au4 extends eu4 implements Comparable {
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final boolean n;

    public au4(int i, osj osjVar, int i2, wt4 wt4Var, int i3, String str, String str2) {
        super(i, osjVar, i2);
        int i4;
        int i5 = 0;
        this.f = n51.k(i3, false);
        int i6 = this.d.e;
        int i7 = wt4Var.u;
        hv9 hv9Var = wt4Var.r;
        int i8 = i6 & (~i7);
        this.g = (i8 & 1) != 0;
        this.h = (i8 & 2) != 0;
        hv9 z = str2 != null ? hv9.z(str2) : hv9Var.isEmpty() ? hv9.z("") : hv9Var;
        int i9 = 0;
        while (true) {
            if (i9 >= z.size()) {
                i4 = 0;
                i9 = Integer.MAX_VALUE;
                break;
            } else {
                i4 = iu4.g(this.d, (String) z.get(i9), false);
                if (i4 > 0) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        this.i = i9;
        this.j = i4;
        int i10 = str2 != null ? 1088 : 0;
        int i11 = this.d.f;
        dwd dwdVar = iu4.k;
        int bitCount = (i11 == 0 || i11 != i10) ? Integer.bitCount(i10 & i11) : Integer.MAX_VALUE;
        this.k = bitCount;
        b bVar = this.d;
        this.n = (1088 & bVar.f) != 0;
        int f = iu4.f(bVar, wt4Var.s);
        this.l = f;
        int g = iu4.g(this.d, str, iu4.j(str) == null);
        this.m = g;
        boolean z2 = i4 > 0 || (hv9Var.isEmpty() && bitCount > 0) || ((hv9Var.isEmpty() && f != Integer.MAX_VALUE) || this.g || (this.h && g > 0));
        if (n51.k(i3, wt4Var.D) && z2) {
            i5 = 1;
        }
        this.e = i5;
    }

    @Override // defpackage.eu4
    public final int a() {
        return this.e;
    }

    @Override // defpackage.eu4
    public final boolean b(eu4 eu4Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(au4 au4Var) {
        w63 c = w63.a.c(this.f, au4Var.f);
        Integer valueOf = Integer.valueOf(this.i);
        Integer valueOf2 = Integer.valueOf(au4Var.i);
        Comparator comparator = h4g.a;
        w63 b = c.b(valueOf, valueOf2, comparator);
        int i = au4Var.j;
        int i2 = this.j;
        w63 a = b.a(i2, i);
        int i3 = au4Var.k;
        int i4 = this.k;
        w63 c2 = a.a(i4, i3).b(Integer.valueOf(this.l), Integer.valueOf(au4Var.l), comparator).c(this.g, au4Var.g);
        Boolean valueOf3 = Boolean.valueOf(this.h);
        Boolean valueOf4 = Boolean.valueOf(au4Var.h);
        if (i2 == 0) {
            comparator = x5d.a;
        }
        w63 a2 = c2.b(valueOf3, valueOf4, comparator).a(this.m, au4Var.m);
        if (i4 == 0) {
            a2 = a2.d(this.n, au4Var.n);
        }
        return a2.e();
    }
}
