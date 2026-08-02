package com.fyber.inneractive.sdk.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c extends AnimatorListenerAdapter {
    public final /* synthetic */ AnimatorSet a;
    public final /* synthetic */ FyberAdIdentifierLocal b;

    public c(FyberAdIdentifierLocal fyberAdIdentifierLocal, AnimatorSet animatorSet) {
        this.b = fyberAdIdentifierLocal;
        this.a = animatorSet;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        FyberAdIdentifierLocal fyberAdIdentifierLocal = this.b;
        if (fyberAdIdentifierLocal.o) {
            fyberAdIdentifierLocal.m.setImageResource(R.drawable.ia_fyber_info_button);
            FyberAdIdentifierLocal fyberAdIdentifierLocal2 = this.b;
            FyberAdIdentifierLocal.a(fyberAdIdentifierLocal2.m, fyberAdIdentifierLocal2.g);
        } else {
            Bitmap bitmap = fyberAdIdentifierLocal.r;
            ImageView imageView = fyberAdIdentifierLocal.m;
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
            } else {
                imageView.setImageResource(R.drawable.ia_digital_turbine_logo);
            }
            FyberAdIdentifierLocal.a(this.b.m, null);
        }
        this.a.start();
        this.b.p = this.a;
    }
}
