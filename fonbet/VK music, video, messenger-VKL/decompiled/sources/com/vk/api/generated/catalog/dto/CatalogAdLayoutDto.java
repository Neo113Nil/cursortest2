package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CatalogAdLayoutDto.kt */
/* loaded from: classes14.dex */
public final class CatalogAdLayoutDto implements Parcelable {
    public static final Parcelable.Creator<CatalogAdLayoutDto> CREATOR = new a();

    @pmi0(TtmlNode.TAG_STYLE)
    private final StyleDto style;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogAdLayoutDto.kt */
    public static final class StyleDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StyleDto[] $VALUES;
        public static final Parcelable.Creator<StyleDto> CREATOR;

        @pmi0("with_bottom_button")
        public static final StyleDto WITH_BOTTOM_BUTTON;

        @pmi0("with_bottom_dots")
        public static final StyleDto WITH_BOTTOM_DOTS;
        private final String value;

        /* compiled from: CatalogAdLayoutDto.kt */
        public static final class a implements Parcelable.Creator<StyleDto> {
            @Override // android.os.Parcelable.Creator
            public final StyleDto createFromParcel(Parcel parcel) {
                return StyleDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StyleDto[] newArray(int i) {
                return new StyleDto[i];
            }
        }

        static {
            StyleDto styleDto = new StyleDto("WITH_BOTTOM_BUTTON", 0, "with_bottom_button");
            WITH_BOTTOM_BUTTON = styleDto;
            StyleDto styleDto2 = new StyleDto("WITH_BOTTOM_DOTS", 1, "with_bottom_dots");
            WITH_BOTTOM_DOTS = styleDto2;
            StyleDto[] styleDtoArr = {styleDto, styleDto2};
            $VALUES = styleDtoArr;
            $ENTRIES = new asp(styleDtoArr);
            CREATOR = new a();
        }

        private StyleDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static StyleDto valueOf(String str) {
            return (StyleDto) Enum.valueOf(StyleDto.class, str);
        }

        public static StyleDto[] values() {
            return (StyleDto[]) $VALUES.clone();
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

    /* compiled from: CatalogAdLayoutDto.kt */
    public static final class a implements Parcelable.Creator<CatalogAdLayoutDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogAdLayoutDto createFromParcel(Parcel parcel) {
            return new CatalogAdLayoutDto(parcel.readInt() == 0 ? null : StyleDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogAdLayoutDto[] newArray(int i) {
            return new CatalogAdLayoutDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogAdLayoutDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CatalogAdLayoutDto) && this.style == ((CatalogAdLayoutDto) obj).style;
    }

    public final int hashCode() {
        StyleDto styleDto = this.style;
        if (styleDto == null) {
            return 0;
        }
        return styleDto.hashCode();
    }

    public final String toString() {
        return "CatalogAdLayoutDto(style=" + this.style + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        StyleDto styleDto = this.style;
        if (styleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            styleDto.writeToParcel(parcel, i);
        }
    }

    public CatalogAdLayoutDto(StyleDto styleDto) {
        this.style = styleDto;
    }

    public /* synthetic */ CatalogAdLayoutDto(StyleDto styleDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : styleDto);
    }
}
