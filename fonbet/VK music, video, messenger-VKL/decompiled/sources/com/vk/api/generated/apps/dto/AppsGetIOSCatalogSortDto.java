package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsGetIOSCatalogSortDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetIOSCatalogSortDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetIOSCatalogSortDto[] $VALUES;

    @pmi0("create_date")
    public static final AppsGetIOSCatalogSortDto CREATE_DATE;
    public static final Parcelable.Creator<AppsGetIOSCatalogSortDto> CREATOR;

    @pmi0("growth_rate")
    public static final AppsGetIOSCatalogSortDto GROWTH_RATE;

    @pmi0("popular")
    public static final AppsGetIOSCatalogSortDto POPULAR;

    @pmi0("popular_today")
    public static final AppsGetIOSCatalogSortDto POPULAR_TODAY;

    @pmi0("popular_week")
    public static final AppsGetIOSCatalogSortDto POPULAR_WEEK;

    @pmi0("visitors")
    public static final AppsGetIOSCatalogSortDto VISITORS;
    private final String value;

    /* compiled from: AppsGetIOSCatalogSortDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetIOSCatalogSortDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetIOSCatalogSortDto createFromParcel(Parcel parcel) {
            return AppsGetIOSCatalogSortDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetIOSCatalogSortDto[] newArray(int i) {
            return new AppsGetIOSCatalogSortDto[i];
        }
    }

    static {
        AppsGetIOSCatalogSortDto appsGetIOSCatalogSortDto = new AppsGetIOSCatalogSortDto("CREATE_DATE", 0, "create_date");
        CREATE_DATE = appsGetIOSCatalogSortDto;
        AppsGetIOSCatalogSortDto appsGetIOSCatalogSortDto2 = new AppsGetIOSCatalogSortDto("GROWTH_RATE", 1, "growth_rate");
        GROWTH_RATE = appsGetIOSCatalogSortDto2;
        AppsGetIOSCatalogSortDto appsGetIOSCatalogSortDto3 = new AppsGetIOSCatalogSortDto("POPULAR", 2, "popular");
        POPULAR = appsGetIOSCatalogSortDto3;
        AppsGetIOSCatalogSortDto appsGetIOSCatalogSortDto4 = new AppsGetIOSCatalogSortDto("POPULAR_TODAY", 3, "popular_today");
        POPULAR_TODAY = appsGetIOSCatalogSortDto4;
        AppsGetIOSCatalogSortDto appsGetIOSCatalogSortDto5 = new AppsGetIOSCatalogSortDto("POPULAR_WEEK", 4, "popular_week");
        POPULAR_WEEK = appsGetIOSCatalogSortDto5;
        AppsGetIOSCatalogSortDto appsGetIOSCatalogSortDto6 = new AppsGetIOSCatalogSortDto("VISITORS", 5, "visitors");
        VISITORS = appsGetIOSCatalogSortDto6;
        AppsGetIOSCatalogSortDto[] appsGetIOSCatalogSortDtoArr = {appsGetIOSCatalogSortDto, appsGetIOSCatalogSortDto2, appsGetIOSCatalogSortDto3, appsGetIOSCatalogSortDto4, appsGetIOSCatalogSortDto5, appsGetIOSCatalogSortDto6};
        $VALUES = appsGetIOSCatalogSortDtoArr;
        $ENTRIES = new asp(appsGetIOSCatalogSortDtoArr);
        CREATOR = new a();
    }

    private AppsGetIOSCatalogSortDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetIOSCatalogSortDto valueOf(String str) {
        return (AppsGetIOSCatalogSortDto) Enum.valueOf(AppsGetIOSCatalogSortDto.class, str);
    }

    public static AppsGetIOSCatalogSortDto[] values() {
        return (AppsGetIOSCatalogSortDto[]) $VALUES.clone();
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
