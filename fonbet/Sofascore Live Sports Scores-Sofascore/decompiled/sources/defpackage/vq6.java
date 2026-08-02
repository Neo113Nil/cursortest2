package defpackage;

import com.sofascore.results.fantasy.competition.home.FantasyCompetitionHomeFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vq6 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ FantasyCompetitionHomeFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vq6(FantasyCompetitionHomeFragment fantasyCompetitionHomeFragment, int i) {
        super(0);
        this.i = i;
        this.j = fantasyCompetitionHomeFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        FantasyCompetitionHomeFragment fantasyCompetitionHomeFragment = this.j;
        switch (i) {
            case 0:
                return fantasyCompetitionHomeFragment.requireActivity().getViewModelStore();
            case 1:
                return fantasyCompetitionHomeFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return fantasyCompetitionHomeFragment.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return fantasyCompetitionHomeFragment;
        }
    }
}
