package defpackage;

import java.math.RoundingMode;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qu2 {
    public final hw0 a;
    public final vsj b;
    public final int c;
    public final int d;
    public final long e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public long[] m;
    public int[] n;

    public qu2(int i, hw0 hw0Var, vsj vsjVar) {
        int i2 = hw0Var.d;
        this.a = hw0Var;
        int a = hw0Var.a();
        boolean z = true;
        if (a != 1 && a != 2) {
            z = false;
        }
        z1a.s(z);
        int i3 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.c = (a == 2 ? 1667497984 : 1651965952) | i3;
        long j = hw0Var.b * 1000000;
        long j2 = hw0Var.c;
        String str = nik.a;
        this.e = nik.b0(i2, j, j2, RoundingMode.DOWN);
        this.b = vsjVar;
        this.d = a == 2 ? i3 | 1650720768 : -1;
        this.l = -1L;
        this.m = new long[512];
        this.n = new int[512];
        this.f = i2;
    }

    public final f0h a(int i) {
        return new f0h((this.e / this.f) * this.n[i], this.m[i]);
    }

    public final zzg b(long j) {
        if (this.k == 0) {
            f0h f0hVar = new f0h(0L, this.l);
            return new zzg(f0hVar, f0hVar);
        }
        int i = (int) (j / (this.e / this.f));
        int e = nik.e(this.n, i, true, true);
        if (this.n[e] == i) {
            f0h a = a(e);
            return new zzg(a, a);
        }
        f0h a2 = a(e);
        int i2 = e + 1;
        return i2 < this.m.length ? new zzg(a2, a(i2)) : new zzg(a2, a2);
    }
}
