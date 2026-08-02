package defpackage;

import android.view.View;
import com.sofascore.results.chat.fragment.AbstractChatFragment;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class j1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractChatFragment b;

    public /* synthetic */ j1(AbstractChatFragment abstractChatFragment, int i) {
        this.a = i;
        this.b = abstractChatFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        AbstractChatFragment abstractChatFragment = this.b;
        switch (i) {
            case 0:
                krk krkVar = abstractChatFragment.l;
                krkVar.getClass();
                ((yn8) krkVar).l.scrollToPosition(abstractChatFragment.F().getItemCount() - 1);
                abstractChatFragment.H = true;
                break;
            default:
                krk krkVar2 = abstractChatFragment.l;
                krkVar2.getClass();
                tba.j(((yn8) krkVar2).e, n35.TO_BOTTOM, 0L, 14);
                break;
        }
    }
}
