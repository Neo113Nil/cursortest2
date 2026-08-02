package mm0;

import gm0.C6752a;
import km0.AbstractC7693a;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mm0.C8349b;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.appupdate.model.InstallState;

/* renamed from: mm0.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8348a<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f76020a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C8349b<T> f76021b;

    /* renamed from: c, reason: collision with root package name */
    private volatile InstallState f76022c;

    public C8348a(InstallState installState) {
        C8349b<T> c8349b = new C8349b<>();
        this.f76021b = c8349b;
        this.f76022c = installState;
        c8349b.d(installState);
    }

    @NotNull
    public final AbstractC7693a a(@NotNull C6752a backpressureStrategy) {
        Intrinsics.checkNotNullParameter(backpressureStrategy, "backpressureStrategy");
        C8349b<T> c8349b = this.f76021b;
        c8349b.getClass();
        Intrinsics.checkNotNullParameter(backpressureStrategy, "backpressureStrategy");
        return new C8349b.a(c8349b, backpressureStrategy);
    }

    public final void b(InstallState installState) {
        synchronized (this.f76020a) {
            try {
                if (!installState.equals(this.f76022c)) {
                    this.f76022c = installState;
                    this.f76021b.d(installState);
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
