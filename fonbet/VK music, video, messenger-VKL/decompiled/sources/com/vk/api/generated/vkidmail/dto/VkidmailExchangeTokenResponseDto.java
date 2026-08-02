package com.vk.api.generated.vkidmail.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VkidmailExchangeTokenResponseDto.kt */
/* loaded from: classes15.dex */
public final class VkidmailExchangeTokenResponseDto implements Parcelable {
    public static final Parcelable.Creator<VkidmailExchangeTokenResponseDto> CREATOR = new a();

    @pmi0("token")
    private final String token;

    /* compiled from: VkidmailExchangeTokenResponseDto.kt */
    public static final class a implements Parcelable.Creator<VkidmailExchangeTokenResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VkidmailExchangeTokenResponseDto createFromParcel(Parcel parcel) {
            return new VkidmailExchangeTokenResponseDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkidmailExchangeTokenResponseDto[] newArray(int i) {
            return new VkidmailExchangeTokenResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VkidmailExchangeTokenResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VkidmailExchangeTokenResponseDto) && epx.f(this.token, ((VkidmailExchangeTokenResponseDto) obj).token);
    }

    public final int hashCode() {
        String str = this.token;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("VkidmailExchangeTokenResponseDto(token="), this.token, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.token);
    }

    public VkidmailExchangeTokenResponseDto(String str) {
        this.token = str;
    }

    public /* synthetic */ VkidmailExchangeTokenResponseDto(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
