package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class kv4 extends sk0 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv4(mrb mrbVar, pv4 pv4Var) {
        super(mrbVar.r, 1);
        this.d = pv4Var;
    }

    @Override // defpackage.sk0
    public final void b() {
        List list;
        switch (this.c) {
            case 0:
                ((mrb) this.d).W();
                return;
            default:
                pv4 pv4Var = (pv4) this.d;
                pv4Var.getClass();
                List arrayList = new ArrayList();
                while (true) {
                    synchronized (pv4Var) {
                        try {
                            if (pv4Var.j.isEmpty()) {
                                pv4Var.j = null;
                                pv4Var.i = true;
                                return;
                            } else {
                                list = pv4Var.j;
                                pv4Var.j = arrayList;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    list.clear();
                    arrayList = list;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv4(mrb mrbVar, bq3 bq3Var) {
        super(bq3Var, 1);
        this.d = mrbVar;
    }
}
