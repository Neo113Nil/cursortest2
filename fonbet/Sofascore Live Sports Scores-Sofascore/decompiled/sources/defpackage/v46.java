package defpackage;

import com.sofascore.results.event.overs.EventOversFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class v46 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ EventOversFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v46(EventOversFragment eventOversFragment, int i) {
        super(0);
        this.i = i;
        this.j = eventOversFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        EventOversFragment eventOversFragment = this.j;
        switch (i) {
            case 0:
                return eventOversFragment.requireActivity().getViewModelStore();
            case 1:
                return eventOversFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return eventOversFragment.requireActivity().getDefaultViewModelProviderFactory();
            case 3:
                return eventOversFragment.requireActivity().getViewModelStore();
            case 4:
                return eventOversFragment.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return eventOversFragment.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
