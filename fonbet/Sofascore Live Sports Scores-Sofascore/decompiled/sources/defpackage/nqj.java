package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.R;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class nqj implements fm8, rdh {
    public final p9k a;
    public final int b;
    public final Event c;
    public final int d;
    public final gv9 e;
    public final gv9 f;
    public final p9k g;
    public final q9k h;

    public nqj(p9k p9kVar, int i, Event event, int i2, p9k p9kVar2, q9k q9kVar) {
        b7 K = l6g.K(new r13(hkg.d(4281541120L)), new r13(hkg.d(4291593728L)), new r13(hkg.d(4281541120L)));
        b7 K2 = l6g.K(new r13(hkg.d(4294944768L)), new r13(hkg.b(16754688)), new r13(hkg.d(4281541120L)));
        event.getClass();
        K.getClass();
        K2.getClass();
        this.a = p9kVar;
        this.b = i;
        this.c = event;
        this.d = i2;
        this.e = K;
        this.f = K2;
        this.g = p9kVar2;
        this.h = q9kVar;
    }

    @Override // defpackage.fm8
    public final int a() {
        return 5000;
    }

    @Override // defpackage.rdh
    public final gv9 b() {
        return this.f;
    }

    @Override // defpackage.rdh
    public final int c() {
        return R.drawable.anomaly_card_share_background;
    }

    @Override // defpackage.rdh
    public final gv9 d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nqj)) {
            return false;
        }
        nqj nqjVar = (nqj) obj;
        return this.a.equals(nqjVar.a) && this.b == nqjVar.b && Intrinsics.c(this.c, nqjVar.c) && this.d == nqjVar.d && this.e.equals(nqjVar.e) && this.f.equals(nqjVar.f) && this.g.equals(nqjVar.g) && this.h.equals(nqjVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ljg.d(wv8.a(R.drawable.anomaly_card_share_background, ljg.d(wv8.a(5000, wv8.a(this.d, (this.c.hashCode() + wv8.a(this.b, this.a.hashCode() * 31, 31)) * 31, 31), 31), 31, this.e), 31), 31, this.f)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TorneoEventsCard(title=");
        sb.append(this.a);
        sb.append(", eventsEnteredNumber=");
        sb.append(this.b);
        sb.append(", mostPopularEvent=");
        sb.append(this.c);
        sb.append(", mostPopularEventViews=");
        sb.append(this.d);
        sb.append(", durationMilliseconds=5000, contentGradient=");
        vxd.u(sb, this.e, ", backgroundResource=2131231067, borderContentGradient=", this.f, ", shareTitle=");
        sb.append(this.g);
        sb.append(", shareDescription=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
