package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsMiniappsCatalogItemPayloadSingleAppTypeDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsCatalogItemPayloadSingleAppTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsMiniappsCatalogItemPayloadSingleAppTypeDto[] $VALUES;
    public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadSingleAppTypeDto> CREATOR;

    @pmi0("single_app")
    public static final AppsMiniappsCatalogItemPayloadSingleAppTypeDto SINGLE_APP;
    private final String value;

    /* compiled from: AppsMiniappsCatalogItemPayloadSingleAppTypeDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadSingleAppTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadSingleAppTypeDto createFromParcel(Parcel parcel) {
            return AppsMiniappsCatalogItemPayloadSingleAppTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadSingleAppTypeDto[] newArray(int i) {
            return new AppsMiniappsCatalogItemPayloadSingleAppTypeDto[i];
        }
    }

    static {
        AppsMiniappsCatalogItemPayloadSingleAppTypeDto appsMiniappsCatalogItemPayloadSingleAppTypeDto = new AppsMiniappsCatalogItemPayloadSingleAppTypeDto("SINGLE_APP", 0, "single_app");
        SINGLE_APP = appsMiniappsCatalogItemPayloadSingleAppTypeDto;
        AppsMiniappsCatalogItemPayloadSingleAppTypeDto[] appsMiniappsCatalogItemPayloadSingleAppTypeDtoArr = {appsMiniappsCatalogItemPayloadSingleAppTypeDto};
        $VALUES = appsMiniappsCatalogItemPayloadSingleAppTypeDtoArr;
        $ENTRIES = new asp(appsMiniappsCatalogItemPayloadSingleAppTypeDtoArr);
        CREATOR = new a();
    }

    private AppsMiniappsCatalogItemPayloadSingleAppTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsMiniappsCatalogItemPayloadSingleAppTypeDto valueOf(String str) {
        return (AppsMiniappsCatalogItemPayloadSingleAppTypeDto) Enum.valueOf(AppsMiniappsCatalogItemPayloadSingleAppTypeDto.class, str);
    }

    public static AppsMiniappsCatalogItemPayloadSingleAppTypeDto[] values() {
        return (AppsMiniappsCatalogItemPayloadSingleAppTypeDto[]) $VALUES.clone();
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
