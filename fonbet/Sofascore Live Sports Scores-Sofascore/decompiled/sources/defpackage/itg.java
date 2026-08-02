package defpackage;

import android.animation.Animator;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class itg implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ jtg b;

    public /* synthetic */ itg(jtg jtgVar, int i) {
        this.a = i;
        this.b = jtgVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        animator.getClass();
        switch (i) {
            case 0:
                jtg jtgVar = this.b;
                jtgVar.g = jtgVar.f ? 3 : 2;
                Iterator it = jtgVar.a.iterator();
                while (it.hasNext()) {
                    ((p50) it.next()).a(jtgVar);
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
        switch (i) {
            case 0:
                break;
            default:
                this.b.g = 1;
                break;
        }
    }
}
