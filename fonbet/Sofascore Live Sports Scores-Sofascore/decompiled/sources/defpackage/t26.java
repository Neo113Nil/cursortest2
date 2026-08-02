package defpackage;

import com.sofascore.results.event.matches.EventMatchesFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class t26 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ EventMatchesFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t26(EventMatchesFragment eventMatchesFragment, int i) {
        super(0);
        this.i = i;
        this.j = eventMatchesFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        EventMatchesFragment eventMatchesFragment = this.j;
        switch (i) {
            case 0:
                return eventMatchesFragment.requireActivity().getViewModelStore();
            case 1:
                return eventMatchesFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return eventMatchesFragment.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return eventMatchesFragment;
        }
    }
}
