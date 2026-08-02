package com.vk.api.generated.polls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: PollsGetAnswersLimitResponseDto.kt */
/* loaded from: classes15.dex */
public final class PollsGetAnswersLimitResponseDto implements Parcelable {
    public static final Parcelable.Creator<PollsGetAnswersLimitResponseDto> CREATOR = new a();

    @pmi0("answers_limit")
    private final int answersLimit;

    /* compiled from: PollsGetAnswersLimitResponseDto.kt */
    public static final class a implements Parcelable.Creator<PollsGetAnswersLimitResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final PollsGetAnswersLimitResponseDto createFromParcel(Parcel parcel) {
            return new PollsGetAnswersLimitResponseDto(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final PollsGetAnswersLimitResponseDto[] newArray(int i) {
            return new PollsGetAnswersLimitResponseDto[i];
        }
    }

    public PollsGetAnswersLimitResponseDto(int i) {
        this.answersLimit = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PollsGetAnswersLimitResponseDto) && this.answersLimit == ((PollsGetAnswersLimitResponseDto) obj).answersLimit;
    }

    public final int hashCode() {
        return Integer.hashCode(this.answersLimit);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("PollsGetAnswersLimitResponseDto(answersLimit="), this.answersLimit, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.answersLimit);
    }
}
