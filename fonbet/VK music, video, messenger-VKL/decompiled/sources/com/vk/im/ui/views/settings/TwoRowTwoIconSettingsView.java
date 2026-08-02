package com.vk.im.ui.views.settings;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.ui.R$styleable;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.observable.q1;
import xsna.abg0;
import xsna.bwt0;
import xsna.cn70;
import xsna.dhr0;
import xsna.f4m;
import xsna.iah0;
import xsna.m33;
import xsna.myc0;
import xsna.qcy;
import xsna.too0;

/* compiled from: TwoRowTwoIconSettingsView.kt */
/* loaded from: classes2.dex */
public final class TwoRowTwoIconSettingsView extends LinearLayout implements too0 {
    public final AppCompatImageView b;
    public final AppCompatImageView c;
    public final TextView d;
    public final TextView e;
    public Integer f;
    public Integer g;

    public TwoRowTwoIconSettingsView(Context context) {
        this(context, null, 0, 14, 0);
    }

    @Override // xsna.too0
    public final void Ng() {
        Integer num = this.f;
        int intValue = num != null ? num.intValue() : R.attr.vk_legacy_text_primary;
        abg0 abg0Var = dhr0.t;
        this.d.setTextColor(abg0Var.c(intValue));
        this.e.setTextColor(abg0Var.c(R.attr.vk_legacy_text_secondary));
        Drawable leftIcon = getLeftIcon();
        if (leftIcon != null) {
            Integer num2 = this.g;
            leftIcon.setTint(abg0Var.c(num2 != null ? num2.intValue() : R.attr.vk_legacy_accent));
        }
    }

    public final int getIconSize() {
        return this.b.getLayoutParams().width;
    }

    public final Drawable getLeftIcon() {
        return this.b.getDrawable();
    }

    public final Drawable getRightIcon() {
        return this.c.getDrawable();
    }

    public final CharSequence getSubtitle() {
        return this.e.getText();
    }

    public final CharSequence getTitle() {
        return this.d.getText();
    }

    public final void setIconSize(int i) {
        bwt0.m0(i, i, this.b);
    }

    public final void setIconTint(int i) {
        this.g = Integer.valueOf(i);
        abg0 abg0Var = dhr0.t;
        bwt0.o0(this.b, abg0Var.c(i));
        bwt0.o0(this.c, abg0Var.c(i));
    }

    public final void setLeftIcon(Drawable drawable) {
        AppCompatImageView appCompatImageView = this.b;
        appCompatImageView.setImageDrawable(drawable);
        bwt0.p0(appCompatImageView, drawable != null);
    }

    public final void setRightIcon(Drawable drawable) {
        AppCompatImageView appCompatImageView = this.c;
        appCompatImageView.setImageDrawable(drawable);
        bwt0.p0(appCompatImageView, drawable != null);
    }

    public final void setSubtitle(CharSequence charSequence) {
        TextView textView = this.e;
        textView.setText(charSequence);
        textView.setVisibility((charSequence == null || !myc0.f(charSequence)) ? 8 : 0);
    }

    public final void setTitle(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public final void setTitleColor(int i) {
        this.f = Integer.valueOf(i);
        this.d.setTextColor(dhr0.t.c(i));
    }

    public TwoRowTwoIconSettingsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public TwoRowTwoIconSettingsView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ TwoRowTwoIconSettingsView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public TwoRowTwoIconSettingsView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        dhr0 dhr0Var = dhr0.a;
        setOrientation(0);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(cn70.b(28), cn70.b(28));
        layoutParams.setMarginEnd(cn70.b(16));
        layoutParams.gravity = 16;
        appCompatImageView.setLayoutParams(layoutParams);
        appCompatImageView.setContentDescription(null);
        appCompatImageView.setImportantForAccessibility(2);
        this.b = appCompatImageView;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(cn70.b(28), cn70.b(28));
        layoutParams2.setMarginEnd(cn70.b(16));
        layoutParams2.setMarginStart(cn70.b(16));
        layoutParams2.gravity = 16;
        appCompatImageView2.setLayoutParams(layoutParams2);
        appCompatImageView2.setContentDescription(null);
        appCompatImageView2.setImportantForAccessibility(2);
        this.c = appCompatImageView2;
        LinearLayout a = q1.a(1, context);
        a.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLayoutParams(layoutParams3);
        textView.setIncludeFontPadding(false);
        this.d = textView;
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        textView2.setMaxLines(2);
        f4m.y(iah0.a(4), textView2);
        textView2.setLayoutParams(layoutParams4);
        textView2.setIncludeFontPadding(false);
        this.e = textView2;
        a.addView(textView);
        a.addView(textView2);
        addView(appCompatImageView);
        addView(a);
        addView(appCompatImageView2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.n, i, i2);
        String string = obtainStyledAttributes.getString(6);
        setTitle(string == null ? "" : string);
        int resourceId = obtainStyledAttributes.getResourceId(7, 0);
        qcy<Object>[] qcyVarArr = bwt0.a;
        textView.setTextAppearance(resourceId);
        CharSequence string2 = obtainStyledAttributes.getString(3);
        setSubtitle(string2 != null ? string2 : "");
        textView2.setTextAppearance(obtainStyledAttributes.getResourceId(4, 0));
        int resourceId2 = obtainStyledAttributes.getResourceId(0, 0);
        setLeftIcon(resourceId2 > 0 ? m33.a(resourceId2, context) : null);
        setIconSize(obtainStyledAttributes.getDimensionPixelSize(1, cn70.b(28)));
        if (obtainStyledAttributes.hasValue(2)) {
            bwt0.o0(appCompatImageView, obtainStyledAttributes.getColor(2, -16777216));
            bwt0.o0(appCompatImageView2, obtainStyledAttributes.getColor(2, -16777216));
        }
        bwt0.p0(appCompatImageView, getLeftIcon() != null);
        bwt0.p0(appCompatImageView2, getRightIcon() != null);
        if (obtainStyledAttributes.hasValue(5)) {
            textView.setMaxLines(obtainStyledAttributes.getInteger(5, 1));
        }
        obtainStyledAttributes.recycle();
    }
}
