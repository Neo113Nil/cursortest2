package defpackage;

import android.widget.LinearLayout;
import com.sofascore.results.chat.view.ChatConnectingView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class rq2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatConnectingView b;

    public /* synthetic */ rq2(ChatConnectingView chatConnectingView, int i) {
        this.a = i;
        this.b = chatConnectingView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ChatConnectingView chatConnectingView = this.b;
        switch (i) {
            case 0:
                if (!chatConnectingView.k) {
                    chatConnectingView.l();
                    chatConnectingView.k = false;
                    chatConnectingView.d.removeCallbacksAndMessages(null);
                    new b8(chatConnectingView, 8).run();
                    break;
                }
                break;
            default:
                hxj.a((LinearLayout) chatConnectingView.n.b, chatConnectingView.i);
                chatConnectingView.getRoot().setVisibility(8);
                break;
        }
    }
}
