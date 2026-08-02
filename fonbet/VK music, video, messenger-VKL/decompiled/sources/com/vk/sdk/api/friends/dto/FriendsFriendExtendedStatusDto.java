package com.vk.sdk.api.friends.dto;

import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: FriendsFriendExtendedStatusDto.kt */
/* loaded from: classes5.dex */
public final class FriendsFriendExtendedStatusDto {

    @pmi0("friend_status")
    private final FriendsFriendStatusStatusDto friendStatus;

    @pmi0("is_request_unread")
    private final Boolean isRequestUnread;

    @pmi0("sign")
    private final String sign;

    @pmi0("user_id")
    private final UserId userId;

    public FriendsFriendExtendedStatusDto(FriendsFriendStatusStatusDto friendsFriendStatusStatusDto, UserId userId, Boolean bool, String str) {
        this.friendStatus = friendsFriendStatusStatusDto;
        this.userId = userId;
        this.isRequestUnread = bool;
        this.sign = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsFriendExtendedStatusDto)) {
            return false;
        }
        FriendsFriendExtendedStatusDto friendsFriendExtendedStatusDto = (FriendsFriendExtendedStatusDto) obj;
        return this.friendStatus == friendsFriendExtendedStatusDto.friendStatus && epx.f(this.userId, friendsFriendExtendedStatusDto.userId) && epx.f(this.isRequestUnread, friendsFriendExtendedStatusDto.isRequestUnread) && epx.f(this.sign, friendsFriendExtendedStatusDto.sign);
    }

    public final int hashCode() {
        int a = bh10.a(this.friendStatus.hashCode() * 31, 31, this.userId.b);
        Boolean bool = this.isRequestUnread;
        int hashCode = (a + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.sign;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FriendsFriendExtendedStatusDto(friendStatus=" + this.friendStatus + ", userId=" + this.userId + ", isRequestUnread=" + this.isRequestUnread + ", sign=" + this.sign + ")";
    }

    public /* synthetic */ FriendsFriendExtendedStatusDto(FriendsFriendStatusStatusDto friendsFriendStatusStatusDto, UserId userId, Boolean bool, String str, int i, zcl zclVar) {
        this(friendsFriendStatusStatusDto, userId, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str);
    }
}
