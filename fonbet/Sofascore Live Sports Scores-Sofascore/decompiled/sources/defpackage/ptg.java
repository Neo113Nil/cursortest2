package defpackage;

import android.animation.Animator;
import android.widget.LinearLayout;
import com.sofascore.results.chat.view.ScoreUpdateView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ptg implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScoreUpdateView b;

    public /* synthetic */ ptg(ScoreUpdateView scoreUpdateView, int i) {
        this.a = i;
        this.b = scoreUpdateView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        animator.getClass();
        switch (i) {
            case 0:
                this.b.l();
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
                break;
            default:
                ((LinearLayout) this.b.d.d).setVisibility(0);
                break;
        }
    }
}
