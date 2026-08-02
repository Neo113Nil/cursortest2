package com.monetization.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import xsna.zcl;
import yads.eg;
import yads.fg;
import yads.g03;
import yads.ik1;
import yads.jk1;

/* loaded from: classes14.dex */
public final class ExtendedTextView extends TextView {
    private jk1 a;
    private final eg b;

    @SuppressLint({"CustomViewStyleable"})
    public ExtendedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, null, 28, null);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        ik1 a = this.a.a(i, i2);
        super.onMeasure(a.a, a.b);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
    }

    public final void setAutoSizeTextType(int i) {
        setAutoSizeTextTypeWithDefaults(i);
    }

    public final void setMeasureSpecProvider(jk1 jk1Var) {
        this.a = jk1Var;
        requestLayout();
        invalidate();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
    }

    @SuppressLint({"CustomViewStyleable"})
    public ExtendedTextView(Context context, AttributeSet attributeSet, int i, jk1 jk1Var, fg fgVar) {
        super(context, attributeSet, i);
        this.a = jk1Var;
        fgVar.getClass();
        this.b = fg.a(this);
    }

    public /* synthetic */ ExtendedTextView(Context context, AttributeSet attributeSet, int i, jk1 jk1Var, fg fgVar, int i2, zcl zclVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? new g03() : jk1Var, (i2 & 16) != 0 ? new fg() : fgVar);
    }
}
