package hf;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends kotlin.collections.h implements List, RandomAccess, Serializable, KMutableList {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final d f10601d = new d(null);

    /* renamed from: e, reason: collision with root package name */
    public static final e f10602e;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f10603a;

    /* renamed from: b, reason: collision with root package name */
    public int f10604b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10605c;

    static {
        e eVar = new e(0);
        eVar.f10605c = true;
        f10602e = eVar;
    }

    public e() {
        this(0, 1, null);
    }

    private final Object writeReplace() {
        if (this.f10605c) {
            return new n(0, this);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // kotlin.collections.h
    public final int a() {
        return this.f10604b;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        int i5 = this.f10604b;
        ((AbstractList) this).modCount++;
        h(i5, 1);
        this.f10603a[i5] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        g();
        int size = elements.size();
        e(this.f10604b, elements, size);
        return size > 0;
    }

    @Override // kotlin.collections.h
    public final Object c(int i5) {
        g();
        kotlin.collections.c cVar = kotlin.collections.f.Companion;
        int i10 = this.f10604b;
        cVar.getClass();
        kotlin.collections.c.b(i5, i10);
        return i(i5);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        j(0, this.f10604b);
    }

    public final void e(int i5, Collection collection, int i10) {
        ((AbstractList) this).modCount++;
        h(i5, i10);
        Iterator it = collection.iterator();
        for (int i11 = 0; i11 < i10; i11++) {
            this.f10603a[i5 + i11] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f10603a;
            int i5 = this.f10604b;
            if (i5 == list.size()) {
                for (int i10 = 0; i10 < i5; i10++) {
                    if (Intrinsics.areEqual(objArr[i10], list.get(i10))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i5, Object obj) {
        ((AbstractList) this).modCount++;
        h(i5, 1);
        this.f10603a[i5] = obj;
    }

    public final void g() {
        if (this.f10605c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        kotlin.collections.c cVar = kotlin.collections.f.Companion;
        int i10 = this.f10604b;
        cVar.getClass();
        kotlin.collections.c.b(i5, i10);
        return this.f10603a[i5];
    }

    public final void h(int i5, int i10) {
        int i11 = this.f10604b + i10;
        if (i11 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f10603a;
        if (i11 > objArr.length) {
            kotlin.collections.c cVar = kotlin.collections.f.Companion;
            int length = objArr.length;
            cVar.getClass();
            int e7 = kotlin.collections.c.e(length, i11);
            Object[] objArr2 = this.f10603a;
            Intrinsics.checkNotNullParameter(objArr2, "<this>");
            Object[] copyOf = Arrays.copyOf(objArr2, e7);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f10603a = copyOf;
        }
        Object[] objArr3 = this.f10603a;
        kotlin.collections.o.d(i5 + i10, i5, this.f10604b, objArr3, objArr3);
        this.f10604b += i10;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f10603a;
        int i5 = this.f10604b;
        int i10 = 1;
        for (int i11 = 0; i11 < i5; i11++) {
            Object obj = objArr[i11];
            i10 = (i10 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i10;
    }

    public final Object i(int i5) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f10603a;
        Object obj = objArr[i5];
        kotlin.collections.o.d(i5, i5 + 1, this.f10604b, objArr, objArr);
        Object[] objArr2 = this.f10603a;
        int i10 = this.f10604b - 1;
        Intrinsics.checkNotNullParameter(objArr2, "<this>");
        objArr2[i10] = null;
        this.f10604b--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i5 = 0; i5 < this.f10604b; i5++) {
            if (Intrinsics.areEqual(this.f10603a[i5], obj)) {
                return i5;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f10604b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i5, int i10) {
        if (i10 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f10603a;
        kotlin.collections.o.d(i5, i5 + i10, this.f10604b, objArr, objArr);
        Object[] objArr2 = this.f10603a;
        int i11 = this.f10604b;
        m4.g.u(i11 - i10, i11, objArr2);
        this.f10604b -= i10;
    }

    public final int l(int i5, int i10, Collection collection, boolean z5) {
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            int i13 = i5 + i11;
            if (collection.contains(this.f10603a[i13]) == z5) {
                Object[] objArr = this.f10603a;
                i11++;
                objArr[i12 + i5] = objArr[i13];
                i12++;
            } else {
                i11++;
            }
        }
        int i14 = i10 - i12;
        Object[] objArr2 = this.f10603a;
        kotlin.collections.o.d(i5 + i12, i10 + i5, this.f10604b, objArr2, objArr2);
        Object[] objArr3 = this.f10603a;
        int i15 = this.f10604b;
        m4.g.u(i15 - i14, i15, objArr3);
        if (i14 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f10604b -= i14;
        return i14;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i5 = this.f10604b - 1; i5 >= 0; i5--) {
            if (Intrinsics.areEqual(this.f10603a[i5], obj)) {
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
        g();
        return l(0, this.f10604b, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        g();
        return l(0, this.f10604b, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        g();
        kotlin.collections.c cVar = kotlin.collections.f.Companion;
        int i10 = this.f10604b;
        cVar.getClass();
        kotlin.collections.c.b(i5, i10);
        Object[] objArr = this.f10603a;
        Object obj2 = objArr[i5];
        objArr[i5] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i5, int i10) {
        kotlin.collections.c cVar = kotlin.collections.f.Companion;
        int i11 = this.f10604b;
        cVar.getClass();
        kotlin.collections.c.d(i5, i10, i11);
        return new c(this.f10603a, i5, i10 - i5, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        int i5 = this.f10604b;
        if (length < i5) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f10603a, 0, i5, array.getClass());
            Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        kotlin.collections.o.d(0, 0, i5, this.f10603a, array);
        int i10 = this.f10604b;
        Intrinsics.checkNotNullParameter(array, "array");
        if (i10 < array.length) {
            array[i10] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return m4.g.b(this.f10603a, 0, this.f10604b, this);
    }

    public /* synthetic */ e(int i5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 10 : i5);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i5) {
        kotlin.collections.c cVar = kotlin.collections.f.Companion;
        int i10 = this.f10604b;
        cVar.getClass();
        kotlin.collections.c.c(i5, i10);
        return new b(this, i5);
    }

    public e(int i5) {
        if (i5 >= 0) {
            this.f10603a = new Object[i5];
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i5, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        g();
        kotlin.collections.c cVar = kotlin.collections.f.Companion;
        int i10 = this.f10604b;
        cVar.getClass();
        kotlin.collections.c.c(i5, i10);
        int size = elements.size();
        e(i5, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        g();
        kotlin.collections.c cVar = kotlin.collections.f.Companion;
        int i10 = this.f10604b;
        cVar.getClass();
        kotlin.collections.c.c(i5, i10);
        ((AbstractList) this).modCount++;
        h(i5, 1);
        this.f10603a[i5] = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return kotlin.collections.o.j(0, this.f10604b, this.f10603a);
    }
}
