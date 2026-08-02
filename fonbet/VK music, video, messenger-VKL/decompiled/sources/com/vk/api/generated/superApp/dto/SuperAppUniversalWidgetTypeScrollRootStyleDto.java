package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SuperAppUniversalWidgetTypeScrollRootStyleDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetTypeScrollRootStyleDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetTypeScrollRootStyleDto> CREATOR = new a();

    @pmi0("align")
    private final SuperAppUniversalWidgetAlignDto align;

    @pmi0("badge")
    private final SuperAppUniversalWidgetBaseBadgeStyleDto badge;

    @pmi0("description")
    private final SuperAppUniversalWidgetTextStyleDto description;

    @pmi0("image")
    private final SuperAppUniversalWidgetImageStyleDto image;

    @pmi0("size")
    private final SizeDto size;

    @pmi0("title")
    private final SuperAppUniversalWidgetTextStyleDto title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SuperAppUniversalWidgetTypeScrollRootStyleDto.kt */
    public static final class SizeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SizeDto[] $VALUES;
        public static final Parcelable.Creator<SizeDto> CREATOR;

        @pmi0("extra_large")
        public static final SizeDto EXTRA_LARGE;

        @pmi0("large")
        public static final SizeDto LARGE;

        @pmi0("regular")
        public static final SizeDto REGULAR;
        private final String value;

        /* compiled from: SuperAppUniversalWidgetTypeScrollRootStyleDto.kt */
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
            SizeDto sizeDto3 = new SizeDto("EXTRA_LARGE", 2, "extra_large");
            EXTRA_LARGE = sizeDto3;
            SizeDto[] sizeDtoArr = {sizeDto, sizeDto2, sizeDto3};
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

    /* compiled from: SuperAppUniversalWidgetTypeScrollRootStyleDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetTypeScrollRootStyleDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTypeScrollRootStyleDto createFromParcel(Parcel parcel) {
            return new SuperAppUniversalWidgetTypeScrollRootStyleDto(parcel.readInt() == 0 ? null : SizeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetImageStyleDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetTextStyleDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetTextStyleDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetAlignDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SuperAppUniversalWidgetBaseBadgeStyleDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTypeScrollRootStyleDto[] newArray(int i) {
            return new SuperAppUniversalWidgetTypeScrollRootStyleDto[i];
        }
    }

    public SuperAppUniversalWidgetTypeScrollRootStyleDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppUniversalWidgetTypeScrollRootStyleDto)) {
            return false;
        }
        SuperAppUniversalWidgetTypeScrollRootStyleDto superAppUniversalWidgetTypeScrollRootStyleDto = (SuperAppUniversalWidgetTypeScrollRootStyleDto) obj;
        return this.size == superAppUniversalWidgetTypeScrollRootStyleDto.size && epx.f(this.image, superAppUniversalWidgetTypeScrollRootStyleDto.image) && epx.f(this.title, superAppUniversalWidgetTypeScrollRootStyleDto.title) && epx.f(this.description, superAppUniversalWidgetTypeScrollRootStyleDto.description) && this.align == superAppUniversalWidgetTypeScrollRootStyleDto.align && epx.f(this.badge, superAppUniversalWidgetTypeScrollRootStyleDto.badge);
    }

    public final int hashCode() {
        SizeDto sizeDto = this.size;
        int hashCode = (sizeDto == null ? 0 : sizeDto.hashCode()) * 31;
        SuperAppUniversalWidgetImageStyleDto superAppUniversalWidgetImageStyleDto = this.image;
        int hashCode2 = (hashCode + (superAppUniversalWidgetImageStyleDto == null ? 0 : superAppUniversalWidgetImageStyleDto.hashCode())) * 31;
        SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto = this.title;
        int hashCode3 = (hashCode2 + (superAppUniversalWidgetTextStyleDto == null ? 0 : superAppUniversalWidgetTextStyleDto.hashCode())) * 31;
        SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto2 = this.description;
        int hashCode4 = (hashCode3 + (superAppUniversalWidgetTextStyleDto2 == null ? 0 : superAppUniversalWidgetTextStyleDto2.hashCode())) * 31;
        SuperAppUniversalWidgetAlignDto superAppUniversalWidgetAlignDto = this.align;
        int hashCode5 = (hashCode4 + (superAppUniversalWidgetAlignDto == null ? 0 : superAppUniversalWidgetAlignDto.hashCode())) * 31;
        SuperAppUniversalWidgetBaseBadgeStyleDto superAppUniversalWidgetBaseBadgeStyleDto = this.badge;
        return hashCode5 + (superAppUniversalWidgetBaseBadgeStyleDto != null ? superAppUniversalWidgetBaseBadgeStyleDto.hashCode() : 0);
    }

    public final String toString() {
        return "SuperAppUniversalWidgetTypeScrollRootStyleDto(size=" + this.size + ", image=" + this.image + ", title=" + this.title + ", description=" + this.description + ", align=" + this.align + ", badge=" + this.badge + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SizeDto sizeDto = this.size;
        if (sizeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sizeDto.writeToParcel(parcel, i);
        }
        SuperAppUniversalWidgetImageStyleDto superAppUniversalWidgetImageStyleDto = this.image;
        if (superAppUniversalWidgetImageStyleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetImageStyleDto.writeToParcel(parcel, i);
        }
        SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto = this.title;
        if (superAppUniversalWidgetTextStyleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetTextStyleDto.writeToParcel(parcel, i);
        }
        SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto2 = this.description;
        if (superAppUniversalWidgetTextStyleDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetTextStyleDto2.writeToParcel(parcel, i);
        }
        SuperAppUniversalWidgetAlignDto superAppUniversalWidgetAlignDto = this.align;
        if (superAppUniversalWidgetAlignDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetAlignDto.writeToParcel(parcel, i);
        }
        SuperAppUniversalWidgetBaseBadgeStyleDto superAppUniversalWidgetBaseBadgeStyleDto = this.badge;
        if (superAppUniversalWidgetBaseBadgeStyleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetBaseBadgeStyleDto.writeToParcel(parcel, i);
        }
    }

    public SuperAppUniversalWidgetTypeScrollRootStyleDto(SizeDto sizeDto, SuperAppUniversalWidgetImageStyleDto superAppUniversalWidgetImageStyleDto, SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto, SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto2, SuperAppUniversalWidgetAlignDto superAppUniversalWidgetAlignDto, SuperAppUniversalWidgetBaseBadgeStyleDto superAppUniversalWidgetBaseBadgeStyleDto) {
        this.size = sizeDto;
        this.image = superAppUniversalWidgetImageStyleDto;
        this.title = superAppUniversalWidgetTextStyleDto;
        this.description = superAppUniversalWidgetTextStyleDto2;
        this.align = superAppUniversalWidgetAlignDto;
        this.badge = superAppUniversalWidgetBaseBadgeStyleDto;
    }

    public /* synthetic */ SuperAppUniversalWidgetTypeScrollRootStyleDto(SizeDto sizeDto, SuperAppUniversalWidgetImageStyleDto superAppUniversalWidgetImageStyleDto, SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto, SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto2, SuperAppUniversalWidgetAlignDto superAppUniversalWidgetAlignDto, SuperAppUniversalWidgetBaseBadgeStyleDto superAppUniversalWidgetBaseBadgeStyleDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : sizeDto, (i & 2) != 0 ? null : superAppUniversalWidgetImageStyleDto, (i & 4) != 0 ? null : superAppUniversalWidgetTextStyleDto, (i & 8) != 0 ? null : superAppUniversalWidgetTextStyleDto2, (i & 16) != 0 ? null : superAppUniversalWidgetAlignDto, (i & 32) != 0 ? null : superAppUniversalWidgetBaseBadgeStyleDto);
    }
}
