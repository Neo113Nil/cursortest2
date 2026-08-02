package sf;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.N;

/* loaded from: classes10.dex */
public final class r extends N {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private N f98747e;

    public r(@NotNull N delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f98747e = delegate;
    }

    @Override // sf.N
    @NotNull
    public final N a() {
        return this.f98747e.a();
    }

    @Override // sf.N
    @NotNull
    public final N b() {
        return this.f98747e.b();
    }

    @Override // sf.N
    public final long c() {
        return this.f98747e.c();
    }

    @Override // sf.N
    @NotNull
    public final N d(long j11) {
        return this.f98747e.d(j11);
    }

    @Override // sf.N
    public final boolean e() {
        return this.f98747e.e();
    }

    @Override // sf.N
    public final void f() throws IOException {
        this.f98747e.f();
    }

    @Override // sf.N
    @NotNull
    public final N g(long j11, @NotNull TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return this.f98747e.g(j11, unit);
    }

    @Override // sf.N
    public final long h() {
        return this.f98747e.h();
    }

    @NotNull
    public final N i() {
        return this.f98747e;
    }

    @NotNull
    public final void j(@NotNull N.a delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f98747e = delegate;
    }
}
