package defpackage;

import com.sofascore.results.main.AbstractFadingFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class j3 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ AbstractFadingFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j3(AbstractFadingFragment abstractFadingFragment, int i) {
        super(0);
        this.i = i;
        this.j = abstractFadingFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        AbstractFadingFragment abstractFadingFragment = this.j;
        switch (i) {
            case 0:
                return abstractFadingFragment.requireActivity().getViewModelStore();
            case 1:
                return abstractFadingFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return abstractFadingFragment.requireActivity().getDefaultViewModelProviderFactory();
            case 3:
                return abstractFadingFragment.requireActivity().getViewModelStore();
            case 4:
                return abstractFadingFragment.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return abstractFadingFragment.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
