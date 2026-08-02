package com.shopify.reactnative.skia;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.util.Log;
import android.view.View;

/* loaded from: classes8.dex */
public class SkiaAHBView extends View implements ImageReader.OnImageAvailableListener {
    private long _prevTimestamp;
    SkiaViewAPI mApi;
    private Bitmap mBitmap;
    boolean mDebug;
    private ImageReader mReader;
    private final Matrix matrix;

    public SkiaAHBView(Context context, SkiaViewAPI skiaViewAPI, boolean z) {
        super(context);
        this.mBitmap = null;
        this.matrix = new Matrix();
        this._prevTimestamp = 0L;
        this.mApi = skiaViewAPI;
        this.mDebug = z;
    }

    private ImageReader createReader() {
        ImageReader newInstance;
        newInstance = ImageReader.newInstance(getWidth(), getHeight(), 1, 2, 768L);
        newInstance.setOnImageAvailableListener(this, null);
        return newInstance;
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int width = getWidth();
        int height = getHeight();
        if (this.mReader == null) {
            ImageReader createReader = createReader();
            this.mReader = createReader;
            this.mApi.onSurfaceCreated(createReader.getSurface(), width, height);
        } else {
            ImageReader createReader2 = createReader();
            this.mReader = createReader2;
            this.mApi.onSurfaceChanged(createReader2.getSurface(), width, height);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0017, code lost:
    
        r1 = android.graphics.Bitmap.wrapHardwareBuffer(r0, null);
     */
    @Override // android.media.ImageReader.OnImageAvailableListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onImageAvailable(ImageReader imageReader) {
        HardwareBuffer hardwareBuffer;
        Bitmap wrapHardwareBuffer;
        Image acquireLatestImage = imageReader.acquireLatestImage();
        if (acquireLatestImage != null) {
            try {
                hardwareBuffer = acquireLatestImage.getHardwareBuffer();
                if (this.mDebug) {
                    textureUpdated(acquireLatestImage.getTimestamp());
                }
                if (hardwareBuffer != null && wrapHardwareBuffer != null) {
                    this.mBitmap = wrapHardwareBuffer;
                    hardwareBuffer.close();
                    invalidate();
                }
            } catch (Throwable th) {
                if (acquireLatestImage != null) {
                    try {
                        acquireLatestImage.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (acquireLatestImage != null) {
            acquireLatestImage.close();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mBitmap != null) {
            float width = getWidth();
            float height = getHeight() / this.mBitmap.getHeight();
            this.matrix.reset();
            this.matrix.setScale(width / this.mBitmap.getWidth(), height);
            canvas.drawBitmap(this.mBitmap, this.matrix, null);
        }
    }

    public void textureUpdated(long j) {
        Log.i("SkiaAHBView", "onSurfaceTextureUpdated " + ((j - this._prevTimestamp) / 1000000) + "ms");
        this._prevTimestamp = j;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mApi.onSurfaceDestroyed();
    }
}
