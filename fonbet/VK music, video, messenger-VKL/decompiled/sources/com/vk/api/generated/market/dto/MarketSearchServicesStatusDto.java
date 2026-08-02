package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSearchServicesStatusDto.kt */
/* loaded from: classes15.dex */
public final class MarketSearchServicesStatusDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSearchServicesStatusDto[] $VALUES;

    @pmi0("0")
    public static final MarketSearchServicesStatusDto ACTIVE;
    public static final Parcelable.Creator<MarketSearchServicesStatusDto> CREATOR;

    @pmi0("2")
    public static final MarketSearchServicesStatusDto DISABLED;
    private final int value;

    /* compiled from: MarketSearchServicesStatusDto.kt */
    public static final class a implements Parcelable.Creator<MarketSearchServicesStatusDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSearchServicesStatusDto createFromParcel(Parcel parcel) {
            return MarketSearchServicesStatusDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSearchServicesStatusDto[] newArray(int i) {
            return new MarketSearchServicesStatusDto[i];
        }
    }

    static {
        MarketSearchServicesStatusDto marketSearchServicesStatusDto = new MarketSearchServicesStatusDto(SignalingProtocol.STATE_ACTIVE, 0, 0);
        ACTIVE = marketSearchServicesStatusDto;
        MarketSearchServicesStatusDto marketSearchServicesStatusDto2 = new MarketSearchServicesStatusDto("DISABLED", 1, 2);
        DISABLED = marketSearchServicesStatusDto2;
        MarketSearchServicesStatusDto[] marketSearchServicesStatusDtoArr = {marketSearchServicesStatusDto, marketSearchServicesStatusDto2};
        $VALUES = marketSearchServicesStatusDtoArr;
        $ENTRIES = new asp(marketSearchServicesStatusDtoArr);
        CREATOR = new a();
    }

    private MarketSearchServicesStatusDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketSearchServicesStatusDto valueOf(String str) {
        return (MarketSearchServicesStatusDto) Enum.valueOf(MarketSearchServicesStatusDto.class, str);
    }

    public static MarketSearchServicesStatusDto[] values() {
        return (MarketSearchServicesStatusDto[]) $VALUES.clone();
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
