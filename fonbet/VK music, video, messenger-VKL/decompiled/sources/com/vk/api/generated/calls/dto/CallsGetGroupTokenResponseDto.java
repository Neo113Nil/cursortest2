package com.vk.api.generated.calls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: CallsGetGroupTokenResponseDto.kt */
/* loaded from: classes14.dex */
public final class CallsGetGroupTokenResponseDto implements Parcelable {
    public static final Parcelable.Creator<CallsGetGroupTokenResponseDto> CREATOR = new a();

    @pmi0("api_base_url")
    private final String apiBaseUrl;

    @pmi0("token")
    private final String token;

    /* compiled from: CallsGetGroupTokenResponseDto.kt */
    public static final class a implements Parcelable.Creator<CallsGetGroupTokenResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final CallsGetGroupTokenResponseDto createFromParcel(Parcel parcel) {
            return new CallsGetGroupTokenResponseDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CallsGetGroupTokenResponseDto[] newArray(int i) {
            return new CallsGetGroupTokenResponseDto[i];
        }
    }

    public CallsGetGroupTokenResponseDto(String str, String str2) {
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
        if (!(obj instanceof CallsGetGroupTokenResponseDto)) {
            return false;
        }
        CallsGetGroupTokenResponseDto callsGetGroupTokenResponseDto = (CallsGetGroupTokenResponseDto) obj;
        return epx.f(this.token, callsGetGroupTokenResponseDto.token) && epx.f(this.apiBaseUrl, callsGetGroupTokenResponseDto.apiBaseUrl);
    }

    public final int hashCode() {
        return this.apiBaseUrl.hashCode() + (this.token.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallsGetGroupTokenResponseDto(token=");
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
