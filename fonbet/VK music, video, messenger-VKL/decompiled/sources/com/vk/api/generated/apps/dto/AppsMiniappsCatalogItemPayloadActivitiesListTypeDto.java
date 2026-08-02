package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsMiniappsCatalogItemPayloadActivitiesListTypeDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsCatalogItemPayloadActivitiesListTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsMiniappsCatalogItemPayloadActivitiesListTypeDto[] $VALUES;

    @pmi0("activities_list")
    public static final AppsMiniappsCatalogItemPayloadActivitiesListTypeDto ACTIVITIES_LIST;
    public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadActivitiesListTypeDto> CREATOR;
    private final String value;

    /* compiled from: AppsMiniappsCatalogItemPayloadActivitiesListTypeDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadActivitiesListTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadActivitiesListTypeDto createFromParcel(Parcel parcel) {
            return AppsMiniappsCatalogItemPayloadActivitiesListTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadActivitiesListTypeDto[] newArray(int i) {
            return new AppsMiniappsCatalogItemPayloadActivitiesListTypeDto[i];
        }
    }

    static {
        AppsMiniappsCatalogItemPayloadActivitiesListTypeDto appsMiniappsCatalogItemPayloadActivitiesListTypeDto = new AppsMiniappsCatalogItemPayloadActivitiesListTypeDto("ACTIVITIES_LIST", 0, "activities_list");
        ACTIVITIES_LIST = appsMiniappsCatalogItemPayloadActivitiesListTypeDto;
        AppsMiniappsCatalogItemPayloadActivitiesListTypeDto[] appsMiniappsCatalogItemPayloadActivitiesListTypeDtoArr = {appsMiniappsCatalogItemPayloadActivitiesListTypeDto};
        $VALUES = appsMiniappsCatalogItemPayloadActivitiesListTypeDtoArr;
        $ENTRIES = new asp(appsMiniappsCatalogItemPayloadActivitiesListTypeDtoArr);
        CREATOR = new a();
    }

    private AppsMiniappsCatalogItemPayloadActivitiesListTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsMiniappsCatalogItemPayloadActivitiesListTypeDto valueOf(String str) {
        return (AppsMiniappsCatalogItemPayloadActivitiesListTypeDto) Enum.valueOf(AppsMiniappsCatalogItemPayloadActivitiesListTypeDto.class, str);
    }

    public static AppsMiniappsCatalogItemPayloadActivitiesListTypeDto[] values() {
        return (AppsMiniappsCatalogItemPayloadActivitiesListTypeDto[]) $VALUES.clone();
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
