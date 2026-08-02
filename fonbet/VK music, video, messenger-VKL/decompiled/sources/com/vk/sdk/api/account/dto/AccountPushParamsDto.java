package com.vk.sdk.api.account.dto;

import androidx.core.app.NotificationCompat;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.vp;
import xsna.vq;
import xsna.zcl;

/* compiled from: AccountPushParamsDto.kt */
/* loaded from: classes5.dex */
public final class AccountPushParamsDto {

    @pmi0("app_request")
    private final List<AccountPushParamsOnoffDto> appRequest;

    @pmi0("birthday")
    private final List<AccountPushParamsOnoffDto> birthday;

    @pmi0("chat")
    private final List<AccountPushParamsModeDto> chat;

    @pmi0("comment")
    private final List<AccountPushParamsSettingsDto> comment;

    @pmi0("event_soon")
    private final List<AccountPushParamsOnoffDto> eventSoon;

    @pmi0("friend")
    private final List<AccountPushParamsOnoffDto> friend;

    @pmi0("friend_accepted")
    private final List<AccountPushParamsOnoffDto> friendAccepted;

    @pmi0("friend_found")
    private final List<AccountPushParamsOnoffDto> friendFound;

    @pmi0("group_accepted")
    private final List<AccountPushParamsOnoffDto> groupAccepted;

    @pmi0("group_invite")
    private final List<AccountPushParamsOnoffDto> groupInvite;

    @pmi0("like")
    private final List<AccountPushParamsSettingsDto> like;

    @pmi0("mention")
    private final List<AccountPushParamsSettingsDto> mention;

    @pmi0(NotificationCompat.CATEGORY_MESSAGE)
    private final List<AccountPushParamsModeDto> msg;

    @pmi0("new_post")
    private final List<AccountPushParamsOnoffDto> newPost;

    @pmi0("reply")
    private final List<AccountPushParamsOnoffDto> reply;

    @pmi0("repost")
    private final List<AccountPushParamsSettingsDto> repost;

    @pmi0("sdk_open")
    private final List<AccountPushParamsOnoffDto> sdkOpen;

    @pmi0("wall_post")
    private final List<AccountPushParamsOnoffDto> wallPost;

    @pmi0("wall_publish")
    private final List<AccountPushParamsOnoffDto> wallPublish;

    public AccountPushParamsDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountPushParamsDto)) {
            return false;
        }
        AccountPushParamsDto accountPushParamsDto = (AccountPushParamsDto) obj;
        return epx.f(this.msg, accountPushParamsDto.msg) && epx.f(this.chat, accountPushParamsDto.chat) && epx.f(this.like, accountPushParamsDto.like) && epx.f(this.repost, accountPushParamsDto.repost) && epx.f(this.comment, accountPushParamsDto.comment) && epx.f(this.mention, accountPushParamsDto.mention) && epx.f(this.reply, accountPushParamsDto.reply) && epx.f(this.newPost, accountPushParamsDto.newPost) && epx.f(this.wallPost, accountPushParamsDto.wallPost) && epx.f(this.wallPublish, accountPushParamsDto.wallPublish) && epx.f(this.friend, accountPushParamsDto.friend) && epx.f(this.friendFound, accountPushParamsDto.friendFound) && epx.f(this.friendAccepted, accountPushParamsDto.friendAccepted) && epx.f(this.groupInvite, accountPushParamsDto.groupInvite) && epx.f(this.groupAccepted, accountPushParamsDto.groupAccepted) && epx.f(this.birthday, accountPushParamsDto.birthday) && epx.f(this.eventSoon, accountPushParamsDto.eventSoon) && epx.f(this.appRequest, accountPushParamsDto.appRequest) && epx.f(this.sdkOpen, accountPushParamsDto.sdkOpen);
    }

    public final int hashCode() {
        List<AccountPushParamsModeDto> list = this.msg;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<AccountPushParamsModeDto> list2 = this.chat;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<AccountPushParamsSettingsDto> list3 = this.like;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<AccountPushParamsSettingsDto> list4 = this.repost;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<AccountPushParamsSettingsDto> list5 = this.comment;
        int hashCode5 = (hashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<AccountPushParamsSettingsDto> list6 = this.mention;
        int hashCode6 = (hashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<AccountPushParamsOnoffDto> list7 = this.reply;
        int hashCode7 = (hashCode6 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<AccountPushParamsOnoffDto> list8 = this.newPost;
        int hashCode8 = (hashCode7 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<AccountPushParamsOnoffDto> list9 = this.wallPost;
        int hashCode9 = (hashCode8 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<AccountPushParamsOnoffDto> list10 = this.wallPublish;
        int hashCode10 = (hashCode9 + (list10 == null ? 0 : list10.hashCode())) * 31;
        List<AccountPushParamsOnoffDto> list11 = this.friend;
        int hashCode11 = (hashCode10 + (list11 == null ? 0 : list11.hashCode())) * 31;
        List<AccountPushParamsOnoffDto> list12 = this.friendFound;
        int hashCode12 = (hashCode11 + (list12 == null ? 0 : list12.hashCode())) * 31;
        List<AccountPushParamsOnoffDto> list13 = this.friendAccepted;
        int hashCode13 = (hashCode12 + (list13 == null ? 0 : list13.hashCode())) * 31;
        List<AccountPushParamsOnoffDto> list14 = this.groupInvite;
        int hashCode14 = (hashCode13 + (list14 == null ? 0 : list14.hashCode())) * 31;
        List<AccountPushParamsOnoffDto> list15 = this.groupAccepted;
        int hashCode15 = (hashCode14 + (list15 == null ? 0 : list15.hashCode())) * 31;
        List<AccountPushParamsOnoffDto> list16 = this.birthday;
        int hashCode16 = (hashCode15 + (list16 == null ? 0 : list16.hashCode())) * 31;
        List<AccountPushParamsOnoffDto> list17 = this.eventSoon;
        int hashCode17 = (hashCode16 + (list17 == null ? 0 : list17.hashCode())) * 31;
        List<AccountPushParamsOnoffDto> list18 = this.appRequest;
        int hashCode18 = (hashCode17 + (list18 == null ? 0 : list18.hashCode())) * 31;
        List<AccountPushParamsOnoffDto> list19 = this.sdkOpen;
        return hashCode18 + (list19 != null ? list19.hashCode() : 0);
    }

    public final String toString() {
        List<AccountPushParamsModeDto> list = this.msg;
        List<AccountPushParamsModeDto> list2 = this.chat;
        List<AccountPushParamsSettingsDto> list3 = this.like;
        List<AccountPushParamsSettingsDto> list4 = this.repost;
        List<AccountPushParamsSettingsDto> list5 = this.comment;
        List<AccountPushParamsSettingsDto> list6 = this.mention;
        List<AccountPushParamsOnoffDto> list7 = this.reply;
        List<AccountPushParamsOnoffDto> list8 = this.newPost;
        List<AccountPushParamsOnoffDto> list9 = this.wallPost;
        List<AccountPushParamsOnoffDto> list10 = this.wallPublish;
        List<AccountPushParamsOnoffDto> list11 = this.friend;
        List<AccountPushParamsOnoffDto> list12 = this.friendFound;
        List<AccountPushParamsOnoffDto> list13 = this.friendAccepted;
        List<AccountPushParamsOnoffDto> list14 = this.groupInvite;
        List<AccountPushParamsOnoffDto> list15 = this.groupAccepted;
        List<AccountPushParamsOnoffDto> list16 = this.birthday;
        List<AccountPushParamsOnoffDto> list17 = this.eventSoon;
        List<AccountPushParamsOnoffDto> list18 = this.appRequest;
        List<AccountPushParamsOnoffDto> list19 = this.sdkOpen;
        StringBuilder sb = new StringBuilder("AccountPushParamsDto(msg=");
        sb.append(list);
        sb.append(", chat=");
        sb.append(list2);
        sb.append(", like=");
        vq.d(sb, list3, ", repost=", list4, ", comment=");
        vq.d(sb, list5, ", mention=", list6, ", reply=");
        vq.d(sb, list7, ", newPost=", list8, ", wallPost=");
        vq.d(sb, list9, ", wallPublish=", list10, ", friend=");
        vq.d(sb, list11, ", friendFound=", list12, ", friendAccepted=");
        vq.d(sb, list13, ", groupInvite=", list14, ", groupAccepted=");
        vq.d(sb, list15, ", birthday=", list16, ", eventSoon=");
        vq.d(sb, list17, ", appRequest=", list18, ", sdkOpen=");
        return vp.b(")", sb, list19);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccountPushParamsDto(List<? extends AccountPushParamsModeDto> list, List<? extends AccountPushParamsModeDto> list2, List<? extends AccountPushParamsSettingsDto> list3, List<? extends AccountPushParamsSettingsDto> list4, List<? extends AccountPushParamsSettingsDto> list5, List<? extends AccountPushParamsSettingsDto> list6, List<? extends AccountPushParamsOnoffDto> list7, List<? extends AccountPushParamsOnoffDto> list8, List<? extends AccountPushParamsOnoffDto> list9, List<? extends AccountPushParamsOnoffDto> list10, List<? extends AccountPushParamsOnoffDto> list11, List<? extends AccountPushParamsOnoffDto> list12, List<? extends AccountPushParamsOnoffDto> list13, List<? extends AccountPushParamsOnoffDto> list14, List<? extends AccountPushParamsOnoffDto> list15, List<? extends AccountPushParamsOnoffDto> list16, List<? extends AccountPushParamsOnoffDto> list17, List<? extends AccountPushParamsOnoffDto> list18, List<? extends AccountPushParamsOnoffDto> list19) {
        this.msg = list;
        this.chat = list2;
        this.like = list3;
        this.repost = list4;
        this.comment = list5;
        this.mention = list6;
        this.reply = list7;
        this.newPost = list8;
        this.wallPost = list9;
        this.wallPublish = list10;
        this.friend = list11;
        this.friendFound = list12;
        this.friendAccepted = list13;
        this.groupInvite = list14;
        this.groupAccepted = list15;
        this.birthday = list16;
        this.eventSoon = list17;
        this.appRequest = list18;
        this.sdkOpen = list19;
    }

    public /* synthetic */ AccountPushParamsDto(List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4, (i & 16) != 0 ? null : list5, (i & 32) != 0 ? null : list6, (i & 64) != 0 ? null : list7, (i & 128) != 0 ? null : list8, (i & 256) != 0 ? null : list9, (i & 512) != 0 ? null : list10, (i & 1024) != 0 ? null : list11, (i & 2048) != 0 ? null : list12, (i & 4096) != 0 ? null : list13, (i & 8192) != 0 ? null : list14, (i & 16384) != 0 ? null : list15, (i & 32768) != 0 ? null : list16, (i & 65536) != 0 ? null : list17, (i & 131072) != 0 ? null : list18, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : list19);
    }
}
