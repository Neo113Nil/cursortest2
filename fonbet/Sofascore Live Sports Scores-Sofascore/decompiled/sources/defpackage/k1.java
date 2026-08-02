package defpackage;

import android.content.Context;
import com.sofascore.model.chat.Message;
import com.sofascore.results.chat.fragment.AbstractChatFragment;
import com.sofascore.results.chat.view.ChatRecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class k1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractChatFragment b;

    public /* synthetic */ k1(AbstractChatFragment abstractChatFragment, int i) {
        this.a = i;
        this.b = abstractChatFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        AbstractChatFragment abstractChatFragment = this.b;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                int intValue2 = ((Integer) obj2).intValue();
                if (intValue >= 0) {
                    krk krkVar = abstractChatFragment.l;
                    krkVar.getClass();
                    ChatRecyclerView chatRecyclerView = ((yn8) krkVar).l;
                    int i2 = intValue + 10;
                    if (i2 <= intValue2) {
                        intValue2 = i2;
                    }
                    chatRecyclerView.scrollToPosition(intValue2);
                    krk krkVar2 = abstractChatFragment.l;
                    krkVar2.getClass();
                    wca.I(((yn8) krkVar2).l, intValue);
                }
                break;
            default:
                Message message = (Message) obj;
                bq2 bq2Var = (bq2) obj2;
                message.getClass();
                bq2Var.getClass();
                Context requireContext = abstractChatFragment.requireContext();
                requireContext.getClass();
                ur2.a(requireContext, abstractChatFragment.L(), bq2Var, message, abstractChatFragment.K());
                break;
        }
        return Unit.a;
    }
}
