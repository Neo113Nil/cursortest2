package com.vk.newsfeed.common.recycler.holders.comments.avatar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.imageloader.view.VKImageView;
import xsna.qag;

/* compiled from: CommentSmallAvatarView.kt */
/* loaded from: classes4.dex */
public final class CommentSmallAvatarView extends VKImageView implements qag {
    public CommentSmallAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // xsna.ts5
    public View getView() {
        return this;
    }

    @Override // xsna.qag
    public final void R(boolean z, AvatarBorderType avatarBorderType) {
    }
}
