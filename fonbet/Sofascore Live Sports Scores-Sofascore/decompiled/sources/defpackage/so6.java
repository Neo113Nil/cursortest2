package defpackage;

import com.sofascore.results.fantasy.comparison.selectplayer.FantasyComparisonPlayersDialogFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class so6 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ FantasyComparisonPlayersDialogFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ so6(FantasyComparisonPlayersDialogFragment fantasyComparisonPlayersDialogFragment, int i) {
        super(0);
        this.i = i;
        this.j = fantasyComparisonPlayersDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        FantasyComparisonPlayersDialogFragment fantasyComparisonPlayersDialogFragment = this.j;
        switch (i) {
            case 0:
                return fantasyComparisonPlayersDialogFragment.requireActivity().getViewModelStore();
            case 1:
                return fantasyComparisonPlayersDialogFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return fantasyComparisonPlayersDialogFragment.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return fantasyComparisonPlayersDialogFragment;
        }
    }
}
