package kotlin.sequences;

import gd.InterfaceC6712a;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class I<T, R> implements Sequence<R> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Sequence<T> f71893a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<T, R> f71894b;

    public static final class a implements Iterator<R>, InterfaceC6712a {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator<T> f71895a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ I<T, R> f71896b;

        a(I<T, R> i11) {
            this.f71896b = i11;
            this.f71895a = ((I) i11).f71893a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f71895a.hasNext();
        }

        @Override // java.util.Iterator
        public final R next() {
            return (R) ((I) this.f71896b).f71894b.invoke(this.f71895a.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public I(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> transformer) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        this.f71893a = sequence;
        this.f71894b = transformer;
    }

    @NotNull
    public final C7748h d(@NotNull Function1 iterator) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        return new C7748h(this.f71893a, this.f71894b, iterator);
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public final Iterator<R> iterator() {
        return new a(this);
    }
}
