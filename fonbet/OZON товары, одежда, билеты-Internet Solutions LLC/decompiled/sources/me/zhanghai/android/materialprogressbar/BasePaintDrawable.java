package me.zhanghai.android.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
abstract class BasePaintDrawable extends BaseDrawable {
    private Paint mPaint;

    BasePaintDrawable() {
    }

    @Override // me.zhanghai.android.materialprogressbar.BaseDrawable
    protected final void onDraw(@NonNull Canvas canvas, int i11, int i12) {
        if (this.mPaint == null) {
            Paint paint = new Paint();
            this.mPaint = paint;
            paint.setAntiAlias(true);
            this.mPaint.setColor(-16777216);
            onPreparePaint(this.mPaint);
        }
        this.mPaint.setAlpha(this.mAlpha);
        this.mPaint.setColorFilter(getColorFilterForDrawing());
        onDraw(canvas, i11, i12, this.mPaint);
    }

    protected abstract void onDraw(@NonNull Canvas canvas, int i11, int i12, @NonNull Paint paint);

    protected abstract void onPreparePaint(@NonNull Paint paint);
}
