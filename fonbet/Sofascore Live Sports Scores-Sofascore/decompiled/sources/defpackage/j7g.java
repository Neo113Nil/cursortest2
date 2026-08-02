package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class j7g extends ffb {
    public static final Logger n = Logger.getLogger(j7g.class.getName());
    public final LinkedHashMap g;
    public final f6a h;
    public boolean i;
    public final jge j;
    public rk3 k;
    public final AtomicInteger l;
    public dfb m;

    public j7g(f6a f6aVar) {
        super(0);
        this.g = new LinkedHashMap();
        this.j = new jge();
        this.h = f6aVar;
        n.log(Level.FINE, "Created");
        this.l = new AtomicInteger(new Random().nextInt());
        this.m = new h7g();
    }

    public final wj9 A(cfb cfbVar) {
        LinkedHashMap linkedHashMap;
        oxc oxcVar;
        sp5 sp5Var;
        Level level = Level.FINE;
        Logger logger = n;
        logger.log(level, "Received resolution result: {0}", cfbVar);
        HashMap hashMap = new HashMap();
        List list = cfbVar.a;
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            linkedHashMap = this.g;
            if (!hasNext) {
                break;
            }
            oxc oxcVar2 = new oxc((sp5) it.next());
            nxc nxcVar = (nxc) linkedHashMap.get(oxcVar2);
            if (nxcVar != null) {
                hashMap.put(oxcVar2, nxcVar);
            } else {
                hashMap.put(oxcVar2, new nxc(this, oxcVar2, this.j, new cge(bfb.e, 1)));
            }
        }
        int i = 28;
        Object obj = null;
        if (hashMap.isEmpty()) {
            xei h = xei.m.h("NameResolver returned no usable address. " + cfbVar);
            o(h);
            return new wj9(i, h, obj);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            Object key = entry.getKey();
            jge jgeVar = ((nxc) entry.getValue()).c;
            ((nxc) entry.getValue()).getClass();
            if (linkedHashMap.containsKey(key)) {
                nxc nxcVar2 = (nxc) linkedHashMap.get(key);
                if (nxcVar2.f) {
                    nxcVar2.f = false;
                }
            } else {
                linkedHashMap.put(key, (nxc) entry.getValue());
            }
            nxc nxcVar3 = (nxc) linkedHashMap.get(key);
            if (key instanceof sp5) {
                oxcVar = new oxc((sp5) key);
            } else {
                z1a.r("key is wrong type", key instanceof oxc);
                oxcVar = (oxc) key;
            }
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    sp5Var = null;
                    break;
                }
                sp5Var = (sp5) it2.next();
                if (oxcVar.equals(new oxc(sp5Var))) {
                    break;
                }
            }
            z1a.y(sp5Var, key + " no longer present in load balancer children");
            sm0 sm0Var = sm0.b;
            List singletonList = Collections.singletonList(sp5Var);
            sm0 sm0Var2 = sm0.b;
            Boolean bool = Boolean.TRUE;
            IdentityHashMap identityHashMap = new IdentityHashMap(1);
            identityHashMap.put(ffb.f, bool);
            for (Map.Entry entry2 : sm0Var2.a.entrySet()) {
                if (!identityHashMap.containsKey(entry2.getKey())) {
                    identityHashMap.put((rm0) entry2.getKey(), entry2.getValue());
                }
            }
            cfb cfbVar2 = new cfb(singletonList, new sm0(identityHashMap), null);
            ((nxc) linkedHashMap.get(key)).getClass();
            if (!nxcVar3.f) {
                nxcVar3.b.p(cfbVar2);
            }
        }
        ArrayList arrayList = new ArrayList();
        av9 listIterator = hv9.v(linkedHashMap.keySet()).listIterator(0);
        while (listIterator.hasNext()) {
            Object next = listIterator.next();
            if (!hashMap.containsKey(next)) {
                nxc nxcVar4 = (nxc) linkedHashMap.get(next);
                oxc oxcVar3 = nxcVar4.a;
                if (!nxcVar4.f) {
                    nxcVar4.g.g.remove(oxcVar3);
                    nxcVar4.f = true;
                    logger.log(Level.FINE, "Child balancer {0} deactivated", oxcVar3);
                }
                arrayList.add(nxcVar4);
            }
        }
        return new wj9(i, xei.e, arrayList);
    }

    public final i7g B(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((nxc) it.next()).e);
        }
        return new i7g(arrayList, this.l);
    }

    public final void C(rk3 rk3Var, dfb dfbVar) {
        if (rk3Var == this.k && dfbVar.equals(this.m)) {
            return;
        }
        this.h.M(rk3Var, dfbVar);
        this.k = rk3Var;
        this.m = dfbVar;
    }

    public final void D() {
        rk3 rk3Var;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = this.g;
        Iterator it = linkedHashMap.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            rk3Var = rk3.b;
            if (!hasNext) {
                break;
            }
            nxc nxcVar = (nxc) it.next();
            if (!nxcVar.f && nxcVar.d == rk3Var) {
                arrayList.add(nxcVar);
            }
        }
        if (!arrayList.isEmpty()) {
            C(rk3Var, B(arrayList));
            return;
        }
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            rk3 rk3Var2 = ((nxc) it2.next()).d;
            rk3 rk3Var3 = rk3.a;
            if (rk3Var2 == rk3Var3 || rk3Var2 == rk3.d) {
                C(rk3Var3, new h7g());
                return;
            }
        }
        C(rk3.c, B(linkedHashMap.values()));
    }

    @Override // defpackage.ffb
    public final xei a(cfb cfbVar) {
        try {
            this.i = true;
            wj9 A = A(cfbVar);
            xei xeiVar = (xei) A.b;
            if (!xeiVar.f()) {
                return xeiVar;
            }
            D();
            for (nxc nxcVar : (List) A.c) {
                nxcVar.b.z();
                nxcVar.d = rk3.e;
                n.log(Level.FINE, "Child balancer {0} deleted", nxcVar.a);
            }
            return xeiVar;
        } finally {
            this.i = false;
        }
    }

    @Override // defpackage.ffb
    public final void o(xei xeiVar) {
        if (this.k != rk3.b) {
            this.h.M(rk3.c, new cge(bfb.a(xeiVar), 1));
        }
    }

    @Override // defpackage.ffb
    public final void z() {
        Level level = Level.FINE;
        Logger logger = n;
        logger.log(level, "Shutdown");
        LinkedHashMap linkedHashMap = this.g;
        for (nxc nxcVar : linkedHashMap.values()) {
            nxcVar.b.z();
            nxcVar.d = rk3.e;
            logger.log(Level.FINE, "Child balancer {0} deleted", nxcVar.a);
        }
        linkedHashMap.clear();
    }
}
