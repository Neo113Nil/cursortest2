package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.b0;
import androidx.core.view.Y;
import com.google.android.material.internal.CheckableImageButton;
import ru.ozon.app.android.R;
import s7.C9621p;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes9.dex */
final class s extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final TextInputLayout f58789a;

    /* renamed from: b, reason: collision with root package name */
    private final AppCompatTextView f58790b;

    /* renamed from: c, reason: collision with root package name */
    private CharSequence f58791c;

    /* renamed from: d, reason: collision with root package name */
    private final CheckableImageButton f58792d;

    /* renamed from: e, reason: collision with root package name */
    private ColorStateList f58793e;

    /* renamed from: f, reason: collision with root package name */
    private PorterDuff.Mode f58794f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f58795g;

    s(TextInputLayout textInputLayout, b0 b0Var) {
        super(textInputLayout.getContext());
        CharSequence p11;
        this.f58789a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f58792d = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f58790b = appCompatTextView;
        if (v7.c.d(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        n.d(checkableImageButton);
        n.e(checkableImageButton);
        if (b0Var.s(62)) {
            this.f58793e = v7.c.b(getContext(), b0Var, 62);
        }
        if (b0Var.s(63)) {
            this.f58794f = C9621p.e(b0Var.k(63, -1), null);
        }
        if (b0Var.s(61)) {
            Drawable g10 = b0Var.g(61);
            checkableImageButton.setImageDrawable(g10);
            if (g10 != null) {
                n.a(textInputLayout, checkableImageButton, this.f58793e, this.f58794f);
                if (checkableImageButton.getVisibility() != 0) {
                    checkableImageButton.setVisibility(0);
                    j();
                    k();
                }
                e();
            } else {
                if (checkableImageButton.getVisibility() == 0) {
                    checkableImageButton.setVisibility(8);
                    j();
                    k();
                }
                n.d(checkableImageButton);
                n.e(checkableImageButton);
                if (checkableImageButton.getContentDescription() != null) {
                    checkableImageButton.setContentDescription(null);
                }
            }
            if (b0Var.s(60) && checkableImageButton.getContentDescription() != (p11 = b0Var.p(60))) {
                checkableImageButton.setContentDescription(p11);
            }
            checkableImageButton.b(b0Var.a(59, true));
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        int i11 = Y.f42258g;
        appCompatTextView.setAccessibilityLiveRegion(1);
        g(b0Var.n(55, 0));
        if (b0Var.s(56)) {
            h(b0Var.c(56));
        }
        f(b0Var.p(54));
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    private void k() {
        int i11 = (this.f58791c == null || this.f58795g) ? 8 : 0;
        setVisibility((this.f58792d.getVisibility() == 0 || i11 == 0) ? 0 : 8);
        this.f58790b.setVisibility(i11);
        this.f58789a.r0();
    }

    final CharSequence a() {
        return this.f58791c;
    }

    @NonNull
    final TextView b() {
        return this.f58790b;
    }

    final Drawable c() {
        return this.f58792d.getDrawable();
    }

    final void d(boolean z11) {
        this.f58795g = z11;
        k();
    }

    final void e() {
        n.b(this.f58789a, this.f58792d, this.f58793e);
    }

    final void f(CharSequence charSequence) {
        this.f58791c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f58790b.setText(charSequence);
        k();
    }

    final void g(int i11) {
        this.f58790b.setTextAppearance(i11);
    }

    final void h(@NonNull ColorStateList colorStateList) {
        this.f58790b.setTextColor(colorStateList);
    }

    final void i(@NonNull y2.q qVar) {
        AppCompatTextView appCompatTextView = this.f58790b;
        if (appCompatTextView.getVisibility() != 0) {
            qVar.u0(this.f58792d);
        } else {
            qVar.Z(appCompatTextView);
            qVar.u0(appCompatTextView);
        }
    }

    final void j() {
        int paddingStart;
        EditText editText = this.f58789a.f58659e;
        if (editText == null) {
            return;
        }
        if (this.f58792d.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            int i11 = Y.f42258g;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        int i12 = Y.f42258g;
        this.f58790b.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        j();
    }
}
