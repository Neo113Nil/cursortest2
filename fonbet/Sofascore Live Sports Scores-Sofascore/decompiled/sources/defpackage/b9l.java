package defpackage;

import android.view.View;
import android.view.WindowInsetsAnimation;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b9l extends c9l {
    public final WindowInsetsAnimation e;

    public b9l(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    public static u4a f(WindowInsetsAnimation.Bounds bounds) {
        return u4a.d(bounds.getUpperBound());
    }

    public static u4a g(WindowInsetsAnimation.Bounds bounds) {
        return u4a.d(bounds.getLowerBound());
    }

    public static void h(View view, qo2 qo2Var) {
        view.setWindowInsetsAnimationCallback(qo2Var != null ? new a9l(qo2Var) : null);
    }

    @Override // defpackage.c9l
    public final float a() {
        return this.e.getAlpha();
    }

    @Override // defpackage.c9l
    public final long b() {
        return this.e.getDurationMillis();
    }

    @Override // defpackage.c9l
    public final float c() {
        return this.e.getInterpolatedFraction();
    }

    @Override // defpackage.c9l
    public final int d() {
        return this.e.getTypeMask();
    }

    @Override // defpackage.c9l
    public final void e(float f) {
        this.e.setFraction(f);
    }
}
