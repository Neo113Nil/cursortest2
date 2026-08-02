package defpackage;

import com.sofascore.results.profile.contributionScreen.ContributionPerformanceFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ds3 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ ContributionPerformanceFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ds3(ContributionPerformanceFragment contributionPerformanceFragment, int i) {
        super(0);
        this.i = i;
        this.j = contributionPerformanceFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        ContributionPerformanceFragment contributionPerformanceFragment = this.j;
        switch (i) {
            case 0:
                return contributionPerformanceFragment.requireActivity().getViewModelStore();
            case 1:
                return contributionPerformanceFragment.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return contributionPerformanceFragment.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
