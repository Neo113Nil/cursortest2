package com.vk.profilelist.impl.fragments;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.C4504q2;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.profilelist.api.ProfileListTab;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.eyd0;
import xsna.fgz;
import xsna.jx2;
import xsna.oz50;
import xsna.pos;
import xsna.uqm0;

/* compiled from: UserFriendsListFragment.kt */
/* loaded from: classes5.dex */
public final class UserFriendsListFragment extends AbsProfileListTabFragment {

    /* compiled from: UserFriendsListFragment.kt */
    public static final class a extends oz50 {
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment, xsna.was
    /* renamed from: Co */
    public final void onSuccess(VKList<UserProfile> vKList) {
        FragmentActivity activity;
        zo(vKList);
        if (Oo() == null || (activity = getActivity()) == null || vKList == null) {
            return;
        }
        int i = vKList.i();
        String quantityString = activity.getResources().getQuantityString(R.plurals.friends_tab_title, i, uqm0.f(i));
        eyd0 Oo = Oo();
        if (Oo != null) {
            Oo.Gh(ProfileListTab.FRIENDS, quantityString);
        }
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.fragments.LoaderFragment, xsna.cbs
    public final void onError(Throwable th) {
        eyd0 Oo;
        super.onError(th);
        if (getActivity() == null || (Oo = Oo()) == null) {
            return;
        }
        Oo.Gh(ProfileListTab.FRIENDS, "");
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final void vo(int i, int i2) {
        UserId userId;
        Bundle arguments = getArguments();
        if (arguments == null || (userId = (UserId) arguments.getParcelable("uid")) == null) {
            userId = UserId.d;
        }
        pos posVar = new pos("friends.get", UserProfile.g0);
        posVar.F(userId, "user_id");
        posVar.K("fields", "online_info,can_write_private_message,photo_base,verified,is_friend,friend_status,can_send_friend_request,is_verified");
        posVar.C(i2, "count");
        posVar.C(i, SignalingProtocol.KEY_OFFSET);
        posVar.K(C4504q2.u, "hints");
        this.i0 = new jx2(posVar, new fgz(this)).a();
    }
}
