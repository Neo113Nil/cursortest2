package com.vk.sdk.api.messages.dto;

import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.users.dto.UsersUserFullDto;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.vp;
import xsna.zcl;
import xsna.zn;

/* compiled from: MessagesGetIntentUsersResponseDto.kt */
/* loaded from: classes5.dex */
public final class MessagesGetIntentUsersResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<UserId> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    public MessagesGetIntentUsersResponseDto(int i, List<UserId> list, List<UsersUserFullDto> list2) {
        this.count = i;
        this.items = list;
        this.profiles = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetIntentUsersResponseDto)) {
            return false;
        }
        MessagesGetIntentUsersResponseDto messagesGetIntentUsersResponseDto = (MessagesGetIntentUsersResponseDto) obj;
        return this.count == messagesGetIntentUsersResponseDto.count && epx.f(this.items, messagesGetIntentUsersResponseDto.items) && epx.f(this.profiles, messagesGetIntentUsersResponseDto.profiles);
    }

    public final int hashCode() {
        int a = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        List<UsersUserFullDto> list = this.profiles;
        return a + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        int i = this.count;
        List<UserId> list = this.items;
        return vp.b(")", zn.c(i, "MessagesGetIntentUsersResponseDto(count=", ", items=", ", profiles=", list), this.profiles);
    }

    public /* synthetic */ MessagesGetIntentUsersResponseDto(int i, List list, List list2, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2);
    }
}
