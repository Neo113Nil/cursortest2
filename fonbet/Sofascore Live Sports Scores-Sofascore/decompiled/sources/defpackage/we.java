package defpackage;

import androidx.window.reflection.Consumer2;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class we implements Consumer2 {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public we(mnc mncVar) {
        this.b = mncVar;
    }

    @Override // androidx.window.reflection.Consumer2
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                List list = (List) obj;
                list.getClass();
                ((ak5) this.b).f(list);
                break;
            default:
                List list2 = (List) obj;
                list2.getClass();
                ((mnc) this.b).invoke(list2);
                break;
        }
    }

    public we(dad dadVar, ak5 ak5Var) {
        this.b = ak5Var;
    }
}
