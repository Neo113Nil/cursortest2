package com.vk.api.generated.questions.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: QuestionsDeleteFromAuthorResponseDto.kt */
/* loaded from: classes15.dex */
public final class QuestionsDeleteFromAuthorResponseDto implements Parcelable {
    public static final Parcelable.Creator<QuestionsDeleteFromAuthorResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    /* compiled from: QuestionsDeleteFromAuthorResponseDto.kt */
    public static final class a implements Parcelable.Creator<QuestionsDeleteFromAuthorResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final QuestionsDeleteFromAuthorResponseDto createFromParcel(Parcel parcel) {
            return new QuestionsDeleteFromAuthorResponseDto(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final QuestionsDeleteFromAuthorResponseDto[] newArray(int i) {
            return new QuestionsDeleteFromAuthorResponseDto[i];
        }
    }

    public QuestionsDeleteFromAuthorResponseDto(int i) {
        this.count = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof QuestionsDeleteFromAuthorResponseDto) && this.count == ((QuestionsDeleteFromAuthorResponseDto) obj).count;
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        return Integer.hashCode(this.count);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("QuestionsDeleteFromAuthorResponseDto(count="), this.count, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
    }
}
