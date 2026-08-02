package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.recyclerview.widget.d;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class gm6 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public gm6(d dVar) {
        this.a = 1;
        this.c = dVar;
        this.b = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                if (!this.b) {
                    ((View) obj).setVisibility(4);
                    break;
                }
                break;
            case 1:
                d dVar = (d) obj;
                if (!this.b) {
                    if (((Float) dVar.z.getAnimatedValue()).floatValue() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        dVar.A = 2;
                        dVar.s.invalidate();
                        break;
                    } else {
                        dVar.A = 0;
                        dVar.i(0);
                        break;
                    }
                } else {
                    this.b = false;
                    break;
                }
            default:
                r88 r88Var = (r88) obj;
                r88Var.r = 0;
                r88Var.m = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                if (this.b) {
                    ((View) obj).setVisibility(0);
                    break;
                }
                break;
            case 1:
            default:
                super.onAnimationStart(animator);
                break;
            case 2:
                r88 r88Var = (r88) obj;
                r88Var.s.a(0, this.b);
                r88Var.r = 2;
                r88Var.m = animator;
                break;
        }
    }

    public gm6(View view, boolean z) {
        this.a = 0;
        this.b = z;
        this.c = view;
    }

    public gm6(r88 r88Var, boolean z) {
        this.a = 2;
        this.c = r88Var;
        this.b = z;
    }
}
