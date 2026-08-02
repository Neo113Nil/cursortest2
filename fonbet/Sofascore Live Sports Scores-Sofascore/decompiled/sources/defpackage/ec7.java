package defpackage;

import com.sofascore.results.fantasy.transfers.model.FantasyTransferPlayers;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ec7 {
    public final List a;
    public final List b;
    public final FantasyTransferPlayers c;
    public final Float d;
    public final int e;

    public ec7(List list, List list2, FantasyTransferPlayers fantasyTransferPlayers, Float f, int i) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
        this.c = fantasyTransferPlayers;
        this.d = f;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec7)) {
            return false;
        }
        ec7 ec7Var = (ec7) obj;
        return Intrinsics.c(this.a, ec7Var.a) && Intrinsics.c(this.b, ec7Var.b) && Intrinsics.c(this.c, ec7Var.c) && this.d.equals(ec7Var.d) && this.e == ec7Var.e;
    }

    public final int hashCode() {
        int d = dmi.d(this.a.hashCode() * 31, 31, this.b);
        FantasyTransferPlayers fantasyTransferPlayers = this.c;
        return Integer.hashCode(this.e) + ((this.d.hashCode() + ((d + (fantasyTransferPlayers == null ? 0 : fantasyTransferPlayers.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder s = fc6.s("FantasyOptimiseSquadState(optimisedSquad=", ", substitutions=", ", captainSubstitution=", this.a, this.b);
        s.append(this.c);
        s.append(", totalExpectedPointsIncrease=");
        s.append(this.d);
        s.append(", changes=");
        return fc6.h(this.e, ")", s);
    }
}
