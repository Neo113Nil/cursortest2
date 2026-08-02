package defpackage;

import com.sofascore.results.R;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ooj implements fm8, rdh {
    public final q9k a;
    public final List b;
    public final int c;
    public final gv9 d;
    public final gv9 e;
    public final q9k f;

    public ooj(q9k q9kVar, List list, int i, q9k q9kVar2) {
        b7 K = l6g.K(new r13(hkg.d(4281535498L)), new r13(hkg.d(4288226077L)), new r13(hkg.d(4281535498L)));
        b7 K2 = l6g.K(new r13(hkg.d(4294916912L)), new r13(hkg.b(16726832)), new r13(hkg.d(4294916912L)));
        K.getClass();
        K2.getClass();
        this.a = q9kVar;
        this.b = list;
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
        if (!(obj instanceof ooj)) {
            return false;
        }
        ooj oojVar = (ooj) obj;
        return this.a.equals(oojVar.a) && this.b.equals(oojVar.b) && this.c == oojVar.c && this.d.equals(oojVar.d) && this.e.equals(oojVar.e) && this.f.equals(oojVar.f);
    }

    public final int hashCode() {
        return lnb.e(ljg.d(wv8.a(R.drawable.red_card_share_background, ljg.d(wv8.a(this.c, dmi.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        return "TopTeamsCard(title=" + this.a + ", teams=" + this.b + ", durationMilliseconds=" + this.c + ", contentGradient=" + this.d + ", backgroundResource=2131232883, borderContentGradient=" + this.e + ", shareTitle=" + this.f + ", shareDescription=null)";
    }
}
