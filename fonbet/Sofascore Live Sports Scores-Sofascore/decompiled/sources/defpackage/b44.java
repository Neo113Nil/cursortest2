package defpackage;

import com.sofascore.results.crowdsourcing.CrowdsourcingIncidentDetailsFullScreenDialog;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class b44 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ CrowdsourcingIncidentDetailsFullScreenDialog j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b44(CrowdsourcingIncidentDetailsFullScreenDialog crowdsourcingIncidentDetailsFullScreenDialog, int i) {
        super(0);
        this.i = i;
        this.j = crowdsourcingIncidentDetailsFullScreenDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        CrowdsourcingIncidentDetailsFullScreenDialog crowdsourcingIncidentDetailsFullScreenDialog = this.j;
        switch (i) {
            case 0:
                return crowdsourcingIncidentDetailsFullScreenDialog.requireActivity().getViewModelStore();
            case 1:
                return crowdsourcingIncidentDetailsFullScreenDialog.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return crowdsourcingIncidentDetailsFullScreenDialog.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return crowdsourcingIncidentDetailsFullScreenDialog;
        }
    }
}
