package defpackage;

import java.lang.reflect.Array;
import java.net.SocketAddress;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zwd extends ln8 {
    public final o6a g;
    public twd h;
    public boolean i;
    public sk3 j;
    public efb k;
    public final ao2 l;
    public final /* synthetic */ axd m;

    public zwd(axd axdVar, ejg ejgVar, z89 z89Var) {
        o6a l;
        this.m = axdVar;
        efb efbVar = (efb) ejgVar.l();
        if (efbVar != null) {
            this.k = efbVar;
            x89 x89Var = new x89(1, this, efbVar);
            hcc x = ejg.x();
            x.X((List) ejgVar.c);
            x.c = (sm0) ejgVar.b;
            Object[][] objArr = (Object[][]) ejgVar.d;
            Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length, 2);
            x.d = objArr2;
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            x.b(x89Var);
            l = z89Var.l(new ejg((List) x.b, (sm0) x.c, (Object[][]) x.d));
            this.g = l;
        } else {
            l = z89Var.l(ejgVar);
            this.g = l;
        }
        this.l = l.C();
    }

    @Override // defpackage.o6a
    public final sm0 B() {
        twd twdVar = this.h;
        o6a o6aVar = this.g;
        if (twdVar == null) {
            return o6aVar.B();
        }
        sm0 B = o6aVar.B();
        B.getClass();
        twd twdVar2 = this.h;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(axd.o, twdVar2);
        for (Map.Entry entry : B.a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((rm0) entry.getKey(), entry.getValue());
            }
        }
        return new sm0(identityHashMap);
    }

    @Override // defpackage.ln8, defpackage.o6a
    public final void L() {
        twd twdVar = this.h;
        if (twdVar != null) {
            this.h = null;
            twdVar.f.remove(this);
        }
        super.L();
    }

    @Override // defpackage.o6a
    public final void M(efb efbVar) {
        if (this.k != null) {
            S().M(efbVar);
            return;
        }
        this.k = efbVar;
        S().M(new x89(1, this, efbVar));
    }

    @Override // defpackage.ln8, defpackage.o6a
    public final void O(List list) {
        axd axdVar = this.m;
        if (axd.A(A()) && axd.A(list)) {
            if (axdVar.g.containsValue(this.h)) {
                twd twdVar = this.h;
                twdVar.getClass();
                this.h = null;
                twdVar.f.remove(this);
            }
            SocketAddress socketAddress = (SocketAddress) ((sp5) list.get(0)).a.get(0);
            if (axdVar.g.containsKey(socketAddress)) {
                ((twd) axdVar.g.get(socketAddress)).a(this);
            }
        } else if (!axd.A(A()) || axd.A(list)) {
            if (!axd.A(A()) && axd.A(list)) {
                SocketAddress socketAddress2 = (SocketAddress) ((sp5) list.get(0)).a.get(0);
                if (axdVar.g.containsKey(socketAddress2)) {
                    ((twd) axdVar.g.get(socketAddress2)).a(this);
                }
            }
        } else if (axdVar.g.containsKey(z().a.get(0))) {
            twd twdVar2 = (twd) axdVar.g.get(z().a.get(0));
            twdVar2.getClass();
            this.h = null;
            twdVar2.f.remove(this);
            k1d k1dVar = twdVar2.b;
            ((AtomicLong) k1dVar.b).set(0L);
            ((AtomicLong) k1dVar.c).set(0L);
            k1d k1dVar2 = twdVar2.c;
            ((AtomicLong) k1dVar2.b).set(0L);
            ((AtomicLong) k1dVar2.c).set(0L);
        }
        this.g.O(list);
    }

    @Override // defpackage.ln8
    public final o6a S() {
        return this.g;
    }

    public final void T() {
        this.i = true;
        efb efbVar = this.k;
        xei xeiVar = xei.m;
        z1a.r("The error status must not be OK", true ^ xeiVar.f());
        efbVar.a(new sk3(rk3.c, xeiVar));
        this.l.E("Subchannel ejected: {0}", 2, this);
    }

    @Override // defpackage.ln8
    public final String toString() {
        return "OutlierDetectionSubchannel{addresses=" + this.g.A() + '}';
    }
}
