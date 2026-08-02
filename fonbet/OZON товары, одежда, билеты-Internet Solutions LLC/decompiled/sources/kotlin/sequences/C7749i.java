package kotlin.sequences;

import gd.InterfaceC6712a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlin.sequences.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7749i<T> implements Sequence<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<T> f71922a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<T, T> f71923b;

    /* renamed from: kotlin.sequences.i$a */
    public static final class a implements Iterator<T>, InterfaceC6712a {

        /* renamed from: a, reason: collision with root package name */
        private T f71924a;

        /* renamed from: b, reason: collision with root package name */
        private int f71925b = -2;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C7749i<T> f71926c;

        a(C7749i<T> c7749i) {
            this.f71926c = c7749i;
        }

        private final void b() {
            T t2;
            int i11 = this.f71925b;
            C7749i<T> c7749i = this.f71926c;
            if (i11 == -2) {
                t2 = (T) ((C7749i) c7749i).f71922a.invoke();
            } else {
                Function1 function1 = ((C7749i) c7749i).f71923b;
                T t11 = this.f71924a;
                Intrinsics.f(t11);
                t2 = (T) function1.invoke(t11);
            }
            this.f71924a = t2;
            this.f71925b = t2 == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f71925b < 0) {
                b();
            }
            return this.f71925b == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f71925b < 0) {
                b();
            }
            if (this.f71925b == 0) {
                throw new NoSuchElementException();
            }
            T t2 = this.f71924a;
            Intrinsics.g(t2, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f71925b = -1;
            return t2;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7749i(@NotNull Function0<? extends T> getInitialValue, @NotNull Function1<? super T, ? extends T> getNextValue) {
        Intrinsics.checkNotNullParameter(getInitialValue, "getInitialValue");
        Intrinsics.checkNotNullParameter(getNextValue, "getNextValue");
        this.f71922a = getInitialValue;
        this.f71923b = getNextValue;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
