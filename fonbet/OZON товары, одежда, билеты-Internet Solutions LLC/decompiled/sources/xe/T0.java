package xe;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class T0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C10745r0 f105419a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C10737n f105420b;

    public T0(@NotNull C10745r0 c10745r0, @NotNull C10737n c10737n) {
        this.f105419a = c10745r0;
        this.f105420b = c10737n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f105420b.F(this.f105419a, Unit.f71690a);
    }
}
