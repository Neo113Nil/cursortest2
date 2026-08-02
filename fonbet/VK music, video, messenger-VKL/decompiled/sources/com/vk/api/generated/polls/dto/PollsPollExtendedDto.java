package com.vk.api.generated.polls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import io.appmetrica.analytics.impl.L2;
import io.reactivex.rxjava3.subjects.b;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bh10;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.fw3;
import xsna.k73;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: PollsPollExtendedDto.kt */
/* loaded from: classes15.dex */
public final class PollsPollExtendedDto implements Parcelable {
    public static final Parcelable.Creator<PollsPollExtendedDto> CREATOR = new a();

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

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("question")
    private final String question;

    @pmi0("votes")
    private final int votes;

    /* compiled from: PollsPollExtendedDto.kt */
    public static final class a implements Parcelable.Creator<PollsPollExtendedDto> {
        @Override // android.os.Parcelable.Creator
        public final PollsPollExtendedDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i;
            Boolean valueOf;
            ArrayList arrayList2;
            Boolean bool;
            ArrayList arrayList3;
            ArrayList arrayList4;
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
            ArrayList arrayList5 = new ArrayList(readInt2);
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = bo.b(PollsPollExtendedDto.class, parcel, arrayList5, i2, 1);
            }
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            UserId userId = (UserId) parcel.readParcelable(PollsPollExtendedDto.class.getClassLoader());
            String readString = parcel.readString();
            int readInt5 = parcel.readInt();
            boolean z8 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                i = readInt3;
                arrayList = null;
            } else {
                int readInt6 = parcel.readInt();
                arrayList = new ArrayList(readInt6);
                i = readInt3;
                int i3 = 0;
                while (i3 != readInt6) {
                    i3 = bo.b(PollsPollExtendedDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                int readInt7 = parcel.readInt();
                arrayList2 = new ArrayList(readInt7);
                bool = valueOf;
                int i4 = 0;
                while (true) {
                    arrayList3 = arrayList;
                    if (i4 == readInt7) {
                        break;
                    }
                    i4 = bo.b(PollsPollExtendedDto.class, parcel, arrayList2, i4, 1);
                    arrayList = arrayList3;
                }
            } else {
                bool = valueOf;
                arrayList2 = null;
                arrayList3 = arrayList;
            }
            Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                l = valueOf2;
                arrayList4 = null;
            } else {
                int readInt8 = parcel.readInt();
                arrayList4 = new ArrayList(readInt8);
                Long l2 = valueOf2;
                int i5 = 0;
                while (i5 != readInt8) {
                    i5 = k73.b(parcel, arrayList4, i5, 1);
                    readInt8 = readInt8;
                }
                l = l2;
            }
            return new PollsPollExtendedDto(z, readInt, z2, z3, z4, z5, z6, z7, arrayList5, i, readInt4, userId, readString, readInt5, z8, arrayList3, bool, arrayList2, l, arrayList4, parcel.readString(), (PollsBackgroundDto) parcel.readParcelable(PollsPollExtendedDto.class.getClassLoader()), (UserId) parcel.readParcelable(PollsPollExtendedDto.class.getClassLoader()), (PollsBackgroundDto) parcel.readParcelable(PollsPollExtendedDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PollsPollExtendedDto[] newArray(int i) {
            return new PollsPollExtendedDto[i];
        }
    }

    public PollsPollExtendedDto(boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, List<PollsAnswerDto> list, int i2, int i3, UserId userId, String str, int i4, boolean z8, List<UsersUserFullDto> list2, Boolean bool, List<PollsFriendDto> list3, Long l, List<Long> list4, String str2, PollsBackgroundDto pollsBackgroundDto, UserId userId2, PollsBackgroundDto pollsBackgroundDto2) {
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
        this.profiles = list2;
        this.anonymous = bool;
        this.friends = list3;
        this.answerId = l;
        this.answerIds = list4;
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

    public final List<UsersUserFullDto> F() {
        return this.profiles;
    }

    public final String G() {
        return this.question;
    }

    public final int K() {
        return this.votes;
    }

    public final boolean M() {
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
        if (!(obj instanceof PollsPollExtendedDto)) {
            return false;
        }
        PollsPollExtendedDto pollsPollExtendedDto = (PollsPollExtendedDto) obj;
        return this.multiple == pollsPollExtendedDto.multiple && this.endDate == pollsPollExtendedDto.endDate && this.closed == pollsPollExtendedDto.closed && this.isBoard == pollsPollExtendedDto.isBoard && this.canEdit == pollsPollExtendedDto.canEdit && this.canVote == pollsPollExtendedDto.canVote && this.canReport == pollsPollExtendedDto.canReport && this.canShare == pollsPollExtendedDto.canShare && epx.f(this.answers, pollsPollExtendedDto.answers) && this.created == pollsPollExtendedDto.created && this.id == pollsPollExtendedDto.id && epx.f(this.ownerId, pollsPollExtendedDto.ownerId) && epx.f(this.question, pollsPollExtendedDto.question) && this.votes == pollsPollExtendedDto.votes && this.disableUnvote == pollsPollExtendedDto.disableUnvote && epx.f(this.profiles, pollsPollExtendedDto.profiles) && epx.f(this.anonymous, pollsPollExtendedDto.anonymous) && epx.f(this.friends, pollsPollExtendedDto.friends) && epx.f(this.answerId, pollsPollExtendedDto.answerId) && epx.f(this.answerIds, pollsPollExtendedDto.answerIds) && epx.f(this.embedHash, pollsPollExtendedDto.embedHash) && epx.f(this.photo, pollsPollExtendedDto.photo) && epx.f(this.authorId, pollsPollExtendedDto.authorId) && epx.f(this.background, pollsPollExtendedDto.background);
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
        List<UsersUserFullDto> list = this.profiles;
        int hashCode = (b + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.anonymous;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List<PollsFriendDto> list2 = this.friends;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l = this.answerId;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        List<Long> list3 = this.answerIds;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str = this.embedHash;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        PollsBackgroundDto pollsBackgroundDto = this.photo;
        int hashCode7 = (hashCode6 + (pollsBackgroundDto == null ? 0 : pollsBackgroundDto.hashCode())) * 31;
        UserId userId = this.authorId;
        int hashCode8 = (hashCode7 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        PollsBackgroundDto pollsBackgroundDto2 = this.background;
        return hashCode8 + (pollsBackgroundDto2 != null ? pollsBackgroundDto2.hashCode() : 0);
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
        return "PollsPollExtendedDto(multiple=" + this.multiple + ", endDate=" + this.endDate + ", closed=" + this.closed + ", isBoard=" + this.isBoard + ", canEdit=" + this.canEdit + ", canVote=" + this.canVote + ", canReport=" + this.canReport + ", canShare=" + this.canShare + ", answers=" + this.answers + ", created=" + this.created + ", id=" + this.id + ", ownerId=" + this.ownerId + ", question=" + this.question + ", votes=" + this.votes + ", disableUnvote=" + this.disableUnvote + ", profiles=" + this.profiles + ", anonymous=" + this.anonymous + ", friends=" + this.friends + ", answerId=" + this.answerId + ", answerIds=" + this.answerIds + ", embedHash=" + this.embedHash + ", photo=" + this.photo + ", authorId=" + this.authorId + ", background=" + this.background + ')';
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
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeInt(this.created);
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.question);
        parcel.writeInt(this.votes);
        parcel.writeInt(this.disableUnvote ? 1 : 0);
        List<UsersUserFullDto> list = this.profiles;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        Boolean bool = this.anonymous;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        List<PollsFriendDto> list2 = this.friends;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        Long l = this.answerId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        List<Long> list3 = this.answerIds;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeLong(((Number) f3.next()).longValue());
            }
        }
        parcel.writeString(this.embedHash);
        parcel.writeParcelable(this.photo, i);
        parcel.writeParcelable(this.authorId, i);
        parcel.writeParcelable(this.background, i);
    }

    public /* synthetic */ PollsPollExtendedDto(boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, List list, int i2, int i3, UserId userId, String str, int i4, boolean z8, List list2, Boolean bool, List list3, Long l, List list4, String str2, PollsBackgroundDto pollsBackgroundDto, UserId userId2, PollsBackgroundDto pollsBackgroundDto2, int i5, zcl zclVar) {
        this(z, i, z2, z3, z4, z5, z6, z7, list, i2, i3, userId, str, i4, z8, (i5 & 32768) != 0 ? null : list2, (i5 & 65536) != 0 ? null : bool, (i5 & 131072) != 0 ? null : list3, (i5 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : l, (i5 & 524288) != 0 ? null : list4, (i5 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str2, (i5 & 2097152) != 0 ? null : pollsBackgroundDto, (i5 & 4194304) != 0 ? null : userId2, (i5 & 8388608) != 0 ? null : pollsBackgroundDto2);
    }
}
