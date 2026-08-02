package ve;

import android.animation.Animator;
import com.sports.insider.ui.views.SwitchButton;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q0 implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SwitchButton f24824a;

    public q0(SwitchButton switchButton) {
        this.f24824a = switchButton;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        SwitchButton switchButton = this.f24824a;
        int i5 = switchButton.j0;
        int i10 = switchButton.f7952e;
        if (i5 != i10) {
            if (i5 == switchButton.f7951d) {
                switchButton.j0 = i10;
                p0 p0Var = switchButton.f7955g0;
                Intrinsics.checkNotNull(p0Var);
                p0Var.f24758c = 0;
                p0 p0Var2 = switchButton.f7955g0;
                Intrinsics.checkNotNull(p0Var2);
                p0Var2.f24759d = switchButton.f7961l;
                switchButton.postInvalidate();
                return;
            }
            if (i5 == switchButton.f7953f) {
                switchButton.j0 = 0;
                switchButton.postInvalidate();
                return;
            }
            if (i5 == switchButton.f7954g) {
                switchButton.j0 = 0;
                switchButton.postInvalidate();
                switchButton.a();
            } else if (i5 == switchButton.f7956h) {
                switchButton.f7964m0 = !switchButton.f7964m0;
                switchButton.j0 = 0;
                switchButton.postInvalidate();
                switchButton.a();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }
}
