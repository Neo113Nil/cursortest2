package defpackage;

import com.sofascore.results.league.fragment.details.compose.LeaguePlayerUpdatesBottomSheet;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mya extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ LeaguePlayerUpdatesBottomSheet j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mya(LeaguePlayerUpdatesBottomSheet leaguePlayerUpdatesBottomSheet, int i) {
        super(0);
        this.i = i;
        this.j = leaguePlayerUpdatesBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        LeaguePlayerUpdatesBottomSheet leaguePlayerUpdatesBottomSheet = this.j;
        switch (i) {
            case 0:
                return leaguePlayerUpdatesBottomSheet.requireActivity().getViewModelStore();
            case 1:
                return leaguePlayerUpdatesBottomSheet.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return leaguePlayerUpdatesBottomSheet.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
