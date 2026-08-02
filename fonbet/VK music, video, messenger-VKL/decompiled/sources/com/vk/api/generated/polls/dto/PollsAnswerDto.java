package com.vk.api.generated.polls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: PollsAnswerDto.kt */
/* loaded from: classes15.dex */
public final class PollsAnswerDto implements Parcelable {
    public static final Parcelable.Creator<PollsAnswerDto> CREATOR = new a();

    @pmi0("answer")
    private final PollsAnswerDto answer;

    @pmi0("id")
    private final long id;

    @pmi0("rate")
    private final float rate;

    @pmi0("text")
    private final String text;

    @pmi0("users")
    private final PollsVotersUsersDto users;

    @pmi0("votes")
    private final int votes;

    /* compiled from: PollsAnswerDto.kt */
    public static final class a implements Parcelable.Creator<PollsAnswerDto> {
        @Override // android.os.Parcelable.Creator
        public final PollsAnswerDto createFromParcel(Parcel parcel) {
            return new PollsAnswerDto(parcel.readLong(), parcel.readFloat(), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : PollsAnswerDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PollsVotersUsersDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final PollsAnswerDto[] newArray(int i) {
            return new PollsAnswerDto[i];
        }
    }

    public PollsAnswerDto(long j, float f, String str, int i, PollsAnswerDto pollsAnswerDto, PollsVotersUsersDto pollsVotersUsersDto) {
        this.id = j;
        this.rate = f;
        this.text = str;
        this.votes = i;
        this.answer = pollsAnswerDto;
        this.users = pollsVotersUsersDto;
    }

    public final long d() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float e() {
        return this.rate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollsAnswerDto)) {
            return false;
        }
        PollsAnswerDto pollsAnswerDto = (PollsAnswerDto) obj;
        return this.id == pollsAnswerDto.id && Float.compare(this.rate, pollsAnswerDto.rate) == 0 && epx.f(this.text, pollsAnswerDto.text) && this.votes == pollsAnswerDto.votes && epx.f(this.answer, pollsAnswerDto.answer) && epx.f(this.users, pollsAnswerDto.users);
    }

    public final String f() {
        return this.text;
    }

    public final PollsVotersUsersDto g() {
        return this.users;
    }

    public final int hashCode() {
        int a2 = shy.a(this.votes, urd0.a(b.a(this.rate, Long.hashCode(this.id) * 31, 31), 31, this.text), 31);
        PollsAnswerDto pollsAnswerDto = this.answer;
        int hashCode = (a2 + (pollsAnswerDto == null ? 0 : pollsAnswerDto.hashCode())) * 31;
        PollsVotersUsersDto pollsVotersUsersDto = this.users;
        return hashCode + (pollsVotersUsersDto != null ? pollsVotersUsersDto.hashCode() : 0);
    }

    public final int i() {
        return this.votes;
    }

    public final String toString() {
        return "PollsAnswerDto(id=" + this.id + ", rate=" + this.rate + ", text=" + this.text + ", votes=" + this.votes + ", answer=" + this.answer + ", users=" + this.users + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.id);
        parcel.writeFloat(this.rate);
        parcel.writeString(this.text);
        parcel.writeInt(this.votes);
        PollsAnswerDto pollsAnswerDto = this.answer;
        if (pollsAnswerDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pollsAnswerDto.writeToParcel(parcel, i);
        }
        PollsVotersUsersDto pollsVotersUsersDto = this.users;
        if (pollsVotersUsersDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pollsVotersUsersDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ PollsAnswerDto(long j, float f, String str, int i, PollsAnswerDto pollsAnswerDto, PollsVotersUsersDto pollsVotersUsersDto, int i2, zcl zclVar) {
        this(j, f, str, i, (i2 & 16) != 0 ? null : pollsAnswerDto, (i2 & 32) != 0 ? null : pollsVotersUsersDto);
    }
}
