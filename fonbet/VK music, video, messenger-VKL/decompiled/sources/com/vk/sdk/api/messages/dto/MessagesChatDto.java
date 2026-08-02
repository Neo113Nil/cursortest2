package com.vk.sdk.api.messages.dto;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.dto.common.id.UserId;
import com.vk.movika.sdk.base.model.history.b;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.n6j;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MessagesChatDto.kt */
/* loaded from: classes5.dex */
public final class MessagesChatDto {

    @pmi0("admin_id")
    private final UserId adminId;

    @pmi0("id")
    private final int id;

    @pmi0("is_default_photo")
    private final Boolean isDefaultPhoto;

    @pmi0("is_group_channel")
    private final Boolean isGroupChannel;

    @pmi0("kicked")
    private final BaseBoolIntDto kicked;

    @pmi0(TtmlNode.LEFT)
    private final BaseBoolIntDto left;

    @pmi0("members_count")
    private final int membersCount;

    @pmi0("photo_100")
    private final String photo100;

    @pmi0("photo_200")
    private final String photo200;

    @pmi0("photo_50")
    private final String photo50;

    @pmi0("push_settings")
    private final MessagesChatPushSettingsDto pushSettings;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final String type;

    @pmi0("users")
    private final List<UserId> users;

    public MessagesChatDto(UserId userId, int i, String str, List<UserId> list, int i2, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, String str2, String str3, String str4, MessagesChatPushSettingsDto messagesChatPushSettingsDto, String str5, Boolean bool, Boolean bool2) {
        this.adminId = userId;
        this.id = i;
        this.type = str;
        this.users = list;
        this.membersCount = i2;
        this.kicked = baseBoolIntDto;
        this.left = baseBoolIntDto2;
        this.photo100 = str2;
        this.photo200 = str3;
        this.photo50 = str4;
        this.pushSettings = messagesChatPushSettingsDto;
        this.title = str5;
        this.isDefaultPhoto = bool;
        this.isGroupChannel = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesChatDto)) {
            return false;
        }
        MessagesChatDto messagesChatDto = (MessagesChatDto) obj;
        return epx.f(this.adminId, messagesChatDto.adminId) && this.id == messagesChatDto.id && epx.f(this.type, messagesChatDto.type) && epx.f(this.users, messagesChatDto.users) && this.membersCount == messagesChatDto.membersCount && this.kicked == messagesChatDto.kicked && this.left == messagesChatDto.left && epx.f(this.photo100, messagesChatDto.photo100) && epx.f(this.photo200, messagesChatDto.photo200) && epx.f(this.photo50, messagesChatDto.photo50) && epx.f(this.pushSettings, messagesChatDto.pushSettings) && epx.f(this.title, messagesChatDto.title) && epx.f(this.isDefaultPhoto, messagesChatDto.isDefaultPhoto) && epx.f(this.isGroupChannel, messagesChatDto.isGroupChannel);
    }

    public final int hashCode() {
        int a = shy.a(this.membersCount, fw3.a(urd0.a(shy.a(this.id, Long.hashCode(this.adminId.b) * 31, 31), 31, this.type), 31, this.users), 31);
        BaseBoolIntDto baseBoolIntDto = this.kicked;
        int hashCode = (a + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.left;
        int hashCode2 = (hashCode + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        String str = this.photo100;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photo200;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo50;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        MessagesChatPushSettingsDto messagesChatPushSettingsDto = this.pushSettings;
        int hashCode6 = (hashCode5 + (messagesChatPushSettingsDto == null ? 0 : messagesChatPushSettingsDto.hashCode())) * 31;
        String str4 = this.title;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isDefaultPhoto;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isGroupChannel;
        return hashCode8 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        UserId userId = this.adminId;
        int i = this.id;
        String str = this.type;
        List<UserId> list = this.users;
        int i2 = this.membersCount;
        BaseBoolIntDto baseBoolIntDto = this.kicked;
        BaseBoolIntDto baseBoolIntDto2 = this.left;
        String str2 = this.photo100;
        String str3 = this.photo200;
        String str4 = this.photo50;
        MessagesChatPushSettingsDto messagesChatPushSettingsDto = this.pushSettings;
        String str5 = this.title;
        Boolean bool = this.isDefaultPhoto;
        Boolean bool2 = this.isGroupChannel;
        StringBuilder sb = new StringBuilder("MessagesChatDto(adminId=");
        sb.append(userId);
        sb.append(", id=");
        sb.append(i);
        sb.append(", type=");
        b.c(str, ", users=", ", membersCount=", sb, list);
        sb.append(i2);
        sb.append(", kicked=");
        sb.append(baseBoolIntDto);
        sb.append(", left=");
        sb.append(baseBoolIntDto2);
        sb.append(", photo100=");
        sb.append(str2);
        sb.append(", photo200=");
        n6j.b(sb, str3, ", photo50=", str4, ", pushSettings=");
        sb.append(messagesChatPushSettingsDto);
        sb.append(", title=");
        sb.append(str5);
        sb.append(", isDefaultPhoto=");
        sb.append(bool);
        sb.append(", isGroupChannel=");
        sb.append(bool2);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ MessagesChatDto(UserId userId, int i, String str, List list, int i2, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, String str2, String str3, String str4, MessagesChatPushSettingsDto messagesChatPushSettingsDto, String str5, Boolean bool, Boolean bool2, int i3, zcl zclVar) {
        this(userId, i, str, list, i2, (i3 & 32) != 0 ? null : baseBoolIntDto, (i3 & 64) != 0 ? null : baseBoolIntDto2, (i3 & 128) != 0 ? null : str2, (i3 & 256) != 0 ? null : str3, (i3 & 512) != 0 ? null : str4, (i3 & 1024) != 0 ? null : messagesChatPushSettingsDto, (i3 & 2048) != 0 ? null : str5, (i3 & 4096) != 0 ? null : bool, (i3 & 8192) != 0 ? null : bool2);
    }
}
