package com.vk.stories.tool.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes6.dex */
public class NoOverlappingRenderingFrameLayout extends FrameLayout {
    public NoOverlappingRenderingFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }
}
