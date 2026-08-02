package defpackage;

import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tkh implements fm8, rdh {
    public final q9k a;
    public final gv9 b;
    public final gv9 c;
    public final gv9 d;
    public final q9k e;

    public tkh(q9k q9kVar, b7 b7Var, q9k q9kVar2) {
        b7 K = l6g.K(new r13(hkg.d(4278202419L)), new r13(hkg.d(4278239436L)), new r13(hkg.d(4278202419L)));
        b7 K2 = l6g.K(new r13(hkg.d(4278239436L)), new r13(hkg.b(49356)), new r13(hkg.d(4278239436L)));
        b7Var.getClass();
        K.getClass();
        K2.getClass();
        this.a = q9kVar;
        this.b = b7Var;
        this.c = K;
        this.d = K2;
        this.e = q9kVar2;
    }

    @Override // defpackage.fm8
    public final int a() {
        return 5000;
    }

    @Override // defpackage.rdh
    public final gv9 b() {
        return this.d;
    }

    @Override // defpackage.rdh
    public final int c() {
        return R.drawable.skill_card_share_background;
    }

    @Override // defpackage.rdh
    public final gv9 d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tkh)) {
            return false;
        }
        tkh tkhVar = (tkh) obj;
        return this.a.equals(tkhVar.a) && this.b.equals(tkhVar.b) && this.c.equals(tkhVar.c) && this.d.equals(tkhVar.d) && this.e.equals(tkhVar.e);
    }

    public final int hashCode() {
        return lnb.e(ljg.d(wv8.a(R.drawable.skill_card_share_background, ljg.d(wv8.a(5000, ljg.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.c), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SkillSummaryGraphCard(title=");
        sb.append(this.a);
        sb.append(", chartData=");
        sb.append(this.b);
        sb.append(", durationMilliseconds=5000, contentGradient=");
        vxd.u(sb, this.c, ", backgroundResource=2131232910, borderContentGradient=", this.d, ", shareTitle=");
        sb.append(this.e);
        sb.append(", shareDescription=null)");
        return sb.toString();
    }
}
