package com.vk.sdk.api.friends.dto;

import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.i5s;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: FriendsFriendStatusDto.kt */
/* loaded from: classes5.dex */
public final class FriendsFriendStatusDto {

    @pmi0("friend_status")
    private final FriendsFriendStatusStatusDto friendStatus;

    @pmi0("sign")
    private final String sign;

    @pmi0("user_id")
    private final UserId userId;

    public FriendsFriendStatusDto(FriendsFriendStatusStatusDto friendsFriendStatusStatusDto, UserId userId, String str) {
        this.friendStatus = friendsFriendStatusStatusDto;
        this.userId = userId;
        this.sign = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsFriendStatusDto)) {
            return false;
        }
        FriendsFriendStatusDto friendsFriendStatusDto = (FriendsFriendStatusDto) obj;
        return this.friendStatus == friendsFriendStatusDto.friendStatus && epx.f(this.userId, friendsFriendStatusDto.userId) && epx.f(this.sign, friendsFriendStatusDto.sign);
    }

    public final int hashCode() {
        int a = bh10.a(this.friendStatus.hashCode() * 31, 31, this.userId.b);
        String str = this.sign;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        FriendsFriendStatusStatusDto friendsFriendStatusStatusDto = this.friendStatus;
        UserId userId = this.userId;
        String str = this.sign;
        StringBuilder sb = new StringBuilder("FriendsFriendStatusDto(friendStatus=");
        sb.append(friendsFriendStatusStatusDto);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", sign=");
        return i5s.a(sb, str, ")");
    }

    public /* synthetic */ FriendsFriendStatusDto(FriendsFriendStatusStatusDto friendsFriendStatusStatusDto, UserId userId, String str, int i, zcl zclVar) {
        this(friendsFriendStatusStatusDto, userId, (i & 4) != 0 ? null : str);
    }
}
