package com.vk.catalog2.common.ui.holders.friend;

import android.view.View;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.core.analytics.tracking.FriendsAnalyticsInfo;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.user.UserProfile;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.fha;
import xsna.izs;
import xsna.qzg;
import xsna.s3q0;

/* compiled from: FriendsItemSearchListVh.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class a extends FunctionReferenceImpl implements izs<View, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(View view) {
        View view2 = view;
        FriendsItemSearchListVh friendsItemSearchListVh = (FriendsItemSearchListVh) this.receiver;
        UIBlockProfile uIBlockProfile = friendsItemSearchListVh.i;
        if (uIBlockProfile != null) {
            UserProfile userProfile = uIBlockProfile.A;
            friendsItemSearchListVh.g(uIBlockProfile, new FriendsAnalyticsInfo(FriendsAnalyticsInfo.ClickTarget.ShowStory));
            friendsItemSearchListVh.b.j(new fha.a(view2, new StoryOwner.User(userProfile, null, 2, null), MobileOfficialAppsConStoriesStat$ViewEntryPoint.AVATAR, MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS, new qzg(friendsItemSearchListVh, 17)));
        }
        return s3q0.a;
    }
}
