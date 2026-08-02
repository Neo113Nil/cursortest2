package com.vk.api.generated.superAppShowcase.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetActionDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetImageBlockDto;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zrp;
import xsna.zyk0;

/* compiled from: SuperAppShowcaseScrollItemDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppShowcaseScrollItemDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppShowcaseScrollItemDto> CREATOR = new a();

    @pmi0("action")
    private final SuperAppUniversalWidgetActionDto action;

    @pmi0("image")
    private final SuperAppUniversalWidgetImageBlockDto image;

    @pmi0("image_style")
    private final ImageStyleDto imageStyle;

    @pmi0("title")
    private final String title;

    @pmi0("uid")
    private final String uid;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SuperAppShowcaseScrollItemDto.kt */
    public static final class ImageStyleDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ImageStyleDto[] $VALUES;

        @pmi0("circle")
        public static final ImageStyleDto CIRCLE;
        public static final Parcelable.Creator<ImageStyleDto> CREATOR;

        @pmi0("square")
        public static final ImageStyleDto SQUARE;
        private final String value;

        /* compiled from: SuperAppShowcaseScrollItemDto.kt */
        public static final class a implements Parcelable.Creator<ImageStyleDto> {
            @Override // android.os.Parcelable.Creator
            public final ImageStyleDto createFromParcel(Parcel parcel) {
                return ImageStyleDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ImageStyleDto[] newArray(int i) {
                return new ImageStyleDto[i];
            }
        }

        static {
            ImageStyleDto imageStyleDto = new ImageStyleDto("CIRCLE", 0, "circle");
            CIRCLE = imageStyleDto;
            ImageStyleDto imageStyleDto2 = new ImageStyleDto("SQUARE", 1, "square");
            SQUARE = imageStyleDto2;
            ImageStyleDto[] imageStyleDtoArr = {imageStyleDto, imageStyleDto2};
            $VALUES = imageStyleDtoArr;
            $ENTRIES = new asp(imageStyleDtoArr);
            CREATOR = new a();
        }

        private ImageStyleDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ImageStyleDto valueOf(String str) {
            return (ImageStyleDto) Enum.valueOf(ImageStyleDto.class, str);
        }

        public static ImageStyleDto[] values() {
            return (ImageStyleDto[]) $VALUES.clone();
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

    /* compiled from: SuperAppShowcaseScrollItemDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppShowcaseScrollItemDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseScrollItemDto createFromParcel(Parcel parcel) {
            return new SuperAppShowcaseScrollItemDto(parcel.readString(), parcel.readString(), (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppShowcaseScrollItemDto.class.getClassLoader()), (SuperAppUniversalWidgetImageBlockDto) parcel.readParcelable(SuperAppShowcaseScrollItemDto.class.getClassLoader()), ImageStyleDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseScrollItemDto[] newArray(int i) {
            return new SuperAppShowcaseScrollItemDto[i];
        }
    }

    public SuperAppShowcaseScrollItemDto(String str, String str2, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto, ImageStyleDto imageStyleDto) {
        this.uid = str;
        this.title = str2;
        this.action = superAppUniversalWidgetActionDto;
        this.image = superAppUniversalWidgetImageBlockDto;
        this.imageStyle = imageStyleDto;
    }

    public final SuperAppUniversalWidgetActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final SuperAppUniversalWidgetImageBlockDto e() {
        return this.image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppShowcaseScrollItemDto)) {
            return false;
        }
        SuperAppShowcaseScrollItemDto superAppShowcaseScrollItemDto = (SuperAppShowcaseScrollItemDto) obj;
        return epx.f(this.uid, superAppShowcaseScrollItemDto.uid) && epx.f(this.title, superAppShowcaseScrollItemDto.title) && epx.f(this.action, superAppShowcaseScrollItemDto.action) && epx.f(this.image, superAppShowcaseScrollItemDto.image) && this.imageStyle == superAppShowcaseScrollItemDto.imageStyle;
    }

    public final ImageStyleDto f() {
        return this.imageStyle;
    }

    public final String g() {
        return this.uid;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.imageStyle.hashCode() + ((this.image.hashCode() + zyk0.a(this.action, urd0.a(this.uid.hashCode() * 31, 31, this.title), 31)) * 31);
    }

    public final String toString() {
        return "SuperAppShowcaseScrollItemDto(uid=" + this.uid + ", title=" + this.title + ", action=" + this.action + ", image=" + this.image + ", imageStyle=" + this.imageStyle + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uid);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.action, i);
        parcel.writeParcelable(this.image, i);
        this.imageStyle.writeToParcel(parcel, i);
    }
}
