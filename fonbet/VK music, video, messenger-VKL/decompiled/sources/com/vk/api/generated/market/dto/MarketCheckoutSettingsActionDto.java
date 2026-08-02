package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MarketCheckoutSettingsActionDto.kt */
/* loaded from: classes15.dex */
public final class MarketCheckoutSettingsActionDto implements Parcelable {
    public static final Parcelable.Creator<MarketCheckoutSettingsActionDto> CREATOR = new a();

    @pmi0("disable_reason")
    private final String disableReason;

    @pmi0("is_accent")
    private final Boolean isAccent;

    @pmi0("is_disabled")
    private final Boolean isDisabled;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketCheckoutSettingsActionDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("do_order")
        public static final TypeDto DO_ORDER;

        @pmi0("open_courier_map")
        public static final TypeDto OPEN_COURIER_MAP;

        @pmi0("open_self_map")
        public static final TypeDto OPEN_SELF_MAP;
        private final String value;

        /* compiled from: MarketCheckoutSettingsActionDto.kt */
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
            TypeDto typeDto = new TypeDto("OPEN_COURIER_MAP", 0, "open_courier_map");
            OPEN_COURIER_MAP = typeDto;
            TypeDto typeDto2 = new TypeDto("OPEN_SELF_MAP", 1, "open_self_map");
            OPEN_SELF_MAP = typeDto2;
            TypeDto typeDto3 = new TypeDto("DO_ORDER", 2, "do_order");
            DO_ORDER = typeDto3;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3};
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

    /* compiled from: MarketCheckoutSettingsActionDto.kt */
    public static final class a implements Parcelable.Creator<MarketCheckoutSettingsActionDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCheckoutSettingsActionDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarketCheckoutSettingsActionDto(readString, createFromParcel, readString2, valueOf, bool, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCheckoutSettingsActionDto[] newArray(int i) {
            return new MarketCheckoutSettingsActionDto[i];
        }
    }

    public MarketCheckoutSettingsActionDto(String str, TypeDto typeDto, String str2, Boolean bool, Boolean bool2, String str3) {
        this.title = str;
        this.type = typeDto;
        this.subtitle = str2;
        this.isDisabled = bool;
        this.isAccent = bool2;
        this.disableReason = str3;
    }

    public final TypeDto d() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.isAccent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCheckoutSettingsActionDto)) {
            return false;
        }
        MarketCheckoutSettingsActionDto marketCheckoutSettingsActionDto = (MarketCheckoutSettingsActionDto) obj;
        return epx.f(this.title, marketCheckoutSettingsActionDto.title) && this.type == marketCheckoutSettingsActionDto.type && epx.f(this.subtitle, marketCheckoutSettingsActionDto.subtitle) && epx.f(this.isDisabled, marketCheckoutSettingsActionDto.isDisabled) && epx.f(this.isAccent, marketCheckoutSettingsActionDto.isAccent) && epx.f(this.disableReason, marketCheckoutSettingsActionDto.disableReason);
    }

    public final Boolean f() {
        return this.isDisabled;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() + (this.title.hashCode() * 31)) * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isDisabled;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isAccent;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.disableReason;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCheckoutSettingsActionDto(title=");
        sb.append(this.title);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", isDisabled=");
        sb.append(this.isDisabled);
        sb.append(", isAccent=");
        sb.append(this.isAccent);
        sb.append(", disableReason=");
        return ho8.a(sb, this.disableReason, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.subtitle);
        Boolean bool = this.isDisabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isAccent;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeString(this.disableReason);
    }

    public /* synthetic */ MarketCheckoutSettingsActionDto(String str, TypeDto typeDto, String str2, Boolean bool, Boolean bool2, String str3, int i, zcl zclVar) {
        this(str, typeDto, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : str3);
    }
}
