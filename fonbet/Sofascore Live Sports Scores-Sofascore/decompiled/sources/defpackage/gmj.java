package defpackage;

import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class gmj implements fm8, rdh {
    public final q9k a;
    public final gv9 b;
    public final int c;
    public final gv9 d;
    public final gv9 e;
    public final q9k f;

    public gmj(q9k q9kVar, gv9 gv9Var, int i, q9k q9kVar2) {
        b7 K = l6g.K(new r13(hkg.d(4281535498L)), new r13(hkg.d(4288226077L)), new r13(hkg.d(4281535498L)));
        b7 K2 = l6g.K(new r13(hkg.d(4294916912L)), new r13(hkg.b(16726832)), new r13(hkg.d(4294916912L)));
        K.getClass();
        K2.getClass();
        this.a = q9kVar;
        this.b = gv9Var;
        this.c = i;
        this.d = K;
        this.e = K2;
        this.f = q9kVar2;
    }

    @Override // defpackage.fm8
    public final int a() {
        return this.c;
    }

    @Override // defpackage.rdh
    public final gv9 b() {
        return this.e;
    }

    @Override // defpackage.rdh
    public final int c() {
        return R.drawable.red_card_share_background;
    }

    @Override // defpackage.rdh
    public final gv9 d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gmj)) {
            return false;
        }
        gmj gmjVar = (gmj) obj;
        return this.a.equals(gmjVar.a) && this.b.equals(gmjVar.b) && this.c == gmjVar.c && this.d.equals(gmjVar.d) && this.e.equals(gmjVar.e) && this.f.equals(gmjVar.f);
    }

    public final int hashCode() {
        return lnb.e(ljg.d(wv8.a(R.drawable.red_card_share_background, ljg.d(wv8.a(this.c, ljg.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        return "TopPlayersCard(title=" + this.a + ", topPlayers=" + this.b + ", durationMilliseconds=" + this.c + ", contentGradient=" + this.d + ", backgroundResource=2131232883, borderContentGradient=" + this.e + ", shareTitle=" + this.f + ", shareDescription=null)";
    }
}
