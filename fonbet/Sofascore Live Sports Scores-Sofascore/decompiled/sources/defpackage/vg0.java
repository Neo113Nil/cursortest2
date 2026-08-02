package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class vg0 extends v6 {

    @NotNull
    public static final ug0 d = new ug0(null);
    public static final Object[] e = new Object[0];
    public int a;
    public Object[] b;
    public int c;

    public vg0(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = e;
        } else {
            if (i <= 0) {
                a70.p(ljg.j(i, "Illegal Capacity: "));
                throw null;
            }
            objArr = new Object[i];
        }
        this.b = objArr;
    }

    public final void a(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.b.length;
        while (i < length && it.hasNext()) {
            this.b[i] = it.next();
            i++;
        }
        int i2 = this.a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.b[i3] = it.next();
        }
        this.c = collection.size() + size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        q4 q4Var = u4.Companion;
        int size = size();
        q4Var.getClass();
        q4.c(i, size);
        if (i == size()) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        q();
        c(size() + 1);
        int p = p(this.a + i);
        if (i < ((size() + 1) >> 1)) {
            int D = p == 0 ? ph0.D(this.b) : p - 1;
            int i2 = this.a;
            int D2 = i2 == 0 ? ph0.D(this.b) : i2 - 1;
            int i3 = this.a;
            Object[] objArr = this.b;
            if (D >= i3) {
                objArr[D2] = objArr[i3];
                mh0.d(i3, i3 + 1, D + 1, objArr, objArr);
            } else {
                mh0.d(i3 - 1, i3, objArr.length, objArr, objArr);
                Object[] objArr2 = this.b;
                objArr2[objArr2.length - 1] = objArr2[0];
                mh0.d(0, 1, D + 1, objArr2, objArr2);
            }
            this.b[D] = obj;
            this.a = D2;
        } else {
            int p2 = p(size() + this.a);
            Object[] objArr3 = this.b;
            if (p < p2) {
                mh0.d(p + 1, p, p2, objArr3, objArr3);
            } else {
                mh0.d(1, 0, p2, objArr3, objArr3);
                Object[] objArr4 = this.b;
                objArr4[0] = objArr4[objArr4.length - 1];
                mh0.d(p + 1, p, objArr4.length - 1, objArr4, objArr4);
            }
            this.b[p] = obj;
        }
        this.c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        q4 q4Var = u4.Companion;
        int size = size();
        q4Var.getClass();
        q4.c(i, size);
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        q();
        c(collection.size() + size());
        int p = p(size() + this.a);
        int p2 = p(this.a + i);
        int size2 = collection.size();
        if (i >= ((size() + 1) >> 1)) {
            int i2 = p2 + size2;
            Object[] objArr = this.b;
            if (p2 < p) {
                int i3 = size2 + p;
                if (i3 <= objArr.length) {
                    mh0.d(i2, p2, p, objArr, objArr);
                } else if (i2 >= objArr.length) {
                    mh0.d(i2 - objArr.length, p2, p, objArr, objArr);
                } else {
                    int length = p - (i3 - objArr.length);
                    mh0.d(0, length, p, objArr, objArr);
                    Object[] objArr2 = this.b;
                    mh0.d(i2, p2, length, objArr2, objArr2);
                }
            } else {
                mh0.d(size2, 0, p, objArr, objArr);
                Object[] objArr3 = this.b;
                if (i2 >= objArr3.length) {
                    mh0.d(i2 - objArr3.length, p2, objArr3.length, objArr3, objArr3);
                } else {
                    mh0.d(0, objArr3.length - size2, objArr3.length, objArr3, objArr3);
                    Object[] objArr4 = this.b;
                    mh0.d(i2, p2, objArr4.length - size2, objArr4, objArr4);
                }
            }
            a(p2, collection);
            return true;
        }
        int i4 = this.a;
        int i5 = i4 - size2;
        Object[] objArr5 = this.b;
        if (p2 < i4) {
            mh0.d(i5, i4, objArr5.length, objArr5, objArr5);
            Object[] objArr6 = this.b;
            if (size2 >= p2) {
                mh0.d(objArr6.length - size2, 0, p2, objArr6, objArr6);
            } else {
                mh0.d(objArr6.length - size2, 0, size2, objArr6, objArr6);
                Object[] objArr7 = this.b;
                mh0.d(0, size2, p2, objArr7, objArr7);
            }
        } else if (i5 >= 0) {
            mh0.d(i5, i4, p2, objArr5, objArr5);
        } else {
            i5 += objArr5.length;
            int i6 = p2 - i4;
            int length2 = objArr5.length - i5;
            if (length2 >= i6) {
                mh0.d(i5, i4, p2, objArr5, objArr5);
            } else {
                mh0.d(i5, i4, i4 + length2, objArr5, objArr5);
                Object[] objArr8 = this.b;
                mh0.d(0, this.a + length2, p2, objArr8, objArr8);
            }
        }
        this.a = i5;
        a(n(p2 - size2), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        q();
        c(size() + 1);
        int i = this.a;
        int D = i == 0 ? ph0.D(this.b) : i - 1;
        this.a = D;
        this.b[D] = obj;
        this.c = size() + 1;
    }

    public final void addLast(Object obj) {
        q();
        c(size() + 1);
        this.b[p(size() + this.a)] = obj;
        this.c = size() + 1;
    }

    public final void c(int i) {
        if (i < 0) {
            a70.r("Deque is too big.");
            return;
        }
        Object[] objArr = this.b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == e) {
            if (i < 10) {
                i = 10;
            }
            this.b = new Object[i];
            return;
        }
        q4 q4Var = u4.Companion;
        int length = objArr.length;
        q4Var.getClass();
        Object[] objArr2 = new Object[q4.e(length, i)];
        Object[] objArr3 = this.b;
        mh0.d(0, this.a, objArr3.length, objArr3, objArr2);
        Object[] objArr4 = this.b;
        int length2 = objArr4.length;
        int i2 = this.a;
        mh0.d(length2 - i2, 0, i2, objArr4, objArr2);
        this.a = 0;
        this.b = objArr2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            q();
            o(this.a, p(size() + this.a));
        }
        this.a = 0;
        this.c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final Object d() {
        if (isEmpty()) {
            return null;
        }
        return this.b[this.a];
    }

    public final int e(int i) {
        if (i == ph0.D(this.b)) {
            return 0;
        }
        return i + 1;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.b[this.a];
        }
        ogj.m("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        q4 q4Var = u4.Companion;
        int size = size();
        q4Var.getClass();
        q4.b(i, size);
        return this.b[p(this.a + i)];
    }

    @Override // defpackage.v6
    public final int getSize() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int p = p(size() + this.a);
        int i2 = this.a;
        if (i2 < p) {
            while (i2 < p) {
                if (Intrinsics.c(obj, this.b[i2])) {
                    i = this.a;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (isEmpty() || (i2 = this.a) < p) {
            return -1;
        }
        int length = this.b.length;
        while (true) {
            if (i2 >= length) {
                for (int i3 = 0; i3 < p; i3++) {
                    if (Intrinsics.c(obj, this.b[i3])) {
                        i2 = i3 + this.b.length;
                        i = this.a;
                    }
                }
                return -1;
            }
            if (Intrinsics.c(obj, this.b[i2])) {
                i = this.a;
                break;
            }
            i2++;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object last() {
        if (isEmpty()) {
            ogj.m("ArrayDeque is empty.");
            return null;
        }
        return this.b[p((size() - 1) + this.a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int D;
        int i;
        int p = p(size() + this.a);
        int i2 = this.a;
        if (i2 < p) {
            D = p - 1;
            if (i2 <= D) {
                while (!Intrinsics.c(obj, this.b[D])) {
                    if (D != i2) {
                        D--;
                    }
                }
                i = this.a;
                return D - i;
            }
            return -1;
        }
        if (!isEmpty() && this.a >= p) {
            while (true) {
                p--;
                Object[] objArr = this.b;
                if (-1 >= p) {
                    D = ph0.D(objArr);
                    int i3 = this.a;
                    if (i3 <= D) {
                        while (!Intrinsics.c(obj, this.b[D])) {
                            if (D != i3) {
                                D--;
                            }
                        }
                        i = this.a;
                    }
                } else if (Intrinsics.c(obj, objArr[p])) {
                    D = p + this.b.length;
                    i = this.a;
                    break;
                }
            }
            return D - i;
        }
        return -1;
    }

    public final Object m() {
        if (isEmpty()) {
            return null;
        }
        return this.b[p((size() - 1) + this.a)];
    }

    public final int n(int i) {
        return i < 0 ? i + this.b.length : i;
    }

    public final void o(int i, int i2) {
        Object[] objArr = this.b;
        if (i < i2) {
            mh0.m(i, i2, null, objArr);
        } else {
            mh0.m(i, objArr.length, null, objArr);
            mh0.m(0, i2, null, this.b);
        }
    }

    public final int p(int i) {
        Object[] objArr = this.b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void q() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int p;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int p2 = p(size() + this.a);
            int i = this.a;
            if (i < p2) {
                p = i;
                while (true) {
                    objArr = this.b;
                    if (i >= p2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.b[p] = obj;
                        p++;
                    }
                    i++;
                }
                mh0.m(p, p2, null, objArr);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.b[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                p = p(i2);
                for (int i3 = 0; i3 < p2; i3++) {
                    Object[] objArr3 = this.b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.b[p] = obj3;
                        p = e(p);
                    }
                }
                z = z2;
            }
            if (z) {
                q();
                this.c = n(p - this.a);
            }
        }
        return z;
    }

    @Override // defpackage.v6
    public final Object removeAt(int i) {
        q4 q4Var = u4.Companion;
        int size = size();
        q4Var.getClass();
        q4.b(i, size);
        if (i == size() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        q();
        int p = p(this.a + i);
        Object obj = this.b[p];
        int size2 = size() >> 1;
        int i2 = this.a;
        if (i < size2) {
            Object[] objArr = this.b;
            if (p >= i2) {
                mh0.d(i2 + 1, i2, p, objArr, objArr);
            } else {
                mh0.d(1, 0, p, objArr, objArr);
                Object[] objArr2 = this.b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i3 = this.a;
                mh0.d(i3 + 1, i3, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.b;
            int i4 = this.a;
            objArr3[i4] = null;
            this.a = e(i4);
        } else {
            int p2 = p((size() - 1) + i2);
            Object[] objArr4 = this.b;
            if (p <= p2) {
                mh0.d(p, p + 1, p2 + 1, objArr4, objArr4);
            } else {
                mh0.d(p, p + 1, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.b;
                objArr5[objArr5.length - 1] = objArr5[0];
                mh0.d(0, 1, p2 + 1, objArr5, objArr5);
            }
            this.b[p2] = null;
        }
        this.c = size() - 1;
        return obj;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            ogj.m("ArrayDeque is empty.");
            return null;
        }
        q();
        Object[] objArr = this.b;
        int i = this.a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.a = e(i);
        this.c = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            ogj.m("ArrayDeque is empty.");
            return null;
        }
        q();
        int p = p((size() - 1) + this.a);
        Object[] objArr = this.b;
        Object obj = objArr[p];
        objArr[p] = null;
        this.c = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        q4 q4Var = u4.Companion;
        int size = size();
        q4Var.getClass();
        q4.d(i, i2, size);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == size()) {
            clear();
            return;
        }
        if (i3 == 1) {
            removeAt(i);
            return;
        }
        q();
        int size2 = size() - i2;
        int i4 = this.a;
        if (i < size2) {
            int p = p((i - 1) + i4);
            int p2 = p(this.a + (i2 - 1));
            while (i > 0) {
                int i5 = p + 1;
                int min = Math.min(i, Math.min(i5, p2 + 1));
                Object[] objArr = this.b;
                int i6 = p2 - min;
                int i7 = p - min;
                mh0.d(i6 + 1, i7 + 1, i5, objArr, objArr);
                p = n(i7);
                p2 = n(i6);
                i -= min;
            }
            int p3 = p(this.a + i3);
            o(this.a, p3);
            this.a = p3;
        } else {
            int p4 = p(i4 + i2);
            int p5 = p(this.a + i);
            int size3 = size();
            while (true) {
                size3 -= i2;
                if (size3 <= 0) {
                    break;
                }
                Object[] objArr2 = this.b;
                i2 = Math.min(size3, Math.min(objArr2.length - p4, objArr2.length - p5));
                Object[] objArr3 = this.b;
                int i8 = p4 + i2;
                mh0.d(p5, p4, i8, objArr3, objArr3);
                p4 = p(i8);
                p5 = p(p5 + i2);
            }
            int p6 = p(size() + this.a);
            o(n(p6 - i3), p6);
        }
        this.c = size() - i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int p;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int p2 = p(size() + this.a);
            int i = this.a;
            if (i < p2) {
                p = i;
                while (true) {
                    objArr = this.b;
                    if (i >= p2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.b[p] = obj;
                        p++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                mh0.m(p, p2, null, objArr);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                p = p(i2);
                for (int i3 = 0; i3 < p2; i3++) {
                    Object[] objArr3 = this.b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.b[p] = obj3;
                        p = e(p);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                q();
                this.c = n(p - this.a);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        q4 q4Var = u4.Companion;
        int size = size();
        q4Var.getClass();
        q4.b(i, size);
        int p = p(this.a + i);
        Object[] objArr = this.b;
        Object obj2 = objArr[p];
        objArr[p] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        if (objArr.length < size()) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size());
            newInstance.getClass();
            objArr = (Object[]) newInstance;
        }
        int p = p(size() + this.a);
        int i = this.a;
        if (i < p) {
            mh0.i(i, p, 2, this.b, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.b;
            mh0.d(0, this.a, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.b;
            mh0.d(objArr3.length - this.a, 0, p, objArr3, objArr);
        }
        int size = size();
        if (size < objArr.length) {
            objArr[size] = null;
        }
        return objArr;
    }

    public vg0() {
        this.b = e;
    }

    public vg0(Collection collection) {
        collection.getClass();
        Object[] array = collection.toArray(new Object[0]);
        this.b = array;
        this.c = array.length;
        if (array.length == 0) {
            this.b = e;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        q();
        c(collection.size() + size());
        a(p(size() + this.a), collection);
        return true;
    }
}
