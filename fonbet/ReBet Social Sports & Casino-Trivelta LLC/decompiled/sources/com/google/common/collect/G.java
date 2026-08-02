package com.google.common.collect;

import com.google.common.collect.AbstractC3443x;
import com.google.common.collect.B;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.SortedMap;

/* loaded from: classes3.dex */
public final class G extends B implements NavigableMap {

    /* renamed from: g, reason: collision with root package name */
    public static final Comparator f36697g = W.h();

    /* renamed from: h, reason: collision with root package name */
    public static final G f36698h = new G(H.A(W.h()), AbstractC3445z.t());
    private static final long serialVersionUID = 0;

    /* renamed from: d, reason: collision with root package name */
    public final transient c0 f36699d;

    /* renamed from: e, reason: collision with root package name */
    public final transient AbstractC3445z f36700e;

    /* renamed from: f, reason: collision with root package name */
    public transient G f36701f;

    public class a extends C {

        /* renamed from: com.google.common.collect.G$a$a, reason: collision with other inner class name */
        public class C0507a extends AbstractC3445z {
            public C0507a() {
            }

            @Override // java.util.List
            /* renamed from: H, reason: merged with bridge method [inline-methods] */
            public Map.Entry get(int i10) {
                return new AbstractMap.SimpleImmutableEntry(G.this.f36699d.a().get(i10), G.this.f36700e.get(i10));
            }

            @Override // com.google.common.collect.AbstractC3443x
            public boolean g() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return G.this.size();
            }

            @Override // com.google.common.collect.AbstractC3445z, com.google.common.collect.AbstractC3443x
            public Object writeReplace() {
                return super.writeReplace();
            }
        }

        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: h */
        public m0 iterator() {
            return a().iterator();
        }

        @Override // com.google.common.collect.E
        public AbstractC3445z o() {
            return new C0507a();
        }

        @Override // com.google.common.collect.C, com.google.common.collect.E, com.google.common.collect.AbstractC3443x
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.C
        public B x() {
            return G.this;
        }
    }

    public static class b extends B.a {

        /* renamed from: e, reason: collision with root package name */
        public final Comparator f36704e;
        private transient Object[] keys;
        private transient Object[] values;

        public b(Comparator comparator) {
            this(comparator, 4);
        }

        public final void d(int i10) {
            Object[] objArr = this.keys;
            if (i10 > objArr.length) {
                int d10 = AbstractC3443x.b.d(objArr.length, i10);
                this.keys = Arrays.copyOf(this.keys, d10);
                this.values = Arrays.copyOf(this.values, d10);
            }
        }

        @Override // com.google.common.collect.B.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public G a() {
            return c();
        }

        @Override // com.google.common.collect.B.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public G c() {
            int i10 = this.f36668b;
            if (i10 == 0) {
                return G.z(this.f36704e);
            }
            if (i10 == 1) {
                Comparator comparator = this.f36704e;
                Object obj = this.keys[0];
                Objects.requireNonNull(obj);
                Object obj2 = this.values[0];
                Objects.requireNonNull(obj2);
                return G.I(comparator, obj, obj2);
            }
            Object[] copyOf = Arrays.copyOf(this.keys, i10);
            Arrays.sort(copyOf, this.f36704e);
            Object[] objArr = new Object[this.f36668b];
            for (int i11 = 0; i11 < this.f36668b; i11++) {
                if (i11 > 0) {
                    int i12 = i11 - 1;
                    if (this.f36704e.compare(copyOf[i12], copyOf[i11]) == 0) {
                        throw new IllegalArgumentException("keys required to be distinct but compared as equal: " + copyOf[i12] + " and " + copyOf[i11]);
                    }
                }
                Object obj3 = this.keys[i11];
                Objects.requireNonNull(obj3);
                int binarySearch = Arrays.binarySearch(copyOf, obj3, this.f36704e);
                Object obj4 = this.values[i11];
                Objects.requireNonNull(obj4);
                objArr[binarySearch] = obj4;
            }
            return new G(new c0(AbstractC3445z.i(copyOf), this.f36704e), AbstractC3445z.i(objArr));
        }

        @Override // com.google.common.collect.B.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public b f(Object obj, Object obj2) {
            d(this.f36668b + 1);
            AbstractC3431k.a(obj, obj2);
            Object[] objArr = this.keys;
            int i10 = this.f36668b;
            objArr[i10] = obj;
            this.values[i10] = obj2;
            this.f36668b = i10 + 1;
            return this;
        }

        @Override // com.google.common.collect.B.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public b g(Map.Entry entry) {
            super.g(entry);
            return this;
        }

        @Override // com.google.common.collect.B.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public b h(Iterable iterable) {
            super.h(iterable);
            return this;
        }

        @Override // com.google.common.collect.B.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public b i(Map map) {
            super.i(map);
            return this;
        }

        public b(Comparator comparator, int i10) {
            this.f36704e = (Comparator) Ra.n.k(comparator);
            this.keys = new Object[i10];
            this.values = new Object[i10];
        }
    }

    public static class c extends B.b {
        private static final long serialVersionUID = 0;

        /* renamed from: c, reason: collision with root package name */
        public final Comparator f36705c;

        public c(G g10) {
            super(g10);
            this.f36705c = g10.comparator();
        }

        @Override // com.google.common.collect.B.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public b b(int i10) {
            return new b(this.f36705c);
        }
    }

    public G(c0 c0Var, AbstractC3445z abstractC3445z) {
        this(c0Var, abstractC3445z, null);
    }

    public static G A(Comparator comparator, boolean z10, Iterable iterable) {
        Map.Entry[] entryArr = (Map.Entry[]) I.o(iterable, B.EMPTY_ENTRY_ARRAY);
        return B(comparator, z10, entryArr, entryArr.length);
    }

    public static G B(final Comparator comparator, boolean z10, Map.Entry[] entryArr, int i10) {
        if (i10 == 0) {
            return z(comparator);
        }
        if (i10 == 1) {
            Map.Entry entry = entryArr[0];
            Objects.requireNonNull(entry);
            Map.Entry entry2 = entry;
            return I(comparator, entry2.getKey(), entry2.getValue());
        }
        Object[] objArr = new Object[i10];
        Object[] objArr2 = new Object[i10];
        if (z10) {
            for (int i11 = 0; i11 < i10; i11++) {
                Map.Entry entry3 = entryArr[i11];
                Objects.requireNonNull(entry3);
                Map.Entry entry4 = entry3;
                Object key = entry4.getKey();
                Object value = entry4.getValue();
                AbstractC3431k.a(key, value);
                objArr[i11] = key;
                objArr2[i11] = value;
            }
        } else {
            Arrays.sort(entryArr, 0, i10, new Comparator() { // from class: com.google.common.collect.F
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return G.r(comparator, (Map.Entry) obj, (Map.Entry) obj2);
                }
            });
            Map.Entry entry5 = entryArr[0];
            Objects.requireNonNull(entry5);
            Map.Entry entry6 = entry5;
            Object key2 = entry6.getKey();
            objArr[0] = key2;
            Object value2 = entry6.getValue();
            objArr2[0] = value2;
            AbstractC3431k.a(objArr[0], value2);
            int i12 = 1;
            while (i12 < i10) {
                Map.Entry entry7 = entryArr[i12 - 1];
                Objects.requireNonNull(entry7);
                Map.Entry entry8 = entry7;
                Map.Entry entry9 = entryArr[i12];
                Objects.requireNonNull(entry9);
                Map.Entry entry10 = entry9;
                Object key3 = entry10.getKey();
                Object value3 = entry10.getValue();
                AbstractC3431k.a(key3, value3);
                objArr[i12] = key3;
                objArr2[i12] = value3;
                B.b(comparator.compare(key2, key3) != 0, "key", entry8, entry10);
                i12++;
                key2 = key3;
            }
        }
        return new G(new c0(AbstractC3445z.i(objArr), comparator), AbstractC3445z.i(objArr2));
    }

    public static G H() {
        return f36698h;
    }

    public static G I(Comparator comparator, Object obj, Object obj2) {
        return new G(new c0(AbstractC3445z.u(obj), (Comparator) Ra.n.k(comparator)), AbstractC3445z.u(obj2));
    }

    public static /* synthetic */ int r(Comparator comparator, Map.Entry entry, Map.Entry entry2) {
        Objects.requireNonNull(entry);
        Objects.requireNonNull(entry2);
        return comparator.compare(entry.getKey(), entry2.getKey());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static G v(Map map) {
        return w(map, (W) f36697g);
    }

    public static G w(Map map, Comparator comparator) {
        boolean z10 = false;
        if (map instanceof SortedMap) {
            Comparator comparator2 = ((SortedMap) map).comparator();
            if (comparator2 != null) {
                z10 = comparator.equals(comparator2);
            } else if (comparator == f36697g) {
                z10 = true;
            }
        }
        if (z10 && (map instanceof G)) {
            G g10 = (G) map;
            if (!g10.k()) {
                return g10;
            }
        }
        return A(comparator, z10, map.entrySet());
    }

    public static G z(Comparator comparator) {
        return W.h().equals(comparator) ? H() : new G(H.A(comparator), AbstractC3445z.t());
    }

    public final G C(int i10, int i11) {
        return (i10 == 0 && i11 == size()) ? this : i10 == i11 ? z(comparator()) : new G(this.f36699d.O(i10, i11), this.f36700e.subList(i10, i11));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public G headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public G headMap(Object obj, boolean z10) {
        return C(0, this.f36699d.P(Ra.n.k(obj), z10));
    }

    @Override // com.google.common.collect.B
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public H keySet() {
        return this.f36699d;
    }

    @Override // java.util.NavigableMap
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public H navigableKeySet() {
        return this.f36699d;
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public G subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public G subMap(Object obj, boolean z10, Object obj2, boolean z11) {
        Ra.n.k(obj);
        Ra.n.k(obj2);
        Ra.n.h(comparator().compare(obj, obj2) <= 0, "expected fromKey <= toKey but %s > %s", obj, obj2);
        return headMap(obj2, z11).tailMap(obj, z10);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public G tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public G tailMap(Object obj, boolean z10) {
        return C(this.f36699d.Q(Ra.n.k(obj), z10), size());
    }

    @Override // java.util.NavigableMap
    public Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public Object ceilingKey(Object obj) {
        return N.f(ceilingEntry(obj));
    }

    @Override // java.util.SortedMap
    public Comparator comparator() {
        return keySet().comparator();
    }

    @Override // com.google.common.collect.B
    public E f() {
        return isEmpty() ? E.q() : new a();
    }

    @Override // java.util.NavigableMap
    public Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().a().get(0);
    }

    @Override // java.util.SortedMap
    public Object firstKey() {
        return keySet().first();
    }

    @Override // java.util.NavigableMap
    public Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public Object floorKey(Object obj) {
        return N.f(floorEntry(obj));
    }

    @Override // com.google.common.collect.B
    public E g() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.B, java.util.Map
    public Object get(Object obj) {
        int indexOf = this.f36699d.indexOf(obj);
        if (indexOf == -1) {
            return null;
        }
        return this.f36700e.get(indexOf);
    }

    @Override // com.google.common.collect.B
    public AbstractC3443x h() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.NavigableMap
    public Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public Object higherKey(Object obj) {
        return N.f(higherEntry(obj));
    }

    @Override // com.google.common.collect.B, java.util.Map
    /* renamed from: i */
    public E entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.B
    public boolean k() {
        return this.f36699d.g() || this.f36700e.g();
    }

    @Override // java.util.NavigableMap
    public Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().a().get(size() - 1);
    }

    @Override // java.util.SortedMap
    public Object lastKey() {
        return keySet().last();
    }

    @Override // java.util.NavigableMap
    public Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public Object lowerKey(Object obj) {
        return N.f(lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.B, java.util.Map
    /* renamed from: q */
    public AbstractC3443x values() {
        return this.f36700e;
    }

    @Override // java.util.Map
    public int size() {
        return this.f36700e.size();
    }

    @Override // com.google.common.collect.B
    public Object writeReplace() {
        return new c(this);
    }

    @Override // java.util.NavigableMap
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public H descendingKeySet() {
        return this.f36699d.descendingSet();
    }

    @Override // java.util.NavigableMap
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public G descendingMap() {
        G g10 = this.f36701f;
        return g10 == null ? isEmpty() ? z(W.d(comparator()).o()) : new G((c0) this.f36699d.descendingSet(), this.f36700e.D(), this) : g10;
    }

    public G(c0 c0Var, AbstractC3445z abstractC3445z, G g10) {
        this.f36699d = c0Var;
        this.f36700e = abstractC3445z;
        this.f36701f = g10;
    }
}
