package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsGetMVKCatalogSortDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetMVKCatalogSortDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetMVKCatalogSortDto[] $VALUES;

    @pmi0("create_date")
    public static final AppsGetMVKCatalogSortDto CREATE_DATE;
    public static final Parcelable.Creator<AppsGetMVKCatalogSortDto> CREATOR;

    @pmi0("growth_rate")
    public static final AppsGetMVKCatalogSortDto GROWTH_RATE;

    @pmi0("popular")
    public static final AppsGetMVKCatalogSortDto POPULAR;

    @pmi0("popular_today")
    public static final AppsGetMVKCatalogSortDto POPULAR_TODAY;

    @pmi0("popular_week")
    public static final AppsGetMVKCatalogSortDto POPULAR_WEEK;

    @pmi0("visitors")
    public static final AppsGetMVKCatalogSortDto VISITORS;
    private final String value;

    /* compiled from: AppsGetMVKCatalogSortDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetMVKCatalogSortDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetMVKCatalogSortDto createFromParcel(Parcel parcel) {
            return AppsGetMVKCatalogSortDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetMVKCatalogSortDto[] newArray(int i) {
            return new AppsGetMVKCatalogSortDto[i];
        }
    }

    static {
        AppsGetMVKCatalogSortDto appsGetMVKCatalogSortDto = new AppsGetMVKCatalogSortDto("CREATE_DATE", 0, "create_date");
        CREATE_DATE = appsGetMVKCatalogSortDto;
        AppsGetMVKCatalogSortDto appsGetMVKCatalogSortDto2 = new AppsGetMVKCatalogSortDto("GROWTH_RATE", 1, "growth_rate");
        GROWTH_RATE = appsGetMVKCatalogSortDto2;
        AppsGetMVKCatalogSortDto appsGetMVKCatalogSortDto3 = new AppsGetMVKCatalogSortDto("POPULAR", 2, "popular");
        POPULAR = appsGetMVKCatalogSortDto3;
        AppsGetMVKCatalogSortDto appsGetMVKCatalogSortDto4 = new AppsGetMVKCatalogSortDto("POPULAR_TODAY", 3, "popular_today");
        POPULAR_TODAY = appsGetMVKCatalogSortDto4;
        AppsGetMVKCatalogSortDto appsGetMVKCatalogSortDto5 = new AppsGetMVKCatalogSortDto("POPULAR_WEEK", 4, "popular_week");
        POPULAR_WEEK = appsGetMVKCatalogSortDto5;
        AppsGetMVKCatalogSortDto appsGetMVKCatalogSortDto6 = new AppsGetMVKCatalogSortDto("VISITORS", 5, "visitors");
        VISITORS = appsGetMVKCatalogSortDto6;
        AppsGetMVKCatalogSortDto[] appsGetMVKCatalogSortDtoArr = {appsGetMVKCatalogSortDto, appsGetMVKCatalogSortDto2, appsGetMVKCatalogSortDto3, appsGetMVKCatalogSortDto4, appsGetMVKCatalogSortDto5, appsGetMVKCatalogSortDto6};
        $VALUES = appsGetMVKCatalogSortDtoArr;
        $ENTRIES = new asp(appsGetMVKCatalogSortDtoArr);
        CREATOR = new a();
    }

    private AppsGetMVKCatalogSortDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetMVKCatalogSortDto valueOf(String str) {
        return (AppsGetMVKCatalogSortDto) Enum.valueOf(AppsGetMVKCatalogSortDto.class, str);
    }

    public static AppsGetMVKCatalogSortDto[] values() {
        return (AppsGetMVKCatalogSortDto[]) $VALUES.clone();
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
