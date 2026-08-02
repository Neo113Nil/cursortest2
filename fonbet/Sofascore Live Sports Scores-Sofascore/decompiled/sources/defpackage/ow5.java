package defpackage;

import com.sofascore.results.crowdsourcing.EventContributeFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ow5 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ EventContributeFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ow5(EventContributeFragment eventContributeFragment, int i) {
        super(0);
        this.i = i;
        this.j = eventContributeFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        EventContributeFragment eventContributeFragment = this.j;
        switch (i) {
            case 0:
                return eventContributeFragment.requireActivity().getViewModelStore();
            case 1:
                return eventContributeFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return eventContributeFragment.requireActivity().getDefaultViewModelProviderFactory();
            case 3:
                return eventContributeFragment.requireActivity().getViewModelStore();
            case 4:
                return eventContributeFragment.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return eventContributeFragment.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
