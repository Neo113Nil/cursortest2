package defpackage;

import java.net.SocketAddress;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class fge extends ffb {
    public static final Logger p = Logger.getLogger(fge.class.getName());
    public final f6a g;
    public final HashMap h;
    public q8a i;
    public int j;
    public boolean k;
    public y3g l;
    public rk3 m;
    public rk3 n;
    public final boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fge(f6a f6aVar) {
        super(0);
        boolean z = false;
        this.h = new HashMap();
        this.j = 0;
        this.k = true;
        rk3 rk3Var = rk3.d;
        this.m = rk3Var;
        this.n = rk3Var;
        Logger logger = n49.a;
        String str = System.getenv("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS");
        str = str == null ? System.getProperty("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS") : str;
        if (!vha.M(str) && Boolean.parseBoolean(str)) {
            z = true;
        }
        this.o = z;
        this.g = f6aVar;
    }

    public final void A() {
        y3g y3gVar = this.l;
        if (y3gVar != null) {
            y3gVar.e();
            this.l = null;
        }
    }

    public final void B() {
        if (this.o) {
            y3g y3gVar = this.l;
            if (y3gVar != null) {
                jqi jqiVar = (jqi) y3gVar.b;
                if (!jqiVar.c && !jqiVar.b) {
                    return;
                }
            }
            f6a f6aVar = this.g;
            this.l = f6aVar.r().f(f6aVar.q(), new kac(this, 5), 250L, TimeUnit.MILLISECONDS);
        }
    }

    public final void C(rk3 rk3Var, dfb dfbVar) {
        if (rk3Var == this.n && (rk3Var == rk3.d || rk3Var == rk3.a)) {
            return;
        }
        this.n = rk3Var;
        this.g.M(rk3Var, dfbVar);
    }

    public final void D(ege egeVar) {
        rk3 rk3Var = egeVar.b;
        rk3 rk3Var2 = rk3.b;
        if (rk3Var != rk3Var2) {
            return;
        }
        sk3 sk3Var = egeVar.c.a;
        rk3 rk3Var3 = sk3Var.a;
        if (rk3Var3 == rk3Var2) {
            C(rk3Var2, new cge(bfb.b(egeVar.a, null), 1));
            return;
        }
        rk3 rk3Var4 = rk3.c;
        if (rk3Var3 == rk3Var4) {
            C(rk3Var4, new cge(bfb.a(sk3Var.b), 0));
        } else if (this.n != rk3Var4) {
            C(rk3Var3, new cge(bfb.e, 0));
        }
    }

    @Override // defpackage.ffb
    public final xei a(cfb cfbVar) {
        List list;
        rk3 rk3Var;
        if (this.m == rk3.e) {
            return xei.k.h("Already shut down");
        }
        List list2 = cfbVar.a;
        sm0 sm0Var = cfbVar.b;
        if (list2.isEmpty()) {
            xei h = xei.m.h("NameResolver returned no usable address. addrs=" + list2 + ", attrs=" + sm0Var);
            o(h);
            return h;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((sp5) it.next()) == null) {
                xei h2 = xei.m.h("NameResolver returned address list with null endpoint. addrs=" + list2 + ", attrs=" + sm0Var);
                o(h2);
                return h2;
            }
        }
        this.k = true;
        zu9 s = hv9.s();
        s.e(list2);
        vvf g = s.g();
        q8a q8aVar = this.i;
        rk3 rk3Var2 = rk3.b;
        if (q8aVar == null) {
            q8a q8aVar2 = new q8a();
            q8aVar2.a = g != null ? g : Collections.EMPTY_LIST;
            this.i = q8aVar2;
        } else if (this.m == rk3Var2) {
            SocketAddress a = q8aVar.a();
            q8a q8aVar3 = this.i;
            if (g != null) {
                list = g;
            } else {
                q8aVar3.getClass();
                list = Collections.EMPTY_LIST;
            }
            q8aVar3.a = list;
            q8aVar3.b = 0;
            q8aVar3.c = 0;
            if (this.i.e(a)) {
                return xei.e;
            }
            q8a q8aVar4 = this.i;
            q8aVar4.b = 0;
            q8aVar4.c = 0;
        } else {
            q8aVar.a = g != null ? g : Collections.EMPTY_LIST;
            q8aVar.b = 0;
            q8aVar.c = 0;
        }
        HashMap hashMap = this.h;
        HashSet hashSet = new HashSet(hashMap.keySet());
        HashSet hashSet2 = new HashSet();
        av9 listIterator = g.listIterator(0);
        while (listIterator.hasNext()) {
            hashSet2.addAll(((sp5) listIterator.next()).a);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            SocketAddress socketAddress = (SocketAddress) it2.next();
            if (!hashSet2.contains(socketAddress)) {
                ((ege) hashMap.remove(socketAddress)).a.L();
            }
        }
        int size = hashSet.size();
        rk3 rk3Var3 = rk3.a;
        if (size == 0 || (rk3Var = this.m) == rk3Var3 || rk3Var == rk3Var2) {
            this.m = rk3Var3;
            C(rk3Var3, new cge(bfb.e, 0));
            A();
            y();
        } else {
            rk3 rk3Var4 = rk3.d;
            if (rk3Var == rk3Var4) {
                C(rk3Var4, new dge(this, this));
            } else if (rk3Var == rk3.c) {
                A();
                y();
            }
        }
        return xei.e;
    }

    @Override // defpackage.ffb
    public final void o(xei xeiVar) {
        HashMap hashMap = this.h;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((ege) it.next()).a.L();
        }
        hashMap.clear();
        C(rk3.c, new cge(bfb.a(xeiVar), 0));
    }

    @Override // defpackage.ffb
    public final void y() {
        o6a o6aVar;
        q8a q8aVar = this.i;
        if (q8aVar == null || !q8aVar.c() || this.m == rk3.e) {
            return;
        }
        SocketAddress a = this.i.a();
        HashMap hashMap = this.h;
        boolean containsKey = hashMap.containsKey(a);
        Logger logger = p;
        if (containsKey) {
            o6aVar = ((ege) hashMap.get(a)).a;
        } else {
            bge bgeVar = new bge(this);
            hcc x = ejg.x();
            x.X(w3a.K(new sp5(a)));
            x.b(bgeVar);
            final o6a l = this.g.l(new ejg((List) x.b, (sm0) x.c, (Object[][]) x.d));
            if (l == null) {
                logger.warning("Was not able to create subchannel for " + a);
                a70.r("Can't create subchannel");
                return;
            }
            ege egeVar = new ege(l, bgeVar);
            bgeVar.b = egeVar;
            hashMap.put(a, egeVar);
            if (l.B().a.get(ffb.e) == null) {
                bgeVar.a = sk3.a(rk3.b);
            }
            l.M(new efb() { // from class: age
                @Override // defpackage.efb
                public final void a(sk3 sk3Var) {
                    o6a o6aVar2;
                    fge fgeVar = fge.this;
                    f6a f6aVar = fgeVar.g;
                    rk3 rk3Var = sk3Var.a;
                    HashMap hashMap2 = fgeVar.h;
                    o6a o6aVar3 = l;
                    ege egeVar2 = (ege) hashMap2.get((SocketAddress) o6aVar3.z().a.get(0));
                    if (egeVar2 == null || (o6aVar2 = egeVar2.a) != o6aVar3 || rk3Var == rk3.e) {
                        return;
                    }
                    rk3 rk3Var2 = rk3.d;
                    if (rk3Var == rk3Var2) {
                        f6aVar.C();
                    }
                    egeVar2.a(rk3Var);
                    rk3 rk3Var3 = fgeVar.m;
                    rk3 rk3Var4 = rk3.a;
                    rk3 rk3Var5 = rk3.c;
                    if (rk3Var3 == rk3Var5 || fgeVar.n == rk3Var5) {
                        if (rk3Var == rk3Var4) {
                            return;
                        }
                        if (rk3Var == rk3Var2) {
                            fgeVar.y();
                            return;
                        }
                    }
                    int ordinal = rk3Var.ordinal();
                    if (ordinal == 0) {
                        fgeVar.m = rk3Var4;
                        fgeVar.C(rk3Var4, new cge(bfb.e, 0));
                        return;
                    }
                    if (ordinal == 1) {
                        fgeVar.A();
                        for (ege egeVar3 : hashMap2.values()) {
                            if (!egeVar3.a.equals(o6aVar2)) {
                                egeVar3.a.L();
                            }
                        }
                        hashMap2.clear();
                        rk3 rk3Var6 = rk3.b;
                        egeVar2.a(rk3Var6);
                        hashMap2.put((SocketAddress) o6aVar2.z().a.get(0), egeVar2);
                        fgeVar.i.e((SocketAddress) o6aVar3.z().a.get(0));
                        fgeVar.m = rk3Var6;
                        fgeVar.D(egeVar2);
                        return;
                    }
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            is8.c(rk3Var, "Unsupported state:");
                            return;
                        }
                        q8a q8aVar2 = fgeVar.i;
                        q8aVar2.b = 0;
                        q8aVar2.c = 0;
                        fgeVar.m = rk3Var2;
                        fgeVar.C(rk3Var2, new dge(fgeVar, fgeVar));
                        return;
                    }
                    if (fgeVar.i.c() && ((ege) hashMap2.get(fgeVar.i.a())).a == o6aVar3 && fgeVar.i.b()) {
                        fgeVar.A();
                        fgeVar.y();
                    }
                    q8a q8aVar3 = fgeVar.i;
                    if (q8aVar3 == null || q8aVar3.c()) {
                        return;
                    }
                    int size = hashMap2.size();
                    List list = fgeVar.i.a;
                    if (size < (list != null ? list.size() : 0)) {
                        return;
                    }
                    Iterator it = hashMap2.values().iterator();
                    while (it.hasNext()) {
                        if (!((ege) it.next()).d) {
                            return;
                        }
                    }
                    fgeVar.m = rk3Var5;
                    fgeVar.C(rk3Var5, new cge(bfb.a(sk3Var.b), 0));
                    int i = fgeVar.j + 1;
                    fgeVar.j = i;
                    List list2 = fgeVar.i.a;
                    if (i >= (list2 != null ? list2.size() : 0) || fgeVar.k) {
                        fgeVar.k = false;
                        fgeVar.j = 0;
                        f6aVar.C();
                    }
                }
            });
            o6aVar = l;
        }
        int ordinal = ((ege) hashMap.get(a)).b.ordinal();
        if (ordinal == 0) {
            if (this.o) {
                B();
                return;
            } else {
                o6aVar.K();
                return;
            }
        }
        if (ordinal == 1) {
            logger.warning("Requesting a connection even though we have a READY subchannel");
            return;
        }
        if (ordinal == 2) {
            this.i.b();
            y();
        } else {
            if (ordinal != 3) {
                return;
            }
            o6aVar.K();
            ((ege) hashMap.get(a)).a(rk3.a);
            B();
        }
    }

    @Override // defpackage.ffb
    public final void z() {
        Level level = Level.FINE;
        HashMap hashMap = this.h;
        p.log(level, "Shutting down, currently have {} subchannels created", Integer.valueOf(hashMap.size()));
        rk3 rk3Var = rk3.e;
        this.m = rk3Var;
        this.n = rk3Var;
        A();
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((ege) it.next()).a.L();
        }
        hashMap.clear();
    }
}
