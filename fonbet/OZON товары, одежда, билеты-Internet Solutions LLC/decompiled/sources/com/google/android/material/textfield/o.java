package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.Y;
import j7.C7292a;
import j7.C7293b;
import java.util.ArrayList;
import ru.ozon.app.android.R;

/* loaded from: classes9.dex */
final class o {

    /* renamed from: a, reason: collision with root package name */
    private final Context f58753a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final TextInputLayout f58754b;

    /* renamed from: c, reason: collision with root package name */
    private LinearLayout f58755c;

    /* renamed from: d, reason: collision with root package name */
    private int f58756d;

    /* renamed from: e, reason: collision with root package name */
    private FrameLayout f58757e;

    /* renamed from: f, reason: collision with root package name */
    private AnimatorSet f58758f;

    /* renamed from: g, reason: collision with root package name */
    private final float f58759g;

    /* renamed from: h, reason: collision with root package name */
    private int f58760h;

    /* renamed from: i, reason: collision with root package name */
    private int f58761i;

    /* renamed from: j, reason: collision with root package name */
    private CharSequence f58762j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f58763k;

    /* renamed from: l, reason: collision with root package name */
    private AppCompatTextView f58764l;

    /* renamed from: m, reason: collision with root package name */
    private CharSequence f58765m;

    /* renamed from: n, reason: collision with root package name */
    private int f58766n;

    /* renamed from: o, reason: collision with root package name */
    private ColorStateList f58767o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f58768p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f58769q;

    /* renamed from: r, reason: collision with root package name */
    private AppCompatTextView f58770r;

    /* renamed from: s, reason: collision with root package name */
    private int f58771s;

    /* renamed from: t, reason: collision with root package name */
    private ColorStateList f58772t;

    final class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f58773a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f58774b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f58775c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f58776d;

        a(int i11, TextView textView, int i12, TextView textView2) {
            this.f58773a = i11;
            this.f58774b = textView;
            this.f58775c = i12;
            this.f58776d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            o oVar = o.this;
            oVar.f58760h = this.f58773a;
            oVar.f58758f = null;
            TextView textView = this.f58774b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f58775c == 1 && oVar.f58764l != null) {
                    oVar.f58764l.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f58776d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                textView2.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            TextView textView = this.f58776d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    final class b extends View.AccessibilityDelegate {
        b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = o.this.f58754b.f58659e;
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public o(@NonNull TextInputLayout textInputLayout) {
        this.f58753a = textInputLayout.getContext();
        this.f58754b = textInputLayout;
        this.f58759g = r0.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    private boolean A(AppCompatTextView appCompatTextView, @NonNull CharSequence charSequence) {
        int i11 = Y.f42258g;
        TextInputLayout textInputLayout = this.f58754b;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f58761i == this.f58760h && appCompatTextView != null && TextUtils.equals(appCompatTextView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    private void D(int i11, int i12, boolean z11) {
        o oVar;
        TextView j11;
        TextView j12;
        if (i11 == i12) {
            return;
        }
        if (z11) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f58758f = animatorSet;
            ArrayList arrayList = new ArrayList();
            oVar = this;
            oVar.h(arrayList, this.f58769q, this.f58770r, 2, i11, i12);
            oVar.h(arrayList, oVar.f58763k, oVar.f58764l, 1, i11, i12);
            C7293b.a(animatorSet, arrayList);
            animatorSet.addListener(oVar.new a(i12, j(i11), i11, j(i12)));
            animatorSet.start();
        } else {
            oVar = this;
            if (i11 != i12) {
                if (i12 != 0 && (j12 = j(i12)) != null) {
                    j12.setVisibility(0);
                    j12.setAlpha(1.0f);
                }
                if (i11 != 0 && (j11 = j(i11)) != null) {
                    j11.setVisibility(4);
                    if (i11 == 1) {
                        j11.setText((CharSequence) null);
                    }
                }
                oVar.f58760h = i12;
            }
        }
        TextInputLayout textInputLayout = oVar.f58754b;
        textInputLayout.s0();
        textInputLayout.w0(z11);
        textInputLayout.C0();
    }

    private void h(@NonNull ArrayList arrayList, boolean z11, AppCompatTextView appCompatTextView, int i11, int i12, int i13) {
        if (appCompatTextView == null || !z11) {
            return;
        }
        if (i11 == i13 || i11 == i12) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.ALPHA, i13 == i11 ? 1.0f : 0.0f);
            ofFloat.setDuration(167L);
            ofFloat.setInterpolator(C7292a.f69463a);
            arrayList.add(ofFloat);
            if (i13 == i11) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.TRANSLATION_Y, -this.f58759g, 0.0f);
                ofFloat2.setDuration(217L);
                ofFloat2.setInterpolator(C7292a.f69466d);
                arrayList.add(ofFloat2);
            }
        }
    }

    private TextView j(int i11) {
        if (i11 == 1) {
            return this.f58764l;
        }
        if (i11 != 2) {
            return null;
        }
        return this.f58770r;
    }

    final void B(CharSequence charSequence) {
        g();
        this.f58762j = charSequence;
        this.f58764l.setText(charSequence);
        int i11 = this.f58760h;
        if (i11 != 1) {
            this.f58761i = 1;
        }
        D(i11, this.f58761i, A(this.f58764l, charSequence));
    }

    final void C(CharSequence charSequence) {
        g();
        this.f58768p = charSequence;
        this.f58770r.setText(charSequence);
        int i11 = this.f58760h;
        if (i11 != 2) {
            this.f58761i = 2;
        }
        D(i11, this.f58761i, A(this.f58770r, charSequence));
    }

    final void e(AppCompatTextView appCompatTextView, int i11) {
        if (this.f58755c == null && this.f58757e == null) {
            Context context = this.f58753a;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f58755c = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f58755c;
            TextInputLayout textInputLayout = this.f58754b;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f58757e = new FrameLayout(context);
            this.f58755c.addView(this.f58757e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.f58659e != null) {
                f();
            }
        }
        if (i11 == 0 || i11 == 1) {
            this.f58757e.setVisibility(0);
            this.f58757e.addView(appCompatTextView);
        } else {
            this.f58755c.addView(appCompatTextView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f58755c.setVisibility(0);
        this.f58756d++;
    }

    final void f() {
        EditText editText;
        if (this.f58755c == null || (editText = this.f58754b.f58659e) == null) {
            return;
        }
        Context context = this.f58753a;
        boolean d11 = v7.c.d(context);
        LinearLayout linearLayout = this.f58755c;
        int i11 = Y.f42258g;
        int paddingStart = editText.getPaddingStart();
        if (d11) {
            paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
        if (d11) {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
        }
        int paddingEnd = editText.getPaddingEnd();
        if (d11) {
            paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
        }
        linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
    }

    final void g() {
        AnimatorSet animatorSet = this.f58758f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    final boolean i() {
        return (this.f58761i != 1 || this.f58764l == null || TextUtils.isEmpty(this.f58762j)) ? false : true;
    }

    final CharSequence k() {
        return this.f58762j;
    }

    final int l() {
        AppCompatTextView appCompatTextView = this.f58764l;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    final ColorStateList m() {
        AppCompatTextView appCompatTextView = this.f58764l;
        if (appCompatTextView != null) {
            return appCompatTextView.getTextColors();
        }
        return null;
    }

    final CharSequence n() {
        return this.f58768p;
    }

    final AppCompatTextView o() {
        return this.f58770r;
    }

    final void p() {
        this.f58762j = null;
        g();
        if (this.f58760h == 1) {
            if (!this.f58769q || TextUtils.isEmpty(this.f58768p)) {
                this.f58761i = 0;
            } else {
                this.f58761i = 2;
            }
        }
        D(this.f58760h, this.f58761i, A(this.f58764l, ""));
    }

    final boolean q() {
        return this.f58763k;
    }

    final boolean r() {
        return this.f58769q;
    }

    final void s(AppCompatTextView appCompatTextView, int i11) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f58755c;
        if (linearLayout == null) {
            return;
        }
        if ((i11 == 0 || i11 == 1) && (frameLayout = this.f58757e) != null) {
            frameLayout.removeView(appCompatTextView);
        } else {
            linearLayout.removeView(appCompatTextView);
        }
        int i12 = this.f58756d - 1;
        this.f58756d = i12;
        LinearLayout linearLayout2 = this.f58755c;
        if (i12 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    final void t(CharSequence charSequence) {
        this.f58765m = charSequence;
        AppCompatTextView appCompatTextView = this.f58764l;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    final void u(boolean z11) {
        if (this.f58763k == z11) {
            return;
        }
        g();
        if (z11) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f58753a);
            this.f58764l = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_error);
            this.f58764l.setTextAlignment(5);
            v(this.f58766n);
            w(this.f58767o);
            t(this.f58765m);
            this.f58764l.setVisibility(4);
            AppCompatTextView appCompatTextView2 = this.f58764l;
            int i11 = Y.f42258g;
            appCompatTextView2.setAccessibilityLiveRegion(1);
            e(this.f58764l, 0);
        } else {
            p();
            s(this.f58764l, 0);
            this.f58764l = null;
            TextInputLayout textInputLayout = this.f58754b;
            textInputLayout.s0();
            textInputLayout.C0();
        }
        this.f58763k = z11;
    }

    final void v(int i11) {
        this.f58766n = i11;
        AppCompatTextView appCompatTextView = this.f58764l;
        if (appCompatTextView != null) {
            this.f58754b.o0(appCompatTextView, i11);
        }
    }

    final void w(ColorStateList colorStateList) {
        this.f58767o = colorStateList;
        AppCompatTextView appCompatTextView = this.f58764l;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    final void x(int i11) {
        this.f58771s = i11;
        AppCompatTextView appCompatTextView = this.f58770r;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i11);
        }
    }

    final void y(boolean z11) {
        if (this.f58769q == z11) {
            return;
        }
        g();
        if (z11) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f58753a);
            this.f58770r = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_helper_text);
            this.f58770r.setTextAlignment(5);
            this.f58770r.setVisibility(4);
            AppCompatTextView appCompatTextView2 = this.f58770r;
            int i11 = Y.f42258g;
            appCompatTextView2.setAccessibilityLiveRegion(1);
            x(this.f58771s);
            z(this.f58772t);
            e(this.f58770r, 1);
            this.f58770r.setAccessibilityDelegate(new b());
        } else {
            g();
            int i12 = this.f58760h;
            if (i12 == 2) {
                this.f58761i = 0;
            }
            D(i12, this.f58761i, A(this.f58770r, ""));
            s(this.f58770r, 1);
            this.f58770r = null;
            TextInputLayout textInputLayout = this.f58754b;
            textInputLayout.s0();
            textInputLayout.C0();
        }
        this.f58769q = z11;
    }

    final void z(ColorStateList colorStateList) {
        this.f58772t = colorStateList;
        AppCompatTextView appCompatTextView = this.f58770r;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }
}
