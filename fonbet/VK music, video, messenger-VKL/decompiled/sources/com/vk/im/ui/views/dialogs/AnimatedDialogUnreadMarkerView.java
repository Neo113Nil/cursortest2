package com.vk.im.ui.views.dialogs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.vk.core.apps.BuildInfo;
import com.vk.im.ui.views.counter.AnimatedCounterView;
import com.vk.movika.sdk.base.model.props.d;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vk.typography.b;
import com.vk.ui.R$styleable;
import com.vkontakte.android.R;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.cn70;
import xsna.dbg0;
import xsna.e3m;
import xsna.msy;

/* compiled from: AnimatedDialogUnreadMarkerView.kt */
/* loaded from: classes2.dex */
public final class AnimatedDialogUnreadMarkerView extends AnimatedCounterView {
    public static final /* synthetic */ int y = 0;
    public final Object x;

    public AnimatedDialogUnreadMarkerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Lazy a = msy.a(LazyThreadSafetyMode.NONE, new d(3));
        this.x = a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, cn70.f(14));
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, cn70.b(24));
        obtainStyledAttributes.recycle();
        setMinWidth(dimensionPixelSize2);
        setMinHeight(dimensionPixelSize2);
        setCorners(dimensionPixelSize2 / 2);
        setPaddingHorizontal(e3m.a(BuildInfo.t() ? R.dimen.vk_ui_spacing_size_s : R.dimen.vk_ui_spacing_size_m, context));
        if (((Boolean) a.getValue()).booleanValue()) {
            TextPaint textPaint = getTextPaint();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(R.style.VkUiTypography_Headline2Medium, com.vk.im.design.R$styleable.b);
            float dimension = obtainStyledAttributes2.getDimension(0, -1.0f);
            if (dimension != -1.0f) {
                textPaint.setTextSize(dimension);
            }
            float f = obtainStyledAttributes2.getFloat(3, -1.0f);
            if (f != -1.0f) {
                textPaint.setLetterSpacing(f);
            }
            int color = obtainStyledAttributes2.getColor(1, Integer.MIN_VALUE);
            if (color != Integer.MIN_VALUE) {
                textPaint.setColor(color);
            }
            int resourceId = obtainStyledAttributes2.getResourceId(2, 0);
            if (resourceId != 0) {
                int i = obtainStyledAttributes2.getInt(4, -1);
                Typeface a2 = dbg0.a(resourceId, context);
                if (i != -1 && a2 != null) {
                    a2 = Typeface.create(a2, i, false);
                }
                textPaint.setTypeface(a2);
            }
            obtainStyledAttributes2.recycle();
        } else {
            b.c(getTextPaint(), context, FontFamily.MEDIUM, Float.valueOf(dimensionPixelSize), TextSizeUnit.PX);
        }
        setMuted(false);
        this.d = -1;
        this.h = null;
        this.l = 0;
    }
}
