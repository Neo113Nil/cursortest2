package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.collections.AbstractC7696c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
final class d0<T> extends AbstractC7696c<T> implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object[] f71730b;

    /* renamed from: c, reason: collision with root package name */
    private final int f71731c;

    /* renamed from: d, reason: collision with root package name */
    private int f71732d;

    /* renamed from: e, reason: collision with root package name */
    private int f71733e;

    public static final class a extends AbstractC7695b<T> {

        /* renamed from: c, reason: collision with root package name */
        private int f71734c;

        /* renamed from: d, reason: collision with root package name */
        private int f71735d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d0<T> f71736e;

        a(d0<T> d0Var) {
            this.f71736e = d0Var;
            this.f71734c = d0Var.getSize();
            this.f71735d = ((d0) d0Var).f71732d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.collections.AbstractC7695b
        protected final void b() {
            if (this.f71734c == 0) {
                c();
                return;
            }
            d0<T> d0Var = this.f71736e;
            e(((d0) d0Var).f71730b[this.f71735d]);
            this.f71735d = (this.f71735d + 1) % ((d0) d0Var).f71731c;
            this.f71734c--;
        }
    }

    public d0(@NotNull Object[] buffer, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f71730b = buffer;
        if (i11 < 0) {
            throw new IllegalArgumentException(Ej.b.a(i11, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i11 <= buffer.length) {
            this.f71731c = buffer.length;
            this.f71733e = i11;
        } else {
            StringBuilder f7 = P4.f.f(i11, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            f7.append(buffer.length);
            throw new IllegalArgumentException(f7.toString().toString());
        }
    }

    @Override // java.util.List
    public final T get(int i11) {
        AbstractC7696c.Companion companion = AbstractC7696c.INSTANCE;
        int i12 = this.f71733e;
        companion.getClass();
        AbstractC7696c.Companion.a(i11, i12);
        return (T) this.f71730b[(this.f71732d + i11) % this.f71731c];
    }

    @Override // kotlin.collections.AbstractC7694a
    public final int getSize() {
        return this.f71733e;
    }

    public final void i(T t2) {
        if (m()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.f71730b[(this.f71732d + getSize()) % this.f71731c] = t2;
        this.f71733e = getSize() + 1;
    }

    @Override // kotlin.collections.AbstractC7696c, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public final Iterator<T> iterator() {
        return new a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final d0<T> l(int i11) {
        Object[] array;
        int i12 = this.f71731c;
        int i13 = i12 + (i12 >> 1) + 1;
        if (i13 <= i11) {
            i11 = i13;
        }
        if (this.f71732d == 0) {
            array = Arrays.copyOf(this.f71730b, i11);
            Intrinsics.checkNotNullExpressionValue(array, "copyOf(...)");
        } else {
            array = toArray(new Object[i11]);
        }
        return new d0<>(array, getSize());
    }

    public final boolean m() {
        return getSize() == this.f71731c;
    }

    public final void n(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException(Ej.b.a(i11, "n shouldn't be negative but it is ").toString());
        }
        if (i11 > this.f71733e) {
            StringBuilder f7 = P4.f.f(i11, "n shouldn't be greater than the buffer size: n = ", ", size = ");
            f7.append(this.f71733e);
            throw new IllegalArgumentException(f7.toString().toString());
        }
        if (i11 > 0) {
            int i12 = this.f71732d;
            int i13 = this.f71731c;
            int i14 = (i12 + i11) % i13;
            Object[] objArr = this.f71730b;
            if (i12 > i14) {
                C7705l.x(objArr, null, i12, i13);
                Intrinsics.checkNotNullParameter(objArr, "<this>");
                Arrays.fill(objArr, 0, i14, (Object) null);
            } else {
                C7705l.x(objArr, null, i12, i14);
            }
            this.f71732d = i14;
            this.f71733e -= i11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractC7694a, java.util.Collection
    @NotNull
    public final Object[] toArray() {
        return toArray(new Object[getSize()]);
    }

    @Override // kotlin.collections.AbstractC7694a, java.util.Collection
    @NotNull
    public final <T> T[] toArray(@NotNull T[] array) {
        Object[] objArr;
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        int i11 = this.f71733e;
        if (length < i11) {
            array = (T[]) Arrays.copyOf(array, i11);
            Intrinsics.checkNotNullExpressionValue(array, "copyOf(...)");
        }
        int i12 = this.f71733e;
        int i13 = this.f71732d;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            objArr = this.f71730b;
            if (i15 >= i12 || i13 >= this.f71731c) {
                break;
            }
            array[i15] = objArr[i13];
            i15++;
            i13++;
        }
        while (i15 < i12) {
            array[i15] = objArr[i14];
            i15++;
            i14++;
        }
        C7714v.M0(i12, array);
        return array;
    }
}
