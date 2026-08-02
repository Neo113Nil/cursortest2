package l0;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final b0 f72117a;

    public l0(@NotNull Z1.d dVar) {
        this.f72117a = new b0(m0.a(), dVar);
    }

    public final long a(float f7) {
        return this.f72117a.b(f7) * 1000000;
    }

    public final float b(float f7, float f11) {
        return (Math.signum(f11) * this.f72117a.a(f11)) + f7;
    }

    public final float c(float f7, float f11, long j11) {
        return this.f72117a.c(f11).a(j11 / 1000000) + f7;
    }

    public final float d(float f7, long j11) {
        return this.f72117a.c(f7).b(j11 / 1000000);
    }
}
