package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends Animation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2673a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f2674b;

    public /* synthetic */ f(SwipeRefreshLayout swipeRefreshLayout, int i5) {
        this.f2673a = i5;
        this.f2674b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f6, Transformation transformation) {
        switch (this.f2673a) {
            case 0:
                this.f2674b.setAnimationProgress(f6);
                break;
            case 1:
                this.f2674b.setAnimationProgress(1.0f - f6);
                break;
            case 2:
                SwipeRefreshLayout swipeRefreshLayout = this.f2674b;
                int abs = swipeRefreshLayout.f2635x - Math.abs(swipeRefreshLayout.f2634w);
                swipeRefreshLayout.setTargetOffsetTopAndBottom((swipeRefreshLayout.f2633v + ((int) ((abs - r1) * f6))) - swipeRefreshLayout.f2631t.getTop());
                d dVar = swipeRefreshLayout.f2637z;
                float f10 = 1.0f - f6;
                c cVar = dVar.f2665a;
                if (f10 != cVar.f2657p) {
                    cVar.f2657p = f10;
                }
                dVar.invalidateSelf();
                break;
            default:
                this.f2674b.e(f6);
                break;
        }
    }
}
