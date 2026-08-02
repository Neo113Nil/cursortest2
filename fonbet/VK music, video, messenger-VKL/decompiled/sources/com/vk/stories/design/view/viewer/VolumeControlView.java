package com.vk.stories.design.view.viewer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import xsna.iah0;

/* loaded from: classes6.dex */
public class VolumeControlView extends View {
    public final int b;
    public final Paint c;
    public final Paint d;
    public float e;

    public VolumeControlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = iah0.a(8);
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        setBackgroundColor(-1);
        paint.setColor(503316480);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(iah0.a(1.0f));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setColor(-11103529);
        paint2.setStyle(style);
        paint2.setStrokeWidth(iah0.a(3.0f));
        paint2.setStrokeCap(cap);
    }

    public float getVolumeLevel() {
        return this.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float height = canvas.getHeight() / 2;
        int width = canvas.getWidth();
        int i = this.b;
        float f = width - (i * 2);
        canvas.drawLine(i, height, i + f, height, this.c);
        canvas.drawLine(i, height, (f * this.e) + i, height, this.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000d, code lost:
    
        if (r3 > 1.0f) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setVolumeLevel(float f) {
        this.e = f;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = 1.0f;
        }
        f = f2;
        this.e = f;
        invalidate();
    }
}
