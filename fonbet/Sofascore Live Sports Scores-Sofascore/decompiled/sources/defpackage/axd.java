package defpackage;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class axd extends ffb {
    public static final rm0 o = new rm0("addressTrackerKey");
    public final wp4 g;
    public final xx3 h;
    public final v19 i;
    public final f7a j;
    public final ScheduledExecutorService k;
    public y3g l;
    public Long m;
    public final ao2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axd(f6a f6aVar) {
        super(0);
        f7a f7aVar = f7a.m;
        ao2 n = f6aVar.n();
        this.n = n;
        this.i = new v19(new u19(this, f6aVar));
        this.g = new wp4();
        xx3 r = f6aVar.r();
        z1a.y(r, "syncContext");
        this.h = r;
        ScheduledExecutorService q = f6aVar.q();
        z1a.y(q, "timeService");
        this.k = q;
        this.j = f7aVar;
        n.D(1, "OutlierDetection lb created.");
    }

    public static boolean A(List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((sp5) it.next()).a.size();
            if (i > 1) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList B(wp4 wp4Var, int i) {
        ArrayList arrayList = new ArrayList();
        for (twd twdVar : wp4Var.values()) {
            if (twdVar.c() >= i) {
                arrayList.add(twdVar);
            }
        }
        return arrayList;
    }

    @Override // defpackage.ffb
    public final xei a(cfb cfbVar) {
        v19 v19Var = this.i;
        wp4 wp4Var = this.g;
        ao2 ao2Var = this.n;
        ao2Var.E("Received resolution result: {0}", 1, cfbVar);
        vwd vwdVar = (vwd) cfbVar.c;
        ArrayList arrayList = new ArrayList();
        Iterator it = cfbVar.a.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((sp5) it.next()).a);
        }
        wp4Var.keySet().retainAll(arrayList);
        Iterator it2 = ((HashMap) wp4Var.s).values().iterator();
        while (it2.hasNext()) {
            ((twd) it2.next()).a = vwdVar;
        }
        HashMap hashMap = (HashMap) wp4Var.s;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            SocketAddress socketAddress = (SocketAddress) it3.next();
            if (!hashMap.containsKey(socketAddress)) {
                hashMap.put(socketAddress, new twd(vwdVar));
            }
        }
        t6h t6hVar = vwdVar.g;
        Long l = vwdVar.a;
        v19Var.C(t6hVar.a);
        if (vwdVar.e == null && vwdVar.f == null) {
            y3g y3gVar = this.l;
            if (y3gVar != null) {
                y3gVar.e();
                this.m = null;
                for (twd twdVar : ((HashMap) wp4Var.s).values()) {
                    if (twdVar.d()) {
                        twdVar.e();
                    }
                    twdVar.e = 0;
                }
            }
        } else {
            Long valueOf = this.m == null ? l : Long.valueOf(Math.max(0L, l.longValue() - (this.j.l() - this.m.longValue())));
            y3g y3gVar2 = this.l;
            if (y3gVar2 != null) {
                y3gVar2.e();
                for (twd twdVar2 : ((HashMap) wp4Var.s).values()) {
                    k1d k1dVar = twdVar2.b;
                    ((AtomicLong) k1dVar.b).set(0L);
                    ((AtomicLong) k1dVar.c).set(0L);
                    k1d k1dVar2 = twdVar2.c;
                    ((AtomicLong) k1dVar2.b).set(0L);
                    ((AtomicLong) k1dVar2.c).set(0L);
                }
            }
            xx3 xx3Var = this.h;
            lv4 lv4Var = new lv4(7, this, vwdVar, ao2Var);
            long longValue = valueOf.longValue();
            long longValue2 = l.longValue();
            ScheduledExecutorService scheduledExecutorService = this.k;
            xx3Var.getClass();
            jqi jqiVar = new jqi(lv4Var);
            this.l = new y3g(jqiVar, scheduledExecutorService.scheduleWithFixedDelay(new mpi(1, longValue2, xx3Var, jqiVar, lv4Var), longValue, longValue2, TimeUnit.NANOSECONDS));
        }
        sm0 sm0Var = sm0.b;
        v19Var.p(new cfb(cfbVar.a, cfbVar.b, vwdVar.g.b));
        return xei.e;
    }

    @Override // defpackage.ffb
    public final void o(xei xeiVar) {
        this.i.o(xeiVar);
    }

    @Override // defpackage.ffb
    public final void z() {
        this.i.z();
    }
}
