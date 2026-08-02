package androidx.core.view;

import android.view.View;
import android.view.WindowInsetsAnimation;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q1 extends r1 {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f1385e;

    public q1(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f1385e = windowInsetsAnimation;
    }

    public static g0.d f(WindowInsetsAnimation.Bounds bounds) {
        return g0.d.d(bounds.getUpperBound());
    }

    public static g0.d g(WindowInsetsAnimation.Bounds bounds) {
        return g0.d.d(bounds.getLowerBound());
    }

    public static void h(View view, j1 j1Var) {
        view.setWindowInsetsAnimationCallback(new p1(j1Var));
    }

    @Override // androidx.core.view.r1
    public final float a() {
        return this.f1385e.getAlpha();
    }

    @Override // androidx.core.view.r1
    public final long b() {
        return this.f1385e.getDurationMillis();
    }

    @Override // androidx.core.view.r1
    public final float c() {
        return this.f1385e.getInterpolatedFraction();
    }

    @Override // androidx.core.view.r1
    public final int d() {
        return this.f1385e.getTypeMask();
    }

    @Override // androidx.core.view.r1
    public final void e(float f6) {
        this.f1385e.setFraction(f6);
    }
}
