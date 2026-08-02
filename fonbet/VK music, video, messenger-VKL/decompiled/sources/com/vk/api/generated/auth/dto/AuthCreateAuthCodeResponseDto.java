package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.sdk.SharedKt;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AuthCreateAuthCodeResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthCreateAuthCodeResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthCreateAuthCodeResponseDto> CREATOR = new a();

    @pmi0("auth_hash")
    private final String authHash;

    @pmi0("auth_url")
    private final String authUrl;

    @pmi0(SharedKt.PARAM_EXPIRES_IN)
    private final Integer expiresIn;

    @pmi0("faq_url")
    private final String faqUrl;

    @pmi0("polling_delay")
    private final Integer pollingDelay;

    /* compiled from: AuthCreateAuthCodeResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthCreateAuthCodeResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthCreateAuthCodeResponseDto createFromParcel(Parcel parcel) {
            return new AuthCreateAuthCodeResponseDto(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthCreateAuthCodeResponseDto[] newArray(int i) {
            return new AuthCreateAuthCodeResponseDto[i];
        }
    }

    public AuthCreateAuthCodeResponseDto() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthCreateAuthCodeResponseDto)) {
            return false;
        }
        AuthCreateAuthCodeResponseDto authCreateAuthCodeResponseDto = (AuthCreateAuthCodeResponseDto) obj;
        return epx.f(this.authHash, authCreateAuthCodeResponseDto.authHash) && epx.f(this.authUrl, authCreateAuthCodeResponseDto.authUrl) && epx.f(this.expiresIn, authCreateAuthCodeResponseDto.expiresIn) && epx.f(this.pollingDelay, authCreateAuthCodeResponseDto.pollingDelay) && epx.f(this.faqUrl, authCreateAuthCodeResponseDto.faqUrl);
    }

    public final int hashCode() {
        String str = this.authHash;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.authUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.expiresIn;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.pollingDelay;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.faqUrl;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthCreateAuthCodeResponseDto(authHash=");
        sb.append(this.authHash);
        sb.append(", authUrl=");
        sb.append(this.authUrl);
        sb.append(", expiresIn=");
        sb.append(this.expiresIn);
        sb.append(", pollingDelay=");
        sb.append(this.pollingDelay);
        sb.append(", faqUrl=");
        return ho8.a(sb, this.faqUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.authHash);
        parcel.writeString(this.authUrl);
        Integer num = this.expiresIn;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.pollingDelay;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.faqUrl);
    }

    public AuthCreateAuthCodeResponseDto(String str, String str2, Integer num, Integer num2, String str3) {
        this.authHash = str;
        this.authUrl = str2;
        this.expiresIn = num;
        this.pollingDelay = num2;
        this.faqUrl = str3;
    }

    public /* synthetic */ AuthCreateAuthCodeResponseDto(String str, String str2, Integer num, Integer num2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : str3);
    }
}
