package com.vk.api.generated.board.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BoardTopicDto.kt */
/* loaded from: classes14.dex */
public final class BoardTopicDto implements Parcelable {
    public static final Parcelable.Creator<BoardTopicDto> CREATOR = new a();

    @pmi0("comments")
    private final Integer comments;

    @pmi0("created")
    private final Integer created;

    @pmi0("created_by")
    private final UserId createdBy;

    @pmi0("first_comment")
    private final String firstComment;

    @pmi0("id")
    private final Integer id;

    @pmi0("is_closed")
    private final BaseBoolIntDto isClosed;

    @pmi0("is_fixed")
    private final BaseBoolIntDto isFixed;

    @pmi0("last_comment")
    private final String lastComment;

    @pmi0("title")
    private final String title;

    @pmi0("updated")
    private final Integer updated;

    @pmi0("updated_by")
    private final UserId updatedBy;

    /* compiled from: BoardTopicDto.kt */
    public static final class a implements Parcelable.Creator<BoardTopicDto> {
        @Override // android.os.Parcelable.Creator
        public final BoardTopicDto createFromParcel(Parcel parcel) {
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            UserId userId = (UserId) parcel.readParcelable(BoardTopicDto.class.getClassLoader());
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BaseBoolIntDto baseBoolIntDto = (BaseBoolIntDto) parcel.readParcelable(BoardTopicDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto2 = (BaseBoolIntDto) parcel.readParcelable(BoardTopicDto.class.getClassLoader());
            Integer num = null;
            Integer num2 = valueOf2;
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new BoardTopicDto(valueOf, num2, userId, valueOf3, baseBoolIntDto, baseBoolIntDto2, readString, num, (UserId) parcel.readParcelable(BoardTopicDto.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BoardTopicDto[] newArray(int i) {
            return new BoardTopicDto[i];
        }
    }

    public BoardTopicDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public final Integer d() {
        return this.comments;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.created;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoardTopicDto)) {
            return false;
        }
        BoardTopicDto boardTopicDto = (BoardTopicDto) obj;
        return epx.f(this.comments, boardTopicDto.comments) && epx.f(this.created, boardTopicDto.created) && epx.f(this.createdBy, boardTopicDto.createdBy) && epx.f(this.id, boardTopicDto.id) && this.isClosed == boardTopicDto.isClosed && this.isFixed == boardTopicDto.isFixed && epx.f(this.title, boardTopicDto.title) && epx.f(this.updated, boardTopicDto.updated) && epx.f(this.updatedBy, boardTopicDto.updatedBy) && epx.f(this.firstComment, boardTopicDto.firstComment) && epx.f(this.lastComment, boardTopicDto.lastComment);
    }

    public final UserId f() {
        return this.createdBy;
    }

    public final Integer g() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        Integer num = this.comments;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.created;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        UserId userId = this.createdBy;
        int hashCode3 = (hashCode2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Integer num3 = this.id;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.isClosed;
        int hashCode5 = (hashCode4 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.isFixed;
        int hashCode6 = (hashCode5 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        String str = this.title;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num4 = this.updated;
        int hashCode8 = (hashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        UserId userId2 = this.updatedBy;
        int hashCode9 = (hashCode8 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
        String str2 = this.firstComment;
        int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastComment;
        return hashCode10 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String i() {
        return this.lastComment;
    }

    public final Integer j() {
        return this.updated;
    }

    public final UserId k() {
        return this.updatedBy;
    }

    public final BaseBoolIntDto l() {
        return this.isClosed;
    }

    public final BaseBoolIntDto n() {
        return this.isFixed;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoardTopicDto(comments=");
        sb.append(this.comments);
        sb.append(", created=");
        sb.append(this.created);
        sb.append(", createdBy=");
        sb.append(this.createdBy);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", isClosed=");
        sb.append(this.isClosed);
        sb.append(", isFixed=");
        sb.append(this.isFixed);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", updated=");
        sb.append(this.updated);
        sb.append(", updatedBy=");
        sb.append(this.updatedBy);
        sb.append(", firstComment=");
        sb.append(this.firstComment);
        sb.append(", lastComment=");
        return ho8.a(sb, this.lastComment, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.comments;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.created;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeParcelable(this.createdBy, i);
        Integer num3 = this.id;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeParcelable(this.isClosed, i);
        parcel.writeParcelable(this.isFixed, i);
        parcel.writeString(this.title);
        Integer num4 = this.updated;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        parcel.writeParcelable(this.updatedBy, i);
        parcel.writeString(this.firstComment);
        parcel.writeString(this.lastComment);
    }

    public BoardTopicDto(Integer num, Integer num2, UserId userId, Integer num3, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, String str, Integer num4, UserId userId2, String str2, String str3) {
        this.comments = num;
        this.created = num2;
        this.createdBy = userId;
        this.id = num3;
        this.isClosed = baseBoolIntDto;
        this.isFixed = baseBoolIntDto2;
        this.title = str;
        this.updated = num4;
        this.updatedBy = userId2;
        this.firstComment = str2;
        this.lastComment = str3;
    }

    public /* synthetic */ BoardTopicDto(Integer num, Integer num2, UserId userId, Integer num3, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, String str, Integer num4, UserId userId2, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : userId, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : baseBoolIntDto, (i & 32) != 0 ? null : baseBoolIntDto2, (i & 64) != 0 ? null : str, (i & 128) != 0 ? null : num4, (i & 256) != 0 ? null : userId2, (i & 512) != 0 ? null : str2, (i & 1024) != 0 ? null : str3);
    }
}
