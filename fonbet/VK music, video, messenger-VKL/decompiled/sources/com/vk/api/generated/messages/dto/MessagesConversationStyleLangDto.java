package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MessagesConversationStyleLangDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationStyleLangDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConversationStyleLangDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("value")
    private final String value;

    /* compiled from: MessagesConversationStyleLangDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationStyleLangDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationStyleLangDto createFromParcel(Parcel parcel) {
            return new MessagesConversationStyleLangDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationStyleLangDto[] newArray(int i) {
            return new MessagesConversationStyleLangDto[i];
        }
    }

    public MessagesConversationStyleLangDto(String str, String str2) {
        this.id = str;
        this.value = str2;
    }

    public final String d() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationStyleLangDto)) {
            return false;
        }
        MessagesConversationStyleLangDto messagesConversationStyleLangDto = (MessagesConversationStyleLangDto) obj;
        return epx.f(this.id, messagesConversationStyleLangDto.id) && epx.f(this.value, messagesConversationStyleLangDto.value);
    }

    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        return this.value.hashCode() + (this.id.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesConversationStyleLangDto(id=");
        sb.append(this.id);
        sb.append(", value=");
        return ho8.a(sb, this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.value);
    }
}
