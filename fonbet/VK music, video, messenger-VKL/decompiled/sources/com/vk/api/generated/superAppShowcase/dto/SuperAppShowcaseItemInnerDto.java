package com.vk.api.generated.superAppShowcase.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.superApp.dto.SuperAppBadgeInfoDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetActionDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetImageBlockDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetImageItemDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetTextBlockDto;
import io.appmetrica.analytics.impl.L2;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.a9y;
import xsna.ao;
import xsna.asp;
import xsna.b9y;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.go9;
import xsna.ms9;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.up;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;
import xsna.zyk0;

/* compiled from: SuperAppShowcaseItemInnerDto.kt */
/* loaded from: classes.dex */
public abstract class SuperAppShowcaseItemInnerDto implements Parcelable {

    /* compiled from: SuperAppShowcaseItemInnerDto.kt */
    public static final class Deserializer implements a9y<SuperAppShowcaseItemInnerDto> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException
         */
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "inner_type");
            if (f != null) {
                switch (f.hashCode()) {
                    case -579455007:
                        if (f.equals("showcase_menu_item")) {
                            return (SuperAppShowcaseItemInnerDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppCustomMenuItemDto.class);
                        }
                        break;
                    case 3560110:
                        if (f.equals("tile")) {
                            return (SuperAppShowcaseItemInnerDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseTileDto.class);
                        }
                        break;
                    case 106940687:
                        if (f.equals(NotificationCompat.CATEGORY_PROMO)) {
                            return (SuperAppShowcaseItemInnerDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcasePromoDto.class);
                        }
                        break;
                    case 1500114051:
                        if (f.equals("subscribe_tile")) {
                            return (SuperAppShowcaseItemInnerDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseSubscribeTileDto.class);
                        }
                        break;
                    case 1795644486:
                        if (f.equals("mini_widget_item")) {
                            return (SuperAppShowcaseItemInnerDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppMiniWidgetItemDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: SuperAppShowcaseItemInnerDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppCustomMenuItemDto extends SuperAppShowcaseItemInnerDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppCustomMenuItemDto> CREATOR = new a();

        @pmi0("action")
        private final SuperAppUniversalWidgetActionDto action;

        @pmi0("background_color")
        private final List<String> backgroundColor;

        @pmi0("badge_info")
        private final SuperAppBadgeInfoDto badgeInfo;

        @pmi0("icon")
        private final List<BaseImageDto> icon;

        @pmi0("icon_color")
        private final List<String> iconColor;

        @pmi0("images")
        private final List<BaseImageDto> images;

        @pmi0("inner_type")
        private final InnerTypeDto innerType;

        @pmi0("name")
        private final String name;

        @pmi0("title")
        private final String title;

        @pmi0("title_color")
        private final List<String> titleColor;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("uid")
        private final String uid;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseItemInnerDto.kt */
        public static final class InnerTypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ InnerTypeDto[] $VALUES;
            public static final Parcelable.Creator<InnerTypeDto> CREATOR;

            @pmi0("showcase_menu_item")
            public static final InnerTypeDto SHOWCASE_MENU_ITEM;
            private final String value;

            /* compiled from: SuperAppShowcaseItemInnerDto.kt */
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
                InnerTypeDto innerTypeDto = new InnerTypeDto("SHOWCASE_MENU_ITEM", 0, "showcase_menu_item");
                SHOWCASE_MENU_ITEM = innerTypeDto;
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
        /* compiled from: SuperAppShowcaseItemInnerDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("client_menu")
            public static final TypeDto CLIENT_MENU;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("custom_item")
            public static final TypeDto CUSTOM_ITEM;
            private final String value;

            /* compiled from: SuperAppShowcaseItemInnerDto.kt */
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
                TypeDto typeDto = new TypeDto("CUSTOM_ITEM", 0, "custom_item");
                CUSTOM_ITEM = typeDto;
                TypeDto typeDto2 = new TypeDto("CLIENT_MENU", 1, "client_menu");
                CLIENT_MENU = typeDto2;
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

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(name());
            }
        }

        /* compiled from: SuperAppShowcaseItemInnerDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppCustomMenuItemDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppCustomMenuItemDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                InnerTypeDto innerTypeDto;
                InnerTypeDto createFromParcel = InnerTypeDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                TypeDto createFromParcel2 = TypeDto.CREATOR.createFromParcel(parcel);
                String readString2 = parcel.readString();
                SuperAppBadgeInfoDto superAppBadgeInfoDto = (SuperAppBadgeInfoDto) parcel.readParcelable(SuperAppCustomMenuItemDto.class.getClassLoader());
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = bo.b(SuperAppCustomMenuItemDto.class, parcel, arrayList, i, 1);
                    }
                }
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                ArrayList arrayList2 = null;
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                ArrayList arrayList3 = arrayList;
                ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
                if (parcel.readInt() == 0) {
                    innerTypeDto = createFromParcel;
                } else {
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(readInt2);
                    innerTypeDto = createFromParcel;
                    int i2 = 0;
                    while (i2 != readInt2) {
                        i2 = bo.b(SuperAppCustomMenuItemDto.class, parcel, arrayList4, i2, 1);
                    }
                    arrayList2 = arrayList4;
                }
                return new SuperAppCustomMenuItemDto(innerTypeDto, readString, createFromParcel2, readString2, superAppBadgeInfoDto, readString3, readString4, arrayList3, createStringArrayList, createStringArrayList2, createStringArrayList3, arrayList2, (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppCustomMenuItemDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppCustomMenuItemDto[] newArray(int i) {
                return new SuperAppCustomMenuItemDto[i];
            }
        }

        public /* synthetic */ SuperAppCustomMenuItemDto(InnerTypeDto innerTypeDto, String str, TypeDto typeDto, String str2, SuperAppBadgeInfoDto superAppBadgeInfoDto, String str3, String str4, List list, List list2, List list3, List list4, List list5, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, int i, zcl zclVar) {
            this(innerTypeDto, str, typeDto, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : superAppBadgeInfoDto, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : list2, (i & 512) != 0 ? null : list3, (i & 1024) != 0 ? null : list4, (i & 2048) != 0 ? null : list5, (i & 4096) != 0 ? null : superAppUniversalWidgetActionDto);
        }

        public final SuperAppUniversalWidgetActionDto d() {
            return this.action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final List<String> e() {
            return this.backgroundColor;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppCustomMenuItemDto)) {
                return false;
            }
            SuperAppCustomMenuItemDto superAppCustomMenuItemDto = (SuperAppCustomMenuItemDto) obj;
            return this.innerType == superAppCustomMenuItemDto.innerType && epx.f(this.uid, superAppCustomMenuItemDto.uid) && this.type == superAppCustomMenuItemDto.type && epx.f(this.trackCode, superAppCustomMenuItemDto.trackCode) && epx.f(this.badgeInfo, superAppCustomMenuItemDto.badgeInfo) && epx.f(this.name, superAppCustomMenuItemDto.name) && epx.f(this.title, superAppCustomMenuItemDto.title) && epx.f(this.images, superAppCustomMenuItemDto.images) && epx.f(this.titleColor, superAppCustomMenuItemDto.titleColor) && epx.f(this.backgroundColor, superAppCustomMenuItemDto.backgroundColor) && epx.f(this.iconColor, superAppCustomMenuItemDto.iconColor) && epx.f(this.icon, superAppCustomMenuItemDto.icon) && epx.f(this.action, superAppCustomMenuItemDto.action);
        }

        public final SuperAppBadgeInfoDto f() {
            return this.badgeInfo;
        }

        public final List<String> g() {
            return this.iconColor;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int hashCode = (this.type.hashCode() + urd0.a(this.innerType.hashCode() * 31, 31, this.uid)) * 31;
            String str = this.trackCode;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            SuperAppBadgeInfoDto superAppBadgeInfoDto = this.badgeInfo;
            int hashCode3 = (hashCode2 + (superAppBadgeInfoDto == null ? 0 : superAppBadgeInfoDto.hashCode())) * 31;
            String str2 = this.name;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.title;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            List<BaseImageDto> list = this.images;
            int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
            List<String> list2 = this.titleColor;
            int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<String> list3 = this.backgroundColor;
            int hashCode8 = (hashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
            List<String> list4 = this.iconColor;
            int hashCode9 = (hashCode8 + (list4 == null ? 0 : list4.hashCode())) * 31;
            List<BaseImageDto> list5 = this.icon;
            int hashCode10 = (hashCode9 + (list5 == null ? 0 : list5.hashCode())) * 31;
            SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = this.action;
            return hashCode10 + (superAppUniversalWidgetActionDto != null ? superAppUniversalWidgetActionDto.hashCode() : 0);
        }

        public final List<BaseImageDto> i() {
            return this.images;
        }

        public final String j() {
            return this.name;
        }

        public final List<String> k() {
            return this.titleColor;
        }

        public final TypeDto l() {
            return this.type;
        }

        public final String n() {
            return this.uid;
        }

        public final String r() {
            return this.trackCode;
        }

        public final String toString() {
            return "SuperAppCustomMenuItemDto(innerType=" + this.innerType + ", uid=" + this.uid + ", type=" + this.type + ", trackCode=" + this.trackCode + ", badgeInfo=" + this.badgeInfo + ", name=" + this.name + ", title=" + this.title + ", images=" + this.images + ", titleColor=" + this.titleColor + ", backgroundColor=" + this.backgroundColor + ", iconColor=" + this.iconColor + ", icon=" + this.icon + ", action=" + this.action + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.innerType.writeToParcel(parcel, i);
            parcel.writeString(this.uid);
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.badgeInfo, i);
            parcel.writeString(this.name);
            parcel.writeString(this.title);
            List<BaseImageDto> list = this.images;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    parcel.writeParcelable((Parcelable) f.next(), i);
                }
            }
            parcel.writeStringList(this.titleColor);
            parcel.writeStringList(this.backgroundColor);
            parcel.writeStringList(this.iconColor);
            List<BaseImageDto> list2 = this.icon;
            if (list2 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f2 = dn.f(parcel, list2, 1);
                while (f2.hasNext()) {
                    parcel.writeParcelable((Parcelable) f2.next(), i);
                }
            }
            parcel.writeParcelable(this.action, i);
        }

        public SuperAppCustomMenuItemDto(InnerTypeDto innerTypeDto, String str, TypeDto typeDto, String str2, SuperAppBadgeInfoDto superAppBadgeInfoDto, String str3, String str4, List<BaseImageDto> list, List<String> list2, List<String> list3, List<String> list4, List<BaseImageDto> list5, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto) {
            super(null);
            this.innerType = innerTypeDto;
            this.uid = str;
            this.type = typeDto;
            this.trackCode = str2;
            this.badgeInfo = superAppBadgeInfoDto;
            this.name = str3;
            this.title = str4;
            this.images = list;
            this.titleColor = list2;
            this.backgroundColor = list3;
            this.iconColor = list4;
            this.icon = list5;
            this.action = superAppUniversalWidgetActionDto;
        }
    }

    /* compiled from: SuperAppShowcaseItemInnerDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppMiniWidgetItemDto extends SuperAppShowcaseItemInnerDto implements Parcelable {
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
        /* compiled from: SuperAppShowcaseItemInnerDto.kt */
        public static final class HeaderIconAlignDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ HeaderIconAlignDto[] $VALUES;

            @pmi0("bottom")
            public static final HeaderIconAlignDto BOTTOM;
            public static final Parcelable.Creator<HeaderIconAlignDto> CREATOR;

            @pmi0("top")
            public static final HeaderIconAlignDto TOP;
            private final String value;

            /* compiled from: SuperAppShowcaseItemInnerDto.kt */
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
        /* compiled from: SuperAppShowcaseItemInnerDto.kt */
        public static final class InnerTypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ InnerTypeDto[] $VALUES;
            public static final Parcelable.Creator<InnerTypeDto> CREATOR;

            @pmi0("mini_widget_item")
            public static final InnerTypeDto MINI_WIDGET_ITEM;
            private final String value;

            /* compiled from: SuperAppShowcaseItemInnerDto.kt */
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
        /* compiled from: SuperAppShowcaseItemInnerDto.kt */
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

            /* compiled from: SuperAppShowcaseItemInnerDto.kt */
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

        /* compiled from: SuperAppShowcaseItemInnerDto.kt */
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

        public /* synthetic */ SuperAppMiniWidgetItemDto(InnerTypeDto innerTypeDto, String str, String str2, TypeDto typeDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, List list, HeaderIconAlignDto headerIconAlignDto, Boolean bool, SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto, SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto2, String str3, Float f, String str4, String str5, String str6, Boolean bool2, int i, zcl zclVar) {
            this(innerTypeDto, str, str2, typeDto, superAppUniversalWidgetActionDto, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : headerIconAlignDto, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : superAppUniversalWidgetTextBlockDto, (i & 512) != 0 ? null : superAppUniversalWidgetTextBlockDto2, (i & 1024) != 0 ? null : str3, (i & 2048) != 0 ? null : f, (i & 4096) != 0 ? null : str4, (i & 8192) != 0 ? null : str5, (i & 16384) != 0 ? null : str6, (i & 32768) != 0 ? null : bool2);
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

        public SuperAppMiniWidgetItemDto(InnerTypeDto innerTypeDto, String str, String str2, TypeDto typeDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, List<SuperAppUniversalWidgetImageItemDto> list, HeaderIconAlignDto headerIconAlignDto, Boolean bool, SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto, SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto2, String str3, Float f, String str4, String str5, String str6, Boolean bool2) {
            super(null);
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
    }

    /* compiled from: SuperAppShowcaseItemInnerDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcasePromoDto extends SuperAppShowcaseItemInnerDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcasePromoDto> CREATOR = new a();

        @pmi0("action")
        private final SuperAppUniversalWidgetActionDto action;

        @pmi0("image")
        private final SuperAppShowcasePromoCardImageDto image;

        @pmi0("inner_type")
        private final InnerTypeDto innerType;

        @pmi0("is_enabled")
        private final Boolean isEnabled;

        @pmi0("is_unremovable")
        private final Boolean isUnremovable;

        @pmi0("state")
        private final String state;

        @pmi0("subtype")
        private final SubtypeDto subtype;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("uid")
        private final String uid;

        @pmi0("weight")
        private final float weight;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseItemInnerDto.kt */
        public static final class InnerTypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ InnerTypeDto[] $VALUES;
            public static final Parcelable.Creator<InnerTypeDto> CREATOR;

            @pmi0(NotificationCompat.CATEGORY_PROMO)
            public static final InnerTypeDto PROMO;
            private final String value;

            /* compiled from: SuperAppShowcaseItemInnerDto.kt */
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
                InnerTypeDto innerTypeDto = new InnerTypeDto("PROMO", 0, NotificationCompat.CATEGORY_PROMO);
                PROMO = innerTypeDto;
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
        /* compiled from: SuperAppShowcaseItemInnerDto.kt */
        public static final class SubtypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ SubtypeDto[] $VALUES;

            @pmi0("card")
            public static final SubtypeDto CARD;
            public static final Parcelable.Creator<SubtypeDto> CREATOR;
            private final String value;

            /* compiled from: SuperAppShowcaseItemInnerDto.kt */
            public static final class a implements Parcelable.Creator<SubtypeDto> {
                @Override // android.os.Parcelable.Creator
                public final SubtypeDto createFromParcel(Parcel parcel) {
                    return SubtypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final SubtypeDto[] newArray(int i) {
                    return new SubtypeDto[i];
                }
            }

            static {
                SubtypeDto subtypeDto = new SubtypeDto("CARD", 0, "card");
                CARD = subtypeDto;
                SubtypeDto[] subtypeDtoArr = {subtypeDto};
                $VALUES = subtypeDtoArr;
                $ENTRIES = new asp(subtypeDtoArr);
                CREATOR = new a();
            }

            private SubtypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static SubtypeDto valueOf(String str) {
                return (SubtypeDto) Enum.valueOf(SubtypeDto.class, str);
            }

            public static SubtypeDto[] values() {
                return (SubtypeDto[]) $VALUES.clone();
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
        /* compiled from: SuperAppShowcaseItemInnerDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0(NotificationCompat.CATEGORY_PROMO)
            public static final TypeDto PROMO;
            private final String value;

            /* compiled from: SuperAppShowcaseItemInnerDto.kt */
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
                TypeDto typeDto = new TypeDto("PROMO", 0, NotificationCompat.CATEGORY_PROMO);
                PROMO = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
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

        /* compiled from: SuperAppShowcaseItemInnerDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcasePromoDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcasePromoDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                InnerTypeDto createFromParcel2 = InnerTypeDto.CREATOR.createFromParcel(parcel);
                SubtypeDto createFromParcel3 = SubtypeDto.CREATOR.createFromParcel(parcel);
                SuperAppShowcasePromoCardImageDto createFromParcel4 = SuperAppShowcasePromoCardImageDto.CREATOR.createFromParcel(parcel);
                SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppShowcasePromoDto.class.getClassLoader());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                float readFloat = parcel.readFloat();
                String readString3 = parcel.readString();
                Boolean bool = null;
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new SuperAppShowcasePromoDto(createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, superAppUniversalWidgetActionDto, readString, readString2, readFloat, readString3, valueOf, bool);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcasePromoDto[] newArray(int i) {
                return new SuperAppShowcasePromoDto[i];
            }
        }

        public /* synthetic */ SuperAppShowcasePromoDto(TypeDto typeDto, InnerTypeDto innerTypeDto, SubtypeDto subtypeDto, SuperAppShowcasePromoCardImageDto superAppShowcasePromoCardImageDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, String str, String str2, float f, String str3, Boolean bool, Boolean bool2, int i, zcl zclVar) {
            this(typeDto, innerTypeDto, subtypeDto, superAppShowcasePromoCardImageDto, superAppUniversalWidgetActionDto, str, str2, f, (i & 256) != 0 ? null : str3, (i & 512) != 0 ? null : bool, (i & 1024) != 0 ? null : bool2);
        }

        public final SuperAppUniversalWidgetActionDto d() {
            return this.action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final SuperAppShowcasePromoCardImageDto e() {
            return this.image;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcasePromoDto)) {
                return false;
            }
            SuperAppShowcasePromoDto superAppShowcasePromoDto = (SuperAppShowcasePromoDto) obj;
            return this.type == superAppShowcasePromoDto.type && this.innerType == superAppShowcasePromoDto.innerType && this.subtype == superAppShowcasePromoDto.subtype && epx.f(this.image, superAppShowcasePromoDto.image) && epx.f(this.action, superAppShowcasePromoDto.action) && epx.f(this.state, superAppShowcasePromoDto.state) && epx.f(this.trackCode, superAppShowcasePromoDto.trackCode) && Float.compare(this.weight, superAppShowcasePromoDto.weight) == 0 && epx.f(this.uid, superAppShowcasePromoDto.uid) && epx.f(this.isEnabled, superAppShowcasePromoDto.isEnabled) && epx.f(this.isUnremovable, superAppShowcasePromoDto.isUnremovable);
        }

        public final float f() {
            return this.weight;
        }

        public final int hashCode() {
            int a2 = b.a(this.weight, urd0.a(urd0.a(zyk0.a(this.action, (this.image.hashCode() + ((this.subtype.hashCode() + ((this.innerType.hashCode() + (this.type.hashCode() * 31)) * 31)) * 31)) * 31, 31), 31, this.state), 31, this.trackCode), 31);
            String str = this.uid;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.isEnabled;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isUnremovable;
            return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final String r() {
            return this.trackCode;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppShowcasePromoDto(type=");
            sb.append(this.type);
            sb.append(", innerType=");
            sb.append(this.innerType);
            sb.append(", subtype=");
            sb.append(this.subtype);
            sb.append(", image=");
            sb.append(this.image);
            sb.append(", action=");
            sb.append(this.action);
            sb.append(", state=");
            sb.append(this.state);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", uid=");
            sb.append(this.uid);
            sb.append(", isEnabled=");
            sb.append(this.isEnabled);
            sb.append(", isUnremovable=");
            return tn.a(sb, this.isUnremovable, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.innerType.writeToParcel(parcel, i);
            this.subtype.writeToParcel(parcel, i);
            this.image.writeToParcel(parcel, i);
            parcel.writeParcelable(this.action, i);
            parcel.writeString(this.state);
            parcel.writeString(this.trackCode);
            parcel.writeFloat(this.weight);
            parcel.writeString(this.uid);
            Boolean bool = this.isEnabled;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Boolean bool2 = this.isUnremovable;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
        }

        public SuperAppShowcasePromoDto(TypeDto typeDto, InnerTypeDto innerTypeDto, SubtypeDto subtypeDto, SuperAppShowcasePromoCardImageDto superAppShowcasePromoCardImageDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, String str, String str2, float f, String str3, Boolean bool, Boolean bool2) {
            super(null);
            this.type = typeDto;
            this.innerType = innerTypeDto;
            this.subtype = subtypeDto;
            this.image = superAppShowcasePromoCardImageDto;
            this.action = superAppUniversalWidgetActionDto;
            this.state = str;
            this.trackCode = str2;
            this.weight = f;
            this.uid = str3;
            this.isEnabled = bool;
            this.isUnremovable = bool2;
        }
    }

    /* compiled from: SuperAppShowcaseItemInnerDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseSubscribeTileDto extends SuperAppShowcaseItemInnerDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseSubscribeTileDto> CREATOR = new a();

        @pmi0("action")
        private final SuperAppUniversalWidgetActionDto action;

        @pmi0(L2.g)
        private final List<SuperAppUniversalWidgetImageItemDto> background;

        @pmi0("button_action")
        private final SuperAppUniversalWidgetActionDto buttonAction;

        @pmi0("foreground")
        private final List<SuperAppShowcaseSubscribeTileForegroundDto> foreground;

        @pmi0("icon")
        private final SuperAppUniversalWidgetImageBlockDto icon;

        @pmi0("inner_type")
        private final InnerTypeDto innerType;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("uid")
        private final String uid;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseItemInnerDto.kt */
        public static final class InnerTypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ InnerTypeDto[] $VALUES;
            public static final Parcelable.Creator<InnerTypeDto> CREATOR;

            @pmi0("subscribe_tile")
            public static final InnerTypeDto SUBSCRIBE_TILE;
            private final String value;

            /* compiled from: SuperAppShowcaseItemInnerDto.kt */
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
                InnerTypeDto innerTypeDto = new InnerTypeDto("SUBSCRIBE_TILE", 0, "subscribe_tile");
                SUBSCRIBE_TILE = innerTypeDto;
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
        /* compiled from: SuperAppShowcaseItemInnerDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("subscribe_tile")
            public static final TypeDto SUBSCRIBE_TILE;
            private final String value;

            /* compiled from: SuperAppShowcaseItemInnerDto.kt */
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
                TypeDto typeDto = new TypeDto("SUBSCRIBE_TILE", 0, "subscribe_tile");
                SUBSCRIBE_TILE = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
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

        /* compiled from: SuperAppShowcaseItemInnerDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseSubscribeTileDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseSubscribeTileDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                InnerTypeDto createFromParcel2 = InnerTypeDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList2, i2, 1);
                }
                SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto = (SuperAppUniversalWidgetImageBlockDto) parcel.readParcelable(SuperAppShowcaseSubscribeTileDto.class.getClassLoader());
                SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppShowcaseSubscribeTileDto.class.getClassLoader());
                SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto2 = (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppShowcaseSubscribeTileDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt2);
                    while (i != readInt2) {
                        i = bo.b(SuperAppShowcaseSubscribeTileDto.class, parcel, arrayList3, i, 1);
                    }
                    arrayList = arrayList3;
                }
                return new SuperAppShowcaseSubscribeTileDto(createFromParcel, createFromParcel2, readString, arrayList2, superAppUniversalWidgetImageBlockDto, superAppUniversalWidgetActionDto, superAppUniversalWidgetActionDto2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseSubscribeTileDto[] newArray(int i) {
                return new SuperAppShowcaseSubscribeTileDto[i];
            }
        }

        public /* synthetic */ SuperAppShowcaseSubscribeTileDto(TypeDto typeDto, InnerTypeDto innerTypeDto, String str, List list, SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto2, List list2, int i, zcl zclVar) {
            this(typeDto, innerTypeDto, str, list, superAppUniversalWidgetImageBlockDto, superAppUniversalWidgetActionDto, superAppUniversalWidgetActionDto2, (i & 128) != 0 ? null : list2);
        }

        public final SuperAppUniversalWidgetActionDto d() {
            return this.action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final List<SuperAppUniversalWidgetImageItemDto> e() {
            return this.background;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseSubscribeTileDto)) {
                return false;
            }
            SuperAppShowcaseSubscribeTileDto superAppShowcaseSubscribeTileDto = (SuperAppShowcaseSubscribeTileDto) obj;
            return this.type == superAppShowcaseSubscribeTileDto.type && this.innerType == superAppShowcaseSubscribeTileDto.innerType && epx.f(this.uid, superAppShowcaseSubscribeTileDto.uid) && epx.f(this.background, superAppShowcaseSubscribeTileDto.background) && epx.f(this.icon, superAppShowcaseSubscribeTileDto.icon) && epx.f(this.action, superAppShowcaseSubscribeTileDto.action) && epx.f(this.buttonAction, superAppShowcaseSubscribeTileDto.buttonAction) && epx.f(this.foreground, superAppShowcaseSubscribeTileDto.foreground);
        }

        public final SuperAppUniversalWidgetActionDto f() {
            return this.buttonAction;
        }

        public final List<SuperAppShowcaseSubscribeTileForegroundDto> g() {
            return this.foreground;
        }

        public final int hashCode() {
            int a2 = zyk0.a(this.buttonAction, zyk0.a(this.action, (this.icon.hashCode() + fw3.a(urd0.a((this.innerType.hashCode() + (this.type.hashCode() * 31)) * 31, 31, this.uid), 31, this.background)) * 31, 31), 31);
            List<SuperAppShowcaseSubscribeTileForegroundDto> list = this.foreground;
            return a2 + (list == null ? 0 : list.hashCode());
        }

        public final SuperAppUniversalWidgetImageBlockDto i() {
            return this.icon;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppShowcaseSubscribeTileDto(type=");
            sb.append(this.type);
            sb.append(", innerType=");
            sb.append(this.innerType);
            sb.append(", uid=");
            sb.append(this.uid);
            sb.append(", background=");
            sb.append(this.background);
            sb.append(", icon=");
            sb.append(this.icon);
            sb.append(", action=");
            sb.append(this.action);
            sb.append(", buttonAction=");
            sb.append(this.buttonAction);
            sb.append(", foreground=");
            return ms9.a(')', sb, this.foreground);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.innerType.writeToParcel(parcel, i);
            parcel.writeString(this.uid);
            Iterator a2 = ao.a(parcel, this.background);
            while (a2.hasNext()) {
                ((SuperAppUniversalWidgetImageItemDto) a2.next()).writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.icon, i);
            parcel.writeParcelable(this.action, i);
            parcel.writeParcelable(this.buttonAction, i);
            List<SuperAppShowcaseSubscribeTileForegroundDto> list = this.foreground;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SuperAppShowcaseSubscribeTileDto(TypeDto typeDto, InnerTypeDto innerTypeDto, String str, List<SuperAppUniversalWidgetImageItemDto> list, SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto2, List<? extends SuperAppShowcaseSubscribeTileForegroundDto> list2) {
            super(null);
            this.type = typeDto;
            this.innerType = innerTypeDto;
            this.uid = str;
            this.background = list;
            this.icon = superAppUniversalWidgetImageBlockDto;
            this.action = superAppUniversalWidgetActionDto;
            this.buttonAction = superAppUniversalWidgetActionDto2;
            this.foreground = list2;
        }
    }

    /* compiled from: SuperAppShowcaseItemInnerDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseTileDto extends SuperAppShowcaseItemInnerDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseTileDto> CREATOR = new a();

        @pmi0("action")
        private final SuperAppUniversalWidgetActionDto action;

        @pmi0(L2.g)
        private final SuperAppShowcaseTileBackgroundDto background;

        @pmi0("badge_info")
        private final SuperAppShowcaseBadgeDto badgeInfo;

        @pmi0("foreground")
        private final List<SuperAppShowcaseTileForegroundDto> foreground;

        @pmi0("inner_type")
        private final InnerTypeDto innerType;

        @pmi0("is_enabled")
        private final Boolean isEnabled;

        @pmi0("is_unremovable")
        private final Boolean isUnremovable;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("uid")
        private final String uid;

        @pmi0("weight")
        private final float weight;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseItemInnerDto.kt */
        public static final class InnerTypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ InnerTypeDto[] $VALUES;
            public static final Parcelable.Creator<InnerTypeDto> CREATOR;

            @pmi0("tile")
            public static final InnerTypeDto TILE;
            private final String value;

            /* compiled from: SuperAppShowcaseItemInnerDto.kt */
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
                InnerTypeDto innerTypeDto = new InnerTypeDto("TILE", 0, "tile");
                TILE = innerTypeDto;
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
        /* compiled from: SuperAppShowcaseItemInnerDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("tile")
            public static final TypeDto TILE;
            private final String value;

            /* compiled from: SuperAppShowcaseItemInnerDto.kt */
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
                TypeDto typeDto = new TypeDto("TILE", 0, "tile");
                TILE = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
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

        /* compiled from: SuperAppShowcaseItemInnerDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseTileDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseTileDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                InnerTypeDto createFromParcel2 = InnerTypeDto.CREATOR.createFromParcel(parcel);
                SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppShowcaseTileDto.class.getClassLoader());
                SuperAppShowcaseTileBackgroundDto superAppShowcaseTileBackgroundDto = (SuperAppShowcaseTileBackgroundDto) parcel.readParcelable(SuperAppShowcaseTileDto.class.getClassLoader());
                String readString = parcel.readString();
                float readFloat = parcel.readFloat();
                String readString2 = parcel.readString();
                int i = 0;
                ArrayList arrayList = null;
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    while (i != readInt) {
                        i = bo.b(SuperAppShowcaseTileDto.class, parcel, arrayList2, i, 1);
                    }
                    arrayList = arrayList2;
                }
                return new SuperAppShowcaseTileDto(createFromParcel, createFromParcel2, superAppUniversalWidgetActionDto, superAppShowcaseTileBackgroundDto, readString, readFloat, readString2, valueOf, valueOf2, arrayList, (SuperAppShowcaseBadgeDto) parcel.readParcelable(SuperAppShowcaseTileDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseTileDto[] newArray(int i) {
                return new SuperAppShowcaseTileDto[i];
            }
        }

        public /* synthetic */ SuperAppShowcaseTileDto(TypeDto typeDto, InnerTypeDto innerTypeDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppShowcaseTileBackgroundDto superAppShowcaseTileBackgroundDto, String str, float f, String str2, Boolean bool, Boolean bool2, List list, SuperAppShowcaseBadgeDto superAppShowcaseBadgeDto, int i, zcl zclVar) {
            this(typeDto, innerTypeDto, superAppUniversalWidgetActionDto, superAppShowcaseTileBackgroundDto, str, f, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : bool2, (i & 512) != 0 ? null : list, (i & 1024) != 0 ? null : superAppShowcaseBadgeDto);
        }

        public final SuperAppUniversalWidgetActionDto d() {
            return this.action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final SuperAppShowcaseTileBackgroundDto e() {
            return this.background;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseTileDto)) {
                return false;
            }
            SuperAppShowcaseTileDto superAppShowcaseTileDto = (SuperAppShowcaseTileDto) obj;
            return this.type == superAppShowcaseTileDto.type && this.innerType == superAppShowcaseTileDto.innerType && epx.f(this.action, superAppShowcaseTileDto.action) && epx.f(this.background, superAppShowcaseTileDto.background) && epx.f(this.trackCode, superAppShowcaseTileDto.trackCode) && Float.compare(this.weight, superAppShowcaseTileDto.weight) == 0 && epx.f(this.uid, superAppShowcaseTileDto.uid) && epx.f(this.isEnabled, superAppShowcaseTileDto.isEnabled) && epx.f(this.isUnremovable, superAppShowcaseTileDto.isUnremovable) && epx.f(this.foreground, superAppShowcaseTileDto.foreground) && epx.f(this.badgeInfo, superAppShowcaseTileDto.badgeInfo);
        }

        public final SuperAppShowcaseBadgeDto f() {
            return this.badgeInfo;
        }

        public final List<SuperAppShowcaseTileForegroundDto> g() {
            return this.foreground;
        }

        public final int hashCode() {
            int a2 = b.a(this.weight, urd0.a((this.background.hashCode() + zyk0.a(this.action, (this.innerType.hashCode() + (this.type.hashCode() * 31)) * 31, 31)) * 31, 31, this.trackCode), 31);
            String str = this.uid;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.isEnabled;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isUnremovable;
            int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            List<SuperAppShowcaseTileForegroundDto> list = this.foreground;
            int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            SuperAppShowcaseBadgeDto superAppShowcaseBadgeDto = this.badgeInfo;
            return hashCode4 + (superAppShowcaseBadgeDto != null ? superAppShowcaseBadgeDto.hashCode() : 0);
        }

        public final float i() {
            return this.weight;
        }

        public final String r() {
            return this.trackCode;
        }

        public final String toString() {
            return "SuperAppShowcaseTileDto(type=" + this.type + ", innerType=" + this.innerType + ", action=" + this.action + ", background=" + this.background + ", trackCode=" + this.trackCode + ", weight=" + this.weight + ", uid=" + this.uid + ", isEnabled=" + this.isEnabled + ", isUnremovable=" + this.isUnremovable + ", foreground=" + this.foreground + ", badgeInfo=" + this.badgeInfo + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.innerType.writeToParcel(parcel, i);
            parcel.writeParcelable(this.action, i);
            parcel.writeParcelable(this.background, i);
            parcel.writeString(this.trackCode);
            parcel.writeFloat(this.weight);
            parcel.writeString(this.uid);
            Boolean bool = this.isEnabled;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Boolean bool2 = this.isUnremovable;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            List<SuperAppShowcaseTileForegroundDto> list = this.foreground;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    parcel.writeParcelable((Parcelable) f.next(), i);
                }
            }
            parcel.writeParcelable(this.badgeInfo, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SuperAppShowcaseTileDto(TypeDto typeDto, InnerTypeDto innerTypeDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppShowcaseTileBackgroundDto superAppShowcaseTileBackgroundDto, String str, float f, String str2, Boolean bool, Boolean bool2, List<? extends SuperAppShowcaseTileForegroundDto> list, SuperAppShowcaseBadgeDto superAppShowcaseBadgeDto) {
            super(null);
            this.type = typeDto;
            this.innerType = innerTypeDto;
            this.action = superAppUniversalWidgetActionDto;
            this.background = superAppShowcaseTileBackgroundDto;
            this.trackCode = str;
            this.weight = f;
            this.uid = str2;
            this.isEnabled = bool;
            this.isUnremovable = bool2;
            this.foreground = list;
            this.badgeInfo = superAppShowcaseBadgeDto;
        }
    }

    public /* synthetic */ SuperAppShowcaseItemInnerDto(zcl zclVar) {
        this();
    }

    private SuperAppShowcaseItemInnerDto() {
    }
}
