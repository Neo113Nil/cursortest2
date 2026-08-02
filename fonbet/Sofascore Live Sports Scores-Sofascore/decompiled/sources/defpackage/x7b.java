package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class x7b extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ y7b b;

    public /* synthetic */ x7b(y7b y7bVar, int i) {
        this.a = i;
        this.b = y7bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                y7b y7bVar = this.b;
                y7bVar.d();
                p50 p50Var = y7bVar.j;
                if (p50Var != null) {
                    p50Var.a((v0a) y7bVar.a);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationRepeat(animator);
                y7b y7bVar = this.b;
                y7bVar.g = (y7bVar.g + 1) % y7bVar.f.e.length;
                y7bVar.h = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
