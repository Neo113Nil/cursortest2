package kotlin.sequences;

import gd.InterfaceC6712a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/sequences/g;", "T", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.sequences.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7747g<T> implements Sequence<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Sequence<T> f71908a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f71909b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<T, Boolean> f71910c;

    /* renamed from: kotlin.sequences.g$a */
    public static final class a implements Iterator<T>, InterfaceC6712a {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator<T> f71911a;

        /* renamed from: b, reason: collision with root package name */
        private int f71912b = -1;

        /* renamed from: c, reason: collision with root package name */
        private T f71913c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C7747g<T> f71914d;

        a(C7747g<T> c7747g) {
            this.f71914d = c7747g;
            this.f71911a = ((C7747g) c7747g).f71908a.iterator();
        }

        private final void b() {
            T next;
            C7747g<T> c7747g;
            do {
                Iterator<T> it = this.f71911a;
                if (!it.hasNext()) {
                    this.f71912b = 0;
                    return;
                } else {
                    next = it.next();
                    c7747g = this.f71914d;
                }
            } while (((Boolean) ((C7747g) c7747g).f71910c.invoke(next)).booleanValue() != ((C7747g) c7747g).f71909b);
            this.f71913c = next;
            this.f71912b = 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f71912b == -1) {
                b();
            }
            return this.f71912b == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f71912b == -1) {
                b();
            }
            if (this.f71912b == 0) {
                throw new NoSuchElementException();
            }
            T t2 = this.f71913c;
            this.f71913c = null;
            this.f71912b = -1;
            return t2;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7747g(@NotNull Sequence<? extends T> sequence, boolean z11, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f71908a = sequence;
        this.f71909b = z11;
        this.f71910c = predicate;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
