package com.shopify.reactnative.skia;

import android.content.Context;
import android.view.Surface;
import android.view.View;
import com.facebook.react.views.view.ReactViewGroup;
import h8.InterfaceC4488a;

/* loaded from: classes4.dex */
public class WebGPUView extends ReactViewGroup implements r {

    /* renamed from: a, reason: collision with root package name */
    public int f41491a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f41492b;

    /* renamed from: c, reason: collision with root package name */
    public View f41493c;

    public WebGPUView(Context context) {
        super(context);
        this.f41492b = false;
        this.f41493c = null;
    }

    @InterfaceC4488a
    private native void onSurfaceChanged(Surface surface, int i10, float f10, float f11);

    @InterfaceC4488a
    private native void onSurfaceCreate(Surface surface, int i10, float f10, float f11);

    @InterfaceC4488a
    private native void onSurfaceDestroy(int i10);

    @InterfaceC4488a
    private native void switchToOffscreenSurface(int i10);

    @Override // com.shopify.reactnative.skia.r
    public void b() {
        switchToOffscreenSurface(this.f41491a);
    }

    @Override // com.shopify.reactnative.skia.r
    public void d(Surface surface) {
        float f10 = getResources().getDisplayMetrics().density;
        onSurfaceChanged(surface, this.f41491a, getWidth() / f10, getHeight() / f10);
    }

    @Override // com.shopify.reactnative.skia.r
    public void h(Surface surface) {
        float f10 = getResources().getDisplayMetrics().density;
        onSurfaceCreate(surface, this.f41491a, getWidth() / f10, getHeight() / f10);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.f41493c;
        if (view != null) {
            view.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setContextId(int i10) {
        this.f41491a = i10;
    }

    public void setTransparent(boolean z10) {
        Context context = getContext();
        if (z10 != this.f41492b || this.f41493c == null) {
            View view = this.f41493c;
            if (view != null) {
                removeView(view);
            }
            this.f41492b = z10;
            if (z10) {
                this.f41493c = new q(context, this);
            } else {
                this.f41493c = new p(context, this);
            }
            addView(this.f41493c);
        }
    }

    @Override // com.shopify.reactnative.skia.r
    public void surfaceDestroyed() {
        onSurfaceDestroy(this.f41491a);
    }
}
