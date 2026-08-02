package defpackage;

import android.animation.Animator;
import android.view.View;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sh6 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ sh6(int i, View view) {
        this.a = i;
        this.b = view;
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
        animator.getClass();
        switch (i) {
            case 0:
                view.setTag(R.id.expand_collapse_animator_tag, null);
                view.setVisibility(8);
                view.getLayoutParams().height = -2;
                view.requestLayout();
                break;
            case 1:
                view.setTag(R.id.expand_collapse_animator_tag, null);
                view.getLayoutParams().height = -2;
                view.requestLayout();
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
        switch (i) {
            case 0:
            case 1:
                break;
            default:
                this.b.setVisibility(0);
                break;
        }
    }
}
