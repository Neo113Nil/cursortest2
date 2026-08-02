package m0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* renamed from: m0.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7981b0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicReference<a> f73673a = new AtomicReference<>(null);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Je.d f73674b = Je.e.a();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0.b0$a */
    /* loaded from: classes8.dex */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Z f73675a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final xe.B0 f73676b;

        public a(@NotNull Z z11, @NotNull xe.B0 b02) {
            this.f73675a = z11;
            this.f73676b = b02;
        }

        public final boolean a(@NotNull a aVar) {
            return this.f73675a.compareTo(aVar.f73675a) >= 0;
        }

        public final void b() {
            this.f73676b.j(new C7979a0("Mutation interrupted"));
        }
    }

    public static final void c(C7981b0 c7981b0, a aVar) {
        AtomicReference<a> atomicReference;
        a aVar2;
        do {
            atomicReference = c7981b0.f73673a;
            aVar2 = atomicReference.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!Bl.b.e(atomicReference, aVar2, aVar));
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    public static Object d(C7981b0 c7981b0, Function1 function1, kotlin.coroutines.d dVar) {
        Z z11 = Z.Default;
        c7981b0.getClass();
        return xe.N.d(new C7983c0(z11, c7981b0, function1, null), dVar);
    }
}
