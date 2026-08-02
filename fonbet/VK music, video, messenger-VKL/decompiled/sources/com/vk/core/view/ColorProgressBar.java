package com.vk.core.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.vk.design.ui.themehelper.R$styleable;

@Deprecated
/* loaded from: classes17.dex */
public class ColorProgressBar extends ProgressBar {
    public ColorProgressBar(Context context) {
        super(context);
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.b, 0, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            setColor(obtainStyledAttributes.getColor(0, -16777216));
        }
        obtainStyledAttributes.recycle();
    }

    public void setColor(int i) {
        getIndeterminateDrawable().setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    public ColorProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public ColorProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    @TargetApi(21)
    public ColorProgressBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet);
    }
}
