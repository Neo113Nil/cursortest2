package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketFormDropdownOptionDto.kt */
/* loaded from: classes15.dex */
public final class MarketFormDropdownOptionDto implements Parcelable {
    public static final Parcelable.Creator<MarketFormDropdownOptionDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketFormDropdownOptionDto.kt */
    public static final class a implements Parcelable.Creator<MarketFormDropdownOptionDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketFormDropdownOptionDto createFromParcel(Parcel parcel) {
            return new MarketFormDropdownOptionDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketFormDropdownOptionDto[] newArray(int i) {
            return new MarketFormDropdownOptionDto[i];
        }
    }

    public MarketFormDropdownOptionDto(String str, String str2, String str3) {
        this.id = str;
        this.title = str2;
        this.subtitle = str3;
    }

    public final String d() {
        return this.subtitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketFormDropdownOptionDto)) {
            return false;
        }
        MarketFormDropdownOptionDto marketFormDropdownOptionDto = (MarketFormDropdownOptionDto) obj;
        return epx.f(this.id, marketFormDropdownOptionDto.id) && epx.f(this.title, marketFormDropdownOptionDto.title) && epx.f(this.subtitle, marketFormDropdownOptionDto.subtitle);
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.id.hashCode() * 31, 31, this.title);
        String str = this.subtitle;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketFormDropdownOptionDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        return ho8.a(sb, this.subtitle, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
    }

    public /* synthetic */ MarketFormDropdownOptionDto(String str, String str2, String str3, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
