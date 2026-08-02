package kotlin.sequences;

import gd.InterfaceC6712a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class G<T> implements Sequence<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Sequence<T> f71882a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<T, Boolean> f71883b;

    public static final class a implements Iterator<T>, InterfaceC6712a {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator<T> f71884a;

        /* renamed from: b, reason: collision with root package name */
        private int f71885b = -1;

        /* renamed from: c, reason: collision with root package name */
        private T f71886c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ G<T> f71887d;

        a(G<T> g10) {
            this.f71887d = g10;
            this.f71884a = ((G) g10).f71882a.iterator();
        }

        private final void b() {
            Iterator<T> it = this.f71884a;
            if (it.hasNext()) {
                T next = it.next();
                if (((Boolean) ((G) this.f71887d).f71883b.invoke(next)).booleanValue()) {
                    this.f71885b = 1;
                    this.f71886c = next;
                    return;
                }
            }
            this.f71885b = 0;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f71885b == -1) {
                b();
            }
            return this.f71885b == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f71885b == -1) {
                b();
            }
            if (this.f71885b == 0) {
                throw new NoSuchElementException();
            }
            T t2 = this.f71886c;
            this.f71886c = null;
            this.f71885b = -1;
            return t2;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public G(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f71882a = sequence;
        this.f71883b = predicate;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
