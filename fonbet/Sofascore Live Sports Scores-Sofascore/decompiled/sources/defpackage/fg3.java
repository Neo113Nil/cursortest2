package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class fg3 extends b51 {
    public final HashMap h = new HashMap();
    public Handler i;
    public tn4 j;

    @Override // defpackage.b51
    public final void i() {
        for (dg3 dg3Var : this.h.values()) {
            ((b51) dg3Var.a).h(dg3Var.b);
        }
    }

    @Override // defpackage.b51
    public final void k() {
        for (dg3 dg3Var : this.h.values()) {
            ((b51) dg3Var.a).j(dg3Var.b);
        }
    }

    @Override // defpackage.vcc
    public void maybeThrowSourceInfoRefreshError() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((dg3) it.next()).a.maybeThrowSourceInfoRefreshError();
        }
    }

    @Override // defpackage.b51
    public void p() {
        HashMap hashMap = this.h;
        for (dg3 dg3Var : hashMap.values()) {
            vcc vccVar = dg3Var.a;
            bg3 bg3Var = dg3Var.c;
            ((b51) vccVar).o(dg3Var.b);
            b51 b51Var = (b51) vccVar;
            b51Var.r(bg3Var);
            b51Var.q(bg3Var);
        }
        hashMap.clear();
    }

    public abstract scc s(Object obj, scc sccVar);

    public abstract void v(Object obj, b51 b51Var, mij mijVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [ag3, ucc] */
    public final void w(final Object obj, vcc vccVar) {
        HashMap hashMap = this.h;
        z1a.s(!hashMap.containsKey(obj));
        ?? r1 = new ucc() { // from class: ag3
            @Override // defpackage.ucc
            public final void a(b51 b51Var, mij mijVar) {
                fg3.this.v(obj, b51Var, mijVar);
            }
        };
        bg3 bg3Var = new bg3(this, obj);
        hashMap.put(obj, new dg3(vccVar, r1, bg3Var));
        Handler handler = this.i;
        handler.getClass();
        b51 b51Var = (b51) vccVar;
        b51Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) b51Var.c.d;
        cdc cdcVar = new cdc();
        cdcVar.a = handler;
        cdcVar.b = bg3Var;
        copyOnWriteArrayList.add(cdcVar);
        Handler handler2 = this.i;
        handler2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = b51Var.d.c;
        ac5 ac5Var = new ac5();
        ac5Var.a = handler2;
        ac5Var.b = bg3Var;
        copyOnWriteArrayList2.add(ac5Var);
        tn4 tn4Var = this.j;
        cse cseVar = this.g;
        cseVar.getClass();
        b51Var.l(r1, tn4Var, cseVar);
        if (this.b.isEmpty()) {
            b51Var.h(r1);
        }
    }

    public long t(Object obj, long j) {
        return j;
    }

    public int u(Object obj, int i) {
        return i;
    }
}
