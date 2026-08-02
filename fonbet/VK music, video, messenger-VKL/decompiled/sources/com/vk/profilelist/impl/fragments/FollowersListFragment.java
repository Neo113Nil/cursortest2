package com.vk.profilelist.impl.fragments;

import android.content.Context;
import android.os.Bundle;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.profilelist.api.ProfileListTab;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.c1r0;
import xsna.eyd0;
import xsna.fgz;
import xsna.jx2;
import xsna.uqm0;

/* compiled from: FollowersListFragment.kt */
/* loaded from: classes5.dex */
public class FollowersListFragment extends AbsProfileListTabFragment {
    public final String Q0 = t0.a(MobileOfficialAppsCoreNavStat$EventScreen.PROFILE_FOLLOWERS);

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment, xsna.was
    /* renamed from: Co */
    public final void onSuccess(VKList<UserProfile> vKList) {
        zo(vKList);
        Context mo2getContext = mo2getContext();
        if (mo2getContext == null || vKList == null) {
            return;
        }
        int i = vKList.i();
        String quantityString = mo2getContext.getResources().getQuantityString(R.plurals.followers_tab_title, i, uqm0.f(i));
        eyd0 Oo = Oo();
        if (Oo != null) {
            Oo.Gh(ProfileListTab.FOLLOWERS, quantityString);
        }
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.fragments.LoaderFragment, xsna.cbs
    public final void onError(Throwable th) {
        eyd0 Oo;
        super.onError(th);
        if (mo2getContext() == null || (Oo = Oo()) == null) {
            return;
        }
        Oo.Gh(ProfileListTab.FOLLOWERS, "");
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final void vo(int i, int i2) {
        UserId userId;
        Bundle arguments = getArguments();
        if (arguments == null || (userId = (UserId) arguments.getParcelable("uid")) == null) {
            userId = UserId.d;
        }
        String str = Po() ? "online_info,photo_base,verified,is_friend,friend_status,can_send_friend_request,can_write_private_message,first_name_acc,last_name_acc,sex,first_name_dat,last_name_dat" : "online_info,photo_base,can_write_private_message,first_name_acc,last_name_acc,sex,first_name_dat,last_name_dat";
        c1r0 c1r0Var = new c1r0("users.getFollowers", UserProfile.g0);
        c1r0Var.K("fields", str);
        c1r0Var.F(userId, "user_id");
        c1r0Var.C(i, SignalingProtocol.KEY_OFFSET);
        c1r0Var.C(i2, "count");
        c1r0Var.K("ref", this.Q0);
        this.i0 = new jx2(c1r0Var, new fgz(this)).a();
    }
}
