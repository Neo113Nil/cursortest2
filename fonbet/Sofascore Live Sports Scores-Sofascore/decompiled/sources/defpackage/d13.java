package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class d13 implements ua0 {
    public final /* synthetic */ CollapsingToolbarLayout a;

    public d13(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.a = collapsingToolbarLayout;
    }

    @Override // defpackage.ua0
    public final void a(AppBarLayout appBarLayout, int i) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.a;
        b13 b13Var = collapsingToolbarLayout.m;
        b13 b13Var2 = collapsingToolbarLayout.l;
        collapsingToolbarLayout.B = i;
        x9l x9lVar = collapsingToolbarLayout.E;
        int d = x9lVar != null ? x9lVar.d() : 0;
        int childCount = collapsingToolbarLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = collapsingToolbarLayout.getChildAt(i2);
            c13 c13Var = (c13) childAt.getLayoutParams();
            ytk b = CollapsingToolbarLayout.b(childAt);
            int i3 = c13Var.a;
            if (i3 == 1) {
                b.b(s6a.t(-i, 0, ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.b(childAt).b) - childAt.getHeight()) - ((FrameLayout.LayoutParams) ((c13) childAt.getLayoutParams())).bottomMargin));
            } else if (i3 == 2) {
                b.b(Math.round((-i) * c13Var.b));
            }
        }
        collapsingToolbarLayout.d();
        if (collapsingToolbarLayout.s != null && d > 0) {
            collapsingToolbarLayout.postInvalidateOnAnimation();
        }
        int height = collapsingToolbarLayout.getHeight();
        int minimumHeight = (height - collapsingToolbarLayout.getMinimumHeight()) - d;
        int scrimVisibleHeightTrigger = height - collapsingToolbarLayout.getScrimVisibleHeightTrigger();
        int i4 = collapsingToolbarLayout.B + minimumHeight;
        float f = minimumHeight;
        float abs = Math.abs(i) / f;
        float f2 = scrimVisibleHeightTrigger / f;
        float min = Math.min(1.0f, f2);
        b13Var2.d = min;
        b13Var2.e = me4.b(1.0f, min, 0.5f, min);
        b13Var2.f = i4;
        b13Var2.A(abs);
        float min2 = Math.min(1.0f, f2);
        b13Var.d = min2;
        b13Var.e = me4.b(1.0f, min2, 0.5f, min2);
        b13Var.f = i4;
        b13Var.A(abs);
    }
}
