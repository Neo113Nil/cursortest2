package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogLinkDto;
import com.vk.api.generated.youla.dto.YoulaCategoryDto;
import com.vk.dto.hints.HintCategories;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MarketNavigationTabDto.kt */
/* loaded from: classes15.dex */
public final class MarketNavigationTabDto implements Parcelable {
    public static final Parcelable.Creator<MarketNavigationTabDto> CREATOR = new a();

    @pmi0(HintCategories.PARAM_NAME)
    private final List<MarketMarketCategoryDto> categories;

    @pmi0("categories_tree")
    private final List<MarketMarketCategoryTreeDto> categoriesTree;

    @pmi0("category_id")
    private final Integer categoryId;

    @pmi0("category_section_icons")
    private final List<CatalogCatalogLinkDto> categorySectionIcons;

    @pmi0("category_tree_id")
    private final Integer categoryTreeId;

    @pmi0("filter")
    private final MarketCatalogFilterDto filter;

    @pmi0("icons")
    private final List<BaseImageDto> icons;

    @pmi0("id")
    private final String id;

    @pmi0("is_featured")
    private final Boolean isFeatured;

    @pmi0("root_category_id")
    private final Integer rootCategoryId;

    @pmi0("sorting")
    private final MarketCatalogSortingDto sorting;

    @pmi0("target_section_id")
    private final String targetSectionId;

    @pmi0("target_url")
    private final String targetUrl;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("youla_categories")
    private final List<YoulaCategoryDto> youlaCategories;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketNavigationTabDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0(HintCategories.PARAM_NAME)
        public static final TypeDto CATEGORIES;

        @pmi0("classifieds_category_tree")
        public static final TypeDto CLASSIFIEDS_CATEGORY_TREE;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("filters")
        public static final TypeDto FILTERS;

        @pmi0("section")
        public static final TypeDto SECTION;

        @pmi0("sorting")
        public static final TypeDto SORTING;

        @pmi0("url")
        public static final TypeDto URL;

        @pmi0("youla_categories")
        public static final TypeDto YOULA_CATEGORIES;
        private final String value;

        /* compiled from: MarketNavigationTabDto.kt */
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
            TypeDto typeDto = new TypeDto("URL", 0, "url");
            URL = typeDto;
            TypeDto typeDto2 = new TypeDto("SECTION", 1, "section");
            SECTION = typeDto2;
            TypeDto typeDto3 = new TypeDto("CATEGORIES", 2, HintCategories.PARAM_NAME);
            CATEGORIES = typeDto3;
            TypeDto typeDto4 = new TypeDto("FILTERS", 3, "filters");
            FILTERS = typeDto4;
            TypeDto typeDto5 = new TypeDto("SORTING", 4, "sorting");
            SORTING = typeDto5;
            TypeDto typeDto6 = new TypeDto("YOULA_CATEGORIES", 5, "youla_categories");
            YOULA_CATEGORIES = typeDto6;
            TypeDto typeDto7 = new TypeDto("CLASSIFIEDS_CATEGORY_TREE", 6, "classifieds_category_tree");
            CLASSIFIEDS_CATEGORY_TREE = typeDto7;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6, typeDto7};
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

    /* compiled from: MarketNavigationTabDto.kt */
    public static final class a implements Parcelable.Creator<MarketNavigationTabDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketNavigationTabDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean valueOf;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            String str;
            ArrayList arrayList5;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(MarketNavigationTabDto.class, parcel, arrayList6, i, 1);
                }
                arrayList = arrayList6;
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = bo.b(MarketNavigationTabDto.class, parcel, arrayList2, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = en.a(YoulaCategoryDto.CREATOR, parcel, arrayList3, i3, 1);
                }
            }
            MarketCatalogFilterDto createFromParcel2 = parcel.readInt() == 0 ? null : MarketCatalogFilterDto.CREATOR.createFromParcel(parcel);
            MarketCatalogSortingDto createFromParcel3 = parcel.readInt() == 0 ? null : MarketCatalogSortingDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList4 = new ArrayList(readInt4);
                int i4 = 0;
                while (true) {
                    str = readString;
                    if (i4 == readInt4) {
                        break;
                    }
                    i4 = en.a(MarketMarketCategoryTreeDto.CREATOR, parcel, arrayList4, i4, 1);
                    readString = str;
                }
            } else {
                arrayList4 = null;
                str = readString;
            }
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList5 = new ArrayList(readInt5);
                int i5 = 0;
                while (i5 != readInt5) {
                    i5 = en.a(CatalogCatalogLinkDto.CREATOR, parcel, arrayList5, i5, 1);
                    readInt5 = readInt5;
                }
            }
            return new MarketNavigationTabDto(str, readString2, createFromParcel, readString3, readString4, arrayList, valueOf, arrayList2, arrayList3, createFromParcel2, createFromParcel3, arrayList4, arrayList5, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketNavigationTabDto[] newArray(int i) {
            return new MarketNavigationTabDto[i];
        }
    }

    public MarketNavigationTabDto(String str, String str2, TypeDto typeDto, String str3, String str4, List<BaseImageDto> list, Boolean bool, List<MarketMarketCategoryDto> list2, List<YoulaCategoryDto> list3, MarketCatalogFilterDto marketCatalogFilterDto, MarketCatalogSortingDto marketCatalogSortingDto, List<MarketMarketCategoryTreeDto> list4, List<CatalogCatalogLinkDto> list5, Integer num, Integer num2, Integer num3) {
        this.id = str;
        this.title = str2;
        this.type = typeDto;
        this.targetUrl = str3;
        this.targetSectionId = str4;
        this.icons = list;
        this.isFeatured = bool;
        this.categories = list2;
        this.youlaCategories = list3;
        this.filter = marketCatalogFilterDto;
        this.sorting = marketCatalogSortingDto;
        this.categoriesTree = list4;
        this.categorySectionIcons = list5;
        this.rootCategoryId = num;
        this.categoryTreeId = num2;
        this.categoryId = num3;
    }

    public final Integer d() {
        return this.categoryTreeId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final MarketCatalogFilterDto e() {
        return this.filter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketNavigationTabDto)) {
            return false;
        }
        MarketNavigationTabDto marketNavigationTabDto = (MarketNavigationTabDto) obj;
        return epx.f(this.id, marketNavigationTabDto.id) && epx.f(this.title, marketNavigationTabDto.title) && this.type == marketNavigationTabDto.type && epx.f(this.targetUrl, marketNavigationTabDto.targetUrl) && epx.f(this.targetSectionId, marketNavigationTabDto.targetSectionId) && epx.f(this.icons, marketNavigationTabDto.icons) && epx.f(this.isFeatured, marketNavigationTabDto.isFeatured) && epx.f(this.categories, marketNavigationTabDto.categories) && epx.f(this.youlaCategories, marketNavigationTabDto.youlaCategories) && epx.f(this.filter, marketNavigationTabDto.filter) && epx.f(this.sorting, marketNavigationTabDto.sorting) && epx.f(this.categoriesTree, marketNavigationTabDto.categoriesTree) && epx.f(this.categorySectionIcons, marketNavigationTabDto.categorySectionIcons) && epx.f(this.rootCategoryId, marketNavigationTabDto.rootCategoryId) && epx.f(this.categoryTreeId, marketNavigationTabDto.categoryTreeId) && epx.f(this.categoryId, marketNavigationTabDto.categoryId);
    }

    public final List<BaseImageDto> f() {
        return this.icons;
    }

    public final Integer g() {
        return this.rootCategoryId;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() + urd0.a(this.id.hashCode() * 31, 31, this.title)) * 31;
        String str = this.targetUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.targetSectionId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<BaseImageDto> list = this.icons;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isFeatured;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<MarketMarketCategoryDto> list2 = this.categories;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<YoulaCategoryDto> list3 = this.youlaCategories;
        int hashCode7 = (hashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        MarketCatalogFilterDto marketCatalogFilterDto = this.filter;
        int hashCode8 = (hashCode7 + (marketCatalogFilterDto == null ? 0 : marketCatalogFilterDto.hashCode())) * 31;
        MarketCatalogSortingDto marketCatalogSortingDto = this.sorting;
        int hashCode9 = (hashCode8 + (marketCatalogSortingDto == null ? 0 : marketCatalogSortingDto.hashCode())) * 31;
        List<MarketMarketCategoryTreeDto> list4 = this.categoriesTree;
        int hashCode10 = (hashCode9 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<CatalogCatalogLinkDto> list5 = this.categorySectionIcons;
        int hashCode11 = (hashCode10 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Integer num = this.rootCategoryId;
        int hashCode12 = (hashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.categoryTreeId;
        int hashCode13 = (hashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.categoryId;
        return hashCode13 + (num3 != null ? num3.hashCode() : 0);
    }

    public final MarketCatalogSortingDto i() {
        return this.sorting;
    }

    public final String j() {
        return this.targetSectionId;
    }

    public final String k() {
        return this.targetUrl;
    }

    public final TypeDto l() {
        return this.type;
    }

    public final Boolean n() {
        return this.isFeatured;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketNavigationTabDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", targetUrl=");
        sb.append(this.targetUrl);
        sb.append(", targetSectionId=");
        sb.append(this.targetSectionId);
        sb.append(", icons=");
        sb.append(this.icons);
        sb.append(", isFeatured=");
        sb.append(this.isFeatured);
        sb.append(", categories=");
        sb.append(this.categories);
        sb.append(", youlaCategories=");
        sb.append(this.youlaCategories);
        sb.append(", filter=");
        sb.append(this.filter);
        sb.append(", sorting=");
        sb.append(this.sorting);
        sb.append(", categoriesTree=");
        sb.append(this.categoriesTree);
        sb.append(", categorySectionIcons=");
        sb.append(this.categorySectionIcons);
        sb.append(", rootCategoryId=");
        sb.append(this.rootCategoryId);
        sb.append(", categoryTreeId=");
        sb.append(this.categoryTreeId);
        sb.append(", categoryId=");
        return uqi.b(sb, this.categoryId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.targetUrl);
        parcel.writeString(this.targetSectionId);
        List<BaseImageDto> list = this.icons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        Boolean bool = this.isFeatured;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        List<MarketMarketCategoryDto> list2 = this.categories;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        List<YoulaCategoryDto> list3 = this.youlaCategories;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((YoulaCategoryDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        MarketCatalogFilterDto marketCatalogFilterDto = this.filter;
        if (marketCatalogFilterDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketCatalogFilterDto.writeToParcel(parcel, i);
        }
        MarketCatalogSortingDto marketCatalogSortingDto = this.sorting;
        if (marketCatalogSortingDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketCatalogSortingDto.writeToParcel(parcel, i);
        }
        List<MarketMarketCategoryTreeDto> list4 = this.categoriesTree;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                ((MarketMarketCategoryTreeDto) f4.next()).writeToParcel(parcel, i);
            }
        }
        List<CatalogCatalogLinkDto> list5 = this.categorySectionIcons;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list5, 1);
            while (f5.hasNext()) {
                ((CatalogCatalogLinkDto) f5.next()).writeToParcel(parcel, i);
            }
        }
        Integer num = this.rootCategoryId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.categoryTreeId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.categoryId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
    }

    public /* synthetic */ MarketNavigationTabDto(String str, String str2, TypeDto typeDto, String str3, String str4, List list, Boolean bool, List list2, List list3, MarketCatalogFilterDto marketCatalogFilterDto, MarketCatalogSortingDto marketCatalogSortingDto, List list4, List list5, Integer num, Integer num2, Integer num3, int i, zcl zclVar) {
        this(str, str2, typeDto, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : list2, (i & 256) != 0 ? null : list3, (i & 512) != 0 ? null : marketCatalogFilterDto, (i & 1024) != 0 ? null : marketCatalogSortingDto, (i & 2048) != 0 ? null : list4, (i & 4096) != 0 ? null : list5, (i & 8192) != 0 ? null : num, (i & 16384) != 0 ? null : num2, (i & 32768) != 0 ? null : num3);
    }
}
