package defpackage;

import com.sofascore.results.chat.fragment.AbstractChatFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class v1 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ AbstractChatFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v1(AbstractChatFragment abstractChatFragment, int i) {
        super(0);
        this.i = i;
        this.j = abstractChatFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        AbstractChatFragment abstractChatFragment = this.j;
        switch (i) {
            case 0:
                return abstractChatFragment.requireActivity().getViewModelStore();
            case 1:
                return abstractChatFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return abstractChatFragment.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return abstractChatFragment;
        }
    }
}
