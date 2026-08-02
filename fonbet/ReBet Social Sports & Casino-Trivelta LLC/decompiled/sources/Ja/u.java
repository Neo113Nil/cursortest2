package Ja;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C2068x;
import com.google.android.material.textfield.TextInputLayout;
import ja.AbstractC5104a;
import ja.AbstractC5105b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f6019A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f6020B;

    /* renamed from: a, reason: collision with root package name */
    public final int f6021a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6022b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6023c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f6024d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f6025e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f6026f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f6027g;

    /* renamed from: h, reason: collision with root package name */
    public final TextInputLayout f6028h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f6029i;

    /* renamed from: j, reason: collision with root package name */
    public int f6030j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f6031k;

    /* renamed from: l, reason: collision with root package name */
    public Animator f6032l;

    /* renamed from: m, reason: collision with root package name */
    public final float f6033m;

    /* renamed from: n, reason: collision with root package name */
    public int f6034n;

    /* renamed from: o, reason: collision with root package name */
    public int f6035o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f6036p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f6037q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f6038r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f6039s;

    /* renamed from: t, reason: collision with root package name */
    public int f6040t;

    /* renamed from: u, reason: collision with root package name */
    public int f6041u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f6042v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f6043w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f6044x;

    /* renamed from: y, reason: collision with root package name */
    public TextView f6045y;

    /* renamed from: z, reason: collision with root package name */
    public int f6046z;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f6047a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextView f6048b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f6049c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ TextView f6050d;

        public a(int i10, TextView textView, int i11, TextView textView2) {
            this.f6047a = i10;
            this.f6048b = textView;
            this.f6049c = i11;
            this.f6050d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            u.this.f6034n = this.f6047a;
            u.this.f6032l = null;
            TextView textView = this.f6048b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f6049c == 1 && u.this.f6038r != null) {
                    u.this.f6038r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f6050d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f6050d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f6050d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f6050d.setAlpha(0.0f);
            }
        }
    }

    public class b extends View.AccessibilityDelegate {
        public b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = u.this.f6028h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public u(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f6027g = context;
        this.f6028h = textInputLayout;
        this.f6033m = context.getResources().getDimensionPixelSize(ia.e.f48364r);
        this.f6021a = za.h.f(context, ia.c.f48220Y, 217);
        this.f6022b = za.h.f(context, ia.c.f48217V, 167);
        this.f6023c = za.h.f(context, ia.c.f48220Y, 167);
        this.f6024d = za.h.g(context, ia.c.f48223a0, AbstractC5104a.f53861d);
        int i10 = ia.c.f48223a0;
        TimeInterpolator timeInterpolator = AbstractC5104a.f53858a;
        this.f6025e = za.h.g(context, i10, timeInterpolator);
        this.f6026f = za.h.g(context, ia.c.f48227c0, timeInterpolator);
    }

    public boolean A() {
        return this.f6037q;
    }

    public boolean B() {
        return this.f6044x;
    }

    public void C(TextView textView, int i10) {
        FrameLayout frameLayout;
        if (this.f6029i == null) {
            return;
        }
        if (!z(i10) || (frameLayout = this.f6031k) == null) {
            this.f6029i.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i11 = this.f6030j - 1;
        this.f6030j = i11;
        O(this.f6029i, i11);
    }

    public final void D(int i10, int i11) {
        TextView m10;
        TextView m11;
        if (i10 == i11) {
            return;
        }
        if (i11 != 0 && (m11 = m(i11)) != null) {
            m11.setVisibility(0);
            m11.setAlpha(1.0f);
        }
        if (i10 != 0 && (m10 = m(i10)) != null) {
            m10.setVisibility(4);
            if (i10 == 1) {
                m10.setText((CharSequence) null);
            }
        }
        this.f6034n = i11;
    }

    public void E(int i10) {
        this.f6040t = i10;
        TextView textView = this.f6038r;
        if (textView != null) {
            textView.setAccessibilityLiveRegion(i10);
        }
    }

    public void F(CharSequence charSequence) {
        this.f6039s = charSequence;
        TextView textView = this.f6038r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void G(boolean z10) {
        if (this.f6037q == z10) {
            return;
        }
        h();
        if (z10) {
            C2068x c2068x = new C2068x(this.f6027g);
            this.f6038r = c2068x;
            c2068x.setId(ia.g.f48436i0);
            this.f6038r.setTextAlignment(5);
            Typeface typeface = this.f6020B;
            if (typeface != null) {
                this.f6038r.setTypeface(typeface);
            }
            H(this.f6041u);
            I(this.f6042v);
            F(this.f6039s);
            E(this.f6040t);
            this.f6038r.setVisibility(4);
            e(this.f6038r, 0);
        } else {
            w();
            C(this.f6038r, 0);
            this.f6038r = null;
            this.f6028h.q0();
            this.f6028h.C0();
        }
        this.f6037q = z10;
    }

    public void H(int i10) {
        this.f6041u = i10;
        TextView textView = this.f6038r;
        if (textView != null) {
            this.f6028h.c0(textView, i10);
        }
    }

    public void I(ColorStateList colorStateList) {
        this.f6042v = colorStateList;
        TextView textView = this.f6038r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void J(int i10) {
        this.f6046z = i10;
        TextView textView = this.f6045y;
        if (textView != null) {
            C0.j.m(textView, i10);
        }
    }

    public void K(boolean z10) {
        if (this.f6044x == z10) {
            return;
        }
        h();
        if (z10) {
            C2068x c2068x = new C2068x(this.f6027g);
            this.f6045y = c2068x;
            c2068x.setId(ia.g.f48438j0);
            this.f6045y.setTextAlignment(5);
            Typeface typeface = this.f6020B;
            if (typeface != null) {
                this.f6045y.setTypeface(typeface);
            }
            this.f6045y.setVisibility(4);
            this.f6045y.setAccessibilityLiveRegion(1);
            J(this.f6046z);
            L(this.f6019A);
            e(this.f6045y, 1);
            this.f6045y.setAccessibilityDelegate(new b());
        } else {
            x();
            C(this.f6045y, 1);
            this.f6045y = null;
            this.f6028h.q0();
            this.f6028h.C0();
        }
        this.f6044x = z10;
    }

    public void L(ColorStateList colorStateList) {
        this.f6019A = colorStateList;
        TextView textView = this.f6045y;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public final void M(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    public void N(Typeface typeface) {
        if (typeface != this.f6020B) {
            this.f6020B = typeface;
            M(this.f6038r, typeface);
            M(this.f6045y, typeface);
        }
    }

    public final void O(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    public final boolean P(TextView textView, CharSequence charSequence) {
        if (this.f6028h.isLaidOut() && this.f6028h.isEnabled()) {
            return (this.f6035o == this.f6034n && textView != null && TextUtils.equals(textView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public void Q(CharSequence charSequence) {
        h();
        this.f6036p = charSequence;
        this.f6038r.setText(charSequence);
        int i10 = this.f6034n;
        if (i10 != 1) {
            this.f6035o = 1;
        }
        S(i10, this.f6035o, P(this.f6038r, charSequence));
    }

    public void R(CharSequence charSequence) {
        h();
        this.f6043w = charSequence;
        this.f6045y.setText(charSequence);
        int i10 = this.f6034n;
        if (i10 != 2) {
            this.f6035o = 2;
        }
        S(i10, this.f6035o, P(this.f6045y, charSequence));
    }

    public final void S(int i10, int i11, boolean z10) {
        u uVar;
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f6032l = animatorSet;
            ArrayList arrayList = new ArrayList();
            uVar = this;
            uVar.i(arrayList, this.f6044x, this.f6045y, 2, i10, i11);
            uVar.i(arrayList, uVar.f6037q, uVar.f6038r, 1, i10, i11);
            AbstractC5105b.a(animatorSet, arrayList);
            animatorSet.addListener(uVar.new a(i11, m(i10), i10, m(i11)));
            animatorSet.start();
        } else {
            uVar = this;
            D(i10, i11);
        }
        uVar.f6028h.q0();
        uVar.f6028h.w0(z10);
        uVar.f6028h.C0();
    }

    public void e(TextView textView, int i10) {
        if (this.f6029i == null && this.f6031k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f6027g);
            this.f6029i = linearLayout;
            linearLayout.setOrientation(0);
            this.f6028h.addView(this.f6029i, -1, -2);
            this.f6031k = new FrameLayout(this.f6027g);
            this.f6029i.addView(this.f6031k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f6028h.getEditText() != null) {
                f();
            }
        }
        if (z(i10)) {
            this.f6031k.setVisibility(0);
            this.f6031k.addView(textView);
        } else {
            this.f6029i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f6029i.setVisibility(0);
        this.f6030j++;
    }

    public void f() {
        if (g()) {
            EditText editText = this.f6028h.getEditText();
            boolean k10 = Ca.c.k(this.f6027g);
            this.f6029i.setPaddingRelative(v(k10, ia.e.f48325V, editText.getPaddingStart()), v(k10, ia.e.f48326W, this.f6027g.getResources().getDimensionPixelSize(ia.e.f48324U)), v(k10, ia.e.f48325V, editText.getPaddingEnd()), 0);
        }
    }

    public final boolean g() {
        return (this.f6029i == null || this.f6028h.getEditText() == null) ? false : true;
    }

    public void h() {
        Animator animator = this.f6032l;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void i(List list, boolean z10, TextView textView, int i10, int i11, int i12) {
        if (textView == null || !z10) {
            return;
        }
        if (i10 == i12 || i10 == i11) {
            ObjectAnimator j10 = j(textView, i12 == i10);
            if (i10 == i12 && i11 != 0) {
                j10.setStartDelay(this.f6023c);
            }
            list.add(j10);
            if (i12 != i10 || i11 == 0) {
                return;
            }
            ObjectAnimator k10 = k(textView);
            k10.setStartDelay(this.f6023c);
            list.add(k10);
        }
    }

    public final ObjectAnimator j(TextView textView, boolean z10) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
        ofFloat.setDuration(z10 ? this.f6022b : this.f6023c);
        ofFloat.setInterpolator(z10 ? this.f6025e : this.f6026f);
        return ofFloat;
    }

    public final ObjectAnimator k(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f6033m, 0.0f);
        ofFloat.setDuration(this.f6021a);
        ofFloat.setInterpolator(this.f6024d);
        return ofFloat;
    }

    public boolean l() {
        return y(this.f6035o);
    }

    public final TextView m(int i10) {
        if (i10 == 1) {
            return this.f6038r;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f6045y;
    }

    public int n() {
        return this.f6040t;
    }

    public CharSequence o() {
        return this.f6039s;
    }

    public CharSequence p() {
        return this.f6036p;
    }

    public int q() {
        TextView textView = this.f6038r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public ColorStateList r() {
        TextView textView = this.f6038r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    public CharSequence s() {
        return this.f6043w;
    }

    public View t() {
        return this.f6045y;
    }

    public int u() {
        TextView textView = this.f6045y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final int v(boolean z10, int i10, int i11) {
        return z10 ? this.f6027g.getResources().getDimensionPixelSize(i10) : i11;
    }

    public void w() {
        this.f6036p = null;
        h();
        if (this.f6034n == 1) {
            if (!this.f6044x || TextUtils.isEmpty(this.f6043w)) {
                this.f6035o = 0;
            } else {
                this.f6035o = 2;
            }
        }
        S(this.f6034n, this.f6035o, P(this.f6038r, ""));
    }

    public void x() {
        h();
        int i10 = this.f6034n;
        if (i10 == 2) {
            this.f6035o = 0;
        }
        S(i10, this.f6035o, P(this.f6045y, ""));
    }

    public final boolean y(int i10) {
        return (i10 != 1 || this.f6038r == null || TextUtils.isEmpty(this.f6036p)) ? false : true;
    }

    public boolean z(int i10) {
        return i10 == 0 || i10 == 1;
    }
}
