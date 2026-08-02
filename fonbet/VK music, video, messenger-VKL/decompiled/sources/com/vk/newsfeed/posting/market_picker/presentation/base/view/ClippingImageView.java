package com.vk.newsfeed.posting.market_picker.presentation.base.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import com.vk.imageloader.VkSimpleDraweeView;

/* compiled from: ClippingImageView.kt */
/* loaded from: classes4.dex */
public final class ClippingImageView extends VkSimpleDraweeView {

    @Keep
    private float[] corners;
    public final RectF k;
    public final Path l;

    public ClippingImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.k = new RectF();
        this.l = new Path();
        this.corners = new float[8];
    }

    public final float[] getCorners() {
        return this.corners;
    }

    @Override // android.view.View
    public final void invalidate() {
        Path path = this.l;
        if (path != null) {
            path.reset();
        }
        RectF rectF = this.k;
        if (rectF != null && path != null) {
            path.addRoundRect(rectF, this.corners, Path.Direction.CW);
        }
        super.invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int save = canvas.save();
        canvas.clipPath(this.l);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
    }

    @Keep
    public final void setClipBottom(int i) {
        RectF rectF = this.k;
        if (rectF != null) {
            rectF.bottom = getHeight() - i;
        }
        invalidate();
    }

    @Keep
    public final void setClipTop(int i) {
        RectF rectF = this.k;
        if (rectF != null) {
            rectF.top = i;
        }
        invalidate();
    }

    @Keep
    public final void setClipX(int i) {
        RectF rectF = this.k;
        if (rectF != null) {
            rectF.left = i;
        }
        if (rectF != null) {
            rectF.right = getWidth() - i;
        }
        invalidate();
    }

    public final void setCorners(float[] fArr) {
        if (fArr.length != 8) {
            throw new IllegalStateException("corners[] needs 8 values");
        }
        this.corners = fArr;
        invalidate();
    }

    @Keep
    public final void setCorners(float f) {
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        setCorners(fArr);
    }
}
