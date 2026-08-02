package com.google.common.collect;

import Bl0.k0;
import com.google.common.collect.AbstractC5863g;
import com.google.common.collect.I;
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

/* renamed from: com.google.common.collect.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC5861e<K, V> extends AbstractC5863g<K, V> implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    private transient Map<K, Collection<V>> f59065d;

    /* renamed from: e, reason: collision with root package name */
    private transient int f59066e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.collect.e$a */
    /* loaded from: classes9.dex */
    class a extends I.d<K, Collection<V>> {

        /* renamed from: c, reason: collision with root package name */
        final transient Map<K, Collection<V>> f59067c;

        /* renamed from: com.google.common.collect.e$a$a, reason: collision with other inner class name */
        class C0899a extends I.a<K, Collection<V>> {
            C0899a() {
            }

            @Override // com.google.common.collect.I.a, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                Set<Map.Entry<K, Collection<V>>> entrySet = a.this.f59067c.entrySet();
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
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractC5861e.m(AbstractC5861e.this, entry.getKey());
                return true;
            }
        }

        /* renamed from: com.google.common.collect.e$a$b */
        class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: a, reason: collision with root package name */
            final Iterator<Map.Entry<K, Collection<V>>> f59070a;

            /* renamed from: b, reason: collision with root package name */
            Collection<V> f59071b;

            b() {
                this.f59070a = a.this.f59067c.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f59070a.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                Map.Entry<K, Collection<V>> next = this.f59070a.next();
                this.f59071b = next.getValue();
                return a.this.b(next);
            }

            @Override // java.util.Iterator
            public final void remove() {
                k0.l("no calls to next() since the last call to remove()", this.f59071b != null);
                this.f59070a.remove();
                AbstractC5861e.l(AbstractC5861e.this, this.f59071b.size());
                this.f59071b.clear();
                this.f59071b = null;
            }
        }

        a(Map<K, Collection<V>> map) {
            this.f59067c = map;
        }

        final Map.Entry<K, Collection<V>> b(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            Collection<V> value = entry.getValue();
            AbstractC5859c abstractC5859c = (AbstractC5859c) AbstractC5861e.this;
            abstractC5859c.getClass();
            List list = (List) value;
            return new C5879x(key, list instanceof RandomAccess ? new f(abstractC5859c, key, list, null) : new j(key, list, null));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            AbstractC5861e abstractC5861e = AbstractC5861e.this;
            Map<K, Collection<V>> map = abstractC5861e.f59065d;
            Map<K, Collection<V>> map2 = this.f59067c;
            if (map2 == map) {
                abstractC5861e.clear();
                return;
            }
            Iterator<Map.Entry<K, V>> it = map2.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                Collection<V> value = next.getValue();
                b(next);
                k0.l("no calls to next() since the last call to remove()", value != null);
                it.remove();
                AbstractC5861e.l(abstractC5861e, value.size());
                value.clear();
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            Map<K, Collection<V>> map = this.f59067c;
            map.getClass();
            try {
                return map.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean equals(Object obj) {
            return this == obj || this.f59067c.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            Collection<V> collection;
            Map<K, Collection<V>> map = this.f59067c;
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
            AbstractC5859c abstractC5859c = (AbstractC5859c) AbstractC5861e.this;
            abstractC5859c.getClass();
            List list = (List) collection2;
            return list instanceof RandomAccess ? new f(abstractC5859c, obj, list, null) : new j(obj, list, null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int hashCode() {
            return this.f59067c.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return AbstractC5861e.this.f();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            Collection<V> remove = this.f59067c.remove(obj);
            if (remove == null) {
                return null;
            }
            AbstractC5861e abstractC5861e = AbstractC5861e.this;
            Collection<V> p11 = abstractC5861e.p();
            p11.addAll(remove);
            AbstractC5861e.l(abstractC5861e, remove.size());
            remove.clear();
            return p11;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.f59067c.size();
        }

        @Override // java.util.AbstractMap
        public final String toString() {
            return this.f59067c.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.collect.e$b */
    abstract class b<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        final Iterator<Map.Entry<K, Collection<V>>> f59073a;

        /* renamed from: b, reason: collision with root package name */
        K f59074b = null;

        /* renamed from: c, reason: collision with root package name */
        Collection<V> f59075c = null;

        /* renamed from: d, reason: collision with root package name */
        Iterator<V> f59076d = D.INSTANCE;

        b() {
            this.f59073a = AbstractC5861e.this.f59065d.entrySet().iterator();
        }

        abstract T a(K k11, V v11);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f59073a.hasNext() || this.f59076d.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.f59076d.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f59073a.next();
                this.f59074b = next.getKey();
                Collection<V> value = next.getValue();
                this.f59075c = value;
                this.f59076d = value.iterator();
            }
            return this.f59076d.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f59076d.remove();
            Collection<V> collection = this.f59075c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f59073a.remove();
            }
            AbstractC5861e.i(AbstractC5861e.this);
        }
    }

    /* renamed from: com.google.common.collect.e$c */
    /* loaded from: classes9.dex */
    private class c extends I.b<K, Collection<V>> {

        /* renamed from: com.google.common.collect.e$c$a */
        final class a implements Iterator<K> {

            /* renamed from: a, reason: collision with root package name */
            Map.Entry<K, Collection<V>> f59079a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Iterator f59080b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ c f59081c;

            a(c cVar, Iterator it) {
                this.f59080b = it;
                this.f59081c = cVar;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f59080b.hasNext();
            }

            @Override // java.util.Iterator
            public final K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f59080b.next();
                this.f59079a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public final void remove() {
                k0.l("no calls to next() since the last call to remove()", this.f59079a != null);
                Collection<V> value = this.f59079a.getValue();
                this.f59080b.remove();
                AbstractC5861e.l(AbstractC5861e.this, value.size());
                value.clear();
                this.f59079a = null;
            }
        }

        c(Map<K, Collection<V>> map) {
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
            return this.f59021a.keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            return this == obj || this.f59021a.keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            return this.f59021a.keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a(this, this.f59021a.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            int i11;
            Collection collection = (Collection) this.f59021a.remove(obj);
            if (collection != null) {
                i11 = collection.size();
                collection.clear();
                AbstractC5861e.l(AbstractC5861e.this, i11);
            } else {
                i11 = 0;
            }
            return i11 > 0;
        }
    }

    /* renamed from: com.google.common.collect.e$d */
    /* loaded from: classes9.dex */
    private final class d extends AbstractC5861e<K, V>.g implements NavigableMap<K, Collection<V>> {
        d(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // com.google.common.collect.AbstractC5861e.g
        final SortedSet c() {
            return new C0900e(h());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> ceilingEntry(K k11) {
            Map.Entry<K, Collection<V>> ceilingEntry = h().ceilingEntry(k11);
            if (ceilingEntry == null) {
                return null;
            }
            return b(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public final K ceilingKey(K k11) {
            return h().ceilingKey(k11);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> descendingKeySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> descendingMap() {
            return new d(h().descendingMap());
        }

        @Override // com.google.common.collect.AbstractC5861e.g
        /* renamed from: e */
        public final SortedSet keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> firstEntry = h().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return b(firstEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> floorEntry(K k11) {
            Map.Entry<K, Collection<V>> floorEntry = h().floorEntry(k11);
            if (floorEntry == null) {
                return null;
            }
            return b(floorEntry);
        }

        @Override // java.util.NavigableMap
        public final K floorKey(K k11) {
            return h().floorKey(k11);
        }

        @Override // com.google.common.collect.AbstractC5861e.g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> higherEntry(K k11) {
            Map.Entry<K, Collection<V>> higherEntry = h().higherEntry(k11);
            if (higherEntry == null) {
                return null;
            }
            return b(higherEntry);
        }

        @Override // java.util.NavigableMap
        public final K higherKey(K k11) {
            return h().higherKey(k11);
        }

        final Map.Entry<K, Collection<V>> i(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> p11 = AbstractC5861e.this.p();
            p11.addAll(next.getValue());
            it.remove();
            return new C5879x(next.getKey(), Collections.unmodifiableList((List) p11));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractC5861e.g
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public final NavigableMap<K, Collection<V>> h() {
            return (NavigableMap) ((SortedMap) this.f59067c);
        }

        @Override // com.google.common.collect.AbstractC5861e.g, com.google.common.collect.AbstractC5861e.a, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> lastEntry = h().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return b(lastEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> lowerEntry(K k11) {
            Map.Entry<K, Collection<V>> lowerEntry = h().lowerEntry(k11);
            if (lowerEntry == null) {
                return null;
            }
            return b(lowerEntry);
        }

        @Override // java.util.NavigableMap
        public final K lowerKey(K k11) {
            return h().lowerKey(k11);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> navigableKeySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> pollFirstEntry() {
            return i(((a.C0899a) entrySet()).iterator());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> pollLastEntry() {
            return i(((a.C0899a) ((I.d) descendingMap()).entrySet()).iterator());
        }

        @Override // com.google.common.collect.AbstractC5861e.g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.AbstractC5861e.g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> headMap(K k11, boolean z11) {
            return new d(h().headMap(k11, z11));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> subMap(K k11, boolean z11, K k12, boolean z12) {
            return new d(h().subMap(k11, z11, k12, z12));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> tailMap(K k11, boolean z11) {
            return new d(h().tailMap(k11, z11));
        }
    }

    /* renamed from: com.google.common.collect.e$e, reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    private final class C0900e extends AbstractC5861e<K, V>.h implements NavigableSet<K> {
        C0900e(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractC5861e.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final NavigableMap<K, Collection<V>> a() {
            return (NavigableMap) ((SortedMap) this.f59021a);
        }

        @Override // java.util.NavigableSet
        public final K ceiling(K k11) {
            return a().ceilingKey(k11);
        }

        @Override // java.util.NavigableSet
        public final Iterator<K> descendingIterator() {
            return ((c) descendingSet()).iterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> descendingSet() {
            return new C0900e(a().descendingMap());
        }

        @Override // java.util.NavigableSet
        public final K floor(K k11) {
            return a().floorKey(k11);
        }

        @Override // com.google.common.collect.AbstractC5861e.h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.NavigableSet
        public final K higher(K k11) {
            return a().higherKey(k11);
        }

        @Override // java.util.NavigableSet
        public final K lower(K k11) {
            return a().lowerKey(k11);
        }

        @Override // java.util.NavigableSet
        public final K pollFirst() {
            c.a aVar = (c.a) iterator();
            if (!aVar.hasNext()) {
                return null;
            }
            K k11 = (K) aVar.next();
            aVar.remove();
            return k11;
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

        @Override // com.google.common.collect.AbstractC5861e.h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.AbstractC5861e.h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> headSet(K k11, boolean z11) {
            return new C0900e(a().headMap(k11, z11));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> subSet(K k11, boolean z11, K k12, boolean z12) {
            return new C0900e(a().subMap(k11, z11, k12, z12));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> tailSet(K k11, boolean z11) {
            return new C0900e(a().tailMap(k11, z11));
        }
    }

    /* renamed from: com.google.common.collect.e$f */
    /* loaded from: classes9.dex */
    private class f extends AbstractC5861e<K, V>.j implements RandomAccess {
        f(AbstractC5861e abstractC5861e, Object obj, List list, j jVar) {
            super(obj, list, jVar);
        }
    }

    /* renamed from: com.google.common.collect.e$g */
    /* loaded from: classes9.dex */
    private class g extends AbstractC5861e<K, V>.a implements SortedMap<K, Collection<V>> {

        /* renamed from: e, reason: collision with root package name */
        SortedSet<K> f59084e;

        g(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        SortedSet<K> c() {
            return new h(h());
        }

        @Override // java.util.SortedMap
        public final Comparator<? super K> comparator() {
            return h().comparator();
        }

        @Override // com.google.common.collect.AbstractC5861e.a, java.util.AbstractMap, java.util.Map
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f59084e;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> c11 = c();
            this.f59084e = c11;
            return c11;
        }

        @Override // java.util.SortedMap
        public final K firstKey() {
            return h().firstKey();
        }

        SortedMap<K, Collection<V>> h() {
            return (SortedMap) this.f59067c;
        }

        public SortedMap<K, Collection<V>> headMap(K k11) {
            return new g(h().headMap(k11));
        }

        @Override // java.util.SortedMap
        public final K lastKey() {
            return h().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k11, K k12) {
            return new g(h().subMap(k11, k12));
        }

        public SortedMap<K, Collection<V>> tailMap(K k11) {
            return new g(h().tailMap(k11));
        }
    }

    /* renamed from: com.google.common.collect.e$h */
    /* loaded from: classes9.dex */
    private class h extends AbstractC5861e<K, V>.c implements SortedSet<K> {
        h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        SortedMap<K, Collection<V>> a() {
            return (SortedMap) this.f59021a;
        }

        @Override // java.util.SortedSet
        public final Comparator<? super K> comparator() {
            return a().comparator();
        }

        @Override // java.util.SortedSet
        public final K first() {
            return a().firstKey();
        }

        public SortedSet<K> headSet(K k11) {
            return new h(a().headMap(k11));
        }

        @Override // java.util.SortedSet
        public final K last() {
            return a().lastKey();
        }

        public SortedSet<K> subSet(K k11, K k12) {
            return new h(a().subMap(k11, k12));
        }

        public SortedSet<K> tailSet(K k11) {
            return new h(a().tailMap(k11));
        }
    }

    protected AbstractC5861e(Map<K, Collection<V>> map) {
        k0.e(map.isEmpty());
        this.f59065d = map;
    }

    static /* synthetic */ void h(AbstractC5861e abstractC5861e) {
        abstractC5861e.f59066e++;
    }

    static /* synthetic */ void i(AbstractC5861e abstractC5861e) {
        abstractC5861e.f59066e--;
    }

    static /* synthetic */ void j(AbstractC5861e abstractC5861e, int i11) {
        abstractC5861e.f59066e += i11;
    }

    static /* synthetic */ void l(AbstractC5861e abstractC5861e, int i11) {
        abstractC5861e.f59066e -= i11;
    }

    static void m(AbstractC5861e abstractC5861e, Object obj) {
        Collection collection = (Collection) I.b(abstractC5861e.f59065d, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            abstractC5861e.f59066e -= size;
        }
    }

    @Override // com.google.common.collect.AbstractC5863g
    Map<K, Collection<V>> a() {
        Map<K, Collection<V>> map = this.f59065d;
        return map instanceof NavigableMap ? new d((NavigableMap) this.f59065d) : map instanceof SortedMap ? new g((SortedMap) this.f59065d) : new a(this.f59065d);
    }

    @Override // com.google.common.collect.J
    public void clear() {
        Iterator<Collection<V>> it = this.f59065d.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f59065d.clear();
        this.f59066e = 0;
    }

    @Override // com.google.common.collect.AbstractC5863g
    Set<K> d() {
        Map<K, Collection<V>> map = this.f59065d;
        return map instanceof NavigableMap ? new C0900e((NavigableMap) this.f59065d) : map instanceof SortedMap ? new h((SortedMap) this.f59065d) : new c(this.f59065d);
    }

    @Override // com.google.common.collect.AbstractC5863g
    final Collection<V> e() {
        return new AbstractC5863g.a(this);
    }

    final Map<K, Collection<V>> n() {
        return this.f59065d;
    }

    abstract Collection<V> p();

    @Override // com.google.common.collect.J
    public boolean put(K k11, V v11) {
        Collection<V> collection = this.f59065d.get(k11);
        if (collection != null) {
            if (!collection.add(v11)) {
                return false;
            }
            this.f59066e++;
            return true;
        }
        Collection<V> p11 = p();
        if (!p11.add(v11)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f59066e++;
        this.f59065d.put(k11, p11);
        return true;
    }

    final void s(Map<K, Collection<V>> map) {
        this.f59065d = map;
        this.f59066e = 0;
        for (Collection<V> collection : map.values()) {
            k0.e(!collection.isEmpty());
            this.f59066e = collection.size() + this.f59066e;
        }
    }

    @Override // com.google.common.collect.J
    public int size() {
        return this.f59066e;
    }

    /* renamed from: com.google.common.collect.e$j */
    /* loaded from: classes9.dex */
    class j extends AbstractC5861e<K, V>.i implements List<V> {

        /* renamed from: com.google.common.collect.e$j$a */
        private class a extends AbstractC5861e<K, V>.i.a implements ListIterator<V> {
            a() {
                super();
            }

            private ListIterator<V> b() {
                a();
                return (ListIterator) this.f59092a;
            }

            @Override // java.util.ListIterator
            public final void add(V v11) {
                j jVar = j.this;
                boolean isEmpty = jVar.isEmpty();
                b().add(v11);
                AbstractC5861e.h(AbstractC5861e.this);
                if (isEmpty) {
                    jVar.a();
                }
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
            public final void set(V v11) {
                b().set(v11);
            }

            public a(int i11) {
                super(j.this, ((List) j.this.f59088b).listIterator(i11));
            }
        }

        j(Object obj, List list, j jVar) {
            super(obj, list, jVar);
        }

        @Override // java.util.List
        public final void add(int i11, V v11) {
            b();
            boolean isEmpty = this.f59088b.isEmpty();
            ((List) this.f59088b).add(i11, v11);
            AbstractC5861e.h(AbstractC5861e.this);
            if (isEmpty) {
                a();
            }
        }

        @Override // java.util.List
        public final boolean addAll(int i11, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = ((List) this.f59088b).addAll(i11, collection);
            if (addAll) {
                AbstractC5861e.j(AbstractC5861e.this, this.f59088b.size() - size);
                if (size == 0) {
                    a();
                }
            }
            return addAll;
        }

        @Override // java.util.List
        public final V get(int i11) {
            b();
            return (V) ((List) this.f59088b).get(i11);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            b();
            return ((List) this.f59088b).indexOf(obj);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            b();
            return ((List) this.f59088b).lastIndexOf(obj);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator() {
            b();
            return new a();
        }

        @Override // java.util.List
        public final V remove(int i11) {
            b();
            V v11 = (V) ((List) this.f59088b).remove(i11);
            AbstractC5861e.i(AbstractC5861e.this);
            c();
            return v11;
        }

        @Override // java.util.List
        public final V set(int i11, V v11) {
            b();
            return (V) ((List) this.f59088b).set(i11, v11);
        }

        @Override // java.util.List
        public final List<V> subList(int i11, int i12) {
            b();
            List subList = ((List) this.f59088b).subList(i11, i12);
            j jVar = this.f59089c;
            if (jVar == null) {
                jVar = this;
            }
            AbstractC5861e abstractC5861e = AbstractC5861e.this;
            abstractC5861e.getClass();
            boolean z11 = subList instanceof RandomAccess;
            K k11 = this.f59087a;
            return z11 ? new f(abstractC5861e, k11, subList, jVar) : new j(k11, subList, jVar);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator(int i11) {
            b();
            return new a(i11);
        }
    }

    /* renamed from: com.google.common.collect.e$i */
    /* loaded from: classes9.dex */
    class i extends AbstractCollection<V> {

        /* renamed from: a, reason: collision with root package name */
        final K f59087a;

        /* renamed from: b, reason: collision with root package name */
        Collection<V> f59088b;

        /* renamed from: c, reason: collision with root package name */
        final j f59089c;

        /* renamed from: d, reason: collision with root package name */
        final Collection<V> f59090d;

        /* JADX WARN: Multi-variable type inference failed */
        i(Object obj, List list, j jVar) {
            this.f59087a = obj;
            this.f59088b = list;
            this.f59089c = jVar;
            this.f59090d = jVar == null ? null : jVar.f59088b;
        }

        final void a() {
            j jVar = this.f59089c;
            if (jVar != null) {
                jVar.a();
            } else {
                AbstractC5861e.this.f59065d.put(this.f59087a, this.f59088b);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean add(V v11) {
            b();
            boolean isEmpty = this.f59088b.isEmpty();
            boolean add = this.f59088b.add(v11);
            if (add) {
                AbstractC5861e.h(AbstractC5861e.this);
                if (isEmpty) {
                    a();
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
            boolean addAll = this.f59088b.addAll(collection);
            if (addAll) {
                AbstractC5861e.j(AbstractC5861e.this, this.f59088b.size() - size);
                if (size == 0) {
                    a();
                }
            }
            return addAll;
        }

        final void b() {
            Collection<V> collection;
            j jVar = this.f59089c;
            if (jVar != null) {
                jVar.b();
                if (jVar.f59088b != this.f59090d) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f59088b.isEmpty() || (collection = (Collection) AbstractC5861e.this.f59065d.get(this.f59087a)) == null) {
                    return;
                }
                this.f59088b = collection;
            }
        }

        final void c() {
            j jVar = this.f59089c;
            if (jVar != null) {
                jVar.c();
            } else if (this.f59088b.isEmpty()) {
                AbstractC5861e.this.f59065d.remove(this.f59087a);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f59088b.clear();
            AbstractC5861e.l(AbstractC5861e.this, size);
            c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            b();
            return this.f59088b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            b();
            return this.f59088b.containsAll(collection);
        }

        @Override // java.util.Collection
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            b();
            return this.f59088b.equals(obj);
        }

        @Override // java.util.Collection
        public final int hashCode() {
            b();
            return this.f59088b.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            b();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            b();
            boolean remove = this.f59088b.remove(obj);
            if (remove) {
                AbstractC5861e.i(AbstractC5861e.this);
                c();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f59088b.removeAll(collection);
            if (removeAll) {
                AbstractC5861e.j(AbstractC5861e.this, this.f59088b.size() - size);
                c();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            collection.getClass();
            int size = size();
            boolean retainAll = this.f59088b.retainAll(collection);
            if (retainAll) {
                AbstractC5861e.j(AbstractC5861e.this, this.f59088b.size() - size);
                c();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            b();
            return this.f59088b.size();
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            b();
            return this.f59088b.toString();
        }

        /* renamed from: com.google.common.collect.e$i$a */
        class a implements Iterator<V> {

            /* renamed from: a, reason: collision with root package name */
            final Iterator<V> f59092a;

            /* renamed from: b, reason: collision with root package name */
            final Collection<V> f59093b;

            a() {
                Collection<V> collection = i.this.f59088b;
                this.f59093b = collection;
                this.f59092a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
            }

            final void a() {
                i iVar = i.this;
                iVar.b();
                if (iVar.f59088b != this.f59093b) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                a();
                return this.f59092a.hasNext();
            }

            @Override // java.util.Iterator
            public final V next() {
                a();
                return this.f59092a.next();
            }

            @Override // java.util.Iterator
            public final void remove() {
                this.f59092a.remove();
                i iVar = i.this;
                AbstractC5861e.i(AbstractC5861e.this);
                iVar.c();
            }

            a(j jVar, ListIterator listIterator) {
                i.this = jVar;
                this.f59093b = jVar.f59088b;
                this.f59092a = listIterator;
            }
        }
    }
}
