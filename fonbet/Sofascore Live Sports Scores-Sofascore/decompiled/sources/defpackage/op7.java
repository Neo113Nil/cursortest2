package defpackage;

import com.sofascore.results.fantasy.walkthrough.createteam.selectreplacement.FantasyWalkthroughSelectReplacementDialogFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class op7 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ FantasyWalkthroughSelectReplacementDialogFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ op7(FantasyWalkthroughSelectReplacementDialogFragment fantasyWalkthroughSelectReplacementDialogFragment, int i) {
        super(0);
        this.i = i;
        this.j = fantasyWalkthroughSelectReplacementDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        FantasyWalkthroughSelectReplacementDialogFragment fantasyWalkthroughSelectReplacementDialogFragment = this.j;
        switch (i) {
            case 0:
                return fantasyWalkthroughSelectReplacementDialogFragment.requireActivity().getViewModelStore();
            case 1:
                return fantasyWalkthroughSelectReplacementDialogFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return fantasyWalkthroughSelectReplacementDialogFragment.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return fantasyWalkthroughSelectReplacementDialogFragment;
        }
    }
}
