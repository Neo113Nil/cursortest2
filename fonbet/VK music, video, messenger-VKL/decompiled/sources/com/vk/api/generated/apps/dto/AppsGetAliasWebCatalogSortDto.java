package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsGetAliasWebCatalogSortDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetAliasWebCatalogSortDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetAliasWebCatalogSortDto[] $VALUES;

    @pmi0("create_date")
    public static final AppsGetAliasWebCatalogSortDto CREATE_DATE;
    public static final Parcelable.Creator<AppsGetAliasWebCatalogSortDto> CREATOR;

    @pmi0("growth_rate")
    public static final AppsGetAliasWebCatalogSortDto GROWTH_RATE;

    @pmi0("popular")
    public static final AppsGetAliasWebCatalogSortDto POPULAR;

    @pmi0("popular_today")
    public static final AppsGetAliasWebCatalogSortDto POPULAR_TODAY;

    @pmi0("popular_week")
    public static final AppsGetAliasWebCatalogSortDto POPULAR_WEEK;

    @pmi0("visitors")
    public static final AppsGetAliasWebCatalogSortDto VISITORS;
    private final String value;

    /* compiled from: AppsGetAliasWebCatalogSortDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetAliasWebCatalogSortDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetAliasWebCatalogSortDto createFromParcel(Parcel parcel) {
            return AppsGetAliasWebCatalogSortDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetAliasWebCatalogSortDto[] newArray(int i) {
            return new AppsGetAliasWebCatalogSortDto[i];
        }
    }

    static {
        AppsGetAliasWebCatalogSortDto appsGetAliasWebCatalogSortDto = new AppsGetAliasWebCatalogSortDto("CREATE_DATE", 0, "create_date");
        CREATE_DATE = appsGetAliasWebCatalogSortDto;
        AppsGetAliasWebCatalogSortDto appsGetAliasWebCatalogSortDto2 = new AppsGetAliasWebCatalogSortDto("GROWTH_RATE", 1, "growth_rate");
        GROWTH_RATE = appsGetAliasWebCatalogSortDto2;
        AppsGetAliasWebCatalogSortDto appsGetAliasWebCatalogSortDto3 = new AppsGetAliasWebCatalogSortDto("POPULAR", 2, "popular");
        POPULAR = appsGetAliasWebCatalogSortDto3;
        AppsGetAliasWebCatalogSortDto appsGetAliasWebCatalogSortDto4 = new AppsGetAliasWebCatalogSortDto("POPULAR_TODAY", 3, "popular_today");
        POPULAR_TODAY = appsGetAliasWebCatalogSortDto4;
        AppsGetAliasWebCatalogSortDto appsGetAliasWebCatalogSortDto5 = new AppsGetAliasWebCatalogSortDto("POPULAR_WEEK", 4, "popular_week");
        POPULAR_WEEK = appsGetAliasWebCatalogSortDto5;
        AppsGetAliasWebCatalogSortDto appsGetAliasWebCatalogSortDto6 = new AppsGetAliasWebCatalogSortDto("VISITORS", 5, "visitors");
        VISITORS = appsGetAliasWebCatalogSortDto6;
        AppsGetAliasWebCatalogSortDto[] appsGetAliasWebCatalogSortDtoArr = {appsGetAliasWebCatalogSortDto, appsGetAliasWebCatalogSortDto2, appsGetAliasWebCatalogSortDto3, appsGetAliasWebCatalogSortDto4, appsGetAliasWebCatalogSortDto5, appsGetAliasWebCatalogSortDto6};
        $VALUES = appsGetAliasWebCatalogSortDtoArr;
        $ENTRIES = new asp(appsGetAliasWebCatalogSortDtoArr);
        CREATOR = new a();
    }

    private AppsGetAliasWebCatalogSortDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetAliasWebCatalogSortDto valueOf(String str) {
        return (AppsGetAliasWebCatalogSortDto) Enum.valueOf(AppsGetAliasWebCatalogSortDto.class, str);
    }

    public static AppsGetAliasWebCatalogSortDto[] values() {
        return (AppsGetAliasWebCatalogSortDto[]) $VALUES.clone();
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
