package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsGetCatalogFilterDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetCatalogFilterDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetCatalogFilterDto[] $VALUES;
    public static final Parcelable.Creator<AppsGetCatalogFilterDto> CREATOR;

    @pmi0("favorite")
    public static final AppsGetCatalogFilterDto FAVORITE;

    @pmi0("featured")
    public static final AppsGetCatalogFilterDto FEATURED;

    @pmi0("genres_for_unavailable")
    public static final AppsGetCatalogFilterDto GENRES_FOR_UNAVAILABLE;

    @pmi0("installed")
    public static final AppsGetCatalogFilterDto INSTALLED;

    @pmi0("new")
    public static final AppsGetCatalogFilterDto NEW;

    @pmi0("recommended")
    public static final AppsGetCatalogFilterDto RECOMMENDED;
    private final String value;

    /* compiled from: AppsGetCatalogFilterDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetCatalogFilterDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetCatalogFilterDto createFromParcel(Parcel parcel) {
            return AppsGetCatalogFilterDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetCatalogFilterDto[] newArray(int i) {
            return new AppsGetCatalogFilterDto[i];
        }
    }

    static {
        AppsGetCatalogFilterDto appsGetCatalogFilterDto = new AppsGetCatalogFilterDto("FAVORITE", 0, "favorite");
        FAVORITE = appsGetCatalogFilterDto;
        AppsGetCatalogFilterDto appsGetCatalogFilterDto2 = new AppsGetCatalogFilterDto("FEATURED", 1, "featured");
        FEATURED = appsGetCatalogFilterDto2;
        AppsGetCatalogFilterDto appsGetCatalogFilterDto3 = new AppsGetCatalogFilterDto("GENRES_FOR_UNAVAILABLE", 2, "genres_for_unavailable");
        GENRES_FOR_UNAVAILABLE = appsGetCatalogFilterDto3;
        AppsGetCatalogFilterDto appsGetCatalogFilterDto4 = new AppsGetCatalogFilterDto("INSTALLED", 3, "installed");
        INSTALLED = appsGetCatalogFilterDto4;
        AppsGetCatalogFilterDto appsGetCatalogFilterDto5 = new AppsGetCatalogFilterDto("NEW", 4, "new");
        NEW = appsGetCatalogFilterDto5;
        AppsGetCatalogFilterDto appsGetCatalogFilterDto6 = new AppsGetCatalogFilterDto("RECOMMENDED", 5, "recommended");
        RECOMMENDED = appsGetCatalogFilterDto6;
        AppsGetCatalogFilterDto[] appsGetCatalogFilterDtoArr = {appsGetCatalogFilterDto, appsGetCatalogFilterDto2, appsGetCatalogFilterDto3, appsGetCatalogFilterDto4, appsGetCatalogFilterDto5, appsGetCatalogFilterDto6};
        $VALUES = appsGetCatalogFilterDtoArr;
        $ENTRIES = new asp(appsGetCatalogFilterDtoArr);
        CREATOR = new a();
    }

    private AppsGetCatalogFilterDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetCatalogFilterDto valueOf(String str) {
        return (AppsGetCatalogFilterDto) Enum.valueOf(AppsGetCatalogFilterDto.class, str);
    }

    public static AppsGetCatalogFilterDto[] values() {
        return (AppsGetCatalogFilterDto[]) $VALUES.clone();
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
