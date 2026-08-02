package com.yandex.mapkit.mapview;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.map.internal.MapWindowBinding;
import com.yandex.runtime.view.PlatformGLSurfaceTextureView;

/* loaded from: classes9.dex */
public class MapTexture {
    private MapWindowBinding mapWindow;
    private PlatformGLSurfaceTextureView platformGLView;

    public MapTexture(Context context) {
        this(context, false);
    }

    public MapWindow getMapWindow() {
        return this.mapWindow;
    }

    public void onStart() {
        this.platformGLView.start();
        this.platformGLView.resume();
    }

    public void onStop() {
        this.platformGLView.pause();
        this.platformGLView.stop();
    }

    public void onTextureSizeChanged(int i11, int i12) {
        this.platformGLView.onSizeChanged(i11, i12);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.platformGLView.onTouchEvent(motionEvent);
    }

    public void removeTexture() {
        this.platformGLView.onTextureDestroyed();
    }

    public void setNoninteractive(boolean z11) {
        this.platformGLView.setNoninteractive(z11);
    }

    public void setTexture(SurfaceTexture surfaceTexture, int i11, int i12) {
        this.platformGLView.setTexture(surfaceTexture, i11, i12);
    }

    public MapTexture(Context context, int i11, int i12) {
        this(context, i11, i12, false);
    }

    public MapTexture(Context context, int i11, int i12, boolean z11) {
        MapKitFactory.initialize(context);
        this.platformGLView = new PlatformGLSurfaceTextureView(context, i11, i12, z11);
        this.mapWindow = (MapWindowBinding) MapKitFactory.getInstance().createMapWindow(this.platformGLView);
    }

    public MapTexture(Context context, boolean z11) {
        MapKitFactory.initialize(context);
        this.platformGLView = new PlatformGLSurfaceTextureView(context, z11);
        this.mapWindow = (MapWindowBinding) MapKitFactory.getInstance().createMapWindow(this.platformGLView);
    }
}
