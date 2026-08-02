package com.vk.feed.tool.view.posting.photoviewer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PhotoViewerLayout.kt */
/* loaded from: classes18.dex */
public final class PhotoViewerLayout extends FrameLayout {
    public View.OnTouchListener b;

    public PhotoViewerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public final View.OnTouchListener getInterceptToucheEventListener() {
        return this.b;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.b;
        return onTouchListener != null ? onTouchListener.onTouch(this, motionEvent) : super.onInterceptTouchEvent(motionEvent);
    }

    public final void setInterceptToucheEventListener(View.OnTouchListener onTouchListener) {
        this.b = onTouchListener;
    }
}
