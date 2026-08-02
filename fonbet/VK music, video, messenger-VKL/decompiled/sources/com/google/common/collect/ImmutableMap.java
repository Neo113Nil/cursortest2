package com.google.common.collect;

import com.google.common.collect.ImmutableCollection;
import com.ironsource.B5;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import xsna.k15;
import xsna.s4q0;

/* loaded from: classes13.dex */
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {
    private static final long serialVersionUID = 912559;
    public transient ImmutableSet<Map.Entry<K, V>> b;
    public transient ImmutableSet<K> c;
    public transient ImmutableCollection<V> d;

    public static class a<K, V> {
        public Object[] a;
        public int b = 0;
        public C0129a c;

        /* renamed from: com.google.common.collect.ImmutableMap$a$a, reason: collision with other inner class name */
        public static final class C0129a {
            public final Object a;
            public final Object b;
            public final Object c;

            public C0129a(Object obj, Object obj2, Object obj3) {
                this.a = obj;
                this.b = obj2;
                this.c = obj3;
            }

            public final IllegalArgumentException a() {
                StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
                Object obj = this.a;
                sb.append(obj);
                sb.append("=");
                sb.append(this.b);
                sb.append(" and ");
                sb.append(obj);
                sb.append("=");
                sb.append(this.c);
                return new IllegalArgumentException(sb.toString());
            }
        }

        public a(int i) {
            this.a = new Object[i * 2];
        }

        public final h a(boolean z) {
            C0129a c0129a;
            C0129a c0129a2;
            if (z && (c0129a2 = this.c) != null) {
                throw c0129a2.a();
            }
            h m = h.m(this.b, this.a, this);
            if (!z || (c0129a = this.c) == null) {
                return m;
            }
            throw c0129a.a();
        }

        public ImmutableMap<K, V> b() {
            return a(false);
        }

        public ImmutableMap<K, V> c() {
            return a(true);
        }

        public a<K, V> d(K k, V v) {
            int i = (this.b + 1) * 2;
            Object[] objArr = this.a;
            if (i > objArr.length) {
                this.a = Arrays.copyOf(objArr, ImmutableCollection.b.b(objArr.length, i));
            }
            k15.g(k, v);
            Object[] objArr2 = this.a;
            int i2 = this.b;
            int i3 = i2 * 2;
            objArr2[i3] = k;
            objArr2[i3 + 1] = v;
            this.b = i2 + 1;
            return this;
        }

        public a<K, V> e(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                int size = (((Collection) iterable).size() + this.b) * 2;
                Object[] objArr = this.a;
                if (size > objArr.length) {
                    this.a = Arrays.copyOf(objArr, ImmutableCollection.b.b(objArr.length, size));
                }
            }
            for (Map.Entry<? extends K, ? extends V> entry : iterable) {
                d(entry.getKey(), entry.getValue());
            }
            return this;
        }
    }

    public static class b<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Object keys;
        private final Object values;

        public b(ImmutableMap<K, V> immutableMap) {
            Object[] objArr = new Object[immutableMap.size()];
            Object[] objArr2 = new Object[immutableMap.size()];
            s4q0<Map.Entry<K, V>> it = immutableMap.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i] = next.getKey();
                objArr2[i] = next.getValue();
                i++;
            }
            this.keys = objArr;
            this.values = objArr2;
        }

        public a<K, V> a(int i) {
            return new a<>(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object readResolve() {
            Object obj = this.keys;
            if (obj instanceof ImmutableSet) {
                ImmutableSet immutableSet = (ImmutableSet) obj;
                ImmutableCollection immutableCollection = (ImmutableCollection) this.values;
                a<K, V> a = a(immutableSet.size());
                Iterator it = immutableSet.iterator();
                s4q0 it2 = immutableCollection.iterator();
                while (it.hasNext()) {
                    a.d(it.next(), it2.next());
                }
                return a.c();
            }
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) this.values;
            a<K, V> a2 = a(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                a2.d(objArr[i], objArr2[i]);
            }
            return a2.c();
        }
    }

    public static <K, V> ImmutableMap<K, V> a(Map<? extends K, ? extends V> map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap<K, V> immutableMap = (ImmutableMap) map;
            if (!immutableMap.j()) {
                return immutableMap;
            }
        }
        Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
        a aVar = new a(entrySet instanceof Collection ? entrySet.size() : 4);
        aVar.e(entrySet);
        return aVar.a(true);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract ImmutableSet<Map.Entry<K, V>> d();

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return e.b(obj, this);
    }

    public abstract ImmutableSet<K> g();

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    public abstract ImmutableCollection<V> h();

    @Override // java.util.Map
    public final int hashCode() {
        return l.c(entrySet());
    }

    @Override // java.util.Map
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.b;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Map.Entry<K, V>> d = d();
        this.b = d;
        return d;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean j();

    @Override // java.util.Map
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<K> keySet() {
        ImmutableSet<K> immutableSet = this.c;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<K> g = g();
        this.c = g;
        return g;
    }

    @Override // java.util.Map
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public ImmutableCollection<V> values() {
        ImmutableCollection<V> immutableCollection = this.d;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection<V> h = h();
        this.d = h;
        return h;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        k15.h(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append(B5.U);
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public Object writeReplace() {
        return new b(this);
    }
}
