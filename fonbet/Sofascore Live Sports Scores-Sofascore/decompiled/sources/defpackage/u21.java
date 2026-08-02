package defpackage;

import com.sofascore.results.event.lineups.BaseEventLineupsFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class u21 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ BaseEventLineupsFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u21(BaseEventLineupsFragment baseEventLineupsFragment, int i) {
        super(0);
        this.i = i;
        this.j = baseEventLineupsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        BaseEventLineupsFragment baseEventLineupsFragment = this.j;
        switch (i) {
            case 0:
                return baseEventLineupsFragment.requireActivity().getViewModelStore();
            case 1:
                return baseEventLineupsFragment.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return baseEventLineupsFragment.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
