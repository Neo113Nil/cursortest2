package defpackage;

import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.hockeyplaybyplay.HockeyIncident;
import com.sofascore.results.R;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class sd9 extends p8 {
    public final Event c;
    public final sl6 d;
    public Team e;
    public Team f;
    public boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd9(View view, Event event, sl6 sl6Var) {
        super(view);
        view.getClass();
        event.getClass();
        sl6Var.getClass();
        this.c = event;
        this.d = sl6Var;
        this.g = true;
    }

    public static String d(Player player, boolean z) {
        String t;
        StringBuilder sb = new StringBuilder();
        if (!z || (t = tba.C(player)) == null) {
            t = tba.t(player);
        }
        sb.append(t);
        if (player.getJerseyNumber() != null) {
            sb.append(" #" + player.getJerseyNumber());
        }
        return sb.toString();
    }

    @Override // defpackage.p8
    public final void a(Object obj) {
        obj.getClass();
        if (obj instanceof d16) {
            h();
        }
    }

    public final String e(HockeyIncident hockeyIncident) {
        String p;
        p = mx9.p(this.b, Sports.ICE_HOCKEY, hockeyIncident.getTime(), null, (r16 & 16) != 0 ? null : null, (r16 & 32) != 0 ? null : null, (r16 & 64) != 0 ? null : Integer.valueOf(hockeyIncident.getReversedPeriodTimeSeconds()), null);
        return p;
    }

    public abstract MaterialCardView f();

    public void g(HockeyIncident hockeyIncident) {
        Pair<Team, Team> teams = hockeyIncident.getTeams(this.c);
        Team team = (Team) teams.a;
        Team team2 = (Team) teams.b;
        this.e = team;
        this.f = team2;
        Boolean isHome = hockeyIncident.getIsHome();
        this.g = isHome != null ? isHome.booleanValue() : true;
        h();
    }

    public final void h() {
        f().setStrokeColor(((Number) this.d.a).intValue() == getAbsoluteAdapterPosition() ? this.b.getColor(this.g ? R.color.secondary_default : R.color.primary_default) : 0);
    }
}
