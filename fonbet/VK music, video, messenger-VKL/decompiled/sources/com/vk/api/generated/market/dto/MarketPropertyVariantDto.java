package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketPropertyVariantDto.kt */
/* loaded from: classes15.dex */
public final class MarketPropertyVariantDto implements Parcelable {
    public static final Parcelable.Creator<MarketPropertyVariantDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("title")
    private final String title;

    @pmi0("value")
    private final String value;

    /* compiled from: MarketPropertyVariantDto.kt */
    public static final class a implements Parcelable.Creator<MarketPropertyVariantDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketPropertyVariantDto createFromParcel(Parcel parcel) {
            return new MarketPropertyVariantDto(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketPropertyVariantDto[] newArray(int i) {
            return new MarketPropertyVariantDto[i];
        }
    }

    public MarketPropertyVariantDto(int i, String str, String str2) {
        this.id = i;
        this.title = str;
        this.value = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketPropertyVariantDto)) {
            return false;
        }
        MarketPropertyVariantDto marketPropertyVariantDto = (MarketPropertyVariantDto) obj;
        return this.id == marketPropertyVariantDto.id && epx.f(this.title, marketPropertyVariantDto.title) && epx.f(this.value, marketPropertyVariantDto.value);
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.id) * 31, 31, this.title);
        String str = this.value;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketPropertyVariantDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", value=");
        return ho8.a(sb, this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.value);
    }

    public /* synthetic */ MarketPropertyVariantDto(int i, String str, String str2, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : str2);
    }
}
