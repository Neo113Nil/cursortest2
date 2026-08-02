package com.vk.sdk.api.friends.dto;

import xsna.epx;
import xsna.i5s;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: FriendsRecBlockButtonDto.kt */
/* loaded from: classes5.dex */
public final class FriendsRecBlockButtonDto {

    @pmi0("action")
    private final FriendsRecBlockButtonActionDto action;

    @pmi0("icon")
    private final String icon;

    @pmi0("type")
    private final String type;

    public FriendsRecBlockButtonDto() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsRecBlockButtonDto)) {
            return false;
        }
        FriendsRecBlockButtonDto friendsRecBlockButtonDto = (FriendsRecBlockButtonDto) obj;
        return epx.f(this.action, friendsRecBlockButtonDto.action) && epx.f(this.icon, friendsRecBlockButtonDto.icon) && epx.f(this.type, friendsRecBlockButtonDto.type);
    }

    public final int hashCode() {
        FriendsRecBlockButtonActionDto friendsRecBlockButtonActionDto = this.action;
        int hashCode = (friendsRecBlockButtonActionDto == null ? 0 : friendsRecBlockButtonActionDto.hashCode()) * 31;
        String str = this.icon;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        FriendsRecBlockButtonActionDto friendsRecBlockButtonActionDto = this.action;
        String str = this.icon;
        String str2 = this.type;
        StringBuilder sb = new StringBuilder("FriendsRecBlockButtonDto(action=");
        sb.append(friendsRecBlockButtonActionDto);
        sb.append(", icon=");
        sb.append(str);
        sb.append(", type=");
        return i5s.a(sb, str2, ")");
    }

    public FriendsRecBlockButtonDto(FriendsRecBlockButtonActionDto friendsRecBlockButtonActionDto, String str, String str2) {
        this.action = friendsRecBlockButtonActionDto;
        this.icon = str;
        this.type = str2;
    }

    public /* synthetic */ FriendsRecBlockButtonDto(FriendsRecBlockButtonActionDto friendsRecBlockButtonActionDto, String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : friendsRecBlockButtonActionDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
