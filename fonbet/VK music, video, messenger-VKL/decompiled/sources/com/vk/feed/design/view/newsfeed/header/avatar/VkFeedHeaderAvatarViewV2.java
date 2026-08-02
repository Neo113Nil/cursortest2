package com.vk.feed.design.view.newsfeed.header.avatar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.vk.core.view.components.avatar.VkAvatar;

/* compiled from: VkFeedHeaderAvatarViewV2.kt */
/* loaded from: classes18.dex */
public final class VkFeedHeaderAvatarViewV2 extends VkAvatar {
    public VkFeedHeaderAvatarViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // xsna.zjt
    public final void F0(Drawable drawable, ImageView.ScaleType scaleType) {
        setPlaceholderImage(drawable);
    }

    @Override // xsna.zjt
    public void setEmptyImagePlaceholder(int i) {
        setPlaceholderImage(i);
    }

    public final View getView() {
        return this;
    }
}
