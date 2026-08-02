package com.vk.sdk.api.messages.dto;

import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.vp;

/* compiled from: MessagesAddChatUsersResponseDto.kt */
/* loaded from: classes5.dex */
public final class MessagesAddChatUsersResponseDto {

    @pmi0("failed_peer_ids")
    private final List<UserId> failedPeerIds;

    @pmi0("failed_phone_numbers")
    private final List<String> failedPhoneNumbers;

    @pmi0("invitees")
    private final List<UserId> invitees;

    public MessagesAddChatUsersResponseDto(List<UserId> list, List<String> list2, List<UserId> list3) {
        this.failedPeerIds = list;
        this.failedPhoneNumbers = list2;
        this.invitees = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesAddChatUsersResponseDto)) {
            return false;
        }
        MessagesAddChatUsersResponseDto messagesAddChatUsersResponseDto = (MessagesAddChatUsersResponseDto) obj;
        return epx.f(this.failedPeerIds, messagesAddChatUsersResponseDto.failedPeerIds) && epx.f(this.failedPhoneNumbers, messagesAddChatUsersResponseDto.failedPhoneNumbers) && epx.f(this.invitees, messagesAddChatUsersResponseDto.invitees);
    }

    public final int hashCode() {
        return this.invitees.hashCode() + fw3.a(this.failedPeerIds.hashCode() * 31, 31, this.failedPhoneNumbers);
    }

    public final String toString() {
        List<UserId> list = this.failedPeerIds;
        List<String> list2 = this.failedPhoneNumbers;
        List<UserId> list3 = this.invitees;
        StringBuilder sb = new StringBuilder("MessagesAddChatUsersResponseDto(failedPeerIds=");
        sb.append(list);
        sb.append(", failedPhoneNumbers=");
        sb.append(list2);
        sb.append(", invitees=");
        return vp.b(")", sb, list3);
    }
}
