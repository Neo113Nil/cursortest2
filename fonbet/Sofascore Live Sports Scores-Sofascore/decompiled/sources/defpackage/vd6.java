package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.network.response.Odds;
import com.sofascore.model.odds.ProviderOdds;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vd6 {
    public final Event a;
    public final lrj b;
    public final ProviderOdds c;
    public final Odds d;

    public vd6(Event event, lrj lrjVar, ProviderOdds providerOdds, Odds odds) {
        this.a = event;
        this.b = lrjVar;
        this.c = providerOdds;
        this.d = odds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd6)) {
            return false;
        }
        vd6 vd6Var = (vd6) obj;
        return this.a.equals(vd6Var.a) && this.b.equals(vd6Var.b) && Intrinsics.c(this.c, vd6Var.c) && Intrinsics.c(this.d, vd6Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ProviderOdds providerOdds = this.c;
        int hashCode2 = (hashCode + (providerOdds == null ? 0 : providerOdds.hashCode())) * 31;
        Odds odds = this.d;
        return hashCode2 + (odds != null ? odds.hashCode() : 0);
    }

    public final String toString() {
        return "EventWithOddsAndWinningOdds(event=" + this.a + ", tournament=" + this.b + ", odds=" + this.c + ", winningOdds=" + this.d + ")";
    }
}
