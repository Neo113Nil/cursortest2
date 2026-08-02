package com.vk.core.view.components.divider;

import android.content.Context;
import android.util.AttributeSet;

/* compiled from: VkSeparator.kt */
/* loaded from: classes17.dex */
public class VkSeparator extends VkDivider {
    public VkSeparator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public VkSeparator(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
