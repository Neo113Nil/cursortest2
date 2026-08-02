package com.google.android.material.textview;

import B7.a;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import i7.C7017a;
import v7.b;

/* loaded from: classes9.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(@NonNull Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = getContext();
        TypedValue a11 = b.a(ru.ozon.app.android.R.attr.textAppearanceLineHeightEnabled, context2);
        if (a11 != null && a11.type == 18 && a11.data == 0) {
            return;
        }
        Resources.Theme theme = context2.getTheme();
        int[] iArr = C7017a.f65920D;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
        int d11 = d(context2, obtainStyledAttributes, 1, 2);
        obtainStyledAttributes.recycle();
        if (d11 != -1) {
            return;
        }
        TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
        obtainStyledAttributes2.recycle();
        if (resourceId != -1) {
            TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, C7017a.f65919C);
            int d12 = d(getContext(), obtainStyledAttributes3, 1, 2);
            obtainStyledAttributes3.recycle();
            if (d12 >= 0) {
                setLineHeight(d12);
            }
        }
    }

    private static int d(@NonNull Context context, @NonNull TypedArray typedArray, @NonNull int... iArr) {
        int i11 = -1;
        for (int i12 = 0; i12 < iArr.length && i11 < 0; i12++) {
            int i13 = iArr[i12];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i13, typedValue) && typedValue.type == 2) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i11 = dimensionPixelSize;
            } else {
                i11 = typedArray.getDimensionPixelSize(i13, -1);
            }
        }
        return i11;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(@NonNull Context context, int i11) {
        super.setTextAppearance(context, i11);
        TypedValue a11 = b.a(ru.ozon.app.android.R.attr.textAppearanceLineHeightEnabled, context);
        if (a11 != null && a11.type == 18 && a11.data == 0) {
            return;
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i11, C7017a.f65919C);
        int d11 = d(getContext(), obtainStyledAttributes, 1, 2);
        obtainStyledAttributes.recycle();
        if (d11 >= 0) {
            setLineHeight(d11);
        }
    }
}
