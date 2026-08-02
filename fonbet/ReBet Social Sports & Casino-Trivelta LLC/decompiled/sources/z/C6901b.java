package z;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.jvm.internal.markers.KMutableSet;
import org.jetbrains.annotations.NotNull;

/* renamed from: z.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6901b implements Collection, Set, KMutableCollection, KMutableSet {

    /* renamed from: a, reason: collision with root package name */
    public int f68446a;

    @NotNull
    private Object[] array;

    @NotNull
    private int[] hashes;

    /* renamed from: z.b$a */
    public final class a extends AbstractC6906g {
        public a() {
            super(C6901b.this.f());
        }

        @Override // z.AbstractC6906g
        public Object a(int i10) {
            return C6901b.this.k(i10);
        }

        @Override // z.AbstractC6906g
        public void b(int i10) {
            C6901b.this.g(i10);
        }
    }

    public C6901b() {
        this(0, 1, null);
    }

    public final void a(int i10) {
        int f10 = f();
        if (c().length < i10) {
            int[] c10 = c();
            Object[] b10 = b();
            AbstractC6903d.a(this, i10);
            if (f() > 0) {
                ArraysKt.copyInto$default(c10, c(), 0, 0, f(), 6, (Object) null);
                ArraysKt.copyInto$default(b10, b(), 0, 0, f(), 6, (Object) null);
            }
        }
        if (f() != f10) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i10;
        int c10;
        int f10 = f();
        if (obj == null) {
            c10 = AbstractC6903d.d(this);
            i10 = 0;
        } else {
            int hashCode = obj.hashCode();
            i10 = hashCode;
            c10 = AbstractC6903d.c(this, obj, hashCode);
        }
        if (c10 >= 0) {
            return false;
        }
        int i11 = ~c10;
        if (f10 >= c().length) {
            int i12 = 8;
            if (f10 >= 8) {
                i12 = (f10 >> 1) + f10;
            } else if (f10 < 4) {
                i12 = 4;
            }
            int[] c11 = c();
            Object[] b10 = b();
            AbstractC6903d.a(this, i12);
            if (f10 != f()) {
                throw new ConcurrentModificationException();
            }
            if (!(c().length == 0)) {
                ArraysKt.copyInto$default(c11, c(), 0, 0, c11.length, 6, (Object) null);
                ArraysKt.copyInto$default(b10, b(), 0, 0, b10.length, 6, (Object) null);
            }
        }
        if (i11 < f10) {
            int i13 = i11 + 1;
            ArraysKt.copyInto(c(), c(), i13, i11, f10);
            ArraysKt.copyInto(b(), b(), i13, i11, f10);
        }
        if (f10 != f() || i11 >= c().length) {
            throw new ConcurrentModificationException();
        }
        c()[i11] = i10;
        b()[i11] = obj;
        j(f() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        a(f() + elements.size());
        Iterator it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= add(it.next());
        }
        return z10;
    }

    public final Object[] b() {
        return this.array;
    }

    public final int[] c() {
        return this.hashes;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (f() != 0) {
            i(A.a.EMPTY_INTS);
            h(A.a.EMPTY_OBJECTS);
            j(0);
        }
        if (f() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int e() {
        return this.f68446a;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || size() != ((Set) obj).size()) {
            return false;
        }
        try {
            int f10 = f();
            for (int i10 = 0; i10 < f10; i10++) {
                if (!((Set) obj).contains(k(i10))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final int f() {
        return this.f68446a;
    }

    public final Object g(int i10) {
        int i11;
        Object[] objArr;
        int f10 = f();
        Object obj = b()[i10];
        if (f10 <= 1) {
            clear();
            return obj;
        }
        int i12 = f10 - 1;
        if (c().length <= 8 || f() >= c().length / 3) {
            if (i10 < i12) {
                int i13 = i10 + 1;
                ArraysKt.copyInto(c(), c(), i10, i13, f10);
                ArraysKt.copyInto(b(), b(), i10, i13, f10);
            }
            b()[i12] = null;
        } else {
            int f11 = f() > 8 ? f() + (f() >> 1) : 8;
            int[] c10 = c();
            Object[] b10 = b();
            AbstractC6903d.a(this, f11);
            if (i10 > 0) {
                ArraysKt.copyInto$default(c10, c(), 0, 0, i10, 6, (Object) null);
                objArr = b10;
                ArraysKt.copyInto$default(objArr, b(), 0, 0, i10, 6, (Object) null);
                i11 = i10;
            } else {
                i11 = i10;
                objArr = b10;
            }
            if (i11 < i12) {
                int i14 = i11 + 1;
                ArraysKt.copyInto(c10, c(), i11, i14, f10);
                ArraysKt.copyInto(objArr, b(), i11, i14, f10);
            }
        }
        if (f10 != f()) {
            throw new ConcurrentModificationException();
        }
        j(i12);
        return obj;
    }

    public final void h(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.array = objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] c10 = c();
        int f10 = f();
        int i10 = 0;
        for (int i11 = 0; i11 < f10; i11++) {
            i10 += c10[i11];
        }
        return i10;
    }

    public final void i(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.hashes = iArr;
    }

    public final int indexOf(Object obj) {
        return obj == null ? AbstractC6903d.d(this) : AbstractC6903d.c(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return f() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new a();
    }

    public final void j(int i10) {
        this.f68446a = i10;
    }

    public final Object k(int i10) {
        return b()[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        g(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= remove(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z10 = false;
        for (int f10 = f() - 1; -1 < f10; f10--) {
            if (!CollectionsKt.contains(elements, b()[f10])) {
                g(f10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return e();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return ArraysKt.copyOfRange(this.array, 0, this.f68446a);
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(f() * 14);
        sb2.append('{');
        int f10 = f();
        for (int i10 = 0; i10 < f10; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object k10 = k(i10);
            if (k10 != this) {
                sb2.append(k10);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public C6901b(int i10) {
        this.hashes = A.a.EMPTY_INTS;
        this.array = A.a.EMPTY_OBJECTS;
        if (i10 > 0) {
            AbstractC6903d.a(this, i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        Object[] result = AbstractC6902c.a(array, this.f68446a);
        ArraysKt.copyInto(this.array, result, 0, 0, this.f68446a);
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public /* synthetic */ C6901b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
