package defpackage;

import com.sofascore.results.main.fantasy.center.elitefaceoff.FantasyEliteFaceoffIntroBottomSheet;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class iw6 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ FantasyEliteFaceoffIntroBottomSheet j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iw6(FantasyEliteFaceoffIntroBottomSheet fantasyEliteFaceoffIntroBottomSheet, int i) {
        super(0);
        this.i = i;
        this.j = fantasyEliteFaceoffIntroBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        FantasyEliteFaceoffIntroBottomSheet fantasyEliteFaceoffIntroBottomSheet = this.j;
        switch (i) {
            case 0:
                return fantasyEliteFaceoffIntroBottomSheet.requireActivity().getViewModelStore();
            case 1:
                return fantasyEliteFaceoffIntroBottomSheet.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return fantasyEliteFaceoffIntroBottomSheet.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return fantasyEliteFaceoffIntroBottomSheet;
        }
    }
}
