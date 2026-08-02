package com.vk.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.core.R$styleable;

/* compiled from: AutoFitTextView.kt */
/* loaded from: classes17.dex */
public final class AutoFitTextView extends AppCompatTextView {
    public final int b;
    public final int c;
    public boolean d;

    public AutoFitTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.d);
        this.b = obtainStyledAttributes.getDimensionPixelSize(1, (int) getTextSize());
        this.c = obtainStyledAttributes.getDimensionPixelSize(0, (int) getTextSize());
        obtainStyledAttributes.recycle();
        setSingleLine(true);
        setMaxLines(1);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        int i6 = this.b;
        if (i6 == 0 || (i5 = this.c) == 0 || getMeasuredWidth() == 0) {
            return;
        }
        float min = i5 * Math.min(((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) / getLayout().getLineWidth(0), 1.0f);
        if (min < i6) {
            this.d = true;
        } else {
            this.d = false;
            setTextSize(0, min);
        }
        invalidate();
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        setTextSize(0, this.c);
        forceLayout();
    }
}
