package com.google.common.collect;

import com.google.common.collect.AbstractC3443x;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;

/* loaded from: classes3.dex */
public abstract class B implements Map, Serializable {
    static final Map.Entry<?, ?>[] EMPTY_ENTRY_ARRAY = new Map.Entry[0];
    private static final long serialVersionUID = 912559;

    /* renamed from: a, reason: collision with root package name */
    public transient E f36664a;

    /* renamed from: b, reason: collision with root package name */
    public transient E f36665b;

    /* renamed from: c, reason: collision with root package name */
    public transient AbstractC3443x f36666c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public Comparator f36667a;
        Object[] alternatingKeysAndValues;

        /* renamed from: b, reason: collision with root package name */
        public int f36668b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f36669c;

        /* renamed from: d, reason: collision with root package name */
        public C0506a f36670d;

        /* renamed from: com.google.common.collect.B$a$a, reason: collision with other inner class name */
        public static final class C0506a {

            /* renamed from: a, reason: collision with root package name */
            public final Object f36671a;

            /* renamed from: b, reason: collision with root package name */
            public final Object f36672b;

            /* renamed from: c, reason: collision with root package name */
            public final Object f36673c;

            public C0506a(Object obj, Object obj2, Object obj3) {
                this.f36671a = obj;
                this.f36672b = obj2;
                this.f36673c = obj3;
            }

            public IllegalArgumentException a() {
                return new IllegalArgumentException("Multiple entries with same key: " + this.f36671a + "=" + this.f36672b + " and " + this.f36671a + "=" + this.f36673c);
            }
        }

        public a() {
            this(4);
        }

        private void d(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.alternatingKeysAndValues;
            if (i11 > objArr.length) {
                this.alternatingKeysAndValues = Arrays.copyOf(objArr, AbstractC3443x.b.d(objArr.length, i11));
                this.f36669c = false;
            }
        }

        public static void j(Object[] objArr, int i10, Comparator comparator) {
            Map.Entry[] entryArr = new Map.Entry[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * 2;
                Object obj = objArr[i12];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i12 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i11] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i10, W.d(comparator).n(N.m()));
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * 2;
                objArr[i14] = entryArr[i13].getKey();
                objArr[i14 + 1] = entryArr[i13].getValue();
            }
        }

        public B a() {
            return c();
        }

        public final B b(boolean z10) {
            Object[] objArr;
            C0506a c0506a;
            C0506a c0506a2;
            if (z10 && (c0506a2 = this.f36670d) != null) {
                throw c0506a2.a();
            }
            int i10 = this.f36668b;
            if (this.f36667a == null) {
                objArr = this.alternatingKeysAndValues;
            } else {
                if (this.f36669c) {
                    this.alternatingKeysAndValues = Arrays.copyOf(this.alternatingKeysAndValues, i10 * 2);
                }
                objArr = this.alternatingKeysAndValues;
                if (!z10) {
                    objArr = e(objArr, this.f36668b);
                    if (objArr.length < this.alternatingKeysAndValues.length) {
                        i10 = objArr.length >>> 1;
                    }
                }
                j(objArr, i10, this.f36667a);
            }
            this.f36669c = true;
            a0 s10 = a0.s(i10, objArr, this);
            if (!z10 || (c0506a = this.f36670d) == null) {
                return s10;
            }
            throw c0506a.a();
        }

        public B c() {
            return b(true);
        }

        public final Object[] e(Object[] objArr, int i10) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                Object obj = objArr[i11 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i11);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i10 - bitSet.cardinality()) * 2];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10 * 2) {
                if (bitSet.get(i12 >>> 1)) {
                    i12 += 2;
                } else {
                    int i14 = i13 + 1;
                    int i15 = i12 + 1;
                    Object obj2 = objArr[i12];
                    Objects.requireNonNull(obj2);
                    objArr2[i13] = obj2;
                    i13 += 2;
                    i12 += 2;
                    Object obj3 = objArr[i15];
                    Objects.requireNonNull(obj3);
                    objArr2[i14] = obj3;
                }
            }
            return objArr2;
        }

        public a f(Object obj, Object obj2) {
            d(this.f36668b + 1);
            AbstractC3431k.a(obj, obj2);
            Object[] objArr = this.alternatingKeysAndValues;
            int i10 = this.f36668b;
            objArr[i10 * 2] = obj;
            objArr[(i10 * 2) + 1] = obj2;
            this.f36668b = i10 + 1;
            return this;
        }

        public a g(Map.Entry entry) {
            return f(entry.getKey(), entry.getValue());
        }

        public a h(Iterable iterable) {
            if (iterable instanceof Collection) {
                d(this.f36668b + ((Collection) iterable).size());
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                g((Map.Entry) it.next());
            }
            return this;
        }

        public a i(Map map) {
            return h(map.entrySet());
        }

        public a(int i10) {
            this.alternatingKeysAndValues = new Object[i10 * 2];
            this.f36668b = 0;
            this.f36669c = false;
        }
    }

    public static class b implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Object f36674a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f36675b;

        public b(B b10) {
            Object[] objArr = new Object[b10.size()];
            Object[] objArr2 = new Object[b10.size()];
            m0 it = b10.entrySet().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                objArr[i10] = entry.getKey();
                objArr2[i10] = entry.getValue();
                i10++;
            }
            this.f36674a = objArr;
            this.f36675b = objArr2;
        }

        public final Object a() {
            Object[] objArr = (Object[]) this.f36674a;
            Object[] objArr2 = (Object[]) this.f36675b;
            a b10 = b(objArr.length);
            for (int i10 = 0; i10 < objArr.length; i10++) {
                b10.f(objArr[i10], objArr2[i10]);
            }
            return b10.c();
        }

        public a b(int i10) {
            return new a(i10);
        }

        public final Object readResolve() {
            Object obj = this.f36674a;
            if (!(obj instanceof E)) {
                return a();
            }
            E e10 = (E) obj;
            AbstractC3443x abstractC3443x = (AbstractC3443x) this.f36675b;
            a b10 = b(e10.size());
            m0 it = e10.iterator();
            m0 it2 = abstractC3443x.iterator();
            while (it.hasNext()) {
                b10.f(it.next(), it2.next());
            }
            return b10.c();
        }
    }

    public static a a() {
        return new a();
    }

    public static void b(boolean z10, String str, Object obj, Object obj2) {
        if (!z10) {
            throw c(str, obj, obj2);
        }
    }

    public static IllegalArgumentException c(String str, Object obj, Object obj2) {
        return new IllegalArgumentException("Multiple entries with same " + str + ": " + obj + " and " + obj2);
    }

    public static B d(Iterable iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.h(iterable);
        return aVar.a();
    }

    public static B e(Map map) {
        if ((map instanceof B) && !(map instanceof SortedMap)) {
            B b10 = (B) map;
            if (!b10.k()) {
                return b10;
            }
        }
        return d(map.entrySet());
    }

    public static B m() {
        return a0.f36750f;
    }

    public static B n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        AbstractC3431k.a(obj, obj2);
        AbstractC3431k.a(obj3, obj4);
        AbstractC3431k.a(obj5, obj6);
        AbstractC3431k.a(obj7, obj8);
        return a0.r(4, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8});
    }

    public static B o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        AbstractC3431k.a(obj, obj2);
        AbstractC3431k.a(obj3, obj4);
        AbstractC3431k.a(obj5, obj6);
        AbstractC3431k.a(obj7, obj8);
        AbstractC3431k.a(obj9, obj10);
        return a0.r(5, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10});
    }

    public static B p(Map.Entry... entryArr) {
        return d(Arrays.asList(entryArr));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return N.c(this, obj);
    }

    public abstract E f();

    public abstract E g();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public abstract AbstractC3443x h();

    @Override // java.util.Map
    public int hashCode() {
        return g0.d(entrySet());
    }

    @Override // java.util.Map
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public E entrySet() {
        E e10 = this.f36664a;
        if (e10 != null) {
            return e10;
        }
        E f10 = f();
        this.f36664a = f10;
        return f10;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean j() {
        return false;
    }

    public abstract boolean k();

    @Override // java.util.Map
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public E keySet() {
        E e10 = this.f36665b;
        if (e10 != null) {
            return e10;
        }
        E g10 = g();
        this.f36665b = g10;
        return g10;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public AbstractC3443x values() {
        AbstractC3443x abstractC3443x = this.f36666c;
        if (abstractC3443x != null) {
            return abstractC3443x;
        }
        AbstractC3443x h10 = h();
        this.f36666c = h10;
        return h10;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return N.l(this);
    }

    public Object writeReplace() {
        return new b(this);
    }
}
