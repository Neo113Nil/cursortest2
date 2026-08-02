package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.R;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dlj implements fm8, rdh {
    public final q9k a;
    public final Event b;
    public final p9k c;
    public final gv9 d;
    public final gv9 e;
    public final p9k f;

    public dlj(q9k q9kVar, Event event, p9k p9kVar, p9k p9kVar2) {
        b7 K = l6g.K(new r13(hkg.d(4281535498L)), new r13(hkg.d(4288226077L)), new r13(hkg.d(4281535498L)));
        b7 K2 = l6g.K(new r13(hkg.d(4294916912L)), new r13(hkg.b(16726832)), new r13(hkg.d(4294916912L)));
        event.getClass();
        K.getClass();
        K2.getClass();
        this.a = q9kVar;
        this.b = event;
        this.c = p9kVar;
        this.d = K;
        this.e = K2;
        this.f = p9kVar2;
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
        if (!(obj instanceof dlj)) {
            return false;
        }
        dlj dljVar = (dlj) obj;
        return this.a.equals(dljVar.a) && Intrinsics.c(this.b, dljVar.b) && this.c.equals(dljVar.c) && this.d.equals(dljVar.d) && this.e.equals(dljVar.e) && this.f.equals(dljVar.f);
    }

    public final int hashCode() {
        return (this.f.hashCode() + ljg.d(wv8.a(R.drawable.red_card_share_background, ljg.d(wv8.a(5000, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31), 31, this.d), 31), 31, this.e)) * 31;
    }

    public final String toString() {
        return "TopEventCard(title=" + this.a + ", event=" + this.b + ", description=" + this.c + ", durationMilliseconds=5000, contentGradient=" + this.d + ", backgroundResource=2131232883, borderContentGradient=" + this.e + ", shareTitle=" + this.f + ", shareDescription=null)";
    }
}
