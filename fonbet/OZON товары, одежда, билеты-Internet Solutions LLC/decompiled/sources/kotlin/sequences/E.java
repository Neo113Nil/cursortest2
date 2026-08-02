package kotlin.sequences;

import B0.A0;
import gd.InterfaceC6712a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class E<T> implements Sequence<T>, InterfaceC7745e<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Sequence<T> f71872a;

    /* renamed from: b, reason: collision with root package name */
    private final int f71873b;

    /* renamed from: c, reason: collision with root package name */
    private final int f71874c;

    public static final class a implements Iterator<T>, InterfaceC6712a {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator<T> f71875a;

        /* renamed from: b, reason: collision with root package name */
        private int f71876b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ E<T> f71877c;

        a(E<T> e11) {
            this.f71877c = e11;
            this.f71875a = ((E) e11).f71872a.iterator();
        }

        private final void b() {
            while (this.f71876b < ((E) this.f71877c).f71873b) {
                Iterator<T> it = this.f71875a;
                if (!it.hasNext()) {
                    return;
                }
                it.next();
                this.f71876b++;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            b();
            return this.f71876b < ((E) this.f71877c).f71874c && this.f71875a.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            b();
            if (this.f71876b >= ((E) this.f71877c).f71874c) {
                throw new NoSuchElementException();
            }
            this.f71876b++;
            return this.f71875a.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public E(@NotNull Sequence<? extends T> sequence, int i11, int i12) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f71872a = sequence;
        this.f71873b = i11;
        this.f71874c = i12;
        if (i11 < 0) {
            throw new IllegalArgumentException(Ej.b.a(i11, "startIndex should be non-negative, but is ").toString());
        }
        if (i12 < 0) {
            throw new IllegalArgumentException(Ej.b.a(i12, "endIndex should be non-negative, but is ").toString());
        }
        if (i12 < i11) {
            throw new IllegalArgumentException(A0.a(i12, i11, "endIndex should be not less than startIndex, but was ", " < ").toString());
        }
    }

    @Override // kotlin.sequences.InterfaceC7745e
    @NotNull
    public final Sequence<T> a(int i11) {
        int i12 = this.f71874c;
        int i13 = this.f71873b;
        if (i11 >= i12 - i13) {
            return this;
        }
        return new E(this.f71872a, i13, i11 + i13);
    }

    @Override // kotlin.sequences.InterfaceC7745e
    @NotNull
    public final Sequence<T> drop(int i11) {
        int i12 = this.f71874c;
        int i13 = this.f71873b;
        if (i11 >= i12 - i13) {
            return C7746f.f71907a;
        }
        return new E(this.f71872a, i13 + i11, i12);
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
