package defpackage;

import com.sofascore.results.mma.mainScreen.MmaEventsWeekFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class imc extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ MmaEventsWeekFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ imc(MmaEventsWeekFragment mmaEventsWeekFragment, int i) {
        super(0);
        this.i = i;
        this.j = mmaEventsWeekFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        MmaEventsWeekFragment mmaEventsWeekFragment = this.j;
        switch (i) {
            case 0:
                return mmaEventsWeekFragment.requireActivity().getViewModelStore();
            case 1:
                return mmaEventsWeekFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return mmaEventsWeekFragment.requireActivity().getDefaultViewModelProviderFactory();
            case 3:
                return mmaEventsWeekFragment.requireActivity().getViewModelStore();
            case 4:
                return mmaEventsWeekFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 5:
                return mmaEventsWeekFragment.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return mmaEventsWeekFragment;
        }
    }
}
