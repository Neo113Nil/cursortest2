package com.vk.core.view.components.formitem;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import xsna.s3q0;
import xsna.wzs;

/* compiled from: VkInputSelectEditText.kt */
/* loaded from: classes17.dex */
public final class VkInputSelectEditText extends AppCompatEditText {
    public wzs<? super Integer, ? super Integer, s3q0> b;
    public boolean c;

    public VkInputSelectEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean getFillByHeight() {
        return this.c;
    }

    public final wzs<Integer, Integer, s3q0> getSelectionChangeListener() {
        return this.b;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.c) {
            setMeasuredDimension(getMeasuredWidth(), Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i2)));
        }
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        wzs<? super Integer, ? super Integer, s3q0> wzsVar = this.b;
        if (wzsVar != null) {
            wzsVar.invoke(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public final void setFillByHeight(boolean z) {
        this.c = z;
    }

    public final void setSelectionChangeListener(wzs<? super Integer, ? super Integer, s3q0> wzsVar) {
        this.b = wzsVar;
    }
}
