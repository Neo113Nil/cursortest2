package l1;

import android.graphics.RenderEffect;
import k1.C7459e;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class D0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final D0 f72196a = new D0();

    @NotNull
    public final RenderEffect a(z0 z0Var, float f7, float f11, int i11) {
        RenderEffect createBlurEffect;
        RenderEffect createBlurEffect2;
        if (z0Var == null) {
            createBlurEffect2 = RenderEffect.createBlurEffect(f7, f11, C7792J.a(i11));
            return createBlurEffect2;
        }
        createBlurEffect = RenderEffect.createBlurEffect(f7, f11, z0Var.a(), C7792J.a(i11));
        return createBlurEffect;
    }

    @NotNull
    public final RenderEffect b(z0 z0Var, long j11) {
        RenderEffect createOffsetEffect;
        RenderEffect createOffsetEffect2;
        if (z0Var == null) {
            createOffsetEffect2 = RenderEffect.createOffsetEffect(C7459e.g(j11), C7459e.h(j11));
            return createOffsetEffect2;
        }
        createOffsetEffect = RenderEffect.createOffsetEffect(C7459e.g(j11), C7459e.h(j11), z0Var.a());
        return createOffsetEffect;
    }
}
