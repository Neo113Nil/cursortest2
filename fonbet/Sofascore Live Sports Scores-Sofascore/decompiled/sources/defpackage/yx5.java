package defpackage;

import com.sofascore.results.event.details.EventDetailsFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class yx5 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ EventDetailsFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yx5(EventDetailsFragment eventDetailsFragment, int i) {
        super(0);
        this.i = i;
        this.j = eventDetailsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        EventDetailsFragment eventDetailsFragment = this.j;
        switch (i) {
            case 0:
                return eventDetailsFragment.requireActivity().getViewModelStore();
            case 1:
                return eventDetailsFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return eventDetailsFragment.requireActivity().getDefaultViewModelProviderFactory();
            case 3:
                return eventDetailsFragment.requireActivity().getViewModelStore();
            case 4:
                return eventDetailsFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 5:
                return eventDetailsFragment.requireActivity().getDefaultViewModelProviderFactory();
            case 6:
                return eventDetailsFragment.requireActivity().getViewModelStore();
            case 7:
                return eventDetailsFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 8:
                return eventDetailsFragment.requireActivity().getDefaultViewModelProviderFactory();
            case 9:
                return eventDetailsFragment.requireActivity().getViewModelStore();
            case 10:
                return eventDetailsFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 11:
                return eventDetailsFragment.requireActivity().getDefaultViewModelProviderFactory();
            case 12:
            case 13:
            default:
                return eventDetailsFragment;
        }
    }
}
