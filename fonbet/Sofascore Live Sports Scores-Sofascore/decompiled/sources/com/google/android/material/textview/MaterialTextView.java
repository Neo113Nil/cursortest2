package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.oyn;
import defpackage.pjf;
import defpackage.w3a;
import defpackage.x2a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class MaterialTextView extends AppCompatTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(oyn.U(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = getContext();
        if (x2a.L(context2.getTheme(), com.sofascore.results.R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = pjf.H;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int[] iArr2 = {1, 2};
            int i = -1;
            for (int i2 = 0; i2 < 2 && i < 0; i2++) {
                i = w3a.y(context2, obtainStyledAttributes, iArr2[i2], -1);
            }
            obtainStyledAttributes.recycle();
            if (i != -1) {
                return;
            }
            TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
            obtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, pjf.G);
                Context context3 = getContext();
                int[] iArr3 = {2, 4};
                int i3 = -1;
                for (int i4 = 0; i4 < 2 && i3 < 0; i4++) {
                    i3 = w3a.y(context3, obtainStyledAttributes3, iArr3[i4], -1);
                }
                obtainStyledAttributes3.recycle();
                if (i3 >= 0) {
                    setLineHeight(i3);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (x2a.L(context.getTheme(), com.sofascore.results.R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, pjf.G);
            Context context2 = getContext();
            int[] iArr = {2, 4};
            int i2 = -1;
            for (int i3 = 0; i3 < 2 && i2 < 0; i3++) {
                i2 = w3a.y(context2, obtainStyledAttributes, iArr[i3], -1);
            }
            obtainStyledAttributes.recycle();
            if (i2 >= 0) {
                setLineHeight(i2);
            }
        }
    }
}
