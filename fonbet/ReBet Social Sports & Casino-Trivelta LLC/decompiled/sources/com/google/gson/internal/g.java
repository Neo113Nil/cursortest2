package com.google.gson.internal;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
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

/* loaded from: classes3.dex */
public final class g extends AbstractMap implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final Comparator f38279i = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Comparator f38280a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f38281b;

    /* renamed from: c, reason: collision with root package name */
    public e f38282c;

    /* renamed from: d, reason: collision with root package name */
    public int f38283d;

    /* renamed from: e, reason: collision with root package name */
    public int f38284e;

    /* renamed from: f, reason: collision with root package name */
    public final e f38285f;

    /* renamed from: g, reason: collision with root package name */
    public b f38286g;

    /* renamed from: h, reason: collision with root package name */
    public c f38287h;

    public class a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public class b extends AbstractSet {

        public class a extends d {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                return a();
            }
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && g.this.c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e c10;
            if (!(obj instanceof Map.Entry) || (c10 = g.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            g.this.f(c10, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return g.this.f38283d;
        }
    }

    public final class c extends AbstractSet {

        public class a extends d {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return a().f38301f;
            }
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return g.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return g.this.g(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return g.this.f38283d;
        }
    }

    public abstract class d implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public e f38292a;

        /* renamed from: b, reason: collision with root package name */
        public e f38293b = null;

        /* renamed from: c, reason: collision with root package name */
        public int f38294c;

        public d() {
            this.f38292a = g.this.f38285f.f38299d;
            this.f38294c = g.this.f38284e;
        }

        public final e a() {
            e eVar = this.f38292a;
            g gVar = g.this;
            if (eVar == gVar.f38285f) {
                throw new NoSuchElementException();
            }
            if (gVar.f38284e != this.f38294c) {
                throw new ConcurrentModificationException();
            }
            this.f38292a = eVar.f38299d;
            this.f38293b = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f38292a != g.this.f38285f;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e eVar = this.f38293b;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            g.this.f(eVar, true);
            this.f38293b = null;
            this.f38294c = g.this.f38284e;
        }
    }

    public g() {
        this(f38279i, true);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    public final boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public e b(Object obj, boolean z10) {
        int i10;
        e eVar;
        Comparator comparator = this.f38280a;
        e eVar2 = this.f38282c;
        if (eVar2 != null) {
            Comparable comparable = comparator == f38279i ? (Comparable) obj : null;
            while (true) {
                i10 = comparable != null ? comparable.compareTo(eVar2.f38301f) : comparator.compare(obj, eVar2.f38301f);
                if (i10 == 0) {
                    return eVar2;
                }
                e eVar3 = i10 < 0 ? eVar2.f38297b : eVar2.f38298c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i10 = 0;
        }
        e eVar4 = eVar2;
        if (!z10) {
            return null;
        }
        e eVar5 = this.f38285f;
        if (eVar4 != null) {
            eVar = new e(this.f38281b, eVar4, obj, eVar5, eVar5.f38300e);
            if (i10 < 0) {
                eVar4.f38297b = eVar;
            } else {
                eVar4.f38298c = eVar;
            }
            e(eVar4, true);
        } else {
            if (comparator == f38279i && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName() + " is not Comparable");
            }
            eVar = new e(this.f38281b, eVar4, obj, eVar5, eVar5.f38300e);
            this.f38282c = eVar;
        }
        this.f38283d++;
        this.f38284e++;
        return eVar;
    }

    public e c(Map.Entry entry) {
        e d10 = d(entry.getKey());
        if (d10 == null || !a(d10.f38303h, entry.getValue())) {
            return null;
        }
        return d10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f38282c = null;
        this.f38283d = 0;
        this.f38284e++;
        e eVar = this.f38285f;
        eVar.f38300e = eVar;
        eVar.f38299d = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    public e d(Object obj) {
        if (obj != null) {
            try {
                return b(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    public final void e(e eVar, boolean z10) {
        while (eVar != null) {
            e eVar2 = eVar.f38297b;
            e eVar3 = eVar.f38298c;
            int i10 = eVar2 != null ? eVar2.f38304i : 0;
            int i11 = eVar3 != null ? eVar3.f38304i : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                e eVar4 = eVar3.f38297b;
                e eVar5 = eVar3.f38298c;
                int i13 = (eVar4 != null ? eVar4.f38304i : 0) - (eVar5 != null ? eVar5.f38304i : 0);
                if (i13 == -1 || (i13 == 0 && !z10)) {
                    i(eVar);
                } else {
                    j(eVar3);
                    i(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                e eVar6 = eVar2.f38297b;
                e eVar7 = eVar2.f38298c;
                int i14 = (eVar6 != null ? eVar6.f38304i : 0) - (eVar7 != null ? eVar7.f38304i : 0);
                if (i14 == 1 || (i14 == 0 && !z10)) {
                    j(eVar);
                } else {
                    i(eVar2);
                    j(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                eVar.f38304i = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.f38304i = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f38296a;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        b bVar = this.f38286g;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        this.f38286g = bVar2;
        return bVar2;
    }

    public void f(e eVar, boolean z10) {
        int i10;
        if (z10) {
            e eVar2 = eVar.f38300e;
            eVar2.f38299d = eVar.f38299d;
            eVar.f38299d.f38300e = eVar2;
        }
        e eVar3 = eVar.f38297b;
        e eVar4 = eVar.f38298c;
        e eVar5 = eVar.f38296a;
        int i11 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                h(eVar, eVar3);
                eVar.f38297b = null;
            } else if (eVar4 != null) {
                h(eVar, eVar4);
                eVar.f38298c = null;
            } else {
                h(eVar, null);
            }
            e(eVar5, false);
            this.f38283d--;
            this.f38284e++;
            return;
        }
        e b10 = eVar3.f38304i > eVar4.f38304i ? eVar3.b() : eVar4.a();
        f(b10, false);
        e eVar6 = eVar.f38297b;
        if (eVar6 != null) {
            i10 = eVar6.f38304i;
            b10.f38297b = eVar6;
            eVar6.f38296a = b10;
            eVar.f38297b = null;
        } else {
            i10 = 0;
        }
        e eVar7 = eVar.f38298c;
        if (eVar7 != null) {
            i11 = eVar7.f38304i;
            b10.f38298c = eVar7;
            eVar7.f38296a = b10;
            eVar.f38298c = null;
        }
        b10.f38304i = Math.max(i10, i11) + 1;
        h(eVar, b10);
    }

    public e g(Object obj) {
        e d10 = d(obj);
        if (d10 != null) {
            f(d10, true);
        }
        return d10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        e d10 = d(obj);
        if (d10 != null) {
            return d10.f38303h;
        }
        return null;
    }

    public final void h(e eVar, e eVar2) {
        e eVar3 = eVar.f38296a;
        eVar.f38296a = null;
        if (eVar2 != null) {
            eVar2.f38296a = eVar3;
        }
        if (eVar3 == null) {
            this.f38282c = eVar2;
        } else if (eVar3.f38297b == eVar) {
            eVar3.f38297b = eVar2;
        } else {
            eVar3.f38298c = eVar2;
        }
    }

    public final void i(e eVar) {
        e eVar2 = eVar.f38297b;
        e eVar3 = eVar.f38298c;
        e eVar4 = eVar3.f38297b;
        e eVar5 = eVar3.f38298c;
        eVar.f38298c = eVar4;
        if (eVar4 != null) {
            eVar4.f38296a = eVar;
        }
        h(eVar, eVar3);
        eVar3.f38297b = eVar;
        eVar.f38296a = eVar3;
        int max = Math.max(eVar2 != null ? eVar2.f38304i : 0, eVar4 != null ? eVar4.f38304i : 0) + 1;
        eVar.f38304i = max;
        eVar3.f38304i = Math.max(max, eVar5 != null ? eVar5.f38304i : 0) + 1;
    }

    public final void j(e eVar) {
        e eVar2 = eVar.f38297b;
        e eVar3 = eVar.f38298c;
        e eVar4 = eVar2.f38297b;
        e eVar5 = eVar2.f38298c;
        eVar.f38297b = eVar5;
        if (eVar5 != null) {
            eVar5.f38296a = eVar;
        }
        h(eVar, eVar2);
        eVar2.f38298c = eVar;
        eVar.f38296a = eVar2;
        int max = Math.max(eVar3 != null ? eVar3.f38304i : 0, eVar5 != null ? eVar5.f38304i : 0) + 1;
        eVar.f38304i = max;
        eVar2.f38304i = Math.max(max, eVar4 != null ? eVar4.f38304i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        c cVar = this.f38287h;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f38287h = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f38281b) {
            throw new NullPointerException("value == null");
        }
        e b10 = b(obj, true);
        Object obj3 = b10.f38303h;
        b10.f38303h = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        e g10 = g(obj);
        if (g10 != null) {
            return g10.f38303h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f38283d;
    }

    public g(boolean z10) {
        this(f38279i, z10);
    }

    public g(Comparator comparator, boolean z10) {
        this.f38283d = 0;
        this.f38284e = 0;
        this.f38280a = comparator == null ? f38279i : comparator;
        this.f38281b = z10;
        this.f38285f = new e(z10);
    }

    public static final class e implements Map.Entry {

        /* renamed from: a, reason: collision with root package name */
        public e f38296a;

        /* renamed from: b, reason: collision with root package name */
        public e f38297b;

        /* renamed from: c, reason: collision with root package name */
        public e f38298c;

        /* renamed from: d, reason: collision with root package name */
        public e f38299d;

        /* renamed from: e, reason: collision with root package name */
        public e f38300e;

        /* renamed from: f, reason: collision with root package name */
        public final Object f38301f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f38302g;

        /* renamed from: h, reason: collision with root package name */
        public Object f38303h;

        /* renamed from: i, reason: collision with root package name */
        public int f38304i;

        public e(boolean z10) {
            this.f38301f = null;
            this.f38302g = z10;
            this.f38300e = this;
            this.f38299d = this;
        }

        public e a() {
            e eVar = this;
            for (e eVar2 = this.f38297b; eVar2 != null; eVar2 = eVar2.f38297b) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e b() {
            e eVar = this;
            for (e eVar2 = this.f38298c; eVar2 != null; eVar2 = eVar2.f38298c) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = this.f38301f;
                if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                    Object obj3 = this.f38303h;
                    if (obj3 == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (obj3.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f38301f;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f38303h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.f38301f;
            int hashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.f38303h;
            return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj == null && !this.f38302g) {
                throw new NullPointerException("value == null");
            }
            Object obj2 = this.f38303h;
            this.f38303h = obj;
            return obj2;
        }

        public String toString() {
            return this.f38301f + "=" + this.f38303h;
        }

        public e(boolean z10, e eVar, Object obj, e eVar2, e eVar3) {
            this.f38296a = eVar;
            this.f38301f = obj;
            this.f38302g = z10;
            this.f38304i = 1;
            this.f38299d = eVar2;
            this.f38300e = eVar3;
            eVar3.f38299d = this;
            eVar2.f38300e = this;
        }
    }
}
