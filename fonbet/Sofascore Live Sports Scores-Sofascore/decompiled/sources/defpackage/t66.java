package defpackage;

import com.sofascore.results.event.scorecard.EventScorecardFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class t66 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ EventScorecardFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t66(EventScorecardFragment eventScorecardFragment, int i) {
        super(0);
        this.i = i;
        this.j = eventScorecardFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        EventScorecardFragment eventScorecardFragment = this.j;
        switch (i) {
            case 0:
                return eventScorecardFragment.requireActivity().getViewModelStore();
            case 1:
                return eventScorecardFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return eventScorecardFragment.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return eventScorecardFragment;
        }
    }
}
