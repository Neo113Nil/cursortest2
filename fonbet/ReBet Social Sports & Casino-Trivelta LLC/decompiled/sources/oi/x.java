package oi;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes5.dex */
public abstract class x implements u {

    /* renamed from: f, reason: collision with root package name */
    public static final List f61291f = new CopyOnWriteArrayList();

    /* renamed from: g, reason: collision with root package name */
    public static final ReferenceQueue f61292g = new ReferenceQueue();

    /* renamed from: a, reason: collision with root package name */
    public final Class f61293a;

    /* renamed from: b, reason: collision with root package name */
    public final u f61294b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f61295c;

    /* renamed from: d, reason: collision with root package name */
    public final List f61296d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f61297e;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Class f61298a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f61299b;

        /* renamed from: c, reason: collision with root package name */
        public final u f61300c;

        /* renamed from: d, reason: collision with root package name */
        public final Map f61301d;

        /* renamed from: e, reason: collision with root package name */
        public final List f61302e;

        public a(Class cls, u uVar) {
            if (uVar == null) {
                throw new NullPointerException("Missing chronological merger.");
            }
            this.f61298a = cls;
            this.f61299b = cls.getName().startsWith("net.time4j.");
            this.f61300c = uVar;
            this.f61301d = new HashMap();
            this.f61302e = new ArrayList();
        }

        public a a(p pVar, z zVar) {
            c(pVar);
            this.f61301d.put(pVar, zVar);
            return this;
        }

        public a b(s sVar) {
            if (sVar == null) {
                throw new NullPointerException("Missing chronological extension.");
            }
            if (!this.f61302e.contains(sVar)) {
                this.f61302e.add(sVar);
            }
            return this;
        }

        public final void c(p pVar) {
            if (this.f61299b) {
                return;
            }
            if (pVar == null) {
                throw new NullPointerException("Static initialization problem: Check if given element statically refer to any chronology causing premature class loading.");
            }
            String name = pVar.name();
            for (p pVar2 : this.f61301d.keySet()) {
                if (pVar2.equals(pVar) || pVar2.name().equals(name)) {
                    throw new IllegalArgumentException("Element duplicate found: " + name);
                }
            }
        }
    }

    public static class b extends WeakReference {

        /* renamed from: a, reason: collision with root package name */
        public final String f61303a;

        public b(x xVar, ReferenceQueue referenceQueue) {
            super(xVar, referenceQueue);
            this.f61303a = xVar.f61293a.getName();
        }
    }

    public x(Class cls, u uVar, Map map, List list) {
        if (cls == null) {
            throw new NullPointerException("Missing chronological type.");
        }
        if (uVar == null) {
            throw new NullPointerException("Missing chronological merger.");
        }
        this.f61293a = cls;
        this.f61294b = uVar;
        Map unmodifiableMap = Collections.unmodifiableMap(map);
        this.f61295c = unmodifiableMap;
        this.f61296d = Collections.unmodifiableList(list);
        HashMap hashMap = new HashMap();
        for (p pVar : unmodifiableMap.keySet()) {
            if (pVar.getType() == Integer.class) {
                Object obj = this.f61295c.get(pVar);
                if (obj instanceof InterfaceC5902C) {
                    hashMap.put(pVar, (InterfaceC5902C) obj);
                }
            }
        }
        this.f61297e = Collections.unmodifiableMap(hashMap);
    }

    public static void A() {
        while (true) {
            b bVar = (b) f61292g.poll();
            if (bVar == null) {
                return;
            }
            Iterator it = f61291f.iterator();
            while (true) {
                if (it.hasNext()) {
                    b bVar2 = (b) it.next();
                    if (bVar2.f61303a.equals(bVar.f61303a)) {
                        f61291f.remove(bVar2);
                        break;
                    }
                }
            }
        }
    }

    public static void B(x xVar) {
        f61291f.add(new b(xVar, f61292g));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static x z(Class cls) {
        x xVar;
        try {
            Class.forName(cls.getName(), true, cls.getClassLoader());
            Iterator it = f61291f.iterator();
            boolean z10 = false;
            while (true) {
                if (!it.hasNext()) {
                    xVar = null;
                    break;
                }
                xVar = (x) ((b) it.next()).get();
                if (xVar == null) {
                    z10 = true;
                } else if (xVar.r() == cls) {
                    break;
                }
            }
            if (z10) {
                A();
            }
            return (x) p(xVar);
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // oi.u
    public F b() {
        return this.f61294b.b();
    }

    @Override // oi.u
    public x d() {
        return this.f61294b.d();
    }

    @Override // oi.u
    public Object e(q qVar, InterfaceC5908d interfaceC5908d, boolean z10, boolean z11) {
        return this.f61294b.e(qVar, interfaceC5908d, z10, z11);
    }

    @Override // oi.u
    public int h() {
        return this.f61294b.h();
    }

    @Override // oi.u
    public o i(Object obj, InterfaceC5908d interfaceC5908d) {
        return this.f61294b.i(obj, interfaceC5908d);
    }

    @Override // oi.u
    public String n(y yVar, Locale locale) {
        return this.f61294b.n(yVar, locale);
    }

    public InterfaceC5915k q() {
        throw new r("Calendar system is not available.");
    }

    public Class r() {
        return this.f61293a;
    }

    public final z s(p pVar, boolean z10) {
        if (!(pVar instanceof AbstractC5909e) || !q.class.isAssignableFrom(r())) {
            return null;
        }
        AbstractC5909e abstractC5909e = (AbstractC5909e) AbstractC5909e.class.cast(pVar);
        String u10 = z10 ? abstractC5909e.u(this) : null;
        if (u10 == null) {
            return (z) p(abstractC5909e.r((x) p(this)));
        }
        throw new C5904E(u10);
    }

    public List t() {
        return this.f61296d;
    }

    public InterfaceC5902C u(p pVar) {
        return (InterfaceC5902C) this.f61297e.get(pVar);
    }

    public Set v() {
        return this.f61295c.keySet();
    }

    public z w(p pVar) {
        if (pVar == null) {
            throw new NullPointerException("Missing chronological element.");
        }
        z zVar = (z) this.f61295c.get(pVar);
        if (zVar == null && (zVar = s(pVar, true)) == null) {
            throw new C5904E(this, pVar);
        }
        return (z) p(zVar);
    }

    public boolean x(p pVar) {
        return pVar != null && this.f61295c.containsKey(pVar);
    }

    public boolean y(p pVar) {
        if (pVar == null) {
            return false;
        }
        return x(pVar) || s(pVar, false) != null;
    }

    public static Object p(Object obj) {
        return obj;
    }
}
