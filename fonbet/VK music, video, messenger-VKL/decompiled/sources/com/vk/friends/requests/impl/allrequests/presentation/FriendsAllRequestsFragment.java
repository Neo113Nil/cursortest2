package com.vk.friends.requests.impl.allrequests.presentation;

import com.vk.friends.requests.impl.allrequests.presentation.FriendRequestsTabFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;

/* compiled from: FriendsAllRequestsFragment.kt */
/* loaded from: classes16.dex */
public final class FriendsAllRequestsFragment extends FriendsRequestFragment {

    /* compiled from: FriendsAllRequestsFragment.kt */
    public static final class a extends FriendRequestsTabFragment.d {
    }

    @Override // com.vk.friends.requests.impl.allrequests.presentation.FriendRequestsTabFragment
    public final String getRef() {
        return t0.a(MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS_REQUESTS_ALL);
    }
}
