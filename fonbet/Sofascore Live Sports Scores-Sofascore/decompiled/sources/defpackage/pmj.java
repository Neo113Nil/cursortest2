package defpackage;

import com.sofascore.model.network.response.SearchResponseKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class pmj implements tfi, n2k {
    public final gv9 a;
    public final gv9 b;
    public final long c;
    public final gv9 d;
    public final String e;
    public final gv9 f;

    public pmj(b7 b7Var) {
        b7 b7Var2 = k1h.a;
        b7 b7Var3 = k1h.b;
        long j = k1h.c;
        b7 b7Var4 = k1h.p;
        b7Var2.getClass();
        b7Var3.getClass();
        b7Var.getClass();
        b7Var4.getClass();
        this.a = b7Var2;
        this.b = b7Var3;
        this.c = j;
        this.d = b7Var;
        this.e = SearchResponseKt.SPORT_ENTITY;
        this.f = b7Var4;
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
        return this.b;
    }

    @Override // defpackage.tfi
    public final gv9 e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pmj)) {
            return false;
        }
        pmj pmjVar = (pmj) obj;
        if (!this.a.equals(pmjVar.a) || !this.b.equals(pmjVar.b)) {
            return false;
        }
        long j = pmjVar.c;
        int i = r13.j;
        return e8k.a(this.c, j) && this.d.equals(pmjVar.d) && this.e.equals(pmjVar.e) && this.f.equals(pmjVar.f);
    }

    @Override // defpackage.n2k
    public final gv9 f() {
        return this.a;
    }

    public final int hashCode() {
        int d = ljg.d(this.a.hashCode() * 31, 31, this.b);
        int i = r13.j;
        d8k d8kVar = e8k.b;
        return this.f.hashCode() + dmi.c(ljg.d(ljg.c(d, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        String i = r13.i(this.c);
        StringBuilder l = wv8.l("TopSportsSegment(tunnelGradients=", this.a, ", backgroundGradient=", this.b, ", highlightBoxColor=");
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
