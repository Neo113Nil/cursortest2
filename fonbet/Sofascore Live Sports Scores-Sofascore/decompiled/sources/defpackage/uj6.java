package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class uj6 extends f51 {
    public final xj6 g;
    public final boolean h;
    public final /* synthetic */ ExtendedFloatingActionButton i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj6(ExtendedFloatingActionButton extendedFloatingActionButton, j0l j0lVar, xj6 xj6Var, boolean z) {
        super(extendedFloatingActionButton, j0lVar);
        this.i = extendedFloatingActionButton;
        this.g = xj6Var;
        this.h = z;
    }

    @Override // defpackage.f51
    public final AnimatorSet a() {
        cwc cwcVar = this.f;
        if (cwcVar == null) {
            cwcVar = this.e;
            if (cwcVar == null) {
                cwcVar = cwc.b(c(), this.a);
                this.e = cwcVar;
            }
            cwcVar.getClass();
        }
        boolean g = cwcVar.g("width");
        xj6 xj6Var = this.g;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.i;
        if (g) {
            PropertyValuesHolder[] e = cwcVar.e("width");
            e[0].setFloatValues(extendedFloatingActionButton.getWidth(), xj6Var.getWidth());
            cwcVar.h("width", e);
        }
        if (cwcVar.g("height")) {
            PropertyValuesHolder[] e2 = cwcVar.e("height");
            e2[0].setFloatValues(extendedFloatingActionButton.getHeight(), xj6Var.getHeight());
            cwcVar.h("height", e2);
        }
        if (cwcVar.g("paddingStart")) {
            PropertyValuesHolder[] e3 = cwcVar.e("paddingStart");
            e3[0].setFloatValues(extendedFloatingActionButton.getPaddingStart(), xj6Var.getPaddingStart());
            cwcVar.h("paddingStart", e3);
        }
        if (cwcVar.g("paddingEnd")) {
            PropertyValuesHolder[] e4 = cwcVar.e("paddingEnd");
            e4[0].setFloatValues(extendedFloatingActionButton.getPaddingEnd(), xj6Var.getPaddingEnd());
            cwcVar.h("paddingEnd", e4);
        }
        if (cwcVar.g("labelOpacity")) {
            PropertyValuesHolder[] e5 = cwcVar.e("labelOpacity");
            int alpha = Color.alpha(extendedFloatingActionButton.getCurrentOriginalTextColor());
            int alpha2 = Color.alpha(extendedFloatingActionButton.getCurrentTextColor());
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f2 = alpha != 0 ? alpha2 / alpha : 0.0f;
            if (this.h) {
                f = 1.0f;
            }
            e5[0].setFloatValues(f2, f);
            cwcVar.h("labelOpacity", e5);
        }
        return b(cwcVar);
    }

    @Override // defpackage.f51
    public final int c() {
        return this.h ? R.animator.mtrl_extended_fab_change_size_expand_motion_spec : R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
    }

    @Override // defpackage.f51
    public final void e() {
        this.d.b = null;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.i;
        extendedFloatingActionButton.e0 = false;
        extendedFloatingActionButton.setHorizontallyScrolling(false);
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        xj6 xj6Var = this.g;
        layoutParams.width = xj6Var.getLayoutParams().width;
        layoutParams.height = xj6Var.getLayoutParams().height;
    }

    @Override // defpackage.f51
    public final void f(Animator animator) {
        j0l j0lVar = this.d;
        Animator animator2 = (Animator) j0lVar.b;
        if (animator2 != null) {
            animator2.cancel();
        }
        j0lVar.b = animator;
        boolean z = this.h;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.i;
        extendedFloatingActionButton.d0 = z;
        extendedFloatingActionButton.e0 = true;
        extendedFloatingActionButton.setHorizontallyScrolling(true);
        extendedFloatingActionButton.A();
    }

    @Override // defpackage.f51
    public final void g() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.i;
        boolean z = this.h;
        extendedFloatingActionButton.d0 = z;
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (!z) {
            extendedFloatingActionButton.h0 = layoutParams.width;
            extendedFloatingActionButton.i0 = layoutParams.height;
        }
        xj6 xj6Var = this.g;
        layoutParams.width = xj6Var.getLayoutParams().width;
        layoutParams.height = xj6Var.getLayoutParams().height;
        if (z) {
            extendedFloatingActionButton.z(extendedFloatingActionButton.g0);
        } else if (extendedFloatingActionButton.getText() != null && extendedFloatingActionButton.getText() != "") {
            extendedFloatingActionButton.z(ColorStateList.valueOf(0));
        }
        extendedFloatingActionButton.setPaddingRelative(xj6Var.getPaddingStart(), extendedFloatingActionButton.getPaddingTop(), xj6Var.getPaddingEnd(), extendedFloatingActionButton.getPaddingBottom());
        extendedFloatingActionButton.requestLayout();
        extendedFloatingActionButton.A();
    }

    @Override // defpackage.f51
    public final boolean h() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.i;
        return this.h == extendedFloatingActionButton.d0 || extendedFloatingActionButton.getIcon() == null || TextUtils.isEmpty(extendedFloatingActionButton.getText());
    }
}
