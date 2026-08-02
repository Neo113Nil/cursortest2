package com.vk.clips.design.view.editor.speed;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.vk.clips.design.view.seek.WheelSeekView;
import xsna.rl3;

/* compiled from: WheelSeekSpeedView.kt */
/* loaded from: classes16.dex */
public final class WheelSeekSpeedView extends WheelSeekView {
    public WheelSeekSpeedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // com.vk.clips.design.view.seek.WheelSeekView
    public final void d(Canvas canvas, float[] fArr) {
        int length = fArr.length / 4;
        int i = 0;
        while (i < length) {
            int i2 = i * 4;
            float f = fArr[i2];
            float f2 = fArr[i2 + 3];
            float f3 = (getValuesTextFontMetrics().bottom - getValuesTextFontMetrics().top) + getValuesTextFontMetrics().descent;
            String str = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : "0.1x" : "1x" : "2x" : "5x" : "10x";
            Float limitValue = getLimitValue();
            if (limitValue != null) {
                if (f > rl3.j0(getGroupPoints()) + (Math.abs(rl3.j0(getGroupPoints()) - rl3.f0(getGroupPoints())) * limitValue.floatValue())) {
                    WheelSeekView.e(getValuesTextPaint(), 0.32f);
                } else {
                    WheelSeekView.e(getValuesTextPaint(), getInternalAlpha());
                }
            }
            canvas.drawText(str, f, f2 + f3, getValuesTextPaint());
            i++;
        }
    }

    @Override // com.vk.clips.design.view.seek.WheelSeekView
    public final void a() {
    }

    @Override // com.vk.clips.design.view.seek.WheelSeekView
    public final void c(Canvas canvas) {
    }
}
