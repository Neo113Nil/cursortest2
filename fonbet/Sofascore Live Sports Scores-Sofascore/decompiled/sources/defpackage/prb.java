package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class prb extends o6a {
    public final ejg g;
    public final f8a h;
    public final bo2 i;
    public final jo2 j;
    public List k;
    public t8a l;
    public boolean m;
    public boolean n;
    public y3g o;
    public final /* synthetic */ qrb p;

    public prb(qrb qrbVar, ejg ejgVar) {
        this.p = qrbVar;
        List list = (List) ejgVar.c;
        this.k = list;
        f7a f7aVar = qrbVar.l;
        this.g = ejgVar;
        f8a f8aVar = new f8a("Subchannel", qrbVar.t.e(), f8a.d.incrementAndGet());
        this.h = f8aVar;
        jo2 jo2Var = new jo2(f8aVar, f7aVar.l(), "Subchannel for " + list);
        this.j = jo2Var;
        this.i = new bo2(jo2Var, f7aVar);
    }

    @Override // defpackage.o6a
    public final List A() {
        this.p.m.i();
        z1a.D("not started", this.m);
        return this.k;
    }

    @Override // defpackage.o6a
    public final sm0 B() {
        return (sm0) this.g.b;
    }

    @Override // defpackage.o6a
    public final ao2 C() {
        return this.i;
    }

    @Override // defpackage.o6a
    public final Object D() {
        z1a.D("Subchannel is not started", this.m);
        return this.l;
    }

    @Override // defpackage.o6a
    public final void K() {
        this.p.m.i();
        z1a.D("not started", this.m);
        t8a t8aVar = this.l;
        if (t8aVar.v != null) {
            return;
        }
        t8aVar.k.execute(new n8a(t8aVar, 1));
    }

    @Override // defpackage.o6a
    public final void L() {
        y3g y3gVar;
        qrb qrbVar = this.p;
        qrbVar.m.i();
        if (this.l == null) {
            this.n = true;
            return;
        }
        if (!this.n) {
            this.n = true;
        } else {
            if (!qrbVar.H || (y3gVar = this.o) == null) {
                return;
            }
            y3gVar.e();
            this.o = null;
        }
        if (!qrbVar.H) {
            this.o = qrbVar.m.f(qrbVar.f.a.d, new sib(new b8(this, 28)), 5L, TimeUnit.SECONDS);
        } else {
            t8a t8aVar = this.l;
            t8aVar.k.execute(new pyn(t8aVar, qrb.e0, false, 12));
        }
    }

    @Override // defpackage.o6a
    public final void M(efb efbVar) {
        qrb qrbVar = this.p;
        qrbVar.m.i();
        z1a.D("already started", !this.m);
        z1a.D("already shutdown", !this.n);
        z1a.D("Channel is being terminated", !qrbVar.H);
        this.m = true;
        List list = (List) this.g.c;
        String e = qrbVar.t.e();
        ccd ccdVar = qrbVar.s;
        eh2 eh2Var = qrbVar.f;
        ScheduledExecutorService scheduledExecutorService = eh2Var.a.d;
        tmi tmiVar = qrbVar.p;
        xx3 xx3Var = qrbVar.m;
        wj9 wj9Var = new wj9(this, efbVar, false, 14);
        b8a b8aVar = qrbVar.O;
        qrbVar.K.getClass();
        t8a t8aVar = new t8a(list, e, ccdVar, eh2Var, scheduledExecutorService, tmiVar, xx3Var, wj9Var, b8aVar, new x6k(4), this.j, this.h, this.i, qrbVar.u);
        qrbVar.M.b(new a8a("Child Subchannel started", z7a.a, qrbVar.l.l(), t8aVar));
        this.l = t8aVar;
        qrbVar.A.add(t8aVar);
    }

    @Override // defpackage.o6a
    public final void O(List list) {
        this.p.m.i();
        this.k = list;
        t8a t8aVar = this.l;
        t8aVar.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z1a.y(it.next(), "newAddressGroups contains null entry");
        }
        z1a.r("newAddressGroups is empty", !list.isEmpty());
        t8aVar.k.execute(new a8p(t8aVar, Collections.unmodifiableList(new ArrayList(list)), false, 13));
    }

    public final String toString() {
        return this.h.toString();
    }
}
