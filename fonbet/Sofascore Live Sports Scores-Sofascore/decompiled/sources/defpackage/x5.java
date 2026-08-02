package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.widget.ImageView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class x5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArgbEvaluator b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ImageView e;

    public /* synthetic */ x5(ArgbEvaluator argbEvaluator, int i, int i2, ImageView imageView, int i3) {
        this.a = i3;
        this.b = argbEvaluator;
        this.c = i;
        this.d = i2;
        this.e = imageView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        ImageView imageView = this.e;
        int i2 = this.d;
        int i3 = this.c;
        ArgbEvaluator argbEvaluator = this.b;
        Object i4 = fn0.i(valueAnimator);
        switch (i) {
            case 0:
                Object evaluate = argbEvaluator.evaluate(((Float) i4).floatValue(), Integer.valueOf(i3), Integer.valueOf(i2));
                evaluate.getClass();
                imageView.setImageTintList(ColorStateList.valueOf(((Integer) evaluate).intValue()));
                break;
            default:
                Object evaluate2 = argbEvaluator.evaluate(((Float) i4).floatValue(), Integer.valueOf(i3), Integer.valueOf(i2));
                evaluate2.getClass();
                imageView.setImageTintList(ColorStateList.valueOf(((Integer) evaluate2).intValue()));
                break;
        }
    }
}
