package j$.util;

import j$.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* loaded from: classes2.dex */
public class h extends g implements java.util.List, List {
    private static final long serialVersionUID = -7754090372962971524L;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f17731c;

    public h(java.util.List list) {
        super(list);
        this.f17731c = list;
    }

    public h(java.util.List list, Object obj) {
        super(list, obj);
        this.f17731c = list;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f17727b) {
            equals = this.f17731c.equals(obj);
        }
        return equals;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int hashCode;
        synchronized (this.f17727b) {
            hashCode = this.f17731c.hashCode();
        }
        return hashCode;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        Object obj;
        synchronized (this.f17727b) {
            obj = this.f17731c.get(i5);
        }
        return obj;
    }

    @Override // java.util.List
    public final Object set(int i5, Object obj) {
        Object obj2;
        synchronized (this.f17727b) {
            obj2 = this.f17731c.set(i5, obj);
        }
        return obj2;
    }

    @Override // java.util.List
    public final void add(int i5, Object obj) {
        synchronized (this.f17727b) {
            this.f17731c.add(i5, obj);
        }
    }

    @Override // java.util.List
    public final Object remove(int i5) {
        Object remove;
        synchronized (this.f17727b) {
            remove = this.f17731c.remove(i5);
        }
        return remove;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int indexOf;
        synchronized (this.f17727b) {
            indexOf = this.f17731c.indexOf(obj);
        }
        return indexOf;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int lastIndexOf;
        synchronized (this.f17727b) {
            lastIndexOf = this.f17731c.lastIndexOf(obj);
        }
        return lastIndexOf;
    }

    @Override // java.util.List
    public final boolean addAll(int i5, java.util.Collection collection) {
        boolean addAll;
        synchronized (this.f17727b) {
            addAll = this.f17731c.addAll(i5, collection);
        }
        return addAll;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.f17731c.listIterator();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i5) {
        return this.f17731c.listIterator(i5);
    }

    @Override // java.util.List
    public java.util.List subList(int i5, int i10) {
        h hVar;
        synchronized (this.f17727b) {
            hVar = new h(this.f17731c.subList(i5, i10), this.f17727b);
        }
        return hVar;
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        synchronized (this.f17727b) {
            java.util.List list = this.f17731c;
            if (list instanceof List) {
                ((List) list).replaceAll(unaryOperator);
            } else {
                List.CC.$default$replaceAll(list, unaryOperator);
            }
        }
    }

    @Override // java.util.List, j$.util.List
    public final void sort(java.util.Comparator comparator) {
        synchronized (this.f17727b) {
            j$.com.android.tools.r8.a.X(this.f17731c, comparator);
        }
    }

    private Object readResolve() {
        java.util.List list = this.f17731c;
        return list instanceof RandomAccess ? new j(list) : this;
    }
}
