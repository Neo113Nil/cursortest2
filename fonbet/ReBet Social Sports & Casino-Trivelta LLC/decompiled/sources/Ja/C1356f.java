package Ja;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.plaid.internal.EnumC3631g;
import ja.AbstractC5104a;

/* renamed from: Ja.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1356f extends s {

    /* renamed from: e, reason: collision with root package name */
    public final int f5980e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5981f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f5982g;

    /* renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f5983h;

    /* renamed from: i, reason: collision with root package name */
    public EditText f5984i;

    /* renamed from: j, reason: collision with root package name */
    public final View.OnClickListener f5985j;

    /* renamed from: k, reason: collision with root package name */
    public final View.OnFocusChangeListener f5986k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f5987l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f5988m;

    /* renamed from: Ja.f$a */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1356f.this.f6016b.a0(true);
        }
    }

    /* renamed from: Ja.f$b */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1356f.this.f6016b.a0(false);
        }
    }

    public C1356f(com.google.android.material.textfield.a aVar) {
        super(aVar);
        this.f5985j = new View.OnClickListener() { // from class: Ja.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1356f.v(C1356f.this, view);
            }
        };
        this.f5986k = new View.OnFocusChangeListener() { // from class: Ja.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                r0.A(C1356f.this.E());
            }
        };
        this.f5980e = za.h.f(aVar.getContext(), ia.c.f48219X, 100);
        this.f5981f = za.h.f(aVar.getContext(), ia.c.f48219X, EnumC3631g.SDK_ASSET_ILLUSTRATION_SDK_NAVBAR_PLAID_LOGO_VALUE);
        this.f5982g = za.h.g(aVar.getContext(), ia.c.f48227c0, AbstractC5104a.f53858a);
        this.f5983h = za.h.g(aVar.getContext(), ia.c.f48225b0, AbstractC5104a.f53861d);
    }

    public static /* synthetic */ void v(C1356f c1356f, View view) {
        EditText editText = c1356f.f5984i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        c1356f.r();
    }

    public static /* synthetic */ void x(C1356f c1356f, ValueAnimator valueAnimator) {
        c1356f.getClass();
        c1356f.f6018d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(C1356f c1356f, ValueAnimator valueAnimator) {
        c1356f.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c1356f.f6018d.setScaleX(floatValue);
        c1356f.f6018d.setScaleY(floatValue);
    }

    public final void A(boolean z10) {
        boolean z11 = this.f6016b.F() == z10;
        if (z10 && !this.f5987l.isRunning()) {
            this.f5988m.cancel();
            this.f5987l.start();
            if (z11) {
                this.f5987l.end();
                return;
            }
            return;
        }
        if (z10) {
            return;
        }
        this.f5987l.cancel();
        this.f5988m.start();
        if (z11) {
            this.f5988m.end();
        }
    }

    public final ValueAnimator B(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f5982g);
        ofFloat.setDuration(this.f5980e);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Ja.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C1356f.x(C1356f.this, valueAnimator);
            }
        });
        return ofFloat;
    }

    public final ValueAnimator C() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f5983h);
        ofFloat.setDuration(this.f5981f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Ja.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C1356f.y(C1356f.this, valueAnimator);
            }
        });
        return ofFloat;
    }

    public final void D() {
        ValueAnimator C10 = C();
        ValueAnimator B10 = B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f5987l = animatorSet;
        animatorSet.playTogether(C10, B10);
        this.f5987l.addListener(new a());
        ValueAnimator B11 = B(1.0f, 0.0f);
        this.f5988m = B11;
        B11.addListener(new b());
    }

    public final boolean E() {
        EditText editText = this.f5984i;
        if (editText != null) {
            return (editText.hasFocus() || this.f6018d.hasFocus()) && this.f5984i.getText().length() > 0;
        }
        return false;
    }

    @Override // Ja.s
    public void a(Editable editable) {
        if (this.f6016b.w() != null) {
            return;
        }
        A(E());
    }

    @Override // Ja.s
    public int c() {
        return ia.k.f48527e;
    }

    @Override // Ja.s
    public int d() {
        return ia.f.f48390i;
    }

    @Override // Ja.s
    public View.OnFocusChangeListener e() {
        return this.f5986k;
    }

    @Override // Ja.s
    public View.OnClickListener f() {
        return this.f5985j;
    }

    @Override // Ja.s
    public View.OnFocusChangeListener g() {
        return this.f5986k;
    }

    @Override // Ja.s
    public void n(EditText editText) {
        this.f5984i = editText;
        this.f6015a.setEndIconVisible(E());
    }

    @Override // Ja.s
    public void q(boolean z10) {
        if (this.f6016b.w() == null) {
            return;
        }
        A(z10);
    }

    @Override // Ja.s
    public void s() {
        D();
    }

    @Override // Ja.s
    public void u() {
        EditText editText = this.f5984i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: Ja.d
                @Override // java.lang.Runnable
                public final void run() {
                    C1356f.this.A(true);
                }
            });
        }
    }
}
