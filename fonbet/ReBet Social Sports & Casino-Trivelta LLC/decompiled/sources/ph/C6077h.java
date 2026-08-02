package ph;

import java.lang.reflect.Array;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: ph.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6077h extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    public final List f63216a;

    /* renamed from: b, reason: collision with root package name */
    public final int f63217b;

    /* renamed from: ph.h$a */
    public final class a extends c {
        public a() {
            super();
        }

        @Override // ph.C6077h.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry b(int i10) {
            return new AbstractMap.SimpleImmutableEntry(C6077h.this.d(i10), C6077h.this.e(i10 + 1));
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            int c10;
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getKey() == null || (c10 = C6077h.this.c(entry.getKey())) == -1) {
                    return false;
                }
                return C6077h.this.e(c10 + 1).equals(entry.getValue());
            }
            return false;
        }
    }

    /* renamed from: ph.h$b */
    public final class b extends c {
        public b() {
            super();
        }

        @Override // ph.C6077h.c
        public Object b(int i10) {
            return C6077h.this.d(i10);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return C6077h.this.containsKey(obj);
        }
    }

    /* renamed from: ph.h$c */
    public abstract class c implements Set {

        /* renamed from: ph.h$c$a */
        public final class a implements Iterator {

            /* renamed from: a, reason: collision with root package name */
            public int f63221a = 0;

            public a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f63221a < C6077h.this.f63216a.size();
            }

            @Override // java.util.Iterator
            public Object next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object b10 = c.this.b(this.f63221a);
                this.f63221a += 2;
                return b10;
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public c() {
        }

        public Object[] a(Object[] objArr) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < C6077h.this.f63216a.size()) {
                objArr[i11] = b(i10);
                i10 += 2;
                i11++;
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public abstract Object b(int i10);

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            if (collection == null) {
                return false;
            }
            if (collection.isEmpty()) {
                return true;
            }
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return C6077h.this.f63217b;
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return a(new Object[C6077h.this.f63217b]);
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            if (objArr.length < C6077h.this.f63217b) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size());
            }
            return a(objArr);
        }
    }

    /* renamed from: ph.h$d */
    public final class d extends c {
        public d() {
            super();
        }

        @Override // ph.C6077h.c
        public Object b(int i10) {
            return C6077h.this.e(i10 + 1);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return C6077h.this.containsValue(obj);
        }
    }

    public C6077h(List list) {
        this.f63216a = list;
        this.f63217b = list.size() / 2;
    }

    public static Map f(List list) {
        return list.isEmpty() ? Collections.EMPTY_MAP : new C6077h(list);
    }

    public int c(Object obj) {
        for (int i10 = 0; i10 < this.f63216a.size(); i10 += 2) {
            if (obj.equals(d(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return (obj == null || c(obj) == -1) ? false : true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        for (int i10 = 0; i10 < this.f63216a.size(); i10 += 2) {
            if (e(i10 + 1).equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public Object d(int i10) {
        return this.f63216a.get(i10);
    }

    public Object e(int i10) {
        return this.f63216a.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return new a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        int c10;
        if (obj == null || (c10 = c(obj)) == -1) {
            return null;
        }
        return e(c10 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return new b();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f63217b;
    }

    @Override // java.util.AbstractMap
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ReadOnlyArrayMap{");
        for (int i10 = 0; i10 < this.f63216a.size(); i10 += 2) {
            sb2.append(d(i10));
            sb2.append('=');
            sb2.append(e(i10 + 1));
            sb2.append(',');
        }
        sb2.setLength(sb2.length() - 1);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        return new d();
    }
}
