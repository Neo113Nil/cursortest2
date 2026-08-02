package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class b51 implements vcc {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final b10 c = new b10(new CopyOnWriteArrayList(), 0, (scc) null);
    public final cc5 d = new cc5(new CopyOnWriteArrayList(), 0, null);
    public Looper e;
    public mij f;
    public cse g;

    public final b10 g(scc sccVar) {
        return new b10((CopyOnWriteArrayList) this.c.d, 0, sccVar);
    }

    public final void h(ucc uccVar) {
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(uccVar);
        if (isEmpty || !hashSet.isEmpty()) {
            return;
        }
        i();
    }

    public final void j(ucc uccVar) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(uccVar);
        if (isEmpty) {
            k();
        }
    }

    public final void l(ucc uccVar, tn4 tn4Var, cse cseVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        z1a.s(looper == null || looper == myLooper);
        this.g = cseVar;
        mij mijVar = this.f;
        this.a.add(uccVar);
        if (this.e == null) {
            this.e = myLooper;
            this.b.add(uccVar);
            m(tn4Var);
        } else if (mijVar != null) {
            j(uccVar);
            uccVar.a(this, mijVar);
        }
    }

    public abstract void m(tn4 tn4Var);

    public final void n(mij mijVar) {
        this.f = mijVar;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ucc) it.next()).a(this, mijVar);
        }
    }

    public final void o(ucc uccVar) {
        ArrayList arrayList = this.a;
        arrayList.remove(uccVar);
        if (!arrayList.isEmpty()) {
            h(uccVar);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        p();
    }

    public abstract void p();

    public final void q(ec5 ec5Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ac5 ac5Var = (ac5) it.next();
            if (ac5Var.b == ec5Var) {
                copyOnWriteArrayList.remove(ac5Var);
            }
        }
    }

    public final void r(edc edcVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.c.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            cdc cdcVar = (cdc) it.next();
            if (cdcVar.b == edcVar) {
                copyOnWriteArrayList.remove(cdcVar);
            }
        }
    }

    public void i() {
    }

    public void k() {
    }
}
