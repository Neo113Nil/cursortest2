package com.vk.friends.requests.impl.requests.presentation;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.RequestUserProfile;
import com.vk.lists.ListDataSet;
import xsna.ijs;
import xsna.njs;
import xsna.ojs;

/* compiled from: FriendRequestsFragment.kt */
/* loaded from: classes16.dex */
public final class FriendRequestsFragment$receiver$1 extends BroadcastReceiver {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ FriendRequestsFragment a;

    public FriendRequestsFragment$receiver$1(FriendRequestsFragment friendRequestsFragment) {
        this.a = friendRequestsFragment;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        UserId userId;
        if (!"com.vkontakte.android.ACTION_FRIEND_STATUS_CHANGED".equals(intent.getAction()) || (userId = (UserId) intent.getParcelableExtra("id")) == null) {
            return;
        }
        int intExtra = intent.getIntExtra("status", 0);
        FriendRequestsFragment friendRequestsFragment = this.a;
        ijs ijsVar = friendRequestsFragment.a0;
        RequestUserProfile requestUserProfile = ijsVar != null ? (RequestUserProfile) ((ListDataSet) ijsVar.c).t(new ojs(new njs(userId), 0)) : null;
        if (requestUserProfile != null) {
            requestUserProfile.i0 = Boolean.valueOf(intExtra == 1 || intExtra == 3);
            ijs ijsVar2 = friendRequestsFragment.a0;
            if (ijsVar2 != null) {
                ijsVar2.F0(requestUserProfile, requestUserProfile);
            }
        }
    }
}
