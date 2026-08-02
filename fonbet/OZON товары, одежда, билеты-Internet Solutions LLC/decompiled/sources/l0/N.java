package l0;

import S0.C0;
import S0.C3985t0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.q f72029a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.s f72030b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C3985t0 f72031c;

    /* renamed from: d, reason: collision with root package name */
    private i0 f72032d;

    public N(@NotNull androidx.compose.animation.q qVar, @NotNull androidx.compose.animation.s sVar, float f7, i0 i0Var) {
        this.f72029a = qVar;
        this.f72030b = sVar;
        this.f72031c = C0.a(f7);
        this.f72032d = i0Var;
    }

    @NotNull
    public final androidx.compose.animation.s a() {
        return this.f72030b;
    }

    public final i0 b() {
        return this.f72032d;
    }

    @NotNull
    public final androidx.compose.animation.q c() {
        return this.f72029a;
    }

    public final float d() {
        return this.f72031c.getFloatValue();
    }
}
