package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSetPaymentsSettingsIsEnabledDto.kt */
/* loaded from: classes15.dex */
public final class MarketSetPaymentsSettingsIsEnabledDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSetPaymentsSettingsIsEnabledDto[] $VALUES;
    public static final Parcelable.Creator<MarketSetPaymentsSettingsIsEnabledDto> CREATOR;

    @pmi0("0")
    public static final MarketSetPaymentsSettingsIsEnabledDto TYPE_0;

    @pmi0("1")
    public static final MarketSetPaymentsSettingsIsEnabledDto TYPE_1;
    private final int value;

    /* compiled from: MarketSetPaymentsSettingsIsEnabledDto.kt */
    public static final class a implements Parcelable.Creator<MarketSetPaymentsSettingsIsEnabledDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSetPaymentsSettingsIsEnabledDto createFromParcel(Parcel parcel) {
            return MarketSetPaymentsSettingsIsEnabledDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSetPaymentsSettingsIsEnabledDto[] newArray(int i) {
            return new MarketSetPaymentsSettingsIsEnabledDto[i];
        }
    }

    static {
        MarketSetPaymentsSettingsIsEnabledDto marketSetPaymentsSettingsIsEnabledDto = new MarketSetPaymentsSettingsIsEnabledDto("TYPE_0", 0, 0);
        TYPE_0 = marketSetPaymentsSettingsIsEnabledDto;
        MarketSetPaymentsSettingsIsEnabledDto marketSetPaymentsSettingsIsEnabledDto2 = new MarketSetPaymentsSettingsIsEnabledDto("TYPE_1", 1, 1);
        TYPE_1 = marketSetPaymentsSettingsIsEnabledDto2;
        MarketSetPaymentsSettingsIsEnabledDto[] marketSetPaymentsSettingsIsEnabledDtoArr = {marketSetPaymentsSettingsIsEnabledDto, marketSetPaymentsSettingsIsEnabledDto2};
        $VALUES = marketSetPaymentsSettingsIsEnabledDtoArr;
        $ENTRIES = new asp(marketSetPaymentsSettingsIsEnabledDtoArr);
        CREATOR = new a();
    }

    private MarketSetPaymentsSettingsIsEnabledDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketSetPaymentsSettingsIsEnabledDto valueOf(String str) {
        return (MarketSetPaymentsSettingsIsEnabledDto) Enum.valueOf(MarketSetPaymentsSettingsIsEnabledDto.class, str);
    }

    public static MarketSetPaymentsSettingsIsEnabledDto[] values() {
        return (MarketSetPaymentsSettingsIsEnabledDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
