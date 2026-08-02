package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.widget.ProgressBar;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class fb6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArgbEvaluator b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ProgressBar e;

    public /* synthetic */ fb6(ArgbEvaluator argbEvaluator, int i, int i2, ProgressBar progressBar, int i3) {
        this.a = i3;
        this.b = argbEvaluator;
        this.c = i;
        this.d = i2;
        this.e = progressBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        ProgressBar progressBar = this.e;
        int i2 = this.d;
        int i3 = this.c;
        ArgbEvaluator argbEvaluator = this.b;
        switch (i) {
            case 0:
                Object evaluate = argbEvaluator.evaluate(((Float) fn0.i(valueAnimator)).floatValue(), Integer.valueOf(i3), Integer.valueOf(i2));
                evaluate.getClass();
                ((CircularProgressIndicator) progressBar).setIndicatorColor(((Integer) evaluate).intValue());
                break;
            default:
                Object evaluate2 = argbEvaluator.evaluate(((Float) fn0.i(valueAnimator)).floatValue(), Integer.valueOf(i3), Integer.valueOf(i2));
                evaluate2.getClass();
                progressBar.setProgressTintList(ColorStateList.valueOf(((Integer) evaluate2).intValue()));
                break;
        }
    }
}
