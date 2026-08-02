package com.vk.api.generated.marusia.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarusiaGetInitConfigTtsTypeDto.kt */
/* loaded from: classes15.dex */
public final class MarusiaGetInitConfigTtsTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarusiaGetInitConfigTtsTypeDto[] $VALUES;
    public static final Parcelable.Creator<MarusiaGetInitConfigTtsTypeDto> CREATOR;

    @pmi0("mp3")
    public static final MarusiaGetInitConfigTtsTypeDto MP3;

    @pmi0("opus")
    public static final MarusiaGetInitConfigTtsTypeDto OPUS;
    private final String value;

    /* compiled from: MarusiaGetInitConfigTtsTypeDto.kt */
    public static final class a implements Parcelable.Creator<MarusiaGetInitConfigTtsTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MarusiaGetInitConfigTtsTypeDto createFromParcel(Parcel parcel) {
            return MarusiaGetInitConfigTtsTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarusiaGetInitConfigTtsTypeDto[] newArray(int i) {
            return new MarusiaGetInitConfigTtsTypeDto[i];
        }
    }

    static {
        MarusiaGetInitConfigTtsTypeDto marusiaGetInitConfigTtsTypeDto = new MarusiaGetInitConfigTtsTypeDto("MP3", 0, "mp3");
        MP3 = marusiaGetInitConfigTtsTypeDto;
        MarusiaGetInitConfigTtsTypeDto marusiaGetInitConfigTtsTypeDto2 = new MarusiaGetInitConfigTtsTypeDto("OPUS", 1, "opus");
        OPUS = marusiaGetInitConfigTtsTypeDto2;
        MarusiaGetInitConfigTtsTypeDto[] marusiaGetInitConfigTtsTypeDtoArr = {marusiaGetInitConfigTtsTypeDto, marusiaGetInitConfigTtsTypeDto2};
        $VALUES = marusiaGetInitConfigTtsTypeDtoArr;
        $ENTRIES = new asp(marusiaGetInitConfigTtsTypeDtoArr);
        CREATOR = new a();
    }

    private MarusiaGetInitConfigTtsTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MarusiaGetInitConfigTtsTypeDto valueOf(String str) {
        return (MarusiaGetInitConfigTtsTypeDto) Enum.valueOf(MarusiaGetInitConfigTtsTypeDto.class, str);
    }

    public static MarusiaGetInitConfigTtsTypeDto[] values() {
        return (MarusiaGetInitConfigTtsTypeDto[]) $VALUES.clone();
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
