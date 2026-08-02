package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class skh implements tfi, n2k {
    public final gv9 a;
    public final gv9 b;
    public final long c;
    public final gv9 d;
    public final String e;
    public final gv9 f;

    public skh(b7 b7Var, b7 b7Var2, long j, b7 b7Var3, String str) {
        b7 K = l6g.K(new r13(hkg.d(4278239436L)), new r13(hkg.b(49356)), new r13(hkg.d(4278239436L)));
        b7Var.getClass();
        b7Var2.getClass();
        b7Var3.getClass();
        K.getClass();
        this.a = b7Var;
        this.b = b7Var2;
        this.c = j;
        this.d = b7Var3;
        this.e = str;
        this.f = K;
    }

    @Override // defpackage.tfi
    public final String a() {
        return this.e;
    }

    @Override // defpackage.n2k
    public final gv9 b() {
        return this.f;
    }

    @Override // defpackage.n2k
    public final long c() {
        return this.c;
    }

    @Override // defpackage.n2k
    public final gv9 d() {
        return this.a;
    }

    @Override // defpackage.tfi
    public final gv9 e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof skh)) {
            return false;
        }
        skh skhVar = (skh) obj;
        if (!this.a.equals(skhVar.a) || !this.b.equals(skhVar.b)) {
            return false;
        }
        long j = skhVar.c;
        int i = r13.j;
        return e8k.a(this.c, j) && this.d.equals(skhVar.d) && this.e.equals(skhVar.e) && this.f.equals(skhVar.f);
    }

    @Override // defpackage.n2k
    public final gv9 f() {
        return this.b;
    }

    public final int hashCode() {
        int d = ljg.d(this.a.hashCode() * 31, 31, this.b);
        int i = r13.j;
        d8k d8kVar = e8k.b;
        return this.f.hashCode() + dmi.c(ljg.d(ljg.c(d, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        String i = r13.i(this.c);
        StringBuilder l = wv8.l("SkillSegment(backgroundGradient=", this.a, ", tunnelGradients=", this.b, ", highlightBoxColor=");
        l.append(i);
        l.append(", cards=");
        l.append(this.d);
        l.append(", analyticsCategory=");
        l.append(this.e);
        l.append(", borderGradientColor=");
        l.append(this.f);
        l.append(")");
        return l.toString();
    }
}
