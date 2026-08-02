package com.vk.sdk.api.widgets.dto;

import com.ironsource.X3;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import com.vk.sdk.api.base.dto.BaseLikesInfoDto;
import com.vk.sdk.api.base.dto.BaseRepostsInfoDto;
import com.vk.sdk.api.users.dto.UsersUserFullDto;
import com.vk.sdk.api.wall.dto.WallCommentAttachmentDto;
import com.vk.sdk.api.wall.dto.WallPostSourceDto;
import java.util.List;
import xsna.epx;
import xsna.jax0;
import xsna.nyh0;
import xsna.odj;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: WidgetsWidgetCommentDto.kt */
/* loaded from: classes5.dex */
public final class WidgetsWidgetCommentDto {

    @pmi0("attachments")
    private final List<WallCommentAttachmentDto> attachments;

    @pmi0("can_delete")
    private final BaseBoolIntDto canDelete;

    @pmi0("comments")
    private final WidgetsCommentRepliesDto comments;

    @pmi0("date")
    private final int date;

    @pmi0("from_id")
    private final int fromId;

    @pmi0("id")
    private final int id;

    @pmi0("is_favorite")
    private final BaseBoolIntDto isFavorite;

    @pmi0("likes")
    private final BaseLikesInfoDto likes;

    @pmi0(X3.i.I0)
    private final WidgetsCommentMediaDto media;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("post_source")
    private final WallPostSourceDto postSource;

    @pmi0("post_type")
    private final String postType;

    @pmi0("reposts")
    private final BaseRepostsInfoDto reposts;

    @pmi0("short_text_rate")
    private final Float shortTextRate;

    @pmi0("text")
    private final String text;

    @pmi0("to_id")
    private final int toId;

    @pmi0("user")
    private final UsersUserFullDto user;

    public WidgetsWidgetCommentDto(int i, int i2, int i3, String str, String str2, int i4, List<WallCommentAttachmentDto> list, UserId userId, BaseBoolIntDto baseBoolIntDto, WidgetsCommentRepliesDto widgetsCommentRepliesDto, BaseLikesInfoDto baseLikesInfoDto, WidgetsCommentMediaDto widgetsCommentMediaDto, WallPostSourceDto wallPostSourceDto, BaseRepostsInfoDto baseRepostsInfoDto, UsersUserFullDto usersUserFullDto, BaseBoolIntDto baseBoolIntDto2, Float f) {
        this.date = i;
        this.fromId = i2;
        this.id = i3;
        this.postType = str;
        this.text = str2;
        this.toId = i4;
        this.attachments = list;
        this.ownerId = userId;
        this.canDelete = baseBoolIntDto;
        this.comments = widgetsCommentRepliesDto;
        this.likes = baseLikesInfoDto;
        this.media = widgetsCommentMediaDto;
        this.postSource = wallPostSourceDto;
        this.reposts = baseRepostsInfoDto;
        this.user = usersUserFullDto;
        this.isFavorite = baseBoolIntDto2;
        this.shortTextRate = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetsWidgetCommentDto)) {
            return false;
        }
        WidgetsWidgetCommentDto widgetsWidgetCommentDto = (WidgetsWidgetCommentDto) obj;
        return this.date == widgetsWidgetCommentDto.date && this.fromId == widgetsWidgetCommentDto.fromId && this.id == widgetsWidgetCommentDto.id && epx.f(this.postType, widgetsWidgetCommentDto.postType) && epx.f(this.text, widgetsWidgetCommentDto.text) && this.toId == widgetsWidgetCommentDto.toId && epx.f(this.attachments, widgetsWidgetCommentDto.attachments) && epx.f(this.ownerId, widgetsWidgetCommentDto.ownerId) && this.canDelete == widgetsWidgetCommentDto.canDelete && epx.f(this.comments, widgetsWidgetCommentDto.comments) && epx.f(this.likes, widgetsWidgetCommentDto.likes) && epx.f(this.media, widgetsWidgetCommentDto.media) && epx.f(this.postSource, widgetsWidgetCommentDto.postSource) && epx.f(this.reposts, widgetsWidgetCommentDto.reposts) && epx.f(this.user, widgetsWidgetCommentDto.user) && this.isFavorite == widgetsWidgetCommentDto.isFavorite && epx.f(this.shortTextRate, widgetsWidgetCommentDto.shortTextRate);
    }

    public final int hashCode() {
        int a = shy.a(this.toId, urd0.a(urd0.a(shy.a(this.id, shy.a(this.fromId, Integer.hashCode(this.date) * 31, 31), 31), 31, this.postType), 31, this.text), 31);
        List<WallCommentAttachmentDto> list = this.attachments;
        int hashCode = (a + (list == null ? 0 : list.hashCode())) * 31;
        UserId userId = this.ownerId;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        BaseBoolIntDto baseBoolIntDto = this.canDelete;
        int hashCode3 = (hashCode2 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        WidgetsCommentRepliesDto widgetsCommentRepliesDto = this.comments;
        int hashCode4 = (hashCode3 + (widgetsCommentRepliesDto == null ? 0 : widgetsCommentRepliesDto.hashCode())) * 31;
        BaseLikesInfoDto baseLikesInfoDto = this.likes;
        int hashCode5 = (hashCode4 + (baseLikesInfoDto == null ? 0 : baseLikesInfoDto.hashCode())) * 31;
        WidgetsCommentMediaDto widgetsCommentMediaDto = this.media;
        int hashCode6 = (hashCode5 + (widgetsCommentMediaDto == null ? 0 : widgetsCommentMediaDto.hashCode())) * 31;
        WallPostSourceDto wallPostSourceDto = this.postSource;
        int hashCode7 = (hashCode6 + (wallPostSourceDto == null ? 0 : wallPostSourceDto.hashCode())) * 31;
        BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
        int hashCode8 = (hashCode7 + (baseRepostsInfoDto == null ? 0 : baseRepostsInfoDto.hashCode())) * 31;
        UsersUserFullDto usersUserFullDto = this.user;
        int hashCode9 = (hashCode8 + (usersUserFullDto == null ? 0 : usersUserFullDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.isFavorite;
        int hashCode10 = (hashCode9 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        Float f = this.shortTextRate;
        return hashCode10 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        int i = this.date;
        int i2 = this.fromId;
        int i3 = this.id;
        String str = this.postType;
        String str2 = this.text;
        int i4 = this.toId;
        List<WallCommentAttachmentDto> list = this.attachments;
        UserId userId = this.ownerId;
        BaseBoolIntDto baseBoolIntDto = this.canDelete;
        WidgetsCommentRepliesDto widgetsCommentRepliesDto = this.comments;
        BaseLikesInfoDto baseLikesInfoDto = this.likes;
        WidgetsCommentMediaDto widgetsCommentMediaDto = this.media;
        WallPostSourceDto wallPostSourceDto = this.postSource;
        BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
        UsersUserFullDto usersUserFullDto = this.user;
        BaseBoolIntDto baseBoolIntDto2 = this.isFavorite;
        Float f = this.shortTextRate;
        StringBuilder a = odj.a(i, i2, "WidgetsWidgetCommentDto(date=", ", fromId=", ", id=");
        jax0.a(i3, ", postType=", str, ", text=", a);
        nyh0.a(i4, str2, ", toId=", ", attachments=", a);
        a.append(list);
        a.append(", ownerId=");
        a.append(userId);
        a.append(", canDelete=");
        a.append(baseBoolIntDto);
        a.append(", comments=");
        a.append(widgetsCommentRepliesDto);
        a.append(", likes=");
        a.append(baseLikesInfoDto);
        a.append(", media=");
        a.append(widgetsCommentMediaDto);
        a.append(", postSource=");
        a.append(wallPostSourceDto);
        a.append(", reposts=");
        a.append(baseRepostsInfoDto);
        a.append(", user=");
        a.append(usersUserFullDto);
        a.append(", isFavorite=");
        a.append(baseBoolIntDto2);
        a.append(", shortTextRate=");
        a.append(f);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ WidgetsWidgetCommentDto(int i, int i2, int i3, String str, String str2, int i4, List list, UserId userId, BaseBoolIntDto baseBoolIntDto, WidgetsCommentRepliesDto widgetsCommentRepliesDto, BaseLikesInfoDto baseLikesInfoDto, WidgetsCommentMediaDto widgetsCommentMediaDto, WallPostSourceDto wallPostSourceDto, BaseRepostsInfoDto baseRepostsInfoDto, UsersUserFullDto usersUserFullDto, BaseBoolIntDto baseBoolIntDto2, Float f, int i5, zcl zclVar) {
        this(i, i2, i3, str, str2, i4, (i5 & 64) != 0 ? null : list, (i5 & 128) != 0 ? null : userId, (i5 & 256) != 0 ? null : baseBoolIntDto, (i5 & 512) != 0 ? null : widgetsCommentRepliesDto, (i5 & 1024) != 0 ? null : baseLikesInfoDto, (i5 & 2048) != 0 ? null : widgetsCommentMediaDto, (i5 & 4096) != 0 ? null : wallPostSourceDto, (i5 & 8192) != 0 ? null : baseRepostsInfoDto, (i5 & 16384) != 0 ? null : usersUserFullDto, (32768 & i5) != 0 ? null : baseBoolIntDto2, (i5 & 65536) != 0 ? null : f);
    }
}
