package com.vk.core.view;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.log.L;
import xsna.anj;
import xsna.dhr0;
import xsna.too0;

/* compiled from: TextViewColorStateListAndAlphaSupportPreV23.kt */
/* loaded from: classes17.dex */
public class TextViewColorStateListAndAlphaSupportPreV23 extends AppCompatTextView implements too0 {
    public final int b;

    public TextViewColorStateListAndAlphaSupportPreV23(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (Object) null);
    }

    @Override // xsna.too0
    public void Ng() {
        b();
    }

    public final void b() {
        int i = this.b;
        if (i != 0) {
            dhr0.a.getClass();
            setTextColor(anj.b(i, dhr0.E()));
        }
    }

    public final void setTextColorStateListByRes(int i) {
        dhr0.a.getClass();
        setTextColor(anj.b(i, dhr0.E()));
    }

    public /* synthetic */ TextViewColorStateListAndAlphaSupportPreV23(Context context, AttributeSet attributeSet, Object obj) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public TextViewColorStateListAndAlphaSupportPreV23(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.textColor});
        if (attributeSet != null) {
            try {
                this.b = obtainStyledAttributes.getResourceId(0, 0);
            } catch (Throwable th) {
                try {
                    L.i(th);
                    return;
                } finally {
                    obtainStyledAttributes.recycle();
                }
            }
        }
        b();
    }
}
