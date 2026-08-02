package androidx.swiperefreshlayout.widget;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f2641a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f2642b;

    public b(d dVar, c cVar) {
        this.f2642b = dVar;
        this.f2641a = cVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c cVar = this.f2641a;
        d.d(floatValue, cVar);
        d dVar = this.f2642b;
        dVar.a(floatValue, cVar, false);
        dVar.invalidateSelf();
    }
}
