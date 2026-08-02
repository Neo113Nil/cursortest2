package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MessagesConversationBarCardInfoDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationBarCardInfoDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConversationBarCardInfoDto> CREATOR = new a();

    @pmi0("text")
    private final String text;

    /* compiled from: MessagesConversationBarCardInfoDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationBarCardInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationBarCardInfoDto createFromParcel(Parcel parcel) {
            return new MessagesConversationBarCardInfoDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationBarCardInfoDto[] newArray(int i) {
            return new MessagesConversationBarCardInfoDto[i];
        }
    }

    public MessagesConversationBarCardInfoDto(String str) {
        this.text = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MessagesConversationBarCardInfoDto) && epx.f(this.text, ((MessagesConversationBarCardInfoDto) obj).text);
    }

    public final int hashCode() {
        return this.text.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("MessagesConversationBarCardInfoDto(text="), this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
    }
}
