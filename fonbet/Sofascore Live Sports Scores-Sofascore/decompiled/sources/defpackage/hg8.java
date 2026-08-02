package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hg8 implements yn3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hg8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yn3
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ig8 ig8Var = (ig8) obj;
                if (ig8Var == null) {
                    ig8Var = new ig8(-3);
                }
                ((z41) this.b).u(ig8Var);
                return;
            default:
                ig8 ig8Var2 = (ig8) obj;
                synchronized (jg8.c) {
                    try {
                        fhh fhhVar = jg8.d;
                        ArrayList arrayList = (ArrayList) fhhVar.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        fhhVar.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((yn3) arrayList.get(i)).accept(ig8Var2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
