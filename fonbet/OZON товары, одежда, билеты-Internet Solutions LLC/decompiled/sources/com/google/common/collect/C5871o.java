package com.google.common.collect;

import Bl0.k0;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.google.common.collect.o, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C5871o<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: j, reason: collision with root package name */
    private static final Object f59109j = new Object();

    /* renamed from: a, reason: collision with root package name */
    private transient Object f59110a;

    /* renamed from: b, reason: collision with root package name */
    transient int[] f59111b;

    /* renamed from: c, reason: collision with root package name */
    transient Object[] f59112c;

    /* renamed from: d, reason: collision with root package name */
    transient Object[] f59113d;

    /* renamed from: e, reason: collision with root package name */
    private transient int f59114e;

    /* renamed from: f, reason: collision with root package name */
    private transient int f59115f;

    /* renamed from: g, reason: collision with root package name */
    private transient Set<K> f59116g;

    /* renamed from: h, reason: collision with root package name */
    private transient Set<Map.Entry<K, V>> f59117h;

    /* renamed from: i, reason: collision with root package name */
    private transient Collection<V> f59118i;

    /* renamed from: com.google.common.collect.o$a */
    class a extends AbstractSet<Map.Entry<K, V>> {
        a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            C5871o.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            C5871o c5871o = C5871o.this;
            Map<K, V> B11 = c5871o.B();
            if (B11 != null) {
                return B11.entrySet().contains(obj);
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int F11 = c5871o.F(entry.getKey());
                if (F11 != -1 && O7.h.b(C5871o.s(c5871o, F11), entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            C5871o c5871o = C5871o.this;
            Map<K, V> B11 = c5871o.B();
            return B11 != null ? B11.entrySet().iterator() : new C5869m(c5871o);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            int D11;
            int c11;
            C5871o c5871o = C5871o.this;
            Map<K, V> B11 = c5871o.B();
            if (B11 != null) {
                return B11.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (c5871o.I() || (c11 = C5872p.c(entry.getKey(), entry.getValue(), (D11 = c5871o.D()), C5871o.v(c5871o), c5871o.K(), c5871o.L(), c5871o.M())) == -1) {
                return false;
            }
            c5871o.H(c11, D11);
            C5871o.j(c5871o);
            c5871o.E();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return C5871o.this.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.collect.o$b */
    abstract class b<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        int f59120a;

        /* renamed from: b, reason: collision with root package name */
        int f59121b;

        /* renamed from: c, reason: collision with root package name */
        int f59122c;

        b() {
            this.f59120a = C5871o.this.f59114e;
            this.f59121b = C5871o.this.isEmpty() ? -1 : 0;
            this.f59122c = -1;
        }

        abstract T a(int i11);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f59121b >= 0;
        }

        @Override // java.util.Iterator
        public final T next() {
            C5871o c5871o = C5871o.this;
            if (c5871o.f59114e != this.f59120a) {
                throw new ConcurrentModificationException();
            }
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i11 = this.f59121b;
            this.f59122c = i11;
            T a11 = a(i11);
            this.f59121b = c5871o.C(this.f59121b);
            return a11;
        }

        @Override // java.util.Iterator
        public final void remove() {
            C5871o c5871o = C5871o.this;
            if (c5871o.f59114e != this.f59120a) {
                throw new ConcurrentModificationException();
            }
            k0.l("no calls to next() since the last call to remove()", this.f59122c >= 0);
            this.f59120a += 32;
            c5871o.remove(C5871o.e(c5871o, this.f59122c));
            this.f59121b--;
            this.f59122c = -1;
        }
    }

    /* renamed from: com.google.common.collect.o$c */
    class c extends AbstractSet<K> {
        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            C5871o.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return C5871o.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            C5871o c5871o = C5871o.this;
            Map<K, V> B11 = c5871o.B();
            return B11 != null ? B11.keySet().iterator() : new C5868l(c5871o);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            C5871o c5871o = C5871o.this;
            Map<K, V> B11 = c5871o.B();
            return B11 != null ? B11.keySet().remove(obj) : c5871o.J(obj) != C5871o.f59109j;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return C5871o.this.size();
        }
    }

    /* renamed from: com.google.common.collect.o$d */
    final class d extends AbstractC5862f<K, V> {

        /* renamed from: a, reason: collision with root package name */
        private final K f59125a;

        /* renamed from: b, reason: collision with root package name */
        private int f59126b;

        d(int i11) {
            this.f59125a = (K) C5871o.e(C5871o.this, i11);
            this.f59126b = i11;
        }

        private void a() {
            int i11 = this.f59126b;
            K k11 = this.f59125a;
            C5871o c5871o = C5871o.this;
            if (i11 == -1 || i11 >= c5871o.size() || !O7.h.b(k11, C5871o.e(c5871o, this.f59126b))) {
                this.f59126b = c5871o.F(k11);
            }
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f59125a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            C5871o c5871o = C5871o.this;
            Map<K, V> B11 = c5871o.B();
            if (B11 != null) {
                return B11.get(this.f59125a);
            }
            a();
            int i11 = this.f59126b;
            if (i11 == -1) {
                return null;
            }
            return (V) C5871o.s(c5871o, i11);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v11) {
            C5871o c5871o = C5871o.this;
            Map<K, V> B11 = c5871o.B();
            K k11 = this.f59125a;
            if (B11 != null) {
                return B11.put(k11, v11);
            }
            a();
            int i11 = this.f59126b;
            if (i11 == -1) {
                c5871o.put(k11, v11);
                return null;
            }
            V v12 = (V) C5871o.s(c5871o, i11);
            C5871o.l(c5871o, this.f59126b, v11);
            return v12;
        }
    }

    /* renamed from: com.google.common.collect.o$e */
    class e extends AbstractCollection<V> {
        e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            C5871o.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            C5871o c5871o = C5871o.this;
            Map<K, V> B11 = c5871o.B();
            return B11 != null ? B11.values().iterator() : new C5870n(c5871o);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return C5871o.this.size();
        }
    }

    public static <K, V> C5871o<K, V> A(int i11) {
        C5871o<K, V> c5871o = new C5871o<>();
        c5871o.G(i11);
        return c5871o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int D() {
        return (1 << (this.f59114e & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int F(Object obj) {
        if (I()) {
            return -1;
        }
        int b11 = C5877v.b(obj);
        int D11 = D();
        Object obj2 = this.f59110a;
        Objects.requireNonNull(obj2);
        int d11 = C5872p.d(b11 & D11, obj2);
        if (d11 == 0) {
            return -1;
        }
        int i11 = ~D11;
        int i12 = b11 & i11;
        do {
            int i13 = d11 - 1;
            int i14 = K()[i13];
            if ((i14 & i11) == i12 && O7.h.b(obj, L()[i13])) {
                return i13;
            }
            d11 = i14 & D11;
        } while (d11 != 0);
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object J(Object obj) {
        boolean I11 = I();
        Object obj2 = f59109j;
        if (I11) {
            return obj2;
        }
        int D11 = D();
        Object obj3 = this.f59110a;
        Objects.requireNonNull(obj3);
        int c11 = C5872p.c(obj, null, D11, obj3, K(), L(), null);
        if (c11 == -1) {
            return obj2;
        }
        Object obj4 = M()[c11];
        H(c11, D11);
        this.f59115f--;
        E();
        return obj4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] K() {
        int[] iArr = this.f59111b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] L() {
        Object[] objArr = this.f59112c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] M() {
        Object[] objArr = this.f59113d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private int N(int i11, int i12, int i13, int i14) {
        Object a11 = C5872p.a(i12);
        int i15 = i12 - 1;
        if (i14 != 0) {
            C5872p.e(i13 & i15, i14 + 1, a11);
        }
        Object obj = this.f59110a;
        Objects.requireNonNull(obj);
        int[] K11 = K();
        for (int i16 = 0; i16 <= i11; i16++) {
            int d11 = C5872p.d(i16, obj);
            while (d11 != 0) {
                int i17 = d11 - 1;
                int i18 = K11[i17];
                int i19 = ((~i11) & i18) | i16;
                int i21 = i19 & i15;
                int d12 = C5872p.d(i21, a11);
                C5872p.e(i21, d11, a11);
                K11[i17] = C5872p.b(i19, d12, i15);
                d11 = i18 & i11;
            }
        }
        this.f59110a = a11;
        this.f59114e = C5872p.b(this.f59114e, 32 - Integer.numberOfLeadingZeros(i15), 31);
        return i15;
    }

    static Object e(C5871o c5871o, int i11) {
        return c5871o.L()[i11];
    }

    static /* synthetic */ void j(C5871o c5871o) {
        c5871o.f59115f--;
    }

    static void l(C5871o c5871o, int i11, Object obj) {
        c5871o.M()[i11] = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(Ej.b.a(readInt, "Invalid size: "));
        }
        G(readInt);
        for (int i11 = 0; i11 < readInt; i11++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    static Object s(C5871o c5871o, int i11) {
        return c5871o.M()[i11];
    }

    static Object v(C5871o c5871o) {
        Object obj = c5871o.f59110a;
        Objects.requireNonNull(obj);
        return obj;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Map<K, V> B11 = B();
        Iterator<Map.Entry<K, V>> it = B11 != null ? B11.entrySet().iterator() : new C5869m(this);
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    final Map<K, V> B() {
        Object obj = this.f59110a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    final int C(int i11) {
        int i12 = i11 + 1;
        if (i12 < this.f59115f) {
            return i12;
        }
        return -1;
    }

    final void E() {
        this.f59114e += 32;
    }

    final void G(int i11) {
        k0.d("Expected size must be >= 0", i11 >= 0);
        this.f59114e = Math.min(Math.max(i11, 1), 1073741823);
    }

    final void H(int i11, int i12) {
        Object obj = this.f59110a;
        Objects.requireNonNull(obj);
        int[] K11 = K();
        Object[] L11 = L();
        Object[] M11 = M();
        int size = size();
        int i13 = size - 1;
        if (i11 >= i13) {
            L11[i11] = null;
            M11[i11] = null;
            K11[i11] = 0;
            return;
        }
        Object obj2 = L11[i13];
        L11[i11] = obj2;
        M11[i11] = M11[i13];
        L11[i13] = null;
        M11[i13] = null;
        K11[i11] = K11[i13];
        K11[i13] = 0;
        int b11 = C5877v.b(obj2) & i12;
        int d11 = C5872p.d(b11, obj);
        if (d11 == size) {
            C5872p.e(b11, i11 + 1, obj);
            return;
        }
        while (true) {
            int i14 = d11 - 1;
            int i15 = K11[i14];
            int i16 = i15 & i12;
            if (i16 == size) {
                K11[i14] = C5872p.b(i15, i11 + 1, i12);
                return;
            }
            d11 = i16;
        }
    }

    final boolean I() {
        return this.f59110a == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (I()) {
            return;
        }
        E();
        Map<K, V> B11 = B();
        if (B11 != null) {
            this.f59114e = Math.min(Math.max(size(), 3), 1073741823);
            B11.clear();
            this.f59110a = null;
            this.f59115f = 0;
            return;
        }
        Arrays.fill(L(), 0, this.f59115f, (Object) null);
        Arrays.fill(M(), 0, this.f59115f, (Object) null);
        Object obj = this.f59110a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(K(), 0, this.f59115f, 0);
        this.f59115f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map<K, V> B11 = B();
        return B11 != null ? B11.containsKey(obj) : F(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map<K, V> B11 = B();
        if (B11 != null) {
            return B11.containsValue(obj);
        }
        for (int i11 = 0; i11 < this.f59115f; i11++) {
            if (O7.h.b(obj, M()[i11])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f59117h;
        if (set != null) {
            return set;
        }
        a aVar = new a();
        this.f59117h = aVar;
        return aVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Map<K, V> B11 = B();
        if (B11 != null) {
            return B11.get(obj);
        }
        int F11 = F(obj);
        if (F11 == -1) {
            return null;
        }
        return (V) M()[F11];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.f59116g;
        if (set != null) {
            return set;
        }
        c cVar = new c();
        this.f59116g = cVar;
        return cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k11, V v11) {
        int i11;
        int i12 = 1;
        if (I()) {
            k0.l("Arrays already allocated", I());
            int i13 = this.f59114e;
            int max = Math.max(i13 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) (1.0d * highestOneBit)) && (highestOneBit = highestOneBit << 1) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f59110a = C5872p.a(max2);
            this.f59114e = C5872p.b(this.f59114e, 32 - Integer.numberOfLeadingZeros(max2 - 1), 31);
            this.f59111b = new int[i13];
            this.f59112c = new Object[i13];
            this.f59113d = new Object[i13];
        }
        Map<K, V> B11 = B();
        if (B11 != null) {
            return B11.put(k11, v11);
        }
        int[] K11 = K();
        Object[] L11 = L();
        Object[] M11 = M();
        int i14 = this.f59115f;
        int i15 = i14 + 1;
        int b11 = C5877v.b(k11);
        int D11 = D();
        int i16 = b11 & D11;
        Object obj = this.f59110a;
        Objects.requireNonNull(obj);
        int d11 = C5872p.d(i16, obj);
        if (d11 == 0) {
            if (i15 > D11) {
                D11 = N(D11, (D11 + 1) * (D11 < 32 ? 4 : 2), b11, i14);
            } else {
                Object obj2 = this.f59110a;
                Objects.requireNonNull(obj2);
                C5872p.e(i16, i15, obj2);
            }
            i11 = 1;
        } else {
            int i17 = ~D11;
            int i18 = b11 & i17;
            int i19 = 0;
            while (true) {
                int i21 = d11 - i12;
                i11 = i12;
                int i22 = K11[i21];
                if ((i22 & i17) == i18 && O7.h.b(k11, L11[i21])) {
                    V v12 = (V) M11[i21];
                    M11[i21] = v11;
                    return v12;
                }
                int i23 = i22 & D11;
                int i24 = i19 + 1;
                if (i23 != 0) {
                    d11 = i23;
                    i19 = i24;
                    i12 = i11;
                } else {
                    if (i24 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(D() + 1, 1.0f);
                        int i25 = isEmpty() ? -1 : 0;
                        while (i25 >= 0) {
                            linkedHashMap.put(L()[i25], M()[i25]);
                            i25 = C(i25);
                        }
                        this.f59110a = linkedHashMap;
                        this.f59111b = null;
                        this.f59112c = null;
                        this.f59113d = null;
                        E();
                        return (V) linkedHashMap.put(k11, v11);
                    }
                    if (i15 > D11) {
                        D11 = N(D11, (D11 + 1) * (D11 < 32 ? 4 : 2), b11, i14);
                    } else {
                        K11[i21] = C5872p.b(i22, i15, D11);
                    }
                }
            }
        }
        int length = K().length;
        if (i15 > length) {
            int i26 = i11;
            int min = Math.min(1073741823, (Math.max(i26, length >>> 1) + length) | i26);
            if (min != length) {
                this.f59111b = Arrays.copyOf(K(), min);
                this.f59112c = Arrays.copyOf(L(), min);
                this.f59113d = Arrays.copyOf(M(), min);
            }
        }
        K()[i14] = C5872p.b(b11, 0, D11);
        L()[i14] = k11;
        M()[i14] = v11;
        this.f59115f = i15;
        E();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        Map<K, V> B11 = B();
        if (B11 != null) {
            return B11.remove(obj);
        }
        V v11 = (V) J(obj);
        if (v11 == f59109j) {
            return null;
        }
        return v11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map<K, V> B11 = B();
        return B11 != null ? B11.size() : this.f59115f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.f59118i;
        if (collection != null) {
            return collection;
        }
        e eVar = new e();
        this.f59118i = eVar;
        return eVar;
    }
}
