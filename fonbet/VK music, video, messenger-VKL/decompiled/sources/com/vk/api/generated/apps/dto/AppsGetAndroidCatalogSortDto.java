package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsGetAndroidCatalogSortDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetAndroidCatalogSortDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetAndroidCatalogSortDto[] $VALUES;

    @pmi0("create_date")
    public static final AppsGetAndroidCatalogSortDto CREATE_DATE;
    public static final Parcelable.Creator<AppsGetAndroidCatalogSortDto> CREATOR;

    @pmi0("growth_rate")
    public static final AppsGetAndroidCatalogSortDto GROWTH_RATE;

    @pmi0("popular")
    public static final AppsGetAndroidCatalogSortDto POPULAR;

    @pmi0("popular_today")
    public static final AppsGetAndroidCatalogSortDto POPULAR_TODAY;

    @pmi0("popular_week")
    public static final AppsGetAndroidCatalogSortDto POPULAR_WEEK;

    @pmi0("visitors")
    public static final AppsGetAndroidCatalogSortDto VISITORS;
    private final String value;

    /* compiled from: AppsGetAndroidCatalogSortDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetAndroidCatalogSortDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetAndroidCatalogSortDto createFromParcel(Parcel parcel) {
            return AppsGetAndroidCatalogSortDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetAndroidCatalogSortDto[] newArray(int i) {
            return new AppsGetAndroidCatalogSortDto[i];
        }
    }

    static {
        AppsGetAndroidCatalogSortDto appsGetAndroidCatalogSortDto = new AppsGetAndroidCatalogSortDto("CREATE_DATE", 0, "create_date");
        CREATE_DATE = appsGetAndroidCatalogSortDto;
        AppsGetAndroidCatalogSortDto appsGetAndroidCatalogSortDto2 = new AppsGetAndroidCatalogSortDto("GROWTH_RATE", 1, "growth_rate");
        GROWTH_RATE = appsGetAndroidCatalogSortDto2;
        AppsGetAndroidCatalogSortDto appsGetAndroidCatalogSortDto3 = new AppsGetAndroidCatalogSortDto("POPULAR", 2, "popular");
        POPULAR = appsGetAndroidCatalogSortDto3;
        AppsGetAndroidCatalogSortDto appsGetAndroidCatalogSortDto4 = new AppsGetAndroidCatalogSortDto("POPULAR_TODAY", 3, "popular_today");
        POPULAR_TODAY = appsGetAndroidCatalogSortDto4;
        AppsGetAndroidCatalogSortDto appsGetAndroidCatalogSortDto5 = new AppsGetAndroidCatalogSortDto("POPULAR_WEEK", 4, "popular_week");
        POPULAR_WEEK = appsGetAndroidCatalogSortDto5;
        AppsGetAndroidCatalogSortDto appsGetAndroidCatalogSortDto6 = new AppsGetAndroidCatalogSortDto("VISITORS", 5, "visitors");
        VISITORS = appsGetAndroidCatalogSortDto6;
        AppsGetAndroidCatalogSortDto[] appsGetAndroidCatalogSortDtoArr = {appsGetAndroidCatalogSortDto, appsGetAndroidCatalogSortDto2, appsGetAndroidCatalogSortDto3, appsGetAndroidCatalogSortDto4, appsGetAndroidCatalogSortDto5, appsGetAndroidCatalogSortDto6};
        $VALUES = appsGetAndroidCatalogSortDtoArr;
        $ENTRIES = new asp(appsGetAndroidCatalogSortDtoArr);
        CREATOR = new a();
    }

    private AppsGetAndroidCatalogSortDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetAndroidCatalogSortDto valueOf(String str) {
        return (AppsGetAndroidCatalogSortDto) Enum.valueOf(AppsGetAndroidCatalogSortDto.class, str);
    }

    public static AppsGetAndroidCatalogSortDto[] values() {
        return (AppsGetAndroidCatalogSortDto[]) $VALUES.clone();
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
