package com.vk.community.design.view.skeleton.community;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vk.community.design.view.skeleton.community.header.CommunityHeaderSkeleton;
import com.vk.community.design.view.skeleton.community.header.CommunityLiveHeaderSkeleton;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.too0;

/* compiled from: CommunityProfileSkeleton.kt */
/* loaded from: classes17.dex */
public final class CommunityProfileSkeleton extends LinearLayout implements too0 {
    public final CommunityHeaderSkeleton b;
    public final CommunityLiveHeaderSkeleton c;

    public CommunityProfileSkeleton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.community_view_skeleton, (ViewGroup) this, true);
        setOrientation(1);
        this.b = (CommunityHeaderSkeleton) findViewById(R.id.header_skeleton_shimmer);
        this.c = (CommunityLiveHeaderSkeleton) findViewById(R.id.live_header_skeleton_shimmer);
    }

    public final void setCover(boolean z) {
        bwt0.p0(this.b, !z);
        bwt0.p0(this.c, z);
    }

    @Override // xsna.too0
    public final void Ng() {
    }
}
