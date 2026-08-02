package com.vk.cameraui.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: CameraGridView.kt */
/* loaded from: classes16.dex */
public final class CameraGridView extends View {
    public final Paint b;
    public final float[] c;

    public CameraGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new float[16];
        paint.setAlpha(127);
        paint.setColor(-1);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawLines(this.c, this.b);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        float f = i;
        float f2 = f / 3.0f;
        float[] fArr = this.c;
        fArr[0] = f2;
        fArr[1] = 0.0f;
        fArr[2] = f2;
        float f3 = i2;
        fArr[3] = f3;
        float f4 = (f * 2.0f) / 3.0f;
        fArr[4] = f4;
        fArr[5] = 0.0f;
        fArr[6] = f4;
        fArr[7] = f3;
        fArr[8] = 0.0f;
        float f5 = f3 / 3.0f;
        fArr[9] = f5;
        fArr[10] = f;
        fArr[11] = f5;
        fArr[12] = 0.0f;
        float f6 = (f3 * 2.0f) / 3.0f;
        fArr[13] = f6;
        fArr[14] = f;
        fArr[15] = f6;
    }
}
