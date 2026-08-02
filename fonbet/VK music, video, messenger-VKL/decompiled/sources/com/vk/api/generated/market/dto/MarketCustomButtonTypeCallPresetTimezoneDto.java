package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketCustomButtonTypeCallPresetTimezoneDto.kt */
/* loaded from: classes15.dex */
public final class MarketCustomButtonTypeCallPresetTimezoneDto implements Parcelable {
    public static final Parcelable.Creator<MarketCustomButtonTypeCallPresetTimezoneDto> CREATOR = new a();

    @pmi0("name")
    private final String name;

    @pmi0(AnalyticsBaseParamsConstantsKt.TIMEZONE)
    private final String timezone;

    /* compiled from: MarketCustomButtonTypeCallPresetTimezoneDto.kt */
    public static final class a implements Parcelable.Creator<MarketCustomButtonTypeCallPresetTimezoneDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCustomButtonTypeCallPresetTimezoneDto createFromParcel(Parcel parcel) {
            return new MarketCustomButtonTypeCallPresetTimezoneDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCustomButtonTypeCallPresetTimezoneDto[] newArray(int i) {
            return new MarketCustomButtonTypeCallPresetTimezoneDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketCustomButtonTypeCallPresetTimezoneDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCustomButtonTypeCallPresetTimezoneDto)) {
            return false;
        }
        MarketCustomButtonTypeCallPresetTimezoneDto marketCustomButtonTypeCallPresetTimezoneDto = (MarketCustomButtonTypeCallPresetTimezoneDto) obj;
        return epx.f(this.timezone, marketCustomButtonTypeCallPresetTimezoneDto.timezone) && epx.f(this.name, marketCustomButtonTypeCallPresetTimezoneDto.name);
    }

    public final int hashCode() {
        String str = this.timezone;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCustomButtonTypeCallPresetTimezoneDto(timezone=");
        sb.append(this.timezone);
        sb.append(", name=");
        return ho8.a(sb, this.name, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.timezone);
        parcel.writeString(this.name);
    }

    public MarketCustomButtonTypeCallPresetTimezoneDto(String str, String str2) {
        this.timezone = str;
        this.name = str2;
    }

    public /* synthetic */ MarketCustomButtonTypeCallPresetTimezoneDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
