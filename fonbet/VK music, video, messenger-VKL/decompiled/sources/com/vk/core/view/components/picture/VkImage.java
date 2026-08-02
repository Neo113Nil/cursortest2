package com.vk.core.view.components.picture;

import android.content.Context;
import android.util.AttributeSet;
import com.vk.imageloader.view.DefaultVkImageView;
import xsna.too0;

/* compiled from: VkImage.kt */
/* loaded from: classes.dex */
public class VkImage extends DefaultVkImageView implements too0 {
    public static final /* synthetic */ int k = 0;

    public VkImage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public VkImage(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
