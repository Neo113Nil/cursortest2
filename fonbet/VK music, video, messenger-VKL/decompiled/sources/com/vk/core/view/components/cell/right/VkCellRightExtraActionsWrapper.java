package com.vk.core.view.components.cell.right;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: VkCellRightExtraActionsWrapper.kt */
/* loaded from: classes17.dex */
public final class VkCellRightExtraActionsWrapper extends FrameLayout {
    public VkCellRightExtraActionsWrapper(Context context) {
        this(context, null, 0, 14, 0);
    }

    public VkCellRightExtraActionsWrapper(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public VkCellRightExtraActionsWrapper(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ VkCellRightExtraActionsWrapper(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public VkCellRightExtraActionsWrapper(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSetPressed(boolean z) {
    }
}
