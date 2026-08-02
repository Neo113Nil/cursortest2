package com.vk.api.generated.fave.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FaveAddClassifiedItemSourceDto.kt */
/* loaded from: classes14.dex */
public final class FaveAddClassifiedItemSourceDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FaveAddClassifiedItemSourceDto[] $VALUES;
    public static final Parcelable.Creator<FaveAddClassifiedItemSourceDto> CREATOR;

    @pmi0("youla")
    public static final FaveAddClassifiedItemSourceDto YOULA;
    private final String value;

    /* compiled from: FaveAddClassifiedItemSourceDto.kt */
    public static final class a implements Parcelable.Creator<FaveAddClassifiedItemSourceDto> {
        @Override // android.os.Parcelable.Creator
        public final FaveAddClassifiedItemSourceDto createFromParcel(Parcel parcel) {
            return FaveAddClassifiedItemSourceDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FaveAddClassifiedItemSourceDto[] newArray(int i) {
            return new FaveAddClassifiedItemSourceDto[i];
        }
    }

    static {
        FaveAddClassifiedItemSourceDto faveAddClassifiedItemSourceDto = new FaveAddClassifiedItemSourceDto("YOULA", 0, "youla");
        YOULA = faveAddClassifiedItemSourceDto;
        FaveAddClassifiedItemSourceDto[] faveAddClassifiedItemSourceDtoArr = {faveAddClassifiedItemSourceDto};
        $VALUES = faveAddClassifiedItemSourceDtoArr;
        $ENTRIES = new asp(faveAddClassifiedItemSourceDtoArr);
        CREATOR = new a();
    }

    private FaveAddClassifiedItemSourceDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static FaveAddClassifiedItemSourceDto valueOf(String str) {
        return (FaveAddClassifiedItemSourceDto) Enum.valueOf(FaveAddClassifiedItemSourceDto.class, str);
    }

    public static FaveAddClassifiedItemSourceDto[] values() {
        return (FaveAddClassifiedItemSourceDto[]) $VALUES.clone();
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
