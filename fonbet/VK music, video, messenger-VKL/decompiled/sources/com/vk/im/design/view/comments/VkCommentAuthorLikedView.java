package com.vk.im.design.view.comments;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.picture.VkImage;
import xsna.hbh0;
import xsna.s3q0;

/* compiled from: VkCommentAuthorLikedView.kt */
/* loaded from: classes2.dex */
public final class VkCommentAuthorLikedView extends FrameLayout {
    public static final /* synthetic */ int d = 0;
    public final VkAvatar b;
    public final VkImage c;

    /* compiled from: VkCommentAuthorLikedView.kt */
    public static final class a {
    }

    public VkCommentAuthorLikedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        VkAvatar vkAvatar = new VkAvatar(context, null, 6, 0);
        this.b = vkAvatar;
        VkImage vkImage = new VkImage(context, null, 6, 0);
        vkImage.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.c = vkImage;
        int b = hbh0.b(16, context);
        int b2 = hbh0.b(20, context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b, b);
        layoutParams.gravity = 16;
        s3q0 s3q0Var = s3q0.a;
        addView(vkAvatar, layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(b2, b2);
        layoutParams2.setMarginStart(hbh0.b(10, context));
        addView(vkImage, layoutParams2);
    }
}
