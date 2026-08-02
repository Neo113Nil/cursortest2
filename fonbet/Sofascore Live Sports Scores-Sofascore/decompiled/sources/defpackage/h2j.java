package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.local_persistance.BrandingTeam;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import com.sofascore.results.team.standings.TeamStandingsFragment;
import com.sofascore.results.tracker.TrackerBottomSheet;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class h2j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TeamStandingsFragment b;

    public /* synthetic */ h2j(TeamStandingsFragment teamStandingsFragment, int i) {
        this.a = i;
        this.b = teamStandingsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TrackerBottomSheet b;
        int i = this.a;
        TeamStandingsFragment teamStandingsFragment = this.b;
        switch (i) {
            case 0:
                LayoutInflater layoutInflater = teamStandingsFragment.getLayoutInflater();
                krk krkVar = teamStandingsFragment.l;
                krkVar.getClass();
                vxc a = vxc.a(layoutInflater.inflate(R.layout.multi_dropdown_layout, (ViewGroup) ((oo8) krkVar).d, false));
                a.e.setVisibility(8);
                ConstraintLayout constraintLayout = a.a;
                constraintLayout.getClass();
                ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                if (layoutParams == null) {
                    yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                Context requireContext = teamStandingsFragment.requireContext();
                requireContext.getClass();
                int s = ao2.s(4, requireContext);
                int marginStart = marginLayoutParams.getMarginStart();
                int i2 = marginLayoutParams.topMargin;
                int marginEnd = marginLayoutParams.getMarginEnd();
                marginLayoutParams.setMarginStart(marginStart);
                marginLayoutParams.topMargin = i2;
                marginLayoutParams.setMarginEnd(marginEnd);
                marginLayoutParams.bottomMargin = s;
                constraintLayout.setLayoutParams(marginLayoutParams);
                return a;
            case 1:
                UniqueTournament uniqueTournament = (UniqueTournament) ((eoh) teamStandingsFragment.z).getValue();
                Season season = (Season) ((eoh) teamStandingsFragment.A).getValue();
                if (uniqueTournament != null && season != null) {
                    Context requireContext2 = teamStandingsFragment.requireContext();
                    requireContext2.getClass();
                    juj jujVar = juj.a;
                    b = bgf.b(juj.b, uniqueTournament.getId(), season.getId(), season.getYear(), "", "", (r13 & 64) != 0 ? null : Integer.valueOf(teamStandingsFragment.D().getId()), (r13 & 128) != 0 ? null : null);
                    if (requireContext2 instanceof csk) {
                        requireContext2 = ((csk) requireContext2).getBaseContext();
                    }
                    AppCompatActivity appCompatActivity = requireContext2 instanceof AppCompatActivity ? (AppCompatActivity) requireContext2 : null;
                    if (appCompatActivity != null) {
                        wca.x(appCompatActivity.getLifecycle()).b(new r1(b, appCompatActivity, null, 3));
                    }
                }
                return Unit.a;
            case 2:
                Bundle requireArguments = teamStandingsFragment.requireArguments();
                requireArguments.getClass();
                Serializable M = gz8.M(requireArguments, "TEAM", Team.class);
                if (M != null) {
                    return (Team) M;
                }
                a70.p("Serializable TEAM not found");
                return null;
            case 3:
                Context requireContext3 = teamStandingsFragment.requireContext();
                requireContext3.getClass();
                return ccd.A(teamStandingsFragment.D().getId(), requireContext3);
            case 4:
                return Integer.valueOf(teamStandingsFragment.requireArguments().getInt("STATISTICS_TOURNAMENT_ID"));
            default:
                FragmentActivity requireActivity = teamStandingsFragment.requireActivity();
                requireActivity.getClass();
                return new jai(requireActivity, teamStandingsFragment.D().getSportSlug(), new i2j(teamStandingsFragment, 2), tz9.G((BrandingTeam) teamStandingsFragment.t.getValue()), null, 96);
        }
    }
}
