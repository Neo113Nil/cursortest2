package defpackage;

import com.sofascore.results.fantasy.competition.selector.FantasyCompetitionSelectorBottomSheet;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class su6 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ FantasyCompetitionSelectorBottomSheet j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ su6(FantasyCompetitionSelectorBottomSheet fantasyCompetitionSelectorBottomSheet, int i) {
        super(0);
        this.i = i;
        this.j = fantasyCompetitionSelectorBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        FantasyCompetitionSelectorBottomSheet fantasyCompetitionSelectorBottomSheet = this.j;
        switch (i) {
            case 0:
                return fantasyCompetitionSelectorBottomSheet.requireActivity().getViewModelStore();
            case 1:
                return fantasyCompetitionSelectorBottomSheet.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return fantasyCompetitionSelectorBottomSheet.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return fantasyCompetitionSelectorBottomSheet;
        }
    }
}
