package com.google.common.collect;

import Bl0.k0;
import com.google.common.collect.AbstractC5878w;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import ru.ozon.app.android.network.cookie.CookieListener;

/* loaded from: classes.dex */
public abstract class A<E> extends AbstractC5878w<E> implements Set<E> {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f59006c = 0;

    /* renamed from: b, reason: collision with root package name */
    private transient AbstractC5880y<E> f59007b;

    public static class a<E> extends AbstractC5878w.a<E> {

        /* renamed from: d, reason: collision with root package name */
        Object[] f59008d;

        /* renamed from: e, reason: collision with root package name */
        private int f59009e;

        public a() {
            super(4);
        }

        @Override // com.google.common.collect.AbstractC5878w.b
        public final /* bridge */ /* synthetic */ AbstractC5878w.b a(Object obj) {
            j(obj);
            return this;
        }

        public final void j(Object obj) {
            obj.getClass();
            if (this.f59008d != null) {
                int n11 = A.n(this.f59137b);
                Object[] objArr = this.f59008d;
                if (n11 <= objArr.length) {
                    int length = objArr.length - 1;
                    int hashCode = obj.hashCode();
                    int a11 = C5877v.a(hashCode);
                    while (true) {
                        int i11 = a11 & length;
                        Object[] objArr2 = this.f59008d;
                        Object obj2 = objArr2[i11];
                        if (obj2 == null) {
                            objArr2[i11] = obj;
                            this.f59009e += hashCode;
                            c(obj);
                            return;
                        } else if (obj2.equals(obj)) {
                            return;
                        } else {
                            a11 = i11 + 1;
                        }
                    }
                }
            }
            this.f59008d = null;
            c(obj);
        }

        public final void k(Object... objArr) {
            if (this.f59008d == null) {
                d(objArr);
                return;
            }
            for (Object obj : objArr) {
                j(obj);
            }
        }

        public final void l(Iterable iterable) {
            iterable.getClass();
            if (this.f59008d == null) {
                g(iterable);
                return;
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                j(it.next());
            }
        }

        public final A<E> m() {
            A<E> s11;
            int i11 = this.f59137b;
            if (i11 == 0) {
                int i12 = A.f59006c;
                return W.f59047j;
            }
            if (i11 == 1) {
                Object obj = this.f59136a[0];
                Objects.requireNonNull(obj);
                int i13 = A.f59006c;
                return new c0(obj);
            }
            if (this.f59008d == null || A.n(i11) != this.f59008d.length) {
                s11 = A.s(this.f59137b, this.f59136a);
                this.f59137b = s11.size();
            } else {
                int i14 = this.f59137b;
                Object[] objArr = this.f59136a;
                int length = objArr.length;
                if (i14 < (length >> 1) + (length >> 2)) {
                    objArr = Arrays.copyOf(objArr, i14);
                }
                s11 = new W<>(objArr, this.f59009e, this.f59008d, r6.length - 1, this.f59137b);
            }
            this.f59138c = true;
            this.f59008d = null;
            return s11;
        }
    }

    /* loaded from: classes9.dex */
    private static class b implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        final Object[] f59010a;

        b(Object[] objArr) {
            this.f59010a = objArr;
        }

        Object readResolve() {
            return A.v(this.f59010a);
        }
    }

    A() {
    }

    public static <E> A<E> B() {
        return W.f59047j;
    }

    public static <E> A<E> C(E e11) {
        return new c0(e11);
    }

    public static <E> A<E> D(E e11, E e12) {
        return s(2, e11, e12);
    }

    public static <E> A<E> E(E e11, E e12, E e13) {
        return s(3, e11, e12, e13);
    }

    @SafeVarargs
    public static <E> A<E> F(E e11, E e12, E e13, E e14, E e15, E e16, E... eArr) {
        k0.d("the total number of elements must fit in an int", eArr.length <= 2147483641);
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e11;
        objArr[1] = e12;
        objArr[2] = e13;
        objArr[3] = e14;
        objArr[4] = e15;
        objArr[5] = e16;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return s(length, objArr);
    }

    public static A G(CookieListener cookieListener, CookieListener cookieListener2, CookieListener cookieListener3, CookieListener cookieListener4) {
        return s(4, cookieListener, cookieListener2, cookieListener3, cookieListener4);
    }

    public static A H() {
        return s(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    }

    public static <E> a<E> m(int i11) {
        C5866j.b(i11, "expectedSize");
        a<E> aVar = new a<>(i11);
        aVar.f59008d = new Object[n(i11)];
        return aVar;
    }

    static int n(int i11) {
        int max = Math.max(i11, 2);
        if (max >= 751619276) {
            k0.d("collection too large", max < 1073741824);
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> A<E> s(int i11, Object... objArr) {
        if (i11 == 0) {
            return W.f59047j;
        }
        if (i11 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new c0(obj);
        }
        int n11 = n(i11);
        Object[] objArr2 = new Object[n11];
        int i12 = n11 - 1;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            Object obj2 = objArr[i15];
            if (obj2 == null) {
                throw new NullPointerException(Ej.b.a(i15, "at index "));
            }
            int hashCode = obj2.hashCode();
            int a11 = C5877v.a(hashCode);
            while (true) {
                int i16 = a11 & i12;
                Object obj3 = objArr2[i16];
                if (obj3 == null) {
                    objArr[i14] = obj2;
                    objArr2[i16] = obj2;
                    i13 += hashCode;
                    i14++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                a11++;
            }
        }
        Arrays.fill(objArr, i14, i11, (Object) null);
        if (i14 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new c0(obj4);
        }
        if (n(i14) < n11 / 2) {
            return s(i14, objArr);
        }
        int length = objArr.length;
        if (i14 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i14);
        }
        return new W(objArr, i13, objArr2, i12, i14);
    }

    public static <E> A<E> u(Collection<? extends E> collection) {
        if ((collection instanceof A) && !(collection instanceof SortedSet)) {
            A<E> a11 = (A) collection;
            if (!a11.h()) {
                return a11;
            }
        }
        Object[] array = collection.toArray();
        return s(array.length, array);
    }

    public static <E> A<E> v(E[] eArr) {
        int length = eArr.length;
        return length != 0 ? length != 1 ? s(eArr.length, (Object[]) eArr.clone()) : new c0(eArr[0]) : W.f59047j;
    }

    AbstractC5880y<E> A() {
        Object[] array = toArray();
        int i11 = AbstractC5880y.f59142c;
        return AbstractC5880y.l(array.length, array);
    }

    @Override // com.google.common.collect.AbstractC5878w
    public AbstractC5880y<E> a() {
        AbstractC5880y<E> abstractC5880y = this.f59007b;
        if (abstractC5880y != null) {
            return abstractC5880y;
        }
        AbstractC5880y<E> A11 = A();
        this.f59007b = A11;
        return A11;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof A) && (this instanceof W)) {
            A a11 = (A) obj;
            a11.getClass();
            if ((a11 instanceof W) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return b0.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return b0.c(this);
    }

    @Override // com.google.common.collect.AbstractC5878w, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // com.google.common.collect.AbstractC5878w
    Object writeReplace() {
        return new b(toArray());
    }
}
