package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsGetAndroidCatalogFilterDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetAndroidCatalogFilterDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetAndroidCatalogFilterDto[] $VALUES;
    public static final Parcelable.Creator<AppsGetAndroidCatalogFilterDto> CREATOR;

    @pmi0("favorite")
    public static final AppsGetAndroidCatalogFilterDto FAVORITE;

    @pmi0("featured")
    public static final AppsGetAndroidCatalogFilterDto FEATURED;

    @pmi0("genres_for_unavailable")
    public static final AppsGetAndroidCatalogFilterDto GENRES_FOR_UNAVAILABLE;

    @pmi0("installed")
    public static final AppsGetAndroidCatalogFilterDto INSTALLED;

    @pmi0("new")
    public static final AppsGetAndroidCatalogFilterDto NEW;

    @pmi0("recommended")
    public static final AppsGetAndroidCatalogFilterDto RECOMMENDED;
    private final String value;

    /* compiled from: AppsGetAndroidCatalogFilterDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetAndroidCatalogFilterDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetAndroidCatalogFilterDto createFromParcel(Parcel parcel) {
            return AppsGetAndroidCatalogFilterDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetAndroidCatalogFilterDto[] newArray(int i) {
            return new AppsGetAndroidCatalogFilterDto[i];
        }
    }

    static {
        AppsGetAndroidCatalogFilterDto appsGetAndroidCatalogFilterDto = new AppsGetAndroidCatalogFilterDto("FAVORITE", 0, "favorite");
        FAVORITE = appsGetAndroidCatalogFilterDto;
        AppsGetAndroidCatalogFilterDto appsGetAndroidCatalogFilterDto2 = new AppsGetAndroidCatalogFilterDto("FEATURED", 1, "featured");
        FEATURED = appsGetAndroidCatalogFilterDto2;
        AppsGetAndroidCatalogFilterDto appsGetAndroidCatalogFilterDto3 = new AppsGetAndroidCatalogFilterDto("GENRES_FOR_UNAVAILABLE", 2, "genres_for_unavailable");
        GENRES_FOR_UNAVAILABLE = appsGetAndroidCatalogFilterDto3;
        AppsGetAndroidCatalogFilterDto appsGetAndroidCatalogFilterDto4 = new AppsGetAndroidCatalogFilterDto("INSTALLED", 3, "installed");
        INSTALLED = appsGetAndroidCatalogFilterDto4;
        AppsGetAndroidCatalogFilterDto appsGetAndroidCatalogFilterDto5 = new AppsGetAndroidCatalogFilterDto("NEW", 4, "new");
        NEW = appsGetAndroidCatalogFilterDto5;
        AppsGetAndroidCatalogFilterDto appsGetAndroidCatalogFilterDto6 = new AppsGetAndroidCatalogFilterDto("RECOMMENDED", 5, "recommended");
        RECOMMENDED = appsGetAndroidCatalogFilterDto6;
        AppsGetAndroidCatalogFilterDto[] appsGetAndroidCatalogFilterDtoArr = {appsGetAndroidCatalogFilterDto, appsGetAndroidCatalogFilterDto2, appsGetAndroidCatalogFilterDto3, appsGetAndroidCatalogFilterDto4, appsGetAndroidCatalogFilterDto5, appsGetAndroidCatalogFilterDto6};
        $VALUES = appsGetAndroidCatalogFilterDtoArr;
        $ENTRIES = new asp(appsGetAndroidCatalogFilterDtoArr);
        CREATOR = new a();
    }

    private AppsGetAndroidCatalogFilterDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<AppsGetAndroidCatalogFilterDto> i() {
        return $ENTRIES;
    }

    public static AppsGetAndroidCatalogFilterDto valueOf(String str) {
        return (AppsGetAndroidCatalogFilterDto) Enum.valueOf(AppsGetAndroidCatalogFilterDto.class, str);
    }

    public static AppsGetAndroidCatalogFilterDto[] values() {
        return (AppsGetAndroidCatalogFilterDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String j() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
