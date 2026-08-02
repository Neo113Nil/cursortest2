package com.google.common.collect;

import com.google.common.collect.AbstractC3443x;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.common.collect.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3445z extends AbstractC3443x implements List, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public static final n0 f36865a = new b(Z.f36746c, 0);
    private static final long serialVersionUID = -889275714;

    /* renamed from: com.google.common.collect.z$a */
    public static final class a extends AbstractC3443x.a {
        public a() {
            this(4);
        }

        @Override // com.google.common.collect.AbstractC3443x.b
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            super.e(obj);
            return this;
        }

        public a j(Object... objArr) {
            super.f(objArr);
            return this;
        }

        public a k(Iterable iterable) {
            super.b(iterable);
            return this;
        }

        public a l(Iterator it) {
            super.c(it);
            return this;
        }

        public AbstractC3445z m() {
            this.f36862b = true;
            return AbstractC3445z.j(this.contents, this.f36861a);
        }

        public AbstractC3445z n(Comparator comparator) {
            this.f36862b = true;
            Arrays.sort(this.contents, 0, this.f36861a, comparator);
            return AbstractC3445z.j(this.contents, this.f36861a);
        }

        public a(int i10) {
            super(i10);
        }
    }

    /* renamed from: com.google.common.collect.z$b */
    public static class b extends AbstractC3421a {

        /* renamed from: c, reason: collision with root package name */
        public final AbstractC3445z f36866c;

        public b(AbstractC3445z abstractC3445z, int i10) {
            super(abstractC3445z.size(), i10);
            this.f36866c = abstractC3445z;
        }

        @Override // com.google.common.collect.AbstractC3421a
        public Object a(int i10) {
            return this.f36866c.get(i10);
        }
    }

    /* renamed from: com.google.common.collect.z$c */
    public static class c extends AbstractC3445z {

        /* renamed from: b, reason: collision with root package name */
        public final transient AbstractC3445z f36867b;

        public c(AbstractC3445z abstractC3445z) {
            this.f36867b = abstractC3445z;
        }

        @Override // com.google.common.collect.AbstractC3445z
        public AbstractC3445z D() {
            return this.f36867b;
        }

        @Override // com.google.common.collect.AbstractC3445z, java.util.List
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public AbstractC3445z subList(int i10, int i11) {
            Ra.n.o(i10, i11, size());
            return this.f36867b.subList(I(i11), I(i10)).D();
        }

        public final int H(int i10) {
            return (size() - 1) - i10;
        }

        public final int I(int i10) {
            return size() - i10;
        }

        @Override // com.google.common.collect.AbstractC3445z, com.google.common.collect.AbstractC3443x, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f36867b.contains(obj);
        }

        @Override // com.google.common.collect.AbstractC3443x
        public boolean g() {
            return this.f36867b.g();
        }

        @Override // java.util.List
        public Object get(int i10) {
            Ra.n.i(i10, size());
            return this.f36867b.get(H(i10));
        }

        @Override // com.google.common.collect.AbstractC3445z, java.util.List
        public int indexOf(Object obj) {
            int lastIndexOf = this.f36867b.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return H(lastIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.AbstractC3445z, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.AbstractC3445z, java.util.List
        public int lastIndexOf(Object obj) {
            int indexOf = this.f36867b.indexOf(obj);
            if (indexOf >= 0) {
                return H(indexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.AbstractC3445z, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f36867b.size();
        }

        @Override // com.google.common.collect.AbstractC3445z, com.google.common.collect.AbstractC3443x
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.AbstractC3445z, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }
    }

    /* renamed from: com.google.common.collect.z$d */
    public static class d implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        public d(Object[] objArr) {
            this.elements = objArr;
        }

        public Object readResolve() {
            return AbstractC3445z.q(this.elements);
        }
    }

    /* renamed from: com.google.common.collect.z$e */
    public class e extends AbstractC3445z {

        /* renamed from: b, reason: collision with root package name */
        public final transient int f36868b;

        /* renamed from: c, reason: collision with root package name */
        public final transient int f36869c;

        public e(int i10, int i11) {
            this.f36868b = i10;
            this.f36869c = i11;
        }

        @Override // com.google.common.collect.AbstractC3445z, java.util.List
        /* renamed from: F */
        public AbstractC3445z subList(int i10, int i11) {
            Ra.n.o(i10, i11, this.f36869c);
            AbstractC3445z abstractC3445z = AbstractC3445z.this;
            int i12 = this.f36868b;
            return abstractC3445z.subList(i10 + i12, i11 + i12);
        }

        @Override // com.google.common.collect.AbstractC3443x
        public Object[] c() {
            return AbstractC3445z.this.c();
        }

        @Override // com.google.common.collect.AbstractC3443x
        public int e() {
            return AbstractC3445z.this.f() + this.f36868b + this.f36869c;
        }

        @Override // com.google.common.collect.AbstractC3443x
        public int f() {
            return AbstractC3445z.this.f() + this.f36868b;
        }

        @Override // com.google.common.collect.AbstractC3443x
        public boolean g() {
            return true;
        }

        @Override // java.util.List
        public Object get(int i10) {
            Ra.n.i(i10, this.f36869c);
            return AbstractC3445z.this.get(i10 + this.f36868b);
        }

        @Override // com.google.common.collect.AbstractC3445z, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.AbstractC3445z, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f36869c;
        }

        @Override // com.google.common.collect.AbstractC3445z, com.google.common.collect.AbstractC3443x
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.AbstractC3445z, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }
    }

    public static AbstractC3445z A(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return m(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public static AbstractC3445z B(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return m(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    public static AbstractC3445z C(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        Ra.n.e(objArr.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr2 = new Object[objArr.length + 12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        return m(objArr2);
    }

    public static AbstractC3445z E(Comparator comparator, Iterable iterable) {
        Ra.n.k(comparator);
        Object[] n10 = I.n(iterable);
        V.b(n10);
        Arrays.sort(n10, comparator);
        return i(n10);
    }

    public static AbstractC3445z i(Object[] objArr) {
        return j(objArr, objArr.length);
    }

    public static AbstractC3445z j(Object[] objArr, int i10) {
        return i10 == 0 ? t() : new Z(objArr, i10);
    }

    public static a k() {
        return new a();
    }

    public static a l(int i10) {
        AbstractC3431k.b(i10, "expectedSize");
        return new a(i10);
    }

    public static AbstractC3445z m(Object... objArr) {
        return i(V.b(objArr));
    }

    public static AbstractC3445z n(Iterable iterable) {
        Ra.n.k(iterable);
        return iterable instanceof Collection ? o((Collection) iterable) : p(iterable.iterator());
    }

    public static AbstractC3445z o(Collection collection) {
        if (!(collection instanceof AbstractC3443x)) {
            return m(collection.toArray());
        }
        AbstractC3445z a10 = ((AbstractC3443x) collection).a();
        return a10.g() ? i(a10.toArray()) : a10;
    }

    public static AbstractC3445z p(Iterator it) {
        if (!it.hasNext()) {
            return t();
        }
        Object next = it.next();
        return !it.hasNext() ? u(next) : new a().a(next).l(it).m();
    }

    public static AbstractC3445z q(Object[] objArr) {
        return objArr.length == 0 ? t() : m((Object[]) objArr.clone());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static AbstractC3445z t() {
        return Z.f36746c;
    }

    public static AbstractC3445z u(Object obj) {
        return m(obj);
    }

    public static AbstractC3445z v(Object obj, Object obj2) {
        return m(obj, obj2);
    }

    public static AbstractC3445z w(Object obj, Object obj2, Object obj3) {
        return m(obj, obj2, obj3);
    }

    public static AbstractC3445z x(Object obj, Object obj2, Object obj3, Object obj4) {
        return m(obj, obj2, obj3, obj4);
    }

    public static AbstractC3445z y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m(obj, obj2, obj3, obj4, obj5);
    }

    public static AbstractC3445z z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return m(obj, obj2, obj3, obj4, obj5, obj6);
    }

    public AbstractC3445z D() {
        return size() <= 1 ? this : new c(this);
    }

    @Override // java.util.List
    /* renamed from: F */
    public AbstractC3445z subList(int i10, int i11) {
        Ra.n.o(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? t() : G(i10, i11);
    }

    public AbstractC3445z G(int i10, int i11) {
        return new e(i10, i11 - i10);
    }

    @Override // com.google.common.collect.AbstractC3443x
    public final AbstractC3445z a() {
        return this;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC3443x
    public int b(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // com.google.common.collect.AbstractC3443x, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return L.c(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public m0 iterator() {
        return listIterator();
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return L.d(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return L.f(this, obj);
    }

    @Override // java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public n0 listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public n0 listIterator(int i10) {
        Ra.n.m(i10, size());
        return isEmpty() ? f36865a : new b(this, i10);
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC3443x
    public Object writeReplace() {
        return new d(toArray());
    }
}
