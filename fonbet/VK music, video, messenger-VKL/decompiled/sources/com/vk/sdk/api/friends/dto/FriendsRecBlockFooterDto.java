package com.vk.sdk.api.friends.dto;

import com.vk.sdk.api.base.dto.BaseLinkButtonActionDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: FriendsRecBlockFooterDto.kt */
/* loaded from: classes5.dex */
public final class FriendsRecBlockFooterDto {

    @pmi0("action")
    private final BaseLinkButtonActionDto action;

    @pmi0("icon")
    private final FriendsRecBlockFooterIconDto icon;

    @pmi0("text")
    private final String text;

    public FriendsRecBlockFooterDto(BaseLinkButtonActionDto baseLinkButtonActionDto, String str, FriendsRecBlockFooterIconDto friendsRecBlockFooterIconDto) {
        this.action = baseLinkButtonActionDto;
        this.text = str;
        this.icon = friendsRecBlockFooterIconDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsRecBlockFooterDto)) {
            return false;
        }
        FriendsRecBlockFooterDto friendsRecBlockFooterDto = (FriendsRecBlockFooterDto) obj;
        return epx.f(this.action, friendsRecBlockFooterDto.action) && epx.f(this.text, friendsRecBlockFooterDto.text) && this.icon == friendsRecBlockFooterDto.icon;
    }

    public final int hashCode() {
        int hashCode = this.action.hashCode() * 31;
        String str = this.text;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        FriendsRecBlockFooterIconDto friendsRecBlockFooterIconDto = this.icon;
        return hashCode2 + (friendsRecBlockFooterIconDto != null ? friendsRecBlockFooterIconDto.hashCode() : 0);
    }

    public final String toString() {
        return "FriendsRecBlockFooterDto(action=" + this.action + ", text=" + this.text + ", icon=" + this.icon + ")";
    }

    public /* synthetic */ FriendsRecBlockFooterDto(BaseLinkButtonActionDto baseLinkButtonActionDto, String str, FriendsRecBlockFooterIconDto friendsRecBlockFooterIconDto, int i, zcl zclVar) {
        this(baseLinkButtonActionDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : friendsRecBlockFooterIconDto);
    }
}
