package com.vk.api.generated.fave.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FaveAddTagPositionDto.kt */
/* loaded from: classes14.dex */
public final class FaveAddTagPositionDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FaveAddTagPositionDto[] $VALUES;

    @pmi0("back")
    public static final FaveAddTagPositionDto BACK;
    public static final Parcelable.Creator<FaveAddTagPositionDto> CREATOR;

    @pmi0("front")
    public static final FaveAddTagPositionDto FRONT;
    private final String value;

    /* compiled from: FaveAddTagPositionDto.kt */
    public static final class a implements Parcelable.Creator<FaveAddTagPositionDto> {
        @Override // android.os.Parcelable.Creator
        public final FaveAddTagPositionDto createFromParcel(Parcel parcel) {
            return FaveAddTagPositionDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FaveAddTagPositionDto[] newArray(int i) {
            return new FaveAddTagPositionDto[i];
        }
    }

    static {
        FaveAddTagPositionDto faveAddTagPositionDto = new FaveAddTagPositionDto("BACK", 0, "back");
        BACK = faveAddTagPositionDto;
        FaveAddTagPositionDto faveAddTagPositionDto2 = new FaveAddTagPositionDto("FRONT", 1, "front");
        FRONT = faveAddTagPositionDto2;
        FaveAddTagPositionDto[] faveAddTagPositionDtoArr = {faveAddTagPositionDto, faveAddTagPositionDto2};
        $VALUES = faveAddTagPositionDtoArr;
        $ENTRIES = new asp(faveAddTagPositionDtoArr);
        CREATOR = new a();
    }

    private FaveAddTagPositionDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static FaveAddTagPositionDto valueOf(String str) {
        return (FaveAddTagPositionDto) Enum.valueOf(FaveAddTagPositionDto.class, str);
    }

    public static FaveAddTagPositionDto[] values() {
        return (FaveAddTagPositionDto[]) $VALUES.clone();
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
