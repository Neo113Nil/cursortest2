package kotlin.collections;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.AbstractC7696c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u0005*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0006B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lkotlin/collections/k;", "E", "Lkotlin/collections/f;", "<init>", "()V", "d", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.collections.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7704k<E> extends AbstractC7699f<E> {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final Object[] f71751e = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    private int f71752a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private Object[] f71753b;

    /* renamed from: c, reason: collision with root package name */
    private int f71754c;

    public C7704k() {
        this.f71753b = f71751e;
    }

    private final void e(int i11, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f71753b.length;
        while (i11 < length && it.hasNext()) {
            this.f71753b[i11] = it.next();
            i11++;
        }
        int i12 = this.f71752a;
        for (int i13 = 0; i13 < i12 && it.hasNext(); i13++) {
            this.f71753b[i13] = it.next();
        }
        this.f71754c = collection.size() + this.f71754c;
    }

    private final void h(int i11) {
        if (i11 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f71753b;
        if (i11 <= objArr.length) {
            return;
        }
        if (objArr == f71751e) {
            if (i11 < 10) {
                i11 = 10;
            }
            this.f71753b = new Object[i11];
            return;
        }
        AbstractC7696c.Companion companion = AbstractC7696c.INSTANCE;
        int length = objArr.length;
        companion.getClass();
        Object[] objArr2 = new Object[AbstractC7696c.Companion.d(length, i11)];
        Object[] objArr3 = this.f71753b;
        C7705l.r(objArr3, 0, objArr2, this.f71752a, objArr3.length);
        Object[] objArr4 = this.f71753b;
        int length2 = objArr4.length;
        int i12 = this.f71752a;
        C7705l.r(objArr4, length2 - i12, objArr2, 0, i12);
        this.f71752a = 0;
        this.f71753b = objArr2;
    }

    private final int l(int i11) {
        if (i11 == C7705l.I(this.f71753b)) {
            return 0;
        }
        return i11 + 1;
    }

    private final int n(int i11) {
        return i11 < 0 ? i11 + this.f71753b.length : i11;
    }

    private final void s(int i11, int i12) {
        if (i11 < i12) {
            C7705l.x(this.f71753b, null, i11, i12);
            return;
        }
        Object[] objArr = this.f71753b;
        int length = objArr.length;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Arrays.fill(objArr, i11, length, (Object) null);
        C7705l.x(this.f71753b, null, 0, i12);
    }

    private final int u(int i11) {
        Object[] objArr = this.f71753b;
        return i11 >= objArr.length ? i11 - objArr.length : i11;
    }

    private final void v() {
        ((AbstractList) this).modCount++;
    }

    public final E A() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e11) {
        addLast(e11);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        v();
        h(elements.size() + getF71754c());
        e(u(getF71754c() + this.f71752a), elements);
        return true;
    }

    public final void addFirst(E e11) {
        v();
        h(this.f71754c + 1);
        int i11 = this.f71752a;
        int I11 = i11 == 0 ? C7705l.I(this.f71753b) : i11 - 1;
        this.f71752a = I11;
        this.f71753b[I11] = e11;
        this.f71754c++;
    }

    public final void addLast(E e11) {
        v();
        h(getF71754c() + 1);
        this.f71753b[u(getF71754c() + this.f71752a)] = e11;
        this.f71754c = getF71754c() + 1;
    }

    @Override // kotlin.collections.AbstractC7699f
    public final E b(int i11) {
        AbstractC7696c.Companion companion = AbstractC7696c.INSTANCE;
        int i12 = this.f71754c;
        companion.getClass();
        AbstractC7696c.Companion.a(i11, i12);
        if (i11 == C7714v.P(this)) {
            return removeLast();
        }
        if (i11 == 0) {
            return removeFirst();
        }
        v();
        int u11 = u(this.f71752a + i11);
        Object[] objArr = this.f71753b;
        E e11 = (E) objArr[u11];
        if (i11 < (this.f71754c >> 1)) {
            int i13 = this.f71752a;
            if (u11 >= i13) {
                C7705l.r(objArr, i13 + 1, objArr, i13, u11);
            } else {
                C7705l.r(objArr, 1, objArr, 0, u11);
                Object[] objArr2 = this.f71753b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i14 = this.f71752a;
                C7705l.r(objArr2, i14 + 1, objArr2, i14, objArr2.length - 1);
            }
            Object[] objArr3 = this.f71753b;
            int i15 = this.f71752a;
            objArr3[i15] = null;
            this.f71752a = l(i15);
        } else {
            int u12 = u(C7714v.P(this) + this.f71752a);
            if (u11 <= u12) {
                Object[] objArr4 = this.f71753b;
                C7705l.r(objArr4, u11, objArr4, u11 + 1, u12 + 1);
            } else {
                Object[] objArr5 = this.f71753b;
                C7705l.r(objArr5, u11, objArr5, u11 + 1, objArr5.length);
                Object[] objArr6 = this.f71753b;
                objArr6[objArr6.length - 1] = objArr6[0];
                C7705l.r(objArr6, 0, objArr6, 1, u12 + 1);
            }
            this.f71753b[u12] = null;
        }
        this.f71754c--;
        return e11;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            v();
            s(this.f71752a, u(getF71754c() + this.f71752a));
        }
        this.f71752a = 0;
        this.f71754c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f71753b[this.f71752a];
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i11) {
        AbstractC7696c.Companion companion = AbstractC7696c.INSTANCE;
        int i12 = this.f71754c;
        companion.getClass();
        AbstractC7696c.Companion.a(i11, i12);
        return (E) this.f71753b[u(this.f71752a + i11)];
    }

    @Override // kotlin.collections.AbstractC7699f
    /* renamed from: getSize, reason: from getter */
    public final int getF71754c() {
        return this.f71754c;
    }

    public final E i() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f71753b[this.f71752a];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i11;
        int u11 = u(getF71754c() + this.f71752a);
        int i12 = this.f71752a;
        if (i12 < u11) {
            while (i12 < u11) {
                if (Intrinsics.d(obj, this.f71753b[i12])) {
                    i11 = this.f71752a;
                } else {
                    i12++;
                }
            }
            return -1;
        }
        if (i12 < u11) {
            return -1;
        }
        int length = this.f71753b.length;
        while (true) {
            if (i12 >= length) {
                for (int i13 = 0; i13 < u11; i13++) {
                    if (Intrinsics.d(obj, this.f71753b[i13])) {
                        i12 = i13 + this.f71753b.length;
                        i11 = this.f71752a;
                    }
                }
                return -1;
            }
            if (Intrinsics.d(obj, this.f71753b[i12])) {
                i11 = this.f71752a;
                break;
            }
            i12++;
        }
        return i12 - i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return getF71754c() == 0;
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f71753b[u(C7714v.P(this) + this.f71752a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int I11;
        int i11;
        int u11 = u(getF71754c() + this.f71752a);
        int i12 = this.f71752a;
        if (i12 < u11) {
            I11 = u11 - 1;
            if (i12 <= I11) {
                while (!Intrinsics.d(obj, this.f71753b[I11])) {
                    if (I11 != i12) {
                        I11--;
                    }
                }
                i11 = this.f71752a;
                return I11 - i11;
            }
            return -1;
        }
        if (i12 > u11) {
            int i13 = u11 - 1;
            while (true) {
                if (-1 >= i13) {
                    I11 = C7705l.I(this.f71753b);
                    int i14 = this.f71752a;
                    if (i14 <= I11) {
                        while (!Intrinsics.d(obj, this.f71753b[I11])) {
                            if (I11 != i14) {
                                I11--;
                            }
                        }
                        i11 = this.f71752a;
                    }
                } else {
                    if (Intrinsics.d(obj, this.f71753b[i13])) {
                        I11 = i13 + this.f71753b.length;
                        i11 = this.f71752a;
                        break;
                    }
                    i13--;
                }
            }
        }
        return -1;
    }

    public final E m() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f71753b[u(C7714v.P(this) + this.f71752a)];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        b(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(@NotNull Collection<? extends Object> elements) {
        int u11;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z11 = false;
        z11 = false;
        z11 = false;
        if (!isEmpty() && this.f71753b.length != 0) {
            int u12 = u(this.f71754c + this.f71752a);
            int i11 = this.f71752a;
            if (i11 < u12) {
                u11 = i11;
                while (i11 < u12) {
                    Object obj = this.f71753b[i11];
                    if (elements.contains(obj)) {
                        z11 = true;
                    } else {
                        this.f71753b[u11] = obj;
                        u11++;
                    }
                    i11++;
                }
                C7705l.x(this.f71753b, null, u11, u12);
            } else {
                int length = this.f71753b.length;
                boolean z12 = false;
                int i12 = i11;
                while (i11 < length) {
                    Object[] objArr = this.f71753b;
                    Object obj2 = objArr[i11];
                    objArr[i11] = null;
                    if (elements.contains(obj2)) {
                        z12 = true;
                    } else {
                        this.f71753b[i12] = obj2;
                        i12++;
                    }
                    i11++;
                }
                u11 = u(i12);
                for (int i13 = 0; i13 < u12; i13++) {
                    Object[] objArr2 = this.f71753b;
                    Object obj3 = objArr2[i13];
                    objArr2[i13] = null;
                    if (elements.contains(obj3)) {
                        z12 = true;
                    } else {
                        this.f71753b[u11] = obj3;
                        u11 = l(u11);
                    }
                }
                z11 = z12;
            }
            if (z11) {
                v();
                this.f71754c = n(u11 - this.f71752a);
            }
        }
        return z11;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        v();
        Object[] objArr = this.f71753b;
        int i11 = this.f71752a;
        E e11 = (E) objArr[i11];
        objArr[i11] = null;
        this.f71752a = l(i11);
        this.f71754c = getF71754c() - 1;
        return e11;
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        v();
        int u11 = u(C7714v.P(this) + this.f71752a);
        Object[] objArr = this.f71753b;
        E e11 = (E) objArr[u11];
        objArr[u11] = null;
        this.f71754c = getF71754c() - 1;
        return e11;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i11, int i12) {
        AbstractC7696c.Companion companion = AbstractC7696c.INSTANCE;
        int i13 = this.f71754c;
        companion.getClass();
        AbstractC7696c.Companion.c(i11, i12, i13);
        int i14 = i12 - i11;
        if (i14 == 0) {
            return;
        }
        if (i14 == this.f71754c) {
            clear();
            return;
        }
        if (i14 == 1) {
            b(i11);
            return;
        }
        v();
        if (i11 < this.f71754c - i12) {
            int u11 = u((i11 - 1) + this.f71752a);
            int u12 = u((i12 - 1) + this.f71752a);
            while (i11 > 0) {
                int i15 = u11 + 1;
                int min = Math.min(i11, Math.min(i15, u12 + 1));
                Object[] objArr = this.f71753b;
                int i16 = u12 - min;
                int i17 = u11 - min;
                C7705l.r(objArr, i16 + 1, objArr, i17 + 1, i15);
                u11 = n(i17);
                u12 = n(i16);
                i11 -= min;
            }
            int u13 = u(this.f71752a + i14);
            s(this.f71752a, u13);
            this.f71752a = u13;
        } else {
            int u14 = u(this.f71752a + i12);
            int u15 = u(this.f71752a + i11);
            int i18 = this.f71754c;
            while (true) {
                i18 -= i12;
                if (i18 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f71753b;
                i12 = Math.min(i18, Math.min(objArr2.length - u14, objArr2.length - u15));
                Object[] objArr3 = this.f71753b;
                int i19 = u14 + i12;
                C7705l.r(objArr3, u15, objArr3, u14, i19);
                u14 = u(i19);
                u15 = u(u15 + i12);
            }
            int u16 = u(this.f71754c + this.f71752a);
            s(n(u16 - i14), u16);
        }
        this.f71754c -= i14;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(@NotNull Collection<? extends Object> elements) {
        int u11;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z11 = false;
        z11 = false;
        z11 = false;
        if (!isEmpty() && this.f71753b.length != 0) {
            int u12 = u(this.f71754c + this.f71752a);
            int i11 = this.f71752a;
            if (i11 < u12) {
                u11 = i11;
                while (i11 < u12) {
                    Object obj = this.f71753b[i11];
                    if (elements.contains(obj)) {
                        this.f71753b[u11] = obj;
                        u11++;
                    } else {
                        z11 = true;
                    }
                    i11++;
                }
                C7705l.x(this.f71753b, null, u11, u12);
            } else {
                int length = this.f71753b.length;
                boolean z12 = false;
                int i12 = i11;
                while (i11 < length) {
                    Object[] objArr = this.f71753b;
                    Object obj2 = objArr[i11];
                    objArr[i11] = null;
                    if (elements.contains(obj2)) {
                        this.f71753b[i12] = obj2;
                        i12++;
                    } else {
                        z12 = true;
                    }
                    i11++;
                }
                u11 = u(i12);
                for (int i13 = 0; i13 < u12; i13++) {
                    Object[] objArr2 = this.f71753b;
                    Object obj3 = objArr2[i13];
                    objArr2[i13] = null;
                    if (elements.contains(obj3)) {
                        this.f71753b[u11] = obj3;
                        u11 = l(u11);
                    } else {
                        z12 = true;
                    }
                }
                z11 = z12;
            }
            if (z11) {
                v();
                this.f71754c = n(u11 - this.f71752a);
            }
        }
        return z11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i11, E e11) {
        AbstractC7696c.Companion companion = AbstractC7696c.INSTANCE;
        int i12 = this.f71754c;
        companion.getClass();
        AbstractC7696c.Companion.a(i11, i12);
        int u11 = u(this.f71752a + i11);
        Object[] objArr = this.f71753b;
        E e12 = (E) objArr[u11];
        objArr[u11] = e11;
        return e12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public final Object[] toArray() {
        return toArray(new Object[getF71754c()]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, E e11) {
        AbstractC7696c.Companion companion = AbstractC7696c.INSTANCE;
        int i12 = this.f71754c;
        companion.getClass();
        AbstractC7696c.Companion.b(i11, i12);
        if (i11 == this.f71754c) {
            addLast(e11);
            return;
        }
        if (i11 == 0) {
            addFirst(e11);
            return;
        }
        v();
        h(this.f71754c + 1);
        int u11 = u(this.f71752a + i11);
        int i13 = this.f71754c;
        if (i11 < ((i13 + 1) >> 1)) {
            int I11 = u11 == 0 ? C7705l.I(this.f71753b) : u11 - 1;
            int i14 = this.f71752a;
            int I12 = i14 == 0 ? C7705l.I(this.f71753b) : i14 - 1;
            int i15 = this.f71752a;
            if (I11 >= i15) {
                Object[] objArr = this.f71753b;
                objArr[I12] = objArr[i15];
                C7705l.r(objArr, i15, objArr, i15 + 1, I11 + 1);
            } else {
                Object[] objArr2 = this.f71753b;
                C7705l.r(objArr2, i15 - 1, objArr2, i15, objArr2.length);
                Object[] objArr3 = this.f71753b;
                objArr3[objArr3.length - 1] = objArr3[0];
                C7705l.r(objArr3, 0, objArr3, 1, I11 + 1);
            }
            this.f71753b[I11] = e11;
            this.f71752a = I12;
        } else {
            int u12 = u(i13 + this.f71752a);
            if (u11 < u12) {
                Object[] objArr4 = this.f71753b;
                C7705l.r(objArr4, u11 + 1, objArr4, u11, u12);
            } else {
                Object[] objArr5 = this.f71753b;
                C7705l.r(objArr5, 1, objArr5, 0, u12);
                Object[] objArr6 = this.f71753b;
                objArr6[0] = objArr6[objArr6.length - 1];
                C7705l.r(objArr6, u11 + 1, objArr6, u11, objArr6.length - 1);
            }
            this.f71753b[u11] = e11;
        }
        this.f71754c++;
    }

    public C7704k(int i11) {
        Object[] objArr;
        if (i11 == 0) {
            objArr = f71751e;
        } else if (i11 > 0) {
            objArr = new Object[i11];
        } else {
            throw new IllegalArgumentException(Ej.b.a(i11, "Illegal Capacity: "));
        }
        this.f71753b = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public final <T> T[] toArray(@NotNull T[] reference) {
        Intrinsics.checkNotNullParameter(reference, "array");
        int length = reference.length;
        int i11 = this.f71754c;
        if (length < i11) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            Object newInstance = Array.newInstance(reference.getClass().getComponentType(), i11);
            Intrinsics.g(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            reference = (T[]) ((Object[]) newInstance);
        }
        int u11 = u(this.f71754c + this.f71752a);
        int i12 = this.f71752a;
        if (i12 < u11) {
            C7705l.u(this.f71753b, i12, reference, u11, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.f71753b;
            C7705l.r(objArr, 0, reference, this.f71752a, objArr.length);
            Object[] objArr2 = this.f71753b;
            C7705l.r(objArr2, objArr2.length - this.f71752a, reference, 0, u11);
        }
        C7714v.M0(this.f71754c, reference);
        return reference;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i11, @NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        AbstractC7696c.Companion companion = AbstractC7696c.INSTANCE;
        int i12 = this.f71754c;
        companion.getClass();
        AbstractC7696c.Companion.b(i11, i12);
        if (elements.isEmpty()) {
            return false;
        }
        if (i11 == this.f71754c) {
            return addAll(elements);
        }
        v();
        h(elements.size() + this.f71754c);
        int u11 = u(this.f71754c + this.f71752a);
        int u12 = u(this.f71752a + i11);
        int size = elements.size();
        if (i11 < ((this.f71754c + 1) >> 1)) {
            int i13 = this.f71752a;
            int i14 = i13 - size;
            if (u12 < i13) {
                Object[] objArr = this.f71753b;
                C7705l.r(objArr, i14, objArr, i13, objArr.length);
                if (size >= u12) {
                    Object[] objArr2 = this.f71753b;
                    C7705l.r(objArr2, objArr2.length - size, objArr2, 0, u12);
                } else {
                    Object[] objArr3 = this.f71753b;
                    C7705l.r(objArr3, objArr3.length - size, objArr3, 0, size);
                    Object[] objArr4 = this.f71753b;
                    C7705l.r(objArr4, 0, objArr4, size, u12);
                }
            } else if (i14 >= 0) {
                Object[] objArr5 = this.f71753b;
                C7705l.r(objArr5, i14, objArr5, i13, u12);
            } else {
                Object[] objArr6 = this.f71753b;
                i14 += objArr6.length;
                int i15 = u12 - i13;
                int length = objArr6.length - i14;
                if (length >= i15) {
                    C7705l.r(objArr6, i14, objArr6, i13, u12);
                } else {
                    C7705l.r(objArr6, i14, objArr6, i13, i13 + length);
                    Object[] objArr7 = this.f71753b;
                    C7705l.r(objArr7, 0, objArr7, this.f71752a + length, u12);
                }
            }
            this.f71752a = i14;
            e(n(u12 - size), elements);
            return true;
        }
        int i16 = u12 + size;
        if (u12 < u11) {
            int i17 = size + u11;
            Object[] objArr8 = this.f71753b;
            if (i17 <= objArr8.length) {
                C7705l.r(objArr8, i16, objArr8, u12, u11);
            } else if (i16 >= objArr8.length) {
                C7705l.r(objArr8, i16 - objArr8.length, objArr8, u12, u11);
            } else {
                int length2 = u11 - (i17 - objArr8.length);
                C7705l.r(objArr8, 0, objArr8, length2, u11);
                Object[] objArr9 = this.f71753b;
                C7705l.r(objArr9, i16, objArr9, u12, length2);
            }
        } else {
            Object[] objArr10 = this.f71753b;
            C7705l.r(objArr10, size, objArr10, 0, u11);
            Object[] objArr11 = this.f71753b;
            if (i16 >= objArr11.length) {
                C7705l.r(objArr11, i16 - objArr11.length, objArr11, u12, objArr11.length);
            } else {
                C7705l.r(objArr11, 0, objArr11, objArr11.length - size, objArr11.length);
                Object[] objArr12 = this.f71753b;
                C7705l.r(objArr12, i16, objArr12, u12, objArr12.length - size);
            }
        }
        e(u12, elements);
        return true;
    }
}
