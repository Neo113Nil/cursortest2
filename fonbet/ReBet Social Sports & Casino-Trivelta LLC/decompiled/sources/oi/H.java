package oi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import oi.x;

/* loaded from: classes5.dex */
public final class H extends x implements I {

    /* renamed from: h, reason: collision with root package name */
    public final Class f61262h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f61263i;

    /* renamed from: j, reason: collision with root package name */
    public final Map f61264j;

    /* renamed from: k, reason: collision with root package name */
    public final Map f61265k;

    /* renamed from: l, reason: collision with root package name */
    public final Map f61266l;

    /* renamed from: m, reason: collision with root package name */
    public final K f61267m;

    /* renamed from: n, reason: collision with root package name */
    public final K f61268n;

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC5915k f61269o;

    /* renamed from: p, reason: collision with root package name */
    public final p f61270p;

    /* renamed from: q, reason: collision with root package name */
    public final I f61271q;

    public class a implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f61272a;

        public a(Map map) {
            this.f61272a = map;
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return Double.compare(H.H(this.f61272a, obj), H.H(this.f61272a, obj2));
        }
    }

    public static final class b extends x.a {

        /* renamed from: f, reason: collision with root package name */
        public final Class f61274f;

        /* renamed from: g, reason: collision with root package name */
        public final Map f61275g;

        /* renamed from: h, reason: collision with root package name */
        public final Map f61276h;

        /* renamed from: i, reason: collision with root package name */
        public final Map f61277i;

        /* renamed from: j, reason: collision with root package name */
        public final Map f61278j;

        /* renamed from: k, reason: collision with root package name */
        public final K f61279k;

        /* renamed from: l, reason: collision with root package name */
        public final K f61280l;

        /* renamed from: m, reason: collision with root package name */
        public final InterfaceC5915k f61281m;

        /* renamed from: n, reason: collision with root package name */
        public I f61282n;

        public b(Class cls, Class cls2, u uVar, K k10, K k11, InterfaceC5915k interfaceC5915k, I i10) {
            super(cls2, uVar);
            this.f61282n = null;
            if (cls == null) {
                throw new NullPointerException("Missing unit type.");
            }
            if (k10 == null) {
                throw new NullPointerException("Missing minimum of range.");
            }
            if (k11 == null) {
                throw new NullPointerException("Missing maximum of range.");
            }
            if (AbstractC5917m.class.isAssignableFrom(cls2) && interfaceC5915k == null) {
                throw new NullPointerException("Missing calendar system.");
            }
            this.f61274f = cls;
            this.f61275g = new HashMap();
            this.f61276h = new HashMap();
            this.f61277i = new HashMap();
            this.f61278j = new HashMap();
            this.f61279k = k10;
            this.f61280l = k11;
            this.f61281m = interfaceC5915k;
            this.f61282n = i10;
        }

        public static b j(Class cls, Class cls2, u uVar, InterfaceC5915k interfaceC5915k) {
            b bVar = new b(cls, cls2, uVar, (K) interfaceC5915k.b(interfaceC5915k.d()), (K) interfaceC5915k.b(interfaceC5915k.a()), interfaceC5915k, null);
            for (EnumC5900A enumC5900A : EnumC5900A.values()) {
                bVar.d(enumC5900A, enumC5900A.d(interfaceC5915k));
            }
            return bVar;
        }

        public static b k(Class cls, Class cls2, u uVar, K k10, K k11) {
            return new b(cls, cls2, uVar, k10, k11, null, null);
        }

        public b d(p pVar, z zVar) {
            super.a(pVar, zVar);
            return this;
        }

        public b e(p pVar, z zVar, Object obj) {
            if (obj == null) {
                throw new NullPointerException("Missing base unit.");
            }
            super.a(pVar, zVar);
            this.f61278j.put(pVar, obj);
            return this;
        }

        public b f(s sVar) {
            super.b(sVar);
            return this;
        }

        public b g(Object obj, M m10, double d10, Set set) {
            if (obj == null) {
                throw new NullPointerException("Missing time unit.");
            }
            if (m10 == null) {
                throw new NullPointerException("Missing unit rule.");
            }
            i(obj);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (it.next() == null) {
                    throw new NullPointerException("Found convertible unit which is null.");
                }
            }
            if (Double.isNaN(d10)) {
                throw new IllegalArgumentException("Not a number: " + d10);
            }
            if (Double.isInfinite(d10)) {
                throw new IllegalArgumentException("Infinite: " + d10);
            }
            this.f61275g.put(obj, m10);
            this.f61276h.put(obj, Double.valueOf(d10));
            HashSet hashSet = new HashSet(set);
            hashSet.remove(obj);
            this.f61277i.put(obj, hashSet);
            return this;
        }

        public H h() {
            if (this.f61275g.isEmpty()) {
                throw new IllegalStateException("No time unit was registered.");
            }
            H h10 = new H(this.f61298a, this.f61274f, this.f61300c, this.f61301d, this.f61275g, this.f61276h, this.f61277i, this.f61302e, this.f61278j, this.f61279k, this.f61280l, this.f61281m, this.f61282n, null);
            x.B(h10);
            return h10;
        }

        public final void i(Object obj) {
            if (this.f61299b) {
                return;
            }
            Iterator it = this.f61275g.keySet().iterator();
            while (it.hasNext()) {
                if (it.next().equals(obj)) {
                    throw new IllegalArgumentException("Unit duplicate found: " + obj.toString());
                }
            }
            if (obj instanceof Enum) {
                String name = ((Enum) Enum.class.cast(obj)).name();
                for (Object obj2 : this.f61275g.keySet()) {
                    if ((obj2 instanceof Enum) && ((Enum) Enum.class.cast(obj2)).name().equals(name)) {
                        throw new IllegalArgumentException("Unit duplicate found: " + name);
                    }
                }
            }
        }

        public b l(I i10) {
            if (i10 == null) {
                throw new NullPointerException("Missing time line.");
            }
            this.f61282n = i10;
            return this;
        }
    }

    public static class c implements I {

        /* renamed from: a, reason: collision with root package name */
        public final Object f61283a;

        /* renamed from: b, reason: collision with root package name */
        public final K f61284b;

        /* renamed from: c, reason: collision with root package name */
        public final K f61285c;

        public c(Object obj, K k10, K k11) {
            this.f61283a = obj;
            this.f61284b = k10;
            this.f61285c = k11;
        }

        @Override // java.util.Comparator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(K k10, K k11) {
            return k10.compareTo(k11);
        }
    }

    public static class d extends AbstractC5909e implements z {
        private static final long serialVersionUID = 4777240530511579802L;
        private final K max;
        private final K min;
        private final Class<K> type;

        public /* synthetic */ d(Class cls, K k10, K k11, a aVar) {
            this(cls, k10, k11);
        }

        @Override // oi.p
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public K d0() {
            return this.min;
        }

        @Override // oi.z
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public K e(K k10) {
            return c();
        }

        @Override // oi.z
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public K i(K k10) {
            return d0();
        }

        @Override // oi.z
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public K q(K k10, K k11, boolean z10) {
            if (k11 != null) {
                return k11;
            }
            throw new IllegalArgumentException("Missing value.");
        }

        @Override // oi.p
        public boolean Y() {
            return false;
        }

        @Override // oi.p
        public boolean e0() {
            return false;
        }

        @Override // oi.p
        public Class getType() {
            return this.type;
        }

        @Override // oi.AbstractC5909e
        public z r(x xVar) {
            if (xVar.r().equals(this.type)) {
                return this;
            }
            return null;
        }

        @Override // oi.AbstractC5909e
        public String u(x xVar) {
            return null;
        }

        @Override // oi.AbstractC5909e
        public boolean w() {
            return true;
        }

        @Override // oi.z
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public p b(K k10) {
            throw new UnsupportedOperationException();
        }

        @Override // oi.z
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public p d(K k10) {
            throw new UnsupportedOperationException();
        }

        @Override // oi.p
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public K c() {
            return this.max;
        }

        public d(Class cls, K k10, K k11) {
            super(cls.getName() + "-AXIS");
            this.type = cls;
            this.min = k10;
            this.max = k11;
        }

        @Override // oi.z
        public boolean isValid(K k10, K k11) {
            return k11 != null;
        }

        @Override // oi.z
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public K p(K k10) {
            return k10;
        }
    }

    public /* synthetic */ H(Class cls, Class cls2, u uVar, Map map, Map map2, Map map3, Map map4, List list, Map map5, K k10, K k11, InterfaceC5915k interfaceC5915k, I i10, a aVar) {
        this(cls, cls2, uVar, map, map2, map3, map4, list, map5, k10, k11, interfaceC5915k, i10);
    }

    public static double H(Map map, Object obj) {
        Double d10 = (Double) map.get(obj);
        if (d10 != null) {
            return d10.doubleValue();
        }
        if (obj instanceof w) {
            return ((w) w.class.cast(obj)).getLength();
        }
        return Double.NaN;
    }

    @Override // java.util.Comparator
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public int compare(K k10, K k11) {
        return k10.compareTo(k11);
    }

    @Override // oi.x, oi.u
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public K e(q qVar, InterfaceC5908d interfaceC5908d, boolean z10, boolean z11) {
        return qVar.f(this.f61270p) ? (K) qVar.j(this.f61270p) : (K) super.e(qVar, interfaceC5908d, z10, z11);
    }

    public p F() {
        return this.f61270p;
    }

    public Object G(p pVar) {
        if (pVar == null) {
            throw new NullPointerException("Missing element.");
        }
        Object obj = this.f61266l.get(pVar);
        if (obj == null && (pVar instanceof AbstractC5909e)) {
            obj = this.f61266l.get(((AbstractC5909e) pVar).t());
        }
        if (obj != null) {
            return obj;
        }
        throw new r("Base unit not found for: " + pVar.name());
    }

    public K I() {
        return this.f61268n;
    }

    public K J() {
        return this.f61267m;
    }

    public M K(Object obj) {
        M c10;
        if (obj == null) {
            throw new NullPointerException("Missing chronological unit.");
        }
        if (L(obj)) {
            return (M) this.f61263i.get(obj);
        }
        if (!(obj instanceof AbstractC5910f) || (c10 = ((AbstractC5910f) AbstractC5910f.class.cast(obj)).c(this)) == null) {
            throw new C5904E(this, obj);
        }
        return c10;
    }

    public boolean L(Object obj) {
        return this.f61263i.containsKey(obj);
    }

    @Override // oi.x
    public InterfaceC5915k q() {
        InterfaceC5915k interfaceC5915k = this.f61269o;
        return interfaceC5915k == null ? super.q() : interfaceC5915k;
    }

    public H(Class cls, Class cls2, u uVar, Map map, Map map2, Map map3, Map map4, List list, Map map5, K k10, K k11, InterfaceC5915k interfaceC5915k, I i10) {
        super(cls, uVar, map, list);
        this.f61262h = cls2;
        this.f61263i = Collections.unmodifiableMap(map2);
        this.f61264j = Collections.unmodifiableMap(map3);
        this.f61265k = Collections.unmodifiableMap(map4);
        this.f61266l = Collections.unmodifiableMap(map5);
        this.f61267m = k10;
        this.f61268n = k11;
        this.f61269o = interfaceC5915k;
        this.f61270p = new d(cls, k10, k11, null);
        if (i10 != null) {
            this.f61271q = i10;
            return;
        }
        ArrayList arrayList = new ArrayList(map2.keySet());
        Collections.sort(arrayList, new a(map3));
        this.f61271q = new c(arrayList.get(0), k10, k11);
    }
}
