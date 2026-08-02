package com.vk.sdk.api.stories.dto;

import com.vk.sdk.api.groups.dto.GroupsGroupFullDto;
import com.vk.sdk.api.users.dto.UsersUserFullDto;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.i5s;
import xsna.l4;
import xsna.pmi0;
import xsna.vq;
import xsna.zcl;
import xsna.zn;

/* compiled from: StoriesGetV5113ResponseDto.kt */
/* loaded from: classes5.dex */
public final class StoriesGetV5113ResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<StoriesFeedItemDto> items;

    @pmi0("need_upload_screen")
    private final Boolean needUploadScreen;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("track_code")
    private final String trackCode;

    public StoriesGetV5113ResponseDto(int i, List<StoriesFeedItemDto> list, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, Boolean bool, String str, String str2) {
        this.count = i;
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
        this.needUploadScreen = bool;
        this.trackCode = str;
        this.nextFrom = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesGetV5113ResponseDto)) {
            return false;
        }
        StoriesGetV5113ResponseDto storiesGetV5113ResponseDto = (StoriesGetV5113ResponseDto) obj;
        return this.count == storiesGetV5113ResponseDto.count && epx.f(this.items, storiesGetV5113ResponseDto.items) && epx.f(this.profiles, storiesGetV5113ResponseDto.profiles) && epx.f(this.groups, storiesGetV5113ResponseDto.groups) && epx.f(this.needUploadScreen, storiesGetV5113ResponseDto.needUploadScreen) && epx.f(this.trackCode, storiesGetV5113ResponseDto.trackCode) && epx.f(this.nextFrom, storiesGetV5113ResponseDto.nextFrom);
    }

    public final int hashCode() {
        int a = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        List<UsersUserFullDto> list = this.profiles;
        int hashCode = (a + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.needUploadScreen;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.trackCode;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nextFrom;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        int i = this.count;
        List<StoriesFeedItemDto> list = this.items;
        List<UsersUserFullDto> list2 = this.profiles;
        List<GroupsGroupFullDto> list3 = this.groups;
        Boolean bool = this.needUploadScreen;
        String str = this.trackCode;
        String str2 = this.nextFrom;
        StringBuilder c = zn.c(i, "StoriesGetV5113ResponseDto(count=", ", items=", ", profiles=", list);
        vq.d(c, list2, ", groups=", list3, ", needUploadScreen=");
        l4.i(bool, ", trackCode=", str, ", nextFrom=", c);
        return i5s.a(c, str2, ")");
    }

    public /* synthetic */ StoriesGetV5113ResponseDto(int i, List list, List list2, List list3, Boolean bool, String str, String str2, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : list3, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? null : str, (i2 & 64) != 0 ? null : str2);
    }
}
