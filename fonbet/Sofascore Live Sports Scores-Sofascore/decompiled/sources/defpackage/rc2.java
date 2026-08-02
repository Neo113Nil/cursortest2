package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rc2 extends AnimatorListenerAdapter {
    public final /* synthetic */ m2d a;
    public final /* synthetic */ View b;

    public rc2(m2d m2dVar, View view) {
        this.a = m2dVar;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        int ordinal = this.a.ordinal();
        View view = this.b;
        if (ordinal == 0) {
            evl.q(view);
        } else if (ordinal == 1) {
            evl.s(view);
        } else {
            zzl.b();
        }
    }
}
