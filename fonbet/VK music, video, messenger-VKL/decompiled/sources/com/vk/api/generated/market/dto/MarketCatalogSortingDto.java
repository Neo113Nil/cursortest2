package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.BuildConfig;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MarketCatalogSortingDto.kt */
/* loaded from: classes15.dex */
public final class MarketCatalogSortingDto implements Parcelable {
    public static final Parcelable.Creator<MarketCatalogSortingDto> CREATOR = new a();

    @pmi0(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION)
    private final DirectionDto direction;

    @pmi0("field")
    private final FieldDto field;

    @pmi0("icons")
    private final List<BaseImageDto> icons;

    @pmi0("sort_by")
    private final SortByDto sortBy;

    @pmi0("sort_direction")
    private final SortDirectionDto sortDirection;

    @pmi0("sort_option_id")
    private final String sortOptionId;

    @pmi0("sort_options")
    private final List<MarketMarketSortOptionDto> sortOptions;

    @pmi0("sorting_option_id")
    private final MarketMarketSortingOptionIdDto sortingOptionId;

    @pmi0("sorting_options")
    private final List<MarketMarketSortingOptionDto> sortingOptions;

    @pmi0("title")
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketCatalogSortingDto.kt */
    public static final class DirectionDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DirectionDto[] $VALUES;

        @pmi0("asc")
        public static final DirectionDto ASC;
        public static final Parcelable.Creator<DirectionDto> CREATOR;

        @pmi0(CampaignEx.JSON_KEY_DESC)
        public static final DirectionDto DESC;
        private final String value;

        /* compiled from: MarketCatalogSortingDto.kt */
        public static final class a implements Parcelable.Creator<DirectionDto> {
            @Override // android.os.Parcelable.Creator
            public final DirectionDto createFromParcel(Parcel parcel) {
                return DirectionDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final DirectionDto[] newArray(int i) {
                return new DirectionDto[i];
            }
        }

        static {
            DirectionDto directionDto = new DirectionDto("ASC", 0, "asc");
            ASC = directionDto;
            DirectionDto directionDto2 = new DirectionDto("DESC", 1, CampaignEx.JSON_KEY_DESC);
            DESC = directionDto2;
            DirectionDto[] directionDtoArr = {directionDto, directionDto2};
            $VALUES = directionDtoArr;
            $ENTRIES = new asp(directionDtoArr);
            CREATOR = new a();
        }

        private DirectionDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static DirectionDto valueOf(String str) {
            return (DirectionDto) Enum.valueOf(DirectionDto.class, str);
        }

        public static DirectionDto[] values() {
            return (DirectionDto[]) $VALUES.clone();
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
    /* compiled from: MarketCatalogSortingDto.kt */
    public static final class FieldDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FieldDto[] $VALUES;
        public static final Parcelable.Creator<FieldDto> CREATOR;

        @pmi0("date_created")
        public static final FieldDto DATE_CREATED;

        @pmi0("date_published")
        public static final FieldDto DATE_PUBLISHED;

        @pmi0(BuildConfig.FLAVOR)
        public static final FieldDto DEFAULT;

        @pmi0("distance")
        public static final FieldDto DISTANCE;

        @pmi0("price")
        public static final FieldDto PRICE;

        @pmi0("price_orig")
        public static final FieldDto PRICE_ORIG;
        private final String value;

        /* compiled from: MarketCatalogSortingDto.kt */
        public static final class a implements Parcelable.Creator<FieldDto> {
            @Override // android.os.Parcelable.Creator
            public final FieldDto createFromParcel(Parcel parcel) {
                return FieldDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final FieldDto[] newArray(int i) {
                return new FieldDto[i];
            }
        }

        static {
            FieldDto fieldDto = new FieldDto("DATE_CREATED", 0, "date_created");
            DATE_CREATED = fieldDto;
            FieldDto fieldDto2 = new FieldDto("DATE_PUBLISHED", 1, "date_published");
            DATE_PUBLISHED = fieldDto2;
            FieldDto fieldDto3 = new FieldDto("DEFAULT", 2, BuildConfig.FLAVOR);
            DEFAULT = fieldDto3;
            FieldDto fieldDto4 = new FieldDto("DISTANCE", 3, "distance");
            DISTANCE = fieldDto4;
            FieldDto fieldDto5 = new FieldDto("PRICE", 4, "price");
            PRICE = fieldDto5;
            FieldDto fieldDto6 = new FieldDto("PRICE_ORIG", 5, "price_orig");
            PRICE_ORIG = fieldDto6;
            FieldDto[] fieldDtoArr = {fieldDto, fieldDto2, fieldDto3, fieldDto4, fieldDto5, fieldDto6};
            $VALUES = fieldDtoArr;
            $ENTRIES = new asp(fieldDtoArr);
            CREATOR = new a();
        }

        private FieldDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static FieldDto valueOf(String str) {
            return (FieldDto) Enum.valueOf(FieldDto.class, str);
        }

        public static FieldDto[] values() {
            return (FieldDto[]) $VALUES.clone();
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
    /* compiled from: MarketCatalogSortingDto.kt */
    public static final class SortByDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SortByDto[] $VALUES;
        public static final Parcelable.Creator<SortByDto> CREATOR;

        @pmi0("1")
        public static final SortByDto DATE;

        @pmi0("2")
        public static final SortByDto PRICE;

        @pmi0("3")
        public static final SortByDto RELEVANCE;
        private final int value;

        /* compiled from: MarketCatalogSortingDto.kt */
        public static final class a implements Parcelable.Creator<SortByDto> {
            @Override // android.os.Parcelable.Creator
            public final SortByDto createFromParcel(Parcel parcel) {
                return SortByDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SortByDto[] newArray(int i) {
                return new SortByDto[i];
            }
        }

        static {
            SortByDto sortByDto = new SortByDto("DATE", 0, 1);
            DATE = sortByDto;
            SortByDto sortByDto2 = new SortByDto("PRICE", 1, 2);
            PRICE = sortByDto2;
            SortByDto sortByDto3 = new SortByDto("RELEVANCE", 2, 3);
            RELEVANCE = sortByDto3;
            SortByDto[] sortByDtoArr = {sortByDto, sortByDto2, sortByDto3};
            $VALUES = sortByDtoArr;
            $ENTRIES = new asp(sortByDtoArr);
            CREATOR = new a();
        }

        private SortByDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static SortByDto valueOf(String str) {
            return (SortByDto) Enum.valueOf(SortByDto.class, str);
        }

        public static SortByDto[] values() {
            return (SortByDto[]) $VALUES.clone();
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
    /* compiled from: MarketCatalogSortingDto.kt */
    public static final class SortDirectionDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SortDirectionDto[] $VALUES;

        @pmi0("0")
        public static final SortDirectionDto ASC;
        public static final Parcelable.Creator<SortDirectionDto> CREATOR;

        @pmi0("1")
        public static final SortDirectionDto DESC;
        private final int value;

        /* compiled from: MarketCatalogSortingDto.kt */
        public static final class a implements Parcelable.Creator<SortDirectionDto> {
            @Override // android.os.Parcelable.Creator
            public final SortDirectionDto createFromParcel(Parcel parcel) {
                return SortDirectionDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SortDirectionDto[] newArray(int i) {
                return new SortDirectionDto[i];
            }
        }

        static {
            SortDirectionDto sortDirectionDto = new SortDirectionDto("ASC", 0, 0);
            ASC = sortDirectionDto;
            SortDirectionDto sortDirectionDto2 = new SortDirectionDto("DESC", 1, 1);
            DESC = sortDirectionDto2;
            SortDirectionDto[] sortDirectionDtoArr = {sortDirectionDto, sortDirectionDto2};
            $VALUES = sortDirectionDtoArr;
            $ENTRIES = new asp(sortDirectionDtoArr);
            CREATOR = new a();
        }

        private SortDirectionDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static SortDirectionDto valueOf(String str) {
            return (SortDirectionDto) Enum.valueOf(SortDirectionDto.class, str);
        }

        public static SortDirectionDto[] values() {
            return (SortDirectionDto[]) $VALUES.clone();
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

    /* compiled from: MarketCatalogSortingDto.kt */
    public static final class a implements Parcelable.Creator<MarketCatalogSortingDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCatalogSortingDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            String readString = parcel.readString();
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(MarketCatalogSortingDto.class, parcel, arrayList, i2, 1);
                }
            }
            FieldDto createFromParcel = parcel.readInt() == 0 ? null : FieldDto.CREATOR.createFromParcel(parcel);
            DirectionDto createFromParcel2 = parcel.readInt() == 0 ? null : DirectionDto.CREATOR.createFromParcel(parcel);
            SortByDto createFromParcel3 = parcel.readInt() == 0 ? null : SortByDto.CREATOR.createFromParcel(parcel);
            SortDirectionDto createFromParcel4 = parcel.readInt() == 0 ? null : SortDirectionDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList3 = null;
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = en.a(MarketMarketSortOptionDto.CREATOR, parcel, arrayList2, i3, 1);
                }
                arrayList3 = null;
            }
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList4 = arrayList3;
            } else {
                int readInt3 = parcel.readInt();
                arrayList4 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = en.a(MarketMarketSortingOptionDto.CREATOR, parcel, arrayList4, i, 1);
                }
            }
            return new MarketCatalogSortingDto(readString, arrayList, createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, arrayList2, readString2, arrayList4, (MarketMarketSortingOptionIdDto) (parcel.readInt() == 0 ? arrayList3 : MarketMarketSortingOptionIdDto.CREATOR.createFromParcel(parcel)));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCatalogSortingDto[] newArray(int i) {
            return new MarketCatalogSortingDto[i];
        }
    }

    public MarketCatalogSortingDto() {
        this(null, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
    }

    public final MarketMarketSortingOptionIdDto d() {
        return this.sortingOptionId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<MarketMarketSortingOptionDto> e() {
        return this.sortingOptions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCatalogSortingDto)) {
            return false;
        }
        MarketCatalogSortingDto marketCatalogSortingDto = (MarketCatalogSortingDto) obj;
        return epx.f(this.title, marketCatalogSortingDto.title) && epx.f(this.icons, marketCatalogSortingDto.icons) && this.field == marketCatalogSortingDto.field && this.direction == marketCatalogSortingDto.direction && this.sortBy == marketCatalogSortingDto.sortBy && this.sortDirection == marketCatalogSortingDto.sortDirection && epx.f(this.sortOptions, marketCatalogSortingDto.sortOptions) && epx.f(this.sortOptionId, marketCatalogSortingDto.sortOptionId) && epx.f(this.sortingOptions, marketCatalogSortingDto.sortingOptions) && this.sortingOptionId == marketCatalogSortingDto.sortingOptionId;
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<BaseImageDto> list = this.icons;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        FieldDto fieldDto = this.field;
        int hashCode3 = (hashCode2 + (fieldDto == null ? 0 : fieldDto.hashCode())) * 31;
        DirectionDto directionDto = this.direction;
        int hashCode4 = (hashCode3 + (directionDto == null ? 0 : directionDto.hashCode())) * 31;
        SortByDto sortByDto = this.sortBy;
        int hashCode5 = (hashCode4 + (sortByDto == null ? 0 : sortByDto.hashCode())) * 31;
        SortDirectionDto sortDirectionDto = this.sortDirection;
        int hashCode6 = (hashCode5 + (sortDirectionDto == null ? 0 : sortDirectionDto.hashCode())) * 31;
        List<MarketMarketSortOptionDto> list2 = this.sortOptions;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.sortOptionId;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<MarketMarketSortingOptionDto> list3 = this.sortingOptions;
        int hashCode9 = (hashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        MarketMarketSortingOptionIdDto marketMarketSortingOptionIdDto = this.sortingOptionId;
        return hashCode9 + (marketMarketSortingOptionIdDto != null ? marketMarketSortingOptionIdDto.hashCode() : 0);
    }

    public final String toString() {
        return "MarketCatalogSortingDto(title=" + this.title + ", icons=" + this.icons + ", field=" + this.field + ", direction=" + this.direction + ", sortBy=" + this.sortBy + ", sortDirection=" + this.sortDirection + ", sortOptions=" + this.sortOptions + ", sortOptionId=" + this.sortOptionId + ", sortingOptions=" + this.sortingOptions + ", sortingOptionId=" + this.sortingOptionId + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        List<BaseImageDto> list = this.icons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        FieldDto fieldDto = this.field;
        if (fieldDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fieldDto.writeToParcel(parcel, i);
        }
        DirectionDto directionDto = this.direction;
        if (directionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            directionDto.writeToParcel(parcel, i);
        }
        SortByDto sortByDto = this.sortBy;
        if (sortByDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sortByDto.writeToParcel(parcel, i);
        }
        SortDirectionDto sortDirectionDto = this.sortDirection;
        if (sortDirectionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sortDirectionDto.writeToParcel(parcel, i);
        }
        List<MarketMarketSortOptionDto> list2 = this.sortOptions;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((MarketMarketSortOptionDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.sortOptionId);
        List<MarketMarketSortingOptionDto> list3 = this.sortingOptions;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((MarketMarketSortingOptionDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        MarketMarketSortingOptionIdDto marketMarketSortingOptionIdDto = this.sortingOptionId;
        if (marketMarketSortingOptionIdDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketMarketSortingOptionIdDto.writeToParcel(parcel, i);
        }
    }

    public MarketCatalogSortingDto(String str, List<BaseImageDto> list, FieldDto fieldDto, DirectionDto directionDto, SortByDto sortByDto, SortDirectionDto sortDirectionDto, List<MarketMarketSortOptionDto> list2, String str2, List<MarketMarketSortingOptionDto> list3, MarketMarketSortingOptionIdDto marketMarketSortingOptionIdDto) {
        this.title = str;
        this.icons = list;
        this.field = fieldDto;
        this.direction = directionDto;
        this.sortBy = sortByDto;
        this.sortDirection = sortDirectionDto;
        this.sortOptions = list2;
        this.sortOptionId = str2;
        this.sortingOptions = list3;
        this.sortingOptionId = marketMarketSortingOptionIdDto;
    }

    public /* synthetic */ MarketCatalogSortingDto(String str, List list, FieldDto fieldDto, DirectionDto directionDto, SortByDto sortByDto, SortDirectionDto sortDirectionDto, List list2, String str2, List list3, MarketMarketSortingOptionIdDto marketMarketSortingOptionIdDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : fieldDto, (i & 8) != 0 ? null : directionDto, (i & 16) != 0 ? null : sortByDto, (i & 32) != 0 ? null : sortDirectionDto, (i & 64) != 0 ? null : list2, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? null : list3, (i & 512) != 0 ? null : marketMarketSortingOptionIdDto);
    }
}
