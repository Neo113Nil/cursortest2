package defpackage;

import android.animation.Animator;
import com.sofascore.results.event.details.view.cricket.wagonwheel.CricketWagonWheelGraphView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class j14 implements Animator.AnimatorListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ CricketWagonWheelGraphView b;
    public final /* synthetic */ int c;

    public j14(boolean z, CricketWagonWheelGraphView cricketWagonWheelGraphView, int i) {
        this.a = z;
        this.b = cricketWagonWheelGraphView;
        this.c = i;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        if (this.a) {
            this.b.w.remove(Integer.valueOf(this.c));
        }
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
