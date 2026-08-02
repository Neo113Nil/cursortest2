package defpackage;

import androidx.fragment.app.FragmentActivity;
import com.sofascore.results.chat.ChatActivity;
import com.sofascore.results.chat.fragment.AbstractChatFragment;
import com.sofascore.results.chat.view.ChatActionsModal;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class t1 implements rq4 {
    public final /* synthetic */ g6b a;
    public final /* synthetic */ ChatActionsModal b;
    public final /* synthetic */ AbstractChatFragment c;

    public t1(g6b g6bVar, ChatActionsModal chatActionsModal, AbstractChatFragment abstractChatFragment) {
        this.a = g6bVar;
        this.b = chatActionsModal;
        this.c = abstractChatFragment;
    }

    @Override // defpackage.rq4
    public final void onDestroy(u6b u6bVar) {
        this.a.d(this);
        FragmentActivity activity = this.b.getActivity();
        ChatActivity chatActivity = activity instanceof ChatActivity ? (ChatActivity) activity : null;
        if (chatActivity != null) {
            chatActivity.setHighlightedView(null);
        }
        AbstractChatFragment abstractChatFragment = this.c;
        abstractChatFragment.x = false;
        yn8 yn8Var = (yn8) abstractChatFragment.l;
        if (yn8Var != null) {
            yn8Var.l.suppressLayout(false);
        }
        abstractChatFragment.G = true;
    }
}
