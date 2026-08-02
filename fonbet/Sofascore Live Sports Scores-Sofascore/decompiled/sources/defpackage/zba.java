package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.u;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zba implements Animator.AnimatorListener {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final u e;
    public final int f;
    public final ValueAnimator g;
    public boolean h;
    public float i;
    public float j;
    public boolean k = false;
    public boolean l = false;
    public float m;
    public final /* synthetic */ int n;
    public final /* synthetic */ u o;
    public final /* synthetic */ eca p;

    public zba(eca ecaVar, u uVar, int i, float f, float f2, float f3, float f4, int i2, u uVar2) {
        this.p = ecaVar;
        this.n = i2;
        this.o = uVar2;
        this.f = i;
        this.e = uVar;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        this.g = ofFloat;
        ofFloat.addUpdateListener(new wz1(this, 3));
        ofFloat.setTarget(uVar.itemView);
        ofFloat.addListener(this);
        this.m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void a(Animator animator) {
        if (!this.l) {
            this.e.setIsRecyclable(true);
        }
        this.l = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.m = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (this.k) {
            return;
        }
        int i = this.n;
        u uVar = this.o;
        eca ecaVar = this.p;
        if (i <= 0) {
            ecaVar.m.c(ecaVar.r, uVar);
        } else {
            ecaVar.a.add(uVar.itemView);
            this.h = true;
            if (i > 0) {
                ecaVar.r.post(new tc0((Object) ecaVar, (Object) this, i, 3, false));
            }
        }
        View view = ecaVar.w;
        View view2 = uVar.itemView;
        if (view == view2 && view2 == view) {
            ecaVar.w = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
