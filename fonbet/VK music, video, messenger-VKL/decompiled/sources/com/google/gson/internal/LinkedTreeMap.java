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
import java.util.Set;

/* loaded from: classes.dex */
public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final a b = new a();
    private LinkedTreeMap<K, V>.b entrySet;
    private LinkedTreeMap<K, V>.c keySet;
    e<K, V> root;
    int size = 0;
    int modCount = 0;
    final e<K, V> header = new e<>();
    Comparator<? super K> comparator = b;

    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public final int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public class b extends AbstractSet<Map.Entry<K, V>> {

        public class a extends LinkedTreeMap<K, V>.d<Map.Entry<K, V>> {
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            LinkedTreeMap.this.clear();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002b A[RETURN] */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean contains(Object obj) {
            e a2;
            V v;
            Object value;
            if (obj instanceof Map.Entry) {
                LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                e eVar = null;
                if (key != null) {
                    try {
                        a2 = linkedTreeMap.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (a2 != null && ((v = a2.h) == (value = entry.getValue()) || (v != null && v.equals(value)))) {
                        eVar = a2;
                    }
                    if (eVar == null) {
                        return true;
                    }
                }
                a2 = null;
                if (a2 != null) {
                    eVar = a2;
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
        /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean remove(Object obj) {
            e a2;
            V v;
            Object value;
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
                e eVar = null;
                if (key != null) {
                    try {
                        a2 = linkedTreeMap.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (a2 != null && ((v = a2.h) == (value = entry.getValue()) || (v != null && v.equals(value)))) {
                        eVar = a2;
                    }
                    if (eVar != null) {
                        linkedTreeMap.c(eVar, true);
                        return true;
                    }
                }
                a2 = null;
                if (a2 != null) {
                    eVar = a2;
                }
                if (eVar != null) {
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return LinkedTreeMap.this.size;
        }
    }

    /* loaded from: classes13.dex */
    public final class c extends AbstractSet<K> {

        public class a extends LinkedTreeMap<K, V>.d<K> {
            @Override // com.google.gson.internal.LinkedTreeMap.d, java.util.Iterator
            public final K next() {
                return a().g;
            }
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            LinkedTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return LinkedTreeMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            e<K, V> eVar = null;
            if (obj != null) {
                try {
                    eVar = linkedTreeMap.a(obj, false);
                } catch (ClassCastException unused) {
                }
            }
            if (eVar != null) {
                linkedTreeMap.c(eVar, true);
            }
            return eVar != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return LinkedTreeMap.this.size;
        }
    }

    public abstract class d<T> implements Iterator<T> {
        public e<K, V> b;
        public e<K, V> c = null;
        public int d;

        public d() {
            this.b = LinkedTreeMap.this.header.e;
            this.d = LinkedTreeMap.this.modCount;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.b;
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            if (eVar == linkedTreeMap.header) {
                throw new NoSuchElementException();
            }
            if (linkedTreeMap.modCount != this.d) {
                throw new ConcurrentModificationException();
            }
            this.b = eVar.e;
            this.c = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b != LinkedTreeMap.this.header;
        }

        @Override // java.util.Iterator
        public Object next() {
            return a();
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.c;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            linkedTreeMap.c(eVar, true);
            this.c = null;
            this.d = linkedTreeMap.modCount;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public final e<K, V> a(K k, boolean z) {
        int i;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.comparator;
        e<K, V> eVar2 = this.root;
        a aVar = b;
        if (eVar2 != null) {
            Comparable comparable = comparator == aVar ? (Comparable) k : null;
            while (true) {
                K k2 = eVar2.g;
                i = comparable != null ? comparable.compareTo(k2) : comparator.compare(k, k2);
                if (i == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i < 0 ? eVar2.c : eVar2.d;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        e<K, V> eVar4 = this.header;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k, eVar4, eVar4.f);
            if (i < 0) {
                eVar2.c = eVar;
            } else {
                eVar2.d = eVar;
            }
            b(eVar2, true);
        } else {
            if (comparator == aVar && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName().concat(" is not Comparable"));
            }
            eVar = new e<>(eVar2, k, eVar4, eVar4.f);
            this.root = eVar;
        }
        this.size++;
        this.modCount++;
        return eVar;
    }

    public final void b(e<K, V> eVar, boolean z) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.c;
            e<K, V> eVar3 = eVar.d;
            int i = eVar2 != null ? eVar2.i : 0;
            int i2 = eVar3 != null ? eVar3.i : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                e<K, V> eVar4 = eVar3.c;
                e<K, V> eVar5 = eVar3.d;
                int i4 = (eVar4 != null ? eVar4.i : 0) - (eVar5 != null ? eVar5.i : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    e(eVar);
                } else {
                    f(eVar3);
                    e(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                e<K, V> eVar6 = eVar2.c;
                e<K, V> eVar7 = eVar2.d;
                int i5 = (eVar6 != null ? eVar6.i : 0) - (eVar7 != null ? eVar7.i : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    f(eVar);
                } else {
                    e(eVar2);
                    f(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                eVar.i = i + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.i = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.b;
        }
    }

    public final void c(e<K, V> eVar, boolean z) {
        e<K, V> eVar2;
        e<K, V> eVar3;
        int i;
        if (z) {
            e<K, V> eVar4 = eVar.f;
            eVar4.e = eVar.e;
            eVar.e.f = eVar4;
        }
        e<K, V> eVar5 = eVar.c;
        e<K, V> eVar6 = eVar.d;
        e<K, V> eVar7 = eVar.b;
        int i2 = 0;
        if (eVar5 == null || eVar6 == null) {
            if (eVar5 != null) {
                d(eVar, eVar5);
                eVar.c = null;
            } else if (eVar6 != null) {
                d(eVar, eVar6);
                eVar.d = null;
            } else {
                d(eVar, null);
            }
            b(eVar7, false);
            this.size--;
            this.modCount++;
            return;
        }
        if (eVar5.i > eVar6.i) {
            e<K, V> eVar8 = eVar5.d;
            while (true) {
                e<K, V> eVar9 = eVar8;
                eVar3 = eVar5;
                eVar5 = eVar9;
                if (eVar5 == null) {
                    break;
                } else {
                    eVar8 = eVar5.d;
                }
            }
        } else {
            e<K, V> eVar10 = eVar6.c;
            while (true) {
                eVar2 = eVar6;
                eVar6 = eVar10;
                if (eVar6 == null) {
                    break;
                } else {
                    eVar10 = eVar6.c;
                }
            }
            eVar3 = eVar2;
        }
        c(eVar3, false);
        e<K, V> eVar11 = eVar.c;
        if (eVar11 != null) {
            i = eVar11.i;
            eVar3.c = eVar11;
            eVar11.b = eVar3;
            eVar.c = null;
        } else {
            i = 0;
        }
        e<K, V> eVar12 = eVar.d;
        if (eVar12 != null) {
            i2 = eVar12.i;
            eVar3.d = eVar12;
            eVar12.b = eVar3;
            eVar.d = null;
        }
        eVar3.i = Math.max(i, i2) + 1;
        d(eVar, eVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.root = null;
        this.size = 0;
        this.modCount++;
        e<K, V> eVar = this.header;
        eVar.f = eVar;
        eVar.e = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        e<K, V> eVar = null;
        if (obj != 0) {
            try {
                eVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return eVar != null;
    }

    public final void d(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.b;
        eVar.b = null;
        if (eVar2 != null) {
            eVar2.b = eVar3;
        }
        if (eVar3 == null) {
            this.root = eVar2;
        } else if (eVar3.c == eVar) {
            eVar3.c = eVar2;
        } else {
            eVar3.d = eVar2;
        }
    }

    public final void e(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.c;
        e<K, V> eVar3 = eVar.d;
        e<K, V> eVar4 = eVar3.c;
        e<K, V> eVar5 = eVar3.d;
        eVar.d = eVar4;
        if (eVar4 != null) {
            eVar4.b = eVar;
        }
        d(eVar, eVar3);
        eVar3.c = eVar;
        eVar.b = eVar3;
        int max = Math.max(eVar2 != null ? eVar2.i : 0, eVar4 != null ? eVar4.i : 0) + 1;
        eVar.i = max;
        eVar3.i = Math.max(max, eVar5 != null ? eVar5.i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        LinkedTreeMap<K, V>.b bVar = this.entrySet;
        if (bVar != null) {
            return bVar;
        }
        LinkedTreeMap<K, V>.b bVar2 = new b();
        this.entrySet = bVar2;
        return bVar2;
    }

    public final void f(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.c;
        e<K, V> eVar3 = eVar.d;
        e<K, V> eVar4 = eVar2.c;
        e<K, V> eVar5 = eVar2.d;
        eVar.c = eVar5;
        if (eVar5 != null) {
            eVar5.b = eVar;
        }
        d(eVar, eVar2);
        eVar2.d = eVar;
        eVar.b = eVar2;
        int max = Math.max(eVar3 != null ? eVar3.i : 0, eVar5 != null ? eVar5.i : 0) + 1;
        eVar.i = max;
        eVar2.i = Math.max(max, eVar4 != null ? eVar4.i : 0) + 1;
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
                eVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (eVar == null) {
                return eVar.h;
            }
            return null;
        }
        eVar = null;
        if (eVar == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        LinkedTreeMap<K, V>.c cVar = this.keySet;
        if (cVar != null) {
            return cVar;
        }
        LinkedTreeMap<K, V>.c cVar2 = new c();
        this.keySet = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        e<K, V> a2 = a(k, true);
        V v2 = a2.h;
        a2.h = v;
        return v2;
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
                eVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (eVar != null) {
                c(eVar, true);
            }
            if (eVar == null) {
                return eVar.h;
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
        return this.size;
    }

    public static final class e<K, V> implements Map.Entry<K, V> {
        public e<K, V> b;
        public e<K, V> c;
        public e<K, V> d;
        public e<K, V> e;
        public e<K, V> f;
        public final K g;
        public V h;
        public int i;

        public e() {
            this.g = null;
            this.f = this;
            this.e = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k = this.g;
                if (k != null ? k.equals(entry.getKey()) : entry.getKey() == null) {
                    V v = this.h;
                    if (v == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (v.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.g;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.h;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.g;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.h;
            return (v != null ? v.hashCode() : 0) ^ hashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            V v2 = this.h;
            this.h = v;
            return v2;
        }

        public final String toString() {
            return this.g + "=" + this.h;
        }

        public e(e<K, V> eVar, K k, e<K, V> eVar2, e<K, V> eVar3) {
            this.b = eVar;
            this.g = k;
            this.i = 1;
            this.e = eVar2;
            this.f = eVar3;
            eVar3.e = this;
            eVar2.f = this;
        }
    }
}
