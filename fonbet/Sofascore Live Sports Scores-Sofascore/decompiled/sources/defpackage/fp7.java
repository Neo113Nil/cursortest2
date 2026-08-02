package defpackage;

import com.sofascore.results.fantasy.walkthrough.createteam.FantasyWalkthroughCreateTeamFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fp7 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ FantasyWalkthroughCreateTeamFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fp7(FantasyWalkthroughCreateTeamFragment fantasyWalkthroughCreateTeamFragment, int i) {
        super(0);
        this.i = i;
        this.j = fantasyWalkthroughCreateTeamFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        FantasyWalkthroughCreateTeamFragment fantasyWalkthroughCreateTeamFragment = this.j;
        switch (i) {
            case 0:
                return fantasyWalkthroughCreateTeamFragment.requireActivity().getViewModelStore();
            case 1:
                return fantasyWalkthroughCreateTeamFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return fantasyWalkthroughCreateTeamFragment.requireActivity().getDefaultViewModelProviderFactory();
            case 3:
                return fantasyWalkthroughCreateTeamFragment.requireActivity().getViewModelStore();
            case 4:
                return fantasyWalkthroughCreateTeamFragment.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return fantasyWalkthroughCreateTeamFragment.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
