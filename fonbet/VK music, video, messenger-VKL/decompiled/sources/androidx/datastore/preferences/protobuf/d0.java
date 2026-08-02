package androidx.datastore.preferences.protobuf;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: SmallSortedMap.java */
/* loaded from: classes.dex */
public class d0<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int h = 0;
    public List<d0<K, V>.c> b = Collections.EMPTY_LIST;
    public Map<K, V> c;
    public boolean d;
    public volatile d0<K, V>.e e;
    public Map<K, V> f;
    public volatile d0<K, V>.b g;

    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes12.dex */
    public class a implements Iterator<Map.Entry<K, V>> {
        public int b;
        public Iterator<Map.Entry<K, V>> c;

        public a() {
            this.b = d0.this.b.size();
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.c == null) {
                this.c = d0.this.f.entrySet().iterator();
            }
            return this.c;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.b;
            return (i > 0 && i <= d0.this.b.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (a().hasNext()) {
                return a().next();
            }
            List<d0<K, V>.c> list = d0.this.b;
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
    /* loaded from: classes12.dex */
    public class b extends d0<K, V>.e {
        public b() {
            super();
        }

        @Override // androidx.datastore.preferences.protobuf.d0.e, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes12.dex */
    public class c implements Map.Entry<K, V>, Comparable<d0<K, V>.c> {
        public final K b;
        public V c;

        public c(d0 d0Var, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        public final K a() {
            return this.b;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.b.compareTo(((c) obj).b);
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
            int i = d0.h;
            d0.this.b();
            V v2 = this.c;
            this.c = v;
            return v2;
        }

        public final String toString() {
            return this.b + "=" + this.c;
        }

        public c(K k, V v) {
            this.b = k;
            this.c = v;
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes12.dex */
    public class d implements Iterator<Map.Entry<K, V>> {
        public int b = -1;
        public boolean c;
        public Iterator<Map.Entry<K, V>> d;

        public d() {
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.d == null) {
                this.d = d0.this.c.entrySet().iterator();
            }
            return this.d;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.b + 1;
            d0 d0Var = d0.this;
            return i < d0Var.b.size() || (!d0Var.c.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.c = true;
            int i = this.b + 1;
            this.b = i;
            d0 d0Var = d0.this;
            return i < d0Var.b.size() ? d0Var.b.get(this.b) : a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.c) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.c = false;
            int i = d0.h;
            d0 d0Var = d0.this;
            d0Var.b();
            if (this.b >= d0Var.b.size()) {
                a().remove();
                return;
            }
            int i2 = this.b;
            this.b = i2 - 1;
            d0Var.h(i2);
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes12.dex */
    public class e extends AbstractSet<Map.Entry<K, V>> {
        public e() {
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
            return new d();
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

    public d0() {
        Map<K, V> map = Collections.EMPTY_MAP;
        this.c = map;
        this.f = map;
    }

    public final int a(K k) {
        int i;
        int size = this.b.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = k.compareTo(this.b.get(i2).a());
            if (compareTo > 0) {
                i = size + 1;
                return -i;
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = k.compareTo(this.b.get(i4).a());
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        i = i3 + 1;
        return -i;
    }

    public final void b() {
        if (this.d) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry<K, V> c(int i) {
        return this.b.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
        if (this.c.isEmpty()) {
            return;
        }
        this.c.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.c.containsKey(comparable);
    }

    public final Set d() {
        return this.c.isEmpty() ? Collections.EMPTY_SET : this.c.entrySet();
    }

    public final SortedMap<K, V> e() {
        b();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.c = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (SortedMap) this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.e == null) {
            this.e = new e();
        }
        return this.e;
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
            int size2 = this.b.size();
            if (size2 != d0Var.b.size()) {
                return ((AbstractSet) entrySet()).equals(d0Var.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (c(i).equals(d0Var.c(i))) {
                }
            }
            if (size2 != size) {
                return this.c.equals(d0Var.c);
            }
            return true;
        }
        return false;
    }

    public void f() {
        if (this.d) {
            return;
        }
        this.c = this.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.c);
        this.f = this.f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f);
        this.d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final V put(K k, V v) {
        b();
        int a2 = a(k);
        if (a2 >= 0) {
            return this.b.get(a2).setValue(v);
        }
        b();
        if (this.b.isEmpty() && !(this.b instanceof ArrayList)) {
            this.b = new ArrayList(16);
        }
        int i = -(a2 + 1);
        if (i >= 16) {
            return e().put(k, v);
        }
        if (this.b.size() == 16) {
            d0<K, V>.c remove = this.b.remove(15);
            e().put(remove.a(), remove.getValue());
        }
        this.b.add(i, new c(k, v));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        return a2 >= 0 ? this.b.get(a2).getValue() : this.c.get(comparable);
    }

    public final V h(int i) {
        b();
        V value = this.b.remove(i).getValue();
        if (!this.c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = e().entrySet().iterator();
            this.b.add(new c(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.b.get(i2).hashCode();
        }
        return this.c.size() > 0 ? this.c.hashCode() + i : i;
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
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c.size() + this.b.size();
    }
}
