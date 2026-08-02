package o;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: o.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8620b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a, reason: collision with root package name */
    c<K, V> f77437a;

    /* renamed from: b, reason: collision with root package name */
    private c<K, V> f77438b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakHashMap<f<K, V>, Boolean> f77439c = new WeakHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private int f77440d = 0;

    /* renamed from: o.b$a */
    static class a<K, V> extends e<K, V> {
        @Override // o.C8620b.e
        final c<K, V> b(c<K, V> cVar) {
            return cVar.f77444d;
        }

        @Override // o.C8620b.e
        final c<K, V> c(c<K, V> cVar) {
            return cVar.f77443c;
        }
    }

    /* renamed from: o.b$b, reason: collision with other inner class name */
    private static class C1302b<K, V> extends e<K, V> {
        @Override // o.C8620b.e
        final c<K, V> b(c<K, V> cVar) {
            return cVar.f77443c;
        }

        @Override // o.C8620b.e
        final c<K, V> c(c<K, V> cVar) {
            return cVar.f77444d;
        }
    }

    /* renamed from: o.b$c */
    static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        final K f77441a;

        /* renamed from: b, reason: collision with root package name */
        @NonNull
        final V f77442b;

        /* renamed from: c, reason: collision with root package name */
        c<K, V> f77443c;

        /* renamed from: d, reason: collision with root package name */
        c<K, V> f77444d;

        c(@NonNull K k11, @NonNull V v11) {
            this.f77441a = k11;
            this.f77442b = v11;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f77441a.equals(cVar.f77441a) && this.f77442b.equals(cVar.f77442b);
        }

        @Override // java.util.Map.Entry
        @NonNull
        public final K getKey() {
            return this.f77441a;
        }

        @Override // java.util.Map.Entry
        @NonNull
        public final V getValue() {
            return this.f77442b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.f77441a.hashCode() ^ this.f77442b.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v11) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.f77441a + "=" + this.f77442b;
        }
    }

    /* renamed from: o.b$d */
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        private c<K, V> f77445a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f77446b = true;

        d() {
        }

        @Override // o.C8620b.f
        final void a(@NonNull c<K, V> cVar) {
            c<K, V> cVar2 = this.f77445a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f77444d;
                this.f77445a = cVar3;
                this.f77446b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f77446b) {
                return C8620b.this.f77437a != null;
            }
            c<K, V> cVar = this.f77445a;
            return (cVar == null || cVar.f77443c == null) ? false : true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.f77446b) {
                this.f77446b = false;
                this.f77445a = C8620b.this.f77437a;
            } else {
                c<K, V> cVar = this.f77445a;
                this.f77445a = cVar != null ? cVar.f77443c : null;
            }
            return this.f77445a;
        }
    }

    /* renamed from: o.b$e */
    private static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        c<K, V> f77448a;

        /* renamed from: b, reason: collision with root package name */
        c<K, V> f77449b;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f77448a = cVar2;
            this.f77449b = cVar;
        }

        @Override // o.C8620b.f
        public final void a(@NonNull c<K, V> cVar) {
            c<K, V> cVar2 = null;
            if (this.f77448a == cVar && cVar == this.f77449b) {
                this.f77449b = null;
                this.f77448a = null;
            }
            c<K, V> cVar3 = this.f77448a;
            if (cVar3 == cVar) {
                this.f77448a = b(cVar3);
            }
            c<K, V> cVar4 = this.f77449b;
            if (cVar4 == cVar) {
                c<K, V> cVar5 = this.f77448a;
                if (cVar4 != cVar5 && cVar5 != null) {
                    cVar2 = c(cVar4);
                }
                this.f77449b = cVar2;
            }
        }

        abstract c<K, V> b(c<K, V> cVar);

        abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f77449b != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar = this.f77449b;
            c<K, V> cVar2 = this.f77448a;
            this.f77449b = (cVar == cVar2 || cVar2 == null) ? null : c(cVar);
            return cVar;
        }
    }

    /* renamed from: o.b$f */
    public static abstract class f<K, V> {
        abstract void a(@NonNull c<K, V> cVar);
    }

    public final Map.Entry<K, V> a() {
        return this.f77437a;
    }

    protected c<K, V> b(K k11) {
        c<K, V> cVar = this.f77437a;
        while (cVar != null && !cVar.f77441a.equals(k11)) {
            cVar = cVar.f77443c;
        }
        return cVar;
    }

    @NonNull
    public final C8620b<K, V>.d c() {
        C8620b<K, V>.d dVar = new d();
        this.f77439c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    @NonNull
    public final Iterator<Map.Entry<K, V>> descendingIterator() {
        C1302b c1302b = new C1302b(this.f77438b, this.f77437a);
        this.f77439c.put(c1302b, Boolean.FALSE);
        return c1302b;
    }

    public final Map.Entry<K, V> e() {
        return this.f77438b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((o.C8620b.e) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8620b)) {
            return false;
        }
        C8620b c8620b = (C8620b) obj;
        if (this.f77440d != c8620b.f77440d) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = c8620b.iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                break;
            }
            e eVar2 = (e) it2;
            if (!eVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) eVar.next();
            Object next = eVar2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    final c<K, V> f(@NonNull K k11, @NonNull V v11) {
        c<K, V> cVar = new c<>(k11, v11);
        this.f77440d++;
        c<K, V> cVar2 = this.f77438b;
        if (cVar2 == null) {
            this.f77437a = cVar;
            this.f77438b = cVar;
            return cVar;
        }
        cVar2.f77443c = cVar;
        cVar.f77444d = cVar2;
        this.f77438b = cVar;
        return cVar;
    }

    public V g(@NonNull K k11, @NonNull V v11) {
        c<K, V> b11 = b(k11);
        if (b11 != null) {
            return b11.f77442b;
        }
        f(k11, v11);
        return null;
    }

    public V h(@NonNull K k11) {
        c<K, V> b11 = b(k11);
        if (b11 == null) {
            return null;
        }
        this.f77440d--;
        WeakHashMap<f<K, V>, Boolean> weakHashMap = this.f77439c;
        if (!weakHashMap.isEmpty()) {
            Iterator<f<K, V>> it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(b11);
            }
        }
        c<K, V> cVar = b11.f77444d;
        if (cVar != null) {
            cVar.f77443c = b11.f77443c;
        } else {
            this.f77437a = b11.f77443c;
        }
        c<K, V> cVar2 = b11.f77443c;
        if (cVar2 != null) {
            cVar2.f77444d = cVar;
        } else {
            this.f77438b = cVar;
        }
        b11.f77443c = null;
        b11.f77444d = null;
        return b11.f77442b;
    }

    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i11 = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return i11;
            }
            i11 += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    @NonNull
    public final Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f77437a, this.f77438b);
        this.f77439c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public final int size() {
        return this.f77440d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                sb2.append("]");
                return sb2.toString();
            }
            sb2.append(((Map.Entry) eVar.next()).toString());
            if (eVar.hasNext()) {
                sb2.append(", ");
            }
        }
    }
}
