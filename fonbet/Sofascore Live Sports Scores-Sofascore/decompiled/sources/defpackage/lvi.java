package defpackage;

import com.sofascore.results.team.details.TeamDetailsFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class lvi extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ TeamDetailsFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lvi(TeamDetailsFragment teamDetailsFragment, int i) {
        super(0);
        this.i = i;
        this.j = teamDetailsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        TeamDetailsFragment teamDetailsFragment = this.j;
        switch (i) {
            case 0:
                return teamDetailsFragment.requireActivity().getViewModelStore();
            case 1:
                return teamDetailsFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return teamDetailsFragment.requireActivity().getDefaultViewModelProviderFactory();
            case 3:
                return teamDetailsFragment.requireActivity().getViewModelStore();
            case 4:
                return teamDetailsFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 5:
                return teamDetailsFragment.requireActivity().getDefaultViewModelProviderFactory();
            case 6:
                return teamDetailsFragment.requireActivity().getViewModelStore();
            case 7:
                return teamDetailsFragment.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return teamDetailsFragment.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
