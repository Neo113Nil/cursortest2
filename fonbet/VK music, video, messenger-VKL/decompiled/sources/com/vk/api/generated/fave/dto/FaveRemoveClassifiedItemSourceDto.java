package com.vk.api.generated.fave.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FaveRemoveClassifiedItemSourceDto.kt */
/* loaded from: classes14.dex */
public final class FaveRemoveClassifiedItemSourceDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FaveRemoveClassifiedItemSourceDto[] $VALUES;
    public static final Parcelable.Creator<FaveRemoveClassifiedItemSourceDto> CREATOR;

    @pmi0("youla")
    public static final FaveRemoveClassifiedItemSourceDto YOULA;
    private final String value;

    /* compiled from: FaveRemoveClassifiedItemSourceDto.kt */
    public static final class a implements Parcelable.Creator<FaveRemoveClassifiedItemSourceDto> {
        @Override // android.os.Parcelable.Creator
        public final FaveRemoveClassifiedItemSourceDto createFromParcel(Parcel parcel) {
            return FaveRemoveClassifiedItemSourceDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FaveRemoveClassifiedItemSourceDto[] newArray(int i) {
            return new FaveRemoveClassifiedItemSourceDto[i];
        }
    }

    static {
        FaveRemoveClassifiedItemSourceDto faveRemoveClassifiedItemSourceDto = new FaveRemoveClassifiedItemSourceDto("YOULA", 0, "youla");
        YOULA = faveRemoveClassifiedItemSourceDto;
        FaveRemoveClassifiedItemSourceDto[] faveRemoveClassifiedItemSourceDtoArr = {faveRemoveClassifiedItemSourceDto};
        $VALUES = faveRemoveClassifiedItemSourceDtoArr;
        $ENTRIES = new asp(faveRemoveClassifiedItemSourceDtoArr);
        CREATOR = new a();
    }

    private FaveRemoveClassifiedItemSourceDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static FaveRemoveClassifiedItemSourceDto valueOf(String str) {
        return (FaveRemoveClassifiedItemSourceDto) Enum.valueOf(FaveRemoveClassifiedItemSourceDto.class, str);
    }

    public static FaveRemoveClassifiedItemSourceDto[] values() {
        return (FaveRemoveClassifiedItemSourceDto[]) $VALUES.clone();
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
