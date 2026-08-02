package defpackage;

import com.sofascore.results.league.fragment.details.compose.goat.LeagueGoatVoteBottomSheet;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hxa extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ LeagueGoatVoteBottomSheet j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hxa(LeagueGoatVoteBottomSheet leagueGoatVoteBottomSheet, int i) {
        super(0);
        this.i = i;
        this.j = leagueGoatVoteBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        LeagueGoatVoteBottomSheet leagueGoatVoteBottomSheet = this.j;
        switch (i) {
            case 0:
                return leagueGoatVoteBottomSheet.requireActivity().getViewModelStore();
            case 1:
                return leagueGoatVoteBottomSheet.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return leagueGoatVoteBottomSheet.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
