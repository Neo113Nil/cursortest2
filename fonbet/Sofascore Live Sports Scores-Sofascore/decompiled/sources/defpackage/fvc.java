package defpackage;

import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class fvc implements fm8, rdh {
    public final yp2 a;
    public final o9k b;
    public final q9k c;
    public final gv9 d;
    public final gv9 e;
    public final o9k f;

    public fvc(yp2 yp2Var, o9k o9kVar, q9k q9kVar, o9k o9kVar2) {
        b7 K = l6g.K(new r13(hkg.d(4280224563L)), new r13(hkg.d(4286262988L)), new r13(hkg.d(4280224563L)));
        b7 K2 = l6g.K(new r13(hkg.d(4286262988L)), new r13(hkg.b(8072908)), new r13(hkg.d(4286262988L)));
        K.getClass();
        K2.getClass();
        this.a = yp2Var;
        this.b = o9kVar;
        this.c = q9kVar;
        this.d = K;
        this.e = K2;
        this.f = o9kVar2;
    }

    @Override // defpackage.fm8
    public final int a() {
        return 5000;
    }

    @Override // defpackage.rdh
    public final gv9 b() {
        return this.e;
    }

    @Override // defpackage.rdh
    public final int c() {
        return R.drawable.monthly_segment_share_background;
    }

    @Override // defpackage.rdh
    public final gv9 d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvc)) {
            return false;
        }
        fvc fvcVar = (fvc) obj;
        return this.a.equals(fvcVar.a) && this.b.equals(fvcVar.b) && this.c.equals(fvcVar.c) && this.d.equals(fvcVar.d) && this.e.equals(fvcVar.e) && this.f.equals(fvcVar.f);
    }

    public final int hashCode() {
        return (this.f.hashCode() + ljg.d(wv8.a(R.drawable.monthly_segment_share_background, ljg.d(wv8.a(5000, lnb.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31), 31, this.d), 31), 31, this.e)) * 31;
    }

    public final String toString() {
        return "MonthlyStatsChartCard(stats=" + this.a + ", title=" + this.b + ", description=" + this.c + ", durationMilliseconds=5000, contentGradient=" + this.d + ", backgroundResource=2131232672, borderContentGradient=" + this.e + ", shareTitle=" + this.f + ", shareDescription=null)";
    }
}
