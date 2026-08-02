package defpackage;

import com.sofascore.results.fantasy.league.details.FantasyLeagueDetailsFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class y37 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ FantasyLeagueDetailsFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y37(FantasyLeagueDetailsFragment fantasyLeagueDetailsFragment, int i) {
        super(0);
        this.i = i;
        this.j = fantasyLeagueDetailsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        FantasyLeagueDetailsFragment fantasyLeagueDetailsFragment = this.j;
        switch (i) {
            case 0:
                return fantasyLeagueDetailsFragment.requireActivity().getViewModelStore();
            case 1:
                return fantasyLeagueDetailsFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return fantasyLeagueDetailsFragment.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return fantasyLeagueDetailsFragment;
        }
    }
}
