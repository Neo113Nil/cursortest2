package com.vk.auth.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import xsna.anj;
import xsna.hnj;

/* compiled from: VkAuthTextView.kt */
/* loaded from: classes.dex */
public class VkAuthTextView extends AppCompatTextView {
    public final int b;

    public VkAuthTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public final void setTextColorStateList(int i) {
        setTextColor(anj.b(i, getContext()));
    }

    public VkAuthTextView(Context context, AttributeSet attributeSet, int i) {
        super(hnj.a(context), attributeSet, i);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.textColor});
        if (attributeSet != null) {
            try {
                this.b = obtainStyledAttributes.getResourceId(0, 0);
            } catch (Throwable unused) {
                obtainStyledAttributes.recycle();
                return;
            }
        }
        int i2 = this.b;
        if (i2 != 0) {
            setTextColor(anj.b(i2, getContext()));
        }
        obtainStyledAttributes.recycle();
    }
}
