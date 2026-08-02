package com.vk.im.ui.views.settings;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.ui.R$styleable;
import com.vkontakte.android.R;
import xsna.abg0;
import xsna.bwt0;
import xsna.dhr0;
import xsna.f4m;
import xsna.iah0;
import xsna.myc0;
import xsna.qcy;
import xsna.too0;

/* compiled from: TwoRowSettingsView.kt */
/* loaded from: classes2.dex */
public final class TwoRowSettingsView extends LinearLayout implements too0 {
    public final TextView b;
    public final TextView c;
    public Integer d;

    public TwoRowSettingsView(Context context) {
        this(context, null, 0, 14, 0);
    }

    @Override // xsna.too0
    public final void Ng() {
        Integer num = this.d;
        int intValue = num != null ? num.intValue() : R.attr.vk_legacy_text_primary;
        abg0 abg0Var = dhr0.t;
        this.b.setTextColor(abg0Var.c(intValue));
        this.c.setTextColor(abg0Var.c(R.attr.vk_legacy_text_secondary));
    }

    public final CharSequence getSubtitle() {
        return this.c.getText();
    }

    public final CharSequence getTitle() {
        return this.b.getText();
    }

    public final void setSubtitle(CharSequence charSequence) {
        TextView textView = this.c;
        textView.setText(charSequence);
        textView.setVisibility((charSequence == null || !myc0.f(charSequence)) ? 8 : 0);
    }

    public final void setTitle(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public final void setTitleColor(int i) {
        this.d = Integer.valueOf(i);
        this.b.setTextColor(dhr0.t.c(i));
    }

    public TwoRowSettingsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public TwoRowSettingsView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ TwoRowSettingsView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public TwoRowSettingsView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        dhr0 dhr0Var = dhr0.a;
        setOrientation(1);
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLayoutParams(layoutParams);
        textView.setIncludeFontPadding(false);
        this.b = textView;
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        f4m.y(iah0.a(4), textView2);
        textView2.setLayoutParams(layoutParams2);
        textView2.setIncludeFontPadding(false);
        this.c = textView2;
        addView(textView);
        addView(textView2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.F, i, i2);
        String string = obtainStyledAttributes.getString(2);
        setTitle(string == null ? "" : string);
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        qcy<Object>[] qcyVarArr = bwt0.a;
        textView.setTextAppearance(resourceId);
        CharSequence string2 = obtainStyledAttributes.getString(0);
        setSubtitle(string2 != null ? string2 : "");
        textView2.setTextAppearance(obtainStyledAttributes.getResourceId(1, 0));
        obtainStyledAttributes.recycle();
    }
}
