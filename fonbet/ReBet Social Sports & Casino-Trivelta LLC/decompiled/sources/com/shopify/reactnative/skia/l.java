package com.shopify.reactnative.skia;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.TextureView;
import lb.C5444x;

/* loaded from: classes4.dex */
public class l extends TextureView implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public String f41522a;

    /* renamed from: b, reason: collision with root package name */
    public m f41523b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f41524c;

    /* renamed from: d, reason: collision with root package name */
    public long f41525d;

    public l(Context context, m mVar, boolean z10) {
        super(context);
        this.f41522a = "SkiaTextureView";
        this.f41525d = 0L;
        this.f41523b = mVar;
        this.f41524c = z10;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        Log.i(this.f41522a, "onSurfaceTextureAvailable:  " + i10 + C5444x.f55808b + i11);
        this.f41523b.k(surfaceTexture, i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f41523b.g();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Log.i(this.f41522a, "onSurfaceTextureSizeChanged:  " + i10 + C5444x.f55808b + i11);
        this.f41523b.m(surfaceTexture, i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f41524c) {
            long timestamp = surfaceTexture.getTimestamp();
            Log.i("SkiaTextureView", "onSurfaceTextureUpdated " + ((timestamp - this.f41525d) / 1000000) + "ms");
            this.f41525d = timestamp;
        }
    }
}
