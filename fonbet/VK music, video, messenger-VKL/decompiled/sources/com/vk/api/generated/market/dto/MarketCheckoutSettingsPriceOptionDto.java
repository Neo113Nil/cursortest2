package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MarketCheckoutSettingsPriceOptionDto.kt */
/* loaded from: classes15.dex */
public final class MarketCheckoutSettingsPriceOptionDto implements Parcelable {
    public static final Parcelable.Creator<MarketCheckoutSettingsPriceOptionDto> CREATOR = new a();

    @pmi0("info")
    private final String info;

    @pmi0("is_enabled")
    private final Boolean isEnabled;

    @pmi0("title")
    private final String title;

    @pmi0("tooltip")
    private final MarketCheckoutSettingsPriceOptionTooltipDto tooltip;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketCheckoutSettingsPriceOptionDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("in_chat")
        public static final TypeDto IN_CHAT;

        @pmi0("now")
        public static final TypeDto NOW;
        private final String value;

        /* compiled from: MarketCheckoutSettingsPriceOptionDto.kt */
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
            TypeDto typeDto = new TypeDto("NOW", 0, "now");
            NOW = typeDto;
            TypeDto typeDto2 = new TypeDto("IN_CHAT", 1, "in_chat");
            IN_CHAT = typeDto2;
            TypeDto[] typeDtoArr = {typeDto, typeDto2};
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

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: MarketCheckoutSettingsPriceOptionDto.kt */
    public static final class a implements Parcelable.Creator<MarketCheckoutSettingsPriceOptionDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCheckoutSettingsPriceOptionDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            TypeDto createFromParcel = parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarketCheckoutSettingsPriceOptionDto(createFromParcel, readString, readString2, valueOf, parcel.readInt() == 0 ? null : MarketCheckoutSettingsPriceOptionTooltipDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCheckoutSettingsPriceOptionDto[] newArray(int i) {
            return new MarketCheckoutSettingsPriceOptionDto[i];
        }
    }

    public MarketCheckoutSettingsPriceOptionDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final String d() {
        return this.info;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final MarketCheckoutSettingsPriceOptionTooltipDto e() {
        return this.tooltip;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCheckoutSettingsPriceOptionDto)) {
            return false;
        }
        MarketCheckoutSettingsPriceOptionDto marketCheckoutSettingsPriceOptionDto = (MarketCheckoutSettingsPriceOptionDto) obj;
        return this.type == marketCheckoutSettingsPriceOptionDto.type && epx.f(this.title, marketCheckoutSettingsPriceOptionDto.title) && epx.f(this.info, marketCheckoutSettingsPriceOptionDto.info) && epx.f(this.isEnabled, marketCheckoutSettingsPriceOptionDto.isEnabled) && epx.f(this.tooltip, marketCheckoutSettingsPriceOptionDto.tooltip);
    }

    public final TypeDto f() {
        return this.type;
    }

    public final Boolean g() {
        return this.isEnabled;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        TypeDto typeDto = this.type;
        int hashCode = (typeDto == null ? 0 : typeDto.hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.info;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isEnabled;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        MarketCheckoutSettingsPriceOptionTooltipDto marketCheckoutSettingsPriceOptionTooltipDto = this.tooltip;
        return hashCode4 + (marketCheckoutSettingsPriceOptionTooltipDto != null ? marketCheckoutSettingsPriceOptionTooltipDto.hashCode() : 0);
    }

    public final String toString() {
        return "MarketCheckoutSettingsPriceOptionDto(type=" + this.type + ", title=" + this.title + ", info=" + this.info + ", isEnabled=" + this.isEnabled + ", tooltip=" + this.tooltip + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TypeDto typeDto = this.type;
        if (typeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            typeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.info);
        Boolean bool = this.isEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        MarketCheckoutSettingsPriceOptionTooltipDto marketCheckoutSettingsPriceOptionTooltipDto = this.tooltip;
        if (marketCheckoutSettingsPriceOptionTooltipDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketCheckoutSettingsPriceOptionTooltipDto.writeToParcel(parcel, i);
        }
    }

    public MarketCheckoutSettingsPriceOptionDto(TypeDto typeDto, String str, String str2, Boolean bool, MarketCheckoutSettingsPriceOptionTooltipDto marketCheckoutSettingsPriceOptionTooltipDto) {
        this.type = typeDto;
        this.title = str;
        this.info = str2;
        this.isEnabled = bool;
        this.tooltip = marketCheckoutSettingsPriceOptionTooltipDto;
    }

    public /* synthetic */ MarketCheckoutSettingsPriceOptionDto(TypeDto typeDto, String str, String str2, Boolean bool, MarketCheckoutSettingsPriceOptionTooltipDto marketCheckoutSettingsPriceOptionTooltipDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : typeDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : marketCheckoutSettingsPriceOptionTooltipDto);
    }
}
