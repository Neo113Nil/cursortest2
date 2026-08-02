package com.vk.im.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.ui.R$styleable;
import xsna.bwt0;
import xsna.f4m;
import xsna.gzs;
import xsna.iah0;
import xsna.k0j;
import xsna.qcy;
import xsna.s3q0;

/* compiled from: ContentErrorView.kt */
/* loaded from: classes2.dex */
public final class ContentErrorView extends LinearLayout {
    public final TextView b;
    public final TextView c;
    public int d;
    public gzs<s3q0> e;

    public ContentErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        textView.setLayoutParams(layoutParams);
        textView.setGravity(1);
        textView.setIncludeFontPadding(false);
        this.b = textView;
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        textView2.setLayoutParams(layoutParams2);
        float f = 16;
        textView2.setPaddingRelative(iah0.a(f), iah0.a(5), iah0.a(f), iah0.a(6));
        textView2.setIncludeFontPadding(false);
        textView2.setMaxLines(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        this.c = textView2;
        this.d = Integer.MAX_VALUE;
        setOrientation(1);
        addView(textView);
        addView(textView2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f);
        setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(0, Integer.MAX_VALUE));
        String string = obtainStyledAttributes.getString(4);
        setTitleText(string == null ? "" : string);
        int resourceId = obtainStyledAttributes.getResourceId(5, 0);
        qcy<Object>[] qcyVarArr = bwt0.a;
        textView.setTextAppearance(resourceId);
        CharSequence string2 = obtainStyledAttributes.getString(2);
        setButtonText(string2 != null ? string2 : "");
        setButtonBackground(obtainStyledAttributes.getDrawable(1));
        textView2.setTextAppearance(obtainStyledAttributes.getResourceId(3, 0));
        obtainStyledAttributes.recycle();
        bwt0.i0(textView2, new k0j(this, 1));
    }

    public final void a() {
        int i = getTitleText().length() == 0 ? 8 : 0;
        TextView textView = this.b;
        textView.setVisibility(i);
        int i2 = getButtonText().length() == 0 ? 8 : 0;
        TextView textView2 = this.c;
        textView2.setVisibility(i2);
        if (bwt0.K(textView) && bwt0.K(textView2)) {
            f4m.t(iah0.a(8), textView2);
        } else {
            f4m.t(0, textView2);
        }
    }

    public final Drawable getButtonBackground() {
        return this.c.getBackground();
    }

    public final CharSequence getButtonText() {
        return this.c.getText();
    }

    public final int getMaxWidth() {
        return this.d;
    }

    public final gzs<s3q0> getOnButtonClickListener() {
        return this.e;
    }

    public final CharSequence getTitleText() {
        return this.b.getText();
    }

    public final void setButtonBackground(Drawable drawable) {
        this.c.setBackground(drawable);
    }

    public final void setButtonText(CharSequence charSequence) {
        this.c.setText(charSequence);
        a();
    }

    public final void setMaxWidth(int i) {
        this.d = i;
        this.b.setMaxWidth(i);
        this.c.setMaxWidth(i);
    }

    public final void setOnButtonClickListener(gzs<s3q0> gzsVar) {
        this.e = gzsVar;
    }

    public final void setTitleText(CharSequence charSequence) {
        this.b.setText(charSequence);
        a();
    }
}
