package defpackage;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.results.event.standings.EventStandingsFragment;
import com.sofascore.results.tracker.TrackerBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class xa6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventStandingsFragment b;

    public /* synthetic */ xa6(EventStandingsFragment eventStandingsFragment, int i) {
        this.a = i;
        this.b = eventStandingsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TrackerBottomSheet b;
        int i = this.a;
        EventStandingsFragment eventStandingsFragment = this.b;
        switch (i) {
            case 0:
                FragmentActivity requireActivity = eventStandingsFragment.requireActivity();
                requireActivity.getClass();
                return new jai(requireActivity, eventStandingsFragment.D().getSportSlug(), new ya6(eventStandingsFragment, 1), false, null, 120);
            case 1:
                Context requireContext = eventStandingsFragment.requireContext();
                requireContext.getClass();
                return new m0j(requireContext);
            default:
                Context requireContext2 = eventStandingsFragment.requireContext();
                requireContext2.getClass();
                juj jujVar = juj.a;
                int m = yid.m(o3a.F(eventStandingsFragment.D().getTournament()));
                Season season = eventStandingsFragment.D().getSeason();
                int m2 = yid.m(season != null ? Integer.valueOf(season.getId()) : null);
                Season season2 = eventStandingsFragment.D().getSeason();
                String year = season2 != null ? season2.getYear() : null;
                if (year == null) {
                    year = "";
                }
                b = bgf.b(juj.b, m, m2, year, "", "", (r13 & 64) != 0 ? null : Integer.valueOf(Event.getHomeTeam$default(eventStandingsFragment.D(), null, 1, null).getId()), (r13 & 128) != 0 ? null : Integer.valueOf(Event.getAwayTeam$default(eventStandingsFragment.D(), null, 1, null).getId()));
                if (requireContext2 instanceof csk) {
                    requireContext2 = ((csk) requireContext2).getBaseContext();
                }
                AppCompatActivity appCompatActivity = requireContext2 instanceof AppCompatActivity ? (AppCompatActivity) requireContext2 : null;
                if (appCompatActivity != null) {
                    wca.x(appCompatActivity.getLifecycle()).b(new r1(b, appCompatActivity, null, 3));
                }
                return Unit.a;
        }
    }
}
