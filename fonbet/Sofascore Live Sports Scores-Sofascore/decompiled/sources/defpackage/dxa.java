package defpackage;

import com.sofascore.results.league.fragment.details.compose.goat.LeagueGoatFullPlayersBottomSheet;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dxa extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ LeagueGoatFullPlayersBottomSheet j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dxa(LeagueGoatFullPlayersBottomSheet leagueGoatFullPlayersBottomSheet, int i) {
        super(0);
        this.i = i;
        this.j = leagueGoatFullPlayersBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        LeagueGoatFullPlayersBottomSheet leagueGoatFullPlayersBottomSheet = this.j;
        switch (i) {
            case 0:
                return leagueGoatFullPlayersBottomSheet.requireActivity().getViewModelStore();
            case 1:
                return leagueGoatFullPlayersBottomSheet.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return leagueGoatFullPlayersBottomSheet.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
