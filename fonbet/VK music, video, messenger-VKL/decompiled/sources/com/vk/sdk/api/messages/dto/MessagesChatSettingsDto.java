package com.vk.sdk.api.messages.dto;

import com.vk.dto.common.id.UserId;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.epx;
import xsna.l4;
import xsna.pmi0;
import xsna.sq;
import xsna.urd0;
import xsna.vq;
import xsna.zcl;

/* compiled from: MessagesChatSettingsDto.kt */
/* loaded from: classes5.dex */
public final class MessagesChatSettingsDto {

    @pmi0("acl")
    private final MessagesChatSettingsAclDto acl;

    @pmi0("active_ids")
    private final List<UserId> activeIds;

    @pmi0("admin_ids")
    private final List<UserId> adminIds;

    @pmi0("disappearing_chat_link")
    private final String disappearingChatLink;

    @pmi0("friends_count")
    private final Integer friendsCount;

    @pmi0("is_disappearing")
    private final Boolean isDisappearing;

    @pmi0("is_group_channel")
    private final Boolean isGroupChannel;

    @pmi0("is_service")
    private final Boolean isService;

    @pmi0("members_count")
    private final Integer membersCount;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0(SignalingProtocol.KEY_PERMISSIONS)
    private final MessagesChatSettingsPermissionsDto permissions;

    @pmi0("photo")
    private final MessagesChatSettingsPhotoDto photo;

    @pmi0("pinned_message")
    private final MessagesPinnedMessageDto pinnedMessage;

    @pmi0("state")
    private final MessagesChatSettingsStateDto state;

    @pmi0("theme")
    private final String theme;

    @pmi0("title")
    private final String title;

    public MessagesChatSettingsDto(UserId userId, String str, MessagesChatSettingsStateDto messagesChatSettingsStateDto, MessagesChatSettingsAclDto messagesChatSettingsAclDto, Integer num, Integer num2, MessagesPinnedMessageDto messagesPinnedMessageDto, MessagesChatSettingsPhotoDto messagesChatSettingsPhotoDto, List<UserId> list, List<UserId> list2, Boolean bool, MessagesChatSettingsPermissionsDto messagesChatSettingsPermissionsDto, Boolean bool2, String str2, String str3, Boolean bool3) {
        this.ownerId = userId;
        this.title = str;
        this.state = messagesChatSettingsStateDto;
        this.acl = messagesChatSettingsAclDto;
        this.membersCount = num;
        this.friendsCount = num2;
        this.pinnedMessage = messagesPinnedMessageDto;
        this.photo = messagesChatSettingsPhotoDto;
        this.adminIds = list;
        this.activeIds = list2;
        this.isGroupChannel = bool;
        this.permissions = messagesChatSettingsPermissionsDto;
        this.isDisappearing = bool2;
        this.theme = str2;
        this.disappearingChatLink = str3;
        this.isService = bool3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesChatSettingsDto)) {
            return false;
        }
        MessagesChatSettingsDto messagesChatSettingsDto = (MessagesChatSettingsDto) obj;
        return epx.f(this.ownerId, messagesChatSettingsDto.ownerId) && epx.f(this.title, messagesChatSettingsDto.title) && this.state == messagesChatSettingsDto.state && epx.f(this.acl, messagesChatSettingsDto.acl) && epx.f(this.membersCount, messagesChatSettingsDto.membersCount) && epx.f(this.friendsCount, messagesChatSettingsDto.friendsCount) && epx.f(this.pinnedMessage, messagesChatSettingsDto.pinnedMessage) && epx.f(this.photo, messagesChatSettingsDto.photo) && epx.f(this.adminIds, messagesChatSettingsDto.adminIds) && epx.f(this.activeIds, messagesChatSettingsDto.activeIds) && epx.f(this.isGroupChannel, messagesChatSettingsDto.isGroupChannel) && epx.f(this.permissions, messagesChatSettingsDto.permissions) && epx.f(this.isDisappearing, messagesChatSettingsDto.isDisappearing) && epx.f(this.theme, messagesChatSettingsDto.theme) && epx.f(this.disappearingChatLink, messagesChatSettingsDto.disappearingChatLink) && epx.f(this.isService, messagesChatSettingsDto.isService);
    }

    public final int hashCode() {
        int hashCode = (this.acl.hashCode() + ((this.state.hashCode() + urd0.a(Long.hashCode(this.ownerId.b) * 31, 31, this.title)) * 31)) * 31;
        Integer num = this.membersCount;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.friendsCount;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        MessagesPinnedMessageDto messagesPinnedMessageDto = this.pinnedMessage;
        int hashCode4 = (hashCode3 + (messagesPinnedMessageDto == null ? 0 : messagesPinnedMessageDto.hashCode())) * 31;
        MessagesChatSettingsPhotoDto messagesChatSettingsPhotoDto = this.photo;
        int hashCode5 = (hashCode4 + (messagesChatSettingsPhotoDto == null ? 0 : messagesChatSettingsPhotoDto.hashCode())) * 31;
        List<UserId> list = this.adminIds;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<UserId> list2 = this.activeIds;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.isGroupChannel;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        MessagesChatSettingsPermissionsDto messagesChatSettingsPermissionsDto = this.permissions;
        int hashCode9 = (hashCode8 + (messagesChatSettingsPermissionsDto == null ? 0 : messagesChatSettingsPermissionsDto.hashCode())) * 31;
        Boolean bool2 = this.isDisappearing;
        int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.theme;
        int hashCode11 = (hashCode10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.disappearingChatLink;
        int hashCode12 = (hashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool3 = this.isService;
        return hashCode12 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        UserId userId = this.ownerId;
        String str = this.title;
        MessagesChatSettingsStateDto messagesChatSettingsStateDto = this.state;
        MessagesChatSettingsAclDto messagesChatSettingsAclDto = this.acl;
        Integer num = this.membersCount;
        Integer num2 = this.friendsCount;
        MessagesPinnedMessageDto messagesPinnedMessageDto = this.pinnedMessage;
        MessagesChatSettingsPhotoDto messagesChatSettingsPhotoDto = this.photo;
        List<UserId> list = this.adminIds;
        List<UserId> list2 = this.activeIds;
        Boolean bool = this.isGroupChannel;
        MessagesChatSettingsPermissionsDto messagesChatSettingsPermissionsDto = this.permissions;
        Boolean bool2 = this.isDisappearing;
        String str2 = this.theme;
        String str3 = this.disappearingChatLink;
        Boolean bool3 = this.isService;
        StringBuilder sb = new StringBuilder("MessagesChatSettingsDto(ownerId=");
        sb.append(userId);
        sb.append(", title=");
        sb.append(str);
        sb.append(", state=");
        sb.append(messagesChatSettingsStateDto);
        sb.append(", acl=");
        sb.append(messagesChatSettingsAclDto);
        sb.append(", membersCount=");
        sq.b(sb, num, ", friendsCount=", num2, ", pinnedMessage=");
        sb.append(messagesPinnedMessageDto);
        sb.append(", photo=");
        sb.append(messagesChatSettingsPhotoDto);
        sb.append(", adminIds=");
        vq.d(sb, list, ", activeIds=", list2, ", isGroupChannel=");
        sb.append(bool);
        sb.append(", permissions=");
        sb.append(messagesChatSettingsPermissionsDto);
        sb.append(", isDisappearing=");
        l4.i(bool2, ", theme=", str2, ", disappearingChatLink=", sb);
        sb.append(str3);
        sb.append(", isService=");
        sb.append(bool3);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ MessagesChatSettingsDto(UserId userId, String str, MessagesChatSettingsStateDto messagesChatSettingsStateDto, MessagesChatSettingsAclDto messagesChatSettingsAclDto, Integer num, Integer num2, MessagesPinnedMessageDto messagesPinnedMessageDto, MessagesChatSettingsPhotoDto messagesChatSettingsPhotoDto, List list, List list2, Boolean bool, MessagesChatSettingsPermissionsDto messagesChatSettingsPermissionsDto, Boolean bool2, String str2, String str3, Boolean bool3, int i, zcl zclVar) {
        this(userId, str, messagesChatSettingsStateDto, messagesChatSettingsAclDto, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : messagesPinnedMessageDto, (i & 128) != 0 ? null : messagesChatSettingsPhotoDto, (i & 256) != 0 ? null : list, (i & 512) != 0 ? null : list2, (i & 1024) != 0 ? null : bool, (i & 2048) != 0 ? null : messagesChatSettingsPermissionsDto, (i & 4096) != 0 ? null : bool2, (i & 8192) != 0 ? null : str2, (i & 16384) != 0 ? null : str3, (i & 32768) != 0 ? null : bool3);
    }
}
