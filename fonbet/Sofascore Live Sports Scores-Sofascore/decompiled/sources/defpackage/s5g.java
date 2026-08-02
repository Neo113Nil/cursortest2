package defpackage;

import com.sofascore.results.chat.fragment.RiskyChatsDialog;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class s5g extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ RiskyChatsDialog j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s5g(RiskyChatsDialog riskyChatsDialog, int i) {
        super(0);
        this.i = i;
        this.j = riskyChatsDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        RiskyChatsDialog riskyChatsDialog = this.j;
        switch (i) {
            case 0:
                return riskyChatsDialog.requireActivity().getViewModelStore();
            case 1:
                return riskyChatsDialog.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return riskyChatsDialog.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
