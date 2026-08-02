package com.vk.sdk.api.stories.dto;

import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.users.dto.UsersUserFullDto;
import xsna.bh10;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StoriesViewersItemDto.kt */
/* loaded from: classes5.dex */
public final class StoriesViewersItemDto {

    @pmi0("is_liked")
    private final boolean isLiked;

    @pmi0("user")
    private final UsersUserFullDto user;

    @pmi0("user_id")
    private final UserId userId;

    public StoriesViewersItemDto(boolean z, UserId userId, UsersUserFullDto usersUserFullDto) {
        this.isLiked = z;
        this.userId = userId;
        this.user = usersUserFullDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesViewersItemDto)) {
            return false;
        }
        StoriesViewersItemDto storiesViewersItemDto = (StoriesViewersItemDto) obj;
        return this.isLiked == storiesViewersItemDto.isLiked && epx.f(this.userId, storiesViewersItemDto.userId) && epx.f(this.user, storiesViewersItemDto.user);
    }

    public final int hashCode() {
        int a = bh10.a(Boolean.hashCode(this.isLiked) * 31, 31, this.userId.b);
        UsersUserFullDto usersUserFullDto = this.user;
        return a + (usersUserFullDto == null ? 0 : usersUserFullDto.hashCode());
    }

    public final String toString() {
        return "StoriesViewersItemDto(isLiked=" + this.isLiked + ", userId=" + this.userId + ", user=" + this.user + ")";
    }

    public /* synthetic */ StoriesViewersItemDto(boolean z, UserId userId, UsersUserFullDto usersUserFullDto, int i, zcl zclVar) {
        this(z, userId, (i & 4) != 0 ? null : usersUserFullDto);
    }
}
