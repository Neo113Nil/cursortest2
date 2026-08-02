package defpackage;

import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mmi implements fm8, rdh {
    public final ehk a;
    public final gv9 b;
    public final gv9 c;
    public final q9k d;

    public mmi(ehk ehkVar, q9k q9kVar) {
        b7 K = l6g.K(new r13(hkg.d(4279836223L)), new r13(hkg.d(4281814517L)), new r13(hkg.d(4279836223L)));
        b7 K2 = l6g.K(new r13(hkg.d(4281814517L)), new r13(hkg.b(1295470069)), new r13(hkg.d(4286262988L)));
        K.getClass();
        K2.getClass();
        this.a = ehkVar;
        this.b = K;
        this.c = K2;
        this.d = q9kVar;
    }

    @Override // defpackage.fm8
    public final int a() {
        return 6000;
    }

    @Override // defpackage.rdh
    public final gv9 b() {
        return this.c;
    }

    @Override // defpackage.rdh
    public final int c() {
        return R.drawable.wrap_up_card_share_background;
    }

    @Override // defpackage.rdh
    public final gv9 d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mmi)) {
            return false;
        }
        mmi mmiVar = (mmi) obj;
        return this.a == mmiVar.a && this.b.equals(mmiVar.b) && this.c.equals(mmiVar.c) && this.d.equals(mmiVar.d);
    }

    public final int hashCode() {
        return lnb.e(ljg.d(wv8.a(R.drawable.wrap_up_card_share_background, ljg.d(wv8.a(6000, this.a.hashCode() * 31, 31), 31, this.b), 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "SummaryRoleCard(role=" + this.a + ", durationMilliseconds=6000, contentGradient=" + this.b + ", backgroundResource=2131233096, borderContentGradient=" + this.c + ", shareTitle=" + this.d + ", shareDescription=null)";
    }
}
