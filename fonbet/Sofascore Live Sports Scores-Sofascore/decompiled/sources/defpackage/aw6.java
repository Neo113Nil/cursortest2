package defpackage;

import com.sofascore.results.fantasy.league.settings.bottomsheet.edit.FantasyEditLeagueBottomSheet;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class aw6 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ FantasyEditLeagueBottomSheet j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aw6(FantasyEditLeagueBottomSheet fantasyEditLeagueBottomSheet, int i) {
        super(0);
        this.i = i;
        this.j = fantasyEditLeagueBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        FantasyEditLeagueBottomSheet fantasyEditLeagueBottomSheet = this.j;
        switch (i) {
            case 0:
                return fantasyEditLeagueBottomSheet.requireActivity().getViewModelStore();
            case 1:
                return fantasyEditLeagueBottomSheet.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return fantasyEditLeagueBottomSheet.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return fantasyEditLeagueBottomSheet;
        }
    }
}
