package com.vk.attachpicker.screen;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import com.vk.attachpicker.screen.a;
import com.vk.attachpicker.widget.ClippingView;
import xsna.f4m;
import xsna.p31;

/* compiled from: BaseViewerScreen.kt */
/* loaded from: classes15.dex */
public final class b extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ a c;
    public final /* synthetic */ a.c d;

    public b(a.c cVar, a aVar, boolean z) {
        this.b = z;
        this.c = aVar;
        this.d = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        onAnimationEnd(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a aVar = this.c;
        a.C0386a c0386a = aVar.l;
        ColorDrawable colorDrawable = aVar.g;
        if (colorDrawable == null) {
            colorDrawable = null;
        }
        c0386a.setBackground(colorDrawable);
        ClippingView clippingView = aVar.m;
        if (clippingView != null) {
            f4m.j(clippingView);
        }
        aVar.s().setVisibility(0);
        aVar.E();
        Activity activity = aVar.k;
        if (activity != null) {
            aVar.j.b(activity);
        }
        aVar.I(false);
        aVar.t.set(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.b) {
            this.c.n.postDelayed(new p31(this.d, 1), 70L);
        }
    }
}
