package defpackage;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.league.fragment.standings.LeagueStandingsFragment;
import com.sofascore.results.tracker.TrackerBottomSheet;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class oza implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LeagueStandingsFragment b;

    public /* synthetic */ oza(LeagueStandingsFragment leagueStandingsFragment, int i) {
        this.a = i;
        this.b = leagueStandingsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TrackerBottomSheet b;
        int i = this.a;
        int i2 = 3;
        LeagueStandingsFragment leagueStandingsFragment = this.b;
        switch (i) {
            case 0:
                UniqueTournament uniqueTournament = leagueStandingsFragment.E().getUniqueTournament();
                Season l = leagueStandingsFragment.C().l();
                if (uniqueTournament != null && l != null) {
                    Context requireContext = leagueStandingsFragment.requireContext();
                    requireContext.getClass();
                    juj jujVar = juj.a;
                    b = bgf.b(juj.b, uniqueTournament.getId(), l.getId(), l.getYear(), "", "", (r13 & 64) != 0 ? null : null, (r13 & 128) != 0 ? null : null);
                    if (requireContext instanceof csk) {
                        requireContext = ((csk) requireContext).getBaseContext();
                    }
                    AppCompatActivity appCompatActivity = requireContext instanceof AppCompatActivity ? (AppCompatActivity) requireContext : null;
                    if (appCompatActivity != null) {
                        wca.x(appCompatActivity.getLifecycle()).b(new r1(b, appCompatActivity, null, 3));
                    }
                }
                return Unit.a;
            case 1:
                Context requireContext2 = leagueStandingsFragment.requireContext();
                requireContext2.getClass();
                return new m0j(requireContext2);
            case 2:
                return leagueStandingsFragment.requireArguments().getString("POSITION_ON_GROUP");
            default:
                FragmentActivity requireActivity = leagueStandingsFragment.requireActivity();
                requireActivity.getClass();
                String slug = leagueStandingsFragment.E().getCategory().getSport().getSlug();
                boolean H = tz9.H(leagueStandingsFragment.C().q);
                hai[] haiVarArr = hai.a;
                return new jai(requireActivity, slug, new pza(leagueStandingsFragment, i2), H, a.c(3), 72);
        }
    }
}
