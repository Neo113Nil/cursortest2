package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseImageContainerDto;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseTextDto;
import com.vk.api.generated.superApp.dto.SuperAppCustomMenuItemDto;
import com.vk.dto.common.id.UserId;
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
import xsna.gp;
import xsna.ho8;
import xsna.k73;
import xsna.ms9;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.shy;
import xsna.up;
import xsna.uqi;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
/* loaded from: classes.dex */
public abstract class AppsMiniappsCatalogItemPayloadDto implements Parcelable {

    /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsMiniappsCatalogItemPayloadAchievementBannerDto extends AppsMiniappsCatalogItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadAchievementBannerDto> CREATOR = new a();

        @pmi0("images")
        private final List<BaseImageDto> images;

        @pmi0("level")
        private final int level;

        @pmi0("text")
        private final String text;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("user_id")
        private final UserId userId;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("achievement_banner")
            public static final TypeDto ACHIEVEMENT_BANNER;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("ACHIEVEMENT_BANNER", 0, "achievement_banner");
                ACHIEVEMENT_BANNER = typeDto;
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

        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadAchievementBannerDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadAchievementBannerDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(AppsMiniappsCatalogItemPayloadAchievementBannerDto.class, parcel, arrayList, i, 1);
                }
                return new AppsMiniappsCatalogItemPayloadAchievementBannerDto(createFromParcel, arrayList, parcel.readInt(), parcel.readString(), (UserId) parcel.readParcelable(AppsMiniappsCatalogItemPayloadAchievementBannerDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadAchievementBannerDto[] newArray(int i) {
                return new AppsMiniappsCatalogItemPayloadAchievementBannerDto[i];
            }
        }

        public AppsMiniappsCatalogItemPayloadAchievementBannerDto(TypeDto typeDto, List<BaseImageDto> list, int i, String str, UserId userId) {
            super(null);
            this.type = typeDto;
            this.images = list;
            this.level = i;
            this.text = str;
            this.userId = userId;
        }

        public final List<BaseImageDto> d() {
            return this.images;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final int e() {
            return this.level;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsMiniappsCatalogItemPayloadAchievementBannerDto)) {
                return false;
            }
            AppsMiniappsCatalogItemPayloadAchievementBannerDto appsMiniappsCatalogItemPayloadAchievementBannerDto = (AppsMiniappsCatalogItemPayloadAchievementBannerDto) obj;
            return this.type == appsMiniappsCatalogItemPayloadAchievementBannerDto.type && epx.f(this.images, appsMiniappsCatalogItemPayloadAchievementBannerDto.images) && this.level == appsMiniappsCatalogItemPayloadAchievementBannerDto.level && epx.f(this.text, appsMiniappsCatalogItemPayloadAchievementBannerDto.text) && epx.f(this.userId, appsMiniappsCatalogItemPayloadAchievementBannerDto.userId);
        }

        public final String f() {
            return this.text;
        }

        public final int hashCode() {
            return Long.hashCode(this.userId.b) + urd0.a(shy.a(this.level, fw3.a(this.type.hashCode() * 31, 31, this.images), 31), 31, this.text);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadAchievementBannerDto(type=");
            sb.append(this.type);
            sb.append(", images=");
            sb.append(this.images);
            sb.append(", level=");
            sb.append(this.level);
            sb.append(", text=");
            sb.append(this.text);
            sb.append(", userId=");
            return gp.b(sb, this.userId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.images);
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
            parcel.writeInt(this.level);
            parcel.writeString(this.text);
            parcel.writeParcelable(this.userId, i);
        }
    }

    /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsMiniappsCatalogItemPayloadActivitiesListDto extends AppsMiniappsCatalogItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadActivitiesListDto> CREATOR = new a();

        @pmi0("apps")
        private final List<AppsMiniappsCatalogGameDto> apps;

        @pmi0("items")
        private final List<AppsActivityItemDto> items;

        @pmi0("profiles_ids")
        private final List<Long> profilesIds;

        @pmi0("type")
        private final AppsMiniappsCatalogItemPayloadActivitiesListTypeDto type;

        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadActivitiesListDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadActivitiesListDto createFromParcel(Parcel parcel) {
                AppsMiniappsCatalogItemPayloadActivitiesListTypeDto createFromParcel = AppsMiniappsCatalogItemPayloadActivitiesListTypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(AppsActivityItemDto.CREATOR, parcel, arrayList, i2, 1);
                }
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = k73.b(parcel, arrayList2, i3, 1);
                }
                int readInt3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = en.a(AppsMiniappsCatalogGameDto.CREATOR, parcel, arrayList3, i, 1);
                }
                return new AppsMiniappsCatalogItemPayloadActivitiesListDto(createFromParcel, arrayList, arrayList2, arrayList3);
            }

            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadActivitiesListDto[] newArray(int i) {
                return new AppsMiniappsCatalogItemPayloadActivitiesListDto[i];
            }
        }

        public AppsMiniappsCatalogItemPayloadActivitiesListDto(AppsMiniappsCatalogItemPayloadActivitiesListTypeDto appsMiniappsCatalogItemPayloadActivitiesListTypeDto, List<AppsActivityItemDto> list, List<Long> list2, List<AppsMiniappsCatalogGameDto> list3) {
            super(null);
            this.type = appsMiniappsCatalogItemPayloadActivitiesListTypeDto;
            this.items = list;
            this.profilesIds = list2;
            this.apps = list3;
        }

        public final List<AppsMiniappsCatalogGameDto> d() {
            return this.apps;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final List<AppsActivityItemDto> e() {
            return this.items;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsMiniappsCatalogItemPayloadActivitiesListDto)) {
                return false;
            }
            AppsMiniappsCatalogItemPayloadActivitiesListDto appsMiniappsCatalogItemPayloadActivitiesListDto = (AppsMiniappsCatalogItemPayloadActivitiesListDto) obj;
            return this.type == appsMiniappsCatalogItemPayloadActivitiesListDto.type && epx.f(this.items, appsMiniappsCatalogItemPayloadActivitiesListDto.items) && epx.f(this.profilesIds, appsMiniappsCatalogItemPayloadActivitiesListDto.profilesIds) && epx.f(this.apps, appsMiniappsCatalogItemPayloadActivitiesListDto.apps);
        }

        public final int hashCode() {
            return this.apps.hashCode() + fw3.a(fw3.a(this.type.hashCode() * 31, 31, this.items), 31, this.profilesIds);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadActivitiesListDto(type=");
            sb.append(this.type);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", profilesIds=");
            sb.append(this.profilesIds);
            sb.append(", apps=");
            return ms9.a(')', sb, this.apps);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                ((AppsActivityItemDto) a2.next()).writeToParcel(parcel, i);
            }
            Iterator a3 = ao.a(parcel, this.profilesIds);
            while (a3.hasNext()) {
                parcel.writeLong(((Number) a3.next()).longValue());
            }
            Iterator a4 = ao.a(parcel, this.apps);
            while (a4.hasNext()) {
                ((AppsMiniappsCatalogGameDto) a4.next()).writeToParcel(parcel, i);
            }
        }
    }

    /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsMiniappsCatalogItemPayloadAppPaginatedDto extends AppsMiniappsCatalogItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadAppPaginatedDto> CREATOR = new a();

        @pmi0("items")
        private final List<SuperAppCustomMenuItemDto> items;

        @pmi0("rows_count")
        private final int rowsCount;

        @pmi0("section_id")
        private final String sectionId;

        @pmi0("type")
        private final AppsMiniappsCatalogItemPayloadAppPaginatedTypeDto type;

        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadAppPaginatedDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadAppPaginatedDto createFromParcel(Parcel parcel) {
                AppsMiniappsCatalogItemPayloadAppPaginatedTypeDto createFromParcel = AppsMiniappsCatalogItemPayloadAppPaginatedTypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(SuperAppCustomMenuItemDto.CREATOR, parcel, arrayList, i, 1);
                }
                return new AppsMiniappsCatalogItemPayloadAppPaginatedDto(createFromParcel, arrayList, parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadAppPaginatedDto[] newArray(int i) {
                return new AppsMiniappsCatalogItemPayloadAppPaginatedDto[i];
            }
        }

        public /* synthetic */ AppsMiniappsCatalogItemPayloadAppPaginatedDto(AppsMiniappsCatalogItemPayloadAppPaginatedTypeDto appsMiniappsCatalogItemPayloadAppPaginatedTypeDto, List list, int i, String str, int i2, zcl zclVar) {
            this(appsMiniappsCatalogItemPayloadAppPaginatedTypeDto, list, i, (i2 & 8) != 0 ? null : str);
        }

        public final List<SuperAppCustomMenuItemDto> d() {
            return this.items;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final int e() {
            return this.rowsCount;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsMiniappsCatalogItemPayloadAppPaginatedDto)) {
                return false;
            }
            AppsMiniappsCatalogItemPayloadAppPaginatedDto appsMiniappsCatalogItemPayloadAppPaginatedDto = (AppsMiniappsCatalogItemPayloadAppPaginatedDto) obj;
            return this.type == appsMiniappsCatalogItemPayloadAppPaginatedDto.type && epx.f(this.items, appsMiniappsCatalogItemPayloadAppPaginatedDto.items) && this.rowsCount == appsMiniappsCatalogItemPayloadAppPaginatedDto.rowsCount && epx.f(this.sectionId, appsMiniappsCatalogItemPayloadAppPaginatedDto.sectionId);
        }

        public final String f() {
            return this.sectionId;
        }

        public final int hashCode() {
            int a2 = shy.a(this.rowsCount, fw3.a(this.type.hashCode() * 31, 31, this.items), 31);
            String str = this.sectionId;
            return a2 + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadAppPaginatedDto(type=");
            sb.append(this.type);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", rowsCount=");
            sb.append(this.rowsCount);
            sb.append(", sectionId=");
            return ho8.a(sb, this.sectionId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                ((SuperAppCustomMenuItemDto) a2.next()).writeToParcel(parcel, i);
            }
            parcel.writeInt(this.rowsCount);
            parcel.writeString(this.sectionId);
        }

        public AppsMiniappsCatalogItemPayloadAppPaginatedDto(AppsMiniappsCatalogItemPayloadAppPaginatedTypeDto appsMiniappsCatalogItemPayloadAppPaginatedTypeDto, List<SuperAppCustomMenuItemDto> list, int i, String str) {
            super(null);
            this.type = appsMiniappsCatalogItemPayloadAppPaginatedTypeDto;
            this.items = list;
            this.rowsCount = i;
            this.sectionId = str;
        }
    }

    /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsMiniappsCatalogItemPayloadAppsBannersListDto extends AppsMiniappsCatalogItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadAppsBannersListDto> CREATOR = new a();

        @pmi0("items")
        private final List<AppsMiniappsCatalogGameDto> items;

        @pmi0("slides")
        private final List<AppsFeaturedSlideDto> slides;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("apps_banners_list")
            public static final TypeDto APPS_BANNERS_LIST;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("APPS_BANNERS_LIST", 0, "apps_banners_list");
                APPS_BANNERS_LIST = typeDto;
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

        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadAppsBannersListDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadAppsBannersListDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(AppsMiniappsCatalogGameDto.CREATOR, parcel, arrayList2, i2, 1);
                }
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt2);
                    while (i != readInt2) {
                        i = en.a(AppsFeaturedSlideDto.CREATOR, parcel, arrayList3, i, 1);
                    }
                    arrayList = arrayList3;
                }
                return new AppsMiniappsCatalogItemPayloadAppsBannersListDto(createFromParcel, arrayList2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadAppsBannersListDto[] newArray(int i) {
                return new AppsMiniappsCatalogItemPayloadAppsBannersListDto[i];
            }
        }

        public /* synthetic */ AppsMiniappsCatalogItemPayloadAppsBannersListDto(TypeDto typeDto, List list, List list2, int i, zcl zclVar) {
            this(typeDto, list, (i & 4) != 0 ? null : list2);
        }

        public final List<AppsMiniappsCatalogGameDto> d() {
            return this.items;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final List<AppsFeaturedSlideDto> e() {
            return this.slides;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsMiniappsCatalogItemPayloadAppsBannersListDto)) {
                return false;
            }
            AppsMiniappsCatalogItemPayloadAppsBannersListDto appsMiniappsCatalogItemPayloadAppsBannersListDto = (AppsMiniappsCatalogItemPayloadAppsBannersListDto) obj;
            return this.type == appsMiniappsCatalogItemPayloadAppsBannersListDto.type && epx.f(this.items, appsMiniappsCatalogItemPayloadAppsBannersListDto.items) && epx.f(this.slides, appsMiniappsCatalogItemPayloadAppsBannersListDto.slides);
        }

        public final int hashCode() {
            int a2 = fw3.a(this.type.hashCode() * 31, 31, this.items);
            List<AppsFeaturedSlideDto> list = this.slides;
            return a2 + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadAppsBannersListDto(type=");
            sb.append(this.type);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", slides=");
            return ms9.a(')', sb, this.slides);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                ((AppsMiniappsCatalogGameDto) a2.next()).writeToParcel(parcel, i);
            }
            List<AppsFeaturedSlideDto> list = this.slides;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((AppsFeaturedSlideDto) f.next()).writeToParcel(parcel, i);
            }
        }

        public AppsMiniappsCatalogItemPayloadAppsBannersListDto(TypeDto typeDto, List<AppsMiniappsCatalogGameDto> list, List<AppsFeaturedSlideDto> list2) {
            super(null);
            this.type = typeDto;
            this.items = list;
            this.slides = list2;
        }
    }

    /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsMiniappsCatalogItemPayloadAppsDto extends AppsMiniappsCatalogItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadAppsDto> CREATOR = new a();

        @pmi0("apps")
        private final List<AppsMiniappsCatalogAppDto> apps;

        @pmi0("section_id")
        private final String sectionId;

        @pmi0("type")
        private final AppsMiniappsCatalogItemPayloadAppsTypeDto type;

        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadAppsDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadAppsDto createFromParcel(Parcel parcel) {
                AppsMiniappsCatalogItemPayloadAppsTypeDto createFromParcel = AppsMiniappsCatalogItemPayloadAppsTypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(AppsMiniappsCatalogAppDto.CREATOR, parcel, arrayList, i, 1);
                }
                return new AppsMiniappsCatalogItemPayloadAppsDto(createFromParcel, arrayList, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadAppsDto[] newArray(int i) {
                return new AppsMiniappsCatalogItemPayloadAppsDto[i];
            }
        }

        public /* synthetic */ AppsMiniappsCatalogItemPayloadAppsDto(AppsMiniappsCatalogItemPayloadAppsTypeDto appsMiniappsCatalogItemPayloadAppsTypeDto, List list, String str, int i, zcl zclVar) {
            this(appsMiniappsCatalogItemPayloadAppsTypeDto, list, (i & 4) != 0 ? null : str);
        }

        public final List<AppsMiniappsCatalogAppDto> d() {
            return this.apps;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String e() {
            return this.sectionId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsMiniappsCatalogItemPayloadAppsDto)) {
                return false;
            }
            AppsMiniappsCatalogItemPayloadAppsDto appsMiniappsCatalogItemPayloadAppsDto = (AppsMiniappsCatalogItemPayloadAppsDto) obj;
            return this.type == appsMiniappsCatalogItemPayloadAppsDto.type && epx.f(this.apps, appsMiniappsCatalogItemPayloadAppsDto.apps) && epx.f(this.sectionId, appsMiniappsCatalogItemPayloadAppsDto.sectionId);
        }

        public final int hashCode() {
            int a2 = fw3.a(this.type.hashCode() * 31, 31, this.apps);
            String str = this.sectionId;
            return a2 + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadAppsDto(type=");
            sb.append(this.type);
            sb.append(", apps=");
            sb.append(this.apps);
            sb.append(", sectionId=");
            return ho8.a(sb, this.sectionId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.apps);
            while (a2.hasNext()) {
                ((AppsMiniappsCatalogAppDto) a2.next()).writeToParcel(parcel, i);
            }
            parcel.writeString(this.sectionId);
        }

        public AppsMiniappsCatalogItemPayloadAppsDto(AppsMiniappsCatalogItemPayloadAppsTypeDto appsMiniappsCatalogItemPayloadAppsTypeDto, List<AppsMiniappsCatalogAppDto> list, String str) {
            super(null);
            this.type = appsMiniappsCatalogItemPayloadAppsTypeDto;
            this.apps = list;
            this.sectionId = str;
        }
    }

    /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsMiniappsCatalogItemPayloadAppsPairedHorizontalListsDto extends AppsMiniappsCatalogItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadAppsPairedHorizontalListsDto> CREATOR = new a();

        @pmi0(TtmlNode.LEFT)
        private final com.vk.api.generated.apps.dto.AppsMiniappsCatalogItemPayloadAppsDto left;

        @pmi0(TtmlNode.RIGHT)
        private final com.vk.api.generated.apps.dto.AppsMiniappsCatalogItemPayloadAppsDto right;

        @pmi0("title_left")
        private final ExploreWidgetsBaseTextDto titleLeft;

        @pmi0("title_right")
        private final ExploreWidgetsBaseTextDto titleRight;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("apps_paired_horizontal_lists")
            public static final TypeDto APPS_PAIRED_HORIZONTAL_LISTS;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("APPS_PAIRED_HORIZONTAL_LISTS", 0, "apps_paired_horizontal_lists");
                APPS_PAIRED_HORIZONTAL_LISTS = typeDto;
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

        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadAppsPairedHorizontalListsDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadAppsPairedHorizontalListsDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                Parcelable.Creator<ExploreWidgetsBaseTextDto> creator = ExploreWidgetsBaseTextDto.CREATOR;
                ExploreWidgetsBaseTextDto createFromParcel2 = creator.createFromParcel(parcel);
                ExploreWidgetsBaseTextDto createFromParcel3 = creator.createFromParcel(parcel);
                Parcelable.Creator<com.vk.api.generated.apps.dto.AppsMiniappsCatalogItemPayloadAppsDto> creator2 = com.vk.api.generated.apps.dto.AppsMiniappsCatalogItemPayloadAppsDto.CREATOR;
                return new AppsMiniappsCatalogItemPayloadAppsPairedHorizontalListsDto(createFromParcel, createFromParcel2, createFromParcel3, creator2.createFromParcel(parcel), creator2.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadAppsPairedHorizontalListsDto[] newArray(int i) {
                return new AppsMiniappsCatalogItemPayloadAppsPairedHorizontalListsDto[i];
            }
        }

        public AppsMiniappsCatalogItemPayloadAppsPairedHorizontalListsDto(TypeDto typeDto, ExploreWidgetsBaseTextDto exploreWidgetsBaseTextDto, ExploreWidgetsBaseTextDto exploreWidgetsBaseTextDto2, com.vk.api.generated.apps.dto.AppsMiniappsCatalogItemPayloadAppsDto appsMiniappsCatalogItemPayloadAppsDto, com.vk.api.generated.apps.dto.AppsMiniappsCatalogItemPayloadAppsDto appsMiniappsCatalogItemPayloadAppsDto2) {
            super(null);
            this.type = typeDto;
            this.titleLeft = exploreWidgetsBaseTextDto;
            this.titleRight = exploreWidgetsBaseTextDto2;
            this.left = appsMiniappsCatalogItemPayloadAppsDto;
            this.right = appsMiniappsCatalogItemPayloadAppsDto2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsMiniappsCatalogItemPayloadAppsPairedHorizontalListsDto)) {
                return false;
            }
            AppsMiniappsCatalogItemPayloadAppsPairedHorizontalListsDto appsMiniappsCatalogItemPayloadAppsPairedHorizontalListsDto = (AppsMiniappsCatalogItemPayloadAppsPairedHorizontalListsDto) obj;
            return this.type == appsMiniappsCatalogItemPayloadAppsPairedHorizontalListsDto.type && epx.f(this.titleLeft, appsMiniappsCatalogItemPayloadAppsPairedHorizontalListsDto.titleLeft) && epx.f(this.titleRight, appsMiniappsCatalogItemPayloadAppsPairedHorizontalListsDto.titleRight) && epx.f(this.left, appsMiniappsCatalogItemPayloadAppsPairedHorizontalListsDto.left) && epx.f(this.right, appsMiniappsCatalogItemPayloadAppsPairedHorizontalListsDto.right);
        }

        public final int hashCode() {
            return this.right.hashCode() + ((this.left.hashCode() + ((this.titleRight.hashCode() + ((this.titleLeft.hashCode() + (this.type.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "AppsMiniappsCatalogItemPayloadAppsPairedHorizontalListsDto(type=" + this.type + ", titleLeft=" + this.titleLeft + ", titleRight=" + this.titleRight + ", left=" + this.left + ", right=" + this.right + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.titleLeft.writeToParcel(parcel, i);
            this.titleRight.writeToParcel(parcel, i);
            this.left.writeToParcel(parcel, i);
            this.right.writeToParcel(parcel, i);
        }
    }

    /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsMiniappsCatalogItemPayloadAppsRotatingCarouselDto extends AppsMiniappsCatalogItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadAppsRotatingCarouselDto> CREATOR = new a();

        @pmi0("items")
        private final List<AppsRotatingCarouselItemDto> items;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("apps_rotating_carousel")
            public static final TypeDto APPS_ROTATING_CAROUSEL;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("APPS_ROTATING_CAROUSEL", 0, "apps_rotating_carousel");
                APPS_ROTATING_CAROUSEL = typeDto;
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

        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadAppsRotatingCarouselDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadAppsRotatingCarouselDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(AppsRotatingCarouselItemDto.CREATOR, parcel, arrayList, i, 1);
                }
                return new AppsMiniappsCatalogItemPayloadAppsRotatingCarouselDto(createFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadAppsRotatingCarouselDto[] newArray(int i) {
                return new AppsMiniappsCatalogItemPayloadAppsRotatingCarouselDto[i];
            }
        }

        public AppsMiniappsCatalogItemPayloadAppsRotatingCarouselDto(TypeDto typeDto, List<AppsRotatingCarouselItemDto> list) {
            super(null);
            this.type = typeDto;
            this.items = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsMiniappsCatalogItemPayloadAppsRotatingCarouselDto)) {
                return false;
            }
            AppsMiniappsCatalogItemPayloadAppsRotatingCarouselDto appsMiniappsCatalogItemPayloadAppsRotatingCarouselDto = (AppsMiniappsCatalogItemPayloadAppsRotatingCarouselDto) obj;
            return this.type == appsMiniappsCatalogItemPayloadAppsRotatingCarouselDto.type && epx.f(this.items, appsMiniappsCatalogItemPayloadAppsRotatingCarouselDto.items);
        }

        public final int hashCode() {
            return this.items.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadAppsRotatingCarouselDto(type=");
            sb.append(this.type);
            sb.append(", items=");
            return ms9.a(')', sb, this.items);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                ((AppsRotatingCarouselItemDto) a2.next()).writeToParcel(parcel, i);
            }
        }
    }

    /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsMiniappsCatalogItemPayloadCardDto extends AppsMiniappsCatalogItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadCardDto> CREATOR = new a();

        /* renamed from: app, reason: collision with root package name */
        @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
        private final AppsMiniappsCatalogAppDto f67app;

        @pmi0("background_color")
        private final List<String> backgroundColor;

        @pmi0("background_image")
        private final ExploreWidgetsBaseImageContainerDto backgroundImage;

        @pmi0("description")
        private final AppsMiniappsCatalogItemTextDto description;

        @pmi0("footer")
        private final AppsMiniappsCatalogItemPayloadGamesUserStackDto footer;

        @pmi0("panel")
        private final AppsMiniappsCatalogItemPayloadCardPanelDto panel;

        @pmi0("profiles_ids")
        private final List<UserId> profilesIds;

        @pmi0("section_id")
        private final String sectionId;

        @pmi0("subtitle")
        private final AppsMiniappsCatalogItemTextDto subtitle;

        @pmi0("title")
        private final AppsMiniappsCatalogItemTextDto title;

        @pmi0("type")
        private final AppsMiniappsCatalogItemPayloadCardTypeDto type;

        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadCardDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadCardDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                AppsMiniappsCatalogItemPayloadCardTypeDto createFromParcel = AppsMiniappsCatalogItemPayloadCardTypeDto.CREATOR.createFromParcel(parcel);
                ExploreWidgetsBaseImageContainerDto exploreWidgetsBaseImageContainerDto = (ExploreWidgetsBaseImageContainerDto) parcel.readParcelable(AppsMiniappsCatalogItemPayloadCardDto.class.getClassLoader());
                Parcelable.Creator<AppsMiniappsCatalogItemTextDto> creator = AppsMiniappsCatalogItemTextDto.CREATOR;
                AppsMiniappsCatalogItemTextDto createFromParcel2 = creator.createFromParcel(parcel);
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                AppsMiniappsCatalogAppDto createFromParcel3 = AppsMiniappsCatalogAppDto.CREATOR.createFromParcel(parcel);
                AppsMiniappsCatalogItemPayloadCardPanelDto createFromParcel4 = parcel.readInt() == 0 ? null : AppsMiniappsCatalogItemPayloadCardPanelDto.CREATOR.createFromParcel(parcel);
                AppsMiniappsCatalogItemTextDto createFromParcel5 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                AppsMiniappsCatalogItemTextDto createFromParcel6 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                String readString = parcel.readString();
                AppsMiniappsCatalogItemPayloadGamesUserStackDto createFromParcel7 = parcel.readInt() == 0 ? null : AppsMiniappsCatalogItemPayloadGamesUserStackDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = bo.b(AppsMiniappsCatalogItemPayloadCardDto.class, parcel, arrayList, i, 1);
                    }
                }
                return new AppsMiniappsCatalogItemPayloadCardDto(createFromParcel, exploreWidgetsBaseImageContainerDto, createFromParcel2, createStringArrayList, createFromParcel3, createFromParcel4, createFromParcel5, createFromParcel6, readString, createFromParcel7, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadCardDto[] newArray(int i) {
                return new AppsMiniappsCatalogItemPayloadCardDto[i];
            }
        }

        public /* synthetic */ AppsMiniappsCatalogItemPayloadCardDto(AppsMiniappsCatalogItemPayloadCardTypeDto appsMiniappsCatalogItemPayloadCardTypeDto, ExploreWidgetsBaseImageContainerDto exploreWidgetsBaseImageContainerDto, AppsMiniappsCatalogItemTextDto appsMiniappsCatalogItemTextDto, List list, AppsMiniappsCatalogAppDto appsMiniappsCatalogAppDto, AppsMiniappsCatalogItemPayloadCardPanelDto appsMiniappsCatalogItemPayloadCardPanelDto, AppsMiniappsCatalogItemTextDto appsMiniappsCatalogItemTextDto2, AppsMiniappsCatalogItemTextDto appsMiniappsCatalogItemTextDto3, String str, AppsMiniappsCatalogItemPayloadGamesUserStackDto appsMiniappsCatalogItemPayloadGamesUserStackDto, List list2, int i, zcl zclVar) {
            this(appsMiniappsCatalogItemPayloadCardTypeDto, exploreWidgetsBaseImageContainerDto, appsMiniappsCatalogItemTextDto, list, appsMiniappsCatalogAppDto, (i & 32) != 0 ? null : appsMiniappsCatalogItemPayloadCardPanelDto, (i & 64) != 0 ? null : appsMiniappsCatalogItemTextDto2, (i & 128) != 0 ? null : appsMiniappsCatalogItemTextDto3, (i & 256) != 0 ? null : str, (i & 512) != 0 ? null : appsMiniappsCatalogItemPayloadGamesUserStackDto, (i & 1024) != 0 ? null : list2);
        }

        public final AppsMiniappsCatalogAppDto d() {
            return this.f67app;
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
            if (!(obj instanceof AppsMiniappsCatalogItemPayloadCardDto)) {
                return false;
            }
            AppsMiniappsCatalogItemPayloadCardDto appsMiniappsCatalogItemPayloadCardDto = (AppsMiniappsCatalogItemPayloadCardDto) obj;
            return this.type == appsMiniappsCatalogItemPayloadCardDto.type && epx.f(this.backgroundImage, appsMiniappsCatalogItemPayloadCardDto.backgroundImage) && epx.f(this.title, appsMiniappsCatalogItemPayloadCardDto.title) && epx.f(this.backgroundColor, appsMiniappsCatalogItemPayloadCardDto.backgroundColor) && epx.f(this.f67app, appsMiniappsCatalogItemPayloadCardDto.f67app) && epx.f(this.panel, appsMiniappsCatalogItemPayloadCardDto.panel) && epx.f(this.subtitle, appsMiniappsCatalogItemPayloadCardDto.subtitle) && epx.f(this.description, appsMiniappsCatalogItemPayloadCardDto.description) && epx.f(this.sectionId, appsMiniappsCatalogItemPayloadCardDto.sectionId) && epx.f(this.footer, appsMiniappsCatalogItemPayloadCardDto.footer) && epx.f(this.profilesIds, appsMiniappsCatalogItemPayloadCardDto.profilesIds);
        }

        public final ExploreWidgetsBaseImageContainerDto f() {
            return this.backgroundImage;
        }

        public final AppsMiniappsCatalogItemPayloadCardPanelDto g() {
            return this.panel;
        }

        public final int hashCode() {
            int hashCode = (this.f67app.hashCode() + fw3.a((this.title.hashCode() + ((this.backgroundImage.hashCode() + (this.type.hashCode() * 31)) * 31)) * 31, 31, this.backgroundColor)) * 31;
            AppsMiniappsCatalogItemPayloadCardPanelDto appsMiniappsCatalogItemPayloadCardPanelDto = this.panel;
            int hashCode2 = (hashCode + (appsMiniappsCatalogItemPayloadCardPanelDto == null ? 0 : appsMiniappsCatalogItemPayloadCardPanelDto.hashCode())) * 31;
            AppsMiniappsCatalogItemTextDto appsMiniappsCatalogItemTextDto = this.subtitle;
            int hashCode3 = (hashCode2 + (appsMiniappsCatalogItemTextDto == null ? 0 : appsMiniappsCatalogItemTextDto.hashCode())) * 31;
            AppsMiniappsCatalogItemTextDto appsMiniappsCatalogItemTextDto2 = this.description;
            int hashCode4 = (hashCode3 + (appsMiniappsCatalogItemTextDto2 == null ? 0 : appsMiniappsCatalogItemTextDto2.hashCode())) * 31;
            String str = this.sectionId;
            int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            AppsMiniappsCatalogItemPayloadGamesUserStackDto appsMiniappsCatalogItemPayloadGamesUserStackDto = this.footer;
            int hashCode6 = (hashCode5 + (appsMiniappsCatalogItemPayloadGamesUserStackDto == null ? 0 : appsMiniappsCatalogItemPayloadGamesUserStackDto.hashCode())) * 31;
            List<UserId> list = this.profilesIds;
            return hashCode6 + (list != null ? list.hashCode() : 0);
        }

        public final AppsMiniappsCatalogItemTextDto i() {
            return this.subtitle;
        }

        public final AppsMiniappsCatalogItemTextDto j() {
            return this.title;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadCardDto(type=");
            sb.append(this.type);
            sb.append(", backgroundImage=");
            sb.append(this.backgroundImage);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", backgroundColor=");
            sb.append(this.backgroundColor);
            sb.append(", app=");
            sb.append(this.f67app);
            sb.append(", panel=");
            sb.append(this.panel);
            sb.append(", subtitle=");
            sb.append(this.subtitle);
            sb.append(", description=");
            sb.append(this.description);
            sb.append(", sectionId=");
            sb.append(this.sectionId);
            sb.append(", footer=");
            sb.append(this.footer);
            sb.append(", profilesIds=");
            return ms9.a(')', sb, this.profilesIds);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.backgroundImage, i);
            this.title.writeToParcel(parcel, i);
            parcel.writeStringList(this.backgroundColor);
            this.f67app.writeToParcel(parcel, i);
            AppsMiniappsCatalogItemPayloadCardPanelDto appsMiniappsCatalogItemPayloadCardPanelDto = this.panel;
            if (appsMiniappsCatalogItemPayloadCardPanelDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                appsMiniappsCatalogItemPayloadCardPanelDto.writeToParcel(parcel, i);
            }
            AppsMiniappsCatalogItemTextDto appsMiniappsCatalogItemTextDto = this.subtitle;
            if (appsMiniappsCatalogItemTextDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                appsMiniappsCatalogItemTextDto.writeToParcel(parcel, i);
            }
            AppsMiniappsCatalogItemTextDto appsMiniappsCatalogItemTextDto2 = this.description;
            if (appsMiniappsCatalogItemTextDto2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                appsMiniappsCatalogItemTextDto2.writeToParcel(parcel, i);
            }
            parcel.writeString(this.sectionId);
            AppsMiniappsCatalogItemPayloadGamesUserStackDto appsMiniappsCatalogItemPayloadGamesUserStackDto = this.footer;
            if (appsMiniappsCatalogItemPayloadGamesUserStackDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                appsMiniappsCatalogItemPayloadGamesUserStackDto.writeToParcel(parcel, i);
            }
            List<UserId> list = this.profilesIds;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }

        public AppsMiniappsCatalogItemPayloadCardDto(AppsMiniappsCatalogItemPayloadCardTypeDto appsMiniappsCatalogItemPayloadCardTypeDto, ExploreWidgetsBaseImageContainerDto exploreWidgetsBaseImageContainerDto, AppsMiniappsCatalogItemTextDto appsMiniappsCatalogItemTextDto, List<String> list, AppsMiniappsCatalogAppDto appsMiniappsCatalogAppDto, AppsMiniappsCatalogItemPayloadCardPanelDto appsMiniappsCatalogItemPayloadCardPanelDto, AppsMiniappsCatalogItemTextDto appsMiniappsCatalogItemTextDto2, AppsMiniappsCatalogItemTextDto appsMiniappsCatalogItemTextDto3, String str, AppsMiniappsCatalogItemPayloadGamesUserStackDto appsMiniappsCatalogItemPayloadGamesUserStackDto, List<UserId> list2) {
            super(null);
            this.type = appsMiniappsCatalogItemPayloadCardTypeDto;
            this.backgroundImage = exploreWidgetsBaseImageContainerDto;
            this.title = appsMiniappsCatalogItemTextDto;
            this.backgroundColor = list;
            this.f67app = appsMiniappsCatalogAppDto;
            this.panel = appsMiniappsCatalogItemPayloadCardPanelDto;
            this.subtitle = appsMiniappsCatalogItemTextDto2;
            this.description = appsMiniappsCatalogItemTextDto3;
            this.sectionId = str;
            this.footer = appsMiniappsCatalogItemPayloadGamesUserStackDto;
            this.profilesIds = list2;
        }
    }

    /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsMiniappsCatalogItemPayloadCardsDto extends AppsMiniappsCatalogItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadCardsDto> CREATOR = new a();

        @pmi0("items")
        private final List<com.vk.api.generated.apps.dto.AppsMiniappsCatalogItemPayloadCardDto> items;

        @pmi0("section_id")
        private final String sectionId;

        @pmi0("type")
        private final AppsMiniappsCatalogItemPayloadCardsTypeDto type;

        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadCardsDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadCardsDto createFromParcel(Parcel parcel) {
                AppsMiniappsCatalogItemPayloadCardsTypeDto createFromParcel = AppsMiniappsCatalogItemPayloadCardsTypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(com.vk.api.generated.apps.dto.AppsMiniappsCatalogItemPayloadCardDto.CREATOR, parcel, arrayList, i, 1);
                }
                return new AppsMiniappsCatalogItemPayloadCardsDto(createFromParcel, arrayList, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadCardsDto[] newArray(int i) {
                return new AppsMiniappsCatalogItemPayloadCardsDto[i];
            }
        }

        public /* synthetic */ AppsMiniappsCatalogItemPayloadCardsDto(AppsMiniappsCatalogItemPayloadCardsTypeDto appsMiniappsCatalogItemPayloadCardsTypeDto, List list, String str, int i, zcl zclVar) {
            this(appsMiniappsCatalogItemPayloadCardsTypeDto, list, (i & 4) != 0 ? null : str);
        }

        public final List<com.vk.api.generated.apps.dto.AppsMiniappsCatalogItemPayloadCardDto> d() {
            return this.items;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsMiniappsCatalogItemPayloadCardsDto)) {
                return false;
            }
            AppsMiniappsCatalogItemPayloadCardsDto appsMiniappsCatalogItemPayloadCardsDto = (AppsMiniappsCatalogItemPayloadCardsDto) obj;
            return this.type == appsMiniappsCatalogItemPayloadCardsDto.type && epx.f(this.items, appsMiniappsCatalogItemPayloadCardsDto.items) && epx.f(this.sectionId, appsMiniappsCatalogItemPayloadCardsDto.sectionId);
        }

        public final int hashCode() {
            int a2 = fw3.a(this.type.hashCode() * 31, 31, this.items);
            String str = this.sectionId;
            return a2 + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadCardsDto(type=");
            sb.append(this.type);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", sectionId=");
            return ho8.a(sb, this.sectionId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                ((com.vk.api.generated.apps.dto.AppsMiniappsCatalogItemPayloadCardDto) a2.next()).writeToParcel(parcel, i);
            }
            parcel.writeString(this.sectionId);
        }

        public AppsMiniappsCatalogItemPayloadCardsDto(AppsMiniappsCatalogItemPayloadCardsTypeDto appsMiniappsCatalogItemPayloadCardsTypeDto, List<com.vk.api.generated.apps.dto.AppsMiniappsCatalogItemPayloadCardDto> list, String str) {
            super(null);
            this.type = appsMiniappsCatalogItemPayloadCardsTypeDto;
            this.items = list;
            this.sectionId = str;
        }
    }

    /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsMiniappsCatalogItemPayloadCategoriesHorizontalListDto extends AppsMiniappsCatalogItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadCategoriesHorizontalListDto> CREATOR = new a();

        @pmi0("action_right")
        private final ActionRightDto actionRight;

        @pmi0("items")
        private final List<AppsMiniappsCatalogItemPayloadCategoriesHorizontalListItemDto> items;

        @pmi0("type")
        private final AppsMiniappsCatalogItemPayloadCategoriesHorizontalListTypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class ActionRightDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ActionRightDto[] $VALUES;
            public static final Parcelable.Creator<ActionRightDto> CREATOR;

            @pmi0("search")
            public static final ActionRightDto SEARCH;
            private final String value;

            /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
            public static final class a implements Parcelable.Creator<ActionRightDto> {
                @Override // android.os.Parcelable.Creator
                public final ActionRightDto createFromParcel(Parcel parcel) {
                    return ActionRightDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ActionRightDto[] newArray(int i) {
                    return new ActionRightDto[i];
                }
            }

            static {
                ActionRightDto actionRightDto = new ActionRightDto("SEARCH", 0, "search");
                SEARCH = actionRightDto;
                ActionRightDto[] actionRightDtoArr = {actionRightDto};
                $VALUES = actionRightDtoArr;
                $ENTRIES = new asp(actionRightDtoArr);
                CREATOR = new a();
            }

            private ActionRightDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static ActionRightDto valueOf(String str) {
                return (ActionRightDto) Enum.valueOf(ActionRightDto.class, str);
            }

            public static ActionRightDto[] values() {
                return (ActionRightDto[]) $VALUES.clone();
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

        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadCategoriesHorizontalListDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadCategoriesHorizontalListDto createFromParcel(Parcel parcel) {
                AppsMiniappsCatalogItemPayloadCategoriesHorizontalListTypeDto createFromParcel = AppsMiniappsCatalogItemPayloadCategoriesHorizontalListTypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(AppsMiniappsCatalogItemPayloadCategoriesHorizontalListItemDto.CREATOR, parcel, arrayList, i, 1);
                }
                return new AppsMiniappsCatalogItemPayloadCategoriesHorizontalListDto(createFromParcel, arrayList, parcel.readInt() == 0 ? null : ActionRightDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadCategoriesHorizontalListDto[] newArray(int i) {
                return new AppsMiniappsCatalogItemPayloadCategoriesHorizontalListDto[i];
            }
        }

        public /* synthetic */ AppsMiniappsCatalogItemPayloadCategoriesHorizontalListDto(AppsMiniappsCatalogItemPayloadCategoriesHorizontalListTypeDto appsMiniappsCatalogItemPayloadCategoriesHorizontalListTypeDto, List list, ActionRightDto actionRightDto, int i, zcl zclVar) {
            this(appsMiniappsCatalogItemPayloadCategoriesHorizontalListTypeDto, list, (i & 4) != 0 ? null : actionRightDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsMiniappsCatalogItemPayloadCategoriesHorizontalListDto)) {
                return false;
            }
            AppsMiniappsCatalogItemPayloadCategoriesHorizontalListDto appsMiniappsCatalogItemPayloadCategoriesHorizontalListDto = (AppsMiniappsCatalogItemPayloadCategoriesHorizontalListDto) obj;
            return this.type == appsMiniappsCatalogItemPayloadCategoriesHorizontalListDto.type && epx.f(this.items, appsMiniappsCatalogItemPayloadCategoriesHorizontalListDto.items) && this.actionRight == appsMiniappsCatalogItemPayloadCategoriesHorizontalListDto.actionRight;
        }

        public final int hashCode() {
            int a2 = fw3.a(this.type.hashCode() * 31, 31, this.items);
            ActionRightDto actionRightDto = this.actionRight;
            return a2 + (actionRightDto == null ? 0 : actionRightDto.hashCode());
        }

        public final String toString() {
            return "AppsMiniappsCatalogItemPayloadCategoriesHorizontalListDto(type=" + this.type + ", items=" + this.items + ", actionRight=" + this.actionRight + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                ((AppsMiniappsCatalogItemPayloadCategoriesHorizontalListItemDto) a2.next()).writeToParcel(parcel, i);
            }
            ActionRightDto actionRightDto = this.actionRight;
            if (actionRightDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                actionRightDto.writeToParcel(parcel, i);
            }
        }

        public AppsMiniappsCatalogItemPayloadCategoriesHorizontalListDto(AppsMiniappsCatalogItemPayloadCategoriesHorizontalListTypeDto appsMiniappsCatalogItemPayloadCategoriesHorizontalListTypeDto, List<AppsMiniappsCatalogItemPayloadCategoriesHorizontalListItemDto> list, ActionRightDto actionRightDto) {
            super(null);
            this.type = appsMiniappsCatalogItemPayloadCategoriesHorizontalListTypeDto;
            this.items = list;
            this.actionRight = actionRightDto;
        }
    }

    /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsMiniappsCatalogItemPayloadEmptyHorizontalListDto extends AppsMiniappsCatalogItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadEmptyHorizontalListDto> CREATOR = new a();

        @pmi0("description")
        private final String description;

        @pmi0("header")
        private final String header;

        @pmi0("type")
        private final AppsMiniappsCatalogItemPayloadEmptyHorizontalListTypeDto type;

        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadEmptyHorizontalListDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadEmptyHorizontalListDto createFromParcel(Parcel parcel) {
                return new AppsMiniappsCatalogItemPayloadEmptyHorizontalListDto(AppsMiniappsCatalogItemPayloadEmptyHorizontalListTypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadEmptyHorizontalListDto[] newArray(int i) {
                return new AppsMiniappsCatalogItemPayloadEmptyHorizontalListDto[i];
            }
        }

        public /* synthetic */ AppsMiniappsCatalogItemPayloadEmptyHorizontalListDto(AppsMiniappsCatalogItemPayloadEmptyHorizontalListTypeDto appsMiniappsCatalogItemPayloadEmptyHorizontalListTypeDto, String str, String str2, int i, zcl zclVar) {
            this(appsMiniappsCatalogItemPayloadEmptyHorizontalListTypeDto, str, (i & 4) != 0 ? null : str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsMiniappsCatalogItemPayloadEmptyHorizontalListDto)) {
                return false;
            }
            AppsMiniappsCatalogItemPayloadEmptyHorizontalListDto appsMiniappsCatalogItemPayloadEmptyHorizontalListDto = (AppsMiniappsCatalogItemPayloadEmptyHorizontalListDto) obj;
            return this.type == appsMiniappsCatalogItemPayloadEmptyHorizontalListDto.type && epx.f(this.header, appsMiniappsCatalogItemPayloadEmptyHorizontalListDto.header) && epx.f(this.description, appsMiniappsCatalogItemPayloadEmptyHorizontalListDto.description);
        }

        public final int hashCode() {
            int a2 = urd0.a(this.type.hashCode() * 31, 31, this.header);
            String str = this.description;
            return a2 + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadEmptyHorizontalListDto(type=");
            sb.append(this.type);
            sb.append(", header=");
            sb.append(this.header);
            sb.append(", description=");
            return ho8.a(sb, this.description, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.header);
            parcel.writeString(this.description);
        }

        public AppsMiniappsCatalogItemPayloadEmptyHorizontalListDto(AppsMiniappsCatalogItemPayloadEmptyHorizontalListTypeDto appsMiniappsCatalogItemPayloadEmptyHorizontalListTypeDto, String str, String str2) {
            super(null);
            this.type = appsMiniappsCatalogItemPayloadEmptyHorizontalListTypeDto;
            this.header = str;
            this.description = str2;
        }
    }

    /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsMiniappsCatalogItemPayloadFriendsPlayingDto extends AppsMiniappsCatalogItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadFriendsPlayingDto> CREATOR = new a();

        @pmi0("apps")
        private final List<AppsMiniappsCatalogGameDto> apps;

        @pmi0("apps_ids")
        private final List<Integer> appsIds;

        @pmi0("feeds")
        private final List<AppsMiniappsCatalogItemPayloadGameActivityFeedDto> feeds;

        @pmi0("profiles_ids")
        private final List<Long> profilesIds;

        @pmi0("type")
        private final AppsMiniappsCatalogItemPayloadFriendsPlayingTypeDto type;

        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadFriendsPlayingDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadFriendsPlayingDto createFromParcel(Parcel parcel) {
                AppsMiniappsCatalogItemPayloadFriendsPlayingTypeDto createFromParcel = AppsMiniappsCatalogItemPayloadFriendsPlayingTypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = pm0.b(parcel, arrayList, i2, 1);
                }
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = en.a(AppsMiniappsCatalogItemPayloadGameActivityFeedDto.CREATOR, parcel, arrayList2, i3, 1);
                }
                int readInt3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = k73.b(parcel, arrayList3, i4, 1);
                }
                int readInt4 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = en.a(AppsMiniappsCatalogGameDto.CREATOR, parcel, arrayList4, i, 1);
                }
                return new AppsMiniappsCatalogItemPayloadFriendsPlayingDto(createFromParcel, arrayList, arrayList2, arrayList3, arrayList4);
            }

            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadFriendsPlayingDto[] newArray(int i) {
                return new AppsMiniappsCatalogItemPayloadFriendsPlayingDto[i];
            }
        }

        public AppsMiniappsCatalogItemPayloadFriendsPlayingDto(AppsMiniappsCatalogItemPayloadFriendsPlayingTypeDto appsMiniappsCatalogItemPayloadFriendsPlayingTypeDto, List<Integer> list, List<AppsMiniappsCatalogItemPayloadGameActivityFeedDto> list2, List<Long> list3, List<AppsMiniappsCatalogGameDto> list4) {
            super(null);
            this.type = appsMiniappsCatalogItemPayloadFriendsPlayingTypeDto;
            this.appsIds = list;
            this.feeds = list2;
            this.profilesIds = list3;
            this.apps = list4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsMiniappsCatalogItemPayloadFriendsPlayingDto)) {
                return false;
            }
            AppsMiniappsCatalogItemPayloadFriendsPlayingDto appsMiniappsCatalogItemPayloadFriendsPlayingDto = (AppsMiniappsCatalogItemPayloadFriendsPlayingDto) obj;
            return this.type == appsMiniappsCatalogItemPayloadFriendsPlayingDto.type && epx.f(this.appsIds, appsMiniappsCatalogItemPayloadFriendsPlayingDto.appsIds) && epx.f(this.feeds, appsMiniappsCatalogItemPayloadFriendsPlayingDto.feeds) && epx.f(this.profilesIds, appsMiniappsCatalogItemPayloadFriendsPlayingDto.profilesIds) && epx.f(this.apps, appsMiniappsCatalogItemPayloadFriendsPlayingDto.apps);
        }

        public final int hashCode() {
            return this.apps.hashCode() + fw3.a(fw3.a(fw3.a(this.type.hashCode() * 31, 31, this.appsIds), 31, this.feeds), 31, this.profilesIds);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadFriendsPlayingDto(type=");
            sb.append(this.type);
            sb.append(", appsIds=");
            sb.append(this.appsIds);
            sb.append(", feeds=");
            sb.append(this.feeds);
            sb.append(", profilesIds=");
            sb.append(this.profilesIds);
            sb.append(", apps=");
            return ms9.a(')', sb, this.apps);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.appsIds);
            while (a2.hasNext()) {
                parcel.writeInt(((Number) a2.next()).intValue());
            }
            Iterator a3 = ao.a(parcel, this.feeds);
            while (a3.hasNext()) {
                ((AppsMiniappsCatalogItemPayloadGameActivityFeedDto) a3.next()).writeToParcel(parcel, i);
            }
            Iterator a4 = ao.a(parcel, this.profilesIds);
            while (a4.hasNext()) {
                parcel.writeLong(((Number) a4.next()).longValue());
            }
            Iterator a5 = ao.a(parcel, this.apps);
            while (a5.hasNext()) {
                ((AppsMiniappsCatalogGameDto) a5.next()).writeToParcel(parcel, i);
            }
        }
    }

    /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsMiniappsCatalogItemPayloadGameBannerDto extends AppsMiniappsCatalogItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadGameBannerDto> CREATOR = new a();

        @pmi0("banner")
        private final AppsGamesCatalogPromoBannerDto banner;

        @pmi0("items")
        private final List<AppsMiniappsCatalogGameDto> items;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("app_promo_banner")
            public static final TypeDto APP_PROMO_BANNER;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("APP_PROMO_BANNER", 0, "app_promo_banner");
                APP_PROMO_BANNER = typeDto;
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

        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadGameBannerDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGameBannerDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                AppsGamesCatalogPromoBannerDto createFromParcel2 = AppsGamesCatalogPromoBannerDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(AppsMiniappsCatalogGameDto.CREATOR, parcel, arrayList2, i, 1);
                    }
                    arrayList = arrayList2;
                }
                return new AppsMiniappsCatalogItemPayloadGameBannerDto(createFromParcel, createFromParcel2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGameBannerDto[] newArray(int i) {
                return new AppsMiniappsCatalogItemPayloadGameBannerDto[i];
            }
        }

        public /* synthetic */ AppsMiniappsCatalogItemPayloadGameBannerDto(TypeDto typeDto, AppsGamesCatalogPromoBannerDto appsGamesCatalogPromoBannerDto, List list, int i, zcl zclVar) {
            this(typeDto, appsGamesCatalogPromoBannerDto, (i & 4) != 0 ? null : list);
        }

        public final AppsGamesCatalogPromoBannerDto d() {
            return this.banner;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final List<AppsMiniappsCatalogGameDto> e() {
            return this.items;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsMiniappsCatalogItemPayloadGameBannerDto)) {
                return false;
            }
            AppsMiniappsCatalogItemPayloadGameBannerDto appsMiniappsCatalogItemPayloadGameBannerDto = (AppsMiniappsCatalogItemPayloadGameBannerDto) obj;
            return this.type == appsMiniappsCatalogItemPayloadGameBannerDto.type && epx.f(this.banner, appsMiniappsCatalogItemPayloadGameBannerDto.banner) && epx.f(this.items, appsMiniappsCatalogItemPayloadGameBannerDto.items);
        }

        public final int hashCode() {
            int hashCode = (this.banner.hashCode() + (this.type.hashCode() * 31)) * 31;
            List<AppsMiniappsCatalogGameDto> list = this.items;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadGameBannerDto(type=");
            sb.append(this.type);
            sb.append(", banner=");
            sb.append(this.banner);
            sb.append(", items=");
            return ms9.a(')', sb, this.items);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.banner.writeToParcel(parcel, i);
            List<AppsMiniappsCatalogGameDto> list = this.items;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((AppsMiniappsCatalogGameDto) f.next()).writeToParcel(parcel, i);
            }
        }

        public AppsMiniappsCatalogItemPayloadGameBannerDto(TypeDto typeDto, AppsGamesCatalogPromoBannerDto appsGamesCatalogPromoBannerDto, List<AppsMiniappsCatalogGameDto> list) {
            super(null);
            this.type = typeDto;
            this.banner = appsGamesCatalogPromoBannerDto;
            this.items = list;
        }
    }

    /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsMiniappsCatalogItemPayloadGamesAchievementsBlockDto extends AppsMiniappsCatalogItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesAchievementsBlockDto> CREATOR = new a();

        @pmi0("achievement_info")
        private final AppsMiniappsAchievementInfoDto achievementInfo;

        @pmi0("items")
        private final List<AppsMiniappsCatalogGameDto> items;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("games_achievements_block")
            public static final TypeDto GAMES_ACHIEVEMENTS_BLOCK;
            private final String value;

            /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("GAMES_ACHIEVEMENTS_BLOCK", 0, "games_achievements_block");
                GAMES_ACHIEVEMENTS_BLOCK = typeDto;
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

        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesAchievementsBlockDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGamesAchievementsBlockDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                AppsMiniappsAchievementInfoDto createFromParcel2 = AppsMiniappsAchievementInfoDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(AppsMiniappsCatalogGameDto.CREATOR, parcel, arrayList2, i, 1);
                    }
                    arrayList = arrayList2;
                }
                return new AppsMiniappsCatalogItemPayloadGamesAchievementsBlockDto(createFromParcel, createFromParcel2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGamesAchievementsBlockDto[] newArray(int i) {
                return new AppsMiniappsCatalogItemPayloadGamesAchievementsBlockDto[i];
            }
        }

        public /* synthetic */ AppsMiniappsCatalogItemPayloadGamesAchievementsBlockDto(TypeDto typeDto, AppsMiniappsAchievementInfoDto appsMiniappsAchievementInfoDto, List list, int i, zcl zclVar) {
            this(typeDto, appsMiniappsAchievementInfoDto, (i & 4) != 0 ? null : list);
        }

        public final AppsMiniappsAchievementInfoDto d() {
            return this.achievementInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final List<AppsMiniappsCatalogGameDto> e() {
            return this.items;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsMiniappsCatalogItemPayloadGamesAchievementsBlockDto)) {
                return false;
            }
            AppsMiniappsCatalogItemPayloadGamesAchievementsBlockDto appsMiniappsCatalogItemPayloadGamesAchievementsBlockDto = (AppsMiniappsCatalogItemPayloadGamesAchievementsBlockDto) obj;
            return this.type == appsMiniappsCatalogItemPayloadGamesAchievementsBlockDto.type && epx.f(this.achievementInfo, appsMiniappsCatalogItemPayloadGamesAchievementsBlockDto.achievementInfo) && epx.f(this.items, appsMiniappsCatalogItemPayloadGamesAchievementsBlockDto.items);
        }

        public final int hashCode() {
            int hashCode = (this.achievementInfo.hashCode() + (this.type.hashCode() * 31)) * 31;
            List<AppsMiniappsCatalogGameDto> list = this.items;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadGamesAchievementsBlockDto(type=");
            sb.append(this.type);
            sb.append(", achievementInfo=");
            sb.append(this.achievementInfo);
            sb.append(", items=");
            return ms9.a(')', sb, this.items);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.achievementInfo.writeToParcel(parcel, i);
            List<AppsMiniappsCatalogGameDto> list = this.items;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((AppsMiniappsCatalogGameDto) f.next()).writeToParcel(parcel, i);
            }
        }

        public AppsMiniappsCatalogItemPayloadGamesAchievementsBlockDto(TypeDto typeDto, AppsMiniappsAchievementInfoDto appsMiniappsAchievementInfoDto, List<AppsMiniappsCatalogGameDto> list) {
            super(null);
            this.type = typeDto;
            this.achievementInfo = appsMiniappsAchievementInfoDto;
            this.items = list;
        }
    }

    /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsMiniappsCatalogItemPayloadGamesAchievementsDto extends AppsMiniappsCatalogItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesAchievementsDto> CREATOR = new a();

        @pmi0("list")
        private final List<AppsStickerAchievementDto> list;

        @pmi0(X3.i.l)
        private final Integer total;

        @pmi0("type")
        private final AppsMiniappsCatalogItemPayloadGamesAchievementsTypeDto type;

        @pmi0("unlocked")
        private final Integer unlocked;

        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesAchievementsDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGamesAchievementsDto createFromParcel(Parcel parcel) {
                AppsMiniappsCatalogItemPayloadGamesAchievementsTypeDto createFromParcel = AppsMiniappsCatalogItemPayloadGamesAchievementsTypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(AppsStickerAchievementDto.CREATOR, parcel, arrayList, i, 1);
                }
                return new AppsMiniappsCatalogItemPayloadGamesAchievementsDto(createFromParcel, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGamesAchievementsDto[] newArray(int i) {
                return new AppsMiniappsCatalogItemPayloadGamesAchievementsDto[i];
            }
        }

        public /* synthetic */ AppsMiniappsCatalogItemPayloadGamesAchievementsDto(AppsMiniappsCatalogItemPayloadGamesAchievementsTypeDto appsMiniappsCatalogItemPayloadGamesAchievementsTypeDto, List list, Integer num, Integer num2, int i, zcl zclVar) {
            this(appsMiniappsCatalogItemPayloadGamesAchievementsTypeDto, list, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsMiniappsCatalogItemPayloadGamesAchievementsDto)) {
                return false;
            }
            AppsMiniappsCatalogItemPayloadGamesAchievementsDto appsMiniappsCatalogItemPayloadGamesAchievementsDto = (AppsMiniappsCatalogItemPayloadGamesAchievementsDto) obj;
            return this.type == appsMiniappsCatalogItemPayloadGamesAchievementsDto.type && epx.f(this.list, appsMiniappsCatalogItemPayloadGamesAchievementsDto.list) && epx.f(this.unlocked, appsMiniappsCatalogItemPayloadGamesAchievementsDto.unlocked) && epx.f(this.total, appsMiniappsCatalogItemPayloadGamesAchievementsDto.total);
        }

        public final int hashCode() {
            int a2 = fw3.a(this.type.hashCode() * 31, 31, this.list);
            Integer num = this.unlocked;
            int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.total;
            return hashCode + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadGamesAchievementsDto(type=");
            sb.append(this.type);
            sb.append(", list=");
            sb.append(this.list);
            sb.append(", unlocked=");
            sb.append(this.unlocked);
            sb.append(", total=");
            return uqi.b(sb, this.total, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.list);
            while (a2.hasNext()) {
                ((AppsStickerAchievementDto) a2.next()).writeToParcel(parcel, i);
            }
            Integer num = this.unlocked;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            Integer num2 = this.total;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num2);
            }
        }

        public AppsMiniappsCatalogItemPayloadGamesAchievementsDto(AppsMiniappsCatalogItemPayloadGamesAchievementsTypeDto appsMiniappsCatalogItemPayloadGamesAchievementsTypeDto, List<AppsStickerAchievementDto> list, Integer num, Integer num2) {
            super(null);
            this.type = appsMiniappsCatalogItemPayloadGamesAchievementsTypeDto;
            this.list = list;
            this.unlocked = num;
            this.total = num2;
        }
    }

    /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardDto extends AppsMiniappsCatalogItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardDto> CREATOR = new a();

        @pmi0("list")
        private final List<AppsStickerAchievementLeaderBoardDto> list;

        @pmi0("type")
        private final AppsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardTypeDto type;

        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardDto createFromParcel(Parcel parcel) {
                AppsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardTypeDto createFromParcel = AppsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardTypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(AppsStickerAchievementLeaderBoardDto.CREATOR, parcel, arrayList, i, 1);
                }
                return new AppsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardDto(createFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardDto[] newArray(int i) {
                return new AppsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardDto[i];
            }
        }

        public AppsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardDto(AppsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardTypeDto appsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardTypeDto, List<AppsStickerAchievementLeaderBoardDto> list) {
            super(null);
            this.type = appsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardTypeDto;
            this.list = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardDto)) {
                return false;
            }
            AppsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardDto appsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardDto = (AppsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardDto) obj;
            return this.type == appsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardDto.type && epx.f(this.list, appsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardDto.list);
        }

        public final int hashCode() {
            return this.list.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardDto(type=");
            sb.append(this.type);
            sb.append(", list=");
            return ms9.a(')', sb, this.list);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.list);
            while (a2.hasNext()) {
                ((AppsStickerAchievementLeaderBoardDto) a2.next()).writeToParcel(parcel, i);
            }
        }
    }

    /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoDto extends AppsMiniappsCatalogItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoDto> CREATOR = new a();

        @pmi0("banner")
        private final BaseImageDto banner;

        @pmi0("description")
        private final String description;

        @pmi0("title")
        private final String title;

        @pmi0("type")
        private final AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoTypeDto type;

        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoDto createFromParcel(Parcel parcel) {
                return new AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoDto(AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoTypeDto.CREATOR.createFromParcel(parcel), (BaseImageDto) parcel.readParcelable(AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoDto.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoDto[] newArray(int i) {
                return new AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoDto[i];
            }
        }

        public /* synthetic */ AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoDto(AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoTypeDto appsMiniappsCatalogItemPayloadGamesAchievementsPageInfoTypeDto, BaseImageDto baseImageDto, String str, String str2, int i, zcl zclVar) {
            this(appsMiniappsCatalogItemPayloadGamesAchievementsPageInfoTypeDto, (i & 2) != 0 ? null : baseImageDto, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoDto)) {
                return false;
            }
            AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoDto appsMiniappsCatalogItemPayloadGamesAchievementsPageInfoDto = (AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoDto) obj;
            return this.type == appsMiniappsCatalogItemPayloadGamesAchievementsPageInfoDto.type && epx.f(this.banner, appsMiniappsCatalogItemPayloadGamesAchievementsPageInfoDto.banner) && epx.f(this.title, appsMiniappsCatalogItemPayloadGamesAchievementsPageInfoDto.title) && epx.f(this.description, appsMiniappsCatalogItemPayloadGamesAchievementsPageInfoDto.description);
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            BaseImageDto baseImageDto = this.banner;
            int hashCode2 = (hashCode + (baseImageDto == null ? 0 : baseImageDto.hashCode())) * 31;
            String str = this.title;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.description;
            return hashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoDto(type=");
            sb.append(this.type);
            sb.append(", banner=");
            sb.append(this.banner);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", description=");
            return ho8.a(sb, this.description, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.banner, i);
            parcel.writeString(this.title);
            parcel.writeString(this.description);
        }

        public AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoDto(AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoTypeDto appsMiniappsCatalogItemPayloadGamesAchievementsPageInfoTypeDto, BaseImageDto baseImageDto, String str, String str2) {
            super(null);
            this.type = appsMiniappsCatalogItemPayloadGamesAchievementsPageInfoTypeDto;
            this.banner = baseImageDto;
            this.title = str;
            this.description = str2;
        }
    }

    /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsMiniappsCatalogItemPayloadGamesBigHorizontalListDto extends AppsMiniappsCatalogItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesBigHorizontalListDto> CREATOR = new a();

        @pmi0("items")
        private final List<AppsMiniappsCatalogGameDto> items;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("games_big_horizontal_list")
            public static final TypeDto GAMES_BIG_HORIZONTAL_LIST;
            private final String value;

            /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("GAMES_BIG_HORIZONTAL_LIST", 0, "games_big_horizontal_list");
                GAMES_BIG_HORIZONTAL_LIST = typeDto;
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

        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesBigHorizontalListDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGamesBigHorizontalListDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(AppsMiniappsCatalogGameDto.CREATOR, parcel, arrayList, i, 1);
                }
                return new AppsMiniappsCatalogItemPayloadGamesBigHorizontalListDto(createFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGamesBigHorizontalListDto[] newArray(int i) {
                return new AppsMiniappsCatalogItemPayloadGamesBigHorizontalListDto[i];
            }
        }

        public AppsMiniappsCatalogItemPayloadGamesBigHorizontalListDto(TypeDto typeDto, List<AppsMiniappsCatalogGameDto> list) {
            super(null);
            this.type = typeDto;
            this.items = list;
        }

        public final List<AppsMiniappsCatalogGameDto> d() {
            return this.items;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsMiniappsCatalogItemPayloadGamesBigHorizontalListDto)) {
                return false;
            }
            AppsMiniappsCatalogItemPayloadGamesBigHorizontalListDto appsMiniappsCatalogItemPayloadGamesBigHorizontalListDto = (AppsMiniappsCatalogItemPayloadGamesBigHorizontalListDto) obj;
            return this.type == appsMiniappsCatalogItemPayloadGamesBigHorizontalListDto.type && epx.f(this.items, appsMiniappsCatalogItemPayloadGamesBigHorizontalListDto.items);
        }

        public final int hashCode() {
            return this.items.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadGamesBigHorizontalListDto(type=");
            sb.append(this.type);
            sb.append(", items=");
            return ms9.a(')', sb, this.items);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                ((AppsMiniappsCatalogGameDto) a2.next()).writeToParcel(parcel, i);
            }
        }
    }

    /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsMiniappsCatalogItemPayloadGamesCollectionsListDto extends AppsMiniappsCatalogItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesCollectionsListDto> CREATOR = new a();

        @pmi0("collections")
        private final List<AppsGamesCatalogCollectionDto> collections;

        @pmi0("type")
        private final AppsMiniappsCatalogItemPayloadGamesCollectionsListTypeDto type;

        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesCollectionsListDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGamesCollectionsListDto createFromParcel(Parcel parcel) {
                AppsMiniappsCatalogItemPayloadGamesCollectionsListTypeDto createFromParcel = AppsMiniappsCatalogItemPayloadGamesCollectionsListTypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(AppsGamesCatalogCollectionDto.CREATOR, parcel, arrayList, i, 1);
                }
                return new AppsMiniappsCatalogItemPayloadGamesCollectionsListDto(createFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGamesCollectionsListDto[] newArray(int i) {
                return new AppsMiniappsCatalogItemPayloadGamesCollectionsListDto[i];
            }
        }

        public AppsMiniappsCatalogItemPayloadGamesCollectionsListDto(AppsMiniappsCatalogItemPayloadGamesCollectionsListTypeDto appsMiniappsCatalogItemPayloadGamesCollectionsListTypeDto, List<AppsGamesCatalogCollectionDto> list) {
            super(null);
            this.type = appsMiniappsCatalogItemPayloadGamesCollectionsListTypeDto;
            this.collections = list;
        }

        public final List<AppsGamesCatalogCollectionDto> d() {
            return this.collections;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsMiniappsCatalogItemPayloadGamesCollectionsListDto)) {
                return false;
            }
            AppsMiniappsCatalogItemPayloadGamesCollectionsListDto appsMiniappsCatalogItemPayloadGamesCollectionsListDto = (AppsMiniappsCatalogItemPayloadGamesCollectionsListDto) obj;
            return this.type == appsMiniappsCatalogItemPayloadGamesCollectionsListDto.type && epx.f(this.collections, appsMiniappsCatalogItemPayloadGamesCollectionsListDto.collections);
        }

        public final int hashCode() {
            return this.collections.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadGamesCollectionsListDto(type=");
            sb.append(this.type);
            sb.append(", collections=");
            return ms9.a(')', sb, this.collections);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.collections);
            while (a2.hasNext()) {
                ((AppsGamesCatalogCollectionDto) a2.next()).writeToParcel(parcel, i);
            }
        }
    }

    /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsMiniappsCatalogItemPayloadGamesFeedDto extends AppsMiniappsCatalogItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesFeedDto> CREATOR = new a();

        @pmi0("blacklist_button_text")
        private final String blacklistButtonText;

        @pmi0("list")
        private final List<AppsCatalogGamesFeedItemDto> list;

        @pmi0("new_count")
        private final Integer newCount;

        @pmi0("offset_news")
        private final String offsetNews;

        @pmi0("offset_notifications")
        private final int offsetNotifications;

        @pmi0("profiles_ids")
        private final List<Long> profilesIds;

        @pmi0("type")
        private final AppsMiniappsCatalogItemPayloadGamesFeedTypeDto type;

        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesFeedDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGamesFeedDto createFromParcel(Parcel parcel) {
                AppsMiniappsCatalogItemPayloadGamesFeedTypeDto createFromParcel = AppsMiniappsCatalogItemPayloadGamesFeedTypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(AppsMiniappsCatalogItemPayloadGamesFeedDto.class, parcel, arrayList, i2, 1);
                }
                int readInt2 = parcel.readInt();
                String readString = parcel.readString();
                int readInt3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = k73.b(parcel, arrayList2, i, 1);
                }
                return new AppsMiniappsCatalogItemPayloadGamesFeedDto(createFromParcel, arrayList, readInt2, readString, arrayList2, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGamesFeedDto[] newArray(int i) {
                return new AppsMiniappsCatalogItemPayloadGamesFeedDto[i];
            }
        }

        public /* synthetic */ AppsMiniappsCatalogItemPayloadGamesFeedDto(AppsMiniappsCatalogItemPayloadGamesFeedTypeDto appsMiniappsCatalogItemPayloadGamesFeedTypeDto, List list, int i, String str, List list2, String str2, Integer num, int i2, zcl zclVar) {
            this(appsMiniappsCatalogItemPayloadGamesFeedTypeDto, list, i, str, list2, str2, (i2 & 64) != 0 ? null : num);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsMiniappsCatalogItemPayloadGamesFeedDto)) {
                return false;
            }
            AppsMiniappsCatalogItemPayloadGamesFeedDto appsMiniappsCatalogItemPayloadGamesFeedDto = (AppsMiniappsCatalogItemPayloadGamesFeedDto) obj;
            return this.type == appsMiniappsCatalogItemPayloadGamesFeedDto.type && epx.f(this.list, appsMiniappsCatalogItemPayloadGamesFeedDto.list) && this.offsetNotifications == appsMiniappsCatalogItemPayloadGamesFeedDto.offsetNotifications && epx.f(this.offsetNews, appsMiniappsCatalogItemPayloadGamesFeedDto.offsetNews) && epx.f(this.profilesIds, appsMiniappsCatalogItemPayloadGamesFeedDto.profilesIds) && epx.f(this.blacklistButtonText, appsMiniappsCatalogItemPayloadGamesFeedDto.blacklistButtonText) && epx.f(this.newCount, appsMiniappsCatalogItemPayloadGamesFeedDto.newCount);
        }

        public final int hashCode() {
            int a2 = urd0.a(fw3.a(urd0.a(shy.a(this.offsetNotifications, fw3.a(this.type.hashCode() * 31, 31, this.list), 31), 31, this.offsetNews), 31, this.profilesIds), 31, this.blacklistButtonText);
            Integer num = this.newCount;
            return a2 + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadGamesFeedDto(type=");
            sb.append(this.type);
            sb.append(", list=");
            sb.append(this.list);
            sb.append(", offsetNotifications=");
            sb.append(this.offsetNotifications);
            sb.append(", offsetNews=");
            sb.append(this.offsetNews);
            sb.append(", profilesIds=");
            sb.append(this.profilesIds);
            sb.append(", blacklistButtonText=");
            sb.append(this.blacklistButtonText);
            sb.append(", newCount=");
            return uqi.b(sb, this.newCount, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.list);
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
            parcel.writeInt(this.offsetNotifications);
            parcel.writeString(this.offsetNews);
            Iterator a3 = ao.a(parcel, this.profilesIds);
            while (a3.hasNext()) {
                parcel.writeLong(((Number) a3.next()).longValue());
            }
            parcel.writeString(this.blacklistButtonText);
            Integer num = this.newCount;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AppsMiniappsCatalogItemPayloadGamesFeedDto(AppsMiniappsCatalogItemPayloadGamesFeedTypeDto appsMiniappsCatalogItemPayloadGamesFeedTypeDto, List<? extends AppsCatalogGamesFeedItemDto> list, int i, String str, List<Long> list2, String str2, Integer num) {
            super(null);
            this.type = appsMiniappsCatalogItemPayloadGamesFeedTypeDto;
            this.list = list;
            this.offsetNotifications = i;
            this.offsetNews = str;
            this.profilesIds = list2;
            this.blacklistButtonText = str2;
            this.newCount = num;
        }
    }

    /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsMiniappsCatalogItemPayloadGamesHalfCardsDto extends AppsMiniappsCatalogItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesHalfCardsDto> CREATOR = new a();

        @pmi0("items")
        private final List<AppsMiniappsCatalogGameDto> items;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("games_half_cards")
            public static final TypeDto GAMES_HALF_CARDS;
            private final String value;

            /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("GAMES_HALF_CARDS", 0, "games_half_cards");
                GAMES_HALF_CARDS = typeDto;
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

        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesHalfCardsDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGamesHalfCardsDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(AppsMiniappsCatalogGameDto.CREATOR, parcel, arrayList, i, 1);
                }
                return new AppsMiniappsCatalogItemPayloadGamesHalfCardsDto(createFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGamesHalfCardsDto[] newArray(int i) {
                return new AppsMiniappsCatalogItemPayloadGamesHalfCardsDto[i];
            }
        }

        public AppsMiniappsCatalogItemPayloadGamesHalfCardsDto(TypeDto typeDto, List<AppsMiniappsCatalogGameDto> list) {
            super(null);
            this.type = typeDto;
            this.items = list;
        }

        public final List<AppsMiniappsCatalogGameDto> d() {
            return this.items;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsMiniappsCatalogItemPayloadGamesHalfCardsDto)) {
                return false;
            }
            AppsMiniappsCatalogItemPayloadGamesHalfCardsDto appsMiniappsCatalogItemPayloadGamesHalfCardsDto = (AppsMiniappsCatalogItemPayloadGamesHalfCardsDto) obj;
            return this.type == appsMiniappsCatalogItemPayloadGamesHalfCardsDto.type && epx.f(this.items, appsMiniappsCatalogItemPayloadGamesHalfCardsDto.items);
        }

        public final int hashCode() {
            return this.items.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadGamesHalfCardsDto(type=");
            sb.append(this.type);
            sb.append(", items=");
            return ms9.a(')', sb, this.items);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                ((AppsMiniappsCatalogGameDto) a2.next()).writeToParcel(parcel, i);
            }
        }
    }

    /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsMiniappsCatalogItemPayloadGamesHalfHorizontalListDto extends AppsMiniappsCatalogItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesHalfHorizontalListDto> CREATOR = new a();

        @pmi0("items")
        private final List<AppsMiniappsCatalogGameDto> items;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("games_half_horizontal_list")
            public static final TypeDto GAMES_HALF_HORIZONTAL_LIST;
            private final String value;

            /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("GAMES_HALF_HORIZONTAL_LIST", 0, "games_half_horizontal_list");
                GAMES_HALF_HORIZONTAL_LIST = typeDto;
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

        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesHalfHorizontalListDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGamesHalfHorizontalListDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(AppsMiniappsCatalogGameDto.CREATOR, parcel, arrayList, i, 1);
                }
                return new AppsMiniappsCatalogItemPayloadGamesHalfHorizontalListDto(createFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGamesHalfHorizontalListDto[] newArray(int i) {
                return new AppsMiniappsCatalogItemPayloadGamesHalfHorizontalListDto[i];
            }
        }

        public AppsMiniappsCatalogItemPayloadGamesHalfHorizontalListDto(TypeDto typeDto, List<AppsMiniappsCatalogGameDto> list) {
            super(null);
            this.type = typeDto;
            this.items = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsMiniappsCatalogItemPayloadGamesHalfHorizontalListDto)) {
                return false;
            }
            AppsMiniappsCatalogItemPayloadGamesHalfHorizontalListDto appsMiniappsCatalogItemPayloadGamesHalfHorizontalListDto = (AppsMiniappsCatalogItemPayloadGamesHalfHorizontalListDto) obj;
            return this.type == appsMiniappsCatalogItemPayloadGamesHalfHorizontalListDto.type && epx.f(this.items, appsMiniappsCatalogItemPayloadGamesHalfHorizontalListDto.items);
        }

        public final int hashCode() {
            return this.items.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadGamesHalfHorizontalListDto(type=");
            sb.append(this.type);
            sb.append(", items=");
            return ms9.a(')', sb, this.items);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                ((AppsMiniappsCatalogGameDto) a2.next()).writeToParcel(parcel, i);
            }
        }
    }

    /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsMiniappsCatalogItemPayloadGamesHorizontalListDto extends AppsMiniappsCatalogItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesHorizontalListDto> CREATOR = new a();

        @pmi0("items")
        private final List<AppsMiniappsCatalogGameDto> items;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("games_horizontal_list")
            public static final TypeDto GAMES_HORIZONTAL_LIST;
            private final String value;

            /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("GAMES_HORIZONTAL_LIST", 0, "games_horizontal_list");
                GAMES_HORIZONTAL_LIST = typeDto;
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

        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesHorizontalListDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGamesHorizontalListDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(AppsMiniappsCatalogGameDto.CREATOR, parcel, arrayList, i, 1);
                }
                return new AppsMiniappsCatalogItemPayloadGamesHorizontalListDto(createFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGamesHorizontalListDto[] newArray(int i) {
                return new AppsMiniappsCatalogItemPayloadGamesHorizontalListDto[i];
            }
        }

        public AppsMiniappsCatalogItemPayloadGamesHorizontalListDto(TypeDto typeDto, List<AppsMiniappsCatalogGameDto> list) {
            super(null);
            this.type = typeDto;
            this.items = list;
        }

        public final List<AppsMiniappsCatalogGameDto> d() {
            return this.items;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsMiniappsCatalogItemPayloadGamesHorizontalListDto)) {
                return false;
            }
            AppsMiniappsCatalogItemPayloadGamesHorizontalListDto appsMiniappsCatalogItemPayloadGamesHorizontalListDto = (AppsMiniappsCatalogItemPayloadGamesHorizontalListDto) obj;
            return this.type == appsMiniappsCatalogItemPayloadGamesHorizontalListDto.type && epx.f(this.items, appsMiniappsCatalogItemPayloadGamesHorizontalListDto.items);
        }

        public final int hashCode() {
            return this.items.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadGamesHorizontalListDto(type=");
            sb.append(this.type);
            sb.append(", items=");
            return ms9.a(')', sb, this.items);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                ((AppsMiniappsCatalogGameDto) a2.next()).writeToParcel(parcel, i);
            }
        }
    }

    /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsMiniappsCatalogItemPayloadGamesListWithActionDto extends AppsMiniappsCatalogItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesListWithActionDto> CREATOR = new a();

        @pmi0("button_icon_url")
        private final String buttonIconUrl;

        @pmi0("button_text")
        private final String buttonText;

        @pmi0("payload")
        private final AppsMiniappsCatalogGameDto payload;

        @pmi0("type")
        private final AppsMiniappsCatalogItemPayloadGamesListWithActionTypeDto type;

        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesListWithActionDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGamesListWithActionDto createFromParcel(Parcel parcel) {
                return new AppsMiniappsCatalogItemPayloadGamesListWithActionDto(AppsMiniappsCatalogItemPayloadGamesListWithActionTypeDto.CREATOR.createFromParcel(parcel), AppsMiniappsCatalogGameDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGamesListWithActionDto[] newArray(int i) {
                return new AppsMiniappsCatalogItemPayloadGamesListWithActionDto[i];
            }
        }

        public /* synthetic */ AppsMiniappsCatalogItemPayloadGamesListWithActionDto(AppsMiniappsCatalogItemPayloadGamesListWithActionTypeDto appsMiniappsCatalogItemPayloadGamesListWithActionTypeDto, AppsMiniappsCatalogGameDto appsMiniappsCatalogGameDto, String str, String str2, int i, zcl zclVar) {
            this(appsMiniappsCatalogItemPayloadGamesListWithActionTypeDto, appsMiniappsCatalogGameDto, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
        }

        public final String d() {
            return this.buttonText;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final AppsMiniappsCatalogGameDto e() {
            return this.payload;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsMiniappsCatalogItemPayloadGamesListWithActionDto)) {
                return false;
            }
            AppsMiniappsCatalogItemPayloadGamesListWithActionDto appsMiniappsCatalogItemPayloadGamesListWithActionDto = (AppsMiniappsCatalogItemPayloadGamesListWithActionDto) obj;
            return this.type == appsMiniappsCatalogItemPayloadGamesListWithActionDto.type && epx.f(this.payload, appsMiniappsCatalogItemPayloadGamesListWithActionDto.payload) && epx.f(this.buttonText, appsMiniappsCatalogItemPayloadGamesListWithActionDto.buttonText) && epx.f(this.buttonIconUrl, appsMiniappsCatalogItemPayloadGamesListWithActionDto.buttonIconUrl);
        }

        public final int hashCode() {
            int hashCode = (this.payload.hashCode() + (this.type.hashCode() * 31)) * 31;
            String str = this.buttonText;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.buttonIconUrl;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadGamesListWithActionDto(type=");
            sb.append(this.type);
            sb.append(", payload=");
            sb.append(this.payload);
            sb.append(", buttonText=");
            sb.append(this.buttonText);
            sb.append(", buttonIconUrl=");
            return ho8.a(sb, this.buttonIconUrl, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.payload.writeToParcel(parcel, i);
            parcel.writeString(this.buttonText);
            parcel.writeString(this.buttonIconUrl);
        }

        public AppsMiniappsCatalogItemPayloadGamesListWithActionDto(AppsMiniappsCatalogItemPayloadGamesListWithActionTypeDto appsMiniappsCatalogItemPayloadGamesListWithActionTypeDto, AppsMiniappsCatalogGameDto appsMiniappsCatalogGameDto, String str, String str2) {
            super(null);
            this.type = appsMiniappsCatalogItemPayloadGamesListWithActionTypeDto;
            this.payload = appsMiniappsCatalogGameDto;
            this.buttonText = str;
            this.buttonIconUrl = str2;
        }
    }

    /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsMiniappsCatalogItemPayloadGamesListWithFooterDto extends AppsMiniappsCatalogItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesListWithFooterDto> CREATOR = new a();

        @pmi0("items")
        private final List<AppsMiniappsCatalogItemPayloadGamesListWithFooterItemDto> items;

        @pmi0("type")
        private final AppsMiniappsCatalogItemPayloadGamesListWithFooterTypeDto type;

        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesListWithFooterDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGamesListWithFooterDto createFromParcel(Parcel parcel) {
                AppsMiniappsCatalogItemPayloadGamesListWithFooterTypeDto createFromParcel = AppsMiniappsCatalogItemPayloadGamesListWithFooterTypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(AppsMiniappsCatalogItemPayloadGamesListWithFooterItemDto.CREATOR, parcel, arrayList, i, 1);
                }
                return new AppsMiniappsCatalogItemPayloadGamesListWithFooterDto(createFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGamesListWithFooterDto[] newArray(int i) {
                return new AppsMiniappsCatalogItemPayloadGamesListWithFooterDto[i];
            }
        }

        public AppsMiniappsCatalogItemPayloadGamesListWithFooterDto(AppsMiniappsCatalogItemPayloadGamesListWithFooterTypeDto appsMiniappsCatalogItemPayloadGamesListWithFooterTypeDto, List<AppsMiniappsCatalogItemPayloadGamesListWithFooterItemDto> list) {
            super(null);
            this.type = appsMiniappsCatalogItemPayloadGamesListWithFooterTypeDto;
            this.items = list;
        }

        public final List<AppsMiniappsCatalogItemPayloadGamesListWithFooterItemDto> d() {
            return this.items;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsMiniappsCatalogItemPayloadGamesListWithFooterDto)) {
                return false;
            }
            AppsMiniappsCatalogItemPayloadGamesListWithFooterDto appsMiniappsCatalogItemPayloadGamesListWithFooterDto = (AppsMiniappsCatalogItemPayloadGamesListWithFooterDto) obj;
            return this.type == appsMiniappsCatalogItemPayloadGamesListWithFooterDto.type && epx.f(this.items, appsMiniappsCatalogItemPayloadGamesListWithFooterDto.items);
        }

        public final int hashCode() {
            return this.items.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadGamesListWithFooterDto(type=");
            sb.append(this.type);
            sb.append(", items=");
            return ms9.a(')', sb, this.items);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                ((AppsMiniappsCatalogItemPayloadGamesListWithFooterItemDto) a2.next()).writeToParcel(parcel, i);
            }
        }
    }

    /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsMiniappsCatalogItemPayloadGamesProfileDto extends AppsMiniappsCatalogItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesProfileDto> CREATOR = new a();

        @pmi0(X3.j.D)
        private final String domain;

        @pmi0("href")
        private final String href;

        @pmi0("photo")
        private final String photo;

        @pmi0("profiles_ids")
        private final List<Long> profilesIds;

        @pmi0("type")
        private final AppsMiniappsCatalogItemPayloadGamesProfileTypeDto type;

        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesProfileDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGamesProfileDto createFromParcel(Parcel parcel) {
                AppsMiniappsCatalogItemPayloadGamesProfileTypeDto createFromParcel = AppsMiniappsCatalogItemPayloadGamesProfileTypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = k73.b(parcel, arrayList, i, 1);
                }
                return new AppsMiniappsCatalogItemPayloadGamesProfileDto(createFromParcel, arrayList, parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGamesProfileDto[] newArray(int i) {
                return new AppsMiniappsCatalogItemPayloadGamesProfileDto[i];
            }
        }

        public /* synthetic */ AppsMiniappsCatalogItemPayloadGamesProfileDto(AppsMiniappsCatalogItemPayloadGamesProfileTypeDto appsMiniappsCatalogItemPayloadGamesProfileTypeDto, List list, String str, String str2, String str3, int i, zcl zclVar) {
            this(appsMiniappsCatalogItemPayloadGamesProfileTypeDto, list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsMiniappsCatalogItemPayloadGamesProfileDto)) {
                return false;
            }
            AppsMiniappsCatalogItemPayloadGamesProfileDto appsMiniappsCatalogItemPayloadGamesProfileDto = (AppsMiniappsCatalogItemPayloadGamesProfileDto) obj;
            return this.type == appsMiniappsCatalogItemPayloadGamesProfileDto.type && epx.f(this.profilesIds, appsMiniappsCatalogItemPayloadGamesProfileDto.profilesIds) && epx.f(this.href, appsMiniappsCatalogItemPayloadGamesProfileDto.href) && epx.f(this.domain, appsMiniappsCatalogItemPayloadGamesProfileDto.domain) && epx.f(this.photo, appsMiniappsCatalogItemPayloadGamesProfileDto.photo);
        }

        public final int hashCode() {
            int a2 = fw3.a(this.type.hashCode() * 31, 31, this.profilesIds);
            String str = this.href;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.domain;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.photo;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadGamesProfileDto(type=");
            sb.append(this.type);
            sb.append(", profilesIds=");
            sb.append(this.profilesIds);
            sb.append(", href=");
            sb.append(this.href);
            sb.append(", domain=");
            sb.append(this.domain);
            sb.append(", photo=");
            return ho8.a(sb, this.photo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.profilesIds);
            while (a2.hasNext()) {
                parcel.writeLong(((Number) a2.next()).longValue());
            }
            parcel.writeString(this.href);
            parcel.writeString(this.domain);
            parcel.writeString(this.photo);
        }

        public AppsMiniappsCatalogItemPayloadGamesProfileDto(AppsMiniappsCatalogItemPayloadGamesProfileTypeDto appsMiniappsCatalogItemPayloadGamesProfileTypeDto, List<Long> list, String str, String str2, String str3) {
            super(null);
            this.type = appsMiniappsCatalogItemPayloadGamesProfileTypeDto;
            this.profilesIds = list;
            this.href = str;
            this.domain = str2;
            this.photo = str3;
        }
    }

    /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsMiniappsCatalogItemPayloadGamesSearchPopularSuggestionsDto extends AppsMiniappsCatalogItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesSearchPopularSuggestionsDto> CREATOR = new a();

        @pmi0("popular_suggestions")
        private final List<String> popularSuggestions;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("search_popular_suggestions")
            public static final TypeDto SEARCH_POPULAR_SUGGESTIONS;
            private final String value;

            /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("SEARCH_POPULAR_SUGGESTIONS", 0, "search_popular_suggestions");
                SEARCH_POPULAR_SUGGESTIONS = typeDto;
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

        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesSearchPopularSuggestionsDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGamesSearchPopularSuggestionsDto createFromParcel(Parcel parcel) {
                return new AppsMiniappsCatalogItemPayloadGamesSearchPopularSuggestionsDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGamesSearchPopularSuggestionsDto[] newArray(int i) {
                return new AppsMiniappsCatalogItemPayloadGamesSearchPopularSuggestionsDto[i];
            }
        }

        public AppsMiniappsCatalogItemPayloadGamesSearchPopularSuggestionsDto(TypeDto typeDto, List<String> list) {
            super(null);
            this.type = typeDto;
            this.popularSuggestions = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsMiniappsCatalogItemPayloadGamesSearchPopularSuggestionsDto)) {
                return false;
            }
            AppsMiniappsCatalogItemPayloadGamesSearchPopularSuggestionsDto appsMiniappsCatalogItemPayloadGamesSearchPopularSuggestionsDto = (AppsMiniappsCatalogItemPayloadGamesSearchPopularSuggestionsDto) obj;
            return this.type == appsMiniappsCatalogItemPayloadGamesSearchPopularSuggestionsDto.type && epx.f(this.popularSuggestions, appsMiniappsCatalogItemPayloadGamesSearchPopularSuggestionsDto.popularSuggestions);
        }

        public final int hashCode() {
            return this.popularSuggestions.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadGamesSearchPopularSuggestionsDto(type=");
            sb.append(this.type);
            sb.append(", popularSuggestions=");
            return ms9.a(')', sb, this.popularSuggestions);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeStringList(this.popularSuggestions);
        }
    }

    /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsMiniappsCatalogItemPayloadGamesSingleRowDto extends AppsMiniappsCatalogItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesSingleRowDto> CREATOR = new a();

        @pmi0("items")
        private final List<AppsMiniappsCatalogGameDto> items;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("games_single_row")
            public static final TypeDto GAMES_SINGLE_ROW;
            private final String value;

            /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("GAMES_SINGLE_ROW", 0, "games_single_row");
                GAMES_SINGLE_ROW = typeDto;
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

        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesSingleRowDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGamesSingleRowDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(AppsMiniappsCatalogGameDto.CREATOR, parcel, arrayList, i, 1);
                }
                return new AppsMiniappsCatalogItemPayloadGamesSingleRowDto(createFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGamesSingleRowDto[] newArray(int i) {
                return new AppsMiniappsCatalogItemPayloadGamesSingleRowDto[i];
            }
        }

        public AppsMiniappsCatalogItemPayloadGamesSingleRowDto(TypeDto typeDto, List<AppsMiniappsCatalogGameDto> list) {
            super(null);
            this.type = typeDto;
            this.items = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsMiniappsCatalogItemPayloadGamesSingleRowDto)) {
                return false;
            }
            AppsMiniappsCatalogItemPayloadGamesSingleRowDto appsMiniappsCatalogItemPayloadGamesSingleRowDto = (AppsMiniappsCatalogItemPayloadGamesSingleRowDto) obj;
            return this.type == appsMiniappsCatalogItemPayloadGamesSingleRowDto.type && epx.f(this.items, appsMiniappsCatalogItemPayloadGamesSingleRowDto.items);
        }

        public final int hashCode() {
            return this.items.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadGamesSingleRowDto(type=");
            sb.append(this.type);
            sb.append(", items=");
            return ms9.a(')', sb, this.items);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                ((AppsMiniappsCatalogGameDto) a2.next()).writeToParcel(parcel, i);
            }
        }
    }

    /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsMiniappsCatalogItemPayloadGamesTagsListDto extends AppsMiniappsCatalogItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesTagsListDto> CREATOR = new a();

        @pmi0("tags_list")
        private final List<AppsGameTagDto> tagsList;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("games_tags_list")
            public static final TypeDto GAMES_TAGS_LIST;
            private final String value;

            /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("GAMES_TAGS_LIST", 0, "games_tags_list");
                GAMES_TAGS_LIST = typeDto;
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

        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesTagsListDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGamesTagsListDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(AppsGameTagDto.CREATOR, parcel, arrayList, i, 1);
                }
                return new AppsMiniappsCatalogItemPayloadGamesTagsListDto(createFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGamesTagsListDto[] newArray(int i) {
                return new AppsMiniappsCatalogItemPayloadGamesTagsListDto[i];
            }
        }

        public AppsMiniappsCatalogItemPayloadGamesTagsListDto(TypeDto typeDto, List<AppsGameTagDto> list) {
            super(null);
            this.type = typeDto;
            this.tagsList = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsMiniappsCatalogItemPayloadGamesTagsListDto)) {
                return false;
            }
            AppsMiniappsCatalogItemPayloadGamesTagsListDto appsMiniappsCatalogItemPayloadGamesTagsListDto = (AppsMiniappsCatalogItemPayloadGamesTagsListDto) obj;
            return this.type == appsMiniappsCatalogItemPayloadGamesTagsListDto.type && epx.f(this.tagsList, appsMiniappsCatalogItemPayloadGamesTagsListDto.tagsList);
        }

        public final int hashCode() {
            return this.tagsList.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadGamesTagsListDto(type=");
            sb.append(this.type);
            sb.append(", tagsList=");
            return ms9.a(')', sb, this.tagsList);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.tagsList);
            while (a2.hasNext()) {
                ((AppsGameTagDto) a2.next()).writeToParcel(parcel, i);
            }
        }
    }

    /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsMiniappsCatalogItemPayloadGamesVerticalListDto extends AppsMiniappsCatalogItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesVerticalListDto> CREATOR = new a();

        @pmi0("items")
        private final List<AppsMiniappsCatalogGameDto> items;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("games_vertical_list")
            public static final TypeDto GAMES_VERTICAL_LIST;
            private final String value;

            /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("GAMES_VERTICAL_LIST", 0, "games_vertical_list");
                GAMES_VERTICAL_LIST = typeDto;
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

        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesVerticalListDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGamesVerticalListDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(AppsMiniappsCatalogGameDto.CREATOR, parcel, arrayList, i, 1);
                }
                return new AppsMiniappsCatalogItemPayloadGamesVerticalListDto(createFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGamesVerticalListDto[] newArray(int i) {
                return new AppsMiniappsCatalogItemPayloadGamesVerticalListDto[i];
            }
        }

        public AppsMiniappsCatalogItemPayloadGamesVerticalListDto(TypeDto typeDto, List<AppsMiniappsCatalogGameDto> list) {
            super(null);
            this.type = typeDto;
            this.items = list;
        }

        public final List<AppsMiniappsCatalogGameDto> d() {
            return this.items;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsMiniappsCatalogItemPayloadGamesVerticalListDto)) {
                return false;
            }
            AppsMiniappsCatalogItemPayloadGamesVerticalListDto appsMiniappsCatalogItemPayloadGamesVerticalListDto = (AppsMiniappsCatalogItemPayloadGamesVerticalListDto) obj;
            return this.type == appsMiniappsCatalogItemPayloadGamesVerticalListDto.type && epx.f(this.items, appsMiniappsCatalogItemPayloadGamesVerticalListDto.items);
        }

        public final int hashCode() {
            return this.items.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadGamesVerticalListDto(type=");
            sb.append(this.type);
            sb.append(", items=");
            return ms9.a(')', sb, this.items);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                ((AppsMiniappsCatalogGameDto) a2.next()).writeToParcel(parcel, i);
            }
        }
    }

    /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsMiniappsCatalogItemPayloadGamesVerticalListWithEmptyDto extends AppsMiniappsCatalogItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesVerticalListWithEmptyDto> CREATOR = new a();

        @pmi0("empty")
        private final AppsMiniappsCatalogItemPayloadEmptyStateDto empty;

        @pmi0("items")
        private final List<AppsMiniappsCatalogGameDto> items;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("games_vertical_list_with_empty")
            public static final TypeDto GAMES_VERTICAL_LIST_WITH_EMPTY;
            private final String value;

            /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("GAMES_VERTICAL_LIST_WITH_EMPTY", 0, "games_vertical_list_with_empty");
                GAMES_VERTICAL_LIST_WITH_EMPTY = typeDto;
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

        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesVerticalListWithEmptyDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGamesVerticalListWithEmptyDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(AppsMiniappsCatalogGameDto.CREATOR, parcel, arrayList, i, 1);
                }
                return new AppsMiniappsCatalogItemPayloadGamesVerticalListWithEmptyDto(createFromParcel, arrayList, AppsMiniappsCatalogItemPayloadEmptyStateDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadGamesVerticalListWithEmptyDto[] newArray(int i) {
                return new AppsMiniappsCatalogItemPayloadGamesVerticalListWithEmptyDto[i];
            }
        }

        public AppsMiniappsCatalogItemPayloadGamesVerticalListWithEmptyDto(TypeDto typeDto, List<AppsMiniappsCatalogGameDto> list, AppsMiniappsCatalogItemPayloadEmptyStateDto appsMiniappsCatalogItemPayloadEmptyStateDto) {
            super(null);
            this.type = typeDto;
            this.items = list;
            this.empty = appsMiniappsCatalogItemPayloadEmptyStateDto;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsMiniappsCatalogItemPayloadGamesVerticalListWithEmptyDto)) {
                return false;
            }
            AppsMiniappsCatalogItemPayloadGamesVerticalListWithEmptyDto appsMiniappsCatalogItemPayloadGamesVerticalListWithEmptyDto = (AppsMiniappsCatalogItemPayloadGamesVerticalListWithEmptyDto) obj;
            return this.type == appsMiniappsCatalogItemPayloadGamesVerticalListWithEmptyDto.type && epx.f(this.items, appsMiniappsCatalogItemPayloadGamesVerticalListWithEmptyDto.items) && epx.f(this.empty, appsMiniappsCatalogItemPayloadGamesVerticalListWithEmptyDto.empty);
        }

        public final int hashCode() {
            return this.empty.hashCode() + fw3.a(this.type.hashCode() * 31, 31, this.items);
        }

        public final String toString() {
            return "AppsMiniappsCatalogItemPayloadGamesVerticalListWithEmptyDto(type=" + this.type + ", items=" + this.items + ", empty=" + this.empty + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                ((AppsMiniappsCatalogGameDto) a2.next()).writeToParcel(parcel, i);
            }
            this.empty.writeToParcel(parcel, i);
        }
    }

    /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsMiniappsCatalogItemPayloadListDto extends AppsMiniappsCatalogItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadListDto> CREATOR = new a();

        @pmi0("items")
        private final List<AppsMiniappsCatalogItemPayloadListItemDto> items;

        @pmi0("type")
        private final AppsMiniappsCatalogItemPayloadListTypeDto type;

        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadListDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadListDto createFromParcel(Parcel parcel) {
                AppsMiniappsCatalogItemPayloadListTypeDto createFromParcel = AppsMiniappsCatalogItemPayloadListTypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(AppsMiniappsCatalogItemPayloadListItemDto.CREATOR, parcel, arrayList, i, 1);
                }
                return new AppsMiniappsCatalogItemPayloadListDto(createFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadListDto[] newArray(int i) {
                return new AppsMiniappsCatalogItemPayloadListDto[i];
            }
        }

        public AppsMiniappsCatalogItemPayloadListDto(AppsMiniappsCatalogItemPayloadListTypeDto appsMiniappsCatalogItemPayloadListTypeDto, List<AppsMiniappsCatalogItemPayloadListItemDto> list) {
            super(null);
            this.type = appsMiniappsCatalogItemPayloadListTypeDto;
            this.items = list;
        }

        public final List<AppsMiniappsCatalogItemPayloadListItemDto> d() {
            return this.items;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsMiniappsCatalogItemPayloadListDto)) {
                return false;
            }
            AppsMiniappsCatalogItemPayloadListDto appsMiniappsCatalogItemPayloadListDto = (AppsMiniappsCatalogItemPayloadListDto) obj;
            return this.type == appsMiniappsCatalogItemPayloadListDto.type && epx.f(this.items, appsMiniappsCatalogItemPayloadListDto.items);
        }

        public final int hashCode() {
            return this.items.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadListDto(type=");
            sb.append(this.type);
            sb.append(", items=");
            return ms9.a(')', sb, this.items);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                ((AppsMiniappsCatalogItemPayloadListItemDto) a2.next()).writeToParcel(parcel, i);
            }
        }
    }

    /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsMiniappsCatalogItemPayloadNotificationsListDto extends AppsMiniappsCatalogItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadNotificationsListDto> CREATOR = new a();

        @pmi0("apps")
        private final List<AppsMiniappsCatalogGameDto> apps;

        @pmi0("items")
        private final List<AppsRequestItemDto> items;

        @pmi0("profiles_ids")
        private final List<Long> profilesIds;

        @pmi0("type")
        private final AppsMiniappsCatalogItemPayloadNotificationsListTypeDto type;

        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadNotificationsListDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadNotificationsListDto createFromParcel(Parcel parcel) {
                AppsMiniappsCatalogItemPayloadNotificationsListTypeDto createFromParcel = AppsMiniappsCatalogItemPayloadNotificationsListTypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(AppsRequestItemDto.CREATOR, parcel, arrayList, i2, 1);
                }
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = k73.b(parcel, arrayList2, i3, 1);
                }
                int readInt3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = en.a(AppsMiniappsCatalogGameDto.CREATOR, parcel, arrayList3, i, 1);
                }
                return new AppsMiniappsCatalogItemPayloadNotificationsListDto(createFromParcel, arrayList, arrayList2, arrayList3);
            }

            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadNotificationsListDto[] newArray(int i) {
                return new AppsMiniappsCatalogItemPayloadNotificationsListDto[i];
            }
        }

        public AppsMiniappsCatalogItemPayloadNotificationsListDto(AppsMiniappsCatalogItemPayloadNotificationsListTypeDto appsMiniappsCatalogItemPayloadNotificationsListTypeDto, List<AppsRequestItemDto> list, List<Long> list2, List<AppsMiniappsCatalogGameDto> list3) {
            super(null);
            this.type = appsMiniappsCatalogItemPayloadNotificationsListTypeDto;
            this.items = list;
            this.profilesIds = list2;
            this.apps = list3;
        }

        public final List<AppsMiniappsCatalogGameDto> d() {
            return this.apps;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final List<AppsRequestItemDto> e() {
            return this.items;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsMiniappsCatalogItemPayloadNotificationsListDto)) {
                return false;
            }
            AppsMiniappsCatalogItemPayloadNotificationsListDto appsMiniappsCatalogItemPayloadNotificationsListDto = (AppsMiniappsCatalogItemPayloadNotificationsListDto) obj;
            return this.type == appsMiniappsCatalogItemPayloadNotificationsListDto.type && epx.f(this.items, appsMiniappsCatalogItemPayloadNotificationsListDto.items) && epx.f(this.profilesIds, appsMiniappsCatalogItemPayloadNotificationsListDto.profilesIds) && epx.f(this.apps, appsMiniappsCatalogItemPayloadNotificationsListDto.apps);
        }

        public final int hashCode() {
            return this.apps.hashCode() + fw3.a(fw3.a(this.type.hashCode() * 31, 31, this.items), 31, this.profilesIds);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadNotificationsListDto(type=");
            sb.append(this.type);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", profilesIds=");
            sb.append(this.profilesIds);
            sb.append(", apps=");
            return ms9.a(')', sb, this.apps);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                ((AppsRequestItemDto) a2.next()).writeToParcel(parcel, i);
            }
            Iterator a3 = ao.a(parcel, this.profilesIds);
            while (a3.hasNext()) {
                parcel.writeLong(((Number) a3.next()).longValue());
            }
            Iterator a4 = ao.a(parcel, this.apps);
            while (a4.hasNext()) {
                ((AppsMiniappsCatalogGameDto) a4.next()).writeToParcel(parcel, i);
            }
        }
    }

    /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsMiniappsCatalogItemPayloadPoweredByVkPlayLogoDto extends AppsMiniappsCatalogItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadPoweredByVkPlayLogoDto> CREATOR = new a();

        @pmi0("icon")
        private final BaseImageDto icon;

        @pmi0("title")
        private final String title;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("url")
        private final String url;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("powered_by_vk_play_logo")
            public static final TypeDto POWERED_BY_VK_PLAY_LOGO;
            private final String value;

            /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("POWERED_BY_VK_PLAY_LOGO", 0, "powered_by_vk_play_logo");
                POWERED_BY_VK_PLAY_LOGO = typeDto;
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

        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadPoweredByVkPlayLogoDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadPoweredByVkPlayLogoDto createFromParcel(Parcel parcel) {
                return new AppsMiniappsCatalogItemPayloadPoweredByVkPlayLogoDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), (BaseImageDto) parcel.readParcelable(AppsMiniappsCatalogItemPayloadPoweredByVkPlayLogoDto.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadPoweredByVkPlayLogoDto[] newArray(int i) {
                return new AppsMiniappsCatalogItemPayloadPoweredByVkPlayLogoDto[i];
            }
        }

        public /* synthetic */ AppsMiniappsCatalogItemPayloadPoweredByVkPlayLogoDto(TypeDto typeDto, String str, BaseImageDto baseImageDto, String str2, int i, zcl zclVar) {
            this(typeDto, str, (i & 4) != 0 ? null : baseImageDto, (i & 8) != 0 ? null : str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsMiniappsCatalogItemPayloadPoweredByVkPlayLogoDto)) {
                return false;
            }
            AppsMiniappsCatalogItemPayloadPoweredByVkPlayLogoDto appsMiniappsCatalogItemPayloadPoweredByVkPlayLogoDto = (AppsMiniappsCatalogItemPayloadPoweredByVkPlayLogoDto) obj;
            return this.type == appsMiniappsCatalogItemPayloadPoweredByVkPlayLogoDto.type && epx.f(this.title, appsMiniappsCatalogItemPayloadPoweredByVkPlayLogoDto.title) && epx.f(this.icon, appsMiniappsCatalogItemPayloadPoweredByVkPlayLogoDto.icon) && epx.f(this.url, appsMiniappsCatalogItemPayloadPoweredByVkPlayLogoDto.url);
        }

        public final int hashCode() {
            int a2 = urd0.a(this.type.hashCode() * 31, 31, this.title);
            BaseImageDto baseImageDto = this.icon;
            int hashCode = (a2 + (baseImageDto == null ? 0 : baseImageDto.hashCode())) * 31;
            String str = this.url;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadPoweredByVkPlayLogoDto(type=");
            sb.append(this.type);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", icon=");
            sb.append(this.icon);
            sb.append(", url=");
            return ho8.a(sb, this.url, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.title);
            parcel.writeParcelable(this.icon, i);
            parcel.writeString(this.url);
        }

        public AppsMiniappsCatalogItemPayloadPoweredByVkPlayLogoDto(TypeDto typeDto, String str, BaseImageDto baseImageDto, String str2) {
            super(null);
            this.type = typeDto;
            this.title = str;
            this.icon = baseImageDto;
            this.url = str2;
        }
    }

    /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
    /* loaded from: classes14.dex */
    public static final class AppsMiniappsCatalogItemPayloadSingleAppDto extends AppsMiniappsCatalogItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadSingleAppDto> CREATOR = new a();

        /* renamed from: app, reason: collision with root package name */
        @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
        private final AppsMiniappsCatalogAppDto f68app;

        @pmi0("type")
        private final AppsMiniappsCatalogItemPayloadSingleAppTypeDto type;

        /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadSingleAppDto> {
            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadSingleAppDto createFromParcel(Parcel parcel) {
                return new AppsMiniappsCatalogItemPayloadSingleAppDto(AppsMiniappsCatalogItemPayloadSingleAppTypeDto.CREATOR.createFromParcel(parcel), AppsMiniappsCatalogAppDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AppsMiniappsCatalogItemPayloadSingleAppDto[] newArray(int i) {
                return new AppsMiniappsCatalogItemPayloadSingleAppDto[i];
            }
        }

        public AppsMiniappsCatalogItemPayloadSingleAppDto(AppsMiniappsCatalogItemPayloadSingleAppTypeDto appsMiniappsCatalogItemPayloadSingleAppTypeDto, AppsMiniappsCatalogAppDto appsMiniappsCatalogAppDto) {
            super(null);
            this.type = appsMiniappsCatalogItemPayloadSingleAppTypeDto;
            this.f68app = appsMiniappsCatalogAppDto;
        }

        public final AppsMiniappsCatalogAppDto d() {
            return this.f68app;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppsMiniappsCatalogItemPayloadSingleAppDto)) {
                return false;
            }
            AppsMiniappsCatalogItemPayloadSingleAppDto appsMiniappsCatalogItemPayloadSingleAppDto = (AppsMiniappsCatalogItemPayloadSingleAppDto) obj;
            return this.type == appsMiniappsCatalogItemPayloadSingleAppDto.type && epx.f(this.f68app, appsMiniappsCatalogItemPayloadSingleAppDto.f68app);
        }

        public final int hashCode() {
            return this.f68app.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "AppsMiniappsCatalogItemPayloadSingleAppDto(type=" + this.type + ", app=" + this.f68app + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.f68app.writeToParcel(parcel, i);
        }
    }

    /* compiled from: AppsMiniappsCatalogItemPayloadDto.kt */
    public static final class Deserializer implements a9y<AppsMiniappsCatalogItemPayloadDto> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException
         */
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                switch (f.hashCode()) {
                    case -1892286837:
                        if (f.equals("games_half_horizontal_list")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadGamesHalfHorizontalListDto.class);
                        }
                        break;
                    case -1764961632:
                        if (f.equals("games_achievements_leaderboard")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardDto.class);
                        }
                        break;
                    case -1344578684:
                        if (f.equals("friends_playing")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadFriendsPlayingDto.class);
                        }
                        break;
                    case -1295810948:
                        if (f.equals("app_and_action")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadGamesListWithActionDto.class);
                        }
                        break;
                    case -1291189798:
                        if (f.equals("apps_rotating_carousel")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadAppsRotatingCarouselDto.class);
                        }
                        break;
                    case -1208845284:
                        if (f.equals("games_big_horizontal_list")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadGamesBigHorizontalListDto.class);
                        }
                        break;
                    case -1173392153:
                        if (f.equals("empty_horizontal_list")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadEmptyHorizontalListDto.class);
                        }
                        break;
                    case -1138503710:
                        if (f.equals("games_achievements")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadGamesAchievementsDto.class);
                        }
                        break;
                    case -1136848341:
                        if (f.equals("games_profile")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadGamesProfileDto.class);
                        }
                        break;
                    case -1025808235:
                        if (f.equals("games_half_cards")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadGamesHalfCardsDto.class);
                        }
                        break;
                    case -953581622:
                        if (f.equals("games_vertical_list_with_empty")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadGamesVerticalListWithEmptyDto.class);
                        }
                        break;
                    case -931682923:
                        if (f.equals("notifications_list")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadNotificationsListDto.class);
                        }
                        break;
                    case -427058768:
                        if (f.equals("activities_list")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadActivitiesListDto.class);
                        }
                        break;
                    case -418066493:
                        if (f.equals("apps_banners_list")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadAppsBannersListDto.class);
                        }
                        break;
                    case -338565281:
                        if (f.equals("app_cards_horizontal_list")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadCardsDto.class);
                        }
                        break;
                    case -270675956:
                        if (f.equals("apps_horizontal_list")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadAppsDto.class);
                        }
                        break;
                    case -15099487:
                        if (f.equals("games_single_row")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadGamesSingleRowDto.class);
                        }
                        break;
                    case 197957593:
                        if (f.equals("powered_by_vk_play_logo")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadPoweredByVkPlayLogoDto.class);
                        }
                        break;
                    case 308220224:
                        if (f.equals("apps_paginated")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadAppPaginatedDto.class);
                        }
                        break;
                    case 332655046:
                        if (f.equals("custom_collection_horizontal_list")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadGamesListWithFooterDto.class);
                        }
                        break;
                    case 362808889:
                        if (f.equals("community_apps_cards_grid")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadAppsDto.class);
                        }
                        break;
                    case 426686390:
                        if (f.equals("categories_horizontal_list")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadCategoriesHorizontalListDto.class);
                        }
                        break;
                    case 441482664:
                        if (f.equals("apps_horizontal_compact_list")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadAppsDto.class);
                        }
                        break;
                    case 475923253:
                        if (f.equals("apps_collections_list")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadGamesCollectionsListDto.class);
                        }
                        break;
                    case 489900604:
                        if (f.equals("achievement_banner")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadAchievementBannerDto.class);
                        }
                        break;
                    case 639941211:
                        if (f.equals("games_horizontal_list")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadGamesHorizontalListDto.class);
                        }
                        break;
                    case 642564781:
                        if (f.equals("apps_horizontal_cell_list")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadAppsDto.class);
                        }
                        break;
                    case 665136560:
                        if (f.equals("games_search_popular_suggestions")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadGamesSearchPopularSuggestionsDto.class);
                        }
                        break;
                    case 760111546:
                        if (f.equals("app_promo_banner")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadGameBannerDto.class);
                        }
                        break;
                    case 913951146:
                        if (f.equals("single_app")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadSingleAppDto.class);
                        }
                        break;
                    case 1000640317:
                        if (f.equals("game_card")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadCardDto.class);
                        }
                        break;
                    case 1167320686:
                        if (f.equals("app_card")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadCardDto.class);
                        }
                        break;
                    case 1214018191:
                        if (f.equals("apps_cards_grid")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadAppsDto.class);
                        }
                        break;
                    case 1522599408:
                        if (f.equals("games_achievements_block")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadGamesAchievementsBlockDto.class);
                        }
                        break;
                    case 1524104284:
                        if (f.equals("games_feed")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadGamesFeedDto.class);
                        }
                        break;
                    case 1533932403:
                        if (f.equals("apps_paired_horizontal_lists")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadAppsPairedHorizontalListsDto.class);
                        }
                        break;
                    case 1676572318:
                        if (f.equals("apps_cards_vertical_list")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadAppsDto.class);
                        }
                        break;
                    case 1723716673:
                        if (f.equals("games_achievements_page_info")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoDto.class);
                        }
                        break;
                    case 1729589988:
                        if (f.equals("categories_vertical_list")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadListDto.class);
                        }
                        break;
                    case 2060406022:
                        if (f.equals("games_tags_list")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadGamesTagsListDto.class);
                        }
                        break;
                    case 2118638281:
                        if (f.equals("games_vertical_list")) {
                            return (AppsMiniappsCatalogItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AppsMiniappsCatalogItemPayloadGamesVerticalListDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    public /* synthetic */ AppsMiniappsCatalogItemPayloadDto(zcl zclVar) {
        this();
    }

    private AppsMiniappsCatalogItemPayloadDto() {
    }
}
