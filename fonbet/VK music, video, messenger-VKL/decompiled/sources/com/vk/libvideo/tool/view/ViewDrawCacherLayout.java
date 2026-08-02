package com.vk.libvideo.tool.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import xsna.avt0;
import xsna.epx;
import xsna.s3q0;

/* compiled from: ViewDrawCacherLayout.kt */
/* loaded from: classes3.dex */
public final class ViewDrawCacherLayout extends FrameLayout {
    public avt0 b;

    public ViewDrawCacherLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        RecordingCanvas beginRecording;
        if (Build.VERSION.SDK_INT < 29) {
            super.dispatchDraw(canvas);
            return;
        }
        avt0 avt0Var = this.b;
        if (avt0Var == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int width = getWidth();
        int height = getHeight();
        if (!canvas.isHardwareAccelerated()) {
            super.dispatchDraw(canvas);
            s3q0 s3q0Var = s3q0.a;
            return;
        }
        RenderNode renderNode = avt0Var.a.a;
        renderNode.setPosition(0, 0, width, height);
        beginRecording = renderNode.beginRecording();
        try {
            super.dispatchDraw(beginRecording);
            s3q0 s3q0Var2 = s3q0.a;
        } finally {
            renderNode.endRecording();
            canvas.drawRenderNode(renderNode);
        }
    }

    public final avt0 getViewDrawCacher() {
        return this.b;
    }

    public final void setViewDrawCacher(avt0 avt0Var) {
        if (epx.f(this.b, avt0Var)) {
            return;
        }
        this.b = avt0Var;
        invalidate();
    }
}
