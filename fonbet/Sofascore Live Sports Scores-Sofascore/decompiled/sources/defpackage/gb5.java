package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class gb5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ hb5 b;

    public /* synthetic */ gb5(hb5 hb5Var, int i) {
        this.a = i;
        this.b = hb5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                hb5 hb5Var = this.b;
                super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
                ArrayList arrayList = hb5Var.g;
                if (arrayList != null && !hb5Var.h) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((p50) it.next()).a(hb5Var);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationStart(animator);
                hb5 hb5Var = this.b;
                ArrayList arrayList = hb5Var.g;
                if (arrayList != null && !hb5Var.h) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((p50) it.next()).b(hb5Var);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
