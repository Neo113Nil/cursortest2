package defpackage;

import com.sofascore.results.stagesport.fragments.team.AbstractStageTeamCareerFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class z7 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ AbstractStageTeamCareerFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z7(AbstractStageTeamCareerFragment abstractStageTeamCareerFragment, int i) {
        super(0);
        this.i = i;
        this.j = abstractStageTeamCareerFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        AbstractStageTeamCareerFragment abstractStageTeamCareerFragment = this.j;
        switch (i) {
            case 0:
                return abstractStageTeamCareerFragment.requireActivity().getViewModelStore();
            case 1:
                return abstractStageTeamCareerFragment.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return abstractStageTeamCareerFragment.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
