package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSetSettingsOrdersImNotificationDto.kt */
/* loaded from: classes15.dex */
public final class MarketSetSettingsOrdersImNotificationDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSetSettingsOrdersImNotificationDto[] $VALUES;
    public static final Parcelable.Creator<MarketSetSettingsOrdersImNotificationDto> CREATOR;

    @pmi0("0")
    public static final MarketSetSettingsOrdersImNotificationDto TYPE_0;

    @pmi0("1")
    public static final MarketSetSettingsOrdersImNotificationDto TYPE_1;
    private final int value;

    /* compiled from: MarketSetSettingsOrdersImNotificationDto.kt */
    public static final class a implements Parcelable.Creator<MarketSetSettingsOrdersImNotificationDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSetSettingsOrdersImNotificationDto createFromParcel(Parcel parcel) {
            return MarketSetSettingsOrdersImNotificationDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSetSettingsOrdersImNotificationDto[] newArray(int i) {
            return new MarketSetSettingsOrdersImNotificationDto[i];
        }
    }

    static {
        MarketSetSettingsOrdersImNotificationDto marketSetSettingsOrdersImNotificationDto = new MarketSetSettingsOrdersImNotificationDto("TYPE_0", 0, 0);
        TYPE_0 = marketSetSettingsOrdersImNotificationDto;
        MarketSetSettingsOrdersImNotificationDto marketSetSettingsOrdersImNotificationDto2 = new MarketSetSettingsOrdersImNotificationDto("TYPE_1", 1, 1);
        TYPE_1 = marketSetSettingsOrdersImNotificationDto2;
        MarketSetSettingsOrdersImNotificationDto[] marketSetSettingsOrdersImNotificationDtoArr = {marketSetSettingsOrdersImNotificationDto, marketSetSettingsOrdersImNotificationDto2};
        $VALUES = marketSetSettingsOrdersImNotificationDtoArr;
        $ENTRIES = new asp(marketSetSettingsOrdersImNotificationDtoArr);
        CREATOR = new a();
    }

    private MarketSetSettingsOrdersImNotificationDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketSetSettingsOrdersImNotificationDto valueOf(String str) {
        return (MarketSetSettingsOrdersImNotificationDto) Enum.valueOf(MarketSetSettingsOrdersImNotificationDto.class, str);
    }

    public static MarketSetSettingsOrdersImNotificationDto[] values() {
        return (MarketSetSettingsOrdersImNotificationDto[]) $VALUES.clone();
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
