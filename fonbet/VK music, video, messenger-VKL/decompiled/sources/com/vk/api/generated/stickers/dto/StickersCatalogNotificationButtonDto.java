package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: StickersCatalogNotificationButtonDto.kt */
/* loaded from: classes15.dex */
public final class StickersCatalogNotificationButtonDto implements Parcelable {
    public static final Parcelable.Creator<StickersCatalogNotificationButtonDto> CREATOR = new a();

    @pmi0("action")
    private final BaseLinkButtonActionDto action;

    @pmi0(TtmlNode.TAG_STYLE)
    private final StyleDto style;

    @pmi0("title")
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StickersCatalogNotificationButtonDto.kt */
    public static final class StyleDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StyleDto[] $VALUES;
        public static final Parcelable.Creator<StyleDto> CREATOR;

        @pmi0("primary")
        public static final StyleDto PRIMARY;

        @pmi0(X3.i.Y)
        public static final StyleDto SECONDARY;
        private final String value;

        /* compiled from: StickersCatalogNotificationButtonDto.kt */
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
            StyleDto styleDto = new StyleDto("PRIMARY", 0, "primary");
            PRIMARY = styleDto;
            StyleDto styleDto2 = new StyleDto("SECONDARY", 1, X3.i.Y);
            SECONDARY = styleDto2;
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

    /* compiled from: StickersCatalogNotificationButtonDto.kt */
    public static final class a implements Parcelable.Creator<StickersCatalogNotificationButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersCatalogNotificationButtonDto createFromParcel(Parcel parcel) {
            return new StickersCatalogNotificationButtonDto((BaseLinkButtonActionDto) parcel.readParcelable(StickersCatalogNotificationButtonDto.class.getClassLoader()), parcel.readInt() == 0 ? null : StyleDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StickersCatalogNotificationButtonDto[] newArray(int i) {
            return new StickersCatalogNotificationButtonDto[i];
        }
    }

    public StickersCatalogNotificationButtonDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersCatalogNotificationButtonDto)) {
            return false;
        }
        StickersCatalogNotificationButtonDto stickersCatalogNotificationButtonDto = (StickersCatalogNotificationButtonDto) obj;
        return epx.f(this.action, stickersCatalogNotificationButtonDto.action) && this.style == stickersCatalogNotificationButtonDto.style && epx.f(this.title, stickersCatalogNotificationButtonDto.title);
    }

    public final int hashCode() {
        BaseLinkButtonActionDto baseLinkButtonActionDto = this.action;
        int hashCode = (baseLinkButtonActionDto == null ? 0 : baseLinkButtonActionDto.hashCode()) * 31;
        StyleDto styleDto = this.style;
        int hashCode2 = (hashCode + (styleDto == null ? 0 : styleDto.hashCode())) * 31;
        String str = this.title;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersCatalogNotificationButtonDto(action=");
        sb.append(this.action);
        sb.append(", style=");
        sb.append(this.style);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.action, i);
        StyleDto styleDto = this.style;
        if (styleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            styleDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.title);
    }

    public StickersCatalogNotificationButtonDto(BaseLinkButtonActionDto baseLinkButtonActionDto, StyleDto styleDto, String str) {
        this.action = baseLinkButtonActionDto;
        this.style = styleDto;
        this.title = str;
    }

    public /* synthetic */ StickersCatalogNotificationButtonDto(BaseLinkButtonActionDto baseLinkButtonActionDto, StyleDto styleDto, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : baseLinkButtonActionDto, (i & 2) != 0 ? null : styleDto, (i & 4) != 0 ? null : str);
    }
}
