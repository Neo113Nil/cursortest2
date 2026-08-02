package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSetSettingsOrdersNotificationDto.kt */
/* loaded from: classes15.dex */
public final class MarketSetSettingsOrdersNotificationDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSetSettingsOrdersNotificationDto[] $VALUES;
    public static final Parcelable.Creator<MarketSetSettingsOrdersNotificationDto> CREATOR;

    @pmi0("0")
    public static final MarketSetSettingsOrdersNotificationDto TYPE_0;

    @pmi0("1")
    public static final MarketSetSettingsOrdersNotificationDto TYPE_1;
    private final int value;

    /* compiled from: MarketSetSettingsOrdersNotificationDto.kt */
    public static final class a implements Parcelable.Creator<MarketSetSettingsOrdersNotificationDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSetSettingsOrdersNotificationDto createFromParcel(Parcel parcel) {
            return MarketSetSettingsOrdersNotificationDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSetSettingsOrdersNotificationDto[] newArray(int i) {
            return new MarketSetSettingsOrdersNotificationDto[i];
        }
    }

    static {
        MarketSetSettingsOrdersNotificationDto marketSetSettingsOrdersNotificationDto = new MarketSetSettingsOrdersNotificationDto("TYPE_0", 0, 0);
        TYPE_0 = marketSetSettingsOrdersNotificationDto;
        MarketSetSettingsOrdersNotificationDto marketSetSettingsOrdersNotificationDto2 = new MarketSetSettingsOrdersNotificationDto("TYPE_1", 1, 1);
        TYPE_1 = marketSetSettingsOrdersNotificationDto2;
        MarketSetSettingsOrdersNotificationDto[] marketSetSettingsOrdersNotificationDtoArr = {marketSetSettingsOrdersNotificationDto, marketSetSettingsOrdersNotificationDto2};
        $VALUES = marketSetSettingsOrdersNotificationDtoArr;
        $ENTRIES = new asp(marketSetSettingsOrdersNotificationDtoArr);
        CREATOR = new a();
    }

    private MarketSetSettingsOrdersNotificationDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketSetSettingsOrdersNotificationDto valueOf(String str) {
        return (MarketSetSettingsOrdersNotificationDto) Enum.valueOf(MarketSetSettingsOrdersNotificationDto.class, str);
    }

    public static MarketSetSettingsOrdersNotificationDto[] values() {
        return (MarketSetSettingsOrdersNotificationDto[]) $VALUES.clone();
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
