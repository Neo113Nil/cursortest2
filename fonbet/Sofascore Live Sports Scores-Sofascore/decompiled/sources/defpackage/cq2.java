package defpackage;

import android.content.Context;
import android.view.View;
import com.sofascore.model.chat.ChatUser;
import com.sofascore.results.chat.view.ChatActionsModal;
import com.sofascore.results.profile.ProfileActivity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class cq2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActionsModal b;

    public /* synthetic */ cq2(ChatActionsModal chatActionsModal, int i) {
        this.a = i;
        this.b = chatActionsModal;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        ChatActionsModal chatActionsModal = this.b;
        switch (i) {
            case 0:
                chatActionsModal.C.invoke(bq2.a);
                chatActionsModal.j();
                break;
            case 1:
                chatActionsModal.C.invoke(bq2.b);
                chatActionsModal.j();
                break;
            case 2:
                chatActionsModal.C.invoke(bq2.c);
                chatActionsModal.j();
                break;
            case 3:
                chatActionsModal.C.invoke(bq2.d);
                chatActionsModal.j();
                break;
            case 4:
                chatActionsModal.C.invoke(bq2.e);
                chatActionsModal.j();
                break;
            default:
                int i2 = ProfileActivity.Q;
                Context requireContext = chatActionsModal.requireContext();
                requireContext.getClass();
                ChatUser chatUser = chatActionsModal.A;
                v8a.H(requireContext, chatUser.getId(), chatUser.getName());
                break;
        }
    }
}
