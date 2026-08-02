package com.vk.profile.user.impl.ui.view.skeleton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.vk.profile.design.view.skeleton.ProfileHeaderSkeletonView;
import com.vkontakte.android.R;
import xsna.bwt0;

/* compiled from: UserProfileSkeletonView.kt */
/* loaded from: classes5.dex */
public final class UserProfileSkeletonView extends LinearLayout {
    public final ProfileHeaderSkeletonView b;

    public UserProfileSkeletonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.user_profile_view_skeleton, (ViewGroup) this, true);
        this.b = (ProfileHeaderSkeletonView) findViewById(R.id.skeleton_profile_header);
        bwt0.p0((FrameLayout) findViewById(R.id.skeleton_profile_content_tabs), true);
    }
}
