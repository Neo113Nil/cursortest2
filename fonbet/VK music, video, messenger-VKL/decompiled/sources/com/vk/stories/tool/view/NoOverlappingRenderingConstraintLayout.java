package com.vk.stories.tool.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes6.dex */
public class NoOverlappingRenderingConstraintLayout extends ConstraintLayout {
    public NoOverlappingRenderingConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }
}
