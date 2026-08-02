package com.vk.libvideo.live.impl.views.write;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes3.dex */
public class ImageViewAnchor extends AppCompatImageView {
    public ImageViewAnchor(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect, boolean z) {
        return false;
    }
}
