package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.R$attr;
import com.google.android.material.R$styleable;
import xsna.jl10;
import xsna.qm10;
import xsna.zm10;

/* loaded from: classes13.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(@NonNull Context context) {
        this(context, null);
    }

    public final void b(@Nullable AttributeSet attributeSet, int i, int i2) {
        Context context = getContext();
        if (jl10.b(R$attr.textAppearanceLineHeightEnabled, context, true)) {
            Resources.Theme theme = context.getTheme();
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, R$styleable.MaterialTextView, i, i2);
            int[] iArr = {R$styleable.MaterialTextView_android_lineHeight, R$styleable.MaterialTextView_lineHeight};
            int i3 = -1;
            for (int i4 = 0; i4 < 2 && i3 < 0; i4++) {
                i3 = qm10.c(context, obtainStyledAttributes, iArr[i4], -1);
            }
            obtainStyledAttributes.recycle();
            if (i3 != -1) {
                return;
            }
            TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, R$styleable.MaterialTextView, i, i2);
            int resourceId = obtainStyledAttributes2.getResourceId(R$styleable.MaterialTextView_android_textAppearance, -1);
            obtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, R$styleable.MaterialTextAppearance);
                Context context2 = getContext();
                int[] iArr2 = {R$styleable.MaterialTextAppearance_android_lineHeight, R$styleable.MaterialTextAppearance_lineHeight};
                int i5 = -1;
                for (int i6 = 0; i6 < 2 && i5 < 0; i6++) {
                    i5 = qm10.c(context2, obtainStyledAttributes3, iArr2[i6], -1);
                }
                obtainStyledAttributes3.recycle();
                if (i5 >= 0) {
                    setLineHeight(i5);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(@NonNull Context context, int i) {
        super.setTextAppearance(context, i);
        if (jl10.b(R$attr.textAppearanceLineHeightEnabled, context, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, R$styleable.MaterialTextAppearance);
            Context context2 = getContext();
            int[] iArr = {R$styleable.MaterialTextAppearance_android_lineHeight, R$styleable.MaterialTextAppearance_lineHeight};
            int i2 = -1;
            for (int i3 = 0; i3 < 2 && i2 < 0; i3++) {
                i2 = qm10.c(context2, obtainStyledAttributes, iArr[i3], -1);
            }
            obtainStyledAttributes.recycle();
            if (i2 >= 0) {
                setLineHeight(i2);
            }
        }
    }

    public MaterialTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public MaterialTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(zm10.a(context, attributeSet, i, 0), attributeSet, i);
        b(attributeSet, i, 0);
    }

    @Deprecated
    public MaterialTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(zm10.a(context, attributeSet, i, i2), attributeSet, i);
        b(attributeSet, i, i2);
    }
}
