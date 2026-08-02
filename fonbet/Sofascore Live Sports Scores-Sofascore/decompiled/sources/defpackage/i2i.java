package defpackage;

import com.sofascore.results.stagesport.fragments.team.constructor.StageConstructorDetailsFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class i2i extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ StageConstructorDetailsFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2i(StageConstructorDetailsFragment stageConstructorDetailsFragment, int i) {
        super(0);
        this.i = i;
        this.j = stageConstructorDetailsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        StageConstructorDetailsFragment stageConstructorDetailsFragment = this.j;
        switch (i) {
            case 0:
                return stageConstructorDetailsFragment.requireActivity().getViewModelStore();
            case 1:
                return stageConstructorDetailsFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return stageConstructorDetailsFragment.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return stageConstructorDetailsFragment;
        }
    }
}
