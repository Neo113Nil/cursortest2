package com.vk.sdk.api.friends.dto;

import xsna.pmi0;
import xsna.tgw;

/* compiled from: FriendsAddListResponseDto.kt */
/* loaded from: classes5.dex */
public final class FriendsAddListResponseDto {

    @pmi0("list_id")
    private final int listId;

    public FriendsAddListResponseDto(int i) {
        this.listId = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FriendsAddListResponseDto) && this.listId == ((FriendsAddListResponseDto) obj).listId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.listId);
    }

    public final String toString() {
        return tgw.b(this.listId, "FriendsAddListResponseDto(listId=", ")");
    }
}
