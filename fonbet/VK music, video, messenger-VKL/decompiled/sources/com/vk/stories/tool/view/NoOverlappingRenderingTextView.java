package com.vk.stories.tool.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes6.dex */
public class NoOverlappingRenderingTextView extends AppCompatTextView {
    public NoOverlappingRenderingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }
}
