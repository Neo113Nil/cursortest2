package defpackage;

import com.sofascore.results.event.odds.additionalodds.AdditionalOddsFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jj extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ AdditionalOddsFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jj(AdditionalOddsFragment additionalOddsFragment, int i) {
        super(0);
        this.i = i;
        this.j = additionalOddsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        AdditionalOddsFragment additionalOddsFragment = this.j;
        switch (i) {
            case 0:
                return additionalOddsFragment.requireActivity().getViewModelStore();
            case 1:
                return additionalOddsFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return additionalOddsFragment.requireActivity().getDefaultViewModelProviderFactory();
            case 3:
                return additionalOddsFragment.requireActivity().getViewModelStore();
            case 4:
                return additionalOddsFragment.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return additionalOddsFragment.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
