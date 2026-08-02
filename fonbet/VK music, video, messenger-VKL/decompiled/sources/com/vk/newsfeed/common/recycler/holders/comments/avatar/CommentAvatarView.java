package com.vk.newsfeed.common.recycler.holders.comments.avatar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.avatar.api.VKAvatarView;
import com.vk.avatar.api.border.AvatarBorderType;
import xsna.cq5;
import xsna.qag;

/* compiled from: CommentAvatarView.kt */
/* loaded from: classes4.dex */
public final class CommentAvatarView extends VKAvatarView implements qag {
    public CommentAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setRound(false);
        y0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
    }

    @Override // xsna.qag
    public final void R(boolean z, AvatarBorderType avatarBorderType) {
        VKAvatarView.c1(this, avatarBorderType, z ? cq5.h.a : cq5.b.a, 4);
    }

    @Override // xsna.ts5
    public View getView() {
        return this;
    }
}
