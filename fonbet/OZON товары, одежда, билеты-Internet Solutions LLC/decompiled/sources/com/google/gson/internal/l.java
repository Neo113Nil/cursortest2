package com.google.gson.internal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class l<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    private static final Comparator<Comparable> f59972i = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Comparator<? super K> f59973a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f59974b;

    /* renamed from: c, reason: collision with root package name */
    e<K, V> f59975c;

    /* renamed from: d, reason: collision with root package name */
    int f59976d;

    /* renamed from: e, reason: collision with root package name */
    int f59977e;

    /* renamed from: f, reason: collision with root package name */
    final e<K, V> f59978f;

    /* renamed from: g, reason: collision with root package name */
    private l<K, V>.b f59979g;

    /* renamed from: h, reason: collision with root package name */
    private l<K, V>.c f59980h;

    final class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public final int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    class b extends AbstractSet<Map.Entry<K, V>> {

        final class a extends l<K, V>.d<Map.Entry<K, V>> {
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            l.this.clear();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[RETURN] */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean contains(Object obj) {
            e b11;
            if (obj instanceof Map.Entry) {
                l lVar = l.this;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                e eVar = null;
                if (key != null) {
                    try {
                        b11 = lVar.b(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (b11 != null && Objects.equals(b11.f59994h, entry.getValue())) {
                        eVar = b11;
                    }
                    if (eVar == null) {
                        return true;
                    }
                }
                b11 = null;
                if (b11 != null) {
                    eVar = b11;
                }
                if (eVar == null) {
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean remove(Object obj) {
            e b11;
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                l lVar = l.this;
                Object key = entry.getKey();
                e eVar = null;
                if (key != null) {
                    try {
                        b11 = lVar.b(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (b11 != null && Objects.equals(b11.f59994h, entry.getValue())) {
                        eVar = b11;
                    }
                    if (eVar != null) {
                        lVar.h(eVar, true);
                        return true;
                    }
                }
                b11 = null;
                if (b11 != null) {
                    eVar = b11;
                }
                if (eVar != null) {
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return l.this.f59976d;
        }
    }

    /* loaded from: classes9.dex */
    final class c extends AbstractSet<K> {

        final class a extends l<K, V>.d<K> {
            @Override // com.google.gson.internal.l.d, java.util.Iterator
            public final K next() {
                return a().f59992f;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            l.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return l.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            l lVar = l.this;
            e<K, V> eVar = null;
            if (obj != null) {
                try {
                    eVar = lVar.b(obj, false);
                } catch (ClassCastException unused) {
                }
            }
            if (eVar != null) {
                lVar.h(eVar, true);
            }
            return eVar != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return l.this.f59976d;
        }
    }

    private abstract class d<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        e<K, V> f59983a;

        /* renamed from: b, reason: collision with root package name */
        e<K, V> f59984b = null;

        /* renamed from: c, reason: collision with root package name */
        int f59985c;

        d() {
            this.f59983a = l.this.f59978f.f59990d;
            this.f59985c = l.this.f59977e;
        }

        final e<K, V> a() {
            e<K, V> eVar = this.f59983a;
            l lVar = l.this;
            if (eVar == lVar.f59978f) {
                throw new NoSuchElementException();
            }
            if (lVar.f59977e != this.f59985c) {
                throw new ConcurrentModificationException();
            }
            this.f59983a = eVar.f59990d;
            this.f59984b = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f59983a != l.this.f59978f;
        }

        @Override // java.util.Iterator
        public Object next() {
            return a();
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f59984b;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            l lVar = l.this;
            lVar.h(eVar, true);
            this.f59984b = null;
            this.f59985c = lVar.f59977e;
        }
    }

    public l() {
        this(true);
    }

    private void e(e<K, V> eVar, boolean z11) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f59988b;
            e<K, V> eVar3 = eVar.f59989c;
            int i11 = eVar2 != null ? eVar2.f59995i : 0;
            int i12 = eVar3 != null ? eVar3.f59995i : 0;
            int i13 = i11 - i12;
            if (i13 == -2) {
                e<K, V> eVar4 = eVar3.f59988b;
                e<K, V> eVar5 = eVar3.f59989c;
                int i14 = (eVar4 != null ? eVar4.f59995i : 0) - (eVar5 != null ? eVar5.f59995i : 0);
                if (i14 == -1 || (i14 == 0 && !z11)) {
                    j(eVar);
                } else {
                    l(eVar3);
                    j(eVar);
                }
                if (z11) {
                    return;
                }
            } else if (i13 == 2) {
                e<K, V> eVar6 = eVar2.f59988b;
                e<K, V> eVar7 = eVar2.f59989c;
                int i15 = (eVar6 != null ? eVar6.f59995i : 0) - (eVar7 != null ? eVar7.f59995i : 0);
                if (i15 == 1 || (i15 == 0 && !z11)) {
                    l(eVar);
                } else {
                    j(eVar2);
                    l(eVar);
                }
                if (z11) {
                    return;
                }
            } else if (i13 == 0) {
                eVar.f59995i = i11 + 1;
                if (z11) {
                    return;
                }
            } else {
                eVar.f59995i = Math.max(i11, i12) + 1;
                if (!z11) {
                    return;
                }
            }
            eVar = eVar.f59987a;
        }
    }

    private void i(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f59987a;
        eVar.f59987a = null;
        if (eVar2 != null) {
            eVar2.f59987a = eVar3;
        }
        if (eVar3 == null) {
            this.f59975c = eVar2;
        } else if (eVar3.f59988b == eVar) {
            eVar3.f59988b = eVar2;
        } else {
            eVar3.f59989c = eVar2;
        }
    }

    private void j(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f59988b;
        e<K, V> eVar3 = eVar.f59989c;
        e<K, V> eVar4 = eVar3.f59988b;
        e<K, V> eVar5 = eVar3.f59989c;
        eVar.f59989c = eVar4;
        if (eVar4 != null) {
            eVar4.f59987a = eVar;
        }
        i(eVar, eVar3);
        eVar3.f59988b = eVar;
        eVar.f59987a = eVar3;
        int max = Math.max(eVar2 != null ? eVar2.f59995i : 0, eVar4 != null ? eVar4.f59995i : 0) + 1;
        eVar.f59995i = max;
        eVar3.f59995i = Math.max(max, eVar5 != null ? eVar5.f59995i : 0) + 1;
    }

    private void l(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f59988b;
        e<K, V> eVar3 = eVar.f59989c;
        e<K, V> eVar4 = eVar2.f59988b;
        e<K, V> eVar5 = eVar2.f59989c;
        eVar.f59988b = eVar5;
        if (eVar5 != null) {
            eVar5.f59987a = eVar;
        }
        i(eVar, eVar2);
        eVar2.f59989c = eVar;
        eVar.f59987a = eVar2;
        int max = Math.max(eVar3 != null ? eVar3.f59995i : 0, eVar5 != null ? eVar5.f59995i : 0) + 1;
        eVar.f59995i = max;
        eVar2.f59995i = Math.max(max, eVar4 != null ? eVar4.f59995i : 0) + 1;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    final e<K, V> b(K k11, boolean z11) {
        int i11;
        e<K, V> eVar;
        e<K, V> eVar2 = this.f59975c;
        Comparator<Comparable> comparator = f59972i;
        Comparator<? super K> comparator2 = this.f59973a;
        if (eVar2 != null) {
            Comparable comparable = comparator2 == comparator ? (Comparable) k11 : null;
            while (true) {
                K k12 = eVar2.f59992f;
                i11 = comparable != null ? comparable.compareTo(k12) : comparator2.compare(k11, k12);
                if (i11 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i11 < 0 ? eVar2.f59988b : eVar2.f59989c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i11 = 0;
        }
        e<K, V> eVar4 = eVar2;
        if (!z11) {
            return null;
        }
        e<K, V> eVar5 = this.f59978f;
        if (eVar4 != null) {
            eVar = new e<>(this.f59974b, eVar4, k11, eVar5, eVar5.f59991e);
            if (i11 < 0) {
                eVar4.f59988b = eVar;
            } else {
                eVar4.f59989c = eVar;
            }
            e(eVar4, true);
        } else {
            if (comparator2 == comparator && !(k11 instanceof Comparable)) {
                throw new ClassCastException(k11.getClass().getName().concat(" is not Comparable"));
            }
            eVar = new e<>(this.f59974b, eVar4, k11, eVar5, eVar5.f59991e);
            this.f59975c = eVar;
        }
        this.f59976d++;
        this.f59977e++;
        return eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f59975c = null;
        this.f59976d = 0;
        this.f59977e++;
        e<K, V> eVar = this.f59978f;
        eVar.f59991e = eVar;
        eVar.f59990d = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        e<K, V> eVar = null;
        if (obj != 0) {
            try {
                eVar = b(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return eVar != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        l<K, V>.b bVar = this.f59979g;
        if (bVar != null) {
            return bVar;
        }
        l<K, V>.b bVar2 = new b();
        this.f59979g = bVar2;
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
        e<K, V> eVar;
        if (obj != 0) {
            try {
                eVar = b(obj, false);
            } catch (ClassCastException unused) {
            }
            if (eVar == null) {
                return eVar.f59994h;
            }
            return null;
        }
        eVar = null;
        if (eVar == null) {
        }
    }

    final void h(e<K, V> eVar, boolean z11) {
        e<K, V> eVar2;
        e<K, V> eVar3;
        int i11;
        if (z11) {
            e<K, V> eVar4 = eVar.f59991e;
            eVar4.f59990d = eVar.f59990d;
            eVar.f59990d.f59991e = eVar4;
        }
        e<K, V> eVar5 = eVar.f59988b;
        e<K, V> eVar6 = eVar.f59989c;
        e<K, V> eVar7 = eVar.f59987a;
        int i12 = 0;
        if (eVar5 == null || eVar6 == null) {
            if (eVar5 != null) {
                i(eVar, eVar5);
                eVar.f59988b = null;
            } else if (eVar6 != null) {
                i(eVar, eVar6);
                eVar.f59989c = null;
            } else {
                i(eVar, null);
            }
            e(eVar7, false);
            this.f59976d--;
            this.f59977e++;
            return;
        }
        if (eVar5.f59995i > eVar6.f59995i) {
            e<K, V> eVar8 = eVar5.f59989c;
            while (true) {
                e<K, V> eVar9 = eVar8;
                eVar3 = eVar5;
                eVar5 = eVar9;
                if (eVar5 == null) {
                    break;
                } else {
                    eVar8 = eVar5.f59989c;
                }
            }
        } else {
            e<K, V> eVar10 = eVar6.f59988b;
            while (true) {
                eVar2 = eVar6;
                eVar6 = eVar10;
                if (eVar6 == null) {
                    break;
                } else {
                    eVar10 = eVar6.f59988b;
                }
            }
            eVar3 = eVar2;
        }
        h(eVar3, false);
        e<K, V> eVar11 = eVar.f59988b;
        if (eVar11 != null) {
            i11 = eVar11.f59995i;
            eVar3.f59988b = eVar11;
            eVar11.f59987a = eVar3;
            eVar.f59988b = null;
        } else {
            i11 = 0;
        }
        e<K, V> eVar12 = eVar.f59989c;
        if (eVar12 != null) {
            i12 = eVar12.f59995i;
            eVar3.f59989c = eVar12;
            eVar12.f59987a = eVar3;
            eVar.f59989c = null;
        }
        eVar3.f59995i = Math.max(i11, i12) + 1;
        i(eVar, eVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        l<K, V>.c cVar = this.f59980h;
        if (cVar != null) {
            return cVar;
        }
        l<K, V>.c cVar2 = new c();
        this.f59980h = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k11, V v11) {
        if (k11 == null) {
            throw new NullPointerException("key == null");
        }
        if (v11 == null && !this.f59974b) {
            throw new NullPointerException("value == null");
        }
        e<K, V> b11 = b(k11, true);
        V v12 = b11.f59994h;
        b11.f59994h = v11;
        return v12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V remove(Object obj) {
        e<K, V> eVar;
        if (obj != 0) {
            try {
                eVar = b(obj, false);
            } catch (ClassCastException unused) {
            }
            if (eVar != null) {
                h(eVar, true);
            }
            if (eVar == null) {
                return eVar.f59994h;
            }
            return null;
        }
        eVar = null;
        if (eVar != null) {
        }
        if (eVar == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f59976d;
    }

    public l(boolean z11) {
        Comparator<Comparable> comparator = f59972i;
        this.f59976d = 0;
        this.f59977e = 0;
        this.f59973a = comparator;
        this.f59974b = z11;
        this.f59978f = new e<>(z11);
    }

    static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        e<K, V> f59987a;

        /* renamed from: b, reason: collision with root package name */
        e<K, V> f59988b;

        /* renamed from: c, reason: collision with root package name */
        e<K, V> f59989c;

        /* renamed from: d, reason: collision with root package name */
        e<K, V> f59990d;

        /* renamed from: e, reason: collision with root package name */
        e<K, V> f59991e;

        /* renamed from: f, reason: collision with root package name */
        final K f59992f;

        /* renamed from: g, reason: collision with root package name */
        final boolean f59993g;

        /* renamed from: h, reason: collision with root package name */
        V f59994h;

        /* renamed from: i, reason: collision with root package name */
        int f59995i;

        e(boolean z11) {
            this.f59992f = null;
            this.f59993g = z11;
            this.f59991e = this;
            this.f59990d = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k11 = this.f59992f;
                if (k11 != null ? k11.equals(entry.getKey()) : entry.getKey() == null) {
                    V v11 = this.f59994h;
                    if (v11 == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (v11.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f59992f;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f59994h;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k11 = this.f59992f;
            int hashCode = k11 == null ? 0 : k11.hashCode();
            V v11 = this.f59994h;
            return (v11 != null ? v11.hashCode() : 0) ^ hashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v11) {
            if (v11 == null && !this.f59993g) {
                throw new NullPointerException("value == null");
            }
            V v12 = this.f59994h;
            this.f59994h = v11;
            return v12;
        }

        public final String toString() {
            return this.f59992f + "=" + this.f59994h;
        }

        e(boolean z11, e<K, V> eVar, K k11, e<K, V> eVar2, e<K, V> eVar3) {
            this.f59987a = eVar;
            this.f59992f = k11;
            this.f59993g = z11;
            this.f59995i = 1;
            this.f59990d = eVar2;
            this.f59991e = eVar3;
            eVar3.f59990d = this;
            eVar2.f59991e = this;
        }
    }
}
