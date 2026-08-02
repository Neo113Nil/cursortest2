package com.vk.im.ui.views.dialogs;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vk.typography.b;
import com.vk.ui.R$styleable;
import xsna.cn70;
import xsna.g2v;
import xsna.wng0;
import xsna.zxj;

/* compiled from: DialogUnreadMarkerView.kt */
/* loaded from: classes2.dex */
public final class DialogUnreadMarkerView extends zxj {
    public DialogUnreadMarkerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.h);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, cn70.f(14));
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, cn70.b(24));
        obtainStyledAttributes.recycle();
        b.g(this, FontFamily.MEDIUM, Float.valueOf(dimensionPixelSize), TextSizeUnit.PX);
        setMinimumWidth(dimensionPixelSize2);
        setMinimumHeight(dimensionPixelSize2);
        setGravity(17);
        setSingleLine(true);
        setMaxLines(1);
        setIncludeFontPadding(false);
        wng0.e(dimensionPixelSize2 / 2, getBgDrawable());
        g2v.c().getClass();
        int b = cn70.b(8);
        setPadding(b, 0, b, 0);
        setMuted(false);
        StringBuilder sb = this.b;
        sb.setLength(0);
        setText(sb);
    }
}
