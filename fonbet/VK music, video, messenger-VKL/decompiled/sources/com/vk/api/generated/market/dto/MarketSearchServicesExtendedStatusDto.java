package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSearchServicesExtendedStatusDto.kt */
/* loaded from: classes15.dex */
public final class MarketSearchServicesExtendedStatusDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSearchServicesExtendedStatusDto[] $VALUES;

    @pmi0("0")
    public static final MarketSearchServicesExtendedStatusDto ACTIVE;
    public static final Parcelable.Creator<MarketSearchServicesExtendedStatusDto> CREATOR;

    @pmi0("2")
    public static final MarketSearchServicesExtendedStatusDto DISABLED;
    private final int value;

    /* compiled from: MarketSearchServicesExtendedStatusDto.kt */
    public static final class a implements Parcelable.Creator<MarketSearchServicesExtendedStatusDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSearchServicesExtendedStatusDto createFromParcel(Parcel parcel) {
            return MarketSearchServicesExtendedStatusDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSearchServicesExtendedStatusDto[] newArray(int i) {
            return new MarketSearchServicesExtendedStatusDto[i];
        }
    }

    static {
        MarketSearchServicesExtendedStatusDto marketSearchServicesExtendedStatusDto = new MarketSearchServicesExtendedStatusDto(SignalingProtocol.STATE_ACTIVE, 0, 0);
        ACTIVE = marketSearchServicesExtendedStatusDto;
        MarketSearchServicesExtendedStatusDto marketSearchServicesExtendedStatusDto2 = new MarketSearchServicesExtendedStatusDto("DISABLED", 1, 2);
        DISABLED = marketSearchServicesExtendedStatusDto2;
        MarketSearchServicesExtendedStatusDto[] marketSearchServicesExtendedStatusDtoArr = {marketSearchServicesExtendedStatusDto, marketSearchServicesExtendedStatusDto2};
        $VALUES = marketSearchServicesExtendedStatusDtoArr;
        $ENTRIES = new asp(marketSearchServicesExtendedStatusDtoArr);
        CREATOR = new a();
    }

    private MarketSearchServicesExtendedStatusDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketSearchServicesExtendedStatusDto valueOf(String str) {
        return (MarketSearchServicesExtendedStatusDto) Enum.valueOf(MarketSearchServicesExtendedStatusDto.class, str);
    }

    public static MarketSearchServicesExtendedStatusDto[] values() {
        return (MarketSearchServicesExtendedStatusDto[]) $VALUES.clone();
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
