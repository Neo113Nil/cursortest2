package com.google.crypto.tink.shaded.protobuf;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes9.dex */
class i0<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private Object[] f59385a;

    /* renamed from: b, reason: collision with root package name */
    private int f59386b;

    /* renamed from: c, reason: collision with root package name */
    private Map<K, V> f59387c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f59388d;

    /* renamed from: e, reason: collision with root package name */
    private volatile i0<K, V>.e f59389e;

    /* renamed from: f, reason: collision with root package name */
    private Map<K, V> f59390f;

    private class a implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        private int f59391a;

        /* renamed from: b, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f59392b;

        a() {
            this.f59391a = i0.this.f59386b;
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f59392b == null) {
                this.f59392b = i0.this.f59390f.entrySet().iterator();
            }
            return this.f59392b;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i11 = this.f59391a;
            return (i11 > 0 && i11 <= i0.this.f59386b) || a().hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (a().hasNext()) {
                return a().next();
            }
            Object[] objArr = i0.this.f59385a;
            int i11 = this.f59391a - 1;
            this.f59391a = i11;
            return (c) objArr[i11];
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class b extends i0<K, V>.e {
        b() {
            super();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0.e, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class c implements Map.Entry<K, V>, Comparable<i0<K, V>.c> {

        /* renamed from: a, reason: collision with root package name */
        private final K f59395a;

        /* renamed from: b, reason: collision with root package name */
        private V f59396b;

        c() {
            throw null;
        }

        c(K k11, V v11) {
            this.f59395a = k11;
            this.f59396b = v11;
        }

        public final K a() {
            return this.f59395a;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f59395a.compareTo(((c) obj).f59395a);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj != this) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    K k11 = this.f59395a;
                    if (k11 == null ? key == null : k11.equals(key)) {
                        V v11 = this.f59396b;
                        Object value = entry.getValue();
                        if (v11 == null ? value == null : v11.equals(value)) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f59395a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f59396b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k11 = this.f59395a;
            int hashCode = k11 == null ? 0 : k11.hashCode();
            V v11 = this.f59396b;
            return (v11 != null ? v11.hashCode() : 0) ^ hashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v11) {
            i0.this.l();
            V v12 = this.f59396b;
            this.f59396b = v11;
            return v12;
        }

        public final String toString() {
            return this.f59395a + "=" + this.f59396b;
        }
    }

    private class d implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        private int f59398a = -1;

        /* renamed from: b, reason: collision with root package name */
        private boolean f59399b;

        /* renamed from: c, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f59400c;

        d() {
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f59400c == null) {
                this.f59400c = i0.this.f59387c.entrySet().iterator();
            }
            return this.f59400c;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i11 = this.f59398a + 1;
            i0 i0Var = i0.this;
            return i11 < i0Var.f59386b || (!i0Var.f59387c.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.f59399b = true;
            int i11 = this.f59398a + 1;
            this.f59398a = i11;
            i0 i0Var = i0.this;
            return i11 < i0Var.f59386b ? (c) i0Var.f59385a[this.f59398a] : a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f59399b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f59399b = false;
            i0 i0Var = i0.this;
            i0Var.l();
            if (this.f59398a >= i0Var.f59386b) {
                a().remove();
                return;
            }
            int i11 = this.f59398a;
            this.f59398a = i11 - 1;
            i0Var.u(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class e extends AbstractSet<Map.Entry<K, V>> {
        e() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            i0.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            i0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = i0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            i0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return i0.this.size();
        }
    }

    private i0() {
        Map<K, V> map = Collections.EMPTY_MAP;
        this.f59387c = map;
        this.f59390f = map;
    }

    private int k(K k11) {
        int i11;
        int i12 = this.f59386b;
        int i13 = i12 - 1;
        if (i13 >= 0) {
            int compareTo = k11.compareTo(((c) this.f59385a[i13]).a());
            if (compareTo > 0) {
                i11 = i12 + 1;
                return -i11;
            }
            if (compareTo == 0) {
                return i13;
            }
        }
        int i14 = 0;
        while (i14 <= i13) {
            int i15 = (i14 + i13) / 2;
            int compareTo2 = k11.compareTo(((c) this.f59385a[i15]).a());
            if (compareTo2 < 0) {
                i13 = i15 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i15;
                }
                i14 = i15 + 1;
            }
        }
        i11 = i14 + 1;
        return -i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (this.f59388d) {
            throw new UnsupportedOperationException();
        }
    }

    private SortedMap<K, V> p() {
        l();
        if (this.f59387c.isEmpty() && !(this.f59387c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f59387c = treeMap;
            this.f59390f = treeMap.descendingMap();
        }
        return (SortedMap) this.f59387c;
    }

    static h0 s() {
        return new h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V u(int i11) {
        l();
        V v11 = (V) ((c) this.f59385a[i11]).getValue();
        Object[] objArr = this.f59385a;
        System.arraycopy(objArr, i11 + 1, objArr, i11, (this.f59386b - i11) - 1);
        this.f59386b--;
        if (!this.f59387c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = p().entrySet().iterator();
            Object[] objArr2 = this.f59385a;
            int i12 = this.f59386b;
            Map.Entry<K, V> next = it.next();
            objArr2[i12] = new c(next.getKey(), next.getValue());
            this.f59386b++;
            it.remove();
        }
        return v11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        l();
        if (this.f59386b != 0) {
            this.f59385a = null;
            this.f59386b = 0;
        }
        if (this.f59387c.isEmpty()) {
            return;
        }
        this.f59387c.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return k(comparable) >= 0 || this.f59387c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f59389e == null) {
            this.f59389e = new e();
        }
        return this.f59389e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return super.equals(obj);
        }
        i0 i0Var = (i0) obj;
        int size = size();
        if (size == i0Var.size()) {
            int i11 = this.f59386b;
            if (i11 != i0Var.f59386b) {
                return ((AbstractSet) entrySet()).equals(i0Var.entrySet());
            }
            for (int i12 = 0; i12 < i11; i12++) {
                if (((c) m(i12)).equals(i0Var.m(i12))) {
                }
            }
            if (i11 != size) {
                return this.f59387c.equals(i0Var.f59387c);
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int k11 = k(comparable);
        return k11 >= 0 ? (V) ((c) this.f59385a[k11]).getValue() : this.f59387c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i11 = this.f59386b;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 += this.f59385a[i13].hashCode();
        }
        return this.f59387c.size() > 0 ? this.f59387c.hashCode() + i12 : i12;
    }

    public final Map.Entry<K, V> m(int i11) {
        if (i11 < this.f59386b) {
            return (c) this.f59385a[i11];
        }
        throw new ArrayIndexOutOfBoundsException(i11);
    }

    public final int n() {
        return this.f59386b;
    }

    public final Set o() {
        return this.f59387c.isEmpty() ? Collections.EMPTY_SET : this.f59387c.entrySet();
    }

    public final boolean q() {
        return this.f59388d;
    }

    public void r() {
        if (this.f59388d) {
            return;
        }
        this.f59387c = this.f59387c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f59387c);
        this.f59390f = this.f59390f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f59390f);
        this.f59388d = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        l();
        Comparable comparable = (Comparable) obj;
        int k11 = k(comparable);
        if (k11 >= 0) {
            return (V) u(k11);
        }
        if (this.f59387c.isEmpty()) {
            return null;
        }
        return this.f59387c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f59387c.size() + this.f59386b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final V put(K k11, V v11) {
        l();
        int k12 = k(k11);
        if (k12 >= 0) {
            return (V) ((c) this.f59385a[k12]).setValue(v11);
        }
        l();
        if (this.f59385a == null) {
            this.f59385a = new Object[16];
        }
        int i11 = -(k12 + 1);
        if (i11 >= 16) {
            return p().put(k11, v11);
        }
        int i12 = this.f59386b;
        if (i12 == 16) {
            c cVar = (c) this.f59385a[15];
            this.f59386b = i12 - 1;
            p().put(cVar.a(), cVar.getValue());
        }
        Object[] objArr = this.f59385a;
        System.arraycopy(objArr, i11, objArr, i11 + 1, (objArr.length - i11) - 1);
        this.f59385a[i11] = new c(k11, v11);
        this.f59386b++;
        return null;
    }
}
