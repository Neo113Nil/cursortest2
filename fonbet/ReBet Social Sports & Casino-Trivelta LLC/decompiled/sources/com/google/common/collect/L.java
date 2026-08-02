package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public abstract class L {

    public static class a extends AbstractList implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final List f36722a;

        /* renamed from: b, reason: collision with root package name */
        public final Ra.f f36723b;

        /* renamed from: com.google.common.collect.L$a$a, reason: collision with other inner class name */
        public class C0508a extends l0 {
            public C0508a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // com.google.common.collect.k0
            public Object a(Object obj) {
                return a.this.f36723b.apply(obj);
            }
        }

        public a(List list, Ra.f fVar) {
            this.f36722a = (List) Ra.n.k(list);
            this.f36723b = (Ra.f) Ra.n.k(fVar);
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i10) {
            return this.f36723b.apply(this.f36722a.get(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f36722a.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i10) {
            return new C0508a(this.f36722a.listIterator(i10));
        }

        @Override // java.util.AbstractList, java.util.List
        public Object remove(int i10) {
            return this.f36723b.apply(this.f36722a.remove(i10));
        }

        @Override // java.util.AbstractList
        public void removeRange(int i10, int i11) {
            this.f36722a.subList(i10, i11).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f36722a.size();
        }
    }

    public static class b extends AbstractSequentialList implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final List f36725a;

        /* renamed from: b, reason: collision with root package name */
        public final Ra.f f36726b;

        public class a extends l0 {
            public a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // com.google.common.collect.k0
            public Object a(Object obj) {
                return b.this.f36726b.apply(obj);
            }
        }

        public b(List list, Ra.f fVar) {
            this.f36725a = (List) Ra.n.k(list);
            this.f36726b = (Ra.f) Ra.n.k(fVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f36725a.isEmpty();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i10) {
            return new a(this.f36725a.listIterator(i10));
        }

        @Override // java.util.AbstractList
        public void removeRange(int i10, int i11) {
            this.f36725a.subList(i10, i11).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f36725a.size();
        }
    }

    public static List a(Iterable iterable) {
        return (List) iterable;
    }

    public static int b(int i10) {
        AbstractC3431k.b(i10, "arraySize");
        return com.google.common.primitives.f.n(i10 + 5 + (i10 / 10));
    }

    public static boolean c(List list, Object obj) {
        if (obj == Ra.n.k(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return J.f(list.iterator(), list2.iterator());
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!Ra.j.a(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static int d(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return e(list, obj);
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (Ra.j.a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    public static int e(List list, Object obj) {
        int size = list.size();
        int i10 = 0;
        if (obj == null) {
            while (i10 < size) {
                if (list.get(i10) == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        while (i10 < size) {
            if (obj.equals(list.get(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int f(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return g(list, obj);
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (Ra.j.a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public static int g(List list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    public static ArrayList h() {
        return new ArrayList();
    }

    public static ArrayList i(Iterator it) {
        ArrayList h10 = h();
        J.a(h10, it);
        return h10;
    }

    public static ArrayList j(Object... objArr) {
        Ra.n.k(objArr);
        ArrayList arrayList = new ArrayList(b(objArr.length));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static List k(List list, Ra.f fVar) {
        return list instanceof RandomAccess ? new a(list, fVar) : new b(list, fVar);
    }
}
