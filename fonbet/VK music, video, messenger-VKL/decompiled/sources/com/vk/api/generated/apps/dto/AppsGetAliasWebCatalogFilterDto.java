package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsGetAliasWebCatalogFilterDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetAliasWebCatalogFilterDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetAliasWebCatalogFilterDto[] $VALUES;
    public static final Parcelable.Creator<AppsGetAliasWebCatalogFilterDto> CREATOR;

    @pmi0("favorite")
    public static final AppsGetAliasWebCatalogFilterDto FAVORITE;

    @pmi0("featured")
    public static final AppsGetAliasWebCatalogFilterDto FEATURED;

    @pmi0("genres_for_unavailable")
    public static final AppsGetAliasWebCatalogFilterDto GENRES_FOR_UNAVAILABLE;

    @pmi0("installed")
    public static final AppsGetAliasWebCatalogFilterDto INSTALLED;

    @pmi0("new")
    public static final AppsGetAliasWebCatalogFilterDto NEW;

    @pmi0("recommended")
    public static final AppsGetAliasWebCatalogFilterDto RECOMMENDED;
    private final String value;

    /* compiled from: AppsGetAliasWebCatalogFilterDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetAliasWebCatalogFilterDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetAliasWebCatalogFilterDto createFromParcel(Parcel parcel) {
            return AppsGetAliasWebCatalogFilterDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetAliasWebCatalogFilterDto[] newArray(int i) {
            return new AppsGetAliasWebCatalogFilterDto[i];
        }
    }

    static {
        AppsGetAliasWebCatalogFilterDto appsGetAliasWebCatalogFilterDto = new AppsGetAliasWebCatalogFilterDto("FAVORITE", 0, "favorite");
        FAVORITE = appsGetAliasWebCatalogFilterDto;
        AppsGetAliasWebCatalogFilterDto appsGetAliasWebCatalogFilterDto2 = new AppsGetAliasWebCatalogFilterDto("FEATURED", 1, "featured");
        FEATURED = appsGetAliasWebCatalogFilterDto2;
        AppsGetAliasWebCatalogFilterDto appsGetAliasWebCatalogFilterDto3 = new AppsGetAliasWebCatalogFilterDto("GENRES_FOR_UNAVAILABLE", 2, "genres_for_unavailable");
        GENRES_FOR_UNAVAILABLE = appsGetAliasWebCatalogFilterDto3;
        AppsGetAliasWebCatalogFilterDto appsGetAliasWebCatalogFilterDto4 = new AppsGetAliasWebCatalogFilterDto("INSTALLED", 3, "installed");
        INSTALLED = appsGetAliasWebCatalogFilterDto4;
        AppsGetAliasWebCatalogFilterDto appsGetAliasWebCatalogFilterDto5 = new AppsGetAliasWebCatalogFilterDto("NEW", 4, "new");
        NEW = appsGetAliasWebCatalogFilterDto5;
        AppsGetAliasWebCatalogFilterDto appsGetAliasWebCatalogFilterDto6 = new AppsGetAliasWebCatalogFilterDto("RECOMMENDED", 5, "recommended");
        RECOMMENDED = appsGetAliasWebCatalogFilterDto6;
        AppsGetAliasWebCatalogFilterDto[] appsGetAliasWebCatalogFilterDtoArr = {appsGetAliasWebCatalogFilterDto, appsGetAliasWebCatalogFilterDto2, appsGetAliasWebCatalogFilterDto3, appsGetAliasWebCatalogFilterDto4, appsGetAliasWebCatalogFilterDto5, appsGetAliasWebCatalogFilterDto6};
        $VALUES = appsGetAliasWebCatalogFilterDtoArr;
        $ENTRIES = new asp(appsGetAliasWebCatalogFilterDtoArr);
        CREATOR = new a();
    }

    private AppsGetAliasWebCatalogFilterDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetAliasWebCatalogFilterDto valueOf(String str) {
        return (AppsGetAliasWebCatalogFilterDto) Enum.valueOf(AppsGetAliasWebCatalogFilterDto.class, str);
    }

    public static AppsGetAliasWebCatalogFilterDto[] values() {
        return (AppsGetAliasWebCatalogFilterDto[]) $VALUES.clone();
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
