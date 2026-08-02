package defpackage;

import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.team.TeamActivity;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class y0f extends j1f {
    public final int h;
    public final qef i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0f(int i, qef qefVar) {
        super("Propose Follow Entity", j7f.c, new jie(26), b.j(LeagueActivity.class, TeamActivity.class, PlayerActivity.class), null, null, 112);
        qefVar.getClass();
        this.h = i;
        this.i = qefVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0f)) {
            return false;
        }
        y0f y0fVar = (y0f) obj;
        return this.h == y0fVar.h && this.i == y0fVar.i;
    }

    public final int hashCode() {
        return this.i.hashCode() + (Integer.hashCode(this.h) * 31);
    }

    public final String toString() {
        return "ProposeFollowEntity(id=" + this.h + ", entityType=" + this.i + ")";
    }
}
