package androidx.recyclerview.widget;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f2329a;

    public b0(c0 c0Var) {
        this.f2329a = c0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        c0 c0Var = this.f2329a;
        c0Var.f2333c.setAlpha(floatValue);
        c0Var.f2334d.setAlpha(floatValue);
        c0Var.f2347s.invalidate();
    }
}
