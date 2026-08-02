package defpackage;

import android.animation.Animator;
import android.widget.TextView;
import com.sofascore.results.event.details.view.HorizontalBarView;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bf9 implements Animator.AnimatorListener {
    public final /* synthetic */ HorizontalBarView a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Integer c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Function0 e;

    public bf9(HorizontalBarView horizontalBarView, int i, Integer num, int i2, Function0 function0) {
        this.a = horizontalBarView;
        this.b = i;
        this.c = num;
        this.d = i2;
        this.e = function0;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        bu1 bu1Var = this.a.d;
        HorizontalBarView.j((TextView) bu1Var.h, String.valueOf(this.b));
        HorizontalBarView.j((TextView) bu1Var.g, String.valueOf(this.c.intValue()));
        HorizontalBarView.j((TextView) bu1Var.e, String.valueOf(this.d));
        this.e.invoke();
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
