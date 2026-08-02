package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketCheckoutSettingsPriceOptionTooltipDto.kt */
/* loaded from: classes15.dex */
public final class MarketCheckoutSettingsPriceOptionTooltipDto implements Parcelable {
    public static final Parcelable.Creator<MarketCheckoutSettingsPriceOptionTooltipDto> CREATOR = new a();

    @pmi0("button_text")
    private final String buttonText;

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketCheckoutSettingsPriceOptionTooltipDto.kt */
    public static final class a implements Parcelable.Creator<MarketCheckoutSettingsPriceOptionTooltipDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCheckoutSettingsPriceOptionTooltipDto createFromParcel(Parcel parcel) {
            return new MarketCheckoutSettingsPriceOptionTooltipDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCheckoutSettingsPriceOptionTooltipDto[] newArray(int i) {
            return new MarketCheckoutSettingsPriceOptionTooltipDto[i];
        }
    }

    public MarketCheckoutSettingsPriceOptionTooltipDto() {
        this(null, null, null, 7, null);
    }

    public final String d() {
        return this.buttonText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCheckoutSettingsPriceOptionTooltipDto)) {
            return false;
        }
        MarketCheckoutSettingsPriceOptionTooltipDto marketCheckoutSettingsPriceOptionTooltipDto = (MarketCheckoutSettingsPriceOptionTooltipDto) obj;
        return epx.f(this.title, marketCheckoutSettingsPriceOptionTooltipDto.title) && epx.f(this.text, marketCheckoutSettingsPriceOptionTooltipDto.text) && epx.f(this.buttonText, marketCheckoutSettingsPriceOptionTooltipDto.buttonText);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buttonText;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCheckoutSettingsPriceOptionTooltipDto(title=");
        sb.append(this.title);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", buttonText=");
        return ho8.a(sb, this.buttonText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        parcel.writeString(this.buttonText);
    }

    public MarketCheckoutSettingsPriceOptionTooltipDto(String str, String str2, String str3) {
        this.title = str;
        this.text = str2;
        this.buttonText = str3;
    }

    public /* synthetic */ MarketCheckoutSettingsPriceOptionTooltipDto(String str, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
