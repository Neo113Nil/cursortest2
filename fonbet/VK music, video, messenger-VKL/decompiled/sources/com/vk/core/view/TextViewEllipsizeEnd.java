package com.vk.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import xsna.lfo0;

/* compiled from: TextViewEllipsizeEnd.kt */
/* loaded from: classes.dex */
public final class TextViewEllipsizeEnd extends AppCompatTextView {
    public static final /* synthetic */ int d = 0;
    public final lfo0 b;
    public boolean c;

    public TextViewEllipsizeEnd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = new lfo0(this);
        this.c = true;
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2) {
        if (charSequence == null) {
            charSequence = "";
        }
        lfo0 lfo0Var = this.b;
        lfo0Var.b = charSequence;
        if (charSequence2 == null) {
            charSequence2 = "";
        }
        lfo0Var.c = charSequence2;
        lfo0Var.d = z;
        lfo0Var.g = z2;
        lfo0Var.e = 0;
        requestLayout();
    }

    public final boolean getEllipsizeEnabled() {
        return this.c;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (this.c) {
            lfo0 lfo0Var = this.b;
            if (lfo0Var.e != size && !isInEditMode()) {
                setText(lfo0.b(lfo0Var, size, 0, 6));
            }
        }
        super.onMeasure(i, i2);
    }

    public final void setEllipsizeEnabled(boolean z) {
        this.c = z;
    }
}
