package com.vk.sdk.api.wall.dto;

import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import com.vk.sdk.api.base.dto.BaseLikesInfoDto;
import com.vk.sdk.api.comment.dto.CommentThreadDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import xsna.bh10;
import xsna.epx;
import xsna.jax0;
import xsna.oq;
import xsna.pmi0;
import xsna.shy;
import xsna.sq;
import xsna.urd0;
import xsna.zcl;

/* compiled from: WallWallCommentDto.kt */
/* loaded from: classes5.dex */
public final class WallWallCommentDto {

    @pmi0("attachments")
    private final List<WallWallpostAttachmentDto> attachments;

    @pmi0("can_edit")
    private final BaseBoolIntDto canEdit;

    @pmi0("date")
    private final int date;

    @pmi0("deleted")
    private final Boolean deleted;

    @pmi0("donut")
    private final WallWallCommentDonutDto donut;

    @pmi0("from_id")
    private final UserId fromId;

    @pmi0("id")
    private final int id;

    @pmi0("likes")
    private final BaseLikesInfoDto likes;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("parents_stack")
    private final List<Integer> parentsStack;

    @pmi0("photo_id")
    private final Integer photoId;

    @pmi0("pid")
    private final Integer pid;

    @pmi0("post_id")
    private final Integer postId;

    @pmi0("real_offset")
    private final Integer realOffset;

    @pmi0("reply_to_comment")
    private final Integer replyToComment;

    @pmi0("reply_to_user")
    private final UserId replyToUser;

    @pmi0("text")
    private final String text;

    @pmi0("thread")
    private final CommentThreadDto thread;

    @pmi0("video_id")
    private final Integer videoId;

    public WallWallCommentDto(int i, UserId userId, int i2, String str, BaseBoolIntDto baseBoolIntDto, Integer num, UserId userId2, List<Integer> list, Integer num2, Integer num3, List<WallWallpostAttachmentDto> list2, WallWallCommentDonutDto wallWallCommentDonutDto, BaseLikesInfoDto baseLikesInfoDto, Integer num4, UserId userId3, Integer num5, CommentThreadDto commentThreadDto, Boolean bool, Integer num6) {
        this.id = i;
        this.fromId = userId;
        this.date = i2;
        this.text = str;
        this.canEdit = baseBoolIntDto;
        this.postId = num;
        this.ownerId = userId2;
        this.parentsStack = list;
        this.photoId = num2;
        this.videoId = num3;
        this.attachments = list2;
        this.donut = wallWallCommentDonutDto;
        this.likes = baseLikesInfoDto;
        this.realOffset = num4;
        this.replyToUser = userId3;
        this.replyToComment = num5;
        this.thread = commentThreadDto;
        this.deleted = bool;
        this.pid = num6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallWallCommentDto)) {
            return false;
        }
        WallWallCommentDto wallWallCommentDto = (WallWallCommentDto) obj;
        return this.id == wallWallCommentDto.id && epx.f(this.fromId, wallWallCommentDto.fromId) && this.date == wallWallCommentDto.date && epx.f(this.text, wallWallCommentDto.text) && this.canEdit == wallWallCommentDto.canEdit && epx.f(this.postId, wallWallCommentDto.postId) && epx.f(this.ownerId, wallWallCommentDto.ownerId) && epx.f(this.parentsStack, wallWallCommentDto.parentsStack) && epx.f(this.photoId, wallWallCommentDto.photoId) && epx.f(this.videoId, wallWallCommentDto.videoId) && epx.f(this.attachments, wallWallCommentDto.attachments) && epx.f(this.donut, wallWallCommentDto.donut) && epx.f(this.likes, wallWallCommentDto.likes) && epx.f(this.realOffset, wallWallCommentDto.realOffset) && epx.f(this.replyToUser, wallWallCommentDto.replyToUser) && epx.f(this.replyToComment, wallWallCommentDto.replyToComment) && epx.f(this.thread, wallWallCommentDto.thread) && epx.f(this.deleted, wallWallCommentDto.deleted) && epx.f(this.pid, wallWallCommentDto.pid);
    }

    public final int hashCode() {
        int a = urd0.a(shy.a(this.date, bh10.a(Integer.hashCode(this.id) * 31, 31, this.fromId.b), 31), 31, this.text);
        BaseBoolIntDto baseBoolIntDto = this.canEdit;
        int hashCode = (a + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        Integer num = this.postId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        UserId userId = this.ownerId;
        int hashCode3 = (hashCode2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        List<Integer> list = this.parentsStack;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.photoId;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.videoId;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<WallWallpostAttachmentDto> list2 = this.attachments;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        WallWallCommentDonutDto wallWallCommentDonutDto = this.donut;
        int hashCode8 = (hashCode7 + (wallWallCommentDonutDto == null ? 0 : wallWallCommentDonutDto.hashCode())) * 31;
        BaseLikesInfoDto baseLikesInfoDto = this.likes;
        int hashCode9 = (hashCode8 + (baseLikesInfoDto == null ? 0 : baseLikesInfoDto.hashCode())) * 31;
        Integer num4 = this.realOffset;
        int hashCode10 = (hashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        UserId userId2 = this.replyToUser;
        int hashCode11 = (hashCode10 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
        Integer num5 = this.replyToComment;
        int hashCode12 = (hashCode11 + (num5 == null ? 0 : num5.hashCode())) * 31;
        CommentThreadDto commentThreadDto = this.thread;
        int hashCode13 = (hashCode12 + (commentThreadDto == null ? 0 : commentThreadDto.hashCode())) * 31;
        Boolean bool = this.deleted;
        int hashCode14 = (hashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num6 = this.pid;
        return hashCode14 + (num6 != null ? num6.hashCode() : 0);
    }

    public final String toString() {
        int i = this.id;
        UserId userId = this.fromId;
        int i2 = this.date;
        String str = this.text;
        BaseBoolIntDto baseBoolIntDto = this.canEdit;
        Integer num = this.postId;
        UserId userId2 = this.ownerId;
        List<Integer> list = this.parentsStack;
        Integer num2 = this.photoId;
        Integer num3 = this.videoId;
        List<WallWallpostAttachmentDto> list2 = this.attachments;
        WallWallCommentDonutDto wallWallCommentDonutDto = this.donut;
        BaseLikesInfoDto baseLikesInfoDto = this.likes;
        Integer num4 = this.realOffset;
        UserId userId3 = this.replyToUser;
        Integer num5 = this.replyToComment;
        CommentThreadDto commentThreadDto = this.thread;
        Boolean bool = this.deleted;
        Integer num6 = this.pid;
        StringBuilder sb = new StringBuilder("WallWallCommentDto(id=");
        sb.append(i);
        sb.append(", fromId=");
        sb.append(userId);
        sb.append(", date=");
        jax0.a(i2, ", text=", str, ", canEdit=", sb);
        sb.append(baseBoolIntDto);
        sb.append(", postId=");
        sb.append(num);
        sb.append(", ownerId=");
        sb.append(userId2);
        sb.append(", parentsStack=");
        sb.append(list);
        sb.append(", photoId=");
        sq.b(sb, num2, ", videoId=", num3, ", attachments=");
        sb.append(list2);
        sb.append(", donut=");
        sb.append(wallWallCommentDonutDto);
        sb.append(", likes=");
        sb.append(baseLikesInfoDto);
        sb.append(", realOffset=");
        sb.append(num4);
        sb.append(", replyToUser=");
        sb.append(userId3);
        sb.append(", replyToComment=");
        sb.append(num5);
        sb.append(", thread=");
        sb.append(commentThreadDto);
        sb.append(", deleted=");
        sb.append(bool);
        sb.append(", pid=");
        return oq.b(sb, num6, ")");
    }

    public /* synthetic */ WallWallCommentDto(int i, UserId userId, int i2, String str, BaseBoolIntDto baseBoolIntDto, Integer num, UserId userId2, List list, Integer num2, Integer num3, List list2, WallWallCommentDonutDto wallWallCommentDonutDto, BaseLikesInfoDto baseLikesInfoDto, Integer num4, UserId userId3, Integer num5, CommentThreadDto commentThreadDto, Boolean bool, Integer num6, int i3, zcl zclVar) {
        this(i, userId, i2, str, (i3 & 16) != 0 ? null : baseBoolIntDto, (i3 & 32) != 0 ? null : num, (i3 & 64) != 0 ? null : userId2, (i3 & 128) != 0 ? null : list, (i3 & 256) != 0 ? null : num2, (i3 & 512) != 0 ? null : num3, (i3 & 1024) != 0 ? null : list2, (i3 & 2048) != 0 ? null : wallWallCommentDonutDto, (i3 & 4096) != 0 ? null : baseLikesInfoDto, (i3 & 8192) != 0 ? null : num4, (i3 & 16384) != 0 ? null : userId3, (32768 & i3) != 0 ? null : num5, (65536 & i3) != 0 ? null : commentThreadDto, (131072 & i3) != 0 ? null : bool, (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : num6);
    }
}
