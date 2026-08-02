package com.vk.photo.editor.views.zoom;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import xsna.u6y0;

/* compiled from: ZoomContentLayout.kt */
/* loaded from: classes4.dex */
public final class ZoomContentLayout extends FrameLayout {
    public u6y0 b;
    public final Matrix c;

    public ZoomContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.c = new Matrix();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Matrix contentMatrix;
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Matrix matrix = this.c;
        matrix.reset();
        u6y0 u6y0Var = this.b;
        if (u6y0Var != null && (contentMatrix = u6y0Var.getContentMatrix()) != null) {
            contentMatrix.invert(matrix);
        }
        obtain.transform(matrix);
        return super.dispatchTouchEvent(obtain);
    }

    public final u6y0 getZoomMatrixProvider$api_release() {
        return this.b;
    }

    public final void setZoomMatrixProvider$api_release(u6y0 u6y0Var) {
        this.b = u6y0Var;
    }
}
