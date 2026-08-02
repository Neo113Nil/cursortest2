package defpackage;

import android.animation.Animator;
import android.view.View;
import android.widget.ImageView;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gtg implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ gtg(View view, int i, boolean z) {
        this.a = i;
        this.b = view;
        this.c = z;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        View view = this.b;
        boolean z = this.c;
        animator.getClass();
        switch (i) {
            case 0:
                ((ImageView) view).setVisibility(z ? 0 : 8);
                break;
            case 1:
                ((ImageView) view).setVisibility(z ? 0 : 8);
                break;
            default:
                t2 t2Var = (t2) view;
                t2Var.getBinding().a.getLayoutParams().height = -2;
                Function1 function1 = t2Var.g;
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(z));
                }
                if (!z) {
                    t2Var.getBinding().d.setVisibility(8);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
        animator.getClass();
    }
}
