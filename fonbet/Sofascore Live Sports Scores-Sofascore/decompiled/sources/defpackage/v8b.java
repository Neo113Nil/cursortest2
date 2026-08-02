package defpackage;

import com.sofascore.results.R;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class v8b implements fm8, rdh {
    public final List a;
    public final gv9 b;
    public final gv9 c;
    public final q9k d;

    public v8b(List list, q9k q9kVar) {
        b7 K = l6g.K(new r13(hkg.d(4281535498L)), new r13(hkg.d(4288226077L)), new r13(hkg.d(4281535498L)));
        b7 K2 = l6g.K(new r13(hkg.d(4294916912L)), new r13(hkg.b(16726832)), new r13(hkg.d(4294916912L)));
        K.getClass();
        K2.getClass();
        this.a = list;
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
        return R.drawable.red_card_share_background;
    }

    @Override // defpackage.rdh
    public final gv9 d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8b)) {
            return false;
        }
        v8b v8bVar = (v8b) obj;
        return this.a.equals(v8bVar.a) && this.b.equals(v8bVar.b) && this.c.equals(v8bVar.c) && this.d.equals(v8bVar.d);
    }

    public final int hashCode() {
        return lnb.e(ljg.d(wv8.a(R.drawable.red_card_share_background, ljg.d(wv8.a(6000, this.a.hashCode() * 31, 31), 31, this.b), 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "LineupsFieldCard(players=" + this.a + ", durationMilliseconds=6000, contentGradient=" + this.b + ", backgroundResource=2131232883, borderContentGradient=" + this.c + ", shareTitle=" + this.d + ", shareDescription=null)";
    }
}
