package com.vk.sdk.api.polls.dto;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.dto.common.id.UserId;
import io.appmetrica.analytics.impl.L2;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import xsna.bh10;
import xsna.epx;
import xsna.fw3;
import xsna.gsi0;
import xsna.nyh0;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.vr;
import xsna.zcl;

/* compiled from: PollsPollDto.kt */
/* loaded from: classes5.dex */
public final class PollsPollDto {

    @pmi0("anonymous")
    private final Boolean anonymous;

    @pmi0("answer_id")
    private final Long answerId;

    @pmi0("answer_ids")
    private final List<Long> answerIds;

    @pmi0("answers")
    private final List<PollsAnswerDto> answers;

    @pmi0("author_id")
    private final Integer authorId;

    @pmi0(L2.g)
    private final PollsBackgroundDto background;

    @pmi0("can_edit")
    private final boolean canEdit;

    @pmi0("can_report")
    private final boolean canReport;

    @pmi0("can_share")
    private final boolean canShare;

    @pmi0("can_vote")
    private final boolean canVote;

    @pmi0("closed")
    private final boolean closed;

    @pmi0("created")
    private final int created;

    @pmi0("disable_unvote")
    private final boolean disableUnvote;

    @pmi0("embed_hash")
    private final String embedHash;

    @pmi0("end_date")
    private final int endDate;

    @pmi0("friends")
    private final List<PollsFriendDto> friends;

    @pmi0("id")
    private final int id;

    @pmi0("is_board")
    private final boolean isBoard;

    @pmi0("multiple")
    private final boolean multiple;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("photo")
    private final PollsBackgroundDto photo;

    @pmi0("question")
    private final String question;

    @pmi0("votes")
    private final int votes;

    public PollsPollDto(boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, List<PollsAnswerDto> list, int i2, int i3, UserId userId, String str, int i4, boolean z8, Boolean bool, List<PollsFriendDto> list2, Long l, List<Long> list3, String str2, PollsBackgroundDto pollsBackgroundDto, Integer num, PollsBackgroundDto pollsBackgroundDto2) {
        this.multiple = z;
        this.endDate = i;
        this.closed = z2;
        this.isBoard = z3;
        this.canEdit = z4;
        this.canVote = z5;
        this.canReport = z6;
        this.canShare = z7;
        this.answers = list;
        this.created = i2;
        this.id = i3;
        this.ownerId = userId;
        this.question = str;
        this.votes = i4;
        this.disableUnvote = z8;
        this.anonymous = bool;
        this.friends = list2;
        this.answerId = l;
        this.answerIds = list3;
        this.embedHash = str2;
        this.photo = pollsBackgroundDto;
        this.authorId = num;
        this.background = pollsBackgroundDto2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollsPollDto)) {
            return false;
        }
        PollsPollDto pollsPollDto = (PollsPollDto) obj;
        return this.multiple == pollsPollDto.multiple && this.endDate == pollsPollDto.endDate && this.closed == pollsPollDto.closed && this.isBoard == pollsPollDto.isBoard && this.canEdit == pollsPollDto.canEdit && this.canVote == pollsPollDto.canVote && this.canReport == pollsPollDto.canReport && this.canShare == pollsPollDto.canShare && epx.f(this.answers, pollsPollDto.answers) && this.created == pollsPollDto.created && this.id == pollsPollDto.id && epx.f(this.ownerId, pollsPollDto.ownerId) && epx.f(this.question, pollsPollDto.question) && this.votes == pollsPollDto.votes && this.disableUnvote == pollsPollDto.disableUnvote && epx.f(this.anonymous, pollsPollDto.anonymous) && epx.f(this.friends, pollsPollDto.friends) && epx.f(this.answerId, pollsPollDto.answerId) && epx.f(this.answerIds, pollsPollDto.answerIds) && epx.f(this.embedHash, pollsPollDto.embedHash) && epx.f(this.photo, pollsPollDto.photo) && epx.f(this.authorId, pollsPollDto.authorId) && epx.f(this.background, pollsPollDto.background);
    }

    public final int hashCode() {
        int b = qoy.b(shy.a(this.votes, urd0.a(bh10.a(shy.a(this.id, shy.a(this.created, fw3.a(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(shy.a(this.endDate, Boolean.hashCode(this.multiple) * 31, 31), 31, this.closed), 31, this.isBoard), 31, this.canEdit), 31, this.canVote), 31, this.canReport), 31, this.canShare), 31, this.answers), 31), 31), 31, this.ownerId.b), 31, this.question), 31), 31, this.disableUnvote);
        Boolean bool = this.anonymous;
        int hashCode = (b + (bool == null ? 0 : bool.hashCode())) * 31;
        List<PollsFriendDto> list = this.friends;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.answerId;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        List<Long> list2 = this.answerIds;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.embedHash;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        PollsBackgroundDto pollsBackgroundDto = this.photo;
        int hashCode6 = (hashCode5 + (pollsBackgroundDto == null ? 0 : pollsBackgroundDto.hashCode())) * 31;
        Integer num = this.authorId;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        PollsBackgroundDto pollsBackgroundDto2 = this.background;
        return hashCode7 + (pollsBackgroundDto2 != null ? pollsBackgroundDto2.hashCode() : 0);
    }

    public final String toString() {
        boolean z = this.multiple;
        int i = this.endDate;
        boolean z2 = this.closed;
        boolean z3 = this.isBoard;
        boolean z4 = this.canEdit;
        boolean z5 = this.canVote;
        boolean z6 = this.canReport;
        boolean z7 = this.canShare;
        List<PollsAnswerDto> list = this.answers;
        int i2 = this.created;
        int i3 = this.id;
        UserId userId = this.ownerId;
        String str = this.question;
        int i4 = this.votes;
        boolean z8 = this.disableUnvote;
        Boolean bool = this.anonymous;
        List<PollsFriendDto> list2 = this.friends;
        Long l = this.answerId;
        List<Long> list3 = this.answerIds;
        String str2 = this.embedHash;
        PollsBackgroundDto pollsBackgroundDto = this.photo;
        Integer num = this.authorId;
        PollsBackgroundDto pollsBackgroundDto2 = this.background;
        StringBuilder sb = new StringBuilder("PollsPollDto(multiple=");
        sb.append(z);
        sb.append(", endDate=");
        sb.append(i);
        sb.append(", closed=");
        gsi0.c(sb, z2, ", isBoard=", z3, ", canEdit=");
        gsi0.c(sb, z4, ", canVote=", z5, ", canReport=");
        gsi0.c(sb, z6, ", canShare=", z7, ", answers=");
        sb.append(list);
        sb.append(", created=");
        sb.append(i2);
        sb.append(", id=");
        sb.append(i3);
        sb.append(", ownerId=");
        sb.append(userId);
        sb.append(", question=");
        nyh0.a(i4, str, ", votes=", ", disableUnvote=", sb);
        sb.append(z8);
        sb.append(", anonymous=");
        sb.append(bool);
        sb.append(", friends=");
        sb.append(list2);
        sb.append(", answerId=");
        sb.append(l);
        sb.append(", answerIds=");
        vr.c(", embedHash=", str2, ", photo=", sb, list3);
        sb.append(pollsBackgroundDto);
        sb.append(", authorId=");
        sb.append(num);
        sb.append(", background=");
        sb.append(pollsBackgroundDto2);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ PollsPollDto(boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, List list, int i2, int i3, UserId userId, String str, int i4, boolean z8, Boolean bool, List list2, Long l, List list3, String str2, PollsBackgroundDto pollsBackgroundDto, Integer num, PollsBackgroundDto pollsBackgroundDto2, int i5, zcl zclVar) {
        this(z, i, z2, z3, z4, z5, z6, z7, list, i2, i3, userId, str, i4, z8, (i5 & 32768) != 0 ? null : bool, (i5 & 65536) != 0 ? null : list2, (i5 & 131072) != 0 ? null : l, (i5 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : list3, (i5 & 524288) != 0 ? null : str2, (i5 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : pollsBackgroundDto, (i5 & 2097152) != 0 ? null : num, (i5 & 4194304) != 0 ? null : pollsBackgroundDto2);
    }
}
