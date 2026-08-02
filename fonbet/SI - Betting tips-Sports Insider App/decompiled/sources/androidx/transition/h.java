package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.sports.insider.R;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends z0 {
    public h(int i5) {
        setMode(i5);
    }

    public static float j(l0 l0Var, float f6) {
        Float f10;
        return (l0Var == null || (f10 = (Float) l0Var.f2724a.get("android:fade:transitionAlpha")) == null) ? f6 : f10.floatValue();
    }

    @Override // androidx.transition.z0, androidx.transition.a0
    public final void captureStartValues(l0 l0Var) {
        super.captureStartValues(l0Var);
        Float f6 = (Float) l0Var.f2725b.getTag(R.id.transition_pause_alpha);
        if (f6 == null) {
            if (l0Var.f2725b.getVisibility() == 0) {
                f6 = Float.valueOf(p0.f2736a.s(l0Var.f2725b));
            } else {
                f6 = Float.valueOf(0.0f);
            }
        }
        l0Var.f2724a.put("android:fade:transitionAlpha", f6);
    }

    public final ObjectAnimator i(float f6, float f10, View view) {
        if (f6 == f10) {
            return null;
        }
        p0.f2736a.z(view, f6);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, p0.f2737b, f10);
        g gVar = new g(view);
        ofFloat.addListener(gVar);
        getRootTransition().addListener(gVar);
        return ofFloat;
    }

    @Override // androidx.transition.a0
    public final boolean isSeekingSupported() {
        return true;
    }

    @Override // androidx.transition.z0
    public final Animator onAppear(ViewGroup viewGroup, View view, l0 l0Var, l0 l0Var2) {
        p0.f2736a.getClass();
        return i(j(l0Var, 0.0f), 1.0f, view);
    }

    @Override // androidx.transition.z0
    public final Animator onDisappear(ViewGroup viewGroup, View view, l0 l0Var, l0 l0Var2) {
        u0 u0Var = p0.f2736a;
        u0Var.getClass();
        ObjectAnimator i5 = i(j(l0Var, 1.0f), 0.0f, view);
        if (i5 == null) {
            u0Var.z(view, j(l0Var2, 1.0f));
        }
        return i5;
    }
}
