package com.vk.core.view.components.picture;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

/* compiled from: VkImageSimple.kt */
/* loaded from: classes.dex */
public final class VkImageSimple extends AppCompatImageView {
    public VkImageSimple(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public VkImageSimple(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
