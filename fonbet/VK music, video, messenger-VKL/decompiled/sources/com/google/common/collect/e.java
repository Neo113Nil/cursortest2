package com.google.common.collect;

import com.google.common.collect.c;
import com.google.common.collect.c.a.C0130a;
import com.google.common.collect.l;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import xsna.k15;
import xsna.nn00;
import xsna.pli;

/* compiled from: Maps.java */
/* loaded from: classes13.dex */
public final class e {

    /* compiled from: Maps.java */
    public static abstract class a<K, V> extends l.c<Map.Entry<K, V>> {
        public abstract Map<K, V> c();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            c().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(Object obj);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return c().isEmpty();
        }

        @Override // com.google.common.collect.l.c, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                Iterator<?> it = collection.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    z |= remove(it.next());
                }
                return z;
            }
        }

        @Override // com.google.common.collect.l.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet(e.a(collection.size()));
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSet.add(((Map.Entry) obj).getKey());
                    }
                }
                return c().keySet().retainAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return c().size();
        }
    }

    /* compiled from: Maps.java */
    public static class b<K, V> extends l.c<K> {
        public final Map<K, V> b;

        public b(Map<K, V> map) {
            map.getClass();
            this.b = map;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return this.b.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return this.b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.b.size();
        }
    }

    /* compiled from: Maps.java */
    public static class c<K, V> extends AbstractCollection<V> {
        public final AbstractMap b;

        public c(AbstractMap abstractMap) {
            this.b = abstractMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            this.b.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return this.b.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return this.b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new nn00(this.b.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                AbstractMap abstractMap = this.b;
                for (Map.Entry<K, V> entry : abstractMap.entrySet()) {
                    if (pli.l(obj, entry.getValue())) {
                        abstractMap.remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                AbstractMap abstractMap = this.b;
                for (Map.Entry<K, V> entry : abstractMap.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return abstractMap.keySet().removeAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                AbstractMap abstractMap = this.b;
                for (Map.Entry<K, V> entry : abstractMap.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return abstractMap.keySet().retainAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.b.size();
        }
    }

    /* compiled from: Maps.java */
    public static abstract class d<K, V> extends AbstractMap<K, V> {
        public transient c.a.C0130a b;
        public transient c c;

        @Override // java.util.AbstractMap, java.util.Map
        public final Set<Map.Entry<K, V>> entrySet() {
            c.a.C0130a c0130a = this.b;
            if (c0130a != null) {
                return c0130a;
            }
            c.a.C0130a c0130a2 = ((c.a) this).new C0130a();
            this.b = c0130a2;
            return c0130a2;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Collection<V> values() {
            c cVar = this.c;
            if (cVar != null) {
                return cVar;
            }
            c cVar2 = new c(this);
            this.c = cVar2;
            return cVar2;
        }
    }

    public static int a(int i) {
        if (i < 3) {
            k15.h(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) Math.ceil(i / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static boolean b(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }
}
