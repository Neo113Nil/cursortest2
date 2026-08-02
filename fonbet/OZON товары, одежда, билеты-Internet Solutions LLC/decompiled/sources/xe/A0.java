package xe;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class A0 extends G0 {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<Throwable, Unit> f105373e;

    /* JADX WARN: Multi-variable type inference failed */
    public A0(@NotNull Function1<? super Throwable, Unit> function1) {
        this.f105373e = function1;
    }

    @Override // xe.G0
    public final boolean n() {
        return false;
    }

    @Override // xe.G0
    public final void o(Throwable th2) {
        this.f105373e.invoke(th2);
    }
}
