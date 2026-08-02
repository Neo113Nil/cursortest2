package com.vk.sdk.api.groups.dto;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import xsna.epx;
import xsna.n6j;
import xsna.pmi0;
import xsna.xe9;
import xsna.zcl;

/* compiled from: GroupsLinksItemDto.kt */
/* loaded from: classes5.dex */
public final class GroupsLinksItemDto {

    @pmi0(CampaignEx.JSON_KEY_DESC)
    private final String desc;

    @pmi0("edit_title")
    private final BaseBoolIntDto editTitle;

    @pmi0("id")
    private final Integer id;

    @pmi0("image_processing")
    private final BaseBoolIntDto imageProcessing;

    @pmi0("name")
    private final String name;

    @pmi0("photo_100")
    private final String photo100;

    @pmi0("photo_50")
    private final String photo50;

    @pmi0("url")
    private final String url;

    public GroupsLinksItemDto() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsLinksItemDto)) {
            return false;
        }
        GroupsLinksItemDto groupsLinksItemDto = (GroupsLinksItemDto) obj;
        return epx.f(this.name, groupsLinksItemDto.name) && epx.f(this.desc, groupsLinksItemDto.desc) && this.editTitle == groupsLinksItemDto.editTitle && epx.f(this.id, groupsLinksItemDto.id) && epx.f(this.photo100, groupsLinksItemDto.photo100) && epx.f(this.photo50, groupsLinksItemDto.photo50) && epx.f(this.url, groupsLinksItemDto.url) && this.imageProcessing == groupsLinksItemDto.imageProcessing;
    }

    public final int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.editTitle;
        int hashCode3 = (hashCode2 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        Integer num = this.id;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.photo100;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photo50;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.url;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.imageProcessing;
        return hashCode7 + (baseBoolIntDto2 != null ? baseBoolIntDto2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.name;
        String str2 = this.desc;
        BaseBoolIntDto baseBoolIntDto = this.editTitle;
        Integer num = this.id;
        String str3 = this.photo100;
        String str4 = this.photo50;
        String str5 = this.url;
        BaseBoolIntDto baseBoolIntDto2 = this.imageProcessing;
        StringBuilder a = xe9.a("GroupsLinksItemDto(name=", str, ", desc=", str2, ", editTitle=");
        a.append(baseBoolIntDto);
        a.append(", id=");
        a.append(num);
        a.append(", photo100=");
        n6j.b(a, str3, ", photo50=", str4, ", url=");
        a.append(str5);
        a.append(", imageProcessing=");
        a.append(baseBoolIntDto2);
        a.append(")");
        return a.toString();
    }

    public GroupsLinksItemDto(String str, String str2, BaseBoolIntDto baseBoolIntDto, Integer num, String str3, String str4, String str5, BaseBoolIntDto baseBoolIntDto2) {
        this.name = str;
        this.desc = str2;
        this.editTitle = baseBoolIntDto;
        this.id = num;
        this.photo100 = str3;
        this.photo50 = str4;
        this.url = str5;
        this.imageProcessing = baseBoolIntDto2;
    }

    public /* synthetic */ GroupsLinksItemDto(String str, String str2, BaseBoolIntDto baseBoolIntDto, Integer num, String str3, String str4, String str5, BaseBoolIntDto baseBoolIntDto2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : baseBoolIntDto, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : baseBoolIntDto2);
    }
}
