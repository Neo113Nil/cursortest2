package com.vk.sdk.api.friends.dto;

import xsna.epx;
import xsna.gq;
import xsna.pmi0;

/* compiled from: FriendsFriendsListDto.kt */
/* loaded from: classes5.dex */
public final class FriendsFriendsListDto {

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    public FriendsFriendsListDto(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsFriendsListDto)) {
            return false;
        }
        FriendsFriendsListDto friendsFriendsListDto = (FriendsFriendsListDto) obj;
        return this.id == friendsFriendsListDto.id && epx.f(this.name, friendsFriendsListDto.name);
    }

    public final int hashCode() {
        return this.name.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        return gq.b(this.id, "FriendsFriendsListDto(id=", ", name=", this.name, ")");
    }
}
