package com.vk.sdk.api.photos.dto;

import com.vk.sdk.api.groups.dto.GroupsGroupFullDto;
import com.vk.sdk.api.users.dto.UsersUserFullDto;
import com.vk.sdk.api.wall.dto.WallWallCommentDto;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.oq;
import xsna.pmi0;
import xsna.vq;
import xsna.zcl;
import xsna.zn;

/* compiled from: PhotosGetCommentsExtendedResponseDto.kt */
/* loaded from: classes5.dex */
public final class PhotosGetCommentsExtendedResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<WallWallCommentDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("real_offset")
    private final Integer realOffset;

    public PhotosGetCommentsExtendedResponseDto(int i, List<WallWallCommentDto> list, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, Integer num) {
        this.count = i;
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
        this.realOffset = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosGetCommentsExtendedResponseDto)) {
            return false;
        }
        PhotosGetCommentsExtendedResponseDto photosGetCommentsExtendedResponseDto = (PhotosGetCommentsExtendedResponseDto) obj;
        return this.count == photosGetCommentsExtendedResponseDto.count && epx.f(this.items, photosGetCommentsExtendedResponseDto.items) && epx.f(this.profiles, photosGetCommentsExtendedResponseDto.profiles) && epx.f(this.groups, photosGetCommentsExtendedResponseDto.groups) && epx.f(this.realOffset, photosGetCommentsExtendedResponseDto.realOffset);
    }

    public final int hashCode() {
        int a = fw3.a(fw3.a(fw3.a(Integer.hashCode(this.count) * 31, 31, this.items), 31, this.profiles), 31, this.groups);
        Integer num = this.realOffset;
        return a + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        int i = this.count;
        List<WallWallCommentDto> list = this.items;
        List<UsersUserFullDto> list2 = this.profiles;
        List<GroupsGroupFullDto> list3 = this.groups;
        Integer num = this.realOffset;
        StringBuilder c = zn.c(i, "PhotosGetCommentsExtendedResponseDto(count=", ", items=", ", profiles=", list);
        vq.d(c, list2, ", groups=", list3, ", realOffset=");
        return oq.b(c, num, ")");
    }

    public /* synthetic */ PhotosGetCommentsExtendedResponseDto(int i, List list, List list2, List list3, Integer num, int i2, zcl zclVar) {
        this(i, list, list2, list3, (i2 & 16) != 0 ? null : num);
    }
}
