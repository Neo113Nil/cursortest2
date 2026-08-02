package mb;

import android.util.Log;
import androidx.lifecycle.AbstractC2177b;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import mb.n;
import pb.InterfaceC6060a;
import tb.InterfaceC6458c;
import tb.InterfaceC6459d;
import wb.InterfaceC6736b;

/* loaded from: classes3.dex */
public class n implements InterfaceC5577d, InterfaceC6060a {

    /* renamed from: i, reason: collision with root package name */
    public static final InterfaceC6736b f56462i = new InterfaceC6736b() { // from class: mb.j
        @Override // wb.InterfaceC6736b
        public final Object get() {
            return Collections.EMPTY_SET;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final Map f56463a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f56464b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f56465c;

    /* renamed from: d, reason: collision with root package name */
    public final List f56466d;

    /* renamed from: e, reason: collision with root package name */
    public Set f56467e;

    /* renamed from: f, reason: collision with root package name */
    public final u f56468f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f56469g;

    /* renamed from: h, reason: collision with root package name */
    public final i f56470h;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Executor f56471a;

        /* renamed from: b, reason: collision with root package name */
        public final List f56472b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public final List f56473c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        public i f56474d = i.f56455a;

        public b(Executor executor) {
            this.f56471a = executor;
        }

        public static /* synthetic */ ComponentRegistrar a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        public b b(C5576c c5576c) {
            this.f56473c.add(c5576c);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.f56472b.add(new InterfaceC6736b() { // from class: mb.o
                @Override // wb.InterfaceC6736b
                public final Object get() {
                    return n.b.a(ComponentRegistrar.this);
                }
            });
            return this;
        }

        public b d(Collection collection) {
            this.f56472b.addAll(collection);
            return this;
        }

        public n e() {
            return new n(this.f56471a, this.f56472b, this.f56473c, this.f56474d);
        }

        public b f(i iVar) {
            this.f56474d = iVar;
            return this;
        }
    }

    public static /* synthetic */ Object h(n nVar, C5576c c5576c) {
        nVar.getClass();
        return c5576c.h().a(new E(c5576c, nVar));
    }

    public static b k(Executor executor) {
        return new b(executor);
    }

    public static List o(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @Override // mb.InterfaceC5577d
    public synchronized InterfaceC6736b b(D d10) {
        x xVar = (x) this.f56465c.get(d10);
        if (xVar != null) {
            return xVar;
        }
        return f56462i;
    }

    @Override // mb.InterfaceC5577d
    public synchronized InterfaceC6736b g(D d10) {
        AbstractC5573C.c(d10, "Null interface requested.");
        return (InterfaceC6736b) this.f56464b.get(d10);
    }

    public final void l(List list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f56466d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((InterfaceC6736b) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f56470h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (v e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = ((C5576c) it2.next()).j().toArray();
                int length = array.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        Object obj = array[i10];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f56467e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f56467e.add(obj.toString());
                        }
                        i10++;
                    }
                }
            }
            if (this.f56463a.isEmpty()) {
                p.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f56463a.keySet());
                arrayList2.addAll(list);
                p.a(arrayList2);
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                final C5576c c5576c = (C5576c) it3.next();
                this.f56463a.put(c5576c, new w(new InterfaceC6736b() { // from class: mb.k
                    @Override // wb.InterfaceC6736b
                    public final Object get() {
                        return n.h(n.this, c5576c);
                    }
                }));
            }
            arrayList.addAll(r(list));
            arrayList.addAll(s());
            q();
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        p();
    }

    public final void m(Map map, boolean z10) {
        for (Map.Entry entry : map.entrySet()) {
            C5576c c5576c = (C5576c) entry.getKey();
            InterfaceC6736b interfaceC6736b = (InterfaceC6736b) entry.getValue();
            if (c5576c.n() || (c5576c.o() && z10)) {
                interfaceC6736b.get();
            }
        }
        this.f56468f.f();
    }

    public void n(boolean z10) {
        HashMap hashMap;
        if (AbstractC2177b.a(this.f56469g, null, Boolean.valueOf(z10))) {
            synchronized (this) {
                hashMap = new HashMap(this.f56463a);
            }
            m(hashMap, z10);
        }
    }

    public final void p() {
        Boolean bool = (Boolean) this.f56469g.get();
        if (bool != null) {
            m(this.f56463a, bool.booleanValue());
        }
    }

    public final void q() {
        for (C5576c c5576c : this.f56463a.keySet()) {
            for (q qVar : c5576c.g()) {
                if (qVar.f() && !this.f56465c.containsKey(qVar.b())) {
                    this.f56465c.put(qVar.b(), x.b(Collections.EMPTY_SET));
                } else if (this.f56464b.containsKey(qVar.b())) {
                    continue;
                } else {
                    if (qVar.e()) {
                        throw new y(String.format("Unsatisfied dependency for component %s: %s", c5576c, qVar.b()));
                    }
                    if (!qVar.f()) {
                        this.f56464b.put(qVar.b(), C5572B.c());
                    }
                }
            }
        }
    }

    public final List r(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5576c c5576c = (C5576c) it.next();
            if (c5576c.p()) {
                final InterfaceC6736b interfaceC6736b = (InterfaceC6736b) this.f56463a.get(c5576c);
                for (D d10 : c5576c.j()) {
                    if (this.f56464b.containsKey(d10)) {
                        final C5572B c5572b = (C5572B) ((InterfaceC6736b) this.f56464b.get(d10));
                        arrayList.add(new Runnable() { // from class: mb.l
                            @Override // java.lang.Runnable
                            public final void run() {
                                C5572B.this.d(interfaceC6736b);
                            }
                        });
                    } else {
                        this.f56464b.put(d10, interfaceC6736b);
                    }
                }
            }
        }
        return arrayList;
    }

    public final List s() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f56463a.entrySet()) {
            C5576c c5576c = (C5576c) entry.getKey();
            if (!c5576c.p()) {
                InterfaceC6736b interfaceC6736b = (InterfaceC6736b) entry.getValue();
                for (D d10 : c5576c.j()) {
                    if (!hashMap.containsKey(d10)) {
                        hashMap.put(d10, new HashSet());
                    }
                    ((Set) hashMap.get(d10)).add(interfaceC6736b);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (this.f56465c.containsKey(entry2.getKey())) {
                final x xVar = (x) this.f56465c.get(entry2.getKey());
                for (final InterfaceC6736b interfaceC6736b2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: mb.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            x.this.a(interfaceC6736b2);
                        }
                    });
                }
            } else {
                this.f56465c.put((D) entry2.getKey(), x.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    public n(Executor executor, Iterable iterable, Collection collection, i iVar) {
        this.f56463a = new HashMap();
        this.f56464b = new HashMap();
        this.f56465c = new HashMap();
        this.f56467e = new HashSet();
        this.f56469g = new AtomicReference();
        u uVar = new u(executor);
        this.f56468f = uVar;
        this.f56470h = iVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C5576c.q(uVar, u.class, InterfaceC6459d.class, InterfaceC6458c.class));
        arrayList.add(C5576c.q(this, InterfaceC6060a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C5576c c5576c = (C5576c) it.next();
            if (c5576c != null) {
                arrayList.add(c5576c);
            }
        }
        this.f56466d = o(iterable);
        l(arrayList);
    }
}
