package defpackage;

import com.sofascore.results.event.EventActivity;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.team.TeamActivity;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class x0f extends j1f {
    public final fv h;
    public final bef i;

    public x0f(fv fvVar, bef befVar) {
        super("Promotion modal", j7f.c, new jie(25), b.j(LeagueActivity.class, TeamActivity.class, PlayerActivity.class, EventActivity.class), null, null, 112);
        this.h = fvVar;
        this.i = befVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0f)) {
            return false;
        }
        x0f x0fVar = (x0f) obj;
        return this.h == x0fVar.h && this.i == x0fVar.i;
    }

    public final int hashCode() {
        return this.i.hashCode() + (this.h.hashCode() * 31);
    }

    public final String toString() {
        return "PromotionModal(analyticsLocation=" + this.h + ", promotionalOffer=" + this.i + ")";
    }
}
