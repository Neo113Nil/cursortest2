package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class yoi extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup.LayoutParams a;
    public final /* synthetic */ int b;
    public final /* synthetic */ zoi c;

    public yoi(zoi zoiVar, ViewGroup.LayoutParams layoutParams, int i) {
        this.c = zoiVar;
        this.a = layoutParams;
        this.b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        zoi zoiVar = this.c;
        hpo hpoVar = zoiVar.f;
        View view = zoiVar.e;
        y0 y0Var = (y0) hpoVar.a;
        if (y0Var.f() != null) {
            y0Var.f().onClick(view);
        }
        view.setAlpha(1.0f);
        view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        int i = this.b;
        ViewGroup.LayoutParams layoutParams = this.a;
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }
}
