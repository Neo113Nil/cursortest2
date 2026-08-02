package v50;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: v50.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C10255e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private F f102332a = C10253c.f102330a;

    public final void a(@NotNull C10252b testState, @NotNull C10250C onPassed) {
        Intrinsics.checkNotNullParameter(testState, "testState");
        Intrinsics.checkNotNullParameter(onPassed, "onPassed");
        if (Intrinsics.d(testState, this.f102332a)) {
            onPassed.invoke();
        }
    }

    public final boolean b(@NotNull F newState, @NotNull Function0<Unit> onTransformed) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        Intrinsics.checkNotNullParameter(onTransformed, "onTransformed");
        if (!this.f102332a.a().contains(newState)) {
            return false;
        }
        this.f102332a = newState;
        onTransformed.invoke();
        return true;
    }
}
