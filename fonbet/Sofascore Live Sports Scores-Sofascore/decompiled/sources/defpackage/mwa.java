package defpackage;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.league.fragment.events.LeagueEventsFragment;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class mwa implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LeagueEventsFragment b;

    public /* synthetic */ mwa(LeagueEventsFragment leagueEventsFragment, int i) {
        this.a = i;
        this.b = leagueEventsFragment;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        LeagueEventsFragment leagueEventsFragment = this.b;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                t6e t6eVar = (t6e) obj2;
                s6e s6eVar = (s6e) obj3;
                t6eVar.getClass();
                s6eVar.getClass();
                zwa G = leagueEventsFragment.G();
                xw3.L(un0.z(G), null, null, new z23(new uf8(21, leagueEventsFragment, s6eVar), G, t6eVar, intValue, (rq3) null, 11), 3);
                break;
            default:
                wt3.y((Integer) obj2, (View) obj, obj3);
                if (obj3 instanceof y21) {
                    wxf wxfVar = EventActivity.h0;
                    Context requireContext = leagueEventsFragment.requireContext();
                    requireContext.getClass();
                    y21 y21Var = (y21) obj3;
                    wxf.B(requireContext, y21Var.d().getId(), null, null, null, leagueEventsFragment.C().r ? o3a.F(y21Var.d().getTournament()) : null, 60);
                } else if (obj3 instanceof lrj) {
                    a99 a99Var = LeagueActivity.h0;
                    FragmentActivity requireActivity = leagueEventsFragment.requireActivity();
                    requireActivity.getClass();
                    Tournament tournament = ((lrj) obj3).a;
                    UniqueTournament uniqueTournament = tournament.getUniqueTournament();
                    Integer valueOf = uniqueTournament != null ? Integer.valueOf(uniqueTournament.getId()) : null;
                    Integer valueOf2 = Integer.valueOf(tournament.getId());
                    Season season = tournament.getSeason();
                    a99.A(a99Var, requireActivity, valueOf, valueOf2, season != null ? Integer.valueOf(season.getId()) : null, null, null, null, 4080);
                }
                break;
        }
        return Unit.a;
    }
}
