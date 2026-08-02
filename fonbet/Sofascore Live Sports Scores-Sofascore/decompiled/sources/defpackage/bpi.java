package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bpi extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ SwipeRefreshLayout b;

    public /* synthetic */ bpi(SwipeRefreshLayout swipeRefreshLayout, int i) {
        this.a = i;
        this.b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.a;
        SwipeRefreshLayout swipeRefreshLayout = this.b;
        switch (i) {
            case 0:
                swipeRefreshLayout.setAnimationProgress(f);
                break;
            case 1:
                swipeRefreshLayout.setAnimationProgress(1.0f - f);
                break;
            case 2:
                boolean z = swipeRefreshLayout.G;
                int i2 = swipeRefreshLayout.x;
                if (!z) {
                    i2 -= Math.abs(swipeRefreshLayout.w);
                }
                swipeRefreshLayout.setTargetOffsetTopAndBottom((swipeRefreshLayout.v + ((int) ((i2 - r4) * f))) - swipeRefreshLayout.t.getTop());
                mv2 mv2Var = swipeRefreshLayout.z;
                float f2 = 1.0f - f;
                lv2 lv2Var = mv2Var.a;
                if (f2 != lv2Var.p) {
                    lv2Var.p = f2;
                }
                mv2Var.invalidateSelf();
                break;
            default:
                swipeRefreshLayout.k(f);
                break;
        }
    }
}
