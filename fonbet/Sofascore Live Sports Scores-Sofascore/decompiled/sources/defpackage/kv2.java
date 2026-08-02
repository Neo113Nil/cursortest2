package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kv2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kv2(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mv2 mv2Var = (mv2) obj;
                lv2 lv2Var = (lv2) obj2;
                mv2.d(floatValue, lv2Var);
                mv2Var.a(floatValue, lv2Var, false);
                mv2Var.invalidateSelf();
                break;
            default:
                ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) obj2;
                layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ((zoi) obj).e.setLayoutParams(layoutParams);
                break;
        }
    }
}
