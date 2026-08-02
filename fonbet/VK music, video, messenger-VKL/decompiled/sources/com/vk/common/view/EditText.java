package com.vk.common.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.vk.design.ui.themehelper.R$styleable;
import com.vk.typography.TextSizeUnit;
import com.vk.typography.a;

/* loaded from: classes17.dex */
public class EditText extends android.widget.EditText {
    public EditText(Context context) {
        super(context);
    }

    public final void a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.d);
        String string = obtainStyledAttributes.getString(1);
        if (!TextUtils.isEmpty(string) && !isInEditMode()) {
            setTypeface(a.C1933a.b(getContext(), string, getTextSize(), TextSizeUnit.PX).a);
        }
        int color = obtainStyledAttributes.getColor(0, 0);
        if (color != 0) {
            for (Drawable drawable : getCompoundDrawables()) {
                if (drawable != null) {
                    drawable.mutate().setColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public EditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    public EditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet);
    }

    @TargetApi(21)
    public EditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(attributeSet);
    }
}
