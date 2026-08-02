package com.vk.sdk.api.ads.dto;

import com.vk.sdk.api.base.dto.BaseImageDto;
import com.vk.sdk.api.base.dto.BaseLinkButtonActionDto;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.h5s;
import xsna.l4;
import xsna.nyh0;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AdsCatchUpLinkDto.kt */
/* loaded from: classes5.dex */
public final class AdsCatchUpLinkDto {

    @pmi0("action")
    private final BaseLinkButtonActionDto action;

    @pmi0("allow_hide")
    private final Boolean allowHide;

    @pmi0("background_color")
    private final String backgroundColor;

    @pmi0("description")
    private final String description;

    @pmi0("icon")
    private final List<BaseImageDto> icon;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("ttl")
    private final int ttl;

    public AdsCatchUpLinkDto(BaseLinkButtonActionDto baseLinkButtonActionDto, List<BaseImageDto> list, String str, int i, Boolean bool, String str2, String str3, String str4) {
        this.action = baseLinkButtonActionDto;
        this.icon = list;
        this.title = str;
        this.ttl = i;
        this.allowHide = bool;
        this.backgroundColor = str2;
        this.description = str3;
        this.trackCode = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsCatchUpLinkDto)) {
            return false;
        }
        AdsCatchUpLinkDto adsCatchUpLinkDto = (AdsCatchUpLinkDto) obj;
        return epx.f(this.action, adsCatchUpLinkDto.action) && epx.f(this.icon, adsCatchUpLinkDto.icon) && epx.f(this.title, adsCatchUpLinkDto.title) && this.ttl == adsCatchUpLinkDto.ttl && epx.f(this.allowHide, adsCatchUpLinkDto.allowHide) && epx.f(this.backgroundColor, adsCatchUpLinkDto.backgroundColor) && epx.f(this.description, adsCatchUpLinkDto.description) && epx.f(this.trackCode, adsCatchUpLinkDto.trackCode);
    }

    public final int hashCode() {
        int a = shy.a(this.ttl, urd0.a(fw3.a(this.action.hashCode() * 31, 31, this.icon), 31, this.title), 31);
        Boolean bool = this.allowHide;
        int hashCode = (a + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.trackCode;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        BaseLinkButtonActionDto baseLinkButtonActionDto = this.action;
        List<BaseImageDto> list = this.icon;
        String str = this.title;
        int i = this.ttl;
        Boolean bool = this.allowHide;
        String str2 = this.backgroundColor;
        String str3 = this.description;
        String str4 = this.trackCode;
        StringBuilder sb = new StringBuilder("AdsCatchUpLinkDto(action=");
        sb.append(baseLinkButtonActionDto);
        sb.append(", icon=");
        sb.append(list);
        sb.append(", title=");
        nyh0.a(i, str, ", ttl=", ", allowHide=", sb);
        l4.i(bool, ", backgroundColor=", str2, ", description=", sb);
        return h5s.d(sb, str3, ", trackCode=", str4, ")");
    }

    public /* synthetic */ AdsCatchUpLinkDto(BaseLinkButtonActionDto baseLinkButtonActionDto, List list, String str, int i, Boolean bool, String str2, String str3, String str4, int i2, zcl zclVar) {
        this(baseLinkButtonActionDto, list, str, i, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : str4);
    }
}
