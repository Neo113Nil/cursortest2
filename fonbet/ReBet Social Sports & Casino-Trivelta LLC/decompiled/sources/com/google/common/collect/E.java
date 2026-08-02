package com.google.common.collect;

import com.google.common.collect.AbstractC3443x;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public abstract class E extends AbstractC3443x implements Set {
    private static final long serialVersionUID = 912559;

    /* renamed from: a, reason: collision with root package name */
    public transient AbstractC3445z f36694a;

    public static class a extends AbstractC3443x.a {

        /* renamed from: c, reason: collision with root package name */
        public int f36695c;
        Object[] hashTable;

        public a() {
            super(4);
        }

        @Override // com.google.common.collect.AbstractC3443x.b
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            Ra.n.k(obj);
            if (this.hashTable != null && E.k(this.f36861a) <= this.hashTable.length) {
                l(obj);
                return this;
            }
            this.hashTable = null;
            super.e(obj);
            return this;
        }

        public a j(Object... objArr) {
            if (this.hashTable == null) {
                super.f(objArr);
                return this;
            }
            for (Object obj : objArr) {
                a(obj);
            }
            return this;
        }

        public a k(Iterable iterable) {
            Ra.n.k(iterable);
            if (this.hashTable == null) {
                super.b(iterable);
                return this;
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        public final void l(Object obj) {
            Objects.requireNonNull(this.hashTable);
            int length = this.hashTable.length - 1;
            int hashCode = obj.hashCode();
            int b10 = AbstractC3441v.b(hashCode);
            while (true) {
                int i10 = b10 & length;
                Object[] objArr = this.hashTable;
                Object obj2 = objArr[i10];
                if (obj2 == null) {
                    objArr[i10] = obj;
                    this.f36695c += hashCode;
                    super.e(obj);
                    return;
                } else if (obj2.equals(obj)) {
                    return;
                } else {
                    b10 = i10 + 1;
                }
            }
        }

        public E m() {
            E l10;
            int i10 = this.f36861a;
            if (i10 == 0) {
                return E.q();
            }
            if (i10 == 1) {
                Object obj = this.contents[0];
                Objects.requireNonNull(obj);
                return E.r(obj);
            }
            if (this.hashTable == null || E.k(i10) != this.hashTable.length) {
                l10 = E.l(this.f36861a, this.contents);
                this.f36861a = l10.size();
            } else {
                Object[] copyOf = E.w(this.f36861a, this.contents.length) ? Arrays.copyOf(this.contents, this.f36861a) : this.contents;
                l10 = new b0(copyOf, this.f36695c, this.hashTable, r5.length - 1, this.f36861a);
            }
            this.f36862b = true;
            this.hashTable = null;
            return l10;
        }
    }

    public static class b implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        public b(Object[] objArr) {
            this.elements = objArr;
        }

        public Object readResolve() {
            return E.n(this.elements);
        }
    }

    public static int k(int i10) {
        int max = Math.max(i10, 2);
        if (max >= 751619276) {
            Ra.n.e(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    public static E l(int i10, Object... objArr) {
        if (i10 == 0) {
            return q();
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return r(obj);
        }
        int k10 = k(i10);
        Object[] objArr2 = new Object[k10];
        int i11 = k10 - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object a10 = V.a(objArr[i14], i14);
            int hashCode = a10.hashCode();
            int b10 = AbstractC3441v.b(hashCode);
            while (true) {
                int i15 = b10 & i11;
                Object obj2 = objArr2[i15];
                if (obj2 == null) {
                    objArr[i13] = a10;
                    objArr2[i15] = a10;
                    i12 += hashCode;
                    i13++;
                    break;
                }
                if (obj2.equals(a10)) {
                    break;
                }
                b10++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new h0(obj3);
        }
        if (k(i13) < k10 / 2) {
            return l(i13, objArr);
        }
        if (w(i13, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new b0(objArr, i12, objArr2, i11, i13);
    }

    public static E m(Collection collection) {
        if ((collection instanceof E) && !(collection instanceof SortedSet)) {
            E e10 = (E) collection;
            if (!e10.g()) {
                return e10;
            }
        }
        Object[] array = collection.toArray();
        return l(array.length, array);
    }

    public static E n(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? l(objArr.length, (Object[]) objArr.clone()) : r(objArr[0]) : q();
    }

    public static E q() {
        return b0.f36767e;
    }

    public static E r(Object obj) {
        return new h0(obj);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static E s(Object obj, Object obj2) {
        return l(2, obj, obj2);
    }

    public static E t(Object obj, Object obj2, Object obj3) {
        return l(3, obj, obj2, obj3);
    }

    public static E u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return l(5, obj, obj2, obj3, obj4, obj5);
    }

    public static E v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Ra.n.e(objArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return l(length, objArr2);
    }

    public static boolean w(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    @Override // com.google.common.collect.AbstractC3443x
    public AbstractC3445z a() {
        AbstractC3445z abstractC3445z = this.f36694a;
        if (abstractC3445z != null) {
            return abstractC3445z;
        }
        AbstractC3445z o10 = o();
        this.f36694a = o10;
        return o10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof E) && p() && ((E) obj).p() && hashCode() != obj.hashCode()) {
            return false;
        }
        return g0.a(this, obj);
    }

    @Override // com.google.common.collect.AbstractC3443x
    /* renamed from: h */
    public abstract m0 iterator();

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return g0.d(this);
    }

    public AbstractC3445z o() {
        return AbstractC3445z.i(toArray());
    }

    public boolean p() {
        return false;
    }

    @Override // com.google.common.collect.AbstractC3443x
    public Object writeReplace() {
        return new b(toArray());
    }
}
