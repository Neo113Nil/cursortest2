package kotlin.jvm.internal;

import gd.InterfaceC6712a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.jvm.internal.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C7720b<T> implements Iterator<T>, InterfaceC6712a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final T[] f71800a;

    /* renamed from: b, reason: collision with root package name */
    private int f71801b;

    public C7720b(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f71800a = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f71801b < this.f71800a.length;
    }

    @Override // java.util.Iterator
    public final T next() {
        try {
            T[] tArr = this.f71800a;
            int i11 = this.f71801b;
            this.f71801b = i11 + 1;
            return tArr[i11];
        } catch (ArrayIndexOutOfBoundsException e11) {
            this.f71801b--;
            throw new NoSuchElementException(e11.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
