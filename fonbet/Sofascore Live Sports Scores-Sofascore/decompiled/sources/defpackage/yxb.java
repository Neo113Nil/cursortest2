package defpackage;

import com.sofascore.results.main.matches.redesign.filter.MatchesFilterBottomSheetDialog;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class yxb extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ MatchesFilterBottomSheetDialog j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yxb(MatchesFilterBottomSheetDialog matchesFilterBottomSheetDialog, int i) {
        super(0);
        this.i = i;
        this.j = matchesFilterBottomSheetDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        MatchesFilterBottomSheetDialog matchesFilterBottomSheetDialog = this.j;
        switch (i) {
            case 0:
                return matchesFilterBottomSheetDialog.requireActivity().getViewModelStore();
            case 1:
                return matchesFilterBottomSheetDialog.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return matchesFilterBottomSheetDialog.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return matchesFilterBottomSheetDialog;
        }
    }
}
