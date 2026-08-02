package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hvc implements tfi, n2k {
    public final gv9 a;
    public final gv9 b;
    public final long c;
    public final gv9 d;
    public final String e;
    public final gv9 f;

    public hvc(b7 b7Var) {
        b7 K = l6g.K(l6g.K(new r13(hkg.d(4280363113L)), new r13(hkg.d(4282141682L)), new r13(hkg.d(4280363113L))), l6g.K(new r13(hkg.d(4280362597L)), new r13(hkg.d(4282468847L)), new r13(hkg.d(4280362597L))), l6g.K(new r13(hkg.d(4280361825L)), new r13(hkg.d(4282795756L)), new r13(hkg.d(4280361825L))), l6g.K(new r13(hkg.d(4280295772L)), new r13(hkg.d(4283057385L)), new r13(hkg.d(4280295772L))), l6g.K(new r13(hkg.d(4280295256L)), new r13(hkg.d(4283384550L)), new r13(hkg.d(4280295256L))), l6g.K(new r13(hkg.d(4280294740L)), new r13(hkg.d(4283711715L)), new r13(hkg.d(4280294740L))), l6g.K(new r13(hkg.d(4280293968L)), new r13(hkg.d(4284038625L)), new r13(hkg.d(4280293968L))), l6g.K(new r13(hkg.d(4280293452L)), new r13(hkg.d(4284365790L)), new r13(hkg.d(4280293452L))), l6g.K(new r13(hkg.d(4280292936L)), new r13(hkg.d(4284692955L)), new r13(hkg.d(4280292936L))), l6g.K(new r13(hkg.d(4280292420L)), new r13(hkg.d(4285020120L)), new r13(hkg.d(4280292420L))), l6g.K(new r13(hkg.d(4280226367L)), new r13(hkg.d(4285281749L)), new r13(hkg.d(4280226367L))), l6g.K(new r13(hkg.d(4280225595L)), new r13(hkg.d(4285608658L)), new r13(hkg.d(4280225595L))), l6g.K(new r13(hkg.d(4280225079L)), new r13(hkg.d(4285935823L)), new r13(hkg.d(4280225079L))), l6g.K(new r13(hkg.d(4280224563L)), new r13(hkg.d(4286262988L)), new r13(hkg.d(4280224563L))));
        b7 K2 = l6g.K(new r13(hkg.d(4280363629L)), new r13(hkg.d(4281814517L)), new r13(hkg.d(4280363629L)));
        long d = hkg.d(4291405823L);
        b7 K3 = l6g.K(new r13(hkg.d(4286262988L)), new r13(hkg.b(8072908)), new r13(hkg.d(4286262988L)));
        K.getClass();
        K2.getClass();
        b7Var.getClass();
        K3.getClass();
        this.a = K;
        this.b = K2;
        this.c = d;
        this.d = b7Var;
        this.e = "activity";
        this.f = K3;
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
        if (!(obj instanceof hvc)) {
            return false;
        }
        hvc hvcVar = (hvc) obj;
        if (!this.a.equals(hvcVar.a) || !this.b.equals(hvcVar.b)) {
            return false;
        }
        long j = hvcVar.c;
        int i = r13.j;
        return e8k.a(this.c, j) && this.d.equals(hvcVar.d) && this.e.equals(hvcVar.e) && this.f.equals(hvcVar.f);
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
        StringBuilder l = wv8.l("MonthlyStatsSegment(tunnelGradients=", this.a, ", backgroundGradient=", this.b, ", highlightBoxColor=");
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
