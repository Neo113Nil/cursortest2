package kotlin.sequences;

import gd.InterfaceC6712a;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.sequences.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7744d<T> implements Sequence<T>, InterfaceC7745e<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Sequence<T> f71903a;

    /* renamed from: b, reason: collision with root package name */
    private final int f71904b;

    /* renamed from: kotlin.sequences.d$a */
    public static final class a implements Iterator<T>, InterfaceC6712a {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator<T> f71905a;

        /* renamed from: b, reason: collision with root package name */
        private int f71906b;

        a(C7744d<T> c7744d) {
            this.f71905a = ((C7744d) c7744d).f71903a.iterator();
            this.f71906b = ((C7744d) c7744d).f71904b;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Iterator<T> it;
            while (true) {
                int i11 = this.f71906b;
                it = this.f71905a;
                if (i11 <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.f71906b--;
            }
            return it.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            Iterator<T> it;
            while (true) {
                int i11 = this.f71906b;
                it = this.f71905a;
                if (i11 <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.f71906b--;
            }
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7744d(@NotNull Sequence<? extends T> sequence, int i11) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f71903a = sequence;
        this.f71904b = i11;
        if (i11 < 0) {
            throw new IllegalArgumentException(P4.f.c("count must be non-negative, but was ", i11, '.').toString());
        }
    }

    @Override // kotlin.sequences.InterfaceC7745e
    @NotNull
    public final Sequence<T> a(int i11) {
        int i12 = this.f71904b;
        int i13 = i12 + i11;
        return i13 < 0 ? new F(this, i11) : new E(this.f71903a, i12, i13);
    }

    @Override // kotlin.sequences.InterfaceC7745e
    @NotNull
    public final Sequence<T> drop(int i11) {
        int i12 = this.f71904b + i11;
        return i12 < 0 ? new C7744d(this, i11) : new C7744d(this.f71903a, i12);
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
