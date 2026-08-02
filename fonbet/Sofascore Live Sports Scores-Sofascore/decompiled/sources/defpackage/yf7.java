package defpackage;

import com.sofascore.results.fantasy.competition.leagues.bottomsheet.reorder.FantasyReorderLeaguesBottomSheet;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class yf7 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ FantasyReorderLeaguesBottomSheet j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yf7(FantasyReorderLeaguesBottomSheet fantasyReorderLeaguesBottomSheet, int i) {
        super(0);
        this.i = i;
        this.j = fantasyReorderLeaguesBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        FantasyReorderLeaguesBottomSheet fantasyReorderLeaguesBottomSheet = this.j;
        switch (i) {
            case 0:
                return fantasyReorderLeaguesBottomSheet.requireActivity().getViewModelStore();
            case 1:
                return fantasyReorderLeaguesBottomSheet.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return fantasyReorderLeaguesBottomSheet.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
