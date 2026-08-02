package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: WallWallpostAttachmentMetaDto.kt */
/* loaded from: classes15.dex */
public final class WallWallpostAttachmentMetaDto implements Parcelable {
    public static final Parcelable.Creator<WallWallpostAttachmentMetaDto> CREATOR = new a();

    @pmi0("image_processing_mode")
    private final ImageProcessingModeDto imageProcessingMode;

    @pmi0("info_enabled")
    private final Boolean infoEnabled;

    @pmi0(TtmlNode.TAG_LAYOUT)
    private final LayoutDto layout;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WallWallpostAttachmentMetaDto.kt */
    public static final class ImageProcessingModeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ImageProcessingModeDto[] $VALUES;

        @pmi0("blur")
        public static final ImageProcessingModeDto BLUR;
        public static final Parcelable.Creator<ImageProcessingModeDto> CREATOR;

        @pmi0("crop")
        public static final ImageProcessingModeDto CROP;
        private final String value;

        /* compiled from: WallWallpostAttachmentMetaDto.kt */
        public static final class a implements Parcelable.Creator<ImageProcessingModeDto> {
            @Override // android.os.Parcelable.Creator
            public final ImageProcessingModeDto createFromParcel(Parcel parcel) {
                return ImageProcessingModeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ImageProcessingModeDto[] newArray(int i) {
                return new ImageProcessingModeDto[i];
            }
        }

        static {
            ImageProcessingModeDto imageProcessingModeDto = new ImageProcessingModeDto("BLUR", 0, "blur");
            BLUR = imageProcessingModeDto;
            ImageProcessingModeDto imageProcessingModeDto2 = new ImageProcessingModeDto("CROP", 1, "crop");
            CROP = imageProcessingModeDto2;
            ImageProcessingModeDto[] imageProcessingModeDtoArr = {imageProcessingModeDto, imageProcessingModeDto2};
            $VALUES = imageProcessingModeDtoArr;
            $ENTRIES = new asp(imageProcessingModeDtoArr);
            CREATOR = new a();
        }

        private ImageProcessingModeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ImageProcessingModeDto valueOf(String str) {
            return (ImageProcessingModeDto) Enum.valueOf(ImageProcessingModeDto.class, str);
        }

        public static ImageProcessingModeDto[] values() {
            return (ImageProcessingModeDto[]) $VALUES.clone();
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WallWallpostAttachmentMetaDto.kt */
    public static final class LayoutDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LayoutDto[] $VALUES;
        public static final Parcelable.Creator<LayoutDto> CREATOR;

        @pmi0("rounded")
        public static final LayoutDto ROUNDED;

        @pmi0("wide")
        public static final LayoutDto WIDE;
        private final String value;

        /* compiled from: WallWallpostAttachmentMetaDto.kt */
        public static final class a implements Parcelable.Creator<LayoutDto> {
            @Override // android.os.Parcelable.Creator
            public final LayoutDto createFromParcel(Parcel parcel) {
                return LayoutDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LayoutDto[] newArray(int i) {
                return new LayoutDto[i];
            }
        }

        static {
            LayoutDto layoutDto = new LayoutDto("WIDE", 0, "wide");
            WIDE = layoutDto;
            LayoutDto layoutDto2 = new LayoutDto("ROUNDED", 1, "rounded");
            ROUNDED = layoutDto2;
            LayoutDto[] layoutDtoArr = {layoutDto, layoutDto2};
            $VALUES = layoutDtoArr;
            $ENTRIES = new asp(layoutDtoArr);
            CREATOR = new a();
        }

        private LayoutDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static LayoutDto valueOf(String str) {
            return (LayoutDto) Enum.valueOf(LayoutDto.class, str);
        }

        public static LayoutDto[] values() {
            return (LayoutDto[]) $VALUES.clone();
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

    /* compiled from: WallWallpostAttachmentMetaDto.kt */
    public static final class a implements Parcelable.Creator<WallWallpostAttachmentMetaDto> {
        @Override // android.os.Parcelable.Creator
        public final WallWallpostAttachmentMetaDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            ImageProcessingModeDto createFromParcel = parcel.readInt() == 0 ? null : ImageProcessingModeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new WallWallpostAttachmentMetaDto(createFromParcel, valueOf, parcel.readInt() != 0 ? LayoutDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final WallWallpostAttachmentMetaDto[] newArray(int i) {
            return new WallWallpostAttachmentMetaDto[i];
        }
    }

    public WallWallpostAttachmentMetaDto() {
        this(null, null, null, 7, null);
    }

    public final Boolean d() {
        return this.infoEnabled;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final LayoutDto e() {
        return this.layout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallWallpostAttachmentMetaDto)) {
            return false;
        }
        WallWallpostAttachmentMetaDto wallWallpostAttachmentMetaDto = (WallWallpostAttachmentMetaDto) obj;
        return this.imageProcessingMode == wallWallpostAttachmentMetaDto.imageProcessingMode && epx.f(this.infoEnabled, wallWallpostAttachmentMetaDto.infoEnabled) && this.layout == wallWallpostAttachmentMetaDto.layout;
    }

    public final int hashCode() {
        ImageProcessingModeDto imageProcessingModeDto = this.imageProcessingMode;
        int hashCode = (imageProcessingModeDto == null ? 0 : imageProcessingModeDto.hashCode()) * 31;
        Boolean bool = this.infoEnabled;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        LayoutDto layoutDto = this.layout;
        return hashCode2 + (layoutDto != null ? layoutDto.hashCode() : 0);
    }

    public final String toString() {
        return "WallWallpostAttachmentMetaDto(imageProcessingMode=" + this.imageProcessingMode + ", infoEnabled=" + this.infoEnabled + ", layout=" + this.layout + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ImageProcessingModeDto imageProcessingModeDto = this.imageProcessingMode;
        if (imageProcessingModeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageProcessingModeDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.infoEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        LayoutDto layoutDto = this.layout;
        if (layoutDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            layoutDto.writeToParcel(parcel, i);
        }
    }

    public WallWallpostAttachmentMetaDto(ImageProcessingModeDto imageProcessingModeDto, Boolean bool, LayoutDto layoutDto) {
        this.imageProcessingMode = imageProcessingModeDto;
        this.infoEnabled = bool;
        this.layout = layoutDto;
    }

    public /* synthetic */ WallWallpostAttachmentMetaDto(ImageProcessingModeDto imageProcessingModeDto, Boolean bool, LayoutDto layoutDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : imageProcessingModeDto, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : layoutDto);
    }
}
