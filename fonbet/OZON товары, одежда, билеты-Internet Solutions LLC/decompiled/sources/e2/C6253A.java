package e2;

import B90.C2603e;
import org.jetbrains.annotations.NotNull;

/* renamed from: e2.A, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6253A extends j2.f {

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final Z1.d f61790k;

    /* renamed from: l, reason: collision with root package name */
    private long f61791l = Z1.c.b(0, 0, 15);

    public C6253A(@NotNull Z1.d dVar) {
        this.f61790k = dVar;
        l(new C2603e(this));
    }

    public static float p(C6253A c6253a, float f7) {
        return c6253a.f61790k.g() * f7;
    }

    @Override // j2.f
    public final int d(Float f7) {
        return super.d(f7);
    }

    public final long q() {
        return this.f61791l;
    }

    public final void r(long j11) {
        this.f61791l = j11;
    }
}
