package defpackage;

import com.sofascore.results.mma.mainScreen.MmaEventsFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vlc extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ MmaEventsFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vlc(MmaEventsFragment mmaEventsFragment, int i) {
        super(0);
        this.i = i;
        this.j = mmaEventsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        MmaEventsFragment mmaEventsFragment = this.j;
        switch (i) {
            case 0:
                return mmaEventsFragment.requireActivity().getViewModelStore();
            case 1:
                return mmaEventsFragment.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return mmaEventsFragment.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
