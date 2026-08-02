package defpackage;

import com.sofascore.results.bettingtips.fragment.AbstractBettingTipsFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class a1 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ AbstractBettingTipsFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(AbstractBettingTipsFragment abstractBettingTipsFragment, int i) {
        super(0);
        this.i = i;
        this.j = abstractBettingTipsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        AbstractBettingTipsFragment abstractBettingTipsFragment = this.j;
        switch (i) {
            case 0:
                return abstractBettingTipsFragment.requireActivity().getViewModelStore();
            case 1:
                return abstractBettingTipsFragment.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return abstractBettingTipsFragment.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
