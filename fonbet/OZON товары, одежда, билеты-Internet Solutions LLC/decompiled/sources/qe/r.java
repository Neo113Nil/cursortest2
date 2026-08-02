package qe;

import gd.InterfaceC6712a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import je.AbstractC7393m0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class r<T> extends AbstractC9032c<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC7393m0 f81969a;

    /* renamed from: b, reason: collision with root package name */
    private final int f81970b;

    public static final class a implements Iterator<T>, InterfaceC6712a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f81971a = true;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ r<T> f81972b;

        a(r<T> rVar) {
            this.f81972b = rVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f81971a;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.f81971a) {
                throw new NoSuchElementException();
            }
            this.f81971a = false;
            return this.f81972b.e();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(@NotNull AbstractC7393m0 value, int i11) {
        super(0);
        Intrinsics.checkNotNullParameter(value, "value");
        this.f81969a = value;
        this.f81970b = i11;
    }

    @Override // qe.AbstractC9032c
    public final void b(int i11, @NotNull T value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new IllegalStateException();
    }

    public final int c() {
        return this.f81970b;
    }

    @NotNull
    public final T e() {
        return (T) this.f81969a;
    }

    @Override // qe.AbstractC9032c
    public final T get(int i11) {
        if (i11 == this.f81970b) {
            return (T) this.f81969a;
        }
        return null;
    }

    @Override // qe.AbstractC9032c
    public final int getSize() {
        return 1;
    }

    @Override // qe.AbstractC9032c, java.lang.Iterable
    @NotNull
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
