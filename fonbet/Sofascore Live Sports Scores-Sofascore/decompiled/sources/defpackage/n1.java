package defpackage;

import com.sofascore.results.chat.fragment.AbstractChatFragment;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class n1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractChatFragment b;

    public /* synthetic */ n1(AbstractChatFragment abstractChatFragment, int i) {
        this.a = i;
        this.b = abstractChatFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AbstractChatFragment abstractChatFragment = this.b;
        switch (i) {
            case 0:
                lq2 lq2Var = abstractChatFragment.L;
                if (lq2Var != null) {
                    lq2Var.c();
                }
                lq2 lq2Var2 = abstractChatFragment.L;
                if (lq2Var2 != null) {
                    lq2Var2.b();
                    break;
                }
                break;
            default:
                if (abstractChatFragment.H && abstractChatFragment.F().getItemCount() > 0) {
                    krk krkVar = abstractChatFragment.l;
                    krkVar.getClass();
                    ((yn8) krkVar).l.smoothScrollToPosition(abstractChatFragment.F().getItemCount() - 1);
                    break;
                } else if (abstractChatFragment.B) {
                    krk krkVar2 = abstractChatFragment.l;
                    krkVar2.getClass();
                    if (((yn8) krkVar2).n.getVisibility() == 0) {
                        krk krkVar3 = abstractChatFragment.l;
                        krkVar3.getClass();
                        if (((yn8) krkVar3).k.getVisibility() != 0) {
                            krk krkVar4 = abstractChatFragment.l;
                            krkVar4.getClass();
                            tgj.p(((yn8) krkVar4).k, 0L, 3);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
