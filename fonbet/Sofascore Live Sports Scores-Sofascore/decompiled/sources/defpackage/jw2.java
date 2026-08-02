package defpackage;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class jw2 extends rn5 {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;
    public EditText i;
    public final s0 j;
    public final jr2 k;
    public AnimatorSet l;
    public ValueAnimator m;

    public jw2(qn5 qn5Var) {
        super(qn5Var);
        this.j = new s0(this, 14);
        this.k = new jr2(this, 1);
        this.e = x2a.M(qn5Var.getContext(), R.attr.motionDurationShort3, 100);
        this.f = x2a.M(qn5Var.getContext(), R.attr.motionDurationShort3, 150);
        this.g = yfa.E(qn5Var.getContext(), R.attr.motionEasingLinearInterpolator, e80.a);
        this.h = yfa.E(qn5Var.getContext(), R.attr.motionEasingEmphasizedInterpolator, e80.d);
    }

    @Override // defpackage.rn5
    public final void a() {
        if (this.b.p != null) {
            return;
        }
        s(t());
    }

    @Override // defpackage.rn5
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // defpackage.rn5
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // defpackage.rn5
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // defpackage.rn5
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // defpackage.rn5
    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // defpackage.rn5
    public final void l(EditText editText) {
        this.i = editText;
        this.a.setEndIconVisible(t());
    }

    @Override // defpackage.rn5
    public final void o(boolean z) {
        if (this.b.p == null) {
            return;
        }
        s(z);
    }

    @Override // defpackage.rn5
    public final void q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration(this.f);
        final int i = 1;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: hw2
            public final /* synthetic */ jw2 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = i;
                jw2 jw2Var = this.b;
                switch (i2) {
                    case 0:
                        jw2Var.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = jw2Var.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i2 = this.e;
        ofFloat2.setDuration(i2);
        final int i3 = 0;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: hw2
            public final /* synthetic */ jw2 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i22 = i3;
                jw2 jw2Var = this.b;
                switch (i22) {
                    case 0:
                        jw2Var.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = jw2Var.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.l.addListener(new iw2(this, i3));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i2);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: hw2
            public final /* synthetic */ jw2 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i22 = i3;
                jw2 jw2Var = this.b;
                switch (i22) {
                    case 0:
                        jw2Var.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = jw2Var.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        this.m = ofFloat3;
        ofFloat3.addListener(new iw2(this, i));
    }

    @Override // defpackage.rn5
    public final void r() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new y2(this, 28));
        }
    }

    public final void s(boolean z) {
        boolean z2 = this.b.d() == z;
        if (z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z2) {
                this.l.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.l.cancel();
        this.m.start();
        if (z2) {
            this.m.end();
        }
    }

    public final boolean t() {
        EditText editText = this.i;
        if (editText != null) {
            boolean z = editText.hasFocus() || this.d.hasFocus();
            boolean z2 = this.i.getText().length() > 0;
            boolean z3 = this.b.p != null;
            if (z && (z2 || z3)) {
                return true;
            }
        }
        return false;
    }
}
