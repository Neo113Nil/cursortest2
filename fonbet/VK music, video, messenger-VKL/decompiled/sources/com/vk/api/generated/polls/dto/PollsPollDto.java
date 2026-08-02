package com.vk.api.generated.polls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.dto.common.id.UserId;
import io.appmetrica.analytics.impl.L2;
import io.reactivex.rxjava3.subjects.b;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bh10;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.k73;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: PollsPollDto.kt */
/* loaded from: classes15.dex */
public final class PollsPollDto implements Parcelable {
    public static final Parcelable.Creator<PollsPollDto> CREATOR = new a();

    @pmi0("anonymous")
    private final Boolean anonymous;

    @pmi0("answer_id")
    private final Long answerId;

    @pmi0("answer_ids")
    private final List<Long> answerIds;

    @pmi0("answers")
    private final List<PollsAnswerDto> answers;

    @pmi0("author_id")
    private final UserId authorId;

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

    /* compiled from: PollsPollDto.kt */
    public static final class a implements Parcelable.Creator<PollsPollDto> {
        @Override // android.os.Parcelable.Creator
        public final PollsPollDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            ArrayList arrayList;
            Class cls;
            ArrayList arrayList2;
            Long l;
            boolean z = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            boolean z5 = parcel.readInt() != 0;
            boolean z6 = parcel.readInt() != 0;
            boolean z7 = parcel.readInt() != 0;
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(PollsAnswerDto.CREATOR, parcel, arrayList3, i, 1);
            }
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            UserId userId = (UserId) parcel.readParcelable(PollsPollDto.class.getClassLoader());
            String readString = parcel.readString();
            int readInt5 = parcel.readInt();
            boolean z8 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                cls = PollsPollDto.class;
                arrayList = null;
            } else {
                int readInt6 = parcel.readInt();
                arrayList = new ArrayList(readInt6);
                cls = PollsPollDto.class;
                int i2 = 0;
                while (i2 != readInt6) {
                    i2 = en.a(PollsFriendDto.CREATOR, parcel, arrayList, i2, 1);
                    readInt6 = readInt6;
                    valueOf = valueOf;
                }
            }
            Boolean bool = valueOf;
            Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                l = valueOf2;
                arrayList2 = null;
            } else {
                int readInt7 = parcel.readInt();
                arrayList2 = new ArrayList(readInt7);
                Long l2 = valueOf2;
                int i3 = 0;
                while (i3 != readInt7) {
                    i3 = k73.b(parcel, arrayList2, i3, 1);
                    readInt7 = readInt7;
                }
                l = l2;
            }
            return new PollsPollDto(z, readInt, z2, z3, z4, z5, z6, z7, arrayList3, readInt3, readInt4, userId, readString, readInt5, z8, bool, arrayList, l, arrayList2, parcel.readString(), parcel.readInt() == 0 ? null : PollsBackgroundDto.CREATOR.createFromParcel(parcel), (UserId) parcel.readParcelable(cls.getClassLoader()), parcel.readInt() != 0 ? PollsBackgroundDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final PollsPollDto[] newArray(int i) {
            return new PollsPollDto[i];
        }
    }

    public PollsPollDto(boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, List<PollsAnswerDto> list, int i2, int i3, UserId userId, String str, int i4, boolean z8, Boolean bool, List<PollsFriendDto> list2, Long l, List<Long> list3, String str2, PollsBackgroundDto pollsBackgroundDto, UserId userId2, PollsBackgroundDto pollsBackgroundDto2) {
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
        this.authorId = userId2;
        this.background = pollsBackgroundDto2;
    }

    public final List<PollsFriendDto> B() {
        return this.friends;
    }

    public final boolean C() {
        return this.multiple;
    }

    public final PollsBackgroundDto D() {
        return this.photo;
    }

    public final String F() {
        return this.question;
    }

    public final int G() {
        return this.votes;
    }

    public final boolean K() {
        return this.isBoard;
    }

    public final Boolean d() {
        return this.anonymous;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<Long> e() {
        return this.answerIds;
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

    public final List<PollsAnswerDto> f() {
        return this.answers;
    }

    public final UserId g() {
        return this.authorId;
    }

    public final int getId() {
        return this.id;
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
        UserId userId = this.authorId;
        int hashCode7 = (hashCode6 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        PollsBackgroundDto pollsBackgroundDto2 = this.background;
        return hashCode7 + (pollsBackgroundDto2 != null ? pollsBackgroundDto2.hashCode() : 0);
    }

    public final PollsBackgroundDto i() {
        return this.background;
    }

    public final boolean j() {
        return this.canReport;
    }

    public final boolean k() {
        return this.canShare;
    }

    public final boolean l() {
        return this.canVote;
    }

    public final boolean n() {
        return this.closed;
    }

    public final int o() {
        return this.created;
    }

    public final boolean p() {
        return this.disableUnvote;
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final boolean t0() {
        return this.canEdit;
    }

    public final String toString() {
        return "PollsPollDto(multiple=" + this.multiple + ", endDate=" + this.endDate + ", closed=" + this.closed + ", isBoard=" + this.isBoard + ", canEdit=" + this.canEdit + ", canVote=" + this.canVote + ", canReport=" + this.canReport + ", canShare=" + this.canShare + ", answers=" + this.answers + ", created=" + this.created + ", id=" + this.id + ", ownerId=" + this.ownerId + ", question=" + this.question + ", votes=" + this.votes + ", disableUnvote=" + this.disableUnvote + ", anonymous=" + this.anonymous + ", friends=" + this.friends + ", answerId=" + this.answerId + ", answerIds=" + this.answerIds + ", embedHash=" + this.embedHash + ", photo=" + this.photo + ", authorId=" + this.authorId + ", background=" + this.background + ')';
    }

    public final int u() {
        return this.endDate;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.multiple ? 1 : 0);
        parcel.writeInt(this.endDate);
        parcel.writeInt(this.closed ? 1 : 0);
        parcel.writeInt(this.isBoard ? 1 : 0);
        parcel.writeInt(this.canEdit ? 1 : 0);
        parcel.writeInt(this.canVote ? 1 : 0);
        parcel.writeInt(this.canReport ? 1 : 0);
        parcel.writeInt(this.canShare ? 1 : 0);
        Iterator a2 = ao.a(parcel, this.answers);
        while (a2.hasNext()) {
            ((PollsAnswerDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.created);
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.question);
        parcel.writeInt(this.votes);
        parcel.writeInt(this.disableUnvote ? 1 : 0);
        Boolean bool = this.anonymous;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        List<PollsFriendDto> list = this.friends;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((PollsFriendDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Long l = this.answerId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        List<Long> list2 = this.answerIds;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeLong(((Number) f2.next()).longValue());
            }
        }
        parcel.writeString(this.embedHash);
        PollsBackgroundDto pollsBackgroundDto = this.photo;
        if (pollsBackgroundDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pollsBackgroundDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.authorId, i);
        PollsBackgroundDto pollsBackgroundDto2 = this.background;
        if (pollsBackgroundDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pollsBackgroundDto2.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ PollsPollDto(boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, List list, int i2, int i3, UserId userId, String str, int i4, boolean z8, Boolean bool, List list2, Long l, List list3, String str2, PollsBackgroundDto pollsBackgroundDto, UserId userId2, PollsBackgroundDto pollsBackgroundDto2, int i5, zcl zclVar) {
        this(z, i, z2, z3, z4, z5, z6, z7, list, i2, i3, userId, str, i4, z8, (i5 & 32768) != 0 ? null : bool, (i5 & 65536) != 0 ? null : list2, (i5 & 131072) != 0 ? null : l, (i5 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : list3, (i5 & 524288) != 0 ? null : str2, (i5 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : pollsBackgroundDto, (i5 & 2097152) != 0 ? null : userId2, (i5 & 4194304) != 0 ? null : pollsBackgroundDto2);
    }
}
