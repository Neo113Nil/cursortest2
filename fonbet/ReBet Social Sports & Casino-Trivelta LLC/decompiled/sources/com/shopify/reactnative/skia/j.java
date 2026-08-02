package com.shopify.reactnative.skia;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.views.view.ReactViewGroup;

/* loaded from: classes4.dex */
public abstract class j extends ReactViewGroup implements m {

    /* renamed from: a, reason: collision with root package name */
    public View f41517a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f41518b;

    /* renamed from: c, reason: collision with root package name */
    public final String f41519c;

    public j(Context context) {
        super(context);
        this.f41518b = false;
        this.f41519c = "SkiaView";
        l lVar = new l(context, this, false);
        this.f41517a = lVar;
        addView(lVar);
    }

    public void c(Surface surface, int i10, int i11) {
        Log.i("SkiaView", "onSurfaceTextureSizeChanged " + i10 + "/" + i11);
        surfaceSizeChanged(surface, i10, i11, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (PointerEvents.canBeTouchTarget(getPointerEvents())) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.shopify.reactnative.skia.m
    public void g() {
        surfaceDestroyed();
    }

    public void i(Surface surface, int i10, int i11) {
        surfaceAvailable(surface, i10, i11, true);
    }

    public void k(SurfaceTexture surfaceTexture, int i10, int i11) {
        surfaceAvailable(surfaceTexture, i10, i11, false);
    }

    public void m(SurfaceTexture surfaceTexture, int i10, int i11) {
        Log.i("SkiaView", "onSurfaceTextureSizeChanged " + i10 + "/" + i11);
        surfaceSizeChanged(surfaceTexture, i10, i11, false);
    }

    public void o() {
        if (RNSkiaModule.isModuleValid()) {
            unregisterView();
        }
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f41517a.layout(0, 0, i12 - i10, i13 - i11);
    }

    public abstract void registerView(int i10);

    public abstract void setDebugMode(boolean z10);

    public void setOpaque(boolean z10) {
        if (z10) {
            View view = this.f41517a;
            if (view instanceof l) {
                removeView(view);
                k kVar = new k(getContext(), this, false);
                this.f41517a = kVar;
                addView(kVar);
                return;
            }
        }
        if (z10) {
            return;
        }
        View view2 = this.f41517a;
        if (view2 instanceof k) {
            removeView(view2);
            l lVar = new l(getContext(), this, false);
            this.f41517a = lVar;
            addView(lVar);
        }
    }

    public abstract void surfaceAvailable(Object obj, int i10, int i11, boolean z10);

    public abstract void surfaceDestroyed();

    public abstract void surfaceSizeChanged(Object obj, int i10, int i11, boolean z10);

    public abstract void unregisterView();
}
