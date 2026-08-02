package com.vk.sdk.api.messages.dto;

import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseLinkButtonDto;
import java.util.List;
import xsna.epx;
import xsna.mq;
import xsna.pmi0;
import xsna.tq;
import xsna.zcl;

/* compiled from: MessagesChatPreviewDto.kt */
/* loaded from: classes5.dex */
public final class MessagesChatPreviewDto {

    @pmi0("admin_id")
    private final UserId adminId;

    @pmi0("button")
    private final BaseLinkButtonDto button;

    @pmi0("is_don")
    private final Boolean isDon;

    @pmi0("is_group_channel")
    private final Boolean isGroupChannel;

    @pmi0("is_member")
    private final Boolean isMember;

    @pmi0("is_nft")
    private final Boolean isNft;

    @pmi0("joined")
    private final Boolean joined;

    @pmi0("local_id")
    private final Integer localId;

    @pmi0("members")
    private final List<UserId> members;

    @pmi0("members_count")
    private final Integer membersCount;

    @pmi0("photo")
    private final MessagesChatSettingsPhotoDto photo;

    @pmi0("title")
    private final String title;

    public MessagesChatPreviewDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesChatPreviewDto)) {
            return false;
        }
        MessagesChatPreviewDto messagesChatPreviewDto = (MessagesChatPreviewDto) obj;
        return epx.f(this.adminId, messagesChatPreviewDto.adminId) && epx.f(this.joined, messagesChatPreviewDto.joined) && epx.f(this.localId, messagesChatPreviewDto.localId) && epx.f(this.members, messagesChatPreviewDto.members) && epx.f(this.membersCount, messagesChatPreviewDto.membersCount) && epx.f(this.title, messagesChatPreviewDto.title) && epx.f(this.isMember, messagesChatPreviewDto.isMember) && epx.f(this.photo, messagesChatPreviewDto.photo) && epx.f(this.isDon, messagesChatPreviewDto.isDon) && epx.f(this.isNft, messagesChatPreviewDto.isNft) && epx.f(this.isGroupChannel, messagesChatPreviewDto.isGroupChannel) && epx.f(this.button, messagesChatPreviewDto.button);
    }

    public final int hashCode() {
        UserId userId = this.adminId;
        int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
        Boolean bool = this.joined;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.localId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<UserId> list = this.members;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.membersCount;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.title;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.isMember;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        MessagesChatSettingsPhotoDto messagesChatSettingsPhotoDto = this.photo;
        int hashCode8 = (hashCode7 + (messagesChatSettingsPhotoDto == null ? 0 : messagesChatSettingsPhotoDto.hashCode())) * 31;
        Boolean bool3 = this.isDon;
        int hashCode9 = (hashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isNft;
        int hashCode10 = (hashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isGroupChannel;
        int hashCode11 = (hashCode10 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        BaseLinkButtonDto baseLinkButtonDto = this.button;
        return hashCode11 + (baseLinkButtonDto != null ? baseLinkButtonDto.hashCode() : 0);
    }

    public final String toString() {
        UserId userId = this.adminId;
        Boolean bool = this.joined;
        Integer num = this.localId;
        List<UserId> list = this.members;
        Integer num2 = this.membersCount;
        String str = this.title;
        Boolean bool2 = this.isMember;
        MessagesChatSettingsPhotoDto messagesChatSettingsPhotoDto = this.photo;
        Boolean bool3 = this.isDon;
        Boolean bool4 = this.isNft;
        Boolean bool5 = this.isGroupChannel;
        BaseLinkButtonDto baseLinkButtonDto = this.button;
        StringBuilder sb = new StringBuilder("MessagesChatPreviewDto(adminId=");
        sb.append(userId);
        sb.append(", joined=");
        sb.append(bool);
        sb.append(", localId=");
        sb.append(num);
        sb.append(", members=");
        sb.append(list);
        sb.append(", membersCount=");
        mq.b(num2, ", title=", str, ", isMember=", sb);
        sb.append(bool2);
        sb.append(", photo=");
        sb.append(messagesChatSettingsPhotoDto);
        sb.append(", isDon=");
        tq.i(sb, bool3, ", isNft=", bool4, ", isGroupChannel=");
        sb.append(bool5);
        sb.append(", button=");
        sb.append(baseLinkButtonDto);
        sb.append(")");
        return sb.toString();
    }

    public MessagesChatPreviewDto(UserId userId, Boolean bool, Integer num, List<UserId> list, Integer num2, String str, Boolean bool2, MessagesChatSettingsPhotoDto messagesChatSettingsPhotoDto, Boolean bool3, Boolean bool4, Boolean bool5, BaseLinkButtonDto baseLinkButtonDto) {
        this.adminId = userId;
        this.joined = bool;
        this.localId = num;
        this.members = list;
        this.membersCount = num2;
        this.title = str;
        this.isMember = bool2;
        this.photo = messagesChatSettingsPhotoDto;
        this.isDon = bool3;
        this.isNft = bool4;
        this.isGroupChannel = bool5;
        this.button = baseLinkButtonDto;
    }

    public /* synthetic */ MessagesChatPreviewDto(UserId userId, Boolean bool, Integer num, List list, Integer num2, String str, Boolean bool2, MessagesChatSettingsPhotoDto messagesChatSettingsPhotoDto, Boolean bool3, Boolean bool4, Boolean bool5, BaseLinkButtonDto baseLinkButtonDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : userId, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : bool2, (i & 128) != 0 ? null : messagesChatSettingsPhotoDto, (i & 256) != 0 ? null : bool3, (i & 512) != 0 ? null : bool4, (i & 1024) != 0 ? null : bool5, (i & 2048) != 0 ? null : baseLinkButtonDto);
    }
}
