package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketOrderRecipientDto.kt */
/* loaded from: classes15.dex */
public final class MarketOrderRecipientDto implements Parcelable {
    public static final Parcelable.Creator<MarketOrderRecipientDto> CREATOR = new a();

    @pmi0("display_text")
    private final String displayText;

    @pmi0("name")
    private final String name;

    @pmi0("phone")
    private final String phone;

    /* compiled from: MarketOrderRecipientDto.kt */
    public static final class a implements Parcelable.Creator<MarketOrderRecipientDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketOrderRecipientDto createFromParcel(Parcel parcel) {
            return new MarketOrderRecipientDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketOrderRecipientDto[] newArray(int i) {
            return new MarketOrderRecipientDto[i];
        }
    }

    public MarketOrderRecipientDto() {
        this(null, null, null, 7, null);
    }

    public final String d() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.phone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketOrderRecipientDto)) {
            return false;
        }
        MarketOrderRecipientDto marketOrderRecipientDto = (MarketOrderRecipientDto) obj;
        return epx.f(this.name, marketOrderRecipientDto.name) && epx.f(this.phone, marketOrderRecipientDto.phone) && epx.f(this.displayText, marketOrderRecipientDto.displayText);
    }

    public final int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.phone;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.displayText;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketOrderRecipientDto(name=");
        sb.append(this.name);
        sb.append(", phone=");
        sb.append(this.phone);
        sb.append(", displayText=");
        return ho8.a(sb, this.displayText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.phone);
        parcel.writeString(this.displayText);
    }

    public MarketOrderRecipientDto(String str, String str2, String str3) {
        this.name = str;
        this.phone = str2;
        this.displayText = str3;
    }

    public /* synthetic */ MarketOrderRecipientDto(String str, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
