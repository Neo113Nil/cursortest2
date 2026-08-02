package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.sofascore.results.R;
import defpackage.fp4;
import defpackage.pco;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d extends f {
    public final boolean b;
    public boolean c;
    public fp4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(y yVar, boolean z) {
        super(yVar);
        yVar.getClass();
        this.b = z;
    }

    public final fp4 b(Context context) {
        Animation loadAnimation;
        fp4 fp4Var;
        context.getClass();
        if (this.c) {
            return this.d;
        }
        y yVar = this.a;
        Fragment fragment = yVar.c;
        boolean z = yVar.a == 2;
        int nextTransition = fragment.getNextTransition();
        int popEnterAnim = this.b ? z ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z ? fragment.getEnterAnim() : fragment.getExitAnim();
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        fp4 fp4Var2 = null;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            fragment.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z, popEnterAnim);
            int i = 24;
            if (onCreateAnimation != null) {
                fp4Var2 = new fp4(onCreateAnimation, i);
            } else {
                Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z, popEnterAnim);
                if (onCreateAnimator != null) {
                    fp4Var2 = new fp4(onCreateAnimator);
                } else {
                    if (popEnterAnim == 0 && nextTransition != 0) {
                        popEnterAnim = nextTransition != 4097 ? nextTransition != 8194 ? nextTransition != 8197 ? nextTransition != 4099 ? nextTransition != 4100 ? -1 : z ? pco.S(android.R.attr.activityOpenEnterAnimation, context) : pco.S(android.R.attr.activityOpenExitAnimation, context) : z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z ? pco.S(android.R.attr.activityCloseEnterAnimation, context) : pco.S(android.R.attr.activityCloseExitAnimation, context) : z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                    }
                    if (popEnterAnim != 0) {
                        boolean equals = "anim".equals(context.getResources().getResourceTypeName(popEnterAnim));
                        try {
                            if (equals) {
                                try {
                                    loadAnimation = AnimationUtils.loadAnimation(context, popEnterAnim);
                                } catch (Resources.NotFoundException e) {
                                    throw e;
                                } catch (RuntimeException unused) {
                                }
                                if (loadAnimation != null) {
                                    fp4Var = new fp4(loadAnimation, i);
                                    fp4Var2 = fp4Var;
                                }
                            }
                            Animator loadAnimator = AnimatorInflater.loadAnimator(context, popEnterAnim);
                            if (loadAnimator != null) {
                                fp4Var = new fp4(loadAnimator);
                                fp4Var2 = fp4Var;
                            }
                        } catch (RuntimeException e2) {
                            if (equals) {
                                throw e2;
                            }
                            Animation loadAnimation2 = AnimationUtils.loadAnimation(context, popEnterAnim);
                            if (loadAnimation2 != null) {
                                fp4Var2 = new fp4(loadAnimation2, i);
                            }
                        }
                    }
                }
            }
        }
        this.d = fp4Var2;
        this.c = true;
        return fp4Var2;
    }
}
