package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSetSettingsOrdersPushNotificationDto.kt */
/* loaded from: classes15.dex */
public final class MarketSetSettingsOrdersPushNotificationDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSetSettingsOrdersPushNotificationDto[] $VALUES;
    public static final Parcelable.Creator<MarketSetSettingsOrdersPushNotificationDto> CREATOR;

    @pmi0("0")
    public static final MarketSetSettingsOrdersPushNotificationDto TYPE_0;

    @pmi0("1")
    public static final MarketSetSettingsOrdersPushNotificationDto TYPE_1;
    private final int value;

    /* compiled from: MarketSetSettingsOrdersPushNotificationDto.kt */
    public static final class a implements Parcelable.Creator<MarketSetSettingsOrdersPushNotificationDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSetSettingsOrdersPushNotificationDto createFromParcel(Parcel parcel) {
            return MarketSetSettingsOrdersPushNotificationDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSetSettingsOrdersPushNotificationDto[] newArray(int i) {
            return new MarketSetSettingsOrdersPushNotificationDto[i];
        }
    }

    static {
        MarketSetSettingsOrdersPushNotificationDto marketSetSettingsOrdersPushNotificationDto = new MarketSetSettingsOrdersPushNotificationDto("TYPE_0", 0, 0);
        TYPE_0 = marketSetSettingsOrdersPushNotificationDto;
        MarketSetSettingsOrdersPushNotificationDto marketSetSettingsOrdersPushNotificationDto2 = new MarketSetSettingsOrdersPushNotificationDto("TYPE_1", 1, 1);
        TYPE_1 = marketSetSettingsOrdersPushNotificationDto2;
        MarketSetSettingsOrdersPushNotificationDto[] marketSetSettingsOrdersPushNotificationDtoArr = {marketSetSettingsOrdersPushNotificationDto, marketSetSettingsOrdersPushNotificationDto2};
        $VALUES = marketSetSettingsOrdersPushNotificationDtoArr;
        $ENTRIES = new asp(marketSetSettingsOrdersPushNotificationDtoArr);
        CREATOR = new a();
    }

    private MarketSetSettingsOrdersPushNotificationDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketSetSettingsOrdersPushNotificationDto valueOf(String str) {
        return (MarketSetSettingsOrdersPushNotificationDto) Enum.valueOf(MarketSetSettingsOrdersPushNotificationDto.class, str);
    }

    public static MarketSetSettingsOrdersPushNotificationDto[] values() {
        return (MarketSetSettingsOrdersPushNotificationDto[]) $VALUES.clone();
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
