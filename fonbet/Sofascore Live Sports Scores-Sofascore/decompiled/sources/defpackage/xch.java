package defpackage;

import com.sofascore.results.sharemodal.match.ShareMatchLineupsModal;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xch extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ ShareMatchLineupsModal j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xch(ShareMatchLineupsModal shareMatchLineupsModal, int i) {
        super(0);
        this.i = i;
        this.j = shareMatchLineupsModal;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        ShareMatchLineupsModal shareMatchLineupsModal = this.j;
        switch (i) {
            case 0:
                return shareMatchLineupsModal.requireActivity().getViewModelStore();
            case 1:
                return shareMatchLineupsModal.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return shareMatchLineupsModal.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
