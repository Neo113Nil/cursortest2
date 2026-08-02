package defpackage;

import com.sofascore.results.pots.highestRated.bottomSheet.POTSHighestRatedPlayersFilterBottomSheet;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class x0e extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ POTSHighestRatedPlayersFilterBottomSheet j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0e(POTSHighestRatedPlayersFilterBottomSheet pOTSHighestRatedPlayersFilterBottomSheet, int i) {
        super(0);
        this.i = i;
        this.j = pOTSHighestRatedPlayersFilterBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        POTSHighestRatedPlayersFilterBottomSheet pOTSHighestRatedPlayersFilterBottomSheet = this.j;
        switch (i) {
            case 0:
                return pOTSHighestRatedPlayersFilterBottomSheet.requireActivity().getViewModelStore();
            case 1:
                return pOTSHighestRatedPlayersFilterBottomSheet.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return pOTSHighestRatedPlayersFilterBottomSheet.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return pOTSHighestRatedPlayersFilterBottomSheet;
        }
    }
}
