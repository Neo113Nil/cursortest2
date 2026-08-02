package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class eg3 extends a51 {
    public final HashMap h = new HashMap();
    public Handler i;
    public sn4 j;

    @Override // defpackage.a51
    public final void c() {
        for (cg3 cg3Var : this.h.values()) {
            cg3Var.a.b(cg3Var.b);
        }
    }

    @Override // defpackage.a51
    public final void e() {
        for (cg3 cg3Var : this.h.values()) {
            cg3Var.a.d(cg3Var.b);
        }
    }

    @Override // defpackage.a51
    public void i() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((cg3) it.next()).a.i();
        }
    }

    @Override // defpackage.a51
    public void o() {
        HashMap hashMap = this.h;
        for (cg3 cg3Var : hashMap.values()) {
            a51 a51Var = cg3Var.a;
            ujg ujgVar = cg3Var.c;
            a51Var.n(cg3Var.b);
            a51Var.q(ujgVar);
            a51Var.p(ujgVar);
        }
        hashMap.clear();
    }

    public abstract rcc r(Object obj, rcc rccVar);

    public abstract void u(Object obj, a51 a51Var, lij lijVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [tcc, zf3] */
    public final void v(final Object obj, a51 a51Var) {
        HashMap hashMap = this.h;
        qx9.r(!hashMap.containsKey(obj));
        ?? r1 = new tcc() { // from class: zf3
            @Override // defpackage.tcc
            public final void a(a51 a51Var2, lij lijVar) {
                eg3.this.u(obj, a51Var2, lijVar);
            }
        };
        ujg ujgVar = new ujg(this, obj);
        hashMap.put(obj, new cg3(a51Var, r1, ujgVar));
        Handler handler = this.i;
        handler.getClass();
        a51Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = a51Var.c.c;
        bdc bdcVar = new bdc();
        bdcVar.a = handler;
        bdcVar.b = ujgVar;
        copyOnWriteArrayList.add(bdcVar);
        this.i.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = a51Var.d.c;
        zb5 zb5Var = new zb5();
        zb5Var.a = ujgVar;
        copyOnWriteArrayList2.add(zb5Var);
        sn4 sn4Var = this.j;
        bse bseVar = this.g;
        qx9.u(bseVar);
        a51Var.j(r1, sn4Var, bseVar);
        if (this.b.isEmpty()) {
            a51Var.b(r1);
        }
    }

    public long s(Object obj, long j) {
        return j;
    }

    public int t(Object obj, int i) {
        return i;
    }
}
