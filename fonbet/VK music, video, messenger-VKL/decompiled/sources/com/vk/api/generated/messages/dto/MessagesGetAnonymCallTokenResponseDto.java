package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MessagesGetAnonymCallTokenResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetAnonymCallTokenResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGetAnonymCallTokenResponseDto> CREATOR = new a();

    @pmi0("api_base_url")
    private final String apiBaseUrl;

    @pmi0("id")
    private final UserId id;

    @pmi0("secret")
    private final String secret;

    @pmi0("token")
    private final String token;

    /* compiled from: MessagesGetAnonymCallTokenResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetAnonymCallTokenResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetAnonymCallTokenResponseDto createFromParcel(Parcel parcel) {
            return new MessagesGetAnonymCallTokenResponseDto(parcel.readString(), parcel.readString(), (UserId) parcel.readParcelable(MessagesGetAnonymCallTokenResponseDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetAnonymCallTokenResponseDto[] newArray(int i) {
            return new MessagesGetAnonymCallTokenResponseDto[i];
        }
    }

    public MessagesGetAnonymCallTokenResponseDto(String str, String str2, UserId userId, String str3) {
        this.token = str;
        this.apiBaseUrl = str2;
        this.id = userId;
        this.secret = str3;
    }

    public final String d() {
        return this.apiBaseUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final UserId e() {
        return this.id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetAnonymCallTokenResponseDto)) {
            return false;
        }
        MessagesGetAnonymCallTokenResponseDto messagesGetAnonymCallTokenResponseDto = (MessagesGetAnonymCallTokenResponseDto) obj;
        return epx.f(this.token, messagesGetAnonymCallTokenResponseDto.token) && epx.f(this.apiBaseUrl, messagesGetAnonymCallTokenResponseDto.apiBaseUrl) && epx.f(this.id, messagesGetAnonymCallTokenResponseDto.id) && epx.f(this.secret, messagesGetAnonymCallTokenResponseDto.secret);
    }

    public final String f() {
        return this.secret;
    }

    public final String g() {
        return this.token;
    }

    public final int hashCode() {
        int a2 = bh10.a(urd0.a(this.token.hashCode() * 31, 31, this.apiBaseUrl), 31, this.id.b);
        String str = this.secret;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesGetAnonymCallTokenResponseDto(token=");
        sb.append(this.token);
        sb.append(", apiBaseUrl=");
        sb.append(this.apiBaseUrl);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", secret=");
        return ho8.a(sb, this.secret, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.token);
        parcel.writeString(this.apiBaseUrl);
        parcel.writeParcelable(this.id, i);
        parcel.writeString(this.secret);
    }

    public /* synthetic */ MessagesGetAnonymCallTokenResponseDto(String str, String str2, UserId userId, String str3, int i, zcl zclVar) {
        this(str, str2, userId, (i & 8) != 0 ? null : str3);
    }
}
