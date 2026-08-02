package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AuthCheckBindExtOAuthResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthCheckBindExtOAuthResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthCheckBindExtOAuthResponseDto> CREATOR = new a();

    @pmi0("oauth_providers")
    private final List<String> oauthProviders;

    @pmi0("silent_token")
    private final String silentToken;

    @pmi0("uuid")
    private final String uuid;

    /* compiled from: AuthCheckBindExtOAuthResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthCheckBindExtOAuthResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthCheckBindExtOAuthResponseDto createFromParcel(Parcel parcel) {
            return new AuthCheckBindExtOAuthResponseDto(parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthCheckBindExtOAuthResponseDto[] newArray(int i) {
            return new AuthCheckBindExtOAuthResponseDto[i];
        }
    }

    public AuthCheckBindExtOAuthResponseDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthCheckBindExtOAuthResponseDto)) {
            return false;
        }
        AuthCheckBindExtOAuthResponseDto authCheckBindExtOAuthResponseDto = (AuthCheckBindExtOAuthResponseDto) obj;
        return epx.f(this.silentToken, authCheckBindExtOAuthResponseDto.silentToken) && epx.f(this.uuid, authCheckBindExtOAuthResponseDto.uuid) && epx.f(this.oauthProviders, authCheckBindExtOAuthResponseDto.oauthProviders);
    }

    public final int hashCode() {
        String str = this.silentToken;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.uuid;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.oauthProviders;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthCheckBindExtOAuthResponseDto(silentToken=");
        sb.append(this.silentToken);
        sb.append(", uuid=");
        sb.append(this.uuid);
        sb.append(", oauthProviders=");
        return ms9.a(')', sb, this.oauthProviders);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.silentToken);
        parcel.writeString(this.uuid);
        parcel.writeStringList(this.oauthProviders);
    }

    public AuthCheckBindExtOAuthResponseDto(String str, String str2, List<String> list) {
        this.silentToken = str;
        this.uuid = str2;
        this.oauthProviders = list;
    }

    public /* synthetic */ AuthCheckBindExtOAuthResponseDto(String str, String str2, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }
}
