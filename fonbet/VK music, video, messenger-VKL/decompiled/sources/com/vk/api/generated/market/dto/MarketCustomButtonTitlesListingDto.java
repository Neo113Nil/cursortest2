package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketCustomButtonTitlesListingDto.kt */
/* loaded from: classes15.dex */
public final class MarketCustomButtonTitlesListingDto implements Parcelable {
    public static final Parcelable.Creator<MarketCustomButtonTitlesListingDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("is_disabled")
    private final Boolean isDisabled;

    @pmi0("name")
    private final String name;

    /* compiled from: MarketCustomButtonTitlesListingDto.kt */
    public static final class a implements Parcelable.Creator<MarketCustomButtonTitlesListingDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCustomButtonTitlesListingDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarketCustomButtonTitlesListingDto(readString, readString2, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCustomButtonTitlesListingDto[] newArray(int i) {
            return new MarketCustomButtonTitlesListingDto[i];
        }
    }

    public MarketCustomButtonTitlesListingDto(String str, String str2, Boolean bool) {
        this.id = str;
        this.name = str2;
        this.isDisabled = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCustomButtonTitlesListingDto)) {
            return false;
        }
        MarketCustomButtonTitlesListingDto marketCustomButtonTitlesListingDto = (MarketCustomButtonTitlesListingDto) obj;
        return epx.f(this.id, marketCustomButtonTitlesListingDto.id) && epx.f(this.name, marketCustomButtonTitlesListingDto.name) && epx.f(this.isDisabled, marketCustomButtonTitlesListingDto.isDisabled);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.id.hashCode() * 31, 31, this.name);
        Boolean bool = this.isDisabled;
        return a2 + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCustomButtonTitlesListingDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", isDisabled=");
        return tn.a(sb, this.isDisabled, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        Boolean bool = this.isDisabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ MarketCustomButtonTitlesListingDto(String str, String str2, Boolean bool, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : bool);
    }
}
