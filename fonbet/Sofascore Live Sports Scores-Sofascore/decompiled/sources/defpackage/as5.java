package defpackage;

import com.sofascore.results.event.aiInsights.EventAiInsightsFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class as5 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ EventAiInsightsFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ as5(EventAiInsightsFragment eventAiInsightsFragment, int i) {
        super(0);
        this.i = i;
        this.j = eventAiInsightsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        EventAiInsightsFragment eventAiInsightsFragment = this.j;
        switch (i) {
            case 0:
                return eventAiInsightsFragment.requireActivity().getViewModelStore();
            case 1:
                return eventAiInsightsFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return eventAiInsightsFragment.requireActivity().getDefaultViewModelProviderFactory();
            case 3:
                return eventAiInsightsFragment.requireActivity().getViewModelStore();
            case 4:
                return eventAiInsightsFragment.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return eventAiInsightsFragment.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
