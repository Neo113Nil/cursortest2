package defpackage;

import com.sofascore.results.player.statistics.compare.search.CompareSearchBottomSheet;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class f63 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ CompareSearchBottomSheet j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f63(CompareSearchBottomSheet compareSearchBottomSheet, int i) {
        super(0);
        this.i = i;
        this.j = compareSearchBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        CompareSearchBottomSheet compareSearchBottomSheet = this.j;
        switch (i) {
            case 0:
                return compareSearchBottomSheet.requireActivity().getViewModelStore();
            case 1:
                return compareSearchBottomSheet.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return compareSearchBottomSheet.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return compareSearchBottomSheet;
        }
    }
}
