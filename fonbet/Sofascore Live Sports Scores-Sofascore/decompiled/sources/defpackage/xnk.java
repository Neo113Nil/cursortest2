package defpackage;

import com.sofascore.results.venue.summary.VenueSummaryFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xnk extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ VenueSummaryFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xnk(VenueSummaryFragment venueSummaryFragment, int i) {
        super(0);
        this.i = i;
        this.j = venueSummaryFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        VenueSummaryFragment venueSummaryFragment = this.j;
        switch (i) {
            case 0:
                return venueSummaryFragment.requireActivity().getViewModelStore();
            case 1:
                return venueSummaryFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return venueSummaryFragment.requireActivity().getDefaultViewModelProviderFactory();
            case 3:
                return venueSummaryFragment.requireActivity().getViewModelStore();
            case 4:
                return venueSummaryFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 5:
                return venueSummaryFragment.requireActivity().getDefaultViewModelProviderFactory();
            case 6:
                return venueSummaryFragment.requireActivity().getViewModelStore();
            case 7:
                return venueSummaryFragment.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return venueSummaryFragment.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
