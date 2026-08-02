package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsGetMVKCatalogFilterDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetMVKCatalogFilterDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetMVKCatalogFilterDto[] $VALUES;
    public static final Parcelable.Creator<AppsGetMVKCatalogFilterDto> CREATOR;

    @pmi0("favorite")
    public static final AppsGetMVKCatalogFilterDto FAVORITE;

    @pmi0("featured")
    public static final AppsGetMVKCatalogFilterDto FEATURED;

    @pmi0("genres_for_unavailable")
    public static final AppsGetMVKCatalogFilterDto GENRES_FOR_UNAVAILABLE;

    @pmi0("installed")
    public static final AppsGetMVKCatalogFilterDto INSTALLED;

    @pmi0("new")
    public static final AppsGetMVKCatalogFilterDto NEW;

    @pmi0("recommended")
    public static final AppsGetMVKCatalogFilterDto RECOMMENDED;
    private final String value;

    /* compiled from: AppsGetMVKCatalogFilterDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetMVKCatalogFilterDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetMVKCatalogFilterDto createFromParcel(Parcel parcel) {
            return AppsGetMVKCatalogFilterDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetMVKCatalogFilterDto[] newArray(int i) {
            return new AppsGetMVKCatalogFilterDto[i];
        }
    }

    static {
        AppsGetMVKCatalogFilterDto appsGetMVKCatalogFilterDto = new AppsGetMVKCatalogFilterDto("FAVORITE", 0, "favorite");
        FAVORITE = appsGetMVKCatalogFilterDto;
        AppsGetMVKCatalogFilterDto appsGetMVKCatalogFilterDto2 = new AppsGetMVKCatalogFilterDto("FEATURED", 1, "featured");
        FEATURED = appsGetMVKCatalogFilterDto2;
        AppsGetMVKCatalogFilterDto appsGetMVKCatalogFilterDto3 = new AppsGetMVKCatalogFilterDto("GENRES_FOR_UNAVAILABLE", 2, "genres_for_unavailable");
        GENRES_FOR_UNAVAILABLE = appsGetMVKCatalogFilterDto3;
        AppsGetMVKCatalogFilterDto appsGetMVKCatalogFilterDto4 = new AppsGetMVKCatalogFilterDto("INSTALLED", 3, "installed");
        INSTALLED = appsGetMVKCatalogFilterDto4;
        AppsGetMVKCatalogFilterDto appsGetMVKCatalogFilterDto5 = new AppsGetMVKCatalogFilterDto("NEW", 4, "new");
        NEW = appsGetMVKCatalogFilterDto5;
        AppsGetMVKCatalogFilterDto appsGetMVKCatalogFilterDto6 = new AppsGetMVKCatalogFilterDto("RECOMMENDED", 5, "recommended");
        RECOMMENDED = appsGetMVKCatalogFilterDto6;
        AppsGetMVKCatalogFilterDto[] appsGetMVKCatalogFilterDtoArr = {appsGetMVKCatalogFilterDto, appsGetMVKCatalogFilterDto2, appsGetMVKCatalogFilterDto3, appsGetMVKCatalogFilterDto4, appsGetMVKCatalogFilterDto5, appsGetMVKCatalogFilterDto6};
        $VALUES = appsGetMVKCatalogFilterDtoArr;
        $ENTRIES = new asp(appsGetMVKCatalogFilterDtoArr);
        CREATOR = new a();
    }

    private AppsGetMVKCatalogFilterDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetMVKCatalogFilterDto valueOf(String str) {
        return (AppsGetMVKCatalogFilterDto) Enum.valueOf(AppsGetMVKCatalogFilterDto.class, str);
    }

    public static AppsGetMVKCatalogFilterDto[] values() {
        return (AppsGetMVKCatalogFilterDto[]) $VALUES.clone();
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
