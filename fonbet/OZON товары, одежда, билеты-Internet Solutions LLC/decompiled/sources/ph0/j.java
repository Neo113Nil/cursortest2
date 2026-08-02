package ph0;

import De.C2862e;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.J;
import xe.N;
import xe.X0;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C2862e f80572a;

    public static final class a extends kotlin.coroutines.a implements J {
        @Override // xe.J
        public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
            Lm0.a.f17149a.e(th2);
        }
    }

    static {
        a aVar = new a(J.f105405n0);
        C10720e0 c10720e0 = C10720e0.f105451a;
        f80572a = N.a(He.b.f10879b.plus(X0.b()).plus(aVar));
    }

    @NotNull
    public static final C2862e a() {
        return f80572a;
    }
}
