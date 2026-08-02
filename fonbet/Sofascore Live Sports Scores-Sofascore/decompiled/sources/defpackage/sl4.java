package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class sl4 {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public jz8 c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public ggf h;
    public uvd i;
    public pf2 j;
    public Class k;
    public boolean l;
    public boolean m;
    public pia n;
    public k7f o;
    public t35 p;
    public boolean q;
    public boolean r;

    public final ArrayList a() {
        boolean z = this.m;
        ArrayList arrayList = this.b;
        if (!z) {
            this.m = true;
            arrayList.clear();
            ArrayList b = b();
            int size = b.size();
            for (int i = 0; i < size; i++) {
                ntc ntcVar = (ntc) b.get(i);
                pia piaVar = ntcVar.a;
                List list = Collections.EMPTY_LIST;
                if (!arrayList.contains(piaVar)) {
                    arrayList.add(ntcVar.a);
                }
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (!arrayList.contains(list.get(i2))) {
                        arrayList.add((pia) list.get(i2));
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z = this.l;
        ArrayList arrayList = this.a;
        if (!z) {
            this.l = true;
            arrayList.clear();
            List f = this.c.a().f(this.d);
            int size = f.size();
            for (int i = 0; i < size; i++) {
                ntc a = ((otc) f.get(i)).a(this.d, this.e, this.f, this.i);
                if (a != null) {
                    arrayList.add(a);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final mfb c(Class cls) {
        mfb mfbVar;
        Class cls2;
        Class cls3;
        Class cls4;
        mfb mfbVar2;
        ArrayList arrayList;
        w1g w1gVar;
        Class cls5 = cls;
        ovf a = this.c.a();
        Class cls6 = this.g;
        Class cls7 = this.k;
        nfb nfbVar = a.i;
        pxc pxcVar = (pxc) nfbVar.b.getAndSet(null);
        if (pxcVar == null) {
            pxcVar = new pxc();
        }
        pxcVar.a = cls5;
        pxcVar.b = cls6;
        pxcVar.c = cls7;
        synchronized (nfbVar.a) {
            mfbVar = (mfb) nfbVar.a.get(pxcVar);
        }
        nfbVar.b.set(pxcVar);
        a.i.getClass();
        if (nfb.c.equals(mfbVar)) {
            return null;
        }
        if (mfbVar != null) {
            return mfbVar;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = a.c.c(cls5, cls6).iterator();
        while (it.hasNext()) {
            Class<?> cls8 = (Class) it.next();
            Iterator it2 = a.f.c(cls8, cls7).iterator();
            while (it2.hasNext()) {
                Class cls9 = (Class) it2.next();
                fp3 fp3Var = a.c;
                synchronized (fp3Var) {
                    arrayList = new ArrayList();
                    Iterator it3 = fp3Var.a.iterator();
                    while (it3.hasNext()) {
                        List<k1g> list = (List) fp3Var.b.get((String) it3.next());
                        if (list != null) {
                            for (k1g k1gVar : list) {
                                if (k1gVar.a.isAssignableFrom(cls5) && cls8.isAssignableFrom(k1gVar.b)) {
                                    arrayList.add(k1gVar.c);
                                }
                            }
                        }
                    }
                }
                xl1 xl1Var = a.f;
                synchronized (xl1Var) {
                    if (!cls9.isAssignableFrom(cls8)) {
                        Iterator it4 = xl1Var.b.iterator();
                        while (it4.hasNext()) {
                            bvj bvjVar = (bvj) it4.next();
                            if (bvjVar.a.isAssignableFrom(cls8) && cls9.isAssignableFrom(bvjVar.b)) {
                                w1gVar = bvjVar.c;
                            } else {
                                cls5 = cls;
                            }
                        }
                        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls8 + " to " + cls9);
                    }
                    w1gVar = f8h.j;
                }
                arrayList2.add(new ul4(cls5, cls8, cls9, arrayList, w1gVar, a.j));
                cls5 = cls;
            }
            cls5 = cls;
        }
        if (arrayList2.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            mfbVar2 = null;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            mfbVar2 = new mfb(cls2, cls3, cls4, arrayList2, a.j);
        }
        nfb nfbVar2 = a.i;
        synchronized (nfbVar2.a) {
            nfbVar2.a.put(new pxc(cls2, cls3, cls4), mfbVar2 != null ? mfbVar2 : nfb.c);
        }
        return mfbVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        r0 = r2.b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final gn5 d(Object obj) {
        gn5 gn5Var;
        zl1 zl1Var = this.c.a().b;
        Class<?> cls = obj.getClass();
        synchronized (zl1Var) {
            Iterator it = zl1Var.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    gn5Var = null;
                    break;
                }
                jn5 jn5Var = (jn5) it.next();
                if (jn5Var.a.isAssignableFrom(cls)) {
                    break;
                }
            }
        }
        if (gn5Var != null) {
            return gn5Var;
        }
        throw new nvf(ljg.l(obj.getClass(), "Failed to find source encoder for data class: "));
    }

    public final bwj e(Class cls) {
        bwj bwjVar = (bwj) this.j.get(cls);
        if (bwjVar == null) {
            Iterator it = ((yg0) this.j.entrySet()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    bwjVar = (bwj) entry.getValue();
                    break;
                }
            }
        }
        if (bwjVar != null) {
            return bwjVar;
        }
        if (!this.j.isEmpty() || !this.q) {
            return abk.b;
        }
        sw9.o(cls, ". If you wish to ignore unknown resource types, use the optional transformation methods.", "Missing transformation for ");
        return null;
    }
}
