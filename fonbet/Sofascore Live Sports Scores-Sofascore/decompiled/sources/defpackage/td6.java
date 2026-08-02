package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.bettingtips.DroppingOdds;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class td6 {
    public final Event a;
    public final lrj b;
    public final DroppingOdds c;

    public td6(Event event, lrj lrjVar, DroppingOdds droppingOdds) {
        this.a = event;
        this.b = lrjVar;
        this.c = droppingOdds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td6)) {
            return false;
        }
        td6 td6Var = (td6) obj;
        return this.a.equals(td6Var.a) && this.b.equals(td6Var.b) && Intrinsics.c(this.c, td6Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        DroppingOdds droppingOdds = this.c;
        return hashCode + (droppingOdds == null ? 0 : droppingOdds.hashCode());
    }

    public final String toString() {
        return "EventWithBettingOdds(event=" + this.a + ", tournament=" + this.b + ", droppingOdds=" + this.c + ")";
    }
}
