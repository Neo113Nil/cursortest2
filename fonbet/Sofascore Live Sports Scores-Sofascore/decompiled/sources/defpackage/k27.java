package defpackage;

import com.sofascore.results.fantasy.competition.leagues.bottomsheet.FantasyJoinLeagueBottomSheet;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class k27 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ FantasyJoinLeagueBottomSheet j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k27(FantasyJoinLeagueBottomSheet fantasyJoinLeagueBottomSheet, int i) {
        super(0);
        this.i = i;
        this.j = fantasyJoinLeagueBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        FantasyJoinLeagueBottomSheet fantasyJoinLeagueBottomSheet = this.j;
        switch (i) {
            case 0:
                return fantasyJoinLeagueBottomSheet.requireActivity().getViewModelStore();
            case 1:
                return fantasyJoinLeagueBottomSheet.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return fantasyJoinLeagueBottomSheet.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return fantasyJoinLeagueBottomSheet;
        }
    }
}
