package com.vk.video.profile.presentation.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import com.vk.core.view.components.button.VkButton;
import com.vk.video.profile.presentation.views.VideoProfileEditButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import xsna.v7t0;

/* compiled from: VideoProfileEditButton.kt */
/* loaded from: classes6.dex */
public final class VideoProfileEditButton extends VkButton {
    public final LinkedHashSet a0;
    public final v7t0 b0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.ViewTreeObserver$OnGlobalLayoutListener, xsna.v7t0] */
    public VideoProfileEditButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a0 = new LinkedHashSet();
        ?? r2 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: xsna.v7t0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                VideoProfileEditButton videoProfileEditButton = VideoProfileEditButton.this;
                Iterator it = videoProfileEditButton.a0.iterator();
                while (it.hasNext()) {
                    ((View.OnLayoutChangeListener) it.next()).onLayoutChange(videoProfileEditButton, videoProfileEditButton.getLeft(), videoProfileEditButton.getTop(), videoProfileEditButton.getRight(), videoProfileEditButton.getBottom(), videoProfileEditButton.getLeft(), videoProfileEditButton.getTop(), videoProfileEditButton.getRight(), videoProfileEditButton.getBottom());
                }
            }
        };
        this.b0 = r2;
        getViewTreeObserver().addOnGlobalLayoutListener(r2);
    }

    @Override // android.view.View
    public final void addOnLayoutChangeListener(View.OnLayoutChangeListener onLayoutChangeListener) {
        if (onLayoutChangeListener != null) {
            this.a0.add(onLayoutChangeListener);
        }
        super.addOnLayoutChangeListener(onLayoutChangeListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnGlobalLayoutListener(this.b0);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void removeOnLayoutChangeListener(View.OnLayoutChangeListener onLayoutChangeListener) {
        if (onLayoutChangeListener != null) {
            this.a0.remove(onLayoutChangeListener);
        }
        super.removeOnLayoutChangeListener(onLayoutChangeListener);
    }
}
