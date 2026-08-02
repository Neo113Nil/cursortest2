package com.shopify.reactnative.skia;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.facebook.jni.HybridData;
import com.facebook.jni.annotations.DoNotStrip;
import com.facebook.react.bridge.ReactContext;

/* loaded from: classes4.dex */
public class SkiaPictureView extends j {

    /* renamed from: d, reason: collision with root package name */
    public Paint f41489d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f41490e;

    @DoNotStrip
    private HybridData mHybridData;

    public SkiaPictureView(Context context) {
        super(context);
        this.f41489d = new Paint();
        this.f41490e = false;
        this.mHybridData = initHybrid(((RNSkiaModule) ((ReactContext) context).getNativeModule(RNSkiaModule.class)).getSkiaManager());
    }

    private native HybridData initHybrid(SkiaManager skiaManager);

    @Override // com.shopify.reactnative.skia.j, com.shopify.reactnative.skia.m
    public void c(Surface surface, int i10, int i11) {
        super.c(surface, i10, i11);
    }

    public void finalize() {
        super.finalize();
        this.mHybridData.resetNative();
    }

    public native int[] getBitmap(int i10, int i11);

    @Override // com.shopify.reactnative.skia.j, com.shopify.reactnative.skia.m
    public void i(Surface surface, int i10, int i11) {
        super.i(surface, i10, i11);
    }

    @Override // com.shopify.reactnative.skia.j, com.shopify.reactnative.skia.m
    public void k(SurfaceTexture surfaceTexture, int i10, int i11) {
        super.k(surfaceTexture, i10, i11);
    }

    @Override // com.shopify.reactnative.skia.j, com.shopify.reactnative.skia.m
    public void m(SurfaceTexture surfaceTexture, int i10, int i11) {
        super.m(surfaceTexture, i10, i11);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int[] bitmap;
        super.onDraw(canvas);
        if (this.f41490e) {
            int width = getWidth();
            int height = getHeight();
            if (width <= 0 || height <= 0 || (bitmap = getBitmap(width, height)) == null || bitmap.length != width * height) {
                return;
            }
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, width, height, Bitmap.Config.ARGB_8888);
            this.f41489d.setFilterBitmap(true);
            canvas.drawBitmap(createBitmap, 0.0f, 0.0f, this.f41489d);
        }
    }

    @Override // com.shopify.reactnative.skia.j
    public native void registerView(int i10);

    public void setAndroidWarmup(boolean z10) {
        this.f41490e = z10;
        setWillNotDraw(!z10);
    }

    public native void setBgColor(int i10);

    @Override // com.shopify.reactnative.skia.j
    public native void setDebugMode(boolean z10);

    @Override // com.shopify.reactnative.skia.j
    public native void surfaceAvailable(Object obj, int i10, int i11, boolean z10);

    @Override // com.shopify.reactnative.skia.j
    public native void surfaceDestroyed();

    @Override // com.shopify.reactnative.skia.j
    public native void surfaceSizeChanged(Object obj, int i10, int i11, boolean z10);

    @Override // com.shopify.reactnative.skia.j
    public native void unregisterView();
}
