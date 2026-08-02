package com.vk.sdk.api.groups.dto;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.h5s;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsContactsItemDto.kt */
/* loaded from: classes5.dex */
public final class GroupsContactsItemDto {

    @pmi0(CampaignEx.JSON_KEY_DESC)
    private final String desc;

    @pmi0("email")
    private final String email;

    @pmi0("phone")
    private final String phone;

    @pmi0("user_id")
    private final UserId userId;

    public GroupsContactsItemDto() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsContactsItemDto)) {
            return false;
        }
        GroupsContactsItemDto groupsContactsItemDto = (GroupsContactsItemDto) obj;
        return epx.f(this.userId, groupsContactsItemDto.userId) && epx.f(this.desc, groupsContactsItemDto.desc) && epx.f(this.phone, groupsContactsItemDto.phone) && epx.f(this.email, groupsContactsItemDto.email);
    }

    public final int hashCode() {
        UserId userId = this.userId;
        int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
        String str = this.desc;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.phone;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.email;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        UserId userId = this.userId;
        String str = this.desc;
        String str2 = this.phone;
        String str3 = this.email;
        StringBuilder sb = new StringBuilder("GroupsContactsItemDto(userId=");
        sb.append(userId);
        sb.append(", desc=");
        sb.append(str);
        sb.append(", phone=");
        return h5s.d(sb, str2, ", email=", str3, ")");
    }

    public GroupsContactsItemDto(UserId userId, String str, String str2, String str3) {
        this.userId = userId;
        this.desc = str;
        this.phone = str2;
        this.email = str3;
    }

    public /* synthetic */ GroupsContactsItemDto(UserId userId, String str, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : userId, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
