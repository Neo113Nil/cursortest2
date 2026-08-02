package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ovf {
    public final wj9 a;
    public final zl1 b;
    public final fp3 c;
    public final t50 d;
    public final je4 e;
    public final xl1 f;
    public final ef0 g;
    public final wj9 h = new wj9(27);
    public final nfb i = new nfb();
    public final sx2 j;

    public ovf() {
        sx2 sx2Var = new sx2(false, new t0f(20), new kpg(22), new dti(22));
        this.j = sx2Var;
        this.a = new wj9(sx2Var);
        this.b = new zl1(2);
        this.c = new fp3(1);
        this.d = new t50();
        this.e = new je4(0);
        this.f = new xl1(3);
        this.g = new ef0(2);
        List asList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        fp3 fp3Var = this.c;
        synchronized (fp3Var) {
            try {
                ArrayList arrayList2 = new ArrayList(fp3Var.a);
                fp3Var.a.clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    fp3Var.a.add((String) it2.next());
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    String str = (String) it3.next();
                    if (!arrayList.contains(str)) {
                        fp3Var.a.add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Class cls, gn5 gn5Var) {
        zl1 zl1Var = this.b;
        synchronized (zl1Var) {
            zl1Var.b.add(new jn5(cls, gn5Var));
        }
    }

    public final void b(Class cls, m1g m1gVar) {
        t50 t50Var = this.d;
        synchronized (t50Var) {
            t50Var.b.add(new n1g(cls, m1gVar));
        }
    }

    public final void c(Class cls, Class cls2, ptc ptcVar) {
        wj9 wj9Var = this.a;
        synchronized (wj9Var) {
            ((l2a) wj9Var.b).a(cls, cls2, ptcVar);
            ((HashMap) ((yia) wj9Var.c).b).clear();
        }
    }

    public final void d(String str, Class cls, Class cls2, j1g j1gVar) {
        fp3 fp3Var = this.c;
        synchronized (fp3Var) {
            fp3Var.b(str).add(new k1g(cls, cls2, j1gVar));
        }
    }

    public final ArrayList e() {
        ArrayList arrayList;
        ef0 ef0Var = this.g;
        synchronized (ef0Var) {
            arrayList = ef0Var.a;
        }
        if (arrayList.isEmpty()) {
            throw new nvf("Failed to find image header parser.");
        }
        return arrayList;
    }

    public final List f(Object obj) {
        List list;
        wj9 wj9Var = this.a;
        wj9Var.getClass();
        Class<?> cls = obj.getClass();
        synchronized (wj9Var) {
            qtc qtcVar = (qtc) ((HashMap) ((yia) wj9Var.c).b).get(cls);
            list = qtcVar == null ? null : qtcVar.a;
            if (list == null) {
                list = Collections.unmodifiableList(((l2a) wj9Var.b).d(cls));
                if (((qtc) ((HashMap) ((yia) wj9Var.c).b).put(cls, new qtc(list))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (list.isEmpty()) {
            throw new nvf("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = list.size();
        List list2 = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            otc otcVar = (otc) list.get(i);
            if (otcVar.b(obj)) {
                if (z) {
                    list2 = new ArrayList(size - i);
                    z = false;
                }
                list2.add(otcVar);
            }
        }
        if (!list2.isEmpty()) {
            return list2;
        }
        throw new nvf("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
    }

    public final ie4 g(Object obj) {
        ie4 build;
        je4 je4Var = this.e;
        synchronized (je4Var) {
            try {
                w1a.l(obj);
                he4 he4Var = (he4) je4Var.a.get(obj.getClass());
                if (he4Var == null) {
                    Iterator it = je4Var.a.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        he4 he4Var2 = (he4) it.next();
                        if (he4Var2.c().isAssignableFrom(obj.getClass())) {
                            he4Var = he4Var2;
                            break;
                        }
                    }
                }
                if (he4Var == null) {
                    he4Var = je4.b;
                }
                build = he4Var.build(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return build;
    }

    public final void h(he4 he4Var) {
        je4 je4Var = this.e;
        synchronized (je4Var) {
            je4Var.a.put(he4Var.c(), he4Var);
        }
    }

    public final void i(Class cls, Class cls2, w1g w1gVar) {
        xl1 xl1Var = this.f;
        synchronized (xl1Var) {
            xl1Var.b.add(new bvj(cls, cls2, w1gVar));
        }
    }
}
