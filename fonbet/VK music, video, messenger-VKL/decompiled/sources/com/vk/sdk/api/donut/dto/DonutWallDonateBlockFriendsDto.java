package com.vk.sdk.api.donut.dto;

import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.i5s;
import xsna.pmi0;
import xsna.zcl;
import xsna.zn;

/* compiled from: DonutWallDonateBlockFriendsDto.kt */
/* loaded from: classes5.dex */
public final class DonutWallDonateBlockFriendsDto {

    @pmi0("footer_text")
    private final String footerText;

    @pmi0("friends_ids")
    private final List<UserId> friendsIds;

    @pmi0("total_count")
    private final int totalCount;

    public DonutWallDonateBlockFriendsDto(int i, List<UserId> list, String str) {
        this.totalCount = i;
        this.friendsIds = list;
        this.footerText = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutWallDonateBlockFriendsDto)) {
            return false;
        }
        DonutWallDonateBlockFriendsDto donutWallDonateBlockFriendsDto = (DonutWallDonateBlockFriendsDto) obj;
        return this.totalCount == donutWallDonateBlockFriendsDto.totalCount && epx.f(this.friendsIds, donutWallDonateBlockFriendsDto.friendsIds) && epx.f(this.footerText, donutWallDonateBlockFriendsDto.footerText);
    }

    public final int hashCode() {
        int a = fw3.a(Integer.hashCode(this.totalCount) * 31, 31, this.friendsIds);
        String str = this.footerText;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        int i = this.totalCount;
        List<UserId> list = this.friendsIds;
        return i5s.a(zn.c(i, "DonutWallDonateBlockFriendsDto(totalCount=", ", friendsIds=", ", footerText=", list), this.footerText, ")");
    }

    public /* synthetic */ DonutWallDonateBlockFriendsDto(int i, List list, String str, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : str);
    }
}
