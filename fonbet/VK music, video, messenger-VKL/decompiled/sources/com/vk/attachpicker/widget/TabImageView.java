package com.vk.attachpicker.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.vkontakte.android.R;
import xsna.abg0;
import xsna.c3r0;
import xsna.dhr0;
import xsna.iah0;
import xsna.too0;

/* loaded from: classes15.dex */
public class TabImageView extends AppCompatImageView implements too0 {
    public final int b;
    public final Paint c;
    public int d;
    public int e;
    public int f;
    public int g;
    public float h;

    public TabImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = iah0.a(8);
        this.c = new Paint(1);
        U();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, xsna.too0
    public final void Ng() {
        U();
        invalidate();
    }

    public final void U() {
        abg0 abg0Var = dhr0.t;
        this.d = abg0Var.c(R.attr.vk_ui_background_secondary);
        this.e = abg0Var.c(R.attr.vk_ui_background_accent_themed);
        this.f = abg0Var.c(R.attr.vk_ui_icon_medium);
        this.g = abg0Var.c(R.attr.vk_ui_icon_contrast_themed);
    }

    public float getSelection() {
        return this.h;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int min = Math.min((canvas.getWidth() / 2) - Math.max(getPaddingLeft(), getPaddingRight()), (canvas.getHeight() / 2) - Math.max(getPaddingTop(), getPaddingBottom())) - c3r0.a(1.0f - this.h, 0, this.b / 2);
        int b = c3r0.b(this.h, this.d, this.e);
        Paint paint = this.c;
        paint.setColor(b);
        canvas.drawCircle(canvas.getWidth() / 2, canvas.getHeight() / 2, min, paint);
        super.onDraw(canvas);
    }

    public void setSelection(float f) {
        this.h = f;
        invalidate();
    }
}
