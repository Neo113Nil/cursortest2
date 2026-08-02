package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;
import xsna.zyk0;

/* compiled from: SuperAppMiniWidgetItemDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppMiniWidgetItemDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppMiniWidgetItemDto> CREATOR = new a();

    @pmi0("action")
    private final SuperAppUniversalWidgetActionDto action;

    @pmi0("currency_default_symbol")
    private final String currencyDefaultSymbol;

    @pmi0("currency_default_value")
    private final Float currencyDefaultValue;

    @pmi0("currency_delta_percent")
    private final String currencyDeltaPercent;

    @pmi0("currency_name")
    private final String currencyName;

    @pmi0("header_icon")
    private final List<SuperAppUniversalWidgetImageItemDto> headerIcon;

    @pmi0("header_icon_align")
    private final HeaderIconAlignDto headerIconAlign;

    @pmi0("inner_type")
    private final InnerTypeDto innerType;

    @pmi0("is_crop_header_icon")
    private final Boolean isCropHeaderIcon;

    @pmi0("is_enabled")
    private final Boolean isEnabled;

    @pmi0("subtitle")
    private final SuperAppUniversalWidgetTextBlockDto subtitle;

    @pmi0("title")
    private final SuperAppUniversalWidgetTextBlockDto title;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("uid")
    private final String uid;

    @pmi0("widget_id")
    private final String widgetId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SuperAppMiniWidgetItemDto.kt */
    public static final class HeaderIconAlignDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ HeaderIconAlignDto[] $VALUES;

        @pmi0("bottom")
        public static final HeaderIconAlignDto BOTTOM;
        public static final Parcelable.Creator<HeaderIconAlignDto> CREATOR;

        @pmi0("top")
        public static final HeaderIconAlignDto TOP;
        private final String value;

        /* compiled from: SuperAppMiniWidgetItemDto.kt */
        public static final class a implements Parcelable.Creator<HeaderIconAlignDto> {
            @Override // android.os.Parcelable.Creator
            public final HeaderIconAlignDto createFromParcel(Parcel parcel) {
                return HeaderIconAlignDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final HeaderIconAlignDto[] newArray(int i) {
                return new HeaderIconAlignDto[i];
            }
        }

        static {
            HeaderIconAlignDto headerIconAlignDto = new HeaderIconAlignDto("TOP", 0, "top");
            TOP = headerIconAlignDto;
            HeaderIconAlignDto headerIconAlignDto2 = new HeaderIconAlignDto("BOTTOM", 1, "bottom");
            BOTTOM = headerIconAlignDto2;
            HeaderIconAlignDto[] headerIconAlignDtoArr = {headerIconAlignDto, headerIconAlignDto2};
            $VALUES = headerIconAlignDtoArr;
            $ENTRIES = new asp(headerIconAlignDtoArr);
            CREATOR = new a();
        }

        private HeaderIconAlignDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static HeaderIconAlignDto valueOf(String str) {
            return (HeaderIconAlignDto) Enum.valueOf(HeaderIconAlignDto.class, str);
        }

        public static HeaderIconAlignDto[] values() {
            return (HeaderIconAlignDto[]) $VALUES.clone();
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
    /* compiled from: SuperAppMiniWidgetItemDto.kt */
    public static final class InnerTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ InnerTypeDto[] $VALUES;
        public static final Parcelable.Creator<InnerTypeDto> CREATOR;

        @pmi0("mini_widget_item")
        public static final InnerTypeDto MINI_WIDGET_ITEM;
        private final String value;

        /* compiled from: SuperAppMiniWidgetItemDto.kt */
        public static final class a implements Parcelable.Creator<InnerTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final InnerTypeDto createFromParcel(Parcel parcel) {
                return InnerTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final InnerTypeDto[] newArray(int i) {
                return new InnerTypeDto[i];
            }
        }

        static {
            InnerTypeDto innerTypeDto = new InnerTypeDto("MINI_WIDGET_ITEM", 0, "mini_widget_item");
            MINI_WIDGET_ITEM = innerTypeDto;
            InnerTypeDto[] innerTypeDtoArr = {innerTypeDto};
            $VALUES = innerTypeDtoArr;
            $ENTRIES = new asp(innerTypeDtoArr);
            CREATOR = new a();
        }

        private InnerTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static InnerTypeDto valueOf(String str) {
            return (InnerTypeDto) Enum.valueOf(InnerTypeDto.class, str);
        }

        public static InnerTypeDto[] values() {
            return (InnerTypeDto[]) $VALUES.clone();
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
    /* compiled from: SuperAppMiniWidgetItemDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("mw_assistant")
        public static final TypeDto MW_ASSISTANT;

        @pmi0("mw_birthday")
        public static final TypeDto MW_BIRTHDAY;

        @pmi0("mw_covid")
        public static final TypeDto MW_COVID;

        @pmi0("mw_exchange")
        public static final TypeDto MW_EXCHANGE;

        @pmi0("mw_music")
        public static final TypeDto MW_MUSIC;

        @pmi0("mw_settings")
        public static final TypeDto MW_SETTINGS;

        @pmi0("mw_steps")
        public static final TypeDto MW_STEPS;

        @pmi0("mw_weather")
        public static final TypeDto MW_WEATHER;
        private final String value;

        /* compiled from: SuperAppMiniWidgetItemDto.kt */
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
            TypeDto typeDto = new TypeDto("MW_STEPS", 0, "mw_steps");
            MW_STEPS = typeDto;
            TypeDto typeDto2 = new TypeDto("MW_COVID", 1, "mw_covid");
            MW_COVID = typeDto2;
            TypeDto typeDto3 = new TypeDto("MW_MUSIC", 2, "mw_music");
            MW_MUSIC = typeDto3;
            TypeDto typeDto4 = new TypeDto("MW_WEATHER", 3, "mw_weather");
            MW_WEATHER = typeDto4;
            TypeDto typeDto5 = new TypeDto("MW_EXCHANGE", 4, "mw_exchange");
            MW_EXCHANGE = typeDto5;
            TypeDto typeDto6 = new TypeDto("MW_ASSISTANT", 5, "mw_assistant");
            MW_ASSISTANT = typeDto6;
            TypeDto typeDto7 = new TypeDto("MW_BIRTHDAY", 6, "mw_birthday");
            MW_BIRTHDAY = typeDto7;
            TypeDto typeDto8 = new TypeDto("MW_SETTINGS", 7, "mw_settings");
            MW_SETTINGS = typeDto8;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6, typeDto7, typeDto8};
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

    /* compiled from: SuperAppMiniWidgetItemDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppMiniWidgetItemDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppMiniWidgetItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean valueOf;
            InnerTypeDto createFromParcel = InnerTypeDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            TypeDto createFromParcel2 = TypeDto.CREATOR.createFromParcel(parcel);
            SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppMiniWidgetItemDto.class.getClassLoader());
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            HeaderIconAlignDto createFromParcel3 = parcel.readInt() == 0 ? null : HeaderIconAlignDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            SuperAppUniversalWidgetTextBlockDto createFromParcel4 = parcel.readInt() == 0 ? null : SuperAppUniversalWidgetTextBlockDto.CREATOR.createFromParcel(parcel);
            SuperAppUniversalWidgetTextBlockDto createFromParcel5 = parcel.readInt() == 0 ? null : SuperAppUniversalWidgetTextBlockDto.CREATOR.createFromParcel(parcel);
            ArrayList arrayList2 = arrayList;
            Boolean bool2 = valueOf;
            String readString3 = parcel.readString();
            Float valueOf2 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            String readString4 = parcel.readString();
            Float f = valueOf2;
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SuperAppMiniWidgetItemDto(createFromParcel, readString, readString2, createFromParcel2, superAppUniversalWidgetActionDto, arrayList2, createFromParcel3, bool2, createFromParcel4, createFromParcel5, readString3, f, readString4, readString5, readString6, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppMiniWidgetItemDto[] newArray(int i) {
            return new SuperAppMiniWidgetItemDto[i];
        }
    }

    public SuperAppMiniWidgetItemDto(InnerTypeDto innerTypeDto, String str, String str2, TypeDto typeDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, List<SuperAppUniversalWidgetImageItemDto> list, HeaderIconAlignDto headerIconAlignDto, Boolean bool, SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto, SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto2, String str3, Float f, String str4, String str5, String str6, Boolean bool2) {
        this.innerType = innerTypeDto;
        this.widgetId = str;
        this.uid = str2;
        this.type = typeDto;
        this.action = superAppUniversalWidgetActionDto;
        this.headerIcon = list;
        this.headerIconAlign = headerIconAlignDto;
        this.isCropHeaderIcon = bool;
        this.title = superAppUniversalWidgetTextBlockDto;
        this.subtitle = superAppUniversalWidgetTextBlockDto2;
        this.currencyDefaultSymbol = str3;
        this.currencyDefaultValue = f;
        this.currencyName = str4;
        this.currencyDeltaPercent = str5;
        this.trackCode = str6;
        this.isEnabled = bool2;
    }

    public final Boolean B() {
        return this.isEnabled;
    }

    public final SuperAppUniversalWidgetActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.currencyDefaultSymbol;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppMiniWidgetItemDto)) {
            return false;
        }
        SuperAppMiniWidgetItemDto superAppMiniWidgetItemDto = (SuperAppMiniWidgetItemDto) obj;
        return this.innerType == superAppMiniWidgetItemDto.innerType && epx.f(this.widgetId, superAppMiniWidgetItemDto.widgetId) && epx.f(this.uid, superAppMiniWidgetItemDto.uid) && this.type == superAppMiniWidgetItemDto.type && epx.f(this.action, superAppMiniWidgetItemDto.action) && epx.f(this.headerIcon, superAppMiniWidgetItemDto.headerIcon) && this.headerIconAlign == superAppMiniWidgetItemDto.headerIconAlign && epx.f(this.isCropHeaderIcon, superAppMiniWidgetItemDto.isCropHeaderIcon) && epx.f(this.title, superAppMiniWidgetItemDto.title) && epx.f(this.subtitle, superAppMiniWidgetItemDto.subtitle) && epx.f(this.currencyDefaultSymbol, superAppMiniWidgetItemDto.currencyDefaultSymbol) && epx.f(this.currencyDefaultValue, superAppMiniWidgetItemDto.currencyDefaultValue) && epx.f(this.currencyName, superAppMiniWidgetItemDto.currencyName) && epx.f(this.currencyDeltaPercent, superAppMiniWidgetItemDto.currencyDeltaPercent) && epx.f(this.trackCode, superAppMiniWidgetItemDto.trackCode) && epx.f(this.isEnabled, superAppMiniWidgetItemDto.isEnabled);
    }

    public final Float f() {
        return this.currencyDefaultValue;
    }

    public final String g() {
        return this.currencyDeltaPercent;
    }

    public final int hashCode() {
        int a2 = zyk0.a(this.action, (this.type.hashCode() + urd0.a(urd0.a(this.innerType.hashCode() * 31, 31, this.widgetId), 31, this.uid)) * 31, 31);
        List<SuperAppUniversalWidgetImageItemDto> list = this.headerIcon;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        HeaderIconAlignDto headerIconAlignDto = this.headerIconAlign;
        int hashCode2 = (hashCode + (headerIconAlignDto == null ? 0 : headerIconAlignDto.hashCode())) * 31;
        Boolean bool = this.isCropHeaderIcon;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto = this.title;
        int hashCode4 = (hashCode3 + (superAppUniversalWidgetTextBlockDto == null ? 0 : superAppUniversalWidgetTextBlockDto.hashCode())) * 31;
        SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto2 = this.subtitle;
        int hashCode5 = (hashCode4 + (superAppUniversalWidgetTextBlockDto2 == null ? 0 : superAppUniversalWidgetTextBlockDto2.hashCode())) * 31;
        String str = this.currencyDefaultSymbol;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.currencyDefaultValue;
        int hashCode7 = (hashCode6 + (f == null ? 0 : f.hashCode())) * 31;
        String str2 = this.currencyName;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currencyDeltaPercent;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.trackCode;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.isEnabled;
        return hashCode10 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String i() {
        return this.currencyName;
    }

    public final List<SuperAppUniversalWidgetImageItemDto> j() {
        return this.headerIcon;
    }

    public final HeaderIconAlignDto k() {
        return this.headerIconAlign;
    }

    public final SuperAppUniversalWidgetTextBlockDto l() {
        return this.subtitle;
    }

    public final SuperAppUniversalWidgetTextBlockDto n() {
        return this.title;
    }

    public final TypeDto o() {
        return this.type;
    }

    public final String p() {
        return this.uid;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppMiniWidgetItemDto(innerType=");
        sb.append(this.innerType);
        sb.append(", widgetId=");
        sb.append(this.widgetId);
        sb.append(", uid=");
        sb.append(this.uid);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", headerIcon=");
        sb.append(this.headerIcon);
        sb.append(", headerIconAlign=");
        sb.append(this.headerIconAlign);
        sb.append(", isCropHeaderIcon=");
        sb.append(this.isCropHeaderIcon);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", currencyDefaultSymbol=");
        sb.append(this.currencyDefaultSymbol);
        sb.append(", currencyDefaultValue=");
        sb.append(this.currencyDefaultValue);
        sb.append(", currencyName=");
        sb.append(this.currencyName);
        sb.append(", currencyDeltaPercent=");
        sb.append(this.currencyDeltaPercent);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", isEnabled=");
        return tn.a(sb, this.isEnabled, ')');
    }

    public final Boolean u() {
        return this.isCropHeaderIcon;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.innerType.writeToParcel(parcel, i);
        parcel.writeString(this.widgetId);
        parcel.writeString(this.uid);
        this.type.writeToParcel(parcel, i);
        parcel.writeParcelable(this.action, i);
        List<SuperAppUniversalWidgetImageItemDto> list = this.headerIcon;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((SuperAppUniversalWidgetImageItemDto) f.next()).writeToParcel(parcel, i);
            }
        }
        HeaderIconAlignDto headerIconAlignDto = this.headerIconAlign;
        if (headerIconAlignDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            headerIconAlignDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.isCropHeaderIcon;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto = this.title;
        if (superAppUniversalWidgetTextBlockDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetTextBlockDto.writeToParcel(parcel, i);
        }
        SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto2 = this.subtitle;
        if (superAppUniversalWidgetTextBlockDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetTextBlockDto2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.currencyDefaultSymbol);
        Float f2 = this.currencyDefaultValue;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f2);
        }
        parcel.writeString(this.currencyName);
        parcel.writeString(this.currencyDeltaPercent);
        parcel.writeString(this.trackCode);
        Boolean bool2 = this.isEnabled;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
    }

    public /* synthetic */ SuperAppMiniWidgetItemDto(InnerTypeDto innerTypeDto, String str, String str2, TypeDto typeDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, List list, HeaderIconAlignDto headerIconAlignDto, Boolean bool, SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto, SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto2, String str3, Float f, String str4, String str5, String str6, Boolean bool2, int i, zcl zclVar) {
        this(innerTypeDto, str, str2, typeDto, superAppUniversalWidgetActionDto, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : headerIconAlignDto, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : superAppUniversalWidgetTextBlockDto, (i & 512) != 0 ? null : superAppUniversalWidgetTextBlockDto2, (i & 1024) != 0 ? null : str3, (i & 2048) != 0 ? null : f, (i & 4096) != 0 ? null : str4, (i & 8192) != 0 ? null : str5, (i & 16384) != 0 ? null : str6, (i & 32768) != 0 ? null : bool2);
    }
}
