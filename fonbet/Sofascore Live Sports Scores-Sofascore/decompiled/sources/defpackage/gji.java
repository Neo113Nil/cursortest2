package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class gji extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ cji b;
    public final /* synthetic */ hji c;

    public /* synthetic */ gji(hji hjiVar, cji cjiVar, int i) {
        this.a = i;
        this.c = hjiVar;
        this.b = cjiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        cji cjiVar = this.b;
        hji hjiVar = this.c;
        switch (i) {
            case 0:
                hjiVar.i(1);
                if (hjiVar.B) {
                    cjiVar.post(hjiVar.s);
                    hjiVar.B = false;
                    break;
                }
                break;
            case 1:
                hjiVar.i(2);
                if (hjiVar.B) {
                    cjiVar.post(hjiVar.s);
                    hjiVar.B = false;
                    break;
                }
                break;
            default:
                hjiVar.i(2);
                if (hjiVar.B) {
                    cjiVar.post(hjiVar.s);
                    hjiVar.B = false;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
        hji hjiVar = this.c;
        switch (i) {
            case 0:
                hjiVar.i(3);
                break;
            case 1:
                hjiVar.i(3);
                break;
            default:
                hjiVar.i(3);
                break;
        }
    }
}
