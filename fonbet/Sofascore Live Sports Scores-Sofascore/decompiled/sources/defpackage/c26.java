package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.sofascore.results.view.EventListScoreTextView;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c26 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventListScoreTextView b;

    public /* synthetic */ c26(EventListScoreTextView eventListScoreTextView, int i) {
        this.a = i;
        this.b = eventListScoreTextView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        EventListScoreTextView eventListScoreTextView = this.b;
        animator.getClass();
        switch (i) {
            case 0:
                eventListScoreTextView.b = null;
                break;
            case 1:
                eventListScoreTextView.c = null;
                break;
            default:
                String str = eventListScoreTextView.g;
                eventListScoreTextView.f = str;
                eventListScoreTextView.setContentDescription(str);
                o13.C(eventListScoreTextView.a);
                a26 a26Var = (a26) CollectionsKt.firstOrNull(eventListScoreTextView.a);
                if (a26Var != null) {
                    ValueAnimator valueAnimator = a26Var.b;
                    eventListScoreTextView.d(a26Var.c);
                    valueAnimator.start();
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
