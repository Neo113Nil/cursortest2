package defpackage;

import com.sofascore.results.event.aiInsights.EventAiInsightsBlackFridayModal;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ur5 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ EventAiInsightsBlackFridayModal j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ur5(EventAiInsightsBlackFridayModal eventAiInsightsBlackFridayModal, int i) {
        super(0);
        this.i = i;
        this.j = eventAiInsightsBlackFridayModal;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        EventAiInsightsBlackFridayModal eventAiInsightsBlackFridayModal = this.j;
        switch (i) {
            case 0:
                return eventAiInsightsBlackFridayModal.requireActivity().getViewModelStore();
            case 1:
                return eventAiInsightsBlackFridayModal.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return eventAiInsightsBlackFridayModal.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
