package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sne extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ one b;
    public final /* synthetic */ tne c;

    public /* synthetic */ sne(tne tneVar, one oneVar, int i) {
        this.a = i;
        this.c = tneVar;
        this.b = oneVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        one oneVar = this.b;
        tne tneVar = this.c;
        switch (i) {
            case 0:
                tneVar.i(1);
                if (tneVar.C) {
                    oneVar.post(tneVar.t);
                    tneVar.C = false;
                    break;
                }
                break;
            case 1:
                tneVar.i(2);
                if (tneVar.C) {
                    oneVar.post(tneVar.t);
                    tneVar.C = false;
                    break;
                }
                break;
            default:
                tneVar.i(2);
                if (tneVar.C) {
                    oneVar.post(tneVar.t);
                    tneVar.C = false;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
        tne tneVar = this.c;
        switch (i) {
            case 0:
                tneVar.i(3);
                break;
            case 1:
                tneVar.i(3);
                break;
            default:
                tneVar.i(3);
                break;
        }
    }
}
