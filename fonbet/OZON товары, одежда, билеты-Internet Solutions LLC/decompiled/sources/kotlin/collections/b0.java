package kotlin.collections;

import gd.InterfaceC6712a;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class b0<T> extends AbstractC7699f<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<T> f71709a;

    public static final class a implements ListIterator<T>, InterfaceC6712a {

        /* renamed from: a, reason: collision with root package name */
        private final ListIterator<T> f71710a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0<T> f71711b;

        a(b0<T> b0Var, int i11) {
            this.f71711b = b0Var;
            this.f71710a = ((b0) b0Var).f71709a.listIterator(D.k(i11, b0Var));
        }

        @Override // java.util.ListIterator
        public final void add(T t2) {
            ListIterator<T> listIterator = this.f71710a;
            listIterator.add(t2);
            listIterator.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f71710a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f71710a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            return this.f71710a.previous();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return C7714v.P(this.f71711b) - this.f71710a.previousIndex();
        }

        @Override // java.util.ListIterator
        public final T previous() {
            return this.f71710a.next();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return C7714v.P(this.f71711b) - this.f71710a.nextIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            this.f71710a.remove();
        }

        @Override // java.util.ListIterator
        public final void set(T t2) {
            this.f71710a.set(t2);
        }
    }

    public b0(@NotNull List<T> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f71709a = delegate;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, T t2) {
        this.f71709a.add(D.k(i11, this), t2);
    }

    @Override // kotlin.collections.AbstractC7699f
    public final T b(int i11) {
        return this.f71709a.remove(D.j(i11, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f71709a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i11) {
        return this.f71709a.get(D.j(i11, this));
    }

    @Override // kotlin.collections.AbstractC7699f
    /* renamed from: getSize */
    public final int getF26995b() {
        return this.f71709a.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public final Iterator<T> iterator() {
        return new a(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public final ListIterator<T> listIterator() {
        return new a(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final T set(int i11, T t2) {
        return this.f71709a.set(D.j(i11, this), t2);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public final ListIterator<T> listIterator(int i11) {
        return new a(this, i11);
    }
}
