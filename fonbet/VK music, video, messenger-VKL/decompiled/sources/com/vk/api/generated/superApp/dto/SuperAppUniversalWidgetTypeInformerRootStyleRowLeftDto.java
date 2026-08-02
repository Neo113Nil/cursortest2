package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SuperAppUniversalWidgetTypeInformerRootStyleRowLeftDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetTypeInformerRootStyleRowLeftDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetTypeInformerRootStyleRowLeftDto> CREATOR = new a();

    @pmi0("badge")
    private final SuperAppUniversalWidgetBaseBadgeStyleDto badge;

    @pmi0("icon")
    private final SuperAppUniversalWidgetIconStyleDto icon;

    @pmi0("image")
    private final SuperAppUniversalWidgetImageStyleDto image;

    @pmi0("size")
    private final SizeDto size;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SuperAppUniversalWidgetTypeInformerRootStyleRowLeftDto.kt */
    public static final class SizeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SizeDto[] $VALUES;
        public static final Parcelable.Creator<SizeDto> CREATOR;

        @pmi0("large")
        public static final SizeDto LARGE;

        @pmi0("medium")
        public static final SizeDto MEDIUM;

        @pmi0("small")
        public static final SizeDto SMALL;
        private final String value;

        /* compiled from: SuperAppUniversalWidgetTypeInformerRootStyleRowLeftDto.kt */
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
            SizeDto sizeDto = new SizeDto("SMALL", 0, "small");
            SMALL = sizeDto;
            SizeDto sizeDto2 = new SizeDto("MEDIUM", 1, "medium");
            MEDIUM = sizeDto2;
            SizeDto sizeDto3 = new SizeDto("LARGE", 2, "large");
            LARGE = sizeDto3;
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

    /* compiled from: SuperAppUniversalWidgetTypeInformerRootStyleRowLeftDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetTypeInformerRootStyleRowLeftDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTypeInformerRootStyleRowLeftDto createFromParcel(Parcel parcel) {
            return new SuperAppUniversalWidgetTypeInformerRootStyleRowLeftDto(SizeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetImageStyleDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetIconStyleDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SuperAppUniversalWidgetBaseBadgeStyleDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTypeInformerRootStyleRowLeftDto[] newArray(int i) {
            return new SuperAppUniversalWidgetTypeInformerRootStyleRowLeftDto[i];
        }
    }

    public SuperAppUniversalWidgetTypeInformerRootStyleRowLeftDto(SizeDto sizeDto, SuperAppUniversalWidgetImageStyleDto superAppUniversalWidgetImageStyleDto, SuperAppUniversalWidgetIconStyleDto superAppUniversalWidgetIconStyleDto, SuperAppUniversalWidgetBaseBadgeStyleDto superAppUniversalWidgetBaseBadgeStyleDto) {
        this.size = sizeDto;
        this.image = superAppUniversalWidgetImageStyleDto;
        this.icon = superAppUniversalWidgetIconStyleDto;
        this.badge = superAppUniversalWidgetBaseBadgeStyleDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppUniversalWidgetTypeInformerRootStyleRowLeftDto)) {
            return false;
        }
        SuperAppUniversalWidgetTypeInformerRootStyleRowLeftDto superAppUniversalWidgetTypeInformerRootStyleRowLeftDto = (SuperAppUniversalWidgetTypeInformerRootStyleRowLeftDto) obj;
        return this.size == superAppUniversalWidgetTypeInformerRootStyleRowLeftDto.size && epx.f(this.image, superAppUniversalWidgetTypeInformerRootStyleRowLeftDto.image) && epx.f(this.icon, superAppUniversalWidgetTypeInformerRootStyleRowLeftDto.icon) && epx.f(this.badge, superAppUniversalWidgetTypeInformerRootStyleRowLeftDto.badge);
    }

    public final int hashCode() {
        int hashCode = this.size.hashCode() * 31;
        SuperAppUniversalWidgetImageStyleDto superAppUniversalWidgetImageStyleDto = this.image;
        int hashCode2 = (hashCode + (superAppUniversalWidgetImageStyleDto == null ? 0 : superAppUniversalWidgetImageStyleDto.hashCode())) * 31;
        SuperAppUniversalWidgetIconStyleDto superAppUniversalWidgetIconStyleDto = this.icon;
        int hashCode3 = (hashCode2 + (superAppUniversalWidgetIconStyleDto == null ? 0 : superAppUniversalWidgetIconStyleDto.hashCode())) * 31;
        SuperAppUniversalWidgetBaseBadgeStyleDto superAppUniversalWidgetBaseBadgeStyleDto = this.badge;
        return hashCode3 + (superAppUniversalWidgetBaseBadgeStyleDto != null ? superAppUniversalWidgetBaseBadgeStyleDto.hashCode() : 0);
    }

    public final String toString() {
        return "SuperAppUniversalWidgetTypeInformerRootStyleRowLeftDto(size=" + this.size + ", image=" + this.image + ", icon=" + this.icon + ", badge=" + this.badge + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.size.writeToParcel(parcel, i);
        SuperAppUniversalWidgetImageStyleDto superAppUniversalWidgetImageStyleDto = this.image;
        if (superAppUniversalWidgetImageStyleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetImageStyleDto.writeToParcel(parcel, i);
        }
        SuperAppUniversalWidgetIconStyleDto superAppUniversalWidgetIconStyleDto = this.icon;
        if (superAppUniversalWidgetIconStyleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetIconStyleDto.writeToParcel(parcel, i);
        }
        SuperAppUniversalWidgetBaseBadgeStyleDto superAppUniversalWidgetBaseBadgeStyleDto = this.badge;
        if (superAppUniversalWidgetBaseBadgeStyleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetBaseBadgeStyleDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ SuperAppUniversalWidgetTypeInformerRootStyleRowLeftDto(SizeDto sizeDto, SuperAppUniversalWidgetImageStyleDto superAppUniversalWidgetImageStyleDto, SuperAppUniversalWidgetIconStyleDto superAppUniversalWidgetIconStyleDto, SuperAppUniversalWidgetBaseBadgeStyleDto superAppUniversalWidgetBaseBadgeStyleDto, int i, zcl zclVar) {
        this(sizeDto, (i & 2) != 0 ? null : superAppUniversalWidgetImageStyleDto, (i & 4) != 0 ? null : superAppUniversalWidgetIconStyleDto, (i & 8) != 0 ? null : superAppUniversalWidgetBaseBadgeStyleDto);
    }
}
