package defpackage;

import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.results.R;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class nmj implements fm8, rdh {
    public final Sport a;
    public final q9k b;
    public final gv9 c;
    public final gv9 d;
    public final q9k e;

    public nmj(Sport sport, q9k q9kVar, q9k q9kVar2) {
        b7 K = l6g.K(new r13(hkg.d(4281535498L)), new r13(hkg.d(4288226077L)), new r13(hkg.d(4281535498L)));
        b7 K2 = l6g.K(new r13(hkg.d(4294916912L)), new r13(hkg.b(16726832)), new r13(hkg.d(4294916912L)));
        sport.getClass();
        K.getClass();
        K2.getClass();
        this.a = sport;
        this.b = q9kVar;
        this.c = K;
        this.d = K2;
        this.e = q9kVar2;
    }

    @Override // defpackage.fm8
    public final int a() {
        return 4000;
    }

    @Override // defpackage.rdh
    public final gv9 b() {
        return this.d;
    }

    @Override // defpackage.rdh
    public final int c() {
        return R.drawable.red_card_share_background;
    }

    @Override // defpackage.rdh
    public final gv9 d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmj)) {
            return false;
        }
        nmj nmjVar = (nmj) obj;
        return Intrinsics.c(this.a, nmjVar.a) && this.b.equals(nmjVar.b) && this.c.equals(nmjVar.c) && this.d.equals(nmjVar.d) && this.e.equals(nmjVar.e);
    }

    public final int hashCode() {
        return lnb.e(ljg.d(wv8.a(R.drawable.red_card_share_background, ljg.d(wv8.a(4000, lnb.e(this.a.hashCode() * 31, 31, this.b), 31), 31, this.c), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopSportsIconCard(sport=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", durationMilliseconds=4000, contentGradient=");
        vxd.u(sb, this.c, ", backgroundResource=2131232883, borderContentGradient=", this.d, ", shareTitle=");
        sb.append(this.e);
        sb.append(", shareDescription=null)");
        return sb.toString();
    }
}
