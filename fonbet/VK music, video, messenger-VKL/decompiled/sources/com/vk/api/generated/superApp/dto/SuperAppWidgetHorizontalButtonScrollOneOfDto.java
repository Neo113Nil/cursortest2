package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseActionDto;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseTextDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.go9;
import xsna.pmi0;
import xsna.up;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SuperAppWidgetHorizontalButtonScrollOneOfDto.kt */
/* loaded from: classes.dex */
public abstract class SuperAppWidgetHorizontalButtonScrollOneOfDto implements Parcelable {

    /* compiled from: SuperAppWidgetHorizontalButtonScrollOneOfDto.kt */
    public static final class Deserializer implements a9y<SuperAppWidgetHorizontalButtonScrollOneOfDto> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException
         */
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                switch (f.hashCode()) {
                    case -978303288:
                        if (f.equals("hb_coupons")) {
                            return (SuperAppWidgetHorizontalButtonScrollOneOfDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetHorizontalButtonScrollItemDto.class);
                        }
                        break;
                    case -151382955:
                        if (f.equals("hb_mini_apps")) {
                            return (SuperAppWidgetHorizontalButtonScrollOneOfDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetHorizontalButtonScrollItemDto.class);
                        }
                        break;
                    case 109768791:
                        if (f.equals("hb_ads_easy_promote")) {
                            return (SuperAppWidgetHorizontalButtonScrollOneOfDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetHorizontalButtonScrollItemDto.class);
                        }
                        break;
                    case 459308553:
                        if (f.equals("hb_combo")) {
                            return (SuperAppWidgetHorizontalButtonScrollOneOfDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetHorizontalButtonScrollItemDto.class);
                        }
                        break;
                    case 1060317995:
                        if (f.equals("hb_kz_egovernment")) {
                            return (SuperAppWidgetHorizontalButtonScrollOneOfDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetHorizontalButtonScrollItemDto.class);
                        }
                        break;
                    case 1893519107:
                        if (f.equals("hb_vk_pay")) {
                            return (SuperAppWidgetHorizontalButtonScrollOneOfDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetHorizontalButtonScrollItemVkPayDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: SuperAppWidgetHorizontalButtonScrollOneOfDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppWidgetHorizontalButtonScrollItemDto extends SuperAppWidgetHorizontalButtonScrollOneOfDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppWidgetHorizontalButtonScrollItemDto> CREATOR = new a();

        @pmi0("action")
        private final ExploreWidgetsBaseActionDto action;

        @pmi0("badge_info")
        private final SuperAppBadgeInfoDto badgeInfo;

        @pmi0("header_icon")
        private final List<SuperAppUniversalWidgetImageItemDto> headerIcon;

        @pmi0("subtitle")
        private final ExploreWidgetsBaseTextDto subtitle;

        @pmi0("title")
        private final ExploreWidgetsBaseTextDto title;

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
        /* compiled from: SuperAppWidgetHorizontalButtonScrollOneOfDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("hb_ads_easy_promote")
            public static final TypeDto HB_ADS_EASY_PROMOTE;

            @pmi0("hb_combo")
            public static final TypeDto HB_COMBO;

            @pmi0("hb_coupons")
            public static final TypeDto HB_COUPONS;

            @pmi0("hb_kz_egovernment")
            public static final TypeDto HB_KZ_EGOVERNMENT;

            @pmi0("hb_mini_apps")
            public static final TypeDto HB_MINI_APPS;
            private final String value;

            /* compiled from: SuperAppWidgetHorizontalButtonScrollOneOfDto.kt */
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
                TypeDto typeDto = new TypeDto("HB_COUPONS", 0, "hb_coupons");
                HB_COUPONS = typeDto;
                TypeDto typeDto2 = new TypeDto("HB_ADS_EASY_PROMOTE", 1, "hb_ads_easy_promote");
                HB_ADS_EASY_PROMOTE = typeDto2;
                TypeDto typeDto3 = new TypeDto("HB_MINI_APPS", 2, "hb_mini_apps");
                HB_MINI_APPS = typeDto3;
                TypeDto typeDto4 = new TypeDto("HB_KZ_EGOVERNMENT", 3, "hb_kz_egovernment");
                HB_KZ_EGOVERNMENT = typeDto4;
                TypeDto typeDto5 = new TypeDto("HB_COMBO", 4, "hb_combo");
                HB_COMBO = typeDto5;
                TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5};
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

        /* compiled from: SuperAppWidgetHorizontalButtonScrollOneOfDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppWidgetHorizontalButtonScrollItemDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetHorizontalButtonScrollItemDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                ExploreWidgetsBaseTextDto createFromParcel2 = ExploreWidgetsBaseTextDto.CREATOR.createFromParcel(parcel);
                ExploreWidgetsBaseActionDto exploreWidgetsBaseActionDto = (ExploreWidgetsBaseActionDto) parcel.readParcelable(SuperAppWidgetHorizontalButtonScrollItemDto.class.getClassLoader());
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
                return new SuperAppWidgetHorizontalButtonScrollItemDto(createFromParcel, readString, readString2, createFromParcel2, exploreWidgetsBaseActionDto, arrayList, parcel.readInt() != 0 ? ExploreWidgetsBaseTextDto.CREATOR.createFromParcel(parcel) : null, parcel.readString(), (SuperAppBadgeInfoDto) parcel.readParcelable(SuperAppWidgetHorizontalButtonScrollItemDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetHorizontalButtonScrollItemDto[] newArray(int i) {
                return new SuperAppWidgetHorizontalButtonScrollItemDto[i];
            }
        }

        public /* synthetic */ SuperAppWidgetHorizontalButtonScrollItemDto(TypeDto typeDto, String str, String str2, ExploreWidgetsBaseTextDto exploreWidgetsBaseTextDto, ExploreWidgetsBaseActionDto exploreWidgetsBaseActionDto, List list, ExploreWidgetsBaseTextDto exploreWidgetsBaseTextDto2, String str3, SuperAppBadgeInfoDto superAppBadgeInfoDto, int i, zcl zclVar) {
            this(typeDto, str, str2, exploreWidgetsBaseTextDto, exploreWidgetsBaseActionDto, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : exploreWidgetsBaseTextDto2, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : superAppBadgeInfoDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppWidgetHorizontalButtonScrollItemDto)) {
                return false;
            }
            SuperAppWidgetHorizontalButtonScrollItemDto superAppWidgetHorizontalButtonScrollItemDto = (SuperAppWidgetHorizontalButtonScrollItemDto) obj;
            return this.type == superAppWidgetHorizontalButtonScrollItemDto.type && epx.f(this.widgetId, superAppWidgetHorizontalButtonScrollItemDto.widgetId) && epx.f(this.uid, superAppWidgetHorizontalButtonScrollItemDto.uid) && epx.f(this.title, superAppWidgetHorizontalButtonScrollItemDto.title) && epx.f(this.action, superAppWidgetHorizontalButtonScrollItemDto.action) && epx.f(this.headerIcon, superAppWidgetHorizontalButtonScrollItemDto.headerIcon) && epx.f(this.subtitle, superAppWidgetHorizontalButtonScrollItemDto.subtitle) && epx.f(this.trackCode, superAppWidgetHorizontalButtonScrollItemDto.trackCode) && epx.f(this.badgeInfo, superAppWidgetHorizontalButtonScrollItemDto.badgeInfo);
        }

        public final int hashCode() {
            int hashCode = (this.action.hashCode() + ((this.title.hashCode() + urd0.a(urd0.a(this.type.hashCode() * 31, 31, this.widgetId), 31, this.uid)) * 31)) * 31;
            List<SuperAppUniversalWidgetImageItemDto> list = this.headerIcon;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            ExploreWidgetsBaseTextDto exploreWidgetsBaseTextDto = this.subtitle;
            int hashCode3 = (hashCode2 + (exploreWidgetsBaseTextDto == null ? 0 : exploreWidgetsBaseTextDto.hashCode())) * 31;
            String str = this.trackCode;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            SuperAppBadgeInfoDto superAppBadgeInfoDto = this.badgeInfo;
            return hashCode4 + (superAppBadgeInfoDto != null ? superAppBadgeInfoDto.hashCode() : 0);
        }

        public final String toString() {
            return "SuperAppWidgetHorizontalButtonScrollItemDto(type=" + this.type + ", widgetId=" + this.widgetId + ", uid=" + this.uid + ", title=" + this.title + ", action=" + this.action + ", headerIcon=" + this.headerIcon + ", subtitle=" + this.subtitle + ", trackCode=" + this.trackCode + ", badgeInfo=" + this.badgeInfo + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.widgetId);
            parcel.writeString(this.uid);
            this.title.writeToParcel(parcel, i);
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
            ExploreWidgetsBaseTextDto exploreWidgetsBaseTextDto = this.subtitle;
            if (exploreWidgetsBaseTextDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                exploreWidgetsBaseTextDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.badgeInfo, i);
        }

        public SuperAppWidgetHorizontalButtonScrollItemDto(TypeDto typeDto, String str, String str2, ExploreWidgetsBaseTextDto exploreWidgetsBaseTextDto, ExploreWidgetsBaseActionDto exploreWidgetsBaseActionDto, List<SuperAppUniversalWidgetImageItemDto> list, ExploreWidgetsBaseTextDto exploreWidgetsBaseTextDto2, String str3, SuperAppBadgeInfoDto superAppBadgeInfoDto) {
            super(null);
            this.type = typeDto;
            this.widgetId = str;
            this.uid = str2;
            this.title = exploreWidgetsBaseTextDto;
            this.action = exploreWidgetsBaseActionDto;
            this.headerIcon = list;
            this.subtitle = exploreWidgetsBaseTextDto2;
            this.trackCode = str3;
            this.badgeInfo = superAppBadgeInfoDto;
        }
    }

    /* compiled from: SuperAppWidgetHorizontalButtonScrollOneOfDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppWidgetHorizontalButtonScrollItemVkPayDto extends SuperAppWidgetHorizontalButtonScrollOneOfDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppWidgetHorizontalButtonScrollItemVkPayDto> CREATOR = new a();

        @pmi0("action")
        private final ExploreWidgetsBaseActionDto action;

        @pmi0("badge_info")
        private final SuperAppBadgeInfoDto badgeInfo;

        @pmi0("header_icon")
        private final List<SuperAppUniversalWidgetImageItemDto> headerIcon;

        @pmi0("payload")
        private final SuperAppWidgetVkpaySlimDto payload;

        @pmi0("subtitle")
        private final ExploreWidgetsBaseTextDto subtitle;

        @pmi0("title")
        private final ExploreWidgetsBaseTextDto title;

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
        /* compiled from: SuperAppWidgetHorizontalButtonScrollOneOfDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("hb_vk_pay")
            public static final TypeDto HB_VK_PAY;
            private final String value;

            /* compiled from: SuperAppWidgetHorizontalButtonScrollOneOfDto.kt */
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
                TypeDto typeDto = new TypeDto("HB_VK_PAY", 0, "hb_vk_pay");
                HB_VK_PAY = typeDto;
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

        /* compiled from: SuperAppWidgetHorizontalButtonScrollOneOfDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppWidgetHorizontalButtonScrollItemVkPayDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetHorizontalButtonScrollItemVkPayDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                ExploreWidgetsBaseTextDto createFromParcel2 = ExploreWidgetsBaseTextDto.CREATOR.createFromParcel(parcel);
                ExploreWidgetsBaseActionDto exploreWidgetsBaseActionDto = (ExploreWidgetsBaseActionDto) parcel.readParcelable(SuperAppWidgetHorizontalButtonScrollItemVkPayDto.class.getClassLoader());
                SuperAppWidgetVkpaySlimDto createFromParcel3 = parcel.readInt() == 0 ? null : SuperAppWidgetVkpaySlimDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList2, i, 1);
                    }
                    arrayList = arrayList2;
                }
                return new SuperAppWidgetHorizontalButtonScrollItemVkPayDto(createFromParcel, readString, readString2, createFromParcel2, exploreWidgetsBaseActionDto, createFromParcel3, arrayList, parcel.readInt() != 0 ? ExploreWidgetsBaseTextDto.CREATOR.createFromParcel(parcel) : null, parcel.readString(), (SuperAppBadgeInfoDto) parcel.readParcelable(SuperAppWidgetHorizontalButtonScrollItemVkPayDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetHorizontalButtonScrollItemVkPayDto[] newArray(int i) {
                return new SuperAppWidgetHorizontalButtonScrollItemVkPayDto[i];
            }
        }

        public /* synthetic */ SuperAppWidgetHorizontalButtonScrollItemVkPayDto(TypeDto typeDto, String str, String str2, ExploreWidgetsBaseTextDto exploreWidgetsBaseTextDto, ExploreWidgetsBaseActionDto exploreWidgetsBaseActionDto, SuperAppWidgetVkpaySlimDto superAppWidgetVkpaySlimDto, List list, ExploreWidgetsBaseTextDto exploreWidgetsBaseTextDto2, String str3, SuperAppBadgeInfoDto superAppBadgeInfoDto, int i, zcl zclVar) {
            this(typeDto, str, str2, exploreWidgetsBaseTextDto, exploreWidgetsBaseActionDto, (i & 32) != 0 ? null : superAppWidgetVkpaySlimDto, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : exploreWidgetsBaseTextDto2, (i & 256) != 0 ? null : str3, (i & 512) != 0 ? null : superAppBadgeInfoDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppWidgetHorizontalButtonScrollItemVkPayDto)) {
                return false;
            }
            SuperAppWidgetHorizontalButtonScrollItemVkPayDto superAppWidgetHorizontalButtonScrollItemVkPayDto = (SuperAppWidgetHorizontalButtonScrollItemVkPayDto) obj;
            return this.type == superAppWidgetHorizontalButtonScrollItemVkPayDto.type && epx.f(this.widgetId, superAppWidgetHorizontalButtonScrollItemVkPayDto.widgetId) && epx.f(this.uid, superAppWidgetHorizontalButtonScrollItemVkPayDto.uid) && epx.f(this.title, superAppWidgetHorizontalButtonScrollItemVkPayDto.title) && epx.f(this.action, superAppWidgetHorizontalButtonScrollItemVkPayDto.action) && epx.f(this.payload, superAppWidgetHorizontalButtonScrollItemVkPayDto.payload) && epx.f(this.headerIcon, superAppWidgetHorizontalButtonScrollItemVkPayDto.headerIcon) && epx.f(this.subtitle, superAppWidgetHorizontalButtonScrollItemVkPayDto.subtitle) && epx.f(this.trackCode, superAppWidgetHorizontalButtonScrollItemVkPayDto.trackCode) && epx.f(this.badgeInfo, superAppWidgetHorizontalButtonScrollItemVkPayDto.badgeInfo);
        }

        public final int hashCode() {
            int hashCode = (this.action.hashCode() + ((this.title.hashCode() + urd0.a(urd0.a(this.type.hashCode() * 31, 31, this.widgetId), 31, this.uid)) * 31)) * 31;
            SuperAppWidgetVkpaySlimDto superAppWidgetVkpaySlimDto = this.payload;
            int hashCode2 = (hashCode + (superAppWidgetVkpaySlimDto == null ? 0 : superAppWidgetVkpaySlimDto.hashCode())) * 31;
            List<SuperAppUniversalWidgetImageItemDto> list = this.headerIcon;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            ExploreWidgetsBaseTextDto exploreWidgetsBaseTextDto = this.subtitle;
            int hashCode4 = (hashCode3 + (exploreWidgetsBaseTextDto == null ? 0 : exploreWidgetsBaseTextDto.hashCode())) * 31;
            String str = this.trackCode;
            int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            SuperAppBadgeInfoDto superAppBadgeInfoDto = this.badgeInfo;
            return hashCode5 + (superAppBadgeInfoDto != null ? superAppBadgeInfoDto.hashCode() : 0);
        }

        public final String toString() {
            return "SuperAppWidgetHorizontalButtonScrollItemVkPayDto(type=" + this.type + ", widgetId=" + this.widgetId + ", uid=" + this.uid + ", title=" + this.title + ", action=" + this.action + ", payload=" + this.payload + ", headerIcon=" + this.headerIcon + ", subtitle=" + this.subtitle + ", trackCode=" + this.trackCode + ", badgeInfo=" + this.badgeInfo + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.widgetId);
            parcel.writeString(this.uid);
            this.title.writeToParcel(parcel, i);
            parcel.writeParcelable(this.action, i);
            SuperAppWidgetVkpaySlimDto superAppWidgetVkpaySlimDto = this.payload;
            if (superAppWidgetVkpaySlimDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppWidgetVkpaySlimDto.writeToParcel(parcel, i);
            }
            List<SuperAppUniversalWidgetImageItemDto> list = this.headerIcon;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((SuperAppUniversalWidgetImageItemDto) f.next()).writeToParcel(parcel, i);
                }
            }
            ExploreWidgetsBaseTextDto exploreWidgetsBaseTextDto = this.subtitle;
            if (exploreWidgetsBaseTextDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                exploreWidgetsBaseTextDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.badgeInfo, i);
        }

        public SuperAppWidgetHorizontalButtonScrollItemVkPayDto(TypeDto typeDto, String str, String str2, ExploreWidgetsBaseTextDto exploreWidgetsBaseTextDto, ExploreWidgetsBaseActionDto exploreWidgetsBaseActionDto, SuperAppWidgetVkpaySlimDto superAppWidgetVkpaySlimDto, List<SuperAppUniversalWidgetImageItemDto> list, ExploreWidgetsBaseTextDto exploreWidgetsBaseTextDto2, String str3, SuperAppBadgeInfoDto superAppBadgeInfoDto) {
            super(null);
            this.type = typeDto;
            this.widgetId = str;
            this.uid = str2;
            this.title = exploreWidgetsBaseTextDto;
            this.action = exploreWidgetsBaseActionDto;
            this.payload = superAppWidgetVkpaySlimDto;
            this.headerIcon = list;
            this.subtitle = exploreWidgetsBaseTextDto2;
            this.trackCode = str3;
            this.badgeInfo = superAppBadgeInfoDto;
        }
    }

    public /* synthetic */ SuperAppWidgetHorizontalButtonScrollOneOfDto(zcl zclVar) {
        this();
    }

    private SuperAppWidgetHorizontalButtonScrollOneOfDto() {
    }
}
