package hf;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends kotlin.collections.h implements RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f10596a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10597b;

    /* renamed from: c, reason: collision with root package name */
    public int f10598c;

    /* renamed from: d, reason: collision with root package name */
    public final c f10599d;

    /* renamed from: e, reason: collision with root package name */
    public final e f10600e;

    public c(Object[] backing, int i5, int i10, c cVar, e root) {
        int i11;
        Intrinsics.checkNotNullParameter(backing, "backing");
        Intrinsics.checkNotNullParameter(root, "root");
        this.f10596a = backing;
        this.f10597b = i5;
        this.f10598c = i10;
        this.f10599d = cVar;
        this.f10600e = root;
        i11 = ((AbstractList) root).modCount;
        ((AbstractList) this).modCount = i11;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        if (this.f10600e.f10605c) {
            return new n(0, this);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // kotlin.collections.h
    public final int a() {
        g();
        return this.f10598c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h();
        g();
        f(this.f10597b + this.f10598c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        h();
        g();
        int size = elements.size();
        e(this.f10597b + this.f10598c, elements, size);
        return size > 0;
    }

    @Override // kotlin.collections.h
    public final Object c(int i5) {
        h();
        g();
        kotlin.collections.c cVar = kotlin.collections.f.Companion;
        int i10 = this.f10598c;
        cVar.getClass();
        kotlin.collections.c.b(i5, i10);
        return i(this.f10597b + i5);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        g();
        j(this.f10597b, this.f10598c);
    }

    public final void e(int i5, Collection collection, int i10) {
        ((AbstractList) this).modCount++;
        e eVar = this.f10600e;
        c cVar = this.f10599d;
        if (cVar != null) {
            cVar.e(i5, collection, i10);
        } else {
            e eVar2 = e.f10602e;
            eVar.e(i5, collection, i10);
        }
        this.f10596a = eVar.f10603a;
        this.f10598c += i10;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        g();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f10596a;
            int i5 = this.f10598c;
            if (i5 == list.size()) {
                for (int i10 = 0; i10 < i5; i10++) {
                    if (Intrinsics.areEqual(objArr[this.f10597b + i10], list.get(i10))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i5, Object obj) {
        ((AbstractList) this).modCount++;
        e eVar = this.f10600e;
        c cVar = this.f10599d;
        if (cVar != null) {
            cVar.f(i5, obj);
        } else {
            e eVar2 = e.f10602e;
            eVar.f(i5, obj);
        }
        this.f10596a = eVar.f10603a;
        this.f10598c++;
    }

    public final void g() {
        int i5;
        i5 = ((AbstractList) this.f10600e).modCount;
        if (i5 != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        g();
        kotlin.collections.c cVar = kotlin.collections.f.Companion;
        int i10 = this.f10598c;
        cVar.getClass();
        kotlin.collections.c.b(i5, i10);
        return this.f10596a[this.f10597b + i5];
    }

    public final void h() {
        if (this.f10600e.f10605c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        g();
        Object[] objArr = this.f10596a;
        int i5 = this.f10598c;
        int i10 = 1;
        for (int i11 = 0; i11 < i5; i11++) {
            Object obj = objArr[this.f10597b + i11];
            i10 = (i10 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i10;
    }

    public final Object i(int i5) {
        Object i10;
        ((AbstractList) this).modCount++;
        c cVar = this.f10599d;
        if (cVar != null) {
            i10 = cVar.i(i5);
        } else {
            e eVar = e.f10602e;
            i10 = this.f10600e.i(i5);
        }
        this.f10598c--;
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        g();
        for (int i5 = 0; i5 < this.f10598c; i5++) {
            if (Intrinsics.areEqual(this.f10596a[this.f10597b + i5], obj)) {
                return i5;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        g();
        return this.f10598c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i5, int i10) {
        if (i10 > 0) {
            ((AbstractList) this).modCount++;
        }
        c cVar = this.f10599d;
        if (cVar != null) {
            cVar.j(i5, i10);
        } else {
            e eVar = e.f10602e;
            this.f10600e.j(i5, i10);
        }
        this.f10598c -= i10;
    }

    public final int l(int i5, int i10, Collection collection, boolean z5) {
        int l6;
        c cVar = this.f10599d;
        if (cVar != null) {
            l6 = cVar.l(i5, i10, collection, z5);
        } else {
            e eVar = e.f10602e;
            l6 = this.f10600e.l(i5, i10, collection, z5);
        }
        if (l6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f10598c -= l6;
        return l6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        g();
        for (int i5 = this.f10598c - 1; i5 >= 0; i5--) {
            if (Intrinsics.areEqual(this.f10596a[this.f10597b + i5], obj)) {
                return i5;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        h();
        g();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            c(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        h();
        g();
        return l(this.f10597b, this.f10598c, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        h();
        g();
        return l(this.f10597b, this.f10598c, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        h();
        g();
        kotlin.collections.c cVar = kotlin.collections.f.Companion;
        int i10 = this.f10598c;
        cVar.getClass();
        kotlin.collections.c.b(i5, i10);
        Object[] objArr = this.f10596a;
        int i11 = this.f10597b + i5;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i5, int i10) {
        kotlin.collections.c cVar = kotlin.collections.f.Companion;
        int i11 = this.f10598c;
        cVar.getClass();
        kotlin.collections.c.d(i5, i10, i11);
        return new c(this.f10596a, this.f10597b + i5, i10 - i5, this, this.f10600e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        g();
        int length = array.length;
        int i5 = this.f10598c;
        int i10 = this.f10597b;
        if (length < i5) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f10596a, i10, i5 + i10, array.getClass());
            Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        kotlin.collections.o.d(0, i10, i5 + i10, this.f10596a, array);
        int i11 = this.f10598c;
        Intrinsics.checkNotNullParameter(array, "array");
        if (i11 < array.length) {
            array[i11] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        g();
        return m4.g.b(this.f10596a, this.f10597b, this.f10598c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i5) {
        g();
        kotlin.collections.c cVar = kotlin.collections.f.Companion;
        int i10 = this.f10598c;
        cVar.getClass();
        kotlin.collections.c.c(i5, i10);
        return new b(this, i5);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        h();
        g();
        kotlin.collections.c cVar = kotlin.collections.f.Companion;
        int i10 = this.f10598c;
        cVar.getClass();
        kotlin.collections.c.c(i5, i10);
        f(this.f10597b + i5, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i5, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        h();
        g();
        kotlin.collections.c cVar = kotlin.collections.f.Companion;
        int i10 = this.f10598c;
        cVar.getClass();
        kotlin.collections.c.c(i5, i10);
        int size = elements.size();
        e(this.f10597b + i5, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        g();
        Object[] objArr = this.f10596a;
        int i5 = this.f10598c;
        int i10 = this.f10597b;
        return kotlin.collections.o.j(i10, i5 + i10, objArr);
    }
}
