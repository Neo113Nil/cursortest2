package kotlin.collections;

import androidx.appcompat.widget.c1;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l extends h {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final k f19209d = new k(null);

    /* renamed from: e, reason: collision with root package name */
    public static final Object[] f19210e = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    public int f19211a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f19212b;

    /* renamed from: c, reason: collision with root package name */
    public int f19213c;

    public l() {
        this.f19212b = f19210e;
    }

    @Override // kotlin.collections.h
    public final int a() {
        return this.f19213c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        m();
        e(elements.size() + a());
        d(l(a() + this.f19211a), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        m();
        e(this.f19213c + 1);
        int i5 = this.f19211a;
        if (i5 == 0) {
            Object[] objArr = this.f19212b;
            Intrinsics.checkNotNullParameter(objArr, "<this>");
            i5 = objArr.length;
        }
        int i10 = i5 - 1;
        this.f19211a = i10;
        this.f19212b[i10] = obj;
        this.f19213c++;
    }

    public final void addLast(Object obj) {
        m();
        e(a() + 1);
        this.f19212b[l(a() + this.f19211a)] = obj;
        this.f19213c = a() + 1;
    }

    @Override // kotlin.collections.h
    public final Object c(int i5) {
        c cVar = f.Companion;
        int i10 = this.f19213c;
        cVar.getClass();
        c.b(i5, i10);
        if (i5 == u.e(this)) {
            return removeLast();
        }
        if (i5 == 0) {
            return removeFirst();
        }
        m();
        int l6 = l(this.f19211a + i5);
        Object[] objArr = this.f19212b;
        Object obj = objArr[l6];
        if (i5 < (this.f19213c >> 1)) {
            int i11 = this.f19211a;
            if (l6 >= i11) {
                o.d(i11 + 1, i11, l6, objArr, objArr);
            } else {
                o.d(1, 0, l6, objArr, objArr);
                Object[] objArr2 = this.f19212b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i12 = this.f19211a;
                o.d(i12 + 1, i12, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f19212b;
            int i13 = this.f19211a;
            objArr3[i13] = null;
            this.f19211a = g(i13);
        } else {
            int l10 = l(u.e(this) + this.f19211a);
            if (l6 <= l10) {
                Object[] objArr4 = this.f19212b;
                o.d(l6, l6 + 1, l10 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f19212b;
                o.d(l6, l6 + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f19212b;
                objArr6[objArr6.length - 1] = objArr6[0];
                o.d(0, 1, l10 + 1, objArr6, objArr6);
            }
            this.f19212b[l10] = null;
        }
        this.f19213c--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m();
            j(this.f19211a, l(a() + this.f19211a));
        }
        this.f19211a = 0;
        this.f19213c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i5, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f19212b.length;
        while (i5 < length && it.hasNext()) {
            this.f19212b[i5] = it.next();
            i5++;
        }
        int i10 = this.f19211a;
        for (int i11 = 0; i11 < i10 && it.hasNext(); i11++) {
            this.f19212b[i11] = it.next();
        }
        this.f19213c = collection.size() + this.f19213c;
    }

    public final void e(int i5) {
        if (i5 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f19212b;
        if (i5 <= objArr.length) {
            return;
        }
        if (objArr == f19210e) {
            if (i5 < 10) {
                i5 = 10;
            }
            this.f19212b = new Object[i5];
            return;
        }
        c cVar = f.Companion;
        int length = objArr.length;
        cVar.getClass();
        Object[] objArr2 = new Object[c.e(length, i5)];
        Object[] objArr3 = this.f19212b;
        o.d(0, this.f19211a, objArr3.length, objArr3, objArr2);
        Object[] objArr4 = this.f19212b;
        int length2 = objArr4.length;
        int i10 = this.f19211a;
        o.d(length2 - i10, 0, i10, objArr4, objArr2);
        this.f19211a = 0;
        this.f19212b = objArr2;
    }

    public final Object f() {
        if (isEmpty()) {
            return null;
        }
        return this.f19212b[this.f19211a];
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f19212b[this.f19211a];
    }

    public final int g(int i5) {
        Intrinsics.checkNotNullParameter(this.f19212b, "<this>");
        if (i5 == r0.length - 1) {
            return 0;
        }
        return i5 + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        c cVar = f.Companion;
        int i10 = this.f19213c;
        cVar.getClass();
        c.b(i5, i10);
        return this.f19212b[l(this.f19211a + i5)];
    }

    public final Object h() {
        if (isEmpty()) {
            return null;
        }
        return this.f19212b[l(u.e(this) + this.f19211a)];
    }

    public final int i(int i5) {
        return i5 < 0 ? i5 + this.f19212b.length : i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i5;
        int l6 = l(a() + this.f19211a);
        int i10 = this.f19211a;
        if (i10 < l6) {
            while (i10 < l6) {
                if (Intrinsics.areEqual(obj, this.f19212b[i10])) {
                    i5 = this.f19211a;
                } else {
                    i10++;
                }
            }
            return -1;
        }
        if (i10 < l6) {
            return -1;
        }
        int length = this.f19212b.length;
        while (true) {
            if (i10 >= length) {
                for (int i11 = 0; i11 < l6; i11++) {
                    if (Intrinsics.areEqual(obj, this.f19212b[i11])) {
                        i10 = i11 + this.f19212b.length;
                        i5 = this.f19211a;
                    }
                }
                return -1;
            }
            if (Intrinsics.areEqual(obj, this.f19212b[i10])) {
                i5 = this.f19211a;
                break;
            }
            i10++;
        }
        return i10 - i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final void j(int i5, int i10) {
        if (i5 < i10) {
            o.k(this.f19212b, null, i5, i10);
            return;
        }
        Object[] objArr = this.f19212b;
        o.k(objArr, null, i5, objArr.length);
        o.k(this.f19212b, null, 0, i10);
    }

    public final int l(int i5) {
        Object[] objArr = this.f19212b;
        return i5 >= objArr.length ? i5 - objArr.length : i5;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f19212b[l(u.e(this) + this.f19211a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i5;
        int l6 = l(this.f19213c + this.f19211a);
        int i10 = this.f19211a;
        if (i10 < l6) {
            length = l6 - 1;
            if (i10 <= length) {
                while (!Intrinsics.areEqual(obj, this.f19212b[length])) {
                    if (length != i10) {
                        length--;
                    }
                }
                i5 = this.f19211a;
                return length - i5;
            }
            return -1;
        }
        if (i10 > l6) {
            int i11 = l6 - 1;
            while (true) {
                if (-1 >= i11) {
                    Object[] objArr = this.f19212b;
                    Intrinsics.checkNotNullParameter(objArr, "<this>");
                    length = objArr.length - 1;
                    int i12 = this.f19211a;
                    if (i12 <= length) {
                        while (!Intrinsics.areEqual(obj, this.f19212b[length])) {
                            if (length != i12) {
                                length--;
                            }
                        }
                        i5 = this.f19211a;
                    }
                } else {
                    if (Intrinsics.areEqual(obj, this.f19212b[i11])) {
                        length = i11 + this.f19212b.length;
                        i5 = this.f19211a;
                        break;
                    }
                    i11--;
                }
            }
        }
        return -1;
    }

    public final void m() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        c(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        int l6;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z5 = false;
        z5 = false;
        z5 = false;
        if (!isEmpty() && this.f19212b.length != 0) {
            int l10 = l(a() + this.f19211a);
            int i5 = this.f19211a;
            if (i5 < l10) {
                l6 = i5;
                while (i5 < l10) {
                    Object obj = this.f19212b[i5];
                    if (elements.contains(obj)) {
                        z5 = true;
                    } else {
                        this.f19212b[l6] = obj;
                        l6++;
                    }
                    i5++;
                }
                o.k(this.f19212b, null, l6, l10);
            } else {
                int length = this.f19212b.length;
                boolean z7 = false;
                int i10 = i5;
                while (i5 < length) {
                    Object[] objArr = this.f19212b;
                    Object obj2 = objArr[i5];
                    objArr[i5] = null;
                    if (elements.contains(obj2)) {
                        z7 = true;
                    } else {
                        this.f19212b[i10] = obj2;
                        i10++;
                    }
                    i5++;
                }
                l6 = l(i10);
                for (int i11 = 0; i11 < l10; i11++) {
                    Object[] objArr2 = this.f19212b;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (elements.contains(obj3)) {
                        z7 = true;
                    } else {
                        this.f19212b[l6] = obj3;
                        l6 = g(l6);
                    }
                }
                z5 = z7;
            }
            if (z5) {
                m();
                this.f19213c = i(l6 - this.f19211a);
            }
        }
        return z5;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m();
        Object[] objArr = this.f19212b;
        int i5 = this.f19211a;
        Object obj = objArr[i5];
        objArr[i5] = null;
        this.f19211a = g(i5);
        this.f19213c = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m();
        int l6 = l(u.e(this) + this.f19211a);
        Object[] objArr = this.f19212b;
        Object obj = objArr[l6];
        objArr[l6] = null;
        this.f19213c = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i5, int i10) {
        c cVar = f.Companion;
        int i11 = this.f19213c;
        cVar.getClass();
        c.d(i5, i10, i11);
        int i12 = i10 - i5;
        if (i12 == 0) {
            return;
        }
        if (i12 == this.f19213c) {
            clear();
            return;
        }
        if (i12 == 1) {
            c(i5);
            return;
        }
        m();
        if (i5 < this.f19213c - i10) {
            int l6 = l(this.f19211a + (i5 - 1));
            int l10 = l(this.f19211a + (i10 - 1));
            while (i5 > 0) {
                int i13 = l6 + 1;
                int min = Math.min(i5, Math.min(i13, l10 + 1));
                Object[] objArr = this.f19212b;
                int i14 = l10 - min;
                int i15 = l6 - min;
                o.d(i14 + 1, i15 + 1, i13, objArr, objArr);
                l6 = i(i15);
                l10 = i(i14);
                i5 -= min;
            }
            int l11 = l(this.f19211a + i12);
            j(this.f19211a, l11);
            this.f19211a = l11;
        } else {
            int l12 = l(this.f19211a + i10);
            int l13 = l(this.f19211a + i5);
            int i16 = this.f19213c;
            while (true) {
                i16 -= i10;
                if (i16 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f19212b;
                i10 = Math.min(i16, Math.min(objArr2.length - l12, objArr2.length - l13));
                Object[] objArr3 = this.f19212b;
                int i17 = l12 + i10;
                o.d(l13, l12, i17, objArr3, objArr3);
                l12 = l(i17);
                l13 = l(l13 + i10);
            }
            int l14 = l(this.f19213c + this.f19211a);
            j(i(l14 - i12), l14);
        }
        this.f19213c -= i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int l6;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z5 = false;
        z5 = false;
        z5 = false;
        if (!isEmpty() && this.f19212b.length != 0) {
            int l10 = l(a() + this.f19211a);
            int i5 = this.f19211a;
            if (i5 < l10) {
                l6 = i5;
                while (i5 < l10) {
                    Object obj = this.f19212b[i5];
                    if (elements.contains(obj)) {
                        this.f19212b[l6] = obj;
                        l6++;
                    } else {
                        z5 = true;
                    }
                    i5++;
                }
                o.k(this.f19212b, null, l6, l10);
            } else {
                int length = this.f19212b.length;
                boolean z7 = false;
                int i10 = i5;
                while (i5 < length) {
                    Object[] objArr = this.f19212b;
                    Object obj2 = objArr[i5];
                    objArr[i5] = null;
                    if (elements.contains(obj2)) {
                        this.f19212b[i10] = obj2;
                        i10++;
                    } else {
                        z7 = true;
                    }
                    i5++;
                }
                l6 = l(i10);
                for (int i11 = 0; i11 < l10; i11++) {
                    Object[] objArr2 = this.f19212b;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (elements.contains(obj3)) {
                        this.f19212b[l6] = obj3;
                        l6 = g(l6);
                    } else {
                        z7 = true;
                    }
                }
                z5 = z7;
            }
            if (z5) {
                m();
                this.f19213c = i(l6 - this.f19211a);
            }
        }
        return z5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        c cVar = f.Companion;
        int i10 = this.f19213c;
        cVar.getClass();
        c.b(i5, i10);
        int l6 = l(this.f19211a + i5);
        Object[] objArr = this.f19212b;
        Object obj2 = objArr[l6];
        objArr[l6] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        int i10;
        c cVar = f.Companion;
        int i11 = this.f19213c;
        cVar.getClass();
        c.c(i5, i11);
        if (i5 == this.f19213c) {
            addLast(obj);
            return;
        }
        if (i5 == 0) {
            addFirst(obj);
            return;
        }
        m();
        e(this.f19213c + 1);
        int l6 = l(this.f19211a + i5);
        int i12 = this.f19213c;
        if (i5 < ((i12 + 1) >> 1)) {
            if (l6 == 0) {
                Object[] objArr = this.f19212b;
                Intrinsics.checkNotNullParameter(objArr, "<this>");
                l6 = objArr.length;
            }
            int i13 = l6 - 1;
            int i14 = this.f19211a;
            if (i14 == 0) {
                Object[] objArr2 = this.f19212b;
                Intrinsics.checkNotNullParameter(objArr2, "<this>");
                i10 = objArr2.length - 1;
            } else {
                i10 = i14 - 1;
            }
            int i15 = this.f19211a;
            if (i13 >= i15) {
                Object[] objArr3 = this.f19212b;
                objArr3[i10] = objArr3[i15];
                o.d(i15, i15 + 1, i13 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f19212b;
                o.d(i15 - 1, i15, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f19212b;
                objArr5[objArr5.length - 1] = objArr5[0];
                o.d(0, 1, i13 + 1, objArr5, objArr5);
            }
            this.f19212b[i13] = obj;
            this.f19211a = i10;
        } else {
            int l10 = l(i12 + this.f19211a);
            if (l6 < l10) {
                Object[] objArr6 = this.f19212b;
                o.d(l6 + 1, l6, l10, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f19212b;
                o.d(1, 0, l10, objArr7, objArr7);
                Object[] objArr8 = this.f19212b;
                objArr8[0] = objArr8[objArr8.length - 1];
                o.d(l6 + 1, l6, objArr8.length - 1, objArr8, objArr8);
            }
            this.f19212b[l6] = obj;
        }
        this.f19213c++;
    }

    public l(int i5) {
        Object[] objArr;
        if (i5 == 0) {
            objArr = f19210e;
        } else if (i5 > 0) {
            objArr = new Object[i5];
        } else {
            throw new IllegalArgumentException(c1.i(i5, "Illegal Capacity: "));
        }
        this.f19212b = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        int i5 = this.f19213c;
        if (length < i5) {
            Intrinsics.checkNotNullParameter(array, "reference");
            Object newInstance = Array.newInstance(array.getClass().getComponentType(), i5);
            Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) newInstance;
        }
        int l6 = l(this.f19213c + this.f19211a);
        int i10 = this.f19211a;
        if (i10 < l6) {
            o.g(i10, l6, 2, this.f19212b, array);
        } else if (!isEmpty()) {
            Object[] objArr = this.f19212b;
            o.d(0, this.f19211a, objArr.length, objArr, array);
            Object[] objArr2 = this.f19212b;
            o.d(objArr2.length - this.f19211a, 0, l6, objArr2, array);
        }
        int i11 = this.f19213c;
        Intrinsics.checkNotNullParameter(array, "array");
        if (i11 < array.length) {
            array[i11] = null;
        }
        return array;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i5, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        c cVar = f.Companion;
        int i10 = this.f19213c;
        cVar.getClass();
        c.c(i5, i10);
        if (elements.isEmpty()) {
            return false;
        }
        if (i5 == this.f19213c) {
            return addAll(elements);
        }
        m();
        e(elements.size() + this.f19213c);
        int l6 = l(this.f19213c + this.f19211a);
        int l10 = l(this.f19211a + i5);
        int size = elements.size();
        if (i5 < ((this.f19213c + 1) >> 1)) {
            int i11 = this.f19211a;
            int i12 = i11 - size;
            if (l10 < i11) {
                Object[] objArr = this.f19212b;
                o.d(i12, i11, objArr.length, objArr, objArr);
                if (size >= l10) {
                    Object[] objArr2 = this.f19212b;
                    o.d(objArr2.length - size, 0, l10, objArr2, objArr2);
                } else {
                    Object[] objArr3 = this.f19212b;
                    o.d(objArr3.length - size, 0, size, objArr3, objArr3);
                    Object[] objArr4 = this.f19212b;
                    o.d(0, size, l10, objArr4, objArr4);
                }
            } else if (i12 >= 0) {
                Object[] objArr5 = this.f19212b;
                o.d(i12, i11, l10, objArr5, objArr5);
            } else {
                Object[] objArr6 = this.f19212b;
                i12 += objArr6.length;
                int i13 = l10 - i11;
                int length = objArr6.length - i12;
                if (length >= i13) {
                    o.d(i12, i11, l10, objArr6, objArr6);
                } else {
                    o.d(i12, i11, i11 + length, objArr6, objArr6);
                    Object[] objArr7 = this.f19212b;
                    o.d(0, this.f19211a + length, l10, objArr7, objArr7);
                }
            }
            this.f19211a = i12;
            d(i(l10 - size), elements);
            return true;
        }
        int i14 = l10 + size;
        if (l10 < l6) {
            int i15 = size + l6;
            Object[] objArr8 = this.f19212b;
            if (i15 <= objArr8.length) {
                o.d(i14, l10, l6, objArr8, objArr8);
            } else if (i14 >= objArr8.length) {
                o.d(i14 - objArr8.length, l10, l6, objArr8, objArr8);
            } else {
                int length2 = l6 - (i15 - objArr8.length);
                o.d(0, length2, l6, objArr8, objArr8);
                Object[] objArr9 = this.f19212b;
                o.d(i14, l10, length2, objArr9, objArr9);
            }
        } else {
            Object[] objArr10 = this.f19212b;
            o.d(size, 0, l6, objArr10, objArr10);
            Object[] objArr11 = this.f19212b;
            if (i14 >= objArr11.length) {
                o.d(i14 - objArr11.length, l10, objArr11.length, objArr11, objArr11);
            } else {
                o.d(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                Object[] objArr12 = this.f19212b;
                o.d(i14, l10, objArr12.length - size, objArr12, objArr12);
            }
        }
        d(l10, elements);
        return true;
    }

    public l(t0 elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] array = elements.toArray(new Object[0]);
        this.f19212b = array;
        this.f19213c = array.length;
        if (array.length == 0) {
            this.f19212b = f19210e;
        }
    }
}
