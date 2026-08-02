package n8;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import q8.InterfaceC8996a;
import y8.InterfaceC10861a;

/* loaded from: classes.dex */
public final class l implements InterfaceC8452b, InterfaceC8996a {

    /* renamed from: h, reason: collision with root package name */
    private static final g f76586h = new g();

    /* renamed from: e, reason: collision with root package name */
    private final p f76591e;

    /* renamed from: g, reason: collision with root package name */
    private final f f76593g;

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f76587a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f76588b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f76589c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private HashSet f76590d = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference<Boolean> f76592f = new AtomicReference<>();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Executor f76594a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f76595b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList f76596c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private f f76597d = f.f76578g0;

        a(Executor executor) {
            this.f76594a = executor;
        }

        public final void a(C8451a c8451a) {
            this.f76596c.add(c8451a);
        }

        public final void b(final ComponentRegistrar componentRegistrar) {
            this.f76595b.add(new InterfaceC10861a() { // from class: n8.k
                @Override // y8.InterfaceC10861a
                public final Object get() {
                    return ComponentRegistrar.this;
                }
            });
        }

        public final void c(ArrayList arrayList) {
            this.f76595b.addAll(arrayList);
        }

        public final l d() {
            return new l(this.f76594a, this.f76595b, this.f76596c, this.f76597d);
        }

        public final void e(I8.b bVar) {
            this.f76597d = bVar;
        }
    }

    l(Executor executor, ArrayList arrayList, ArrayList arrayList2, f fVar) {
        p pVar = new p(executor);
        this.f76591e = pVar;
        this.f76593g = fVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(C8451a.n(pVar, p.class, v8.d.class, v8.c.class));
        arrayList3.add(C8451a.n(this, InterfaceC8996a.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C8451a c8451a = (C8451a) it.next();
            if (c8451a != null) {
                arrayList3.add(c8451a);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((InterfaceC10861a) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f76593g.c(componentRegistrar));
                        it3.remove();
                    }
                } catch (q e11) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e11);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array = ((C8451a) it4.next()).h().toArray();
                int length = array.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length) {
                        Object obj = array[i11];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f76590d.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.f76590d.add(obj.toString());
                        }
                        i11++;
                    }
                }
            }
            if (this.f76587a.isEmpty()) {
                m.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f76587a.keySet());
                arrayList6.addAll(arrayList3);
                m.a(arrayList6);
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                final C8451a c8451a2 = (C8451a) it5.next();
                this.f76587a.put(c8451a2, new r(new InterfaceC10861a() { // from class: n8.h
                    @Override // y8.InterfaceC10861a
                    public final Object get() {
                        l lVar = l.this;
                        lVar.getClass();
                        C8451a c8451a3 = c8451a2;
                        return c8451a3.f().a(new x(c8451a3, lVar));
                    }
                }));
            }
            arrayList5.addAll(k(arrayList3));
            arrayList5.addAll(l());
            j();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = this.f76592f.get();
        if (bool != null) {
            h(this.f76587a, bool.booleanValue());
        }
    }

    public static a g(Executor executor) {
        return new a(executor);
    }

    private void h(HashMap hashMap, boolean z11) {
        for (Map.Entry entry : hashMap.entrySet()) {
            C8451a c8451a = (C8451a) entry.getKey();
            InterfaceC10861a interfaceC10861a = (InterfaceC10861a) entry.getValue();
            if (c8451a.k() || (c8451a.l() && z11)) {
                interfaceC10861a.get();
            }
        }
        this.f76591e.c();
    }

    private void j() {
        for (C8451a c8451a : this.f76587a.keySet()) {
            for (n nVar : c8451a.e()) {
                if (nVar.e()) {
                    w<?> a11 = nVar.a();
                    HashMap hashMap = this.f76589c;
                    if (!hashMap.containsKey(a11)) {
                        hashMap.put(nVar.a(), s.b(Collections.EMPTY_SET));
                    }
                }
                w<?> a12 = nVar.a();
                HashMap hashMap2 = this.f76588b;
                if (hashMap2.containsKey(a12)) {
                    continue;
                } else {
                    if (nVar.d()) {
                        throw new t("Unsatisfied dependency for component " + c8451a + ": " + nVar.a());
                    }
                    if (!nVar.e()) {
                        hashMap2.put(nVar.a(), v.a());
                    }
                }
            }
        }
    }

    private ArrayList k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C8451a c8451a = (C8451a) it.next();
            if (c8451a.m()) {
                final InterfaceC10861a interfaceC10861a = (InterfaceC10861a) this.f76587a.get(c8451a);
                for (w wVar : c8451a.h()) {
                    HashMap hashMap = this.f76588b;
                    if (hashMap.containsKey(wVar)) {
                        final v vVar = (v) ((InterfaceC10861a) hashMap.get(wVar));
                        arrayList2.add(new Runnable() { // from class: n8.i
                            @Override // java.lang.Runnable
                            public final void run() {
                                v.this.b(interfaceC10861a);
                            }
                        });
                    } else {
                        hashMap.put(wVar, interfaceC10861a);
                    }
                }
            }
        }
        return arrayList2;
    }

    private ArrayList l() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f76587a.entrySet()) {
            C8451a c8451a = (C8451a) entry.getKey();
            if (!c8451a.m()) {
                InterfaceC10861a interfaceC10861a = (InterfaceC10861a) entry.getValue();
                for (w wVar : c8451a.h()) {
                    if (!hashMap.containsKey(wVar)) {
                        hashMap.put(wVar, new HashSet());
                    }
                    ((Set) hashMap.get(wVar)).add(interfaceC10861a);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            Object key = entry2.getKey();
            HashMap hashMap2 = this.f76589c;
            if (hashMap2.containsKey(key)) {
                final s sVar = (s) hashMap2.get(entry2.getKey());
                for (final InterfaceC10861a interfaceC10861a2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: n8.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            s.this.a(interfaceC10861a2);
                        }
                    });
                }
            } else {
                hashMap2.put((w) entry2.getKey(), s.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override // n8.InterfaceC8452b
    public final synchronized <T> InterfaceC10861a<T> b(w<T> wVar) {
        Hj0.r.a(wVar, "Null interface requested.");
        return (InterfaceC10861a) this.f76588b.get(wVar);
    }

    @Override // n8.InterfaceC8452b
    public final synchronized <T> InterfaceC10861a<Set<T>> f(w<T> wVar) {
        s sVar = (s) this.f76589c.get(wVar);
        if (sVar != null) {
            return sVar;
        }
        return f76586h;
    }

    public final void i(boolean z11) {
        HashMap hashMap;
        AtomicReference<Boolean> atomicReference = this.f76592f;
        Boolean valueOf = Boolean.valueOf(z11);
        while (!atomicReference.compareAndSet(null, valueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            hashMap = new HashMap(this.f76587a);
        }
        h(hashMap, z11);
    }
}
