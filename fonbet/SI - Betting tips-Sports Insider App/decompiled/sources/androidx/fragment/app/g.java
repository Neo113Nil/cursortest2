package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.sports.insider.R;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends l {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1914b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1915c;

    /* renamed from: d, reason: collision with root package name */
    public q0 f1916d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f2 operation, boolean z5) {
        super(operation);
        Intrinsics.checkNotNullParameter(operation, "operation");
        this.f1914b = z5;
    }

    public final q0 b(Context context) {
        Animation loadAnimation;
        q0 q0Var;
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f1915c) {
            return this.f1916d;
        }
        f2 f2Var = this.f1994a;
        Fragment fragment = f2Var.f1905c;
        boolean z5 = f2Var.f1903a == i2.f1958b;
        int nextTransition = fragment.getNextTransition();
        int popEnterAnim = this.f1914b ? z5 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z5 ? fragment.getEnterAnim() : fragment.getExitAnim();
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        q0 q0Var2 = null;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            fragment.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z5, popEnterAnim);
            if (onCreateAnimation != null) {
                q0Var2 = new q0(onCreateAnimation);
            } else {
                Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z5, popEnterAnim);
                if (onCreateAnimator != null) {
                    q0Var2 = new q0(onCreateAnimator);
                } else {
                    if (popEnterAnim == 0 && nextTransition != 0) {
                        popEnterAnim = nextTransition != 4097 ? nextTransition != 8194 ? nextTransition != 8197 ? nextTransition != 4099 ? nextTransition != 4100 ? -1 : z5 ? rh.g.K(context, android.R.attr.activityOpenEnterAnimation) : rh.g.K(context, android.R.attr.activityOpenExitAnimation) : z5 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z5 ? rh.g.K(context, android.R.attr.activityCloseEnterAnimation) : rh.g.K(context, android.R.attr.activityCloseExitAnimation) : z5 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z5 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                    }
                    if (popEnterAnim != 0) {
                        boolean equals = "anim".equals(context.getResources().getResourceTypeName(popEnterAnim));
                        try {
                            if (equals) {
                                try {
                                    loadAnimation = AnimationUtils.loadAnimation(context, popEnterAnim);
                                } catch (Resources.NotFoundException e7) {
                                    throw e7;
                                } catch (RuntimeException unused) {
                                }
                                if (loadAnimation != null) {
                                    q0Var = new q0(loadAnimation);
                                    q0Var2 = q0Var;
                                }
                            }
                            Animator loadAnimator = AnimatorInflater.loadAnimator(context, popEnterAnim);
                            if (loadAnimator != null) {
                                q0Var = new q0(loadAnimator);
                                q0Var2 = q0Var;
                            }
                        } catch (RuntimeException e9) {
                            if (equals) {
                                throw e9;
                            }
                            Animation loadAnimation2 = AnimationUtils.loadAnimation(context, popEnterAnim);
                            if (loadAnimation2 != null) {
                                q0Var2 = new q0(loadAnimation2);
                            }
                        }
                    }
                }
            }
        }
        this.f1916d = q0Var2;
        this.f1915c = true;
        return q0Var2;
    }
}
