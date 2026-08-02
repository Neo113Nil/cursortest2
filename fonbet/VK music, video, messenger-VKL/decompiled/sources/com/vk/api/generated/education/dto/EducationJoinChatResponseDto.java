package com.vk.api.generated.education.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: EducationJoinChatResponseDto.kt */
/* loaded from: classes14.dex */
public final class EducationJoinChatResponseDto implements Parcelable {
    public static final Parcelable.Creator<EducationJoinChatResponseDto> CREATOR = new a();

    @pmi0("chat_id")
    private final int chatId;

    /* compiled from: EducationJoinChatResponseDto.kt */
    public static final class a implements Parcelable.Creator<EducationJoinChatResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final EducationJoinChatResponseDto createFromParcel(Parcel parcel) {
            return new EducationJoinChatResponseDto(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final EducationJoinChatResponseDto[] newArray(int i) {
            return new EducationJoinChatResponseDto[i];
        }
    }

    public EducationJoinChatResponseDto(int i) {
        this.chatId = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EducationJoinChatResponseDto) && this.chatId == ((EducationJoinChatResponseDto) obj).chatId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.chatId);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("EducationJoinChatResponseDto(chatId="), this.chatId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.chatId);
    }
}
