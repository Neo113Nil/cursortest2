package defpackage;

import com.sofascore.results.event.media.EventMediaFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class f36 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ EventMediaFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f36(EventMediaFragment eventMediaFragment, int i) {
        super(0);
        this.i = i;
        this.j = eventMediaFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        EventMediaFragment eventMediaFragment = this.j;
        switch (i) {
            case 0:
                return eventMediaFragment.requireActivity().getViewModelStore();
            case 1:
                return eventMediaFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return eventMediaFragment.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return eventMediaFragment;
        }
    }
}
