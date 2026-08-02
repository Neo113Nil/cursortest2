package defpackage;

import com.sofascore.results.chat.fragment.AbstractChatFragment;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class i1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void a(p4d p4dVar, zj3 zj3Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                us2 L = ((AbstractChatFragment) obj).L();
                zj3Var.getClass();
                L.h.k(zj3Var);
                break;
            default:
                s5d s5dVar = (s5d) obj;
                if (s5dVar.d != zj3Var) {
                    zj3Var.getClass();
                    s5dVar.d = zj3Var;
                    Iterator it = s5dVar.c.iterator();
                    while (it.hasNext()) {
                        ((i1) it.next()).a(p4dVar, zj3Var);
                    }
                    zj3Var.name();
                    ugj.a.getClass();
                    break;
                }
                break;
        }
    }
}
