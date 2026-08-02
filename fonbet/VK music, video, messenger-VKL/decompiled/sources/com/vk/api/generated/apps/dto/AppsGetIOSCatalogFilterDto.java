package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsGetIOSCatalogFilterDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetIOSCatalogFilterDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetIOSCatalogFilterDto[] $VALUES;
    public static final Parcelable.Creator<AppsGetIOSCatalogFilterDto> CREATOR;

    @pmi0("favorite")
    public static final AppsGetIOSCatalogFilterDto FAVORITE;

    @pmi0("featured")
    public static final AppsGetIOSCatalogFilterDto FEATURED;

    @pmi0("genres_for_unavailable")
    public static final AppsGetIOSCatalogFilterDto GENRES_FOR_UNAVAILABLE;

    @pmi0("installed")
    public static final AppsGetIOSCatalogFilterDto INSTALLED;

    @pmi0("new")
    public static final AppsGetIOSCatalogFilterDto NEW;

    @pmi0("recommended")
    public static final AppsGetIOSCatalogFilterDto RECOMMENDED;
    private final String value;

    /* compiled from: AppsGetIOSCatalogFilterDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetIOSCatalogFilterDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetIOSCatalogFilterDto createFromParcel(Parcel parcel) {
            return AppsGetIOSCatalogFilterDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetIOSCatalogFilterDto[] newArray(int i) {
            return new AppsGetIOSCatalogFilterDto[i];
        }
    }

    static {
        AppsGetIOSCatalogFilterDto appsGetIOSCatalogFilterDto = new AppsGetIOSCatalogFilterDto("FAVORITE", 0, "favorite");
        FAVORITE = appsGetIOSCatalogFilterDto;
        AppsGetIOSCatalogFilterDto appsGetIOSCatalogFilterDto2 = new AppsGetIOSCatalogFilterDto("FEATURED", 1, "featured");
        FEATURED = appsGetIOSCatalogFilterDto2;
        AppsGetIOSCatalogFilterDto appsGetIOSCatalogFilterDto3 = new AppsGetIOSCatalogFilterDto("GENRES_FOR_UNAVAILABLE", 2, "genres_for_unavailable");
        GENRES_FOR_UNAVAILABLE = appsGetIOSCatalogFilterDto3;
        AppsGetIOSCatalogFilterDto appsGetIOSCatalogFilterDto4 = new AppsGetIOSCatalogFilterDto("INSTALLED", 3, "installed");
        INSTALLED = appsGetIOSCatalogFilterDto4;
        AppsGetIOSCatalogFilterDto appsGetIOSCatalogFilterDto5 = new AppsGetIOSCatalogFilterDto("NEW", 4, "new");
        NEW = appsGetIOSCatalogFilterDto5;
        AppsGetIOSCatalogFilterDto appsGetIOSCatalogFilterDto6 = new AppsGetIOSCatalogFilterDto("RECOMMENDED", 5, "recommended");
        RECOMMENDED = appsGetIOSCatalogFilterDto6;
        AppsGetIOSCatalogFilterDto[] appsGetIOSCatalogFilterDtoArr = {appsGetIOSCatalogFilterDto, appsGetIOSCatalogFilterDto2, appsGetIOSCatalogFilterDto3, appsGetIOSCatalogFilterDto4, appsGetIOSCatalogFilterDto5, appsGetIOSCatalogFilterDto6};
        $VALUES = appsGetIOSCatalogFilterDtoArr;
        $ENTRIES = new asp(appsGetIOSCatalogFilterDtoArr);
        CREATOR = new a();
    }

    private AppsGetIOSCatalogFilterDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetIOSCatalogFilterDto valueOf(String str) {
        return (AppsGetIOSCatalogFilterDto) Enum.valueOf(AppsGetIOSCatalogFilterDto.class, str);
    }

    public static AppsGetIOSCatalogFilterDto[] values() {
        return (AppsGetIOSCatalogFilterDto[]) $VALUES.clone();
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
