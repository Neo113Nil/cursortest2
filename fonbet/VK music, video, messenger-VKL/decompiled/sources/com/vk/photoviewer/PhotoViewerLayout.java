package com.vk.photoviewer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import xsna.xnj;

/* compiled from: PhotoViewerLayout.kt */
/* loaded from: classes3.dex */
public final class PhotoViewerLayout extends FrameLayout {
    public View.OnTouchListener b;
    public xnj c;

    public PhotoViewerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public final xnj getContextMenuCreator() {
        return this.c;
    }

    public final View.OnTouchListener getInterceptToucheEventListener() {
        return this.b;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.b;
        return onTouchListener != null ? onTouchListener.onTouch(this, motionEvent) : super.onInterceptTouchEvent(motionEvent);
    }

    public final void setContextMenuCreator(xnj xnjVar) {
        this.c = xnjVar;
    }

    public final void setInterceptToucheEventListener(View.OnTouchListener onTouchListener) {
        this.b = onTouchListener;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean showContextMenuForChild(View view) {
        xnj xnjVar = this.c;
        return xnjVar != null ? xnjVar.showContextMenuForChild(view, -1.0f, -1.0f) : super.showContextMenuForChild(view);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean showContextMenuForChild(View view, float f, float f2) {
        xnj xnjVar = this.c;
        return xnjVar != null ? xnjVar.showContextMenuForChild(view, f, f2) : super.showContextMenuForChild(view, f, f2);
    }
}
