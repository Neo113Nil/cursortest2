package com.vk.api.generated.vkpay.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VkpayPaymentsNavigationInfoDto.kt */
/* loaded from: classes15.dex */
public final class VkpayPaymentsNavigationInfoDto implements Parcelable {
    public static final Parcelable.Creator<VkpayPaymentsNavigationInfoDto> CREATOR = new a();

    @pmi0("card_digits")
    private final String cardDigits;

    @pmi0("is_enabled")
    private final boolean isEnabled;

    @pmi0("type")
    private final String type;

    /* compiled from: VkpayPaymentsNavigationInfoDto.kt */
    public static final class a implements Parcelable.Creator<VkpayPaymentsNavigationInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final VkpayPaymentsNavigationInfoDto createFromParcel(Parcel parcel) {
            return new VkpayPaymentsNavigationInfoDto(parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkpayPaymentsNavigationInfoDto[] newArray(int i) {
            return new VkpayPaymentsNavigationInfoDto[i];
        }
    }

    public VkpayPaymentsNavigationInfoDto(boolean z, String str, String str2) {
        this.isEnabled = z;
        this.cardDigits = str;
        this.type = str2;
    }

    public final String d() {
        return this.cardDigits;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.isEnabled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkpayPaymentsNavigationInfoDto)) {
            return false;
        }
        VkpayPaymentsNavigationInfoDto vkpayPaymentsNavigationInfoDto = (VkpayPaymentsNavigationInfoDto) obj;
        return this.isEnabled == vkpayPaymentsNavigationInfoDto.isEnabled && epx.f(this.cardDigits, vkpayPaymentsNavigationInfoDto.cardDigits) && epx.f(this.type, vkpayPaymentsNavigationInfoDto.type);
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isEnabled) * 31;
        String str = this.cardDigits;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkpayPaymentsNavigationInfoDto(isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", cardDigits=");
        sb.append(this.cardDigits);
        sb.append(", type=");
        return ho8.a(sb, this.type, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isEnabled ? 1 : 0);
        parcel.writeString(this.cardDigits);
        parcel.writeString(this.type);
    }

    public /* synthetic */ VkpayPaymentsNavigationInfoDto(boolean z, String str, String str2, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
