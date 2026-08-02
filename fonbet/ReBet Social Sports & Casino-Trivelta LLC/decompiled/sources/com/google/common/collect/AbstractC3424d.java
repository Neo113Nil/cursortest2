package com.google.common.collect;

import com.google.common.collect.AbstractC3426f;
import com.google.common.collect.N;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.common.collect.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3424d extends AbstractC3426f implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* renamed from: e, reason: collision with root package name */
    public transient Map f36773e;

    /* renamed from: f, reason: collision with root package name */
    public transient int f36774f;

    /* renamed from: com.google.common.collect.d$a */
    public class a extends AbstractC0511d {
        public a() {
            super();
        }

        @Override // com.google.common.collect.AbstractC3424d.AbstractC0511d
        public Object a(Object obj, Object obj2) {
            return obj2;
        }
    }

    /* renamed from: com.google.common.collect.d$b */
    public class b extends AbstractC0511d {
        public b() {
            super();
        }

        @Override // com.google.common.collect.AbstractC3424d.AbstractC0511d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry a(Object obj, Object obj2) {
            return N.d(obj, obj2);
        }
    }

    /* renamed from: com.google.common.collect.d$c */
    public class c extends N.f {

        /* renamed from: c, reason: collision with root package name */
        public final transient Map f36777c;

        /* renamed from: com.google.common.collect.d$c$a */
        public class a extends N.c {
            public a() {
            }

            @Override // com.google.common.collect.N.c
            public Map a() {
                return c.this;
            }

            @Override // com.google.common.collect.N.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return AbstractC3432l.c(c.this.f36777c.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return c.this.new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractC3424d.this.z(entry.getKey());
                return true;
            }
        }

        /* renamed from: com.google.common.collect.d$c$b */
        public class b implements Iterator {

            /* renamed from: a, reason: collision with root package name */
            public final Iterator f36780a;

            /* renamed from: b, reason: collision with root package name */
            public Collection f36781b;

            public b() {
                this.f36780a = c.this.f36777c.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                Map.Entry entry = (Map.Entry) this.f36780a.next();
                this.f36781b = (Collection) entry.getValue();
                return c.this.e(entry);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f36780a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                Ra.n.q(this.f36781b != null, "no calls to next() since the last call to remove()");
                this.f36780a.remove();
                AbstractC3424d.r(AbstractC3424d.this, this.f36781b.size());
                this.f36781b.clear();
                this.f36781b = null;
            }
        }

        public c(Map map) {
            this.f36777c = map;
        }

        @Override // com.google.common.collect.N.f
        public Set a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Collection get(Object obj) {
            Collection collection = (Collection) N.j(this.f36777c, obj);
            if (collection == null) {
                return null;
            }
            return AbstractC3424d.this.C(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f36777c == AbstractC3424d.this.f36773e) {
                AbstractC3424d.this.clear();
            } else {
                J.c(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return N.i(this.f36777c, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Collection remove(Object obj) {
            Collection collection = (Collection) this.f36777c.remove(obj);
            if (collection == null) {
                return null;
            }
            Collection u10 = AbstractC3424d.this.u();
            u10.addAll(collection);
            AbstractC3424d.r(AbstractC3424d.this, collection.size());
            collection.clear();
            return u10;
        }

        public Map.Entry e(Map.Entry entry) {
            Object key = entry.getKey();
            return N.d(key, AbstractC3424d.this.C(key, (Collection) entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f36777c.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f36777c.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: keySet */
        public Set g() {
            return AbstractC3424d.this.j();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f36777c.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f36777c.toString();
        }
    }

    /* renamed from: com.google.common.collect.d$d, reason: collision with other inner class name */
    public abstract class AbstractC0511d implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator f36783a;

        /* renamed from: b, reason: collision with root package name */
        public Object f36784b = null;

        /* renamed from: c, reason: collision with root package name */
        public Collection f36785c = null;

        /* renamed from: d, reason: collision with root package name */
        public Iterator f36786d = J.i();

        public AbstractC0511d() {
            this.f36783a = AbstractC3424d.this.f36773e.entrySet().iterator();
        }

        public abstract Object a(Object obj, Object obj2);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36783a.hasNext() || this.f36786d.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f36786d.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f36783a.next();
                this.f36784b = entry.getKey();
                Collection collection = (Collection) entry.getValue();
                this.f36785c = collection;
                this.f36786d = collection.iterator();
            }
            return a(U.a(this.f36784b), this.f36786d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f36786d.remove();
            Collection collection = this.f36785c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f36783a.remove();
            }
            AbstractC3424d.p(AbstractC3424d.this);
        }
    }

    /* renamed from: com.google.common.collect.d$e */
    public class e extends N.d {

        /* renamed from: com.google.common.collect.d$e$a */
        public class a implements Iterator {

            /* renamed from: a, reason: collision with root package name */
            public Map.Entry f36789a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Iterator f36790b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e f36791c;

            public a(e eVar, Iterator it) {
                this.f36790b = it;
                this.f36791c = eVar;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f36790b.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                Map.Entry entry = (Map.Entry) this.f36790b.next();
                this.f36789a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                Ra.n.q(this.f36789a != null, "no calls to next() since the last call to remove()");
                Collection collection = (Collection) this.f36789a.getValue();
                this.f36790b.remove();
                AbstractC3424d.r(AbstractC3424d.this, collection.size());
                collection.clear();
                this.f36789a = null;
            }
        }

        public e(Map map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            J.c(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return a().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || a().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return a().keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a(this, a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int i10;
            Collection collection = (Collection) a().remove(obj);
            if (collection != null) {
                i10 = collection.size();
                collection.clear();
                AbstractC3424d.r(AbstractC3424d.this, i10);
            } else {
                i10 = 0;
            }
            return i10 > 0;
        }
    }

    /* renamed from: com.google.common.collect.d$f */
    public final class f extends i implements NavigableMap {
        public f(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public Map.Entry ceilingEntry(Object obj) {
            Map.Entry ceilingEntry = h().ceilingEntry(obj);
            if (ceilingEntry == null) {
                return null;
            }
            return e(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public Object ceilingKey(Object obj) {
            return h().ceilingKey(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableSet descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap descendingMap() {
            return AbstractC3424d.this.new f(h().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry firstEntry() {
            Map.Entry firstEntry = h().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return e(firstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry floorEntry(Object obj) {
            Map.Entry floorEntry = h().floorEntry(obj);
            if (floorEntry == null) {
                return null;
            }
            return e(floorEntry);
        }

        @Override // java.util.NavigableMap
        public Object floorKey(Object obj) {
            return h().floorKey(obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry higherEntry(Object obj) {
            Map.Entry higherEntry = h().higherEntry(obj);
            if (higherEntry == null) {
                return null;
            }
            return e(higherEntry);
        }

        @Override // java.util.NavigableMap
        public Object higherKey(Object obj) {
            return h().higherKey(obj);
        }

        @Override // com.google.common.collect.AbstractC3424d.i
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public NavigableSet f() {
            return AbstractC3424d.this.new g(h());
        }

        @Override // com.google.common.collect.AbstractC3424d.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableMap headMap(Object obj) {
            return headMap(obj, false);
        }

        public Map.Entry k(Iterator it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Collection u10 = AbstractC3424d.this.u();
            u10.addAll((Collection) entry.getValue());
            it.remove();
            return N.d(entry.getKey(), AbstractC3424d.this.B(u10));
        }

        @Override // com.google.common.collect.AbstractC3424d.i
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public NavigableMap h() {
            return (NavigableMap) super.h();
        }

        @Override // java.util.NavigableMap
        public Map.Entry lastEntry() {
            Map.Entry lastEntry = h().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return e(lastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry lowerEntry(Object obj) {
            Map.Entry lowerEntry = h().lowerEntry(obj);
            if (lowerEntry == null) {
                return null;
            }
            return e(lowerEntry);
        }

        @Override // java.util.NavigableMap
        public Object lowerKey(Object obj) {
            return h().lowerKey(obj);
        }

        @Override // com.google.common.collect.AbstractC3424d.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public NavigableMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.AbstractC3424d.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public NavigableMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public NavigableSet navigableKeySet() {
            return g();
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollFirstEntry() {
            return k(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollLastEntry() {
            return k(descendingMap().entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public NavigableMap headMap(Object obj, boolean z10) {
            return AbstractC3424d.this.new f(h().headMap(obj, z10));
        }

        @Override // com.google.common.collect.AbstractC3424d.i, com.google.common.collect.AbstractC3424d.c, java.util.AbstractMap, java.util.Map
        /* renamed from: keySet, reason: merged with bridge method [inline-methods] */
        public NavigableSet g() {
            return (NavigableSet) super.g();
        }

        @Override // java.util.NavigableMap
        public NavigableMap subMap(Object obj, boolean z10, Object obj2, boolean z11) {
            return AbstractC3424d.this.new f(h().subMap(obj, z10, obj2, z11));
        }

        @Override // java.util.NavigableMap
        public NavigableMap tailMap(Object obj, boolean z10) {
            return AbstractC3424d.this.new f(h().tailMap(obj, z10));
        }
    }

    /* renamed from: com.google.common.collect.d$g */
    public final class g extends j implements NavigableSet {
        public g(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // com.google.common.collect.AbstractC3424d.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public NavigableSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.NavigableSet
        public Object ceiling(Object obj) {
            return b().ceilingKey(obj);
        }

        @Override // java.util.NavigableSet
        public Iterator descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet descendingSet() {
            return AbstractC3424d.this.new g(b().descendingMap());
        }

        @Override // com.google.common.collect.AbstractC3424d.j
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public NavigableMap b() {
            return (NavigableMap) super.b();
        }

        @Override // com.google.common.collect.AbstractC3424d.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // java.util.NavigableSet
        public Object floor(Object obj) {
            return b().floorKey(obj);
        }

        @Override // com.google.common.collect.AbstractC3424d.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public Object higher(Object obj) {
            return b().higherKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object lower(Object obj) {
            return b().lowerKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object pollFirst() {
            return J.q(iterator());
        }

        @Override // java.util.NavigableSet
        public Object pollLast() {
            return J.q(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet headSet(Object obj, boolean z10) {
            return AbstractC3424d.this.new g(b().headMap(obj, z10));
        }

        @Override // java.util.NavigableSet
        public NavigableSet subSet(Object obj, boolean z10, Object obj2, boolean z11) {
            return AbstractC3424d.this.new g(b().subMap(obj, z10, obj2, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet tailSet(Object obj, boolean z10) {
            return AbstractC3424d.this.new g(b().tailMap(obj, z10));
        }
    }

    /* renamed from: com.google.common.collect.d$h */
    public class h extends l implements RandomAccess {
        public h(Object obj, List list, k kVar) {
            super(obj, list, kVar);
        }
    }

    /* renamed from: com.google.common.collect.d$i */
    public class i extends c implements SortedMap {

        /* renamed from: e, reason: collision with root package name */
        public SortedSet f36795e;

        public i(SortedMap sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator comparator() {
            return h().comparator();
        }

        public SortedSet f() {
            return AbstractC3424d.this.new j(h());
        }

        @Override // java.util.SortedMap
        public Object firstKey() {
            return h().firstKey();
        }

        @Override // com.google.common.collect.AbstractC3424d.c, java.util.AbstractMap, java.util.Map
        public SortedSet g() {
            SortedSet sortedSet = this.f36795e;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet f10 = f();
            this.f36795e = f10;
            return f10;
        }

        public SortedMap h() {
            return (SortedMap) this.f36777c;
        }

        public SortedMap headMap(Object obj) {
            return AbstractC3424d.this.new i(h().headMap(obj));
        }

        @Override // java.util.SortedMap
        public Object lastKey() {
            return h().lastKey();
        }

        public SortedMap subMap(Object obj, Object obj2) {
            return AbstractC3424d.this.new i(h().subMap(obj, obj2));
        }

        public SortedMap tailMap(Object obj) {
            return AbstractC3424d.this.new i(h().tailMap(obj));
        }
    }

    /* renamed from: com.google.common.collect.d$j */
    public class j extends e implements SortedSet {
        public j(SortedMap sortedMap) {
            super(sortedMap);
        }

        public SortedMap b() {
            return (SortedMap) super.a();
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return b().comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return b().firstKey();
        }

        public SortedSet headSet(Object obj) {
            return AbstractC3424d.this.new j(b().headMap(obj));
        }

        @Override // java.util.SortedSet
        public Object last() {
            return b().lastKey();
        }

        public SortedSet subSet(Object obj, Object obj2) {
            return AbstractC3424d.this.new j(b().subMap(obj, obj2));
        }

        public SortedSet tailSet(Object obj) {
            return AbstractC3424d.this.new j(b().tailMap(obj));
        }
    }

    public AbstractC3424d(Map map) {
        Ra.n.d(map.isEmpty());
        this.f36773e = map;
    }

    public static /* synthetic */ int o(AbstractC3424d abstractC3424d) {
        int i10 = abstractC3424d.f36774f;
        abstractC3424d.f36774f = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int p(AbstractC3424d abstractC3424d) {
        int i10 = abstractC3424d.f36774f;
        abstractC3424d.f36774f = i10 - 1;
        return i10;
    }

    public static /* synthetic */ int q(AbstractC3424d abstractC3424d, int i10) {
        int i11 = abstractC3424d.f36774f + i10;
        abstractC3424d.f36774f = i11;
        return i11;
    }

    public static /* synthetic */ int r(AbstractC3424d abstractC3424d, int i10) {
        int i11 = abstractC3424d.f36774f - i10;
        abstractC3424d.f36774f = i11;
        return i11;
    }

    public static Iterator y(Collection collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public final void A(Map map) {
        this.f36773e = map;
        this.f36774f = 0;
        for (Collection collection : map.values()) {
            Ra.n.d(!collection.isEmpty());
            this.f36774f += collection.size();
        }
    }

    public abstract Collection B(Collection collection);

    public abstract Collection C(Object obj, Collection collection);

    public final List D(Object obj, List list, k kVar) {
        return list instanceof RandomAccess ? new h(obj, list, kVar) : new l(obj, list, kVar);
    }

    @Override // com.google.common.collect.AbstractC3426f, com.google.common.collect.O
    public Collection a() {
        return super.a();
    }

    @Override // com.google.common.collect.O
    public void clear() {
        Iterator it = this.f36773e.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f36773e.clear();
        this.f36774f = 0;
    }

    @Override // com.google.common.collect.AbstractC3426f
    public Map d() {
        return new c(this.f36773e);
    }

    @Override // com.google.common.collect.AbstractC3426f
    public Collection e() {
        return new AbstractC3426f.a();
    }

    @Override // com.google.common.collect.AbstractC3426f
    public Set f() {
        return new e(this.f36773e);
    }

    @Override // com.google.common.collect.AbstractC3426f
    public Collection g() {
        return new AbstractC3426f.b();
    }

    @Override // com.google.common.collect.O
    public Collection get(Object obj) {
        Collection collection = (Collection) this.f36773e.get(obj);
        if (collection == null) {
            collection = v(obj);
        }
        return C(obj, collection);
    }

    @Override // com.google.common.collect.AbstractC3426f
    public Iterator h() {
        return new b();
    }

    @Override // com.google.common.collect.AbstractC3426f
    public Iterator l() {
        return new a();
    }

    @Override // com.google.common.collect.O
    public boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.f36773e.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f36774f++;
            return true;
        }
        Collection v10 = v(obj);
        if (!v10.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f36774f++;
        this.f36773e.put(obj, v10);
        return true;
    }

    @Override // com.google.common.collect.O
    public int size() {
        return this.f36774f;
    }

    public Map t() {
        return this.f36773e;
    }

    public abstract Collection u();

    public Collection v(Object obj) {
        return u();
    }

    @Override // com.google.common.collect.AbstractC3426f, com.google.common.collect.O
    public Collection values() {
        return super.values();
    }

    public final Map w() {
        Map map = this.f36773e;
        return map instanceof NavigableMap ? new f((NavigableMap) this.f36773e) : map instanceof SortedMap ? new i((SortedMap) this.f36773e) : new c(this.f36773e);
    }

    public final Set x() {
        Map map = this.f36773e;
        return map instanceof NavigableMap ? new g((NavigableMap) this.f36773e) : map instanceof SortedMap ? new j((SortedMap) this.f36773e) : new e(this.f36773e);
    }

    public final void z(Object obj) {
        Collection collection = (Collection) N.k(this.f36773e, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f36774f -= size;
        }
    }

    /* renamed from: com.google.common.collect.d$k */
    public class k extends AbstractCollection {

        /* renamed from: a, reason: collision with root package name */
        public final Object f36798a;

        /* renamed from: b, reason: collision with root package name */
        public Collection f36799b;

        /* renamed from: c, reason: collision with root package name */
        public final k f36800c;

        /* renamed from: d, reason: collision with root package name */
        public final Collection f36801d;

        public k(Object obj, Collection collection, k kVar) {
            this.f36798a = obj;
            this.f36799b = collection;
            this.f36800c = kVar;
            this.f36801d = kVar == null ? null : kVar.c();
        }

        public void a() {
            k kVar = this.f36800c;
            if (kVar != null) {
                kVar.a();
            } else {
                AbstractC3424d.this.f36773e.put(this.f36798a, this.f36799b);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(Object obj) {
            f();
            boolean isEmpty = this.f36799b.isEmpty();
            boolean add = this.f36799b.add(obj);
            if (add) {
                AbstractC3424d.o(AbstractC3424d.this);
                if (isEmpty) {
                    a();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f36799b.addAll(collection);
            if (addAll) {
                AbstractC3424d.q(AbstractC3424d.this, this.f36799b.size() - size);
                if (size == 0) {
                    a();
                }
            }
            return addAll;
        }

        public k b() {
            return this.f36800c;
        }

        public Collection c() {
            return this.f36799b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f36799b.clear();
            AbstractC3424d.r(AbstractC3424d.this, size);
            g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            f();
            return this.f36799b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection collection) {
            f();
            return this.f36799b.containsAll(collection);
        }

        public Object e() {
            return this.f36798a;
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            f();
            return this.f36799b.equals(obj);
        }

        public void f() {
            Collection collection;
            k kVar = this.f36800c;
            if (kVar != null) {
                kVar.f();
                if (this.f36800c.c() != this.f36801d) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f36799b.isEmpty() || (collection = (Collection) AbstractC3424d.this.f36773e.get(this.f36798a)) == null) {
                    return;
                }
                this.f36799b = collection;
            }
        }

        public void g() {
            k kVar = this.f36800c;
            if (kVar != null) {
                kVar.g();
            } else if (this.f36799b.isEmpty()) {
                AbstractC3424d.this.f36773e.remove(this.f36798a);
            }
        }

        @Override // java.util.Collection
        public int hashCode() {
            f();
            return this.f36799b.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            f();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            f();
            boolean remove = this.f36799b.remove(obj);
            if (remove) {
                AbstractC3424d.p(AbstractC3424d.this);
                g();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f36799b.removeAll(collection);
            if (removeAll) {
                AbstractC3424d.q(AbstractC3424d.this, this.f36799b.size() - size);
                g();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            Ra.n.k(collection);
            int size = size();
            boolean retainAll = this.f36799b.retainAll(collection);
            if (retainAll) {
                AbstractC3424d.q(AbstractC3424d.this, this.f36799b.size() - size);
                g();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            f();
            return this.f36799b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            f();
            return this.f36799b.toString();
        }

        /* renamed from: com.google.common.collect.d$k$a */
        public class a implements Iterator {

            /* renamed from: a, reason: collision with root package name */
            public final Iterator f36803a;

            /* renamed from: b, reason: collision with root package name */
            public final Collection f36804b;

            public a() {
                Collection collection = k.this.f36799b;
                this.f36804b = collection;
                this.f36803a = AbstractC3424d.y(collection);
            }

            public Iterator a() {
                b();
                return this.f36803a;
            }

            public void b() {
                k.this.f();
                if (k.this.f36799b != this.f36804b) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                b();
                return this.f36803a.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                b();
                return this.f36803a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f36803a.remove();
                AbstractC3424d.p(AbstractC3424d.this);
                k.this.g();
            }

            public a(Iterator it) {
                this.f36804b = k.this.f36799b;
                this.f36803a = it;
            }
        }
    }

    /* renamed from: com.google.common.collect.d$l */
    public class l extends k implements List {

        /* renamed from: com.google.common.collect.d$l$a */
        public class a extends k.a implements ListIterator {
            public a() {
                super();
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                boolean isEmpty = l.this.isEmpty();
                c().add(obj);
                AbstractC3424d.o(AbstractC3424d.this);
                if (isEmpty) {
                    l.this.a();
                }
            }

            public final ListIterator c() {
                return (ListIterator) a();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return c().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return c().nextIndex();
            }

            @Override // java.util.ListIterator
            public Object previous() {
                return c().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return c().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                c().set(obj);
            }

            public a(int i10) {
                super(l.this.h().listIterator(i10));
            }
        }

        public l(Object obj, List list, k kVar) {
            super(obj, list, kVar);
        }

        @Override // java.util.List
        public void add(int i10, Object obj) {
            f();
            boolean isEmpty = c().isEmpty();
            h().add(i10, obj);
            AbstractC3424d.o(AbstractC3424d.this);
            if (isEmpty) {
                a();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = h().addAll(i10, collection);
            if (addAll) {
                AbstractC3424d.q(AbstractC3424d.this, c().size() - size);
                if (size == 0) {
                    a();
                }
            }
            return addAll;
        }

        @Override // java.util.List
        public Object get(int i10) {
            f();
            return h().get(i10);
        }

        public List h() {
            return (List) c();
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            f();
            return h().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            f();
            return h().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            f();
            return new a();
        }

        @Override // java.util.List
        public Object remove(int i10) {
            f();
            Object remove = h().remove(i10);
            AbstractC3424d.p(AbstractC3424d.this);
            g();
            return remove;
        }

        @Override // java.util.List
        public Object set(int i10, Object obj) {
            f();
            return h().set(i10, obj);
        }

        @Override // java.util.List
        public List subList(int i10, int i11) {
            f();
            return AbstractC3424d.this.D(e(), h().subList(i10, i11), b() == null ? this : b());
        }

        @Override // java.util.List
        public ListIterator listIterator(int i10) {
            f();
            return new a(i10);
        }
    }
}
