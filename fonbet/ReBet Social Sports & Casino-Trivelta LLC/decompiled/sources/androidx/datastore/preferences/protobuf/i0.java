package androidx.datastore.preferences.protobuf;

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

/* loaded from: classes.dex */
public abstract class i0 extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    public List f19511a;

    /* renamed from: b, reason: collision with root package name */
    public Map f19512b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19513c;

    /* renamed from: d, reason: collision with root package name */
    public volatile f f19514d;

    /* renamed from: e, reason: collision with root package name */
    public Map f19515e;

    /* renamed from: f, reason: collision with root package name */
    public volatile c f19516f;

    public class a extends i0 {
        public a() {
            super(null);
        }

        @Override // androidx.datastore.preferences.protobuf.i0
        public void p() {
            if (!o()) {
                if (k() > 0) {
                    android.support.v4.media.session.b.a(j(0).getKey());
                    throw null;
                }
                Iterator it = m().iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(((Map.Entry) it.next()).getKey());
                    throw null;
                }
            }
            super.p();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.r((Comparable) obj, obj2);
        }
    }

    public class c extends f {
        public c() {
            super(i0.this, null);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b(i0.this, null);
        }

        public /* synthetic */ c(i0 i0Var, a aVar) {
            this();
        }
    }

    public class d implements Map.Entry, Comparable {

        /* renamed from: a, reason: collision with root package name */
        public final Comparable f19521a;

        /* renamed from: b, reason: collision with root package name */
        public Object f19522b;

        public d(i0 i0Var, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return getKey().compareTo(dVar.getKey());
        }

        public final boolean b(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f19521a;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b(this.f19521a, entry.getKey()) && b(this.f19522b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f19522b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f19521a;
            int hashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f19522b;
            return hashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            i0.this.g();
            Object obj2 = this.f19522b;
            this.f19522b = obj;
            return obj2;
        }

        public String toString() {
            return this.f19521a + "=" + this.f19522b;
        }

        public d(Comparable comparable, Object obj) {
            this.f19521a = comparable;
            this.f19522b = obj;
        }
    }

    public class f extends AbstractSet {
        public f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            i0.this.r((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            i0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = i0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new e(i0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            i0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return i0.this.size();
        }

        public /* synthetic */ f(i0 i0Var, a aVar) {
            this();
        }
    }

    public /* synthetic */ i0(a aVar) {
        this();
    }

    public static i0 q() {
        return new a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f19511a.isEmpty()) {
            this.f19511a.clear();
        }
        if (this.f19512b.isEmpty()) {
            return;
        }
        this.f19512b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f19512b.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f19514d == null) {
            this.f19514d = new f(this, null);
        }
        return this.f19514d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return super.equals(obj);
        }
        i0 i0Var = (i0) obj;
        int size = size();
        if (size != i0Var.size()) {
            return false;
        }
        int k10 = k();
        if (k10 != i0Var.k()) {
            return entrySet().equals(i0Var.entrySet());
        }
        for (int i10 = 0; i10 < k10; i10++) {
            if (!j(i10).equals(i0Var.j(i10))) {
                return false;
            }
        }
        if (k10 != size) {
            return this.f19512b.equals(i0Var.f19512b);
        }
        return true;
    }

    public final int f(Comparable comparable) {
        int i10;
        int size = this.f19511a.size();
        int i11 = size - 1;
        if (i11 >= 0) {
            int compareTo = comparable.compareTo(((d) this.f19511a.get(i11)).getKey());
            if (compareTo > 0) {
                i10 = size + 1;
                return -i10;
            }
            if (compareTo == 0) {
                return i11;
            }
        }
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int compareTo2 = comparable.compareTo(((d) this.f19511a.get(i13)).getKey());
            if (compareTo2 < 0) {
                i11 = i13 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i13;
                }
                i12 = i13 + 1;
            }
        }
        i10 = i12 + 1;
        return -i10;
    }

    public final void g() {
        if (this.f19513c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f10 = f(comparable);
        return f10 >= 0 ? ((d) this.f19511a.get(f10)).getValue() : this.f19512b.get(comparable);
    }

    public Set h() {
        if (this.f19516f == null) {
            this.f19516f = new c(this, null);
        }
        return this.f19516f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int k10 = k();
        int i10 = 0;
        for (int i11 = 0; i11 < k10; i11++) {
            i10 += ((d) this.f19511a.get(i11)).hashCode();
        }
        return l() > 0 ? i10 + this.f19512b.hashCode() : i10;
    }

    public final void i() {
        g();
        if (!this.f19511a.isEmpty() || (this.f19511a instanceof ArrayList)) {
            return;
        }
        this.f19511a = new ArrayList(16);
    }

    public Map.Entry j(int i10) {
        return (Map.Entry) this.f19511a.get(i10);
    }

    public int k() {
        return this.f19511a.size();
    }

    public int l() {
        return this.f19512b.size();
    }

    public Iterable m() {
        return this.f19512b.isEmpty() ? Collections.EMPTY_SET : this.f19512b.entrySet();
    }

    public final SortedMap n() {
        g();
        if (this.f19512b.isEmpty() && !(this.f19512b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f19512b = treeMap;
            this.f19515e = treeMap.descendingMap();
        }
        return (SortedMap) this.f19512b;
    }

    public boolean o() {
        return this.f19513c;
    }

    public void p() {
        if (this.f19513c) {
            return;
        }
        this.f19512b = this.f19512b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f19512b);
        this.f19515e = this.f19515e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f19515e);
        this.f19513c = true;
    }

    public Object r(Comparable comparable, Object obj) {
        g();
        int f10 = f(comparable);
        if (f10 >= 0) {
            return ((d) this.f19511a.get(f10)).setValue(obj);
        }
        i();
        int i10 = -(f10 + 1);
        if (i10 >= 16) {
            return n().put(comparable, obj);
        }
        if (this.f19511a.size() == 16) {
            d dVar = (d) this.f19511a.remove(15);
            n().put(dVar.getKey(), dVar.getValue());
        }
        this.f19511a.add(i10, new d(comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int f10 = f(comparable);
        if (f10 >= 0) {
            return s(f10);
        }
        if (this.f19512b.isEmpty()) {
            return null;
        }
        return this.f19512b.remove(comparable);
    }

    public final Object s(int i10) {
        g();
        Object value = ((d) this.f19511a.remove(i10)).getValue();
        if (!this.f19512b.isEmpty()) {
            Iterator it = n().entrySet().iterator();
            this.f19511a.add(new d(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f19511a.size() + this.f19512b.size();
    }

    public class b implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public int f19517a;

        /* renamed from: b, reason: collision with root package name */
        public Iterator f19518b;

        public b() {
            this.f19517a = i0.this.f19511a.size();
        }

        public final Iterator a() {
            if (this.f19518b == null) {
                this.f19518b = i0.this.f19515e.entrySet().iterator();
            }
            return this.f19518b;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (a().hasNext()) {
                return (Map.Entry) a().next();
            }
            List list = i0.this.f19511a;
            int i10 = this.f19517a - 1;
            this.f19517a = i10;
            return (Map.Entry) list.get(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f19517a;
            return (i10 > 0 && i10 <= i0.this.f19511a.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ b(i0 i0Var, a aVar) {
            this();
        }
    }

    public class e implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public int f19524a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f19525b;

        /* renamed from: c, reason: collision with root package name */
        public Iterator f19526c;

        public e() {
            this.f19524a = -1;
        }

        public final Iterator a() {
            if (this.f19526c == null) {
                this.f19526c = i0.this.f19512b.entrySet().iterator();
            }
            return this.f19526c;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f19525b = true;
            int i10 = this.f19524a + 1;
            this.f19524a = i10;
            return i10 < i0.this.f19511a.size() ? (Map.Entry) i0.this.f19511a.get(this.f19524a) : (Map.Entry) a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f19524a + 1 < i0.this.f19511a.size() || (!i0.this.f19512b.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f19525b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f19525b = false;
            i0.this.g();
            if (this.f19524a >= i0.this.f19511a.size()) {
                a().remove();
                return;
            }
            i0 i0Var = i0.this;
            int i10 = this.f19524a;
            this.f19524a = i10 - 1;
            i0Var.s(i10);
        }

        public /* synthetic */ e(i0 i0Var, a aVar) {
            this();
        }
    }

    public i0() {
        this.f19511a = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        this.f19512b = map;
        this.f19515e = map;
    }
}
