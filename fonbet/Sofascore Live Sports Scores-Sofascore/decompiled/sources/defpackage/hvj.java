package defpackage;

import com.sofascore.results.dialog.TransferFilterModal;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hvj extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ TransferFilterModal j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hvj(TransferFilterModal transferFilterModal, int i) {
        super(0);
        this.i = i;
        this.j = transferFilterModal;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        TransferFilterModal transferFilterModal = this.j;
        switch (i) {
            case 0:
                return transferFilterModal.requireActivity().getViewModelStore();
            case 1:
                return transferFilterModal.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return transferFilterModal.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
