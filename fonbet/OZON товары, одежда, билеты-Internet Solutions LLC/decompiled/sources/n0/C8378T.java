package n0;

import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* renamed from: n0.T, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8378T implements W {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C8378T f76120a = new C8378T();

    @Override // n0.W
    public final boolean a() {
        return false;
    }

    @Override // n0.W
    @NotNull
    public final androidx.compose.ui.e b() {
        return androidx.compose.ui.e.f40358c0;
    }

    @Override // n0.W
    public final long c(long j11, int i11, @NotNull Function1<? super C7459e, C7459e> function1) {
        return function1.invoke(C7459e.a(j11)).n();
    }

    @Override // n0.W
    public final Object d(long j11, @NotNull Function2<? super Z1.w, ? super kotlin.coroutines.d<? super Z1.w>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object invoke = function2.invoke(Z1.w.a(j11), dVar);
        return invoke == Wc.a.COROUTINE_SUSPENDED ? invoke : Unit.f71690a;
    }
}
