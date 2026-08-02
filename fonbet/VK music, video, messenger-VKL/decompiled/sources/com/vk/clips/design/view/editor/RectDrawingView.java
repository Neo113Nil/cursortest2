package com.vk.clips.design.view.editor;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.vkontakte.android.R;
import xsna.dn70;
import xsna.rqi;

/* compiled from: RectDrawingView.kt */
/* loaded from: classes16.dex */
public final class RectDrawingView extends View {
    public boolean b;
    public Path c;
    public final Paint d;

    public RectDrawingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.c = new Path();
        Paint b = rqi.b(1, -1);
        b.setStrokeWidth(dn70.a() * 1.0f);
        b.setStyle(Paint.Style.STROKE);
        this.d = b;
    }

    public final boolean getRounded() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.c.isEmpty()) {
            return;
        }
        canvas.drawPath(this.c, this.d);
    }

    public final void setPoints(float[] fArr) {
        Path path = new Path();
        this.c = path;
        path.moveTo(fArr[0], fArr[1]);
        this.c.lineTo(fArr[2], fArr[3]);
        this.c.lineTo(fArr[4], fArr[5]);
        this.c.lineTo(fArr[6], fArr[7]);
        this.c.lineTo(fArr[0], fArr[1]);
        this.c.close();
        invalidate();
    }

    public final void setRounded(boolean z) {
        this.b = z;
        Paint paint = this.d;
        if (z) {
            paint.setPathEffect(new CornerPathEffect(getContext().getResources().getDimension(R.dimen.pro_editor_video_corner_radius)));
        } else {
            paint.setPathEffect(null);
        }
    }
}
