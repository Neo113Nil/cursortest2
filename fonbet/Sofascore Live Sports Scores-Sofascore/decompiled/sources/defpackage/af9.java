package defpackage;

import android.animation.Animator;
import android.widget.TextView;
import com.sofascore.results.event.details.view.HorizontalBarView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class af9 implements Animator.AnimatorListener {
    public final TextView a;
    public final int b;
    public final /* synthetic */ HorizontalBarView c;

    public af9(HorizontalBarView horizontalBarView, TextView textView, int i) {
        textView.getClass();
        this.c = horizontalBarView;
        this.a = textView;
        this.b = i;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        this.a.post(new yq5(this, mz1.i(this.b, "%"), this.c));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        animator.getClass();
    }
}
