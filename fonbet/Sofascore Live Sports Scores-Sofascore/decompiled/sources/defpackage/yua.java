package defpackage;

import com.sofascore.results.league.fragment.details.LeagueDetailsFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class yua extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ LeagueDetailsFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yua(LeagueDetailsFragment leagueDetailsFragment, int i) {
        super(0);
        this.i = i;
        this.j = leagueDetailsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        LeagueDetailsFragment leagueDetailsFragment = this.j;
        switch (i) {
            case 0:
                return leagueDetailsFragment.requireActivity().getViewModelStore();
            case 1:
                return leagueDetailsFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return leagueDetailsFragment.requireActivity().getDefaultViewModelProviderFactory();
            case 3:
                return leagueDetailsFragment.requireActivity().getViewModelStore();
            case 4:
                return leagueDetailsFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 5:
                return leagueDetailsFragment.requireActivity().getDefaultViewModelProviderFactory();
            case 6:
                return leagueDetailsFragment.requireActivity().getViewModelStore();
            case 7:
                return leagueDetailsFragment.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return leagueDetailsFragment.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
