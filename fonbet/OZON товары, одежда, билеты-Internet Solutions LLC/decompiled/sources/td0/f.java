package td0;

import De.C2862e;
import Vb0.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.J;
import xe.M;
import xe.N;
import xe.X0;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final a f99435a = new a(J.f105405n0);

    public static final class a extends kotlin.coroutines.a implements J {
        @Override // xe.J
        public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
            b.a.c(Vb0.b.f28514a, th2);
        }
    }

    @NotNull
    public static final C2862e a() {
        C2862e a11 = N.a(f99435a);
        C10720e0 c10720e0 = C10720e0.f105451a;
        return N.g(N.g(a11, He.b.f10879b), X0.b());
    }

    @NotNull
    public static final B0 b(@NotNull M m11, kotlin.coroutines.a aVar, @NotNull Function2 action) {
        Intrinsics.checkNotNullParameter(m11, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        CoroutineContext coroutineContext = m11.getCoroutineContext();
        if (aVar != null) {
            coroutineContext = coroutineContext.plus(aVar);
        }
        if (coroutineContext.get(J.f105405n0) == null) {
            coroutineContext = coroutineContext.plus(f99435a);
        }
        return C10727i.c(m11, coroutineContext, null, action, 2);
    }
}
