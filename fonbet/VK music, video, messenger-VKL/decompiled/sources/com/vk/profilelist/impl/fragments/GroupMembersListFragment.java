package com.vk.profilelist.impl.fragments;

import android.os.Bundle;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import com.vk.toggle.b;
import com.vk.toggle.features.ComFeatures;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.disposables.c;
import java.util.List;
import xsna.e43;
import xsna.fgz;
import xsna.fkq0;
import xsna.fz2;
import xsna.jx2;
import xsna.kpr;
import xsna.oz50;
import xsna.qru;
import xsna.vpu;
import xsna.xqu;
import xsna.yfb;
import xsna.zqu;

/* compiled from: GroupMembersListFragment.kt */
/* loaded from: classes5.dex */
public final class GroupMembersListFragment extends AbsProfileListTabFragment {
    public static final List<UsersFieldsDto> R0;
    public static final List<UsersFieldsDto> S0;
    public final String Q0 = t0.a(MobileOfficialAppsCoreNavStat$EventScreen.GROUP_MEMBERS_LIST);

    /* compiled from: GroupMembersListFragment.kt */
    public static final class a extends oz50 {
    }

    static {
        UsersFieldsDto usersFieldsDto = UsersFieldsDto.ONLINE_INFO;
        UsersFieldsDto usersFieldsDto2 = UsersFieldsDto.PHOTO_BASE;
        UsersFieldsDto usersFieldsDto3 = UsersFieldsDto.IS_NFT;
        UsersFieldsDto usersFieldsDto4 = UsersFieldsDto.FIRST_NAME_ACC;
        UsersFieldsDto usersFieldsDto5 = UsersFieldsDto.LAST_NAME_ACC;
        UsersFieldsDto usersFieldsDto6 = UsersFieldsDto.SEX;
        UsersFieldsDto usersFieldsDto7 = UsersFieldsDto.FIRST_NAME_DAT;
        UsersFieldsDto usersFieldsDto8 = UsersFieldsDto.LAST_NAME_DAT;
        R0 = e43.l(usersFieldsDto, usersFieldsDto2, usersFieldsDto3, usersFieldsDto4, usersFieldsDto5, usersFieldsDto6, usersFieldsDto7, usersFieldsDto8);
        S0 = e43.l(usersFieldsDto, UsersFieldsDto.VERIFIED, UsersFieldsDto.IS_FRIEND, UsersFieldsDto.FRIEND_STATUS, UsersFieldsDto.CAN_SEND_FRIEND_REQUEST, UsersFieldsDto.CAN_WRITE_PRIVATE_MESSAGE, usersFieldsDto4, usersFieldsDto5, usersFieldsDto6, usersFieldsDto7, usersFieldsDto8, usersFieldsDto2);
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final void vo(int i, int i2) {
        UserId userId;
        c a2;
        Bundle arguments = getArguments();
        if (arguments == null || (userId = (UserId) arguments.getParcelable("uid")) == null) {
            userId = UserId.d;
        }
        UserId userId2 = userId;
        ComFeatures comFeatures = ComFeatures.COM_MIGRATE_GROUPS_GET_MEMBERS;
        comFeatures.getClass();
        if (b.A.a(comFeatures)) {
            fz2 y = yfb.y(xqu.g(new zqu(), fkq0.a(userId2), null, Integer.valueOf(i), Integer.valueOf(i2), Po() ? S0 : R0, null, null, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE), new kpr(new qru(), 1));
            y.K("ref", this.Q0);
            a2 = new jx2(y, new fgz(this)).a();
        } else {
            a2 = new jx2(new vpu(userId2, i, i2, null, Po() ? "online_info,verified,is_friend,friend_status,can_send_friend_request,can_write_private_message,first_name_acc,last_name_acc,sex,first_name_dat,last_name_dat,photo_base" : "online_info,photo_base,is_nft,first_name_acc,last_name_acc,sex,first_name_dat,last_name_dat", this.Q0), new fgz(this)).a();
        }
        this.i0 = a2;
    }
}
