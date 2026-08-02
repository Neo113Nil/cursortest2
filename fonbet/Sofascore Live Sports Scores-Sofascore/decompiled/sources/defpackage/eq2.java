package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.results.chat.ChatActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class eq2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivity b;

    public /* synthetic */ eq2(ChatActivity chatActivity, int i) {
        this.a = i;
        this.b = chatActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        iq2 iq2Var;
        int i = this.a;
        ChatActivity chatActivity = this.b;
        switch (i) {
            case 0:
                Event event = (Event) obj;
                int i2 = ChatActivity.Z;
                event.getClass();
                chatActivity.W(event);
                chatActivity.X(event);
                break;
            case 1:
                int i3 = ChatActivity.Z;
                Event event2 = (Event) chatActivity.S().m.d();
                if (event2 != null && me4.t(StatusKt.STATUS_IN_PROGRESS, event2) && !event2.isCrowdsourcingLive() && (iq2Var = chatActivity.X) != null) {
                    iq2Var.f(event2);
                }
                break;
            case 2:
                int i4 = ChatActivity.Z;
                if (((List) obj).isEmpty() && chatActivity.S().k == mf.c) {
                    chatActivity.Z();
                }
                break;
            case 3:
                Event event3 = (Event) obj;
                int i5 = ChatActivity.Z;
                event3.getClass();
                chatActivity.S().l.k(event3);
                break;
            default:
                zkd zkdVar = (zkd) obj;
                int i6 = ChatActivity.Z;
                zkdVar.getClass();
                ((tu7) chatActivity.M.getValue()).l(zkdVar);
                break;
        }
        return Unit.a;
    }
}
