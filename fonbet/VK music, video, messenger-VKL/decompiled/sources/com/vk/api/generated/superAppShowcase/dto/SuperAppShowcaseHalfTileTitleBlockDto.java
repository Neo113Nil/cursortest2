package com.vk.api.generated.superAppShowcase.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SuperAppShowcaseHalfTileTitleBlockDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppShowcaseHalfTileTitleBlockDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppShowcaseHalfTileTitleBlockDto> CREATOR = new a();

    @pmi0("align")
    private final SuperAppShowcaseHalfTileAlignDto align;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    @pmi0("title_size")
    private final TitleSizeDto titleSize;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SuperAppShowcaseHalfTileTitleBlockDto.kt */
    public static final class TitleSizeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TitleSizeDto[] $VALUES;
        public static final Parcelable.Creator<TitleSizeDto> CREATOR;

        @pmi0("large")
        public static final TitleSizeDto LARGE;

        @pmi0("regular")
        public static final TitleSizeDto REGULAR;
        private final String value;

        /* compiled from: SuperAppShowcaseHalfTileTitleBlockDto.kt */
        public static final class a implements Parcelable.Creator<TitleSizeDto> {
            @Override // android.os.Parcelable.Creator
            public final TitleSizeDto createFromParcel(Parcel parcel) {
                return TitleSizeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TitleSizeDto[] newArray(int i) {
                return new TitleSizeDto[i];
            }
        }

        static {
            TitleSizeDto titleSizeDto = new TitleSizeDto("REGULAR", 0, "regular");
            REGULAR = titleSizeDto;
            TitleSizeDto titleSizeDto2 = new TitleSizeDto("LARGE", 1, "large");
            LARGE = titleSizeDto2;
            TitleSizeDto[] titleSizeDtoArr = {titleSizeDto, titleSizeDto2};
            $VALUES = titleSizeDtoArr;
            $ENTRIES = new asp(titleSizeDtoArr);
            CREATOR = new a();
        }

        private TitleSizeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TitleSizeDto valueOf(String str) {
            return (TitleSizeDto) Enum.valueOf(TitleSizeDto.class, str);
        }

        public static TitleSizeDto[] values() {
            return (TitleSizeDto[]) $VALUES.clone();
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

    /* compiled from: SuperAppShowcaseHalfTileTitleBlockDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppShowcaseHalfTileTitleBlockDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseHalfTileTitleBlockDto createFromParcel(Parcel parcel) {
            return new SuperAppShowcaseHalfTileTitleBlockDto(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : SuperAppShowcaseHalfTileAlignDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TitleSizeDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseHalfTileTitleBlockDto[] newArray(int i) {
            return new SuperAppShowcaseHalfTileTitleBlockDto[i];
        }
    }

    public SuperAppShowcaseHalfTileTitleBlockDto(String str, String str2, SuperAppShowcaseHalfTileAlignDto superAppShowcaseHalfTileAlignDto, TitleSizeDto titleSizeDto) {
        this.title = str;
        this.subtitle = str2;
        this.align = superAppShowcaseHalfTileAlignDto;
        this.titleSize = titleSizeDto;
    }

    public final SuperAppShowcaseHalfTileAlignDto d() {
        return this.align;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.subtitle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppShowcaseHalfTileTitleBlockDto)) {
            return false;
        }
        SuperAppShowcaseHalfTileTitleBlockDto superAppShowcaseHalfTileTitleBlockDto = (SuperAppShowcaseHalfTileTitleBlockDto) obj;
        return epx.f(this.title, superAppShowcaseHalfTileTitleBlockDto.title) && epx.f(this.subtitle, superAppShowcaseHalfTileTitleBlockDto.subtitle) && this.align == superAppShowcaseHalfTileTitleBlockDto.align && this.titleSize == superAppShowcaseHalfTileTitleBlockDto.titleSize;
    }

    public final TitleSizeDto f() {
        return this.titleSize;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        SuperAppShowcaseHalfTileAlignDto superAppShowcaseHalfTileAlignDto = this.align;
        int hashCode3 = (hashCode2 + (superAppShowcaseHalfTileAlignDto == null ? 0 : superAppShowcaseHalfTileAlignDto.hashCode())) * 31;
        TitleSizeDto titleSizeDto = this.titleSize;
        return hashCode3 + (titleSizeDto != null ? titleSizeDto.hashCode() : 0);
    }

    public final String toString() {
        return "SuperAppShowcaseHalfTileTitleBlockDto(title=" + this.title + ", subtitle=" + this.subtitle + ", align=" + this.align + ", titleSize=" + this.titleSize + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        SuperAppShowcaseHalfTileAlignDto superAppShowcaseHalfTileAlignDto = this.align;
        if (superAppShowcaseHalfTileAlignDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppShowcaseHalfTileAlignDto.writeToParcel(parcel, i);
        }
        TitleSizeDto titleSizeDto = this.titleSize;
        if (titleSizeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            titleSizeDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ SuperAppShowcaseHalfTileTitleBlockDto(String str, String str2, SuperAppShowcaseHalfTileAlignDto superAppShowcaseHalfTileAlignDto, TitleSizeDto titleSizeDto, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : superAppShowcaseHalfTileAlignDto, (i & 8) != 0 ? null : titleSizeDto);
    }
}
