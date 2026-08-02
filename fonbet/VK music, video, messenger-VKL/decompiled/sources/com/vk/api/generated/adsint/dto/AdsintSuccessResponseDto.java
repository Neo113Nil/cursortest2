package com.vk.api.generated.adsint.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: AdsintSuccessResponseDto.kt */
/* loaded from: classes14.dex */
public final class AdsintSuccessResponseDto implements Parcelable {
    public static final Parcelable.Creator<AdsintSuccessResponseDto> CREATOR = new a();

    @pmi0("success")
    private final SuccessDto success;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdsintSuccessResponseDto.kt */
    public static final class SuccessDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SuccessDto[] $VALUES;
        public static final Parcelable.Creator<SuccessDto> CREATOR;

        @pmi0("1")
        public static final SuccessDto TYPE_1;
        private final int value;

        /* compiled from: AdsintSuccessResponseDto.kt */
        public static final class a implements Parcelable.Creator<SuccessDto> {
            @Override // android.os.Parcelable.Creator
            public final SuccessDto createFromParcel(Parcel parcel) {
                return SuccessDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SuccessDto[] newArray(int i) {
                return new SuccessDto[i];
            }
        }

        static {
            SuccessDto successDto = new SuccessDto("TYPE_1", 0, 1);
            TYPE_1 = successDto;
            SuccessDto[] successDtoArr = {successDto};
            $VALUES = successDtoArr;
            $ENTRIES = new asp(successDtoArr);
            CREATOR = new a();
        }

        private SuccessDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static SuccessDto valueOf(String str) {
            return (SuccessDto) Enum.valueOf(SuccessDto.class, str);
        }

        public static SuccessDto[] values() {
            return (SuccessDto[]) $VALUES.clone();
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

    /* compiled from: AdsintSuccessResponseDto.kt */
    public static final class a implements Parcelable.Creator<AdsintSuccessResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AdsintSuccessResponseDto createFromParcel(Parcel parcel) {
            return new AdsintSuccessResponseDto(SuccessDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AdsintSuccessResponseDto[] newArray(int i) {
            return new AdsintSuccessResponseDto[i];
        }
    }

    public AdsintSuccessResponseDto(SuccessDto successDto) {
        this.success = successDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AdsintSuccessResponseDto) && this.success == ((AdsintSuccessResponseDto) obj).success;
    }

    public final int hashCode() {
        return this.success.hashCode();
    }

    public final String toString() {
        return "AdsintSuccessResponseDto(success=" + this.success + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.success.writeToParcel(parcel, i);
    }
}
