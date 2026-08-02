package com.google.crypto.tink.shaded.protobuf;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: SmallSortedMap.java */
/* loaded from: classes13.dex */
public class d0<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int i = 0;
    public final int b;
    public List<d0<K, V>.d> c = Collections.EMPTY_LIST;
    public Map<K, V> d;
    public boolean e;
    public volatile d0<K, V>.f f;
    public Map<K, V> g;
    public volatile d0<K, V>.b h;

    /* compiled from: SmallSortedMap.java */
    public class a implements Iterator<Map.Entry<K, V>> {
        public int b;
        public Iterator<Map.Entry<K, V>> c;

        public a() {
            this.b = d0.this.c.size();
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.c == null) {
                this.c = d0.this.g.entrySet().iterator();
            }
            return this.c;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.b;
            return (i > 0 && i <= d0.this.c.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (a().hasNext()) {
                return a().next();
            }
            List<d0<K, V>.d> list = d0.this.c;
            int i = this.b - 1;
            this.b = i;
            return list.get(i);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: SmallSortedMap.java */
    public class b extends d0<K, V>.f {
        public b() {
            super();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.d0.f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }
    }

    /* compiled from: SmallSortedMap.java */
    public static class c {
        public static final a a = new a();
        public static final b b = new b();

        /* compiled from: SmallSortedMap.java */
        public class a implements Iterator<Object> {
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public final Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* compiled from: SmallSortedMap.java */
        public class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return c.a;
            }
        }
    }

    /* compiled from: SmallSortedMap.java */
    public class d implements Map.Entry<K, V>, Comparable<d0<K, V>.d> {
        public final K b;
        public V c;

        public d() {
            throw null;
        }

        public d(K k, V v) {
            this.b = k;
            this.c = v;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.b.compareTo(((d) obj).b);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj != this) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    K k = this.b;
                    if (k == null ? key == null : k.equals(key)) {
                        V v = this.c;
                        Object value = entry.getValue();
                        if (v == null ? value == null : v.equals(value)) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.c;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.b;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.c;
            return (v != null ? v.hashCode() : 0) ^ hashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            int i = d0.i;
            d0.this.b();
            V v2 = this.c;
            this.c = v;
            return v2;
        }

        public final String toString() {
            return this.b + "=" + this.c;
        }
    }

    /* compiled from: SmallSortedMap.java */
    public class e implements Iterator<Map.Entry<K, V>> {
        public int b = -1;
        public boolean c;
        public Iterator<Map.Entry<K, V>> d;

        public e() {
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.d == null) {
                this.d = d0.this.d.entrySet().iterator();
            }
            return this.d;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.b + 1;
            d0 d0Var = d0.this;
            return i < d0Var.c.size() || (!d0Var.d.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.c = true;
            int i = this.b + 1;
            this.b = i;
            d0 d0Var = d0.this;
            return i < d0Var.c.size() ? d0Var.c.get(this.b) : a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.c) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.c = false;
            int i = d0.i;
            d0 d0Var = d0.this;
            d0Var.b();
            if (this.b >= d0Var.c.size()) {
                a().remove();
                return;
            }
            int i2 = this.b;
            this.b = i2 - 1;
            d0Var.h(i2);
        }
    }

    /* compiled from: SmallSortedMap.java */
    public class f extends AbstractSet<Map.Entry<K, V>> {
        public f() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            d0.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            d0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = d0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            d0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return d0.this.size();
        }
    }

    public d0(int i2) {
        this.b = i2;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.d = map;
        this.g = map;
    }

    public final int a(K k) {
        int i2;
        int size = this.c.size();
        int i3 = size - 1;
        if (i3 >= 0) {
            int compareTo = k.compareTo(this.c.get(i3).b);
            if (compareTo > 0) {
                i2 = size + 1;
                return -i2;
            }
            if (compareTo == 0) {
                return i3;
            }
        }
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) / 2;
            int compareTo2 = k.compareTo(this.c.get(i5).b);
            if (compareTo2 < 0) {
                i3 = i5 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i5;
                }
                i4 = i5 + 1;
            }
        }
        i2 = i4 + 1;
        return -i2;
    }

    public final void b() {
        if (this.e) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry<K, V> c(int i2) {
        return this.c.get(i2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.c.isEmpty()) {
            this.c.clear();
        }
        if (this.d.isEmpty()) {
            return;
        }
        this.d.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.d.containsKey(comparable);
    }

    public final Iterable<Map.Entry<K, V>> d() {
        return this.d.isEmpty() ? c.b : this.d.entrySet();
    }

    public final SortedMap<K, V> e() {
        b();
        if (this.d.isEmpty() && !(this.d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.d = treeMap;
            this.g = treeMap.descendingMap();
        }
        return (SortedMap) this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f == null) {
            this.f = new f();
        }
        return this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return super.equals(obj);
        }
        d0 d0Var = (d0) obj;
        int size = size();
        if (size == d0Var.size()) {
            int size2 = this.c.size();
            if (size2 != d0Var.c.size()) {
                return ((AbstractSet) entrySet()).equals(d0Var.entrySet());
            }
            for (int i2 = 0; i2 < size2; i2++) {
                if (c(i2).equals(d0Var.c(i2))) {
                }
            }
            if (size2 != size) {
                return this.d.equals(d0Var.d);
            }
            return true;
        }
        return false;
    }

    public void f() {
        if (this.e) {
            return;
        }
        this.d = this.d.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.d);
        this.g = this.g.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.g);
        this.e = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final V put(K k, V v) {
        b();
        int a2 = a(k);
        if (a2 >= 0) {
            return this.c.get(a2).setValue(v);
        }
        b();
        boolean isEmpty = this.c.isEmpty();
        int i2 = this.b;
        if (isEmpty && !(this.c instanceof ArrayList)) {
            this.c = new ArrayList(i2);
        }
        int i3 = -(a2 + 1);
        if (i3 >= i2) {
            return e().put(k, v);
        }
        if (this.c.size() == i2) {
            d0<K, V>.d remove = this.c.remove(i2 - 1);
            e().put(remove.b, remove.c);
        }
        this.c.add(i3, new d(k, v));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        return a2 >= 0 ? this.c.get(a2).c : this.d.get(comparable);
    }

    public final V h(int i2) {
        b();
        V v = this.c.remove(i2).c;
        if (!this.d.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = e().entrySet().iterator();
            List<d0<K, V>.d> list = this.c;
            Map.Entry<K, V> next = it.next();
            list.add(new d(next.getKey(), next.getValue()));
            it.remove();
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.c.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += this.c.get(i3).hashCode();
        }
        return this.d.size() > 0 ? this.d.hashCode() + i2 : i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return (V) h(a2);
        }
        if (this.d.isEmpty()) {
            return null;
        }
        return this.d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.d.size() + this.c.size();
    }
}
