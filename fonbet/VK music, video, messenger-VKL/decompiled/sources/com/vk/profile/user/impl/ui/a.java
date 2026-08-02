package com.vk.profile.user.impl.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.picture.VkImage;
import com.vk.profile.core.cover.a;
import com.vk.profile.design.view.cover.SnowballsCoverView;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.profile.user.impl.ui.view.header.UserProfileHeaderView;
import com.vk.profile.user.impl.ui.view.skeleton.UserProfileSkeletonView;
import com.vk.profile.user.impl.ui.viewdelegates.SnowballsCoverHolder;
import com.vkontakte.android.R;
import xsna.cn70;
import xsna.hpq0;
import xsna.khc0;

/* compiled from: OldUserProfileHeaderBehavior.kt */
/* loaded from: classes5.dex */
public final class a {
    public final VkImage a;
    public final VkImage b;
    public final SnowballsCoverHolder c;
    public final UserProfileSkeletonView d;
    public final UserProfileHeaderView e;
    public hpq0 f;
    public khc0 g;
    public final com.vk.profile.core.cover.a h;
    public boolean i;
    public boolean j;
    public final com.vk.profile.user.impl.ui.adapter.a k;

    public a(View view, boolean z, final UserProfileFragment.a aVar, RecyclerView recyclerView) {
        VkImage vkImage = (VkImage) view.findViewById(z ? R.id.iv_cover_tabs_modal : R.id.iv_cover_tabs);
        this.a = vkImage;
        VkImage vkImage2 = (VkImage) view.findViewById(z ? R.id.iv_cover_reflect_tabs_modal : R.id.iv_cover_reflect_tabs);
        this.b = vkImage2;
        SnowballsCoverHolder snowballsCoverHolder = new SnowballsCoverHolder((SnowballsCoverView) view.findViewById(z ? R.id.snowballs_cover_tabs_modal : R.id.snowballs_cover_tabs));
        this.c = snowballsCoverHolder;
        this.d = (UserProfileSkeletonView) view.findViewById(z ? R.id.profile_skeleton_tabs_modal : R.id.profile_skeleton_tabs);
        final UserProfileHeaderView userProfileHeaderView = (UserProfileHeaderView) view.findViewById(z ? R.id.header_tabs_modal : R.id.header_tabs);
        this.e = userProfileHeaderView;
        this.i = true;
        com.vk.profile.core.cover.a aVar2 = new com.vk.profile.core.cover.a(vkImage, vkImage2, snowballsCoverHolder, recyclerView);
        this.h = aVar2;
        userProfileHeaderView.t = aVar2;
        userProfileHeaderView.u = aVar;
        aVar2.l.add(new a.InterfaceC1639a() { // from class: xsna.hqq0
            @Override // com.vk.profile.core.cover.a.InterfaceC1639a
            public final void a(float f) {
                UserProfileHeaderView.Q4(UserProfileHeaderView.this, aVar, f);
            }
        });
        this.k = new com.vk.profile.user.impl.ui.adapter.a(cn70.b(0), cn70.b(0), cn70.b(0), cn70.b(9), cn70.b(2));
    }
}
