package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.BuildConfig;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetClassifiedsSortFieldDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetClassifiedsSortFieldDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetClassifiedsSortFieldDto[] $VALUES;
    public static final Parcelable.Creator<CatalogGetClassifiedsSortFieldDto> CREATOR;

    @pmi0("date_created")
    public static final CatalogGetClassifiedsSortFieldDto DATE_CREATED;

    @pmi0("date_published")
    public static final CatalogGetClassifiedsSortFieldDto DATE_PUBLISHED;

    @pmi0(BuildConfig.FLAVOR)
    public static final CatalogGetClassifiedsSortFieldDto DEFAULT;

    @pmi0("distance")
    public static final CatalogGetClassifiedsSortFieldDto DISTANCE;

    @pmi0("price")
    public static final CatalogGetClassifiedsSortFieldDto PRICE;

    @pmi0("price_orig")
    public static final CatalogGetClassifiedsSortFieldDto PRICE_ORIG;
    private final String value;

    /* compiled from: CatalogGetClassifiedsSortFieldDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetClassifiedsSortFieldDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetClassifiedsSortFieldDto createFromParcel(Parcel parcel) {
            return CatalogGetClassifiedsSortFieldDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetClassifiedsSortFieldDto[] newArray(int i) {
            return new CatalogGetClassifiedsSortFieldDto[i];
        }
    }

    static {
        CatalogGetClassifiedsSortFieldDto catalogGetClassifiedsSortFieldDto = new CatalogGetClassifiedsSortFieldDto("DATE_CREATED", 0, "date_created");
        DATE_CREATED = catalogGetClassifiedsSortFieldDto;
        CatalogGetClassifiedsSortFieldDto catalogGetClassifiedsSortFieldDto2 = new CatalogGetClassifiedsSortFieldDto("DATE_PUBLISHED", 1, "date_published");
        DATE_PUBLISHED = catalogGetClassifiedsSortFieldDto2;
        CatalogGetClassifiedsSortFieldDto catalogGetClassifiedsSortFieldDto3 = new CatalogGetClassifiedsSortFieldDto("DEFAULT", 2, BuildConfig.FLAVOR);
        DEFAULT = catalogGetClassifiedsSortFieldDto3;
        CatalogGetClassifiedsSortFieldDto catalogGetClassifiedsSortFieldDto4 = new CatalogGetClassifiedsSortFieldDto("DISTANCE", 3, "distance");
        DISTANCE = catalogGetClassifiedsSortFieldDto4;
        CatalogGetClassifiedsSortFieldDto catalogGetClassifiedsSortFieldDto5 = new CatalogGetClassifiedsSortFieldDto("PRICE", 4, "price");
        PRICE = catalogGetClassifiedsSortFieldDto5;
        CatalogGetClassifiedsSortFieldDto catalogGetClassifiedsSortFieldDto6 = new CatalogGetClassifiedsSortFieldDto("PRICE_ORIG", 5, "price_orig");
        PRICE_ORIG = catalogGetClassifiedsSortFieldDto6;
        CatalogGetClassifiedsSortFieldDto[] catalogGetClassifiedsSortFieldDtoArr = {catalogGetClassifiedsSortFieldDto, catalogGetClassifiedsSortFieldDto2, catalogGetClassifiedsSortFieldDto3, catalogGetClassifiedsSortFieldDto4, catalogGetClassifiedsSortFieldDto5, catalogGetClassifiedsSortFieldDto6};
        $VALUES = catalogGetClassifiedsSortFieldDtoArr;
        $ENTRIES = new asp(catalogGetClassifiedsSortFieldDtoArr);
        CREATOR = new a();
    }

    private CatalogGetClassifiedsSortFieldDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogGetClassifiedsSortFieldDto valueOf(String str) {
        return (CatalogGetClassifiedsSortFieldDto) Enum.valueOf(CatalogGetClassifiedsSortFieldDto.class, str);
    }

    public static CatalogGetClassifiedsSortFieldDto[] values() {
        return (CatalogGetClassifiedsSortFieldDto[]) $VALUES.clone();
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
