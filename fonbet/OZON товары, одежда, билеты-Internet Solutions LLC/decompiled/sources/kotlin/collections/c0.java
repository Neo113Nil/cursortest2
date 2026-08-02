package kotlin.collections;

import gd.InterfaceC6712a;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
final class c0<T> extends AbstractC7696c<T> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<T> f71719b;

    public static final class a implements ListIterator<T>, InterfaceC6712a {

        /* renamed from: a, reason: collision with root package name */
        private final ListIterator<T> f71720a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c0<T> f71721b;

        /* JADX WARN: Multi-variable type inference failed */
        a(c0<? extends T> c0Var, int i11) {
            this.f71721b = c0Var;
            this.f71720a = ((c0) c0Var).f71719b.listIterator(D.k(i11, c0Var));
        }

        @Override // java.util.ListIterator
        public final void add(T t2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f71720a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f71720a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            return this.f71720a.previous();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return C7714v.P(this.f71721b) - this.f71720a.previousIndex();
        }

        @Override // java.util.ListIterator
        public final T previous() {
            return this.f71720a.next();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return C7714v.P(this.f71721b) - this.f71720a.nextIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final void set(T t2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c0(@NotNull List<? extends T> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f71719b = delegate;
    }

    @Override // java.util.List
    public final T get(int i11) {
        return this.f71719b.get(D.j(i11, this));
    }

    @Override // kotlin.collections.AbstractC7694a
    public final int getSize() {
        return this.f71719b.size();
    }

    @Override // kotlin.collections.AbstractC7696c, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public final Iterator<T> iterator() {
        return new a(this, 0);
    }

    @Override // kotlin.collections.AbstractC7696c, java.util.List
    @NotNull
    public final ListIterator<T> listIterator() {
        return new a(this, 0);
    }

    @Override // kotlin.collections.AbstractC7696c, java.util.List
    @NotNull
    public final ListIterator<T> listIterator(int i11) {
        return new a(this, i11);
    }
}
