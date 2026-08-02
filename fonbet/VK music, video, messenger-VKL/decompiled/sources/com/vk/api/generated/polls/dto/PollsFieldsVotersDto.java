package com.vk.api.generated.polls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: PollsFieldsVotersDto.kt */
/* loaded from: classes15.dex */
public final class PollsFieldsVotersDto implements Parcelable {
    public static final Parcelable.Creator<PollsFieldsVotersDto> CREATOR = new a();

    @pmi0("answer_id")
    private final Long answerId;

    @pmi0("answer_offset")
    private final String answerOffset;

    @pmi0("users")
    private final PollsVotersFieldsUsersDto users;

    /* compiled from: PollsFieldsVotersDto.kt */
    public static final class a implements Parcelable.Creator<PollsFieldsVotersDto> {
        @Override // android.os.Parcelable.Creator
        public final PollsFieldsVotersDto createFromParcel(Parcel parcel) {
            return new PollsFieldsVotersDto(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? PollsVotersFieldsUsersDto.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PollsFieldsVotersDto[] newArray(int i) {
            return new PollsFieldsVotersDto[i];
        }
    }

    public PollsFieldsVotersDto() {
        this(null, null, null, 7, null);
    }

    public final PollsVotersFieldsUsersDto d() {
        return this.users;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollsFieldsVotersDto)) {
            return false;
        }
        PollsFieldsVotersDto pollsFieldsVotersDto = (PollsFieldsVotersDto) obj;
        return epx.f(this.answerId, pollsFieldsVotersDto.answerId) && epx.f(this.users, pollsFieldsVotersDto.users) && epx.f(this.answerOffset, pollsFieldsVotersDto.answerOffset);
    }

    public final int hashCode() {
        Long l = this.answerId;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        PollsVotersFieldsUsersDto pollsVotersFieldsUsersDto = this.users;
        int hashCode2 = (hashCode + (pollsVotersFieldsUsersDto == null ? 0 : pollsVotersFieldsUsersDto.hashCode())) * 31;
        String str = this.answerOffset;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PollsFieldsVotersDto(answerId=");
        sb.append(this.answerId);
        sb.append(", users=");
        sb.append(this.users);
        sb.append(", answerOffset=");
        return ho8.a(sb, this.answerOffset, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.answerId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        PollsVotersFieldsUsersDto pollsVotersFieldsUsersDto = this.users;
        if (pollsVotersFieldsUsersDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pollsVotersFieldsUsersDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.answerOffset);
    }

    public PollsFieldsVotersDto(Long l, PollsVotersFieldsUsersDto pollsVotersFieldsUsersDto, String str) {
        this.answerId = l;
        this.users = pollsVotersFieldsUsersDto;
        this.answerOffset = str;
    }

    public /* synthetic */ PollsFieldsVotersDto(Long l, PollsVotersFieldsUsersDto pollsVotersFieldsUsersDto, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : pollsVotersFieldsUsersDto, (i & 4) != 0 ? null : str);
    }
}
