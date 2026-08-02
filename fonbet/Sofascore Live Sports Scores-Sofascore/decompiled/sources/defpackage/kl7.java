package defpackage;

import com.sofascore.results.fantasy.shared.FantasySubstitutionsSquadInfoDisplayModeBottomSheet;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class kl7 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ FantasySubstitutionsSquadInfoDisplayModeBottomSheet j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kl7(FantasySubstitutionsSquadInfoDisplayModeBottomSheet fantasySubstitutionsSquadInfoDisplayModeBottomSheet, int i) {
        super(0);
        this.i = i;
        this.j = fantasySubstitutionsSquadInfoDisplayModeBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        FantasySubstitutionsSquadInfoDisplayModeBottomSheet fantasySubstitutionsSquadInfoDisplayModeBottomSheet = this.j;
        switch (i) {
            case 0:
                return fantasySubstitutionsSquadInfoDisplayModeBottomSheet.requireActivity().getViewModelStore();
            case 1:
                return fantasySubstitutionsSquadInfoDisplayModeBottomSheet.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return fantasySubstitutionsSquadInfoDisplayModeBottomSheet.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
