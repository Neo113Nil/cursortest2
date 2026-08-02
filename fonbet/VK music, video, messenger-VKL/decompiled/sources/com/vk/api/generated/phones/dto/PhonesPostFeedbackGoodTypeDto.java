package com.vk.api.generated.phones.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PhonesPostFeedbackGoodTypeDto.kt */
/* loaded from: classes15.dex */
public final class PhonesPostFeedbackGoodTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PhonesPostFeedbackGoodTypeDto[] $VALUES;
    public static final Parcelable.Creator<PhonesPostFeedbackGoodTypeDto> CREATOR;

    @pmi0("0")
    public static final PhonesPostFeedbackGoodTypeDto TYPE_0;

    @pmi0("1")
    public static final PhonesPostFeedbackGoodTypeDto TYPE_1;

    @pmi0("2")
    public static final PhonesPostFeedbackGoodTypeDto TYPE_2;
    private final int value;

    /* compiled from: PhonesPostFeedbackGoodTypeDto.kt */
    public static final class a implements Parcelable.Creator<PhonesPostFeedbackGoodTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final PhonesPostFeedbackGoodTypeDto createFromParcel(Parcel parcel) {
            return PhonesPostFeedbackGoodTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhonesPostFeedbackGoodTypeDto[] newArray(int i) {
            return new PhonesPostFeedbackGoodTypeDto[i];
        }
    }

    static {
        PhonesPostFeedbackGoodTypeDto phonesPostFeedbackGoodTypeDto = new PhonesPostFeedbackGoodTypeDto("TYPE_0", 0, 0);
        TYPE_0 = phonesPostFeedbackGoodTypeDto;
        PhonesPostFeedbackGoodTypeDto phonesPostFeedbackGoodTypeDto2 = new PhonesPostFeedbackGoodTypeDto("TYPE_1", 1, 1);
        TYPE_1 = phonesPostFeedbackGoodTypeDto2;
        PhonesPostFeedbackGoodTypeDto phonesPostFeedbackGoodTypeDto3 = new PhonesPostFeedbackGoodTypeDto("TYPE_2", 2, 2);
        TYPE_2 = phonesPostFeedbackGoodTypeDto3;
        PhonesPostFeedbackGoodTypeDto[] phonesPostFeedbackGoodTypeDtoArr = {phonesPostFeedbackGoodTypeDto, phonesPostFeedbackGoodTypeDto2, phonesPostFeedbackGoodTypeDto3};
        $VALUES = phonesPostFeedbackGoodTypeDtoArr;
        $ENTRIES = new asp(phonesPostFeedbackGoodTypeDtoArr);
        CREATOR = new a();
    }

    private PhonesPostFeedbackGoodTypeDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static PhonesPostFeedbackGoodTypeDto valueOf(String str) {
        return (PhonesPostFeedbackGoodTypeDto) Enum.valueOf(PhonesPostFeedbackGoodTypeDto.class, str);
    }

    public static PhonesPostFeedbackGoodTypeDto[] values() {
        return (PhonesPostFeedbackGoodTypeDto[]) $VALUES.clone();
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
