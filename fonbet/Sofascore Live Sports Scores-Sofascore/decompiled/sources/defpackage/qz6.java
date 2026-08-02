package defpackage;

import com.sofascore.results.fantasy.competition.team.player.FantasyFootballPlayerMyTeamBottomSheet;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qz6 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ FantasyFootballPlayerMyTeamBottomSheet j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qz6(FantasyFootballPlayerMyTeamBottomSheet fantasyFootballPlayerMyTeamBottomSheet, int i) {
        super(0);
        this.i = i;
        this.j = fantasyFootballPlayerMyTeamBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        FantasyFootballPlayerMyTeamBottomSheet fantasyFootballPlayerMyTeamBottomSheet = this.j;
        switch (i) {
            case 0:
                return fantasyFootballPlayerMyTeamBottomSheet.requireActivity().getViewModelStore();
            case 1:
                return fantasyFootballPlayerMyTeamBottomSheet.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return fantasyFootballPlayerMyTeamBottomSheet.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
