package com.google.common.collect;

import Bl0.k0;
import com.google.common.collect.AbstractC5878w;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.common.collect.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5880y<E> extends AbstractC5878w<E> implements List<E>, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    private static final g0<Object> f59141b = new b(0, U.f59030f);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f59142c = 0;

    /* renamed from: com.google.common.collect.y$a */
    public static final class a<E> extends AbstractC5878w.a<E> {
        public a() {
            super(4);
        }

        @Override // com.google.common.collect.AbstractC5878w.b
        public final AbstractC5878w.b a(Object obj) {
            c(obj);
            return this;
        }

        public final AbstractC5880y<E> j() {
            this.f59138c = true;
            return AbstractC5880y.l(this.f59137b, this.f59136a);
        }
    }

    /* renamed from: com.google.common.collect.y$b */
    static class b<E> extends AbstractC5857a<E> {

        /* renamed from: c, reason: collision with root package name */
        private final AbstractC5880y<E> f59143c;

        b(int i11, AbstractC5880y abstractC5880y) {
            super(abstractC5880y.size(), i11);
            this.f59143c = abstractC5880y;
        }

        @Override // com.google.common.collect.AbstractC5857a
        protected final E a(int i11) {
            return this.f59143c.get(i11);
        }
    }

    /* renamed from: com.google.common.collect.y$c */
    /* loaded from: classes9.dex */
    static class c implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        final Object[] f59144a;

        c(Object[] objArr) {
            this.f59144a = objArr;
        }

        Object readResolve() {
            return AbstractC5880y.s(this.f59144a);
        }
    }

    /* renamed from: com.google.common.collect.y$d */
    /* loaded from: classes9.dex */
    class d extends AbstractC5880y<E> {

        /* renamed from: d, reason: collision with root package name */
        final transient int f59145d;

        /* renamed from: e, reason: collision with root package name */
        final transient int f59146e;

        d(int i11, int i12) {
            this.f59145d = i11;
            this.f59146e = i12;
        }

        @Override // com.google.common.collect.AbstractC5880y, java.util.List
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public final AbstractC5880y<E> subList(int i11, int i12) {
            k0.i(i11, i12, this.f59146e);
            int i13 = this.f59145d;
            return AbstractC5880y.this.subList(i11 + i13, i12 + i13);
        }

        @Override // com.google.common.collect.AbstractC5878w
        final Object[] e() {
            return AbstractC5880y.this.e();
        }

        @Override // com.google.common.collect.AbstractC5878w
        final int f() {
            return AbstractC5880y.this.g() + this.f59145d + this.f59146e;
        }

        @Override // com.google.common.collect.AbstractC5878w
        final int g() {
            return AbstractC5880y.this.g() + this.f59145d;
        }

        @Override // java.util.List
        public final E get(int i11) {
            k0.f(i11, this.f59146e);
            return AbstractC5880y.this.get(i11 + this.f59145d);
        }

        @Override // com.google.common.collect.AbstractC5878w
        final boolean h() {
            return true;
        }

        @Override // com.google.common.collect.AbstractC5880y, com.google.common.collect.AbstractC5878w, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // com.google.common.collect.AbstractC5880y, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f59146e;
        }

        @Override // com.google.common.collect.AbstractC5880y, com.google.common.collect.AbstractC5878w
        Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.AbstractC5880y, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i11) {
            return listIterator(i11);
        }
    }

    AbstractC5880y() {
    }

    public static AbstractC5880y A(Long l11, Long l12, Long l13, Long l14, Long l15) {
        Object[] objArr = {l11, l12, l13, l14, l15};
        S.a(5, objArr);
        return l(5, objArr);
    }

    public static <E> AbstractC5880y<E> B(E e11) {
        Object[] objArr = {e11};
        S.a(1, objArr);
        return l(1, objArr);
    }

    public static <E> AbstractC5880y<E> C(E e11, E e12) {
        Object[] objArr = {e11, e12};
        S.a(2, objArr);
        return l(2, objArr);
    }

    @SafeVarargs
    public static AbstractC5880y D(Object... objArr) {
        k0.d("the total number of elements must fit in an int", objArr.length <= 2147483635);
        int length = objArr.length + 12;
        Object[] objArr2 = new Object[length];
        objArr2[0] = "Blues";
        objArr2[1] = "Classic Rock";
        objArr2[2] = "Country";
        objArr2[3] = "Dance";
        objArr2[4] = "Disco";
        objArr2[5] = "Funk";
        objArr2[6] = "Grunge";
        objArr2[7] = "Hip-Hop";
        objArr2[8] = "Jazz";
        objArr2[9] = "Metal";
        objArr2[10] = "New Age";
        objArr2[11] = "Oldies";
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        S.a(length, objArr2);
        return l(length, objArr2);
    }

    public static AbstractC5880y E() {
        Object[] objArr = {2, 5, 6};
        S.a(3, objArr);
        return l(3, objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AbstractC5880y F(Comparator comparator, List list) {
        List list2;
        comparator.getClass();
        if (list instanceof Collection) {
            list2 = list;
        } else {
            Iterator it = list.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            list2 = arrayList;
        }
        Object[] array = list2.toArray();
        S.a(array.length, array);
        Arrays.sort(array, comparator);
        return l(array.length, array);
    }

    static AbstractC5880y l(int i11, Object[] objArr) {
        return i11 == 0 ? U.f59030f : new U(objArr, i11);
    }

    public static <E> a<E> m(int i11) {
        C5866j.b(i11, "expectedSize");
        return new a<>(i11);
    }

    public static <E> AbstractC5880y<E> n(Collection<? extends E> collection) {
        if (!(collection instanceof AbstractC5878w)) {
            Object[] array = collection.toArray();
            S.a(array.length, array);
            return l(array.length, array);
        }
        AbstractC5880y<E> a11 = ((AbstractC5878w) collection).a();
        if (!a11.h()) {
            return a11;
        }
        Object[] array2 = a11.toArray();
        return l(array2.length, array2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E> AbstractC5880y<E> s(E[] eArr) {
        if (eArr.length == 0) {
            return (AbstractC5880y<E>) U.f59030f;
        }
        Object[] objArr = (Object[]) eArr.clone();
        S.a(objArr.length, objArr);
        return l(objArr.length, objArr);
    }

    public static <E> AbstractC5880y<E> v() {
        return (AbstractC5880y<E>) U.f59030f;
    }

    @Override // java.util.List
    /* renamed from: G */
    public AbstractC5880y<E> subList(int i11, int i12) {
        k0.i(i11, i12, size());
        int i13 = i12 - i11;
        return i13 == size() ? this : i13 == 0 ? (AbstractC5880y<E>) U.f59030f : new d(i11, i13);
    }

    @Override // com.google.common.collect.AbstractC5878w
    @Deprecated
    public final AbstractC5880y<E> a() {
        return this;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i11, E e11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i11, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC5878w
    int b(int i11, Object[] objArr) {
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            objArr[i11 + i12] = get(i12);
        }
        return i11 + size;
    }

    @Override // com.google.common.collect.AbstractC5878w, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator<E> it = iterator();
                        Iterator<E> it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && O7.h.b(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i11 = 0; i11 < size; i11++) {
                        if (O7.h.b(get(i11), list.get(i11))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i11 = 1;
        for (int i12 = 0; i12 < size; i12++) {
            i11 = ~(~(get(i12).hashCode() + (i11 * 31)));
        }
        return i11;
    }

    @Override // com.google.common.collect.AbstractC5878w
    /* renamed from: i */
    public final f0<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (obj.equals(get(i11))) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.common.collect.AbstractC5878w, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i11, E e11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final g0<E> listIterator(int i11) {
        k0.h(i11, size());
        return isEmpty() ? (g0<E>) f59141b : new b(i11, this);
    }

    @Override // com.google.common.collect.AbstractC5878w
    Object writeReplace() {
        return new c(toArray());
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }
}
