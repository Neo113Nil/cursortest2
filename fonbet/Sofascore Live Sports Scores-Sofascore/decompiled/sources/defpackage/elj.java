package defpackage;

import com.sofascore.results.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class elj implements fm8, rdh {
    public final q9k a;
    public final List b;
    public final gv9 c;
    public final gv9 d;
    public final q9k e;

    public elj(q9k q9kVar, q9k q9kVar2, List list) {
        b7 K = l6g.K(new r13(hkg.d(4281535498L)), new r13(hkg.d(4288226077L)), new r13(hkg.d(4281535498L)));
        b7 K2 = l6g.K(new r13(hkg.d(4294916912L)), new r13(hkg.b(16726832)), new r13(hkg.d(4294916912L)));
        list.getClass();
        K.getClass();
        K2.getClass();
        this.a = q9kVar;
        this.b = list;
        this.c = K;
        this.d = K2;
        this.e = q9kVar2;
    }

    @Override // defpackage.fm8
    public final int a() {
        return 6000;
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
        if (!(obj instanceof elj)) {
            return false;
        }
        elj eljVar = (elj) obj;
        return this.a.equals(eljVar.a) && Intrinsics.c(this.b, eljVar.b) && this.c.equals(eljVar.c) && this.d.equals(eljVar.d) && this.e.equals(eljVar.e);
    }

    public final int hashCode() {
        return lnb.e(ljg.d(wv8.a(R.drawable.red_card_share_background, ljg.d(wv8.a(6000, dmi.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.c), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopEventsCard(title=");
        sb.append(this.a);
        sb.append(", events=");
        sb.append(this.b);
        sb.append(", durationMilliseconds=6000, contentGradient=");
        vxd.u(sb, this.c, ", backgroundResource=2131232883, borderContentGradient=", this.d, ", shareTitle=");
        sb.append(this.e);
        sb.append(", shareDescription=null)");
        return sb.toString();
    }
}
