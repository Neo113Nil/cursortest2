package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import androidx.core.view.ViewCompat;
import com.applovin.impl.adview.e;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes3.dex */
public final class m extends e {
    private static final Paint c = new Paint(1);
    private static final Paint d = new Paint(1);
    private static final Paint e = new Paint(1);

    public m(Context context) {
        super(context);
        c.setColor(-1);
        d.setColor(ViewCompat.MEASURED_STATE_MASK);
        Paint paint = e;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // com.applovin.impl.adview.e, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.a, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    protected float getCenter() {
        return getSize() / 2.0f;
    }

    protected float getCrossOffset() {
        return this.a * 10.0f;
    }

    protected float getInnerCircleOffset() {
        return this.a * 2.0f;
    }

    protected float getInnerCircleRadius() {
        return getCenter() - getInnerCircleOffset();
    }

    protected float getStrokeWidth() {
        return this.a * 3.0f;
    }

    @Override // com.applovin.impl.adview.e
    public e.a getStyle() {
        return e.a.WHITE_ON_BLACK;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, c);
        canvas.drawCircle(center, center, getInnerCircleRadius(), d);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        Paint paint = e;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawLine(crossOffset, crossOffset, size, size, paint);
        canvas.drawLine(crossOffset, size, size, crossOffset, paint);
    }

    @Override // com.applovin.impl.adview.e, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
}
