package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class n88 extends AnimatorListenerAdapter {
    public boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ r88 c;

    public n88(r88 r88Var, boolean z) {
        this.c = r88Var;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        r88 r88Var = this.c;
        r88Var.r = 0;
        r88Var.m = null;
        if (this.a) {
            return;
        }
        FloatingActionButton floatingActionButton = r88Var.s;
        boolean z = this.b;
        floatingActionButton.a(z ? 8 : 4, z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        r88 r88Var = this.c;
        r88Var.s.a(0, this.b);
        r88Var.r = 1;
        r88Var.m = animator;
        this.a = false;
    }
}
