package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class a51 {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final bc5 c = new bc5(1);
    public final bc5 d = new bc5(0);
    public Looper e;
    public lij f;
    public bse g;

    public abstract v6c a(rcc rccVar, zz0 zz0Var, long j);

    public final void b(tcc tccVar) {
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(tccVar);
        if (isEmpty || !hashSet.isEmpty()) {
            return;
        }
        c();
    }

    public final void d(tcc tccVar) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(tccVar);
        if (isEmpty) {
            e();
        }
    }

    public lij f() {
        return null;
    }

    public abstract f6c g();

    public boolean h() {
        return true;
    }

    public abstract void i();

    public final void j(tcc tccVar, sn4 sn4Var, bse bseVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        qx9.r(looper == null || looper == myLooper);
        this.g = bseVar;
        lij lijVar = this.f;
        this.a.add(tccVar);
        if (this.e == null) {
            this.e = myLooper;
            this.b.add(tccVar);
            k(sn4Var);
        } else if (lijVar != null) {
            d(tccVar);
            tccVar.a(this, lijVar);
        }
    }

    public abstract void k(sn4 sn4Var);

    public final void l(lij lijVar) {
        this.f = lijVar;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((tcc) it.next()).a(this, lijVar);
        }
    }

    public abstract void m(v6c v6cVar);

    public final void n(tcc tccVar) {
        ArrayList arrayList = this.a;
        arrayList.remove(tccVar);
        if (!arrayList.isEmpty()) {
            b(tccVar);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        o();
    }

    public abstract void o();

    public final void p(dc5 dc5Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            zb5 zb5Var = (zb5) it.next();
            if (zb5Var.a == dc5Var) {
                copyOnWriteArrayList.remove(zb5Var);
            }
        }
    }

    public final void q(ddc ddcVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.c.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            bdc bdcVar = (bdc) it.next();
            if (bdcVar.b == ddcVar) {
                copyOnWriteArrayList.remove(bdcVar);
            }
        }
    }

    public void c() {
    }

    public void e() {
    }
}
