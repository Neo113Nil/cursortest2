package com.vk.sdk.api.groups.dto;

import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.pmi0;
import xsna.to;
import xsna.vp;
import xsna.zcl;

/* compiled from: GroupsLongPollEventsDto.kt */
/* loaded from: classes5.dex */
public final class GroupsLongPollEventsDto {

    @pmi0("audio_new")
    private final BaseBoolIntDto audioNew;

    @pmi0("board_post_delete")
    private final BaseBoolIntDto boardPostDelete;

    @pmi0("board_post_edit")
    private final BaseBoolIntDto boardPostEdit;

    @pmi0("board_post_new")
    private final BaseBoolIntDto boardPostNew;

    @pmi0("board_post_restore")
    private final BaseBoolIntDto boardPostRestore;

    @pmi0("donut_money_withdraw")
    private final BaseBoolIntDto donutMoneyWithdraw;

    @pmi0("donut_money_withdraw_error")
    private final BaseBoolIntDto donutMoneyWithdrawError;

    @pmi0("donut_subscription_cancelled")
    private final BaseBoolIntDto donutSubscriptionCancelled;

    @pmi0("donut_subscription_create")
    private final BaseBoolIntDto donutSubscriptionCreate;

    @pmi0("donut_subscription_expired")
    private final BaseBoolIntDto donutSubscriptionExpired;

    @pmi0("donut_subscription_price_changed")
    private final BaseBoolIntDto donutSubscriptionPriceChanged;

    @pmi0("donut_subscription_prolonged")
    private final BaseBoolIntDto donutSubscriptionProlonged;

    @pmi0("group_change_photo")
    private final BaseBoolIntDto groupChangePhoto;

    @pmi0("group_change_settings")
    private final BaseBoolIntDto groupChangeSettings;

    @pmi0("group_join")
    private final BaseBoolIntDto groupJoin;

    @pmi0("group_leave")
    private final BaseBoolIntDto groupLeave;

    @pmi0("group_officers_edit")
    private final BaseBoolIntDto groupOfficersEdit;

    @pmi0("lead_forms_new")
    private final BaseBoolIntDto leadFormsNew;

    @pmi0("market_comment_delete")
    private final BaseBoolIntDto marketCommentDelete;

    @pmi0("market_comment_edit")
    private final BaseBoolIntDto marketCommentEdit;

    @pmi0("market_comment_new")
    private final BaseBoolIntDto marketCommentNew;

    @pmi0("market_comment_restore")
    private final BaseBoolIntDto marketCommentRestore;

    @pmi0("market_order_edit")
    private final BaseBoolIntDto marketOrderEdit;

    @pmi0("market_order_new")
    private final BaseBoolIntDto marketOrderNew;

    @pmi0("message_allow")
    private final BaseBoolIntDto messageAllow;

    @pmi0("message_deny")
    private final BaseBoolIntDto messageDeny;

    @pmi0("message_edit")
    private final BaseBoolIntDto messageEdit;

    @pmi0("message_new")
    private final BaseBoolIntDto messageNew;

    @pmi0("message_reaction_event")
    private final BaseBoolIntDto messageReactionEvent;

    @pmi0("message_read")
    private final BaseBoolIntDto messageRead;

    @pmi0("message_reply")
    private final BaseBoolIntDto messageReply;

    @pmi0("message_typing_state")
    private final BaseBoolIntDto messageTypingState;

    @pmi0("photo_comment_delete")
    private final BaseBoolIntDto photoCommentDelete;

    @pmi0("photo_comment_edit")
    private final BaseBoolIntDto photoCommentEdit;

    @pmi0("photo_comment_new")
    private final BaseBoolIntDto photoCommentNew;

    @pmi0("photo_comment_restore")
    private final BaseBoolIntDto photoCommentRestore;

    @pmi0("photo_new")
    private final BaseBoolIntDto photoNew;

    @pmi0("poll_vote_new")
    private final BaseBoolIntDto pollVoteNew;

    @pmi0("user_block")
    private final BaseBoolIntDto userBlock;

    @pmi0("user_unblock")
    private final BaseBoolIntDto userUnblock;

    @pmi0("video_comment_delete")
    private final BaseBoolIntDto videoCommentDelete;

    @pmi0("video_comment_edit")
    private final BaseBoolIntDto videoCommentEdit;

    @pmi0("video_comment_new")
    private final BaseBoolIntDto videoCommentNew;

    @pmi0("video_comment_restore")
    private final BaseBoolIntDto videoCommentRestore;

    @pmi0("video_new")
    private final BaseBoolIntDto videoNew;

    @pmi0("wall_post_new")
    private final BaseBoolIntDto wallPostNew;

    @pmi0("wall_reply_delete")
    private final BaseBoolIntDto wallReplyDelete;

    @pmi0("wall_reply_edit")
    private final BaseBoolIntDto wallReplyEdit;

    @pmi0("wall_reply_new")
    private final BaseBoolIntDto wallReplyNew;

    @pmi0("wall_reply_restore")
    private final BaseBoolIntDto wallReplyRestore;

    @pmi0("wall_repost")
    private final BaseBoolIntDto wallRepost;

    public GroupsLongPollEventsDto(BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, BaseBoolIntDto baseBoolIntDto10, BaseBoolIntDto baseBoolIntDto11, BaseBoolIntDto baseBoolIntDto12, BaseBoolIntDto baseBoolIntDto13, BaseBoolIntDto baseBoolIntDto14, BaseBoolIntDto baseBoolIntDto15, BaseBoolIntDto baseBoolIntDto16, BaseBoolIntDto baseBoolIntDto17, BaseBoolIntDto baseBoolIntDto18, BaseBoolIntDto baseBoolIntDto19, BaseBoolIntDto baseBoolIntDto20, BaseBoolIntDto baseBoolIntDto21, BaseBoolIntDto baseBoolIntDto22, BaseBoolIntDto baseBoolIntDto23, BaseBoolIntDto baseBoolIntDto24, BaseBoolIntDto baseBoolIntDto25, BaseBoolIntDto baseBoolIntDto26, BaseBoolIntDto baseBoolIntDto27, BaseBoolIntDto baseBoolIntDto28, BaseBoolIntDto baseBoolIntDto29, BaseBoolIntDto baseBoolIntDto30, BaseBoolIntDto baseBoolIntDto31, BaseBoolIntDto baseBoolIntDto32, BaseBoolIntDto baseBoolIntDto33, BaseBoolIntDto baseBoolIntDto34, BaseBoolIntDto baseBoolIntDto35, BaseBoolIntDto baseBoolIntDto36, BaseBoolIntDto baseBoolIntDto37, BaseBoolIntDto baseBoolIntDto38, BaseBoolIntDto baseBoolIntDto39, BaseBoolIntDto baseBoolIntDto40, BaseBoolIntDto baseBoolIntDto41, BaseBoolIntDto baseBoolIntDto42, BaseBoolIntDto baseBoolIntDto43, BaseBoolIntDto baseBoolIntDto44, BaseBoolIntDto baseBoolIntDto45, BaseBoolIntDto baseBoolIntDto46, BaseBoolIntDto baseBoolIntDto47, BaseBoolIntDto baseBoolIntDto48, BaseBoolIntDto baseBoolIntDto49, BaseBoolIntDto baseBoolIntDto50, BaseBoolIntDto baseBoolIntDto51) {
        this.audioNew = baseBoolIntDto;
        this.boardPostDelete = baseBoolIntDto2;
        this.boardPostEdit = baseBoolIntDto3;
        this.boardPostNew = baseBoolIntDto4;
        this.boardPostRestore = baseBoolIntDto5;
        this.groupChangePhoto = baseBoolIntDto6;
        this.groupChangeSettings = baseBoolIntDto7;
        this.groupJoin = baseBoolIntDto8;
        this.groupLeave = baseBoolIntDto9;
        this.groupOfficersEdit = baseBoolIntDto10;
        this.marketCommentDelete = baseBoolIntDto11;
        this.marketCommentEdit = baseBoolIntDto12;
        this.marketCommentNew = baseBoolIntDto13;
        this.marketCommentRestore = baseBoolIntDto14;
        this.messageAllow = baseBoolIntDto15;
        this.messageDeny = baseBoolIntDto16;
        this.messageNew = baseBoolIntDto17;
        this.messageRead = baseBoolIntDto18;
        this.messageReply = baseBoolIntDto19;
        this.messageTypingState = baseBoolIntDto20;
        this.messageEdit = baseBoolIntDto21;
        this.photoCommentDelete = baseBoolIntDto22;
        this.photoCommentEdit = baseBoolIntDto23;
        this.photoCommentNew = baseBoolIntDto24;
        this.photoCommentRestore = baseBoolIntDto25;
        this.photoNew = baseBoolIntDto26;
        this.pollVoteNew = baseBoolIntDto27;
        this.userBlock = baseBoolIntDto28;
        this.userUnblock = baseBoolIntDto29;
        this.videoCommentDelete = baseBoolIntDto30;
        this.videoCommentEdit = baseBoolIntDto31;
        this.videoCommentNew = baseBoolIntDto32;
        this.videoCommentRestore = baseBoolIntDto33;
        this.videoNew = baseBoolIntDto34;
        this.messageReactionEvent = baseBoolIntDto35;
        this.wallPostNew = baseBoolIntDto36;
        this.wallReplyDelete = baseBoolIntDto37;
        this.wallReplyEdit = baseBoolIntDto38;
        this.wallReplyNew = baseBoolIntDto39;
        this.wallReplyRestore = baseBoolIntDto40;
        this.wallRepost = baseBoolIntDto41;
        this.donutSubscriptionCreate = baseBoolIntDto42;
        this.donutSubscriptionProlonged = baseBoolIntDto43;
        this.donutSubscriptionCancelled = baseBoolIntDto44;
        this.donutSubscriptionExpired = baseBoolIntDto45;
        this.donutSubscriptionPriceChanged = baseBoolIntDto46;
        this.donutMoneyWithdraw = baseBoolIntDto47;
        this.donutMoneyWithdrawError = baseBoolIntDto48;
        this.leadFormsNew = baseBoolIntDto49;
        this.marketOrderNew = baseBoolIntDto50;
        this.marketOrderEdit = baseBoolIntDto51;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsLongPollEventsDto)) {
            return false;
        }
        GroupsLongPollEventsDto groupsLongPollEventsDto = (GroupsLongPollEventsDto) obj;
        return this.audioNew == groupsLongPollEventsDto.audioNew && this.boardPostDelete == groupsLongPollEventsDto.boardPostDelete && this.boardPostEdit == groupsLongPollEventsDto.boardPostEdit && this.boardPostNew == groupsLongPollEventsDto.boardPostNew && this.boardPostRestore == groupsLongPollEventsDto.boardPostRestore && this.groupChangePhoto == groupsLongPollEventsDto.groupChangePhoto && this.groupChangeSettings == groupsLongPollEventsDto.groupChangeSettings && this.groupJoin == groupsLongPollEventsDto.groupJoin && this.groupLeave == groupsLongPollEventsDto.groupLeave && this.groupOfficersEdit == groupsLongPollEventsDto.groupOfficersEdit && this.marketCommentDelete == groupsLongPollEventsDto.marketCommentDelete && this.marketCommentEdit == groupsLongPollEventsDto.marketCommentEdit && this.marketCommentNew == groupsLongPollEventsDto.marketCommentNew && this.marketCommentRestore == groupsLongPollEventsDto.marketCommentRestore && this.messageAllow == groupsLongPollEventsDto.messageAllow && this.messageDeny == groupsLongPollEventsDto.messageDeny && this.messageNew == groupsLongPollEventsDto.messageNew && this.messageRead == groupsLongPollEventsDto.messageRead && this.messageReply == groupsLongPollEventsDto.messageReply && this.messageTypingState == groupsLongPollEventsDto.messageTypingState && this.messageEdit == groupsLongPollEventsDto.messageEdit && this.photoCommentDelete == groupsLongPollEventsDto.photoCommentDelete && this.photoCommentEdit == groupsLongPollEventsDto.photoCommentEdit && this.photoCommentNew == groupsLongPollEventsDto.photoCommentNew && this.photoCommentRestore == groupsLongPollEventsDto.photoCommentRestore && this.photoNew == groupsLongPollEventsDto.photoNew && this.pollVoteNew == groupsLongPollEventsDto.pollVoteNew && this.userBlock == groupsLongPollEventsDto.userBlock && this.userUnblock == groupsLongPollEventsDto.userUnblock && this.videoCommentDelete == groupsLongPollEventsDto.videoCommentDelete && this.videoCommentEdit == groupsLongPollEventsDto.videoCommentEdit && this.videoCommentNew == groupsLongPollEventsDto.videoCommentNew && this.videoCommentRestore == groupsLongPollEventsDto.videoCommentRestore && this.videoNew == groupsLongPollEventsDto.videoNew && this.messageReactionEvent == groupsLongPollEventsDto.messageReactionEvent && this.wallPostNew == groupsLongPollEventsDto.wallPostNew && this.wallReplyDelete == groupsLongPollEventsDto.wallReplyDelete && this.wallReplyEdit == groupsLongPollEventsDto.wallReplyEdit && this.wallReplyNew == groupsLongPollEventsDto.wallReplyNew && this.wallReplyRestore == groupsLongPollEventsDto.wallReplyRestore && this.wallRepost == groupsLongPollEventsDto.wallRepost && this.donutSubscriptionCreate == groupsLongPollEventsDto.donutSubscriptionCreate && this.donutSubscriptionProlonged == groupsLongPollEventsDto.donutSubscriptionProlonged && this.donutSubscriptionCancelled == groupsLongPollEventsDto.donutSubscriptionCancelled && this.donutSubscriptionExpired == groupsLongPollEventsDto.donutSubscriptionExpired && this.donutSubscriptionPriceChanged == groupsLongPollEventsDto.donutSubscriptionPriceChanged && this.donutMoneyWithdraw == groupsLongPollEventsDto.donutMoneyWithdraw && this.donutMoneyWithdrawError == groupsLongPollEventsDto.donutMoneyWithdrawError && this.leadFormsNew == groupsLongPollEventsDto.leadFormsNew && this.marketOrderNew == groupsLongPollEventsDto.marketOrderNew && this.marketOrderEdit == groupsLongPollEventsDto.marketOrderEdit;
    }

    public final int hashCode() {
        int a = vp.a(this.donutMoneyWithdrawError, vp.a(this.donutMoneyWithdraw, vp.a(this.donutSubscriptionPriceChanged, vp.a(this.donutSubscriptionExpired, vp.a(this.donutSubscriptionCancelled, vp.a(this.donutSubscriptionProlonged, vp.a(this.donutSubscriptionCreate, vp.a(this.wallRepost, vp.a(this.wallReplyRestore, vp.a(this.wallReplyNew, vp.a(this.wallReplyEdit, vp.a(this.wallReplyDelete, vp.a(this.wallPostNew, vp.a(this.messageReactionEvent, vp.a(this.videoNew, vp.a(this.videoCommentRestore, vp.a(this.videoCommentNew, vp.a(this.videoCommentEdit, vp.a(this.videoCommentDelete, vp.a(this.userUnblock, vp.a(this.userBlock, vp.a(this.pollVoteNew, vp.a(this.photoNew, vp.a(this.photoCommentRestore, vp.a(this.photoCommentNew, vp.a(this.photoCommentEdit, vp.a(this.photoCommentDelete, vp.a(this.messageEdit, vp.a(this.messageTypingState, vp.a(this.messageReply, vp.a(this.messageRead, vp.a(this.messageNew, vp.a(this.messageDeny, vp.a(this.messageAllow, vp.a(this.marketCommentRestore, vp.a(this.marketCommentNew, vp.a(this.marketCommentEdit, vp.a(this.marketCommentDelete, vp.a(this.groupOfficersEdit, vp.a(this.groupLeave, vp.a(this.groupJoin, vp.a(this.groupChangeSettings, vp.a(this.groupChangePhoto, vp.a(this.boardPostRestore, vp.a(this.boardPostNew, vp.a(this.boardPostEdit, vp.a(this.boardPostDelete, this.audioNew.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        BaseBoolIntDto baseBoolIntDto = this.leadFormsNew;
        int hashCode = (a + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.marketOrderNew;
        int hashCode2 = (hashCode + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.marketOrderEdit;
        return hashCode2 + (baseBoolIntDto3 != null ? baseBoolIntDto3.hashCode() : 0);
    }

    public final String toString() {
        BaseBoolIntDto baseBoolIntDto = this.audioNew;
        BaseBoolIntDto baseBoolIntDto2 = this.boardPostDelete;
        BaseBoolIntDto baseBoolIntDto3 = this.boardPostEdit;
        BaseBoolIntDto baseBoolIntDto4 = this.boardPostNew;
        BaseBoolIntDto baseBoolIntDto5 = this.boardPostRestore;
        BaseBoolIntDto baseBoolIntDto6 = this.groupChangePhoto;
        BaseBoolIntDto baseBoolIntDto7 = this.groupChangeSettings;
        BaseBoolIntDto baseBoolIntDto8 = this.groupJoin;
        BaseBoolIntDto baseBoolIntDto9 = this.groupLeave;
        BaseBoolIntDto baseBoolIntDto10 = this.groupOfficersEdit;
        BaseBoolIntDto baseBoolIntDto11 = this.marketCommentDelete;
        BaseBoolIntDto baseBoolIntDto12 = this.marketCommentEdit;
        BaseBoolIntDto baseBoolIntDto13 = this.marketCommentNew;
        BaseBoolIntDto baseBoolIntDto14 = this.marketCommentRestore;
        BaseBoolIntDto baseBoolIntDto15 = this.messageAllow;
        BaseBoolIntDto baseBoolIntDto16 = this.messageDeny;
        BaseBoolIntDto baseBoolIntDto17 = this.messageNew;
        BaseBoolIntDto baseBoolIntDto18 = this.messageRead;
        BaseBoolIntDto baseBoolIntDto19 = this.messageReply;
        BaseBoolIntDto baseBoolIntDto20 = this.messageTypingState;
        BaseBoolIntDto baseBoolIntDto21 = this.messageEdit;
        BaseBoolIntDto baseBoolIntDto22 = this.photoCommentDelete;
        BaseBoolIntDto baseBoolIntDto23 = this.photoCommentEdit;
        BaseBoolIntDto baseBoolIntDto24 = this.photoCommentNew;
        BaseBoolIntDto baseBoolIntDto25 = this.photoCommentRestore;
        BaseBoolIntDto baseBoolIntDto26 = this.photoNew;
        BaseBoolIntDto baseBoolIntDto27 = this.pollVoteNew;
        BaseBoolIntDto baseBoolIntDto28 = this.userBlock;
        BaseBoolIntDto baseBoolIntDto29 = this.userUnblock;
        BaseBoolIntDto baseBoolIntDto30 = this.videoCommentDelete;
        BaseBoolIntDto baseBoolIntDto31 = this.videoCommentEdit;
        BaseBoolIntDto baseBoolIntDto32 = this.videoCommentNew;
        BaseBoolIntDto baseBoolIntDto33 = this.videoCommentRestore;
        BaseBoolIntDto baseBoolIntDto34 = this.videoNew;
        BaseBoolIntDto baseBoolIntDto35 = this.messageReactionEvent;
        BaseBoolIntDto baseBoolIntDto36 = this.wallPostNew;
        BaseBoolIntDto baseBoolIntDto37 = this.wallReplyDelete;
        BaseBoolIntDto baseBoolIntDto38 = this.wallReplyEdit;
        BaseBoolIntDto baseBoolIntDto39 = this.wallReplyNew;
        BaseBoolIntDto baseBoolIntDto40 = this.wallReplyRestore;
        BaseBoolIntDto baseBoolIntDto41 = this.wallRepost;
        BaseBoolIntDto baseBoolIntDto42 = this.donutSubscriptionCreate;
        BaseBoolIntDto baseBoolIntDto43 = this.donutSubscriptionProlonged;
        BaseBoolIntDto baseBoolIntDto44 = this.donutSubscriptionCancelled;
        BaseBoolIntDto baseBoolIntDto45 = this.donutSubscriptionExpired;
        BaseBoolIntDto baseBoolIntDto46 = this.donutSubscriptionPriceChanged;
        BaseBoolIntDto baseBoolIntDto47 = this.donutMoneyWithdraw;
        BaseBoolIntDto baseBoolIntDto48 = this.donutMoneyWithdrawError;
        BaseBoolIntDto baseBoolIntDto49 = this.leadFormsNew;
        BaseBoolIntDto baseBoolIntDto50 = this.marketOrderNew;
        BaseBoolIntDto baseBoolIntDto51 = this.marketOrderEdit;
        StringBuilder sb = new StringBuilder("GroupsLongPollEventsDto(audioNew=");
        sb.append(baseBoolIntDto);
        sb.append(", boardPostDelete=");
        sb.append(baseBoolIntDto2);
        sb.append(", boardPostEdit=");
        to.b(sb, baseBoolIntDto3, ", boardPostNew=", baseBoolIntDto4, ", boardPostRestore=");
        to.b(sb, baseBoolIntDto5, ", groupChangePhoto=", baseBoolIntDto6, ", groupChangeSettings=");
        to.b(sb, baseBoolIntDto7, ", groupJoin=", baseBoolIntDto8, ", groupLeave=");
        to.b(sb, baseBoolIntDto9, ", groupOfficersEdit=", baseBoolIntDto10, ", marketCommentDelete=");
        to.b(sb, baseBoolIntDto11, ", marketCommentEdit=", baseBoolIntDto12, ", marketCommentNew=");
        to.b(sb, baseBoolIntDto13, ", marketCommentRestore=", baseBoolIntDto14, ", messageAllow=");
        to.b(sb, baseBoolIntDto15, ", messageDeny=", baseBoolIntDto16, ", messageNew=");
        to.b(sb, baseBoolIntDto17, ", messageRead=", baseBoolIntDto18, ", messageReply=");
        to.b(sb, baseBoolIntDto19, ", messageTypingState=", baseBoolIntDto20, ", messageEdit=");
        to.b(sb, baseBoolIntDto21, ", photoCommentDelete=", baseBoolIntDto22, ", photoCommentEdit=");
        to.b(sb, baseBoolIntDto23, ", photoCommentNew=", baseBoolIntDto24, ", photoCommentRestore=");
        to.b(sb, baseBoolIntDto25, ", photoNew=", baseBoolIntDto26, ", pollVoteNew=");
        to.b(sb, baseBoolIntDto27, ", userBlock=", baseBoolIntDto28, ", userUnblock=");
        to.b(sb, baseBoolIntDto29, ", videoCommentDelete=", baseBoolIntDto30, ", videoCommentEdit=");
        to.b(sb, baseBoolIntDto31, ", videoCommentNew=", baseBoolIntDto32, ", videoCommentRestore=");
        to.b(sb, baseBoolIntDto33, ", videoNew=", baseBoolIntDto34, ", messageReactionEvent=");
        to.b(sb, baseBoolIntDto35, ", wallPostNew=", baseBoolIntDto36, ", wallReplyDelete=");
        to.b(sb, baseBoolIntDto37, ", wallReplyEdit=", baseBoolIntDto38, ", wallReplyNew=");
        to.b(sb, baseBoolIntDto39, ", wallReplyRestore=", baseBoolIntDto40, ", wallRepost=");
        to.b(sb, baseBoolIntDto41, ", donutSubscriptionCreate=", baseBoolIntDto42, ", donutSubscriptionProlonged=");
        to.b(sb, baseBoolIntDto43, ", donutSubscriptionCancelled=", baseBoolIntDto44, ", donutSubscriptionExpired=");
        to.b(sb, baseBoolIntDto45, ", donutSubscriptionPriceChanged=", baseBoolIntDto46, ", donutMoneyWithdraw=");
        to.b(sb, baseBoolIntDto47, ", donutMoneyWithdrawError=", baseBoolIntDto48, ", leadFormsNew=");
        to.b(sb, baseBoolIntDto49, ", marketOrderNew=", baseBoolIntDto50, ", marketOrderEdit=");
        sb.append(baseBoolIntDto51);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ GroupsLongPollEventsDto(BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, BaseBoolIntDto baseBoolIntDto10, BaseBoolIntDto baseBoolIntDto11, BaseBoolIntDto baseBoolIntDto12, BaseBoolIntDto baseBoolIntDto13, BaseBoolIntDto baseBoolIntDto14, BaseBoolIntDto baseBoolIntDto15, BaseBoolIntDto baseBoolIntDto16, BaseBoolIntDto baseBoolIntDto17, BaseBoolIntDto baseBoolIntDto18, BaseBoolIntDto baseBoolIntDto19, BaseBoolIntDto baseBoolIntDto20, BaseBoolIntDto baseBoolIntDto21, BaseBoolIntDto baseBoolIntDto22, BaseBoolIntDto baseBoolIntDto23, BaseBoolIntDto baseBoolIntDto24, BaseBoolIntDto baseBoolIntDto25, BaseBoolIntDto baseBoolIntDto26, BaseBoolIntDto baseBoolIntDto27, BaseBoolIntDto baseBoolIntDto28, BaseBoolIntDto baseBoolIntDto29, BaseBoolIntDto baseBoolIntDto30, BaseBoolIntDto baseBoolIntDto31, BaseBoolIntDto baseBoolIntDto32, BaseBoolIntDto baseBoolIntDto33, BaseBoolIntDto baseBoolIntDto34, BaseBoolIntDto baseBoolIntDto35, BaseBoolIntDto baseBoolIntDto36, BaseBoolIntDto baseBoolIntDto37, BaseBoolIntDto baseBoolIntDto38, BaseBoolIntDto baseBoolIntDto39, BaseBoolIntDto baseBoolIntDto40, BaseBoolIntDto baseBoolIntDto41, BaseBoolIntDto baseBoolIntDto42, BaseBoolIntDto baseBoolIntDto43, BaseBoolIntDto baseBoolIntDto44, BaseBoolIntDto baseBoolIntDto45, BaseBoolIntDto baseBoolIntDto46, BaseBoolIntDto baseBoolIntDto47, BaseBoolIntDto baseBoolIntDto48, BaseBoolIntDto baseBoolIntDto49, BaseBoolIntDto baseBoolIntDto50, BaseBoolIntDto baseBoolIntDto51, int i, int i2, zcl zclVar) {
        this(baseBoolIntDto, baseBoolIntDto2, baseBoolIntDto3, baseBoolIntDto4, baseBoolIntDto5, baseBoolIntDto6, baseBoolIntDto7, baseBoolIntDto8, baseBoolIntDto9, baseBoolIntDto10, baseBoolIntDto11, baseBoolIntDto12, baseBoolIntDto13, baseBoolIntDto14, baseBoolIntDto15, baseBoolIntDto16, baseBoolIntDto17, baseBoolIntDto18, baseBoolIntDto19, baseBoolIntDto20, baseBoolIntDto21, baseBoolIntDto22, baseBoolIntDto23, baseBoolIntDto24, baseBoolIntDto25, baseBoolIntDto26, baseBoolIntDto27, baseBoolIntDto28, baseBoolIntDto29, baseBoolIntDto30, baseBoolIntDto31, baseBoolIntDto32, baseBoolIntDto33, baseBoolIntDto34, baseBoolIntDto35, baseBoolIntDto36, baseBoolIntDto37, baseBoolIntDto38, baseBoolIntDto39, baseBoolIntDto40, baseBoolIntDto41, baseBoolIntDto42, baseBoolIntDto43, baseBoolIntDto44, baseBoolIntDto45, baseBoolIntDto46, baseBoolIntDto47, baseBoolIntDto48, (i2 & 65536) != 0 ? null : baseBoolIntDto49, (i2 & 131072) != 0 ? null : baseBoolIntDto50, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : baseBoolIntDto51);
    }
}
