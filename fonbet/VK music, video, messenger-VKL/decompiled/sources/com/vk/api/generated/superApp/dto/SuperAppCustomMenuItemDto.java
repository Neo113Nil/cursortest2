package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SuperAppCustomMenuItemDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppCustomMenuItemDto implements Parcelable {
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
    /* compiled from: SuperAppCustomMenuItemDto.kt */
    public static final class InnerTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ InnerTypeDto[] $VALUES;
        public static final Parcelable.Creator<InnerTypeDto> CREATOR;

        @pmi0("showcase_menu_item")
        public static final InnerTypeDto SHOWCASE_MENU_ITEM;
        private final String value;

        /* compiled from: SuperAppCustomMenuItemDto.kt */
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
    /* compiled from: SuperAppCustomMenuItemDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("client_menu")
        public static final TypeDto CLIENT_MENU;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("custom_item")
        public static final TypeDto CUSTOM_ITEM;
        private final String value;

        /* compiled from: SuperAppCustomMenuItemDto.kt */
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

    /* compiled from: SuperAppCustomMenuItemDto.kt */
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

    public SuperAppCustomMenuItemDto(InnerTypeDto innerTypeDto, String str, TypeDto typeDto, String str2, SuperAppBadgeInfoDto superAppBadgeInfoDto, String str3, String str4, List<BaseImageDto> list, List<String> list2, List<String> list3, List<String> list4, List<BaseImageDto> list5, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto) {
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

    public /* synthetic */ SuperAppCustomMenuItemDto(InnerTypeDto innerTypeDto, String str, TypeDto typeDto, String str2, SuperAppBadgeInfoDto superAppBadgeInfoDto, String str3, String str4, List list, List list2, List list3, List list4, List list5, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, int i, zcl zclVar) {
        this(innerTypeDto, str, typeDto, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : superAppBadgeInfoDto, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : list2, (i & 512) != 0 ? null : list3, (i & 1024) != 0 ? null : list4, (i & 2048) != 0 ? null : list5, (i & 4096) != 0 ? null : superAppUniversalWidgetActionDto);
    }
}
