package defpackage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.sofascore.model.util.ChatInterface;
import com.sofascore.results.chat.fragment.AbstractChatFragment;
import com.sofascore.results.chat.fragment.CommentsChatFragment;
import com.sofascore.results.chat.fragment.ModeratorsChatFragment;
import com.sofascore.results.mvvm.base.SofaTabLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qr2 extends s8 {
    public final ChatInterface r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr2(AppCompatActivity appCompatActivity, ViewPager2 viewPager2, SofaTabLayout sofaTabLayout, ChatInterface chatInterface) {
        super(appCompatActivity, viewPager2, sofaTabLayout);
        chatInterface.getClass();
        this.r = chatInterface;
    }

    @Override // defpackage.d41
    public final Fragment C(Enum r4) {
        pr2 pr2Var = (pr2) r4;
        pr2Var.getClass();
        int ordinal = pr2Var.ordinal();
        ChatInterface chatInterface = this.r;
        if (ordinal == 0) {
            chatInterface.getClass();
            CommentsChatFragment commentsChatFragment = new CommentsChatFragment();
            commentsChatFragment.setArguments(fz8.C(fz8.G("CHAT_INTERFACE_OBJECT", chatInterface)));
            return commentsChatFragment;
        }
        if (ordinal != 1) {
            zzl.b();
            return null;
        }
        chatInterface.getClass();
        ModeratorsChatFragment moderatorsChatFragment = new ModeratorsChatFragment();
        moderatorsChatFragment.setArguments(fz8.C(fz8.H("NATS_CHANNEL_TYPE", "moderators.1"), fz8.G("CHAT_INTERFACE_OBJECT", chatInterface)));
        return moderatorsChatFragment;
    }

    @Override // defpackage.s8
    public final String H(Enum r3) {
        pr2 pr2Var = (pr2) r3;
        pr2Var.getClass();
        String string = y().getString(pr2Var.a);
        string.getClass();
        Object orElse = A(pr2Var).orElse(null);
        AbstractChatFragment abstractChatFragment = orElse instanceof AbstractChatFragment ? (AbstractChatFragment) orElse : null;
        return (abstractChatFragment == null || !abstractChatFragment.M) ? string : "* ".concat(string);
    }
}
