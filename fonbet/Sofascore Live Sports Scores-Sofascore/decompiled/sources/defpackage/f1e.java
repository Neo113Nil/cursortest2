package defpackage;

import com.sofascore.results.pots.highestRated.POTSHighestRatedPlayersFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class f1e extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ POTSHighestRatedPlayersFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1e(POTSHighestRatedPlayersFragment pOTSHighestRatedPlayersFragment, int i) {
        super(0);
        this.i = i;
        this.j = pOTSHighestRatedPlayersFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        POTSHighestRatedPlayersFragment pOTSHighestRatedPlayersFragment = this.j;
        switch (i) {
            case 0:
                return pOTSHighestRatedPlayersFragment.requireActivity().getViewModelStore();
            case 1:
                return pOTSHighestRatedPlayersFragment.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return pOTSHighestRatedPlayersFragment.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
