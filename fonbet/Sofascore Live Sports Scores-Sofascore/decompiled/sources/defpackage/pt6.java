package defpackage;

import com.sofascore.results.fantasy.competition.team.FantasyCompetitionMyTeamFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pt6 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ FantasyCompetitionMyTeamFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pt6(FantasyCompetitionMyTeamFragment fantasyCompetitionMyTeamFragment, int i) {
        super(0);
        this.i = i;
        this.j = fantasyCompetitionMyTeamFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        FantasyCompetitionMyTeamFragment fantasyCompetitionMyTeamFragment = this.j;
        switch (i) {
            case 0:
                return fantasyCompetitionMyTeamFragment.requireActivity().getViewModelStore();
            case 1:
                return fantasyCompetitionMyTeamFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return fantasyCompetitionMyTeamFragment.requireActivity().getDefaultViewModelProviderFactory();
            case 3:
                return fantasyCompetitionMyTeamFragment.requireActivity().getViewModelStore();
            case 4:
                return fantasyCompetitionMyTeamFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 5:
                return fantasyCompetitionMyTeamFragment.requireActivity().getDefaultViewModelProviderFactory();
            case 6:
                return fantasyCompetitionMyTeamFragment.requireActivity().getViewModelStore();
            case 7:
                return fantasyCompetitionMyTeamFragment.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return fantasyCompetitionMyTeamFragment.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
