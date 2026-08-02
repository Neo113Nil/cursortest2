package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: SuperAppUniversalWidgetTypeGridRootStyleDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetTypeGridRootStyleDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetTypeGridRootStyleDto> CREATOR = new a();

    @pmi0("size")
    private final SizeDto size;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SuperAppUniversalWidgetTypeGridRootStyleDto.kt */
    public static final class SizeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SizeDto[] $VALUES;
        public static final Parcelable.Creator<SizeDto> CREATOR;

        @pmi0("large")
        public static final SizeDto LARGE;

        @pmi0("medium")
        public static final SizeDto MEDIUM;
        private final String value;

        /* compiled from: SuperAppUniversalWidgetTypeGridRootStyleDto.kt */
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
            SizeDto sizeDto = new SizeDto("MEDIUM", 0, "medium");
            MEDIUM = sizeDto;
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

    /* compiled from: SuperAppUniversalWidgetTypeGridRootStyleDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetTypeGridRootStyleDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTypeGridRootStyleDto createFromParcel(Parcel parcel) {
            return new SuperAppUniversalWidgetTypeGridRootStyleDto(SizeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTypeGridRootStyleDto[] newArray(int i) {
            return new SuperAppUniversalWidgetTypeGridRootStyleDto[i];
        }
    }

    public SuperAppUniversalWidgetTypeGridRootStyleDto(SizeDto sizeDto) {
        this.size = sizeDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SuperAppUniversalWidgetTypeGridRootStyleDto) && this.size == ((SuperAppUniversalWidgetTypeGridRootStyleDto) obj).size;
    }

    public final int hashCode() {
        return this.size.hashCode();
    }

    public final String toString() {
        return "SuperAppUniversalWidgetTypeGridRootStyleDto(size=" + this.size + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.size.writeToParcel(parcel, i);
    }
}
