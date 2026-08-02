package com.vk.profilelist.impl.fragments;

import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.dto.common.id.UserId;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.f1r0;
import xsna.fgz;
import xsna.g1r0;
import xsna.jx2;

/* compiled from: SubscriptionsUserListFragment.kt */
/* loaded from: classes5.dex */
public class SubscriptionsUserListFragment extends AbsProfileListTabFragment {
    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final void vo(int i, int i2) {
        UserId userId;
        Bundle arguments = getArguments();
        if (arguments == null || (userId = (UserId) arguments.getParcelable("uid")) == null) {
            userId = UserId.d;
        }
        g1r0 g1r0Var = new g1r0("users.getSubscriptions", new f1r0());
        g1r0Var.F(userId, "user_id");
        g1r0Var.C(i, SignalingProtocol.KEY_OFFSET);
        g1r0Var.C(i2, "count");
        g1r0Var.C(1, "extended");
        g1r0Var.K("fields", "online_info,photo_base,verified,is_friend,friend_status,can_send_friend_request,is_member,is_closed");
        if (!TextUtils.isEmpty(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)) {
            g1r0Var.K("from", CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
        }
        this.i0 = new jx2(g1r0Var, new fgz(this)).a();
    }
}
