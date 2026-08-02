package com.vk.video.ui.discovery.minimizable.player.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: VideoViewContainer.kt */
/* loaded from: classes7.dex */
public final class VideoViewContainer extends FrameLayout {
    public boolean b;

    public VideoViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.b) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setInteractionEnabled(boolean z) {
        this.b = z;
    }
}
