package defpackage;

import com.sofascore.results.crowdsourcing.CrowdsourcingDeleteIncidentModal;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class o24 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ CrowdsourcingDeleteIncidentModal j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o24(CrowdsourcingDeleteIncidentModal crowdsourcingDeleteIncidentModal, int i) {
        super(0);
        this.i = i;
        this.j = crowdsourcingDeleteIncidentModal;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        CrowdsourcingDeleteIncidentModal crowdsourcingDeleteIncidentModal = this.j;
        switch (i) {
            case 0:
                return crowdsourcingDeleteIncidentModal.requireActivity().getViewModelStore();
            case 1:
                return crowdsourcingDeleteIncidentModal.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return crowdsourcingDeleteIncidentModal.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return crowdsourcingDeleteIncidentModal;
        }
    }
}
