package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SuperAppUniversalWidgetTypeInformerRootStyleRowRightCounterDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetTypeInformerRootStyleRowRightCounterDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetTypeInformerRootStyleRowRightCounterDto> CREATOR = new a();

    @pmi0("color")
    private final SuperAppUniversalWidgetColorDto color;

    @pmi0("size")
    private final SizeDto size;

    @pmi0("weight")
    private final SuperAppUniversalWidgetWeightDto weight;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SuperAppUniversalWidgetTypeInformerRootStyleRowRightCounterDto.kt */
    public static final class SizeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SizeDto[] $VALUES;
        public static final Parcelable.Creator<SizeDto> CREATOR;

        @pmi0("large")
        public static final SizeDto LARGE;

        @pmi0("regular")
        public static final SizeDto REGULAR;
        private final String value;

        /* compiled from: SuperAppUniversalWidgetTypeInformerRootStyleRowRightCounterDto.kt */
        public static final class a implements Parcelable.Creator<SizeDto> {
            @Override // android.os.Parcelable.Creator
            public final SizeDto createFromParcel(Parcel parcel) {
                return SizeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SizeDto[] newArray(int i) {
                return new SizeDto[i];
            }
        }

        static {
            SizeDto sizeDto = new SizeDto("REGULAR", 0, "regular");
            REGULAR = sizeDto;
            SizeDto sizeDto2 = new SizeDto("LARGE", 1, "large");
            LARGE = sizeDto2;
            SizeDto[] sizeDtoArr = {sizeDto, sizeDto2};
            $VALUES = sizeDtoArr;
            $ENTRIES = new asp(sizeDtoArr);
            CREATOR = new a();
        }

        private SizeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static SizeDto valueOf(String str) {
            return (SizeDto) Enum.valueOf(SizeDto.class, str);
        }

        public static SizeDto[] values() {
            return (SizeDto[]) $VALUES.clone();
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

    /* compiled from: SuperAppUniversalWidgetTypeInformerRootStyleRowRightCounterDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetTypeInformerRootStyleRowRightCounterDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTypeInformerRootStyleRowRightCounterDto createFromParcel(Parcel parcel) {
            return new SuperAppUniversalWidgetTypeInformerRootStyleRowRightCounterDto(SizeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetColorDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SuperAppUniversalWidgetWeightDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTypeInformerRootStyleRowRightCounterDto[] newArray(int i) {
            return new SuperAppUniversalWidgetTypeInformerRootStyleRowRightCounterDto[i];
        }
    }

    public SuperAppUniversalWidgetTypeInformerRootStyleRowRightCounterDto(SizeDto sizeDto, SuperAppUniversalWidgetColorDto superAppUniversalWidgetColorDto, SuperAppUniversalWidgetWeightDto superAppUniversalWidgetWeightDto) {
        this.size = sizeDto;
        this.color = superAppUniversalWidgetColorDto;
        this.weight = superAppUniversalWidgetWeightDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppUniversalWidgetTypeInformerRootStyleRowRightCounterDto)) {
            return false;
        }
        SuperAppUniversalWidgetTypeInformerRootStyleRowRightCounterDto superAppUniversalWidgetTypeInformerRootStyleRowRightCounterDto = (SuperAppUniversalWidgetTypeInformerRootStyleRowRightCounterDto) obj;
        return this.size == superAppUniversalWidgetTypeInformerRootStyleRowRightCounterDto.size && this.color == superAppUniversalWidgetTypeInformerRootStyleRowRightCounterDto.color && this.weight == superAppUniversalWidgetTypeInformerRootStyleRowRightCounterDto.weight;
    }

    public final int hashCode() {
        int hashCode = this.size.hashCode() * 31;
        SuperAppUniversalWidgetColorDto superAppUniversalWidgetColorDto = this.color;
        int hashCode2 = (hashCode + (superAppUniversalWidgetColorDto == null ? 0 : superAppUniversalWidgetColorDto.hashCode())) * 31;
        SuperAppUniversalWidgetWeightDto superAppUniversalWidgetWeightDto = this.weight;
        return hashCode2 + (superAppUniversalWidgetWeightDto != null ? superAppUniversalWidgetWeightDto.hashCode() : 0);
    }

    public final String toString() {
        return "SuperAppUniversalWidgetTypeInformerRootStyleRowRightCounterDto(size=" + this.size + ", color=" + this.color + ", weight=" + this.weight + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.size.writeToParcel(parcel, i);
        SuperAppUniversalWidgetColorDto superAppUniversalWidgetColorDto = this.color;
        if (superAppUniversalWidgetColorDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetColorDto.writeToParcel(parcel, i);
        }
        SuperAppUniversalWidgetWeightDto superAppUniversalWidgetWeightDto = this.weight;
        if (superAppUniversalWidgetWeightDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetWeightDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ SuperAppUniversalWidgetTypeInformerRootStyleRowRightCounterDto(SizeDto sizeDto, SuperAppUniversalWidgetColorDto superAppUniversalWidgetColorDto, SuperAppUniversalWidgetWeightDto superAppUniversalWidgetWeightDto, int i, zcl zclVar) {
        this(sizeDto, (i & 2) != 0 ? null : superAppUniversalWidgetColorDto, (i & 4) != 0 ? null : superAppUniversalWidgetWeightDto);
    }
}
