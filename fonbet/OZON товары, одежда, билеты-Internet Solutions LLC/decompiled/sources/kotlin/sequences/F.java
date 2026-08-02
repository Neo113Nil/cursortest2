package kotlin.sequences;

import gd.InterfaceC6712a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class F<T> implements Sequence<T>, InterfaceC7745e<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Sequence<T> f71878a;

    /* renamed from: b, reason: collision with root package name */
    private final int f71879b;

    public static final class a implements Iterator<T>, InterfaceC6712a {

        /* renamed from: a, reason: collision with root package name */
        private int f71880a;

        /* renamed from: b, reason: collision with root package name */
        private final Iterator<T> f71881b;

        a(F<T> f7) {
            this.f71880a = ((F) f7).f71879b;
            this.f71881b = ((F) f7).f71878a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f71880a > 0 && this.f71881b.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            int i11 = this.f71880a;
            if (i11 == 0) {
                throw new NoSuchElementException();
            }
            this.f71880a = i11 - 1;
            return this.f71881b.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public F(@NotNull Sequence<? extends T> sequence, int i11) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f71878a = sequence;
        this.f71879b = i11;
        if (i11 < 0) {
            throw new IllegalArgumentException(P4.f.c("count must be non-negative, but was ", i11, '.').toString());
        }
    }

    @Override // kotlin.sequences.InterfaceC7745e
    @NotNull
    public final Sequence<T> a(int i11) {
        return i11 >= this.f71879b ? this : new F(this.f71878a, i11);
    }

    @Override // kotlin.sequences.InterfaceC7745e
    @NotNull
    public final Sequence<T> drop(int i11) {
        int i12 = this.f71879b;
        return i11 >= i12 ? C7746f.f71907a : new E(this.f71878a, i11, i12);
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
