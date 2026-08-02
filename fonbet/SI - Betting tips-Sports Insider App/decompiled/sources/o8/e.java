package o8;

import com.google.firebase.components.ComponentRegistrar;
import io.sentry.android.core.w0;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements c {

    /* renamed from: h, reason: collision with root package name */
    public static final com.google.firebase.messaging.n f21109h = new com.google.firebase.messaging.n(2);

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f21110a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f21111b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f21112c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f21113d;

    /* renamed from: e, reason: collision with root package name */
    public final j f21114e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f21115f;

    /* renamed from: g, reason: collision with root package name */
    public final md.o f21116g;

    public e(ArrayList arrayList, ArrayList arrayList2, md.o oVar) {
        p8.k kVar = p8.k.f21561a;
        this.f21110a = new HashMap();
        this.f21111b = new HashMap();
        this.f21112c = new HashMap();
        this.f21113d = new HashSet();
        this.f21115f = new AtomicReference();
        j jVar = new j();
        this.f21114e = jVar;
        this.f21116g = oVar;
        ArrayList arrayList3 = new ArrayList();
        int i5 = 1;
        arrayList3.add(b.c(jVar, j.class, x8.c.class, x8.b.class));
        arrayList3.add(b.c(this, e.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar != null) {
                arrayList3.add(bVar);
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
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((a9.a) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f21116g.d(componentRegistrar));
                        it3.remove();
                    }
                } catch (k e7) {
                    it3.remove();
                    w0.n("ComponentDiscovery", "Invalid component registrar.", e7);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array = ((b) it4.next()).f21103b.toArray();
                int length = array.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        Object obj = array[i10];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f21113d.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.f21113d.add(obj.toString());
                        }
                        i10++;
                    }
                }
            }
            if (this.f21110a.isEmpty()) {
                h8.b.j(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f21110a.keySet());
                arrayList6.addAll(arrayList3);
                h8.b.j(arrayList6);
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                b bVar2 = (b) it5.next();
                this.f21110a.put(bVar2, new l(new h8.c(i5, this, bVar2)));
            }
            arrayList5.addAll(h(arrayList3));
            arrayList5.addAll(i());
            f();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = (Boolean) this.f21115f.get();
        if (bool != null) {
            d(this.f21110a, bool.booleanValue());
        }
    }

    @Override // o8.c
    public final Object a(Class cls) {
        return g(p.a(cls));
    }

    @Override // o8.c
    public final Set b(p pVar) {
        a9.a aVar;
        synchronized (this) {
            aVar = (m) this.f21112c.get(pVar);
            if (aVar == null) {
                aVar = f21109h;
            }
        }
        return (Set) aVar.get();
    }

    @Override // o8.c
    public final synchronized a9.a c(p pVar) {
        io.sentry.config.a.b(pVar, "Null interface requested.");
        return (a9.a) this.f21111b.get(pVar);
    }

    public final void d(HashMap hashMap, boolean z5) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            b bVar = (b) entry.getKey();
            a9.a aVar = (a9.a) entry.getValue();
            int i5 = bVar.f21105d;
            if (i5 == 1 || (i5 == 2 && z5)) {
                aVar.get();
            }
        }
        j jVar = this.f21114e;
        synchronized (jVar) {
            try {
                arrayDeque = jVar.f21126b;
                if (arrayDeque != null) {
                    jVar.f21126b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    @Override // o8.c
    public final a9.a e(Class cls) {
        return c(p.a(cls));
    }

    public final void f() {
        for (b bVar : this.f21110a.keySet()) {
            for (h hVar : bVar.f21104c) {
                if (hVar.f21123b == 2 && !this.f21112c.containsKey(hVar.f21122a)) {
                    HashMap hashMap = this.f21112c;
                    p pVar = hVar.f21122a;
                    Set set = Collections.EMPTY_SET;
                    m mVar = new m();
                    mVar.f21132b = null;
                    mVar.f21131a = Collections.newSetFromMap(new ConcurrentHashMap());
                    mVar.f21131a.addAll(set);
                    hashMap.put(pVar, mVar);
                } else if (this.f21111b.containsKey(hVar.f21122a)) {
                    continue;
                } else {
                    int i5 = hVar.f21123b;
                    if (i5 == 1) {
                        throw new i("Unsatisfied dependency for component " + bVar + ": " + hVar.f21122a);
                    }
                    if (i5 != 2) {
                        HashMap hashMap2 = this.f21111b;
                        p pVar2 = hVar.f21122a;
                        io.sentry.clientreport.a aVar = n.f21133c;
                        com.google.firebase.messaging.n nVar = n.f21134d;
                        n nVar2 = new n();
                        nVar2.f21135a = aVar;
                        nVar2.f21136b = nVar;
                        hashMap2.put(pVar2, nVar2);
                    }
                }
            }
        }
    }

    @Override // o8.c
    public final Object g(p pVar) {
        a9.a c2 = c(pVar);
        if (c2 == null) {
            return null;
        }
        return c2.get();
    }

    public final ArrayList h(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f21106e == 0) {
                a9.a aVar = (a9.a) this.f21110a.get(bVar);
                for (p pVar : bVar.f21103b) {
                    HashMap hashMap = this.f21111b;
                    if (hashMap.containsKey(pVar)) {
                        arrayList2.add(new io.sentry.android.replay.util.c(15, (n) ((a9.a) hashMap.get(pVar)), aVar));
                    } else {
                        hashMap.put(pVar, aVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList i() {
        HashMap hashMap = this.f21112c;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : this.f21110a.entrySet()) {
            b bVar = (b) entry.getKey();
            if (bVar.f21106e != 0) {
                a9.a aVar = (a9.a) entry.getValue();
                for (p pVar : bVar.f21103b) {
                    if (!hashMap2.containsKey(pVar)) {
                        hashMap2.put(pVar, new HashSet());
                    }
                    ((Set) hashMap2.get(pVar)).add(aVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (hashMap.containsKey(entry2.getKey())) {
                m mVar = (m) hashMap.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new io.sentry.android.replay.util.c(16, mVar, (a9.a) it.next()));
                }
            } else {
                p pVar2 = (p) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                m mVar2 = new m();
                mVar2.f21132b = null;
                mVar2.f21131a = Collections.newSetFromMap(new ConcurrentHashMap());
                mVar2.f21131a.addAll(set);
                hashMap.put(pVar2, mVar2);
            }
        }
        return arrayList;
    }
}
