package n0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import xe.B0;

/* renamed from: n0.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8374O {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicReference<a> f76097a = new AtomicReference<>(null);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Je.d f76098b = Je.e.a();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0.O$a */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final EnumC8372M f76099a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final B0 f76100b;

        public a(@NotNull EnumC8372M enumC8372M, @NotNull B0 b02) {
            this.f76099a = enumC8372M;
            this.f76100b = b02;
        }

        public final boolean a(@NotNull a aVar) {
            return this.f76099a.compareTo(aVar.f76099a) >= 0;
        }

        public final void b() {
            this.f76100b.j(new C8373N());
        }
    }

    public static final void c(C8374O c8374o, a aVar) {
        while (true) {
            AtomicReference<a> atomicReference = c8374o.f76097a;
            a aVar2 = atomicReference.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(aVar2, aVar)) {
                if (atomicReference.get() != aVar2) {
                    break;
                }
            }
            if (aVar2 != null) {
                aVar2.b();
                return;
            }
            return;
        }
    }

    public final Object d(@NotNull EnumC8372M enumC8372M, @NotNull Function1 function1, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        return xe.N.d(new C8375P(enumC8372M, this, function1, null), cVar);
    }

    public final Object e(Object obj, @NotNull EnumC8372M enumC8372M, @NotNull Function2 function2, @NotNull kotlin.coroutines.jvm.internal.j jVar) {
        return xe.N.d(new C8376Q(enumC8372M, this, function2, obj, null), jVar);
    }

    public final boolean f() {
        return this.f76098b.tryLock();
    }

    public final void g() {
        this.f76098b.c(null);
    }
}
