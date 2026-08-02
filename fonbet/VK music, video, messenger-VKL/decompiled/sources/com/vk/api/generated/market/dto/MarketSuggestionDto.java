package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketSuggestionDto.kt */
/* loaded from: classes15.dex */
public final class MarketSuggestionDto implements Parcelable {
    public static final Parcelable.Creator<MarketSuggestionDto> CREATOR = new a();

    @pmi0("broad_address")
    private final String broadAddress;

    @pmi0("is_city")
    private final boolean isCity;

    @pmi0("narrow_address")
    private final String narrowAddress;

    @pmi0("reference")
    private final String reference;

    @pmi0("type")
    private final String type;

    /* compiled from: MarketSuggestionDto.kt */
    public static final class a implements Parcelable.Creator<MarketSuggestionDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSuggestionDto createFromParcel(Parcel parcel) {
            return new MarketSuggestionDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSuggestionDto[] newArray(int i) {
            return new MarketSuggestionDto[i];
        }
    }

    public MarketSuggestionDto(String str, String str2, String str3, boolean z, String str4) {
        this.narrowAddress = str;
        this.broadAddress = str2;
        this.reference = str3;
        this.isCity = z;
        this.type = str4;
    }

    public final String d() {
        return this.broadAddress;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.narrowAddress;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketSuggestionDto)) {
            return false;
        }
        MarketSuggestionDto marketSuggestionDto = (MarketSuggestionDto) obj;
        return epx.f(this.narrowAddress, marketSuggestionDto.narrowAddress) && epx.f(this.broadAddress, marketSuggestionDto.broadAddress) && epx.f(this.reference, marketSuggestionDto.reference) && this.isCity == marketSuggestionDto.isCity && epx.f(this.type, marketSuggestionDto.type);
    }

    public final String f() {
        return this.reference;
    }

    public final boolean g() {
        return this.isCity;
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(urd0.a(this.narrowAddress.hashCode() * 31, 31, this.broadAddress), 31, this.reference), 31, this.isCity);
        String str = this.type;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketSuggestionDto(narrowAddress=");
        sb.append(this.narrowAddress);
        sb.append(", broadAddress=");
        sb.append(this.broadAddress);
        sb.append(", reference=");
        sb.append(this.reference);
        sb.append(", isCity=");
        sb.append(this.isCity);
        sb.append(", type=");
        return ho8.a(sb, this.type, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.narrowAddress);
        parcel.writeString(this.broadAddress);
        parcel.writeString(this.reference);
        parcel.writeInt(this.isCity ? 1 : 0);
        parcel.writeString(this.type);
    }

    public /* synthetic */ MarketSuggestionDto(String str, String str2, String str3, boolean z, String str4, int i, zcl zclVar) {
        this(str, str2, str3, z, (i & 16) != 0 ? null : str4);
    }
}
