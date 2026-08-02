package com.vk.api.generated.phones.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PhonesGoodTypeDto.kt */
/* loaded from: classes15.dex */
public final class PhonesGoodTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PhonesGoodTypeDto[] $VALUES;

    @pmi0("1")
    public static final PhonesGoodTypeDto BAD;
    public static final Parcelable.Creator<PhonesGoodTypeDto> CREATOR;

    @pmi0("2")
    public static final PhonesGoodTypeDto GOOD;

    @pmi0("0")
    public static final PhonesGoodTypeDto NEUTRAL;
    private final int value;

    /* compiled from: PhonesGoodTypeDto.kt */
    public static final class a implements Parcelable.Creator<PhonesGoodTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final PhonesGoodTypeDto createFromParcel(Parcel parcel) {
            return PhonesGoodTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhonesGoodTypeDto[] newArray(int i) {
            return new PhonesGoodTypeDto[i];
        }
    }

    static {
        PhonesGoodTypeDto phonesGoodTypeDto = new PhonesGoodTypeDto("NEUTRAL", 0, 0);
        NEUTRAL = phonesGoodTypeDto;
        PhonesGoodTypeDto phonesGoodTypeDto2 = new PhonesGoodTypeDto("BAD", 1, 1);
        BAD = phonesGoodTypeDto2;
        PhonesGoodTypeDto phonesGoodTypeDto3 = new PhonesGoodTypeDto("GOOD", 2, 2);
        GOOD = phonesGoodTypeDto3;
        PhonesGoodTypeDto[] phonesGoodTypeDtoArr = {phonesGoodTypeDto, phonesGoodTypeDto2, phonesGoodTypeDto3};
        $VALUES = phonesGoodTypeDtoArr;
        $ENTRIES = new asp(phonesGoodTypeDtoArr);
        CREATOR = new a();
    }

    private PhonesGoodTypeDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static PhonesGoodTypeDto valueOf(String str) {
        return (PhonesGoodTypeDto) Enum.valueOf(PhonesGoodTypeDto.class, str);
    }

    public static PhonesGoodTypeDto[] values() {
        return (PhonesGoodTypeDto[]) $VALUES.clone();
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
