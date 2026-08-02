package defpackage;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class vbb extends v6 implements RandomAccess, Serializable {
    public Object[] a;
    public final int b;
    public int c;
    public final vbb d;
    public final xbb e;

    public vbb(Object[] objArr, int i, int i2, vbb vbbVar, xbb xbbVar) {
        int i3;
        objArr.getClass();
        this.a = objArr;
        this.b = i;
        this.c = i2;
        this.d = vbbVar;
        this.e = xbbVar;
        i3 = ((AbstractList) xbbVar).modCount;
        ((AbstractList) this).modCount = i3;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        if (this.e.c) {
            return new y5h(0, this);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        n();
        m();
        q4 q4Var = u4.Companion;
        int i2 = this.c;
        q4Var.getClass();
        q4.c(i, i2);
        d(this.b + i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        n();
        m();
        q4 q4Var = u4.Companion;
        int i2 = this.c;
        q4Var.getClass();
        q4.c(i, i2);
        int size = collection.size();
        c(this.b + i, collection, size);
        return size > 0;
    }

    public final void c(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        xbb xbbVar = this.e;
        vbb vbbVar = this.d;
        if (vbbVar != null) {
            vbbVar.c(i, collection, i2);
        } else {
            xbb xbbVar2 = xbb.e;
            xbbVar.c(i, collection, i2);
        }
        this.a = xbbVar.a;
        this.c += i2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        n();
        m();
        p(this.b, this.c);
    }

    public final void d(int i, Object obj) {
        ((AbstractList) this).modCount++;
        xbb xbbVar = this.e;
        vbb vbbVar = this.d;
        if (vbbVar != null) {
            vbbVar.d(i, obj);
        } else {
            xbb xbbVar2 = xbb.e;
            xbbVar.d(i, obj);
        }
        this.a = xbbVar.a;
        this.c++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        m();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.a;
            int i = this.c;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (Intrinsics.c(objArr[this.b + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m();
        q4 q4Var = u4.Companion;
        int i2 = this.c;
        q4Var.getClass();
        q4.b(i, i2);
        return this.a[this.b + i];
    }

    @Override // defpackage.v6
    public final int getSize() {
        m();
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        m();
        Object[] objArr = this.a;
        int i = this.c;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[this.b + i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        m();
        for (int i = 0; i < this.c; i++) {
            if (Intrinsics.c(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        m();
        return this.c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        m();
        for (int i = this.c - 1; i >= 0; i--) {
            if (Intrinsics.c(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        m();
        q4 q4Var = u4.Companion;
        int i2 = this.c;
        q4Var.getClass();
        q4.c(i, i2);
        return new hc9(this, i);
    }

    public final void m() {
        int i;
        i = ((AbstractList) this.e).modCount;
        if (i == ((AbstractList) this).modCount) {
            return;
        }
        a70.o();
    }

    public final void n() {
        if (this.e.c) {
            a70.i();
        }
    }

    public final Object o(int i) {
        Object o;
        ((AbstractList) this).modCount++;
        vbb vbbVar = this.d;
        if (vbbVar != null) {
            o = vbbVar.o(i);
        } else {
            xbb xbbVar = xbb.e;
            o = this.e.o(i);
        }
        this.c--;
        return o;
    }

    public final void p(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        vbb vbbVar = this.d;
        if (vbbVar != null) {
            vbbVar.p(i, i2);
        } else {
            xbb xbbVar = xbb.e;
            this.e.p(i, i2);
        }
        this.c -= i2;
    }

    public final int q(int i, int i2, Collection collection, boolean z) {
        int q;
        vbb vbbVar = this.d;
        if (vbbVar != null) {
            q = vbbVar.q(i, i2, collection, z);
        } else {
            xbb xbbVar = xbb.e;
            q = this.e.q(i, i2, collection, z);
        }
        if (q > 0) {
            ((AbstractList) this).modCount++;
        }
        this.c -= q;
        return q;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        n();
        m();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            removeAt(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        n();
        m();
        return q(this.b, this.c, collection, false) > 0;
    }

    @Override // defpackage.v6
    public final Object removeAt(int i) {
        n();
        m();
        q4 q4Var = u4.Companion;
        int i2 = this.c;
        q4Var.getClass();
        q4.b(i, i2);
        return o(this.b + i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        n();
        m();
        return q(this.b, this.c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        n();
        m();
        q4 q4Var = u4.Companion;
        int i2 = this.c;
        q4Var.getClass();
        q4.b(i, i2);
        Object[] objArr = this.a;
        int i3 = this.b + i;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        q4 q4Var = u4.Companion;
        int i3 = this.c;
        q4Var.getClass();
        q4.d(i, i2, i3);
        return new vbb(this.a, this.b + i, i2 - i, this, this.e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        m();
        int length = objArr.length;
        int i = this.c;
        Object[] objArr2 = this.a;
        int i2 = this.b;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        mh0.d(0, i2, i + i2, objArr2, objArr);
        int i3 = this.c;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m();
        return mha.E(this.a, this.b, this.c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        n();
        m();
        d(this.b + this.c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        n();
        m();
        int size = collection.size();
        c(this.b + this.c, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        m();
        Object[] objArr = this.a;
        int i = this.c;
        int i2 = this.b;
        return mh0.l(i2, i + i2, objArr);
    }
}
