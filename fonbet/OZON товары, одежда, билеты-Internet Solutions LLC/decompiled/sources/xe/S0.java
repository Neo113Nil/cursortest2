package xe;

import Sc.r;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class S0 extends G0 {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C10737n f105417e;

    public S0(@NotNull C10737n c10737n) {
        this.f105417e = c10737n;
    }

    @Override // xe.G0
    public final boolean n() {
        return false;
    }

    @Override // xe.G0
    public final void o(Throwable th2) {
        r.Companion companion = Sc.r.INSTANCE;
        this.f105417e.resumeWith(Unit.f71690a);
    }
}
