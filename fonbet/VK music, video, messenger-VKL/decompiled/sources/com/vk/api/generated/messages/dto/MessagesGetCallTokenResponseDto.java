package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MessagesGetCallTokenResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetCallTokenResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGetCallTokenResponseDto> CREATOR = new a();

    @pmi0("api_base_url")
    private final String apiBaseUrl;

    @pmi0("token")
    private final String token;

    /* compiled from: MessagesGetCallTokenResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetCallTokenResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetCallTokenResponseDto createFromParcel(Parcel parcel) {
            return new MessagesGetCallTokenResponseDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetCallTokenResponseDto[] newArray(int i) {
            return new MessagesGetCallTokenResponseDto[i];
        }
    }

    public MessagesGetCallTokenResponseDto(String str, String str2) {
        this.token = str;
        this.apiBaseUrl = str2;
    }

    public final String d() {
        return this.apiBaseUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.token;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetCallTokenResponseDto)) {
            return false;
        }
        MessagesGetCallTokenResponseDto messagesGetCallTokenResponseDto = (MessagesGetCallTokenResponseDto) obj;
        return epx.f(this.token, messagesGetCallTokenResponseDto.token) && epx.f(this.apiBaseUrl, messagesGetCallTokenResponseDto.apiBaseUrl);
    }

    public final int hashCode() {
        return this.apiBaseUrl.hashCode() + (this.token.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesGetCallTokenResponseDto(token=");
        sb.append(this.token);
        sb.append(", apiBaseUrl=");
        return ho8.a(sb, this.apiBaseUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.token);
        parcel.writeString(this.apiBaseUrl);
    }
}
