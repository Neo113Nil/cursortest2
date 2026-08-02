package com.vk.ecomm.tool.view.feed;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import xsna.fv90;
import xsna.gzs;
import xsna.izs;
import xsna.kl2;
import xsna.s3q0;

/* compiled from: ProductsPhotoOverlayView.kt */
/* loaded from: classes18.dex */
public final class ProductsPhotoOverlayView extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public gzs<s3q0> b;
    public gzs<Boolean> c;
    public izs<? super MotionEvent, Boolean> d;

    public ProductsPhotoOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static void a(ProductsPhotoOverlayView productsPhotoOverlayView, gzs gzsVar, gzs gzsVar2, fv90 fv90Var, int i) {
        if ((i & 8) != 0) {
            fv90Var = null;
        }
        productsPhotoOverlayView.b = gzsVar;
        productsPhotoOverlayView.c = gzsVar2;
        productsPhotoOverlayView.d = fv90Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        gzs<Boolean> gzsVar = this.c;
        if (gzsVar != null) {
            if (gzsVar.invoke().booleanValue()) {
                for (int i = 0; i < getChildCount(); i++) {
                    getChildAt(i).setVisibility(0);
                }
            } else {
                for (int i2 = 0; i2 < getChildCount(); i2++) {
                    getChildAt(i2).setVisibility(8);
                }
            }
            super.dispatchDraw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        izs<? super MotionEvent, Boolean> izsVar = this.d;
        return (izsVar != null ? izsVar.invoke(motionEvent).booleanValue() : false) || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        getHandler().post(new kl2(this, 7));
    }

    public ProductsPhotoOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        setWillNotDraw(false);
    }
}
