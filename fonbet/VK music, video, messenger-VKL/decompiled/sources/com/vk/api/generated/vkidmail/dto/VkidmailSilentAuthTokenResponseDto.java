package com.vk.api.generated.vkidmail.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: VkidmailSilentAuthTokenResponseDto.kt */
/* loaded from: classes15.dex */
public final class VkidmailSilentAuthTokenResponseDto implements Parcelable {
    public static final Parcelable.Creator<VkidmailSilentAuthTokenResponseDto> CREATOR = new a();

    @pmi0("silent_token")
    private final String silentToken;

    @pmi0("uuid")
    private final String uuid;

    /* compiled from: VkidmailSilentAuthTokenResponseDto.kt */
    public static final class a implements Parcelable.Creator<VkidmailSilentAuthTokenResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VkidmailSilentAuthTokenResponseDto createFromParcel(Parcel parcel) {
            return new VkidmailSilentAuthTokenResponseDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkidmailSilentAuthTokenResponseDto[] newArray(int i) {
            return new VkidmailSilentAuthTokenResponseDto[i];
        }
    }

    public VkidmailSilentAuthTokenResponseDto(String str, String str2) {
        this.silentToken = str;
        this.uuid = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkidmailSilentAuthTokenResponseDto)) {
            return false;
        }
        VkidmailSilentAuthTokenResponseDto vkidmailSilentAuthTokenResponseDto = (VkidmailSilentAuthTokenResponseDto) obj;
        return epx.f(this.silentToken, vkidmailSilentAuthTokenResponseDto.silentToken) && epx.f(this.uuid, vkidmailSilentAuthTokenResponseDto.uuid);
    }

    public final int hashCode() {
        return this.uuid.hashCode() + (this.silentToken.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkidmailSilentAuthTokenResponseDto(silentToken=");
        sb.append(this.silentToken);
        sb.append(", uuid=");
        return ho8.a(sb, this.uuid, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.silentToken);
        parcel.writeString(this.uuid);
    }
}
