package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AuthGetAuthDataAppQrCodeAuthDto.kt */
/* loaded from: classes14.dex */
public final class AuthGetAuthDataAppQrCodeAuthDto implements Parcelable {
    public static final Parcelable.Creator<AuthGetAuthDataAppQrCodeAuthDto> CREATOR = new a();

    @pmi0("enabled")
    private final boolean enabled;

    @pmi0("guide_url")
    private final String guideUrl;

    /* compiled from: AuthGetAuthDataAppQrCodeAuthDto.kt */
    public static final class a implements Parcelable.Creator<AuthGetAuthDataAppQrCodeAuthDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthDataAppQrCodeAuthDto createFromParcel(Parcel parcel) {
            return new AuthGetAuthDataAppQrCodeAuthDto(parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthDataAppQrCodeAuthDto[] newArray(int i) {
            return new AuthGetAuthDataAppQrCodeAuthDto[i];
        }
    }

    public AuthGetAuthDataAppQrCodeAuthDto(boolean z, String str) {
        this.enabled = z;
        this.guideUrl = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthGetAuthDataAppQrCodeAuthDto)) {
            return false;
        }
        AuthGetAuthDataAppQrCodeAuthDto authGetAuthDataAppQrCodeAuthDto = (AuthGetAuthDataAppQrCodeAuthDto) obj;
        return this.enabled == authGetAuthDataAppQrCodeAuthDto.enabled && epx.f(this.guideUrl, authGetAuthDataAppQrCodeAuthDto.guideUrl);
    }

    public final int hashCode() {
        return this.guideUrl.hashCode() + (Boolean.hashCode(this.enabled) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthGetAuthDataAppQrCodeAuthDto(enabled=");
        sb.append(this.enabled);
        sb.append(", guideUrl=");
        return ho8.a(sb, this.guideUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.enabled ? 1 : 0);
        parcel.writeString(this.guideUrl);
    }
}
