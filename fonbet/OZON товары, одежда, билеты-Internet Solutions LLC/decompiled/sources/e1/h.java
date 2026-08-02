package e1;

import ed.InterfaceC6346b;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.N;

@InterfaceC6346b
/* loaded from: classes.dex */
public final class h<T> {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes8.dex */
    static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final B0 f61783a;

        /* renamed from: b, reason: collision with root package name */
        private final T f61784b;

        public a(@NotNull B0 b02, T t2) {
            this.f61783a = b02;
            this.f61784b = t2;
        }

        @NotNull
        public final B0 a() {
            return this.f61783a;
        }

        public final T b() {
            return this.f61784b;
        }
    }

    public static final T a(AtomicReference<a<T>> atomicReference) {
        a<T> aVar = atomicReference.get();
        if (aVar != null) {
            return aVar.b();
        }
        return null;
    }

    public static final Object b(AtomicReference atomicReference, @NotNull Function1 function1, @NotNull Function2 function2, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        return N.d(new i(function1, atomicReference, function2, null), cVar);
    }
}
