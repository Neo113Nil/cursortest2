package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MarketIntegrationSettingsAdminBannerActionDto.kt */
/* loaded from: classes15.dex */
public final class MarketIntegrationSettingsAdminBannerActionDto implements Parcelable {
    public static final Parcelable.Creator<MarketIntegrationSettingsAdminBannerActionDto> CREATOR = new a();

    @pmi0("open_modal")
    private final Boolean openModal;

    @pmi0(TtmlNode.TAG_STYLE)
    private final StyleDto style;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketIntegrationSettingsAdminBannerActionDto.kt */
    public static final class StyleDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StyleDto[] $VALUES;
        public static final Parcelable.Creator<StyleDto> CREATOR;

        @pmi0("primary")
        public static final StyleDto PRIMARY;

        @pmi0(X3.i.Y)
        public static final StyleDto SECONDARY;
        private final String value;

        /* compiled from: MarketIntegrationSettingsAdminBannerActionDto.kt */
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketIntegrationSettingsAdminBannerActionDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("allow_vk_products")
        public static final TypeDto ALLOW_VK_PRODUCTS;

        @pmi0("cancel")
        public static final TypeDto CANCEL;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("do_not_restore_vk_products")
        public static final TypeDto DO_NOT_RESTORE_VK_PRODUCTS;

        @pmi0("hide_limit_banner")
        public static final TypeDto HIDE_LIMIT_BANNER;

        @pmi0("hide_vk_products")
        public static final TypeDto HIDE_VK_PRODUCTS;

        @pmi0("restore_vk_products")
        public static final TypeDto RESTORE_VK_PRODUCTS;
        private final String value;

        /* compiled from: MarketIntegrationSettingsAdminBannerActionDto.kt */
        public static final class a implements Parcelable.Creator<TypeDto> {
            @Override // android.os.Parcelable.Creator
            public final TypeDto createFromParcel(Parcel parcel) {
                return TypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TypeDto[] newArray(int i) {
                return new TypeDto[i];
            }
        }

        static {
            TypeDto typeDto = new TypeDto("HIDE_VK_PRODUCTS", 0, "hide_vk_products");
            HIDE_VK_PRODUCTS = typeDto;
            TypeDto typeDto2 = new TypeDto("ALLOW_VK_PRODUCTS", 1, "allow_vk_products");
            ALLOW_VK_PRODUCTS = typeDto2;
            TypeDto typeDto3 = new TypeDto("RESTORE_VK_PRODUCTS", 2, "restore_vk_products");
            RESTORE_VK_PRODUCTS = typeDto3;
            TypeDto typeDto4 = new TypeDto("DO_NOT_RESTORE_VK_PRODUCTS", 3, "do_not_restore_vk_products");
            DO_NOT_RESTORE_VK_PRODUCTS = typeDto4;
            TypeDto typeDto5 = new TypeDto("CANCEL", 4, "cancel");
            CANCEL = typeDto5;
            TypeDto typeDto6 = new TypeDto("HIDE_LIMIT_BANNER", 5, "hide_limit_banner");
            HIDE_LIMIT_BANNER = typeDto6;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
            CREATOR = new a();
        }

        private TypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
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

    /* compiled from: MarketIntegrationSettingsAdminBannerActionDto.kt */
    public static final class a implements Parcelable.Creator<MarketIntegrationSettingsAdminBannerActionDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketIntegrationSettingsAdminBannerActionDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarketIntegrationSettingsAdminBannerActionDto(createFromParcel, readString, valueOf, parcel.readInt() != 0 ? StyleDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketIntegrationSettingsAdminBannerActionDto[] newArray(int i) {
            return new MarketIntegrationSettingsAdminBannerActionDto[i];
        }
    }

    public MarketIntegrationSettingsAdminBannerActionDto(TypeDto typeDto, String str, Boolean bool, StyleDto styleDto) {
        this.type = typeDto;
        this.title = str;
        this.openModal = bool;
        this.style = styleDto;
    }

    public final StyleDto d() {
        return this.style;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final TypeDto e() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketIntegrationSettingsAdminBannerActionDto)) {
            return false;
        }
        MarketIntegrationSettingsAdminBannerActionDto marketIntegrationSettingsAdminBannerActionDto = (MarketIntegrationSettingsAdminBannerActionDto) obj;
        return this.type == marketIntegrationSettingsAdminBannerActionDto.type && epx.f(this.title, marketIntegrationSettingsAdminBannerActionDto.title) && epx.f(this.openModal, marketIntegrationSettingsAdminBannerActionDto.openModal) && this.style == marketIntegrationSettingsAdminBannerActionDto.style;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.type.hashCode() * 31, 31, this.title);
        Boolean bool = this.openModal;
        int hashCode = (a2 + (bool == null ? 0 : bool.hashCode())) * 31;
        StyleDto styleDto = this.style;
        return hashCode + (styleDto != null ? styleDto.hashCode() : 0);
    }

    public final String toString() {
        return "MarketIntegrationSettingsAdminBannerActionDto(type=" + this.type + ", title=" + this.title + ", openModal=" + this.openModal + ", style=" + this.style + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        Boolean bool = this.openModal;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        StyleDto styleDto = this.style;
        if (styleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            styleDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarketIntegrationSettingsAdminBannerActionDto(TypeDto typeDto, String str, Boolean bool, StyleDto styleDto, int i, zcl zclVar) {
        this(typeDto, str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : styleDto);
    }
}
