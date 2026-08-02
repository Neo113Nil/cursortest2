package com.vk.api.generated.marusia.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarusiaGetCapabilitiesTtsTypeDto.kt */
/* loaded from: classes15.dex */
public final class MarusiaGetCapabilitiesTtsTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarusiaGetCapabilitiesTtsTypeDto[] $VALUES;
    public static final Parcelable.Creator<MarusiaGetCapabilitiesTtsTypeDto> CREATOR;

    @pmi0("mp3")
    public static final MarusiaGetCapabilitiesTtsTypeDto MP3;

    @pmi0("opus")
    public static final MarusiaGetCapabilitiesTtsTypeDto OPUS;
    private final String value;

    /* compiled from: MarusiaGetCapabilitiesTtsTypeDto.kt */
    public static final class a implements Parcelable.Creator<MarusiaGetCapabilitiesTtsTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MarusiaGetCapabilitiesTtsTypeDto createFromParcel(Parcel parcel) {
            return MarusiaGetCapabilitiesTtsTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarusiaGetCapabilitiesTtsTypeDto[] newArray(int i) {
            return new MarusiaGetCapabilitiesTtsTypeDto[i];
        }
    }

    static {
        MarusiaGetCapabilitiesTtsTypeDto marusiaGetCapabilitiesTtsTypeDto = new MarusiaGetCapabilitiesTtsTypeDto("MP3", 0, "mp3");
        MP3 = marusiaGetCapabilitiesTtsTypeDto;
        MarusiaGetCapabilitiesTtsTypeDto marusiaGetCapabilitiesTtsTypeDto2 = new MarusiaGetCapabilitiesTtsTypeDto("OPUS", 1, "opus");
        OPUS = marusiaGetCapabilitiesTtsTypeDto2;
        MarusiaGetCapabilitiesTtsTypeDto[] marusiaGetCapabilitiesTtsTypeDtoArr = {marusiaGetCapabilitiesTtsTypeDto, marusiaGetCapabilitiesTtsTypeDto2};
        $VALUES = marusiaGetCapabilitiesTtsTypeDtoArr;
        $ENTRIES = new asp(marusiaGetCapabilitiesTtsTypeDtoArr);
        CREATOR = new a();
    }

    private MarusiaGetCapabilitiesTtsTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MarusiaGetCapabilitiesTtsTypeDto valueOf(String str) {
        return (MarusiaGetCapabilitiesTtsTypeDto) Enum.valueOf(MarusiaGetCapabilitiesTtsTypeDto.class, str);
    }

    public static MarusiaGetCapabilitiesTtsTypeDto[] values() {
        return (MarusiaGetCapabilitiesTtsTypeDto[]) $VALUES.clone();
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
