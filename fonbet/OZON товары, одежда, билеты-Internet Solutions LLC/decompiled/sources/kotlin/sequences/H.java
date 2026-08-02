package kotlin.sequences;

import gd.InterfaceC6712a;
import java.util.Iterator;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class H<T, R> implements Sequence<R> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Sequence<T> f71888a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f71889b;

    public static final class a implements Iterator<R>, InterfaceC6712a {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator<T> f71890a;

        /* renamed from: b, reason: collision with root package name */
        private int f71891b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ H<T, R> f71892c;

        a(H<T, R> h11) {
            this.f71892c = h11;
            this.f71890a = ((H) h11).f71888a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f71890a.hasNext();
        }

        @Override // java.util.Iterator
        public final R next() {
            Function2 function2 = ((H) this.f71892c).f71889b;
            int i11 = this.f71891b;
            this.f71891b = i11 + 1;
            if (i11 >= 0) {
                return (R) function2.invoke(Integer.valueOf(i11), this.f71890a.next());
            }
            C7714v.O0();
            throw null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public H(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super Integer, ? super T, ? extends R> transformer) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        this.f71888a = sequence;
        this.f71889b = transformer;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public final Iterator<R> iterator() {
        return new a(this);
    }
}
