package defpackage;

import com.sofascore.results.fantasy.competition.leagues.FantasyCompetitionLeaguesFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class as6 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ FantasyCompetitionLeaguesFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ as6(FantasyCompetitionLeaguesFragment fantasyCompetitionLeaguesFragment, int i) {
        super(0);
        this.i = i;
        this.j = fantasyCompetitionLeaguesFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        FantasyCompetitionLeaguesFragment fantasyCompetitionLeaguesFragment = this.j;
        switch (i) {
            case 0:
                return fantasyCompetitionLeaguesFragment.requireActivity().getViewModelStore();
            case 1:
                return fantasyCompetitionLeaguesFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return fantasyCompetitionLeaguesFragment.requireActivity().getDefaultViewModelProviderFactory();
            case 3:
                return fantasyCompetitionLeaguesFragment.requireActivity().getViewModelStore();
            case 4:
                return fantasyCompetitionLeaguesFragment.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return fantasyCompetitionLeaguesFragment.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
