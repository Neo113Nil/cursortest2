package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ym6 extends bwk {
    public ym6(int i) {
        this.E = i;
    }

    public static float V(oxj oxjVar, float f) {
        Float f2;
        return (oxjVar == null || (f2 = (Float) oxjVar.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    @Override // defpackage.bwk
    public final Animator R(ViewGroup viewGroup, View view, oxj oxjVar) {
        kvk.a.getClass();
        return U(view, V(oxjVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), 1.0f);
    }

    @Override // defpackage.bwk
    public final Animator S(ViewGroup viewGroup, View view, oxj oxjVar, oxj oxjVar2) {
        mvk mvkVar = kvk.a;
        mvkVar.getClass();
        ObjectAnimator U = U(view, V(oxjVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (U == null) {
            mvkVar.M(view, V(oxjVar2, 1.0f));
        }
        return U;
    }

    public final ObjectAnimator U(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        kvk.a.M(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, kvk.b, f2);
        xm6 xm6Var = new xm6(view);
        ofFloat.addListener(xm6Var);
        o().a(xm6Var);
        return ofFloat;
    }

    @Override // defpackage.bwk, defpackage.xwj
    public final void g(oxj oxjVar) {
        bwk.P(oxjVar);
        View view = oxjVar.b;
        Float f = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f == null) {
            f = view.getVisibility() == 0 ? Float.valueOf(kvk.a.F(view)) : Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        oxjVar.a.put("android:fade:transitionAlpha", f);
    }

    @Override // defpackage.xwj
    public final boolean t() {
        return true;
    }
}
