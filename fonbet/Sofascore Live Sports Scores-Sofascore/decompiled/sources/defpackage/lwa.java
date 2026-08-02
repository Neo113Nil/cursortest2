package defpackage;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.league.fragment.events.LeagueEventsFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class lwa implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LeagueEventsFragment b;

    public /* synthetic */ lwa(LeagueEventsFragment leagueEventsFragment, int i) {
        this.a = i;
        this.b = leagueEventsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        LeagueEventsFragment leagueEventsFragment = this.b;
        switch (i) {
            case 0:
                FragmentActivity requireActivity = leagueEventsFragment.requireActivity();
                requireActivity.getClass();
                return new kwa(requireActivity, leagueEventsFragment.F(), leagueEventsFragment, leagueEventsFragment.C().s ? null : wv8.o(SearchResponseKt.SPORT_ENTITY, leagueEventsFragment.F()));
            case 1:
                leagueEventsFragment.n();
                return Unit.a;
            case 2:
                return Boolean.valueOf(tz9.H(leagueEventsFragment.C().q));
            case 3:
                return new u6e(leagueEventsFragment.D(), true, new mwa(leagueEventsFragment, 0));
            default:
                Context requireContext = leagueEventsFragment.requireContext();
                requireContext.getClass();
                return new twa(requireContext);
        }
    }
}
