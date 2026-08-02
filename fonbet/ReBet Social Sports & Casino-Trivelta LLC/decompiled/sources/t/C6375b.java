package t;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: t.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6375b implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public c f64955a;

    /* renamed from: b, reason: collision with root package name */
    public c f64956b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f64957c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    public int f64958d = 0;

    /* renamed from: t.b$a */
    public static class a extends e {
        public a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // t.C6375b.e
        public c b(c cVar) {
            return cVar.f64962d;
        }

        @Override // t.C6375b.e
        public c c(c cVar) {
            return cVar.f64961c;
        }
    }

    /* renamed from: t.b$b, reason: collision with other inner class name */
    public static class C0905b extends e {
        public C0905b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // t.C6375b.e
        public c b(c cVar) {
            return cVar.f64961c;
        }

        @Override // t.C6375b.e
        public c c(c cVar) {
            return cVar.f64962d;
        }
    }

    /* renamed from: t.b$c */
    public static class c implements Map.Entry {

        /* renamed from: a, reason: collision with root package name */
        public final Object f64959a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f64960b;

        /* renamed from: c, reason: collision with root package name */
        public c f64961c;

        /* renamed from: d, reason: collision with root package name */
        public c f64962d;

        public c(Object obj, Object obj2) {
            this.f64959a = obj;
            this.f64960b = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f64959a.equals(cVar.f64959a) && this.f64960b.equals(cVar.f64960b);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f64959a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f64960b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f64959a.hashCode() ^ this.f64960b.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f64959a + "=" + this.f64960b;
        }
    }

    /* renamed from: t.b$d */
    public class d extends f implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public c f64963a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f64964b = true;

        public d() {
        }

        @Override // t.C6375b.f
        public void a(c cVar) {
            c cVar2 = this.f64963a;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f64962d;
                this.f64963a = cVar3;
                this.f64964b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (this.f64964b) {
                this.f64964b = false;
                this.f64963a = C6375b.this.f64955a;
            } else {
                c cVar = this.f64963a;
                this.f64963a = cVar != null ? cVar.f64961c : null;
            }
            return this.f64963a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f64964b) {
                return C6375b.this.f64955a != null;
            }
            c cVar = this.f64963a;
            return (cVar == null || cVar.f64961c == null) ? false : true;
        }
    }

    /* renamed from: t.b$e */
    public static abstract class e extends f implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public c f64966a;

        /* renamed from: b, reason: collision with root package name */
        public c f64967b;

        public e(c cVar, c cVar2) {
            this.f64966a = cVar2;
            this.f64967b = cVar;
        }

        @Override // t.C6375b.f
        public void a(c cVar) {
            if (this.f64966a == cVar && cVar == this.f64967b) {
                this.f64967b = null;
                this.f64966a = null;
            }
            c cVar2 = this.f64966a;
            if (cVar2 == cVar) {
                this.f64966a = b(cVar2);
            }
            if (this.f64967b == cVar) {
                this.f64967b = e();
            }
        }

        public abstract c b(c cVar);

        public abstract c c(c cVar);

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar = this.f64967b;
            this.f64967b = e();
            return cVar;
        }

        public final c e() {
            c cVar = this.f64967b;
            c cVar2 = this.f64966a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f64967b != null;
        }
    }

    /* renamed from: t.b$f */
    public static abstract class f {
        public abstract void a(c cVar);
    }

    public Map.Entry a() {
        return this.f64955a;
    }

    public c b(Object obj) {
        c cVar = this.f64955a;
        while (cVar != null && !cVar.f64959a.equals(obj)) {
            cVar = cVar.f64961c;
        }
        return cVar;
    }

    public d c() {
        d dVar = new d();
        this.f64957c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Iterator descendingIterator() {
        C0905b c0905b = new C0905b(this.f64956b, this.f64955a);
        this.f64957c.put(c0905b, Boolean.FALSE);
        return c0905b;
    }

    public Map.Entry e() {
        return this.f64956b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6375b)) {
            return false;
        }
        C6375b c6375b = (C6375b) obj;
        if (size() != c6375b.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c6375b.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public c f(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f64958d++;
        c cVar2 = this.f64956b;
        if (cVar2 == null) {
            this.f64955a = cVar;
            this.f64956b = cVar;
            return cVar;
        }
        cVar2.f64961c = cVar;
        cVar.f64962d = cVar2;
        this.f64956b = cVar;
        return cVar;
    }

    public Object g(Object obj, Object obj2) {
        c b10 = b(obj);
        if (b10 != null) {
            return b10.f64960b;
        }
        f(obj, obj2);
        return null;
    }

    public Object h(Object obj) {
        c b10 = b(obj);
        if (b10 == null) {
            return null;
        }
        this.f64958d--;
        if (!this.f64957c.isEmpty()) {
            Iterator it = this.f64957c.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(b10);
            }
        }
        c cVar = b10.f64962d;
        if (cVar != null) {
            cVar.f64961c = b10.f64961c;
        } else {
            this.f64955a = b10.f64961c;
        }
        c cVar2 = b10.f64961c;
        if (cVar2 != null) {
            cVar2.f64962d = cVar;
        } else {
            this.f64956b = cVar;
        }
        b10.f64961c = null;
        b10.f64962d = null;
        return b10.f64960b;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((Map.Entry) it.next()).hashCode();
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a aVar = new a(this.f64955a, this.f64956b);
        this.f64957c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public int size() {
        return this.f64958d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb2.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
