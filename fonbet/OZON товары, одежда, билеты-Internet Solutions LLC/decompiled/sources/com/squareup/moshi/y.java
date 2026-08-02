package com.squareup.moshi;

import gd.InterfaceC6712a;
import gd.InterfaceC6715d;
import java.io.Serializable;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.AbstractC7700g;
import kotlin.collections.AbstractC7701h;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.U;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class y<K, V> extends AbstractC7700g<K, V> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Comparator<Object> f60479a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private d<K, V>[] f60480b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final d<K, V> f60481c;

    /* renamed from: d, reason: collision with root package name */
    private int f60482d;

    /* renamed from: e, reason: collision with root package name */
    private int f60483e;

    /* renamed from: f, reason: collision with root package name */
    private int f60484f;

    /* renamed from: g, reason: collision with root package name */
    private y<K, V>.a f60485g;

    /* renamed from: h, reason: collision with root package name */
    private y<K, V>.b f60486h;

    public final class a extends AbstractC7701h<Map.Entry<K, V>> {

        /* renamed from: com.squareup.moshi.y$a$a, reason: collision with other inner class name */
        public static final class C0919a extends y<K, V>.c<Map.Entry<K, V>> {
            @Override // java.util.Iterator
            public final Object next() {
                d<K, V> b11 = b();
                U.e(b11);
                return b11;
            }
        }

        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry element = (Map.Entry) obj;
            Intrinsics.checkNotNullParameter(element, "element");
            throw new Sc.p(null, 1, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            y.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!U.i(obj)) {
                return false;
            }
            Map.Entry<?, ?> element = (Map.Entry) obj;
            Intrinsics.checkNotNullParameter(element, "element");
            return y.this.p(element) != null;
        }

        @Override // kotlin.collections.AbstractC7701h
        public final int getSize() {
            return y.this.h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @NotNull
        public final Iterator<Map.Entry<K, V>> iterator() {
            return y.this.new C0919a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            y<K, V> yVar;
            d<K, V> p11;
            if (!U.i(obj)) {
                return false;
            }
            Map.Entry<?, ?> element = (Map.Entry) obj;
            Intrinsics.checkNotNullParameter(element, "element");
            if (!(element instanceof d) || (p11 = (yVar = y.this).p(element)) == null) {
                return false;
            }
            yVar.u(p11, true);
            return true;
        }
    }

    /* loaded from: classes9.dex */
    public final class b extends AbstractC7701h<K> {

        public static final class a extends y<K, V>.c<K> {
            @Override // java.util.Iterator
            public final K next() {
                K key = b().getKey();
                if (key != null) {
                    return key;
                }
                throw new NoSuchElementException();
            }
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(K k11) {
            throw new Sc.p(null, 1, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            y.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return y.this.containsKey(obj);
        }

        @Override // kotlin.collections.AbstractC7701h
        public final int getSize() {
            return y.this.h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @NotNull
        public final Iterator<K> iterator() {
            return y.this.new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return y.this.v(obj) != null;
        }
    }

    public abstract class c<T> implements Iterator<T>, InterfaceC6712a {

        /* renamed from: a, reason: collision with root package name */
        private d<K, V> f60489a;

        /* renamed from: b, reason: collision with root package name */
        private d<K, V> f60490b;

        /* renamed from: c, reason: collision with root package name */
        private int f60491c;

        public c() {
            this.f60489a = y.this.f60481c.f60496d;
            this.f60491c = y.this.f60483e;
        }

        @NotNull
        public final d<K, V> b() {
            d<K, V> dVar = this.f60489a;
            y<K, V> yVar = y.this;
            if (dVar == ((y) yVar).f60481c) {
                throw new NoSuchElementException();
            }
            if (((y) yVar).f60483e != this.f60491c) {
                throw new ConcurrentModificationException();
            }
            Intrinsics.f(dVar);
            this.f60489a = dVar.f60496d;
            this.f60490b = dVar;
            return dVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f60489a != ((y) y.this).f60481c;
        }

        @Override // java.util.Iterator
        public final void remove() {
            d<K, V> dVar = this.f60490b;
            if (dVar == null) {
                throw new IllegalStateException("Required value was null.");
            }
            y<K, V> yVar = y.this;
            yVar.u(dVar, true);
            this.f60490b = null;
            this.f60491c = ((y) yVar).f60483e;
        }
    }

    public y(int i11) {
        z zVar;
        zVar = A.f60346a;
        this.f60479a = zVar;
        this.f60480b = new d[16];
        this.f60481c = new d<>();
        d<K, V>[] dVarArr = this.f60480b;
        this.f60484f = (dVarArr.length / 4) + (dVarArr.length / 2);
    }

    private final void A(d<K, V> dVar) {
        d<K, V> dVar2 = dVar.f60494b;
        d<K, V> dVar3 = dVar.f60495c;
        Intrinsics.f(dVar3);
        d<K, V> dVar4 = dVar3.f60494b;
        d<K, V> dVar5 = dVar3.f60495c;
        dVar.f60495c = dVar4;
        if (dVar4 != null) {
            dVar4.f60493a = dVar;
        }
        y(dVar, dVar3);
        dVar3.f60494b = dVar;
        dVar.f60493a = dVar3;
        int max = Math.max(dVar2 != null ? dVar2.f60501i : 0, dVar4 != null ? dVar4.f60501i : 0) + 1;
        dVar.f60501i = max;
        dVar3.f60501i = Math.max(max, dVar5 != null ? dVar5.f60501i : 0) + 1;
    }

    private final void B(d<K, V> dVar) {
        d<K, V> dVar2 = dVar.f60494b;
        d<K, V> dVar3 = dVar.f60495c;
        Intrinsics.f(dVar2);
        d<K, V> dVar4 = dVar2.f60494b;
        d<K, V> dVar5 = dVar2.f60495c;
        dVar.f60494b = dVar5;
        if (dVar5 != null) {
            dVar5.f60493a = dVar;
        }
        y(dVar, dVar2);
        dVar2.f60495c = dVar;
        dVar.f60493a = dVar2;
        int max = Math.max(dVar3 != null ? dVar3.f60501i : 0, dVar5 != null ? dVar5.f60501i : 0) + 1;
        dVar.f60501i = max;
        dVar2.f60501i = Math.max(max, dVar4 != null ? dVar4.f60501i : 0) + 1;
    }

    private final void s(d<K, V> dVar, boolean z11) {
        while (dVar != null) {
            d<K, V> dVar2 = dVar.f60494b;
            d<K, V> dVar3 = dVar.f60495c;
            int i11 = dVar2 != null ? dVar2.f60501i : 0;
            int i12 = dVar3 != null ? dVar3.f60501i : 0;
            int i13 = i11 - i12;
            if (i13 == -2) {
                Intrinsics.f(dVar3);
                d<K, V> dVar4 = dVar3.f60494b;
                d<K, V> dVar5 = dVar3.f60495c;
                int i14 = (dVar4 != null ? dVar4.f60501i : 0) - (dVar5 != null ? dVar5.f60501i : 0);
                if (i14 != -1 && (i14 != 0 || z11)) {
                    B(dVar3);
                }
                A(dVar);
                if (z11) {
                    return;
                }
            } else if (i13 == 0) {
                dVar.f60501i = i11 + 1;
                if (z11) {
                    return;
                }
            } else if (i13 != 2) {
                dVar.f60501i = Math.max(i11, i12) + 1;
                if (!z11) {
                    return;
                }
            } else {
                Intrinsics.f(dVar2);
                d<K, V> dVar6 = dVar2.f60494b;
                d<K, V> dVar7 = dVar2.f60495c;
                int i15 = (dVar6 != null ? dVar6.f60501i : 0) - (dVar7 != null ? dVar7.f60501i : 0);
                if (i15 != 1 && (i15 != 0 || z11)) {
                    A(dVar2);
                }
                B(dVar);
                if (z11) {
                    return;
                }
            }
            dVar = dVar.f60493a;
        }
    }

    private final Object writeReplace() {
        return new LinkedHashMap(this);
    }

    private final void y(d<K, V> dVar, d<K, V> dVar2) {
        d<K, V> dVar3 = dVar.f60493a;
        dVar.f60493a = null;
        if (dVar2 != null) {
            dVar2.f60493a = dVar3;
        }
        if (dVar3 == null) {
            this.f60480b[dVar.f60499g & (r0.length - 1)] = dVar2;
        } else if (dVar3.f60494b == dVar) {
            dVar3.f60494b = dVar2;
        } else {
            dVar3.f60495c = dVar2;
        }
    }

    @Override // kotlin.collections.AbstractC7700g
    @NotNull
    public final Set<Map.Entry<K, V>> b() {
        y<K, V>.a aVar = this.f60485g;
        if (aVar != null) {
            return aVar;
        }
        y<K, V>.a aVar2 = new a();
        this.f60485g = aVar2;
        return aVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        C7705l.x(r0, null, 0, this.f60480b.length);
        this.f60482d = 0;
        this.f60483e++;
        d<K, V> dVar = this.f60481c;
        d<K, V> dVar2 = dVar.f60496d;
        while (dVar2 != dVar) {
            Intrinsics.f(dVar2);
            d<K, V> dVar3 = dVar2.f60496d;
            dVar2.f60497e = null;
            dVar2.f60496d = null;
            dVar2 = dVar3;
        }
        dVar.f60497e = dVar;
        dVar.f60496d = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        d<K, V> dVar = null;
        if (obj != 0) {
            try {
                dVar = n(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return dVar != null;
    }

    @Override // kotlin.collections.AbstractC7700g
    @NotNull
    public final Set<K> e() {
        y<K, V>.b bVar = this.f60486h;
        if (bVar != null) {
            return bVar;
        }
        y<K, V>.b bVar2 = new b();
        this.f60486h = bVar2;
        return bVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V get(Object obj) {
        d<K, V> dVar;
        if (obj != 0) {
            try {
                dVar = n(obj, false);
            } catch (ClassCastException unused) {
            }
            if (dVar == null) {
                return dVar.f60500h;
            }
            return null;
        }
        dVar = null;
        if (dVar == null) {
        }
    }

    @Override // kotlin.collections.AbstractC7700g
    public final int h() {
        return this.f60482d;
    }

    public final d<K, V> n(K k11, boolean z11) {
        int i11;
        d<K, V> dVar;
        z zVar;
        z zVar2;
        Comparable comparable;
        d<K, V>[] dVarArr = this.f60480b;
        int hashCode = k11 != null ? k11.hashCode() : 0;
        int i12 = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
        int i13 = ((i12 >>> 7) ^ i12) ^ (i12 >>> 4);
        int length = i13 & (dVarArr.length - 1);
        d<K, V> dVar2 = dVarArr[length];
        Comparator<Object> comparator = this.f60479a;
        if (dVar2 != null) {
            zVar2 = A.f60346a;
            if (comparator == zVar2) {
                Intrinsics.g(k11, "null cannot be cast to non-null type kotlin.Comparable<kotlin.Any?>");
                comparable = (Comparable) k11;
            } else {
                comparable = null;
            }
            while (true) {
                K key = dVar2.getKey();
                int compareTo = comparable != null ? comparable.compareTo(key) : comparator.compare(k11, key);
                if (compareTo == 0) {
                    return dVar2;
                }
                d<K, V> dVar3 = compareTo < 0 ? dVar2.f60494b : dVar2.f60495c;
                if (dVar3 == null) {
                    i11 = compareTo;
                    break;
                }
                dVar2 = dVar3;
            }
        } else {
            i11 = 0;
        }
        if (!z11) {
            return null;
        }
        d<K, V> dVar4 = this.f60481c;
        if (dVar2 == null) {
            zVar = A.f60346a;
            if (comparator == zVar && !(k11 instanceof Comparable)) {
                Intrinsics.g(k11, "null cannot be cast to non-null type kotlin.Any");
                throw new ClassCastException(k11.getClass().getName().concat(" is not Comparable"));
            }
            dVar = new d<>(null, k11, i13, dVar4, dVar4.f60497e);
            dVarArr[length] = dVar;
        } else {
            d<K, V> dVar5 = dVar2;
            dVar = new d<>(dVar5, k11, i13, dVar4, dVar4.f60497e);
            if (i11 < 0) {
                dVar5.f60494b = dVar;
            } else {
                dVar5.f60495c = dVar;
            }
            s(dVar5, true);
        }
        int i14 = this.f60482d;
        this.f60482d = i14 + 1;
        if (i14 > this.f60484f) {
            d<K, V>[] oldTable = this.f60480b;
            Intrinsics.checkNotNullParameter(oldTable, "oldTable");
            int length2 = oldTable.length;
            int i15 = length2 * 2;
            d<K, V>[] dVarArr2 = new d[i15];
            C5974f c5974f = new C5974f();
            C5973e c5973e = new C5973e();
            C5973e c5973e2 = new C5973e();
            for (int i16 = 0; i16 < length2; i16++) {
                d<K, V> dVar6 = oldTable[i16];
                if (dVar6 != null) {
                    c5974f.b(dVar6);
                    int i17 = 0;
                    int i18 = 0;
                    while (true) {
                        d<K, V> a11 = c5974f.a();
                        if (a11 == null) {
                            break;
                        }
                        if ((a11.f60499g & length2) == 0) {
                            i17++;
                        } else {
                            i18++;
                        }
                    }
                    c5973e.b(i17);
                    c5973e2.b(i18);
                    c5974f.b(dVar6);
                    while (true) {
                        d<K, V> a12 = c5974f.a();
                        if (a12 == null) {
                            break;
                        }
                        if ((a12.f60499g & length2) == 0) {
                            c5973e.a(a12);
                        } else {
                            c5973e2.a(a12);
                        }
                    }
                    dVarArr2[i16] = i17 > 0 ? c5973e.c() : null;
                    dVarArr2[i16 + length2] = i18 > 0 ? c5973e2.c() : null;
                }
            }
            this.f60480b = dVarArr2;
            this.f60484f = (i15 / 4) + (i15 / 2);
        }
        this.f60483e++;
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final d<K, V> p(@NotNull Map.Entry<?, ?> entry) {
        d<K, V> dVar;
        V v11;
        Object value;
        Intrinsics.checkNotNullParameter(entry, "entry");
        Object key = entry.getKey();
        if (key != null) {
            try {
                dVar = n(key, false);
            } catch (ClassCastException unused) {
            }
            if (dVar != null || ((v11 = dVar.f60500h) != (value = entry.getValue()) && (v11 == null || !v11.equals(value)))) {
                return null;
            }
            return dVar;
        }
        dVar = null;
        if (dVar != null) {
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k11, V v11) {
        d<K, V> n11 = n(k11, true);
        V v12 = n11.f60500h;
        n11.f60500h = v11;
        return v12;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        d<K, V> v11 = v(obj);
        if (v11 != null) {
            return v11.f60500h;
        }
        return null;
    }

    public final void u(@NotNull d<K, V> node, boolean z11) {
        d<K, V> dVar;
        d<K, V> dVar2;
        int i11;
        Intrinsics.checkNotNullParameter(node, "node");
        if (z11) {
            d<K, V> dVar3 = node.f60497e;
            dVar3.f60496d = node.f60496d;
            node.f60496d.f60497e = dVar3;
            node.f60497e = null;
            node.f60496d = null;
        }
        d<K, V> dVar4 = node.f60494b;
        d<K, V> dVar5 = node.f60495c;
        d<K, V> dVar6 = node.f60493a;
        int i12 = 0;
        if (dVar4 == null || dVar5 == null) {
            if (dVar4 != null) {
                y(node, dVar4);
                node.f60494b = null;
            } else if (dVar5 != null) {
                y(node, dVar5);
                node.f60495c = null;
            } else {
                y(node, null);
            }
            s(dVar6, false);
            this.f60482d--;
            this.f60483e++;
            return;
        }
        if (dVar4.f60501i > dVar5.f60501i) {
            d<K, V> dVar7 = dVar4.f60495c;
            while (true) {
                d<K, V> dVar8 = dVar7;
                dVar2 = dVar4;
                dVar4 = dVar8;
                if (dVar4 == null) {
                    break;
                } else {
                    dVar7 = dVar4.f60495c;
                }
            }
        } else {
            d<K, V> dVar9 = dVar5.f60494b;
            while (true) {
                dVar = dVar5;
                dVar5 = dVar9;
                if (dVar5 == null) {
                    break;
                } else {
                    dVar9 = dVar5.f60494b;
                }
            }
            dVar2 = dVar;
        }
        u(dVar2, false);
        d<K, V> dVar10 = node.f60494b;
        if (dVar10 != null) {
            i11 = dVar10.f60501i;
            dVar2.f60494b = dVar10;
            dVar10.f60493a = dVar2;
            node.f60494b = null;
        } else {
            i11 = 0;
        }
        d<K, V> dVar11 = node.f60495c;
        if (dVar11 != null) {
            i12 = dVar11.f60501i;
            dVar2.f60495c = dVar11;
            dVar11.f60493a = dVar2;
            node.f60495c = null;
        }
        dVar2.f60501i = Math.max(i11, i12) + 1;
        y(node, dVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final d<K, V> v(Object obj) {
        d<K, V> dVar = null;
        if (obj != 0) {
            try {
                dVar = n(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (dVar != null) {
            u(dVar, true);
        }
        return dVar;
    }

    public static final class d<K, V> implements Map.Entry<K, V>, InterfaceC6715d.a {

        /* renamed from: a, reason: collision with root package name */
        public d<K, V> f60493a;

        /* renamed from: b, reason: collision with root package name */
        public d<K, V> f60494b;

        /* renamed from: c, reason: collision with root package name */
        public d<K, V> f60495c;

        /* renamed from: d, reason: collision with root package name */
        public d<K, V> f60496d;

        /* renamed from: e, reason: collision with root package name */
        public d<K, V> f60497e;

        /* renamed from: f, reason: collision with root package name */
        private K f60498f;

        /* renamed from: g, reason: collision with root package name */
        public final int f60499g;

        /* renamed from: h, reason: collision with root package name */
        public V f60500h;

        /* renamed from: i, reason: collision with root package name */
        public int f60501i;

        public d() {
            this.f60498f = null;
            this.f60499g = -1;
            this.f60497e = this;
            this.f60496d = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                K k11 = this.f60498f;
                if (k11 == null ? key == null : Intrinsics.d(k11, key)) {
                    V v11 = this.f60500h;
                    if (v11 == null ? value == null : Intrinsics.d(v11, value)) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f60498f;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f60500h;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            int i11 = 0;
            K k11 = this.f60498f;
            int hashCode = k11 != null ? k11.hashCode() : 0;
            V v11 = this.f60500h;
            if (v11 != null && v11 != null) {
                i11 = v11.hashCode();
            }
            return i11 ^ hashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v11) {
            V v12 = this.f60500h;
            this.f60500h = v11;
            return v12;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f60498f);
            sb2.append('=');
            sb2.append(this.f60500h);
            return sb2.toString();
        }

        public d(d<K, V> dVar, K k11, int i11, @NotNull d<K, V> next, @NotNull d<K, V> prev) {
            Intrinsics.checkNotNullParameter(next, "next");
            Intrinsics.checkNotNullParameter(prev, "prev");
            this.f60493a = dVar;
            this.f60498f = k11;
            this.f60499g = i11;
            this.f60501i = 1;
            this.f60496d = next;
            this.f60497e = prev;
            prev.f60496d = this;
            next.f60497e = this;
        }
    }
}
