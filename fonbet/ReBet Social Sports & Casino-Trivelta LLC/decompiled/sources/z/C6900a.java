package z;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6900a extends r implements Map {

    /* renamed from: b, reason: collision with root package name */
    public C0976a f68434b;

    /* renamed from: c, reason: collision with root package name */
    public c f68435c;

    /* renamed from: d, reason: collision with root package name */
    public e f68436d;

    /* renamed from: z.a$a, reason: collision with other inner class name */
    public final class C0976a extends AbstractSet {
        public C0976a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C6900a.this.new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C6900a.this.size();
        }
    }

    /* renamed from: z.a$b */
    public final class b extends AbstractC6906g {
        public b() {
            super(C6900a.this.size());
        }

        @Override // z.AbstractC6906g
        public Object a(int i10) {
            return C6900a.this.f(i10);
        }

        @Override // z.AbstractC6906g
        public void b(int i10) {
            C6900a.this.h(i10);
        }
    }

    /* renamed from: z.a$d */
    public final class d implements Iterator, Map.Entry {

        /* renamed from: a, reason: collision with root package name */
        public int f68440a;

        /* renamed from: b, reason: collision with root package name */
        public int f68441b = -1;

        /* renamed from: c, reason: collision with root package name */
        public boolean f68442c;

        public d() {
            this.f68440a = C6900a.this.size() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f68441b++;
            this.f68442c = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f68442c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return A.a.c(entry.getKey(), C6900a.this.f(this.f68441b)) && A.a.c(entry.getValue(), C6900a.this.j(this.f68441b));
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            if (this.f68442c) {
                return C6900a.this.f(this.f68441b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            if (this.f68442c) {
                return C6900a.this.j(this.f68441b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f68441b < this.f68440a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f68442c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object f10 = C6900a.this.f(this.f68441b);
            Object j10 = C6900a.this.j(this.f68441b);
            return (f10 == null ? 0 : f10.hashCode()) ^ (j10 != null ? j10.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f68442c) {
                throw new IllegalStateException();
            }
            C6900a.this.h(this.f68441b);
            this.f68441b--;
            this.f68440a--;
            this.f68442c = false;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (this.f68442c) {
                return C6900a.this.i(this.f68441b, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: z.a$f */
    public final class f extends AbstractC6906g {
        public f() {
            super(C6900a.this.size());
        }

        @Override // z.AbstractC6906g
        public Object a(int i10) {
            return C6900a.this.j(i10);
        }

        @Override // z.AbstractC6906g
        public void b(int i10) {
            C6900a.this.h(i10);
        }
    }

    public C6900a() {
    }

    public static boolean l(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // z.r, java.util.Map
    public boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // z.r, java.util.Map
    public boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        C0976a c0976a = this.f68434b;
        if (c0976a != null) {
            return c0976a;
        }
        C0976a c0976a2 = new C0976a();
        this.f68434b = c0976a2;
        return c0976a2;
    }

    @Override // z.r, java.util.Map
    public Object get(Object obj) {
        return super.get(obj);
    }

    public boolean k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public Set keySet() {
        c cVar = this.f68435c;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f68435c = cVar2;
        return cVar2;
    }

    public boolean m(Collection collection) {
        int size = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return size != size();
    }

    public boolean n(Collection collection) {
        int size = size();
        for (int size2 = size() - 1; size2 >= 0; size2--) {
            if (!collection.contains(f(size2))) {
                h(size2);
            }
        }
        return size != size();
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        b(size() + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // z.r, java.util.Map
    public Object remove(Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.Map
    public Collection values() {
        e eVar = this.f68436d;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        this.f68436d = eVar2;
        return eVar2;
    }

    public C6900a(int i10) {
        super(i10);
    }

    /* renamed from: z.a$c */
    public final class c implements Set {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            C6900a.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return C6900a.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            return C6900a.this.k(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return C6900a.l(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i10 = 0;
            for (int size = C6900a.this.size() - 1; size >= 0; size--) {
                Object f10 = C6900a.this.f(size);
                i10 += f10 == null ? 0 : f10.hashCode();
            }
            return i10;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return C6900a.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C6900a.this.new b();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int d10 = C6900a.this.d(obj);
            if (d10 < 0) {
                return false;
            }
            C6900a.this.h(d10);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            return C6900a.this.m(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            return C6900a.this.n(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return C6900a.this.size();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            int size = C6900a.this.size();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C6900a.this.f(i10);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C6900a.this.f(i10);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    /* renamed from: z.a$e */
    public final class e implements Collection {
        public e() {
        }

        @Override // java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            C6900a.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return C6900a.this.a(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return C6900a.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C6900a.this.new f();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int a10 = C6900a.this.a(obj);
            if (a10 < 0) {
                return false;
            }
            C6900a.this.h(a10);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            int size = C6900a.this.size();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < size) {
                if (collection.contains(C6900a.this.j(i10))) {
                    C6900a.this.h(i10);
                    i10--;
                    size--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection collection) {
            int size = C6900a.this.size();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < size) {
                if (!collection.contains(C6900a.this.j(i10))) {
                    C6900a.this.h(i10);
                    i10--;
                    size--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public int size() {
            return C6900a.this.size();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            int size = C6900a.this.size();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C6900a.this.j(i10);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C6900a.this.j(i10);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    public C6900a(r rVar) {
        super(rVar);
    }
}
