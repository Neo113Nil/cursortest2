package com.google.common.collect;

import com.google.common.collect.d;
import com.google.common.collect.e;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
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
import xsna.fxc0;
import xsna.gow;
import xsna.h740;
import xsna.lwx;

/* compiled from: AbstractMapBasedMultimap.java */
/* loaded from: classes13.dex */
public abstract class c<K, V> extends com.google.common.collect.d<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    public transient Map<K, Collection<V>> e;
    public transient int f;

    /* compiled from: AbstractMapBasedMultimap.java */
    public class a extends e.d<K, Collection<V>> {
        public final transient Map<K, Collection<V>> d;

        /* compiled from: AbstractMapBasedMultimap.java */
        /* renamed from: com.google.common.collect.c$a$a, reason: collision with other inner class name */
        public class C0130a extends e.a<K, Collection<V>> {
            public C0130a() {
            }

            @Override // com.google.common.collect.e.a
            public final Map<K, Collection<V>> c() {
                return a.this;
            }

            @Override // com.google.common.collect.e.a, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                Set<Map.Entry<K, Collection<V>>> entrySet = a.this.d.entrySet();
                entrySet.getClass();
                try {
                    return entrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return a.this.new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                Collection<V> collection;
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                c cVar = c.this;
                Object key = entry.getKey();
                Map<K, Collection<V>> map = cVar.e;
                map.getClass();
                try {
                    collection = map.remove(key);
                } catch (ClassCastException | NullPointerException unused) {
                    collection = null;
                }
                Collection<V> collection2 = collection;
                if (collection2 == null) {
                    return true;
                }
                int size = collection2.size();
                collection2.clear();
                cVar.f -= size;
                return true;
            }
        }

        /* compiled from: AbstractMapBasedMultimap.java */
        public class b implements Iterator<Map.Entry<K, Collection<V>>> {
            public final Iterator<Map.Entry<K, Collection<V>>> b;
            public Collection<V> c;

            public b() {
                this.b = a.this.d.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.b.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                Map.Entry<K, Collection<V>> next = this.b.next();
                this.c = next.getValue();
                return a.this.a(next);
            }

            @Override // java.util.Iterator
            public final void remove() {
                fxc0.A(this.c != null, "no calls to next() since the last call to remove()");
                this.b.remove();
                c.this.f -= this.c.size();
                this.c.clear();
                this.c = null;
            }
        }

        public a(Map<K, Collection<V>> map) {
            this.d = map;
        }

        public final gow a(Map.Entry entry) {
            Object key = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            com.google.common.collect.a aVar = (com.google.common.collect.a) c.this;
            List list = (List) collection;
            return new gow(key, list instanceof RandomAccess ? new f(key, list, null) : new j(key, list, null));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            c cVar = c.this;
            if (this.d == cVar.e) {
                cVar.h();
                return;
            }
            b bVar = new b();
            while (bVar.hasNext()) {
                bVar.next();
                bVar.remove();
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            Map<K, Collection<V>> map = this.d;
            map.getClass();
            try {
                return map.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean equals(Object obj) {
            return this == obj || this.d.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            Collection<V> collection;
            Map<K, Collection<V>> map = this.d;
            map.getClass();
            try {
                collection = map.get(obj);
            } catch (ClassCastException | NullPointerException unused) {
                collection = null;
            }
            Collection<V> collection2 = collection;
            if (collection2 == null) {
                return null;
            }
            com.google.common.collect.a aVar = (com.google.common.collect.a) c.this;
            List list = (List) collection2;
            return list instanceof RandomAccess ? new f(obj, list, null) : new j(obj, list, null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int hashCode() {
            return this.d.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            c cVar = c.this;
            Set<K> set = cVar.b;
            if (set != null) {
                return set;
            }
            Set<K> g = cVar.g();
            cVar.b = g;
            return g;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            Collection<V> remove = this.d.remove(obj);
            if (remove == null) {
                return null;
            }
            c cVar = c.this;
            Collection<V> j = cVar.j();
            j.addAll(remove);
            cVar.f -= remove.size();
            remove.clear();
            return j;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.d.size();
        }

        @Override // java.util.AbstractMap
        public final String toString() {
            return this.d.toString();
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    public abstract class b<T> implements Iterator<T> {
        public final Iterator<Map.Entry<K, Collection<V>>> b;
        public K c = null;
        public Collection<V> d = null;
        public Iterator<V> e = lwx.c.INSTANCE;

        public b() {
            this.b = c.this.e.entrySet().iterator();
        }

        public abstract T a(K k, V v);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b.hasNext() || this.e.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.e.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.b.next();
                this.c = next.getKey();
                Collection<V> value = next.getValue();
                this.d = value;
                this.e = value.iterator();
            }
            return this.e.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.e.remove();
            Collection<V> collection = this.d;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.b.remove();
            }
            c cVar = c.this;
            cVar.f--;
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* renamed from: com.google.common.collect.c$c, reason: collision with other inner class name */
    public class C0131c extends e.b<K, Collection<V>> {

        /* compiled from: AbstractMapBasedMultimap.java */
        /* renamed from: com.google.common.collect.c$c$a */
        public class a implements Iterator<K> {
            public Map.Entry<K, Collection<V>> b;
            public final /* synthetic */ Iterator c;
            public final /* synthetic */ C0131c d;

            public a(C0131c c0131c, Iterator it) {
                this.c = it;
                this.d = c0131c;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.c.hasNext();
            }

            @Override // java.util.Iterator
            public final K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.c.next();
                this.b = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public final void remove() {
                fxc0.A(this.b != null, "no calls to next() since the last call to remove()");
                Collection<V> value = this.b.getValue();
                this.c.remove();
                c.this.f -= value.size();
                value.clear();
                this.b = null;
            }
        }

        public C0131c(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            Iterator<K> it = iterator();
            while (true) {
                a aVar = (a) it;
                if (!aVar.hasNext()) {
                    return;
                }
                aVar.next();
                aVar.remove();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection<?> collection) {
            return this.b.keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            return this == obj || this.b.keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            return this.b.keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a(this, this.b.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            int i;
            Collection collection = (Collection) this.b.remove(obj);
            if (collection != null) {
                i = collection.size();
                collection.clear();
                c.this.f -= i;
            } else {
                i = 0;
            }
            return i > 0;
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    public final class d extends c<K, V>.g implements NavigableMap<K, Collection<V>> {
        public final /* synthetic */ h740 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(h740 h740Var, NavigableMap navigableMap) {
            super(h740Var, navigableMap);
            this.h = h740Var;
        }

        @Override // com.google.common.collect.c.g
        public final SortedSet b() {
            return new e(this.h, d());
        }

        @Override // com.google.common.collect.c.g
        /* renamed from: c */
        public final SortedSet keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> ceilingEntry(K k) {
            Map.Entry<K, Collection<V>> ceilingEntry = d().ceilingEntry(k);
            if (ceilingEntry == null) {
                return null;
            }
            return a(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public final K ceilingKey(K k) {
            return d().ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> descendingKeySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> descendingMap() {
            return new d(this.h, d().descendingMap());
        }

        public final gow e(Iterator it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Collection j = this.h.j();
            j.addAll((Collection) entry.getValue());
            it.remove();
            return new gow(entry.getKey(), Collections.unmodifiableList((List) j));
        }

        @Override // com.google.common.collect.c.g
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final NavigableMap<K, Collection<V>> d() {
            return (NavigableMap) ((SortedMap) this.d);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> firstEntry = d().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return a(firstEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> floorEntry(K k) {
            Map.Entry<K, Collection<V>> floorEntry = d().floorEntry(k);
            if (floorEntry == null) {
                return null;
            }
            return a(floorEntry);
        }

        @Override // java.util.NavigableMap
        public final K floorKey(K k) {
            return d().floorKey(k);
        }

        @Override // com.google.common.collect.c.g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> higherEntry(K k) {
            Map.Entry<K, Collection<V>> higherEntry = d().higherEntry(k);
            if (higherEntry == null) {
                return null;
            }
            return a(higherEntry);
        }

        @Override // java.util.NavigableMap
        public final K higherKey(K k) {
            return d().higherKey(k);
        }

        @Override // com.google.common.collect.c.g, com.google.common.collect.c.a, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> lastEntry = d().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return a(lastEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> lowerEntry(K k) {
            Map.Entry<K, Collection<V>> lowerEntry = d().lowerEntry(k);
            if (lowerEntry == null) {
                return null;
            }
            return a(lowerEntry);
        }

        @Override // java.util.NavigableMap
        public final K lowerKey(K k) {
            return d().lowerKey(k);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> navigableKeySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> pollFirstEntry() {
            return e(((a.C0130a) entrySet()).iterator());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> pollLastEntry() {
            return e(((a.C0130a) ((e.d) descendingMap()).entrySet()).iterator());
        }

        @Override // com.google.common.collect.c.g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.c.g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> headMap(K k, boolean z) {
            return new d(this.h, d().headMap(k, z));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
            return new d(this.h, d().subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> tailMap(K k, boolean z) {
            return new d(this.h, d().tailMap(k, z));
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    public final class e extends c<K, V>.h implements NavigableSet<K> {
        public final /* synthetic */ h740 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(h740 h740Var, NavigableMap navigableMap) {
            super(h740Var, navigableMap);
            this.e = h740Var;
        }

        @Override // java.util.NavigableSet
        public final K ceiling(K k) {
            return c().ceilingKey(k);
        }

        @Override // com.google.common.collect.c.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final NavigableMap<K, Collection<V>> c() {
            return (NavigableMap) ((SortedMap) this.b);
        }

        @Override // java.util.NavigableSet
        public final Iterator<K> descendingIterator() {
            return ((C0131c) descendingSet()).iterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> descendingSet() {
            return new e(this.e, c().descendingMap());
        }

        @Override // java.util.NavigableSet
        public final K floor(K k) {
            return c().floorKey(k);
        }

        @Override // com.google.common.collect.c.h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.NavigableSet
        public final K higher(K k) {
            return c().higherKey(k);
        }

        @Override // java.util.NavigableSet
        public final K lower(K k) {
            return c().lowerKey(k);
        }

        @Override // java.util.NavigableSet
        public final K pollFirst() {
            C0131c.a aVar = (C0131c.a) iterator();
            if (!aVar.hasNext()) {
                return null;
            }
            K k = (K) aVar.next();
            aVar.remove();
            return k;
        }

        @Override // java.util.NavigableSet
        public final K pollLast() {
            Iterator<K> descendingIterator = descendingIterator();
            if (!descendingIterator.hasNext()) {
                return null;
            }
            K next = descendingIterator.next();
            descendingIterator.remove();
            return next;
        }

        @Override // com.google.common.collect.c.h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.c.h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> headSet(K k, boolean z) {
            return new e(this.e, c().headMap(k, z));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return new e(this.e, c().subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> tailSet(K k, boolean z) {
            return new e(this.e, c().tailMap(k, z));
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    public class f extends c<K, V>.j implements RandomAccess {
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    public class g extends c<K, V>.a implements SortedMap<K, Collection<V>> {
        public SortedSet<K> f;
        public final /* synthetic */ h740 g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(h740 h740Var, SortedMap sortedMap) {
            super(sortedMap);
            this.g = h740Var;
        }

        public SortedSet<K> b() {
            return new h(this.g, d());
        }

        @Override // com.google.common.collect.c.a, java.util.AbstractMap, java.util.Map
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> b = b();
            this.f = b;
            return b;
        }

        @Override // java.util.SortedMap
        public final Comparator<? super K> comparator() {
            return d().comparator();
        }

        public SortedMap<K, Collection<V>> d() {
            return (SortedMap) this.d;
        }

        @Override // java.util.SortedMap
        public final K firstKey() {
            return d().firstKey();
        }

        public SortedMap<K, Collection<V>> headMap(K k) {
            return new g(this.g, d().headMap(k));
        }

        @Override // java.util.SortedMap
        public final K lastKey() {
            return d().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new g(this.g, d().subMap(k, k2));
        }

        public SortedMap<K, Collection<V>> tailMap(K k) {
            return new g(this.g, d().tailMap(k));
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    public class h extends c<K, V>.C0131c implements SortedSet<K> {
        public final /* synthetic */ h740 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(h740 h740Var, SortedMap sortedMap) {
            super(sortedMap);
            this.d = h740Var;
        }

        public SortedMap<K, Collection<V>> c() {
            return (SortedMap) this.b;
        }

        @Override // java.util.SortedSet
        public final Comparator<? super K> comparator() {
            return c().comparator();
        }

        @Override // java.util.SortedSet
        public final K first() {
            return c().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new h(this.d, c().headMap(k));
        }

        @Override // java.util.SortedSet
        public final K last() {
            return c().lastKey();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new h(this.d, c().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new h(this.d, c().tailMap(k));
        }
    }

    @Override // com.google.common.collect.d
    public Map<K, Collection<V>> d() {
        return new a(this.e);
    }

    @Override // com.google.common.collect.d
    public Set<K> g() {
        return new C0131c(this.e);
    }

    public final void h() {
        Iterator<Collection<V>> it = this.e.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.e.clear();
        this.f = 0;
    }

    public abstract Collection<V> j();

    public final void k(Map<K, Collection<V>> map) {
        this.e = map;
        this.f = 0;
        for (Collection<V> collection : map.values()) {
            fxc0.p(!collection.isEmpty());
            this.f = collection.size() + this.f;
        }
    }

    public final Collection<V> l() {
        Collection<V> collection = this.c;
        if (collection != null) {
            return collection;
        }
        d.a aVar = new d.a(this);
        this.c = aVar;
        return aVar;
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    public class j extends c<K, V>.i implements List<V> {

        /* compiled from: AbstractMapBasedMultimap.java */
        public class a extends c<K, V>.i.a implements ListIterator<V> {
            public a() {
                super();
            }

            @Override // java.util.ListIterator
            public final void add(V v) {
                j jVar = j.this;
                boolean isEmpty = jVar.isEmpty();
                b().add(v);
                c.this.f++;
                if (isEmpty) {
                    jVar.c();
                }
            }

            public final ListIterator<V> b() {
                a();
                return (ListIterator) this.b;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return b().hasPrevious();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return b().nextIndex();
            }

            @Override // java.util.ListIterator
            public final V previous() {
                return b().previous();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return b().previousIndex();
            }

            @Override // java.util.ListIterator
            public final void set(V v) {
                b().set(v);
            }

            public a(int i) {
                super(j.this, ((List) j.this.c).listIterator(i));
            }
        }

        public j(K k, List<V> list, c<K, V>.i iVar) {
            super(k, list, iVar);
        }

        @Override // java.util.List
        public final void add(int i, V v) {
            d();
            boolean isEmpty = this.c.isEmpty();
            ((List) this.c).add(i, v);
            c.this.f++;
            if (isEmpty) {
                c();
            }
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = ((List) this.c).addAll(i, collection);
            if (addAll) {
                c.this.f += this.c.size() - size;
                if (size == 0) {
                    c();
                }
            }
            return addAll;
        }

        @Override // java.util.List
        public final V get(int i) {
            d();
            return (V) ((List) this.c).get(i);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            d();
            return ((List) this.c).indexOf(obj);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            d();
            return ((List) this.c).lastIndexOf(obj);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator() {
            d();
            return new a();
        }

        @Override // java.util.List
        public final V remove(int i) {
            d();
            V v = (V) ((List) this.c).remove(i);
            c cVar = c.this;
            cVar.f--;
            e();
            return v;
        }

        @Override // java.util.List
        public final V set(int i, V v) {
            d();
            return (V) ((List) this.c).set(i, v);
        }

        @Override // java.util.List
        public final List<V> subList(int i, int i2) {
            d();
            List subList = ((List) this.c).subList(i, i2);
            c<K, V>.i iVar = this.d;
            if (iVar == null) {
                iVar = this;
            }
            boolean z = subList instanceof RandomAccess;
            c cVar = c.this;
            K k = this.b;
            return z ? new f(k, subList, iVar) : new j(k, subList, iVar);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator(int i) {
            d();
            return new a(i);
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    public class i extends AbstractCollection<V> {
        public final K b;
        public Collection<V> c;
        public final c<K, V>.i d;
        public final Collection<V> e;

        /* JADX WARN: Multi-variable type inference failed */
        public i(Object obj, List list, i iVar) {
            this.b = obj;
            this.c = list;
            this.d = iVar;
            this.e = iVar == null ? null : iVar.c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean add(V v) {
            d();
            boolean isEmpty = this.c.isEmpty();
            boolean add = this.c.add(v);
            if (add) {
                c.this.f++;
                if (isEmpty) {
                    c();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.c.addAll(collection);
            if (addAll) {
                c.this.f += this.c.size() - size;
                if (size == 0) {
                    c();
                }
            }
            return addAll;
        }

        public final void c() {
            c<K, V>.i iVar = this.d;
            if (iVar != null) {
                iVar.c();
            } else {
                c.this.e.put(this.b, this.c);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.c.clear();
            c.this.f -= size;
            e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            d();
            return this.c.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            d();
            return this.c.containsAll(collection);
        }

        public final void d() {
            Collection<V> collection;
            c<K, V>.i iVar = this.d;
            if (iVar != null) {
                iVar.d();
                if (iVar.c != this.e) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.c.isEmpty() || (collection = c.this.e.get(this.b)) == null) {
                    return;
                }
                this.c = collection;
            }
        }

        public final void e() {
            c<K, V>.i iVar = this.d;
            if (iVar != null) {
                iVar.e();
            } else if (this.c.isEmpty()) {
                c.this.e.remove(this.b);
            }
        }

        @Override // java.util.Collection
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            d();
            return this.c.equals(obj);
        }

        @Override // java.util.Collection
        public final int hashCode() {
            d();
            return this.c.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            d();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            d();
            boolean remove = this.c.remove(obj);
            if (remove) {
                c cVar = c.this;
                cVar.f--;
                e();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.c.removeAll(collection);
            if (removeAll) {
                c.this.f += this.c.size() - size;
                e();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            collection.getClass();
            int size = size();
            boolean retainAll = this.c.retainAll(collection);
            if (retainAll) {
                c.this.f += this.c.size() - size;
                e();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            d();
            return this.c.size();
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            d();
            return this.c.toString();
        }

        /* compiled from: AbstractMapBasedMultimap.java */
        public class a implements Iterator<V> {
            public final Iterator<V> b;
            public final Collection<V> c;

            public a() {
                Collection<V> collection = i.this.c;
                this.c = collection;
                this.b = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
            }

            public final void a() {
                i iVar = i.this;
                iVar.d();
                if (iVar.c != this.c) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                a();
                return this.b.hasNext();
            }

            @Override // java.util.Iterator
            public final V next() {
                a();
                return this.b.next();
            }

            @Override // java.util.Iterator
            public final void remove() {
                this.b.remove();
                i iVar = i.this;
                c cVar = c.this;
                cVar.f--;
                iVar.e();
            }

            public a(j jVar, ListIterator listIterator) {
                i.this = jVar;
                this.c = jVar.c;
                this.b = listIterator;
            }
        }
    }
}
