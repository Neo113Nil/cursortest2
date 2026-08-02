package defpackage;

import com.sofascore.results.league.fragment.details.view.TournamentPreviousWinnersBottomSheet;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class orj extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ TournamentPreviousWinnersBottomSheet j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ orj(TournamentPreviousWinnersBottomSheet tournamentPreviousWinnersBottomSheet, int i) {
        super(0);
        this.i = i;
        this.j = tournamentPreviousWinnersBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        TournamentPreviousWinnersBottomSheet tournamentPreviousWinnersBottomSheet = this.j;
        switch (i) {
            case 0:
                return tournamentPreviousWinnersBottomSheet.requireActivity().getViewModelStore();
            case 1:
                return tournamentPreviousWinnersBottomSheet.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return tournamentPreviousWinnersBottomSheet.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
