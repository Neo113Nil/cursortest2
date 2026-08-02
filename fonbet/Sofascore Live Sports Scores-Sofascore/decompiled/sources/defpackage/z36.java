package defpackage;

import com.sofascore.results.event.mmastatistics.EventMmaStatisticsFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class z36 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ EventMmaStatisticsFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z36(EventMmaStatisticsFragment eventMmaStatisticsFragment, int i) {
        super(0);
        this.i = i;
        this.j = eventMmaStatisticsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        EventMmaStatisticsFragment eventMmaStatisticsFragment = this.j;
        switch (i) {
            case 0:
                return eventMmaStatisticsFragment.requireActivity().getViewModelStore();
            case 1:
                return eventMmaStatisticsFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return eventMmaStatisticsFragment.requireActivity().getDefaultViewModelProviderFactory();
            case 3:
                return eventMmaStatisticsFragment.requireActivity().getViewModelStore();
            case 4:
                return eventMmaStatisticsFragment.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return eventMmaStatisticsFragment.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
