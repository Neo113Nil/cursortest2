package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketCheckoutSettingsPaymentInfoDto.kt */
/* loaded from: classes15.dex */
public final class MarketCheckoutSettingsPaymentInfoDto implements Parcelable {
    public static final Parcelable.Creator<MarketCheckoutSettingsPaymentInfoDto> CREATOR = new a();

    @pmi0("title")
    private final String title;

    @pmi0("tooltip")
    private final MarketCheckoutSettingsPriceOptionTooltipDto tooltip;

    @pmi0("type")
    private final String type;

    /* compiled from: MarketCheckoutSettingsPaymentInfoDto.kt */
    public static final class a implements Parcelable.Creator<MarketCheckoutSettingsPaymentInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCheckoutSettingsPaymentInfoDto createFromParcel(Parcel parcel) {
            return new MarketCheckoutSettingsPaymentInfoDto(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : MarketCheckoutSettingsPriceOptionTooltipDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCheckoutSettingsPaymentInfoDto[] newArray(int i) {
            return new MarketCheckoutSettingsPaymentInfoDto[i];
        }
    }

    public MarketCheckoutSettingsPaymentInfoDto(String str, String str2, MarketCheckoutSettingsPriceOptionTooltipDto marketCheckoutSettingsPriceOptionTooltipDto) {
        this.type = str;
        this.title = str2;
        this.tooltip = marketCheckoutSettingsPriceOptionTooltipDto;
    }

    public final MarketCheckoutSettingsPriceOptionTooltipDto d() {
        return this.tooltip;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCheckoutSettingsPaymentInfoDto)) {
            return false;
        }
        MarketCheckoutSettingsPaymentInfoDto marketCheckoutSettingsPaymentInfoDto = (MarketCheckoutSettingsPaymentInfoDto) obj;
        return epx.f(this.type, marketCheckoutSettingsPaymentInfoDto.type) && epx.f(this.title, marketCheckoutSettingsPaymentInfoDto.title) && epx.f(this.tooltip, marketCheckoutSettingsPaymentInfoDto.tooltip);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.type.hashCode() * 31, 31, this.title);
        MarketCheckoutSettingsPriceOptionTooltipDto marketCheckoutSettingsPriceOptionTooltipDto = this.tooltip;
        return a2 + (marketCheckoutSettingsPriceOptionTooltipDto == null ? 0 : marketCheckoutSettingsPriceOptionTooltipDto.hashCode());
    }

    public final String toString() {
        return "MarketCheckoutSettingsPaymentInfoDto(type=" + this.type + ", title=" + this.title + ", tooltip=" + this.tooltip + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeString(this.title);
        MarketCheckoutSettingsPriceOptionTooltipDto marketCheckoutSettingsPriceOptionTooltipDto = this.tooltip;
        if (marketCheckoutSettingsPriceOptionTooltipDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketCheckoutSettingsPriceOptionTooltipDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarketCheckoutSettingsPaymentInfoDto(String str, String str2, MarketCheckoutSettingsPriceOptionTooltipDto marketCheckoutSettingsPriceOptionTooltipDto, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : marketCheckoutSettingsPriceOptionTooltipDto);
    }
}
