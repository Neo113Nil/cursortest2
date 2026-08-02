package com.vk.libvideo.design.view.preview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.api.ui.VideoResizer;
import xsna.tn10;

/* compiled from: PreviewImageView.kt */
/* loaded from: classes2.dex */
public final class PreviewImageView extends AppCompatImageView implements tn10 {
    public VideoResizer.VideoFitType b;
    public int c;
    public int d;
    public final Matrix e;

    public PreviewImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = VideoResizer.VideoFitType.CROP;
        this.e = new Matrix();
        setScaleType(ImageView.ScaleType.MATRIX);
        setPivotX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        setPivotY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final void U() {
        float[] fArr = new float[8];
        VideoResizer.a.a(fArr, this.b, VideoResizer.MatrixType.IMAGE_MATRIX, getWidth(), getHeight(), getContentWidth(), getContentHeight());
        float f = fArr[0];
        float f2 = fArr[1];
        Matrix matrix = this.e;
        matrix.setScale(f, f2);
        matrix.postTranslate(fArr[2], fArr[3]);
        setImageMatrix(matrix);
        invalidate();
    }

    @Override // xsna.tn10
    public int getContentHeight() {
        Drawable drawable = getDrawable();
        return drawable != null ? drawable.getIntrinsicHeight() : this.d;
    }

    @Override // xsna.tn10
    public VideoResizer.VideoFitType getContentScaleType() {
        return this.b;
    }

    @Override // xsna.tn10
    public int getContentWidth() {
        Drawable drawable = getDrawable();
        return drawable != null ? drawable.getIntrinsicWidth() : this.c;
    }

    @Override // xsna.tn10
    public final void l(int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        U();
    }

    @Override // xsna.tn10
    public void setContentScaleType(VideoResizer.VideoFitType videoFitType) {
        this.b = videoFitType;
        U();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        U();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        U();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        U();
    }

    @Override // xsna.tn10
    public final View b() {
        return this;
    }
}
