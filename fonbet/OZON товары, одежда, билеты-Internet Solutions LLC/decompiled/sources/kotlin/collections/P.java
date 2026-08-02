package kotlin.collections;

import gd.InterfaceC6712a;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class P<T> implements Iterator<IndexedValue<? extends T>>, InterfaceC6712a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Iterator<T> f71701a;

    /* renamed from: b, reason: collision with root package name */
    private int f71702b;

    /* JADX WARN: Multi-variable type inference failed */
    public P(@NotNull Iterator<? extends T> iterator) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.f71701a = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f71701a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i11 = this.f71702b;
        this.f71702b = i11 + 1;
        if (i11 >= 0) {
            return new IndexedValue(i11, this.f71701a.next());
        }
        C7714v.O0();
        throw null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
