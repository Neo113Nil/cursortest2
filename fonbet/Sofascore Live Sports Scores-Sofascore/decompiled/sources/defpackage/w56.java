package defpackage;

import com.sofascore.results.event.lineups.EventPreMatchLineupsFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class w56 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ EventPreMatchLineupsFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w56(EventPreMatchLineupsFragment eventPreMatchLineupsFragment, int i) {
        super(0);
        this.i = i;
        this.j = eventPreMatchLineupsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        EventPreMatchLineupsFragment eventPreMatchLineupsFragment = this.j;
        switch (i) {
            case 0:
                return eventPreMatchLineupsFragment.requireActivity().getViewModelStore();
            case 1:
                return eventPreMatchLineupsFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return eventPreMatchLineupsFragment.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return eventPreMatchLineupsFragment;
        }
    }
}
