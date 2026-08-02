package defpackage;

import com.sofascore.results.league.fragment.awards.LeagueAwardsFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dua extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ LeagueAwardsFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dua(LeagueAwardsFragment leagueAwardsFragment, int i) {
        super(0);
        this.i = i;
        this.j = leagueAwardsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        LeagueAwardsFragment leagueAwardsFragment = this.j;
        switch (i) {
            case 0:
                return leagueAwardsFragment.requireActivity().getViewModelStore();
            case 1:
                return leagueAwardsFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return leagueAwardsFragment.requireActivity().getDefaultViewModelProviderFactory();
            case 3:
                return leagueAwardsFragment.requireActivity().getViewModelStore();
            case 4:
                return leagueAwardsFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 5:
                return leagueAwardsFragment.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return leagueAwardsFragment;
        }
    }
}
