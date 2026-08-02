package com.vk.sdk.api.friends.dto;

import com.vk.sdk.api.base.dto.BaseLinkButtonActionDto;
import xsna.epx;
import xsna.i5s;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: FriendsEntrypointDto.kt */
/* loaded from: classes5.dex */
public final class FriendsEntrypointDto {

    @pmi0("action")
    private final BaseLinkButtonActionDto action;

    @pmi0("icon")
    private final FriendsEntrypointIconDto icon;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    public FriendsEntrypointDto(FriendsEntrypointIconDto friendsEntrypointIconDto, String str, BaseLinkButtonActionDto baseLinkButtonActionDto, String str2, String str3) {
        this.icon = friendsEntrypointIconDto;
        this.title = str;
        this.action = baseLinkButtonActionDto;
        this.subtitle = str2;
        this.trackCode = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsEntrypointDto)) {
            return false;
        }
        FriendsEntrypointDto friendsEntrypointDto = (FriendsEntrypointDto) obj;
        return epx.f(this.icon, friendsEntrypointDto.icon) && epx.f(this.title, friendsEntrypointDto.title) && epx.f(this.action, friendsEntrypointDto.action) && epx.f(this.subtitle, friendsEntrypointDto.subtitle) && epx.f(this.trackCode, friendsEntrypointDto.trackCode);
    }

    public final int hashCode() {
        int hashCode = (this.action.hashCode() + urd0.a(this.icon.hashCode() * 31, 31, this.title)) * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.trackCode;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        FriendsEntrypointIconDto friendsEntrypointIconDto = this.icon;
        String str = this.title;
        BaseLinkButtonActionDto baseLinkButtonActionDto = this.action;
        String str2 = this.subtitle;
        String str3 = this.trackCode;
        StringBuilder sb = new StringBuilder("FriendsEntrypointDto(icon=");
        sb.append(friendsEntrypointIconDto);
        sb.append(", title=");
        sb.append(str);
        sb.append(", action=");
        sb.append(baseLinkButtonActionDto);
        sb.append(", subtitle=");
        sb.append(str2);
        sb.append(", trackCode=");
        return i5s.a(sb, str3, ")");
    }

    public /* synthetic */ FriendsEntrypointDto(FriendsEntrypointIconDto friendsEntrypointIconDto, String str, BaseLinkButtonActionDto baseLinkButtonActionDto, String str2, String str3, int i, zcl zclVar) {
        this(friendsEntrypointIconDto, str, baseLinkButtonActionDto, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }
}
