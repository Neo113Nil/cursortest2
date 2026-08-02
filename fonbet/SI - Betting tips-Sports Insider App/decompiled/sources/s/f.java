package s;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.jvm.internal.markers.KMutableSet;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f implements Collection, Set, KMutableCollection, KMutableSet {

    /* renamed from: a, reason: collision with root package name */
    public int[] f22553a = t.a.f23723a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f22554b = t.a.f23724b;

    /* renamed from: c, reason: collision with root package name */
    public int f22555c;

    public f(int i5) {
        if (i5 > 0) {
            k.b(this, i5);
        }
    }

    public final Object a(int i5) {
        int i10 = this.f22555c;
        Object[] objArr = this.f22554b;
        Object obj = objArr[i5];
        if (i10 <= 1) {
            clear();
            return obj;
        }
        int i11 = i10 - 1;
        int[] iArr = this.f22553a;
        if (iArr.length <= 8 || i10 >= iArr.length / 3) {
            if (i5 < i11) {
                int i12 = i5 + 1;
                kotlin.collections.o.e(i5, i12, iArr, iArr, i10);
                Object[] objArr2 = this.f22554b;
                kotlin.collections.o.d(i5, i12, i10, objArr2, objArr2);
            }
            this.f22554b[i11] = null;
        } else {
            k.b(this, i10 > 8 ? i10 + (i10 >> 1) : 8);
            if (i5 > 0) {
                kotlin.collections.o.h(i5, 6, iArr, this.f22553a);
                kotlin.collections.o.g(0, i5, 6, objArr, this.f22554b);
            }
            if (i5 < i11) {
                int i13 = i5 + 1;
                kotlin.collections.o.e(i5, i13, iArr, this.f22553a, i10);
                kotlin.collections.o.d(i5, i13, i10, objArr, this.f22554b);
            }
        }
        if (i10 != this.f22555c) {
            throw new ConcurrentModificationException();
        }
        this.f22555c = i11;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i5;
        int c2;
        int i10 = this.f22555c;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            c2 = k.c(this, null, 0);
            i5 = 0;
        } else {
            int hashCode = obj.hashCode();
            i5 = hashCode;
            c2 = k.c(this, obj, hashCode);
        }
        if (c2 >= 0) {
            return false;
        }
        int i11 = ~c2;
        int[] iArr = this.f22553a;
        if (i10 >= iArr.length) {
            int i12 = 8;
            if (i10 >= 8) {
                i12 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i12 = 4;
            }
            Object[] objArr = this.f22554b;
            k.b(this, i12);
            if (i10 != this.f22555c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f22553a;
            if (iArr2.length != 0) {
                kotlin.collections.o.h(iArr.length, 6, iArr, iArr2);
                kotlin.collections.o.g(0, objArr.length, 6, objArr, this.f22554b);
            }
        }
        if (i11 < i10) {
            int[] iArr3 = this.f22553a;
            int i13 = i11 + 1;
            kotlin.collections.o.e(i13, i11, iArr3, iArr3, i10);
            Object[] objArr2 = this.f22554b;
            kotlin.collections.o.d(i13, i11, i10, objArr2, objArr2);
        }
        int i14 = this.f22555c;
        if (i10 == i14) {
            int[] iArr4 = this.f22553a;
            if (i11 < iArr4.length) {
                iArr4[i11] = i5;
                this.f22554b[i11] = obj;
                this.f22555c = i14 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = elements.size() + this.f22555c;
        int i5 = this.f22555c;
        int[] iArr = this.f22553a;
        boolean z5 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f22554b;
            k.b(this, size);
            int i10 = this.f22555c;
            if (i10 > 0) {
                kotlin.collections.o.h(i10, 6, iArr, this.f22553a);
                kotlin.collections.o.g(0, this.f22555c, 6, objArr, this.f22554b);
            }
        }
        if (this.f22555c != i5) {
            throw new ConcurrentModificationException();
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            z5 |= add(it.next());
        }
        return z5;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f22555c != 0) {
            int[] iArr = t.a.f23723a;
            Intrinsics.checkNotNullParameter(iArr, "<set-?>");
            this.f22553a = iArr;
            Object[] objArr = t.a.f23724b;
            Intrinsics.checkNotNullParameter(objArr, "<set-?>");
            this.f22554b = objArr;
            this.f22555c = 0;
        }
        if (this.f22555c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int c2;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            c2 = k.c(this, null, 0);
        } else {
            c2 = k.c(this, obj, obj.hashCode());
        }
        return c2 >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f22555c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i5 = this.f22555c;
            for (int i10 = 0; i10 < i5; i10++) {
                if (!((Set) obj).contains(this.f22554b[i10])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f22553a;
        int i5 = this.f22555c;
        int i10 = 0;
        for (int i11 = 0; i11 < i5; i11++) {
            i10 += iArr[i11];
        }
        return i10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f22555c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int c2;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            c2 = k.c(this, null, 0);
        } else {
            c2 = k.c(this, obj, obj.hashCode());
        }
        if (c2 < 0) {
            return false;
        }
        a(c2);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            z5 |= remove(it.next());
        }
        return z5;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z5 = false;
        for (int i5 = this.f22555c - 1; -1 < i5; i5--) {
            if (!CollectionsKt.A(elements, this.f22554b[i5])) {
                a(i5);
                z5 = true;
            }
        }
        return z5;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f22555c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return kotlin.collections.o.j(0, this.f22555c, this.f22554b);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f22555c * 14);
        sb2.append('{');
        int i5 = this.f22555c;
        for (int i10 = 0; i10 < i5; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f22554b[i10];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i5 = this.f22555c;
        if (array.length < i5) {
            array = (Object[]) Array.newInstance(array.getClass().getComponentType(), i5);
        } else if (array.length > i5) {
            array[i5] = null;
        }
        kotlin.collections.o.d(0, 0, this.f22555c, this.f22554b, array);
        Intrinsics.checkNotNull(array);
        return array;
    }
}
