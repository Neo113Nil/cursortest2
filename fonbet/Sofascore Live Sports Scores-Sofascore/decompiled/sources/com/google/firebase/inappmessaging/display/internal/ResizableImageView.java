package com.google.firebase.inappmessaging.display.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.uif;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class ResizableImageView extends AppCompatImageView {
    public final int a;

    public ResizableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = (int) (context.getResources().getDisplayMetrics().density * 160.0f);
    }

    public final uif b(int i, int i2) {
        int maxWidth = getMaxWidth();
        int maxHeight = getMaxHeight();
        if (i > maxWidth) {
            i2 = (i2 * maxWidth) / i;
            i = maxWidth;
        }
        if (i2 > maxHeight) {
            i = (i * maxHeight) / i2;
        } else {
            maxHeight = i2;
        }
        return new uif(i, maxHeight, 10);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Drawable drawable = getDrawable();
        boolean adjustViewBounds = getAdjustViewBounds();
        if (drawable == null || !adjustViewBounds) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int i3 = this.a;
        uif b = b((int) Math.ceil((intrinsicWidth * i3) / 160), (int) Math.ceil((intrinsicHeight * i3) / 160));
        setMeasuredDimension(b.b, b.c);
        int max = Math.max(getMinimumWidth(), getSuggestedMinimumWidth());
        int max2 = Math.max(getMinimumHeight(), getSuggestedMinimumHeight());
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = max2;
        float f2 = measuredHeight;
        float f3 = measuredWidth < max ? max / measuredWidth : 1.0f;
        float f4 = measuredHeight < max2 ? f / f2 : 1.0f;
        if (f3 <= f4) {
            f3 = f4;
        }
        if (f3 > 1.0d) {
            uif b2 = b((int) Math.ceil(r4 * f3), (int) Math.ceil(f2 * f3));
            setMeasuredDimension(b2.b, b2.c);
        }
    }
}
