package defpackage;

import com.sofascore.model.network.response.Duel;
import com.sofascore.model.network.response.TeamStreaksResponse;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jy5 implements Serializable {
    public final TeamStreaksResponse a;
    public final Duel b;

    public jy5(TeamStreaksResponse teamStreaksResponse, Duel duel) {
        this.a = teamStreaksResponse;
        this.b = duel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jy5)) {
            return false;
        }
        jy5 jy5Var = (jy5) obj;
        return Intrinsics.c(this.a, jy5Var.a) && Intrinsics.c(this.b, jy5Var.b);
    }

    public final int hashCode() {
        TeamStreaksResponse teamStreaksResponse = this.a;
        int hashCode = (teamStreaksResponse == null ? 0 : teamStreaksResponse.hashCode()) * 31;
        Duel duel = this.b;
        return hashCode + (duel != null ? duel.hashCode() : 0);
    }

    public final String toString() {
        return "FeaturedOddsTeamData(streaks=" + this.a + ", duel=" + this.b + ")";
    }
}
