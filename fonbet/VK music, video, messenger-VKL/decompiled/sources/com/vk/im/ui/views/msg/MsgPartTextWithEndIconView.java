package com.vk.im.ui.views.msg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import xsna.baf0;
import xsna.cn70;

/* compiled from: MsgPartTextWithEndIconView.kt */
/* loaded from: classes2.dex */
public final class MsgPartTextWithEndIconView extends AppCompatTextView {
    public final int b;
    public baf0 c;

    public MsgPartTextWithEndIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = cn70.b(4);
        setSingleLine(true);
        setEllipsize(TextUtils.TruncateAt.END);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        baf0 baf0Var = this.c;
        if (baf0Var != null) {
            int width = getWidth();
            int i = this.b;
            canvas.save();
            canvas.translate(Math.min((width - i) - baf0Var.getIntrinsicWidth(), getPaint().measureText(getText(), 0, getText().length()) + getCompoundPaddingStart() + i), ((canvas.getHeight() - baf0Var.getIntrinsicHeight()) / 2) + getCompoundPaddingTop());
            baf0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        baf0 baf0Var = this.c;
        if (baf0Var != null) {
            i3 = (this.b * 2) + baf0Var.b.getIntrinsicWidth();
        } else {
            i3 = 0;
        }
        if (i3 > 0) {
            setPadding(getPaddingLeft(), getPaddingTop(), i3, getPaddingBottom());
        }
    }

    public final void setColor(int i) {
        setTextColor(i);
        baf0 baf0Var = this.c;
        if (baf0Var != null) {
            baf0Var.a(i);
        }
    }

    public final void setIconDrawable(Drawable drawable) {
        baf0 baf0Var;
        if (drawable instanceof baf0) {
            baf0Var = (baf0) drawable;
            baf0Var.a(getCurrentTextColor());
        } else {
            baf0Var = drawable != null ? new baf0(drawable, getCurrentTextColor()) : null;
        }
        this.c = baf0Var;
        if (baf0Var != null) {
            Drawable drawable2 = baf0Var.b;
            baf0Var.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
        }
        invalidate();
    }
}
