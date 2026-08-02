package com.monetization.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import xsna.zcl;
import yads.u10;
import yads.v10;

/* loaded from: classes14.dex */
public final class RoundImageView extends ImageView {
    private final u10 a;

    @SuppressLint({"CustomViewStyleable"})
    public RoundImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        u10 u10Var = this.a;
        if (u10Var.d != null && !u10Var.c.isEmpty()) {
            canvas.clipPath(u10Var.c);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.a.a();
    }

    @SuppressLint({"CustomViewStyleable"})
    public RoundImageView(Context context, AttributeSet attributeSet, int i, v10 v10Var) {
        super(context, attributeSet, i);
        v10Var.getClass();
        this.a = v10.a(context, this, attributeSet, i);
    }

    public /* synthetic */ RoundImageView(Context context, AttributeSet attributeSet, int i, v10 v10Var, int i2, zcl zclVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? new v10() : v10Var);
    }
}
