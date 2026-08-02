package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lbc extends obc {
    public final ArrayList w;
    public final dh0 x;

    public lbc(nbc nbcVar, String str, String str2) {
        super(nbcVar, str, str2, false);
        this.w = new ArrayList();
        this.x = new dh0(0);
    }

    public final boolean n() {
        pbc.b();
        return pbc.c().e().contains(this);
    }

    public final boolean o(obc obcVar) {
        cbc cbcVar = (cbc) this.x.get(obcVar.c);
        return cbcVar != null && cbcVar.d;
    }

    public final void p(Collection collection) {
        obc obcVar;
        this.v.clear();
        ArrayList arrayList = this.w;
        arrayList.clear();
        dh0 dh0Var = this.x;
        dh0Var.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            cbc cbcVar = (cbc) it.next();
            String d = cbcVar.a.d();
            Iterator it2 = this.a.b.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obcVar = null;
                    break;
                } else {
                    obcVar = (obc) it2.next();
                    if (obcVar.b.equals(d)) {
                        break;
                    }
                }
            }
            if (obcVar != null) {
                arrayList.add(obcVar);
                dh0Var.put(obcVar.c, cbcVar);
                int i = cbcVar.b;
                if (i == 2 || i == 3) {
                    this.v.add(obcVar);
                }
            }
        }
        pbc.c().a.b(259, this);
    }
}
