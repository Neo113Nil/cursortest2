package com.vk.newsfeed.posting.impl.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public final class PollAnswerDto implements Parcelable {
    public static final Parcelable.Creator<PollAnswerDto> CREATOR = new a();
    public final long b;
    public final String c;

    /* compiled from: PostingViewState.kt */
    public static final class a implements Parcelable.Creator<PollAnswerDto> {
        @Override // android.os.Parcelable.Creator
        public final PollAnswerDto createFromParcel(Parcel parcel) {
            return new PollAnswerDto(parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PollAnswerDto[] newArray(int i) {
            return new PollAnswerDto[i];
        }
    }

    public PollAnswerDto(long j, String str) {
        this.b = j;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollAnswerDto)) {
            return false;
        }
        PollAnswerDto pollAnswerDto = (PollAnswerDto) obj;
        return this.b == pollAnswerDto.b && epx.f(this.c, pollAnswerDto.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PollAnswerDto(id=");
        sb.append(this.b);
        sb.append(", text=");
        return ho8.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeString(this.c);
    }
}
