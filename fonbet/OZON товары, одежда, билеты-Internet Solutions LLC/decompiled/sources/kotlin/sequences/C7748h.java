package kotlin.sequences;

import gd.InterfaceC6712a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.sequences.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7748h<T, R, E> implements Sequence<E> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Sequence<T> f71915a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<T, R> f71916b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f71917c;

    /* renamed from: kotlin.sequences.h$a */
    public static final class a implements Iterator<E>, InterfaceC6712a {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator<T> f71918a;

        /* renamed from: b, reason: collision with root package name */
        private Iterator<? extends E> f71919b;

        /* renamed from: c, reason: collision with root package name */
        private int f71920c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C7748h<T, R, E> f71921d;

        a(C7748h<T, R, E> c7748h) {
            this.f71921d = c7748h;
            this.f71918a = ((C7748h) c7748h).f71915a.iterator();
        }

        private final boolean b() {
            Iterator<? extends E> it;
            Iterator<? extends E> it2 = this.f71919b;
            if (it2 != null && it2.hasNext()) {
                this.f71920c = 1;
                return true;
            }
            do {
                Iterator<T> it3 = this.f71918a;
                if (!it3.hasNext()) {
                    this.f71920c = 2;
                    this.f71919b = null;
                    return false;
                }
                T next = it3.next();
                C7748h<T, R, E> c7748h = this.f71921d;
                it = (Iterator) ((C7748h) c7748h).f71917c.invoke(((C7748h) c7748h).f71916b.invoke(next));
            } while (!it.hasNext());
            this.f71919b = it;
            this.f71920c = 1;
            return true;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i11 = this.f71920c;
            if (i11 == 1) {
                return true;
            }
            if (i11 == 2) {
                return false;
            }
            return b();
        }

        @Override // java.util.Iterator
        public final E next() {
            int i11 = this.f71920c;
            if (i11 == 2) {
                throw new NoSuchElementException();
            }
            if (i11 == 0 && !b()) {
                throw new NoSuchElementException();
            }
            this.f71920c = 0;
            Iterator<? extends E> it = this.f71919b;
            Intrinsics.f(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7748h(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> transformer, @NotNull Function1<? super R, ? extends Iterator<? extends E>> iterator) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.f71915a = sequence;
        this.f71916b = transformer;
        this.f71917c = iterator;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public final Iterator<E> iterator() {
        return new a(this);
    }
}
