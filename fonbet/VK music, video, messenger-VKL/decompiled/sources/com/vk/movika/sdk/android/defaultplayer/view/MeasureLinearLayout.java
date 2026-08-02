package com.vk.movika.sdk.android.defaultplayer.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes3.dex */
public final class MeasureLinearLayout extends LinearLayout {
    public gzs<s3q0> b;

    public MeasureLinearLayout(Context context) {
        super(context);
    }

    public final gzs<s3q0> getOnMeasureCallback() {
        return this.b;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        gzs<s3q0> gzsVar = this.b;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    public final void setOnMeasureCallback(gzs<s3q0> gzsVar) {
        this.b = gzsVar;
    }

    public MeasureLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MeasureLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MeasureLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
