package com.vk.catalog2.common.ui.holders.group.avatar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.vk.avatar.api.VKAvatarView;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.toggle.b;
import com.vk.toggle.features.VideoFeatures;
import xsna.cq5;
import xsna.far0;
import xsna.s3q0;
import xsna.zgu;

/* compiled from: GroupAvatarView.kt */
/* loaded from: classes16.dex */
public final class GroupAvatarView extends VKAvatarView implements zgu {
    public final boolean s;

    public GroupAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_AVATAR_LIVE_BADGE;
        videoFeatures.getClass();
        this.s = b.A.a(videoFeatures);
    }

    @Override // xsna.zgu
    public final void B(String str, boolean z, boolean z2, cq5 cq5Var) {
        AvatarBorderType avatarBorderType = z ? AvatarBorderType.HEXAGON : AvatarBorderType.CIRCLE;
        boolean z3 = this.s;
        if (z2 && z3) {
            cq5Var = cq5.g.a;
        }
        VKAvatarView.c1(this, avatarBorderType, cq5Var, 4);
        load(str);
        if (z3) {
            if (z2) {
                new com.vk.core.view.components.avatar.badge.b(null, true, null, null, 27);
                return;
            }
            far0 far0Var = this.m;
            far0Var.h.clear();
            far0Var.a.invalidate();
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.ts5
    public View getView() {
        return this;
    }

    @Override // xsna.zgu
    public final void L(int i) {
    }
}
