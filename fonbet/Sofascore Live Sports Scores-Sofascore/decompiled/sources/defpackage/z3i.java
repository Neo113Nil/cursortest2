package defpackage;

import com.sofascore.results.stagesport.fragments.details.StageDetailsResultsFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class z3i extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ StageDetailsResultsFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z3i(StageDetailsResultsFragment stageDetailsResultsFragment, int i) {
        super(0);
        this.i = i;
        this.j = stageDetailsResultsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        StageDetailsResultsFragment stageDetailsResultsFragment = this.j;
        switch (i) {
            case 0:
                return stageDetailsResultsFragment.requireActivity().getViewModelStore();
            case 1:
                return stageDetailsResultsFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return stageDetailsResultsFragment.requireActivity().getDefaultViewModelProviderFactory();
            case 3:
                return stageDetailsResultsFragment.requireActivity().getViewModelStore();
            case 4:
                return stageDetailsResultsFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 5:
                return stageDetailsResultsFragment.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return stageDetailsResultsFragment;
        }
    }
}
