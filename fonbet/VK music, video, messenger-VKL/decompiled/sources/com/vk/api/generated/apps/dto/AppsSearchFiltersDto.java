package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsSearchFiltersDto.kt */
/* loaded from: classes14.dex */
public final class AppsSearchFiltersDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsSearchFiltersDto[] $VALUES;
    public static final Parcelable.Creator<AppsSearchFiltersDto> CREATOR;

    @pmi0("direct_games")
    public static final AppsSearchFiltersDto DIRECT_GAMES;

    @pmi0("vk_apps")
    public static final AppsSearchFiltersDto VK_APPS;
    private final String value;

    /* compiled from: AppsSearchFiltersDto.kt */
    public static final class a implements Parcelable.Creator<AppsSearchFiltersDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsSearchFiltersDto createFromParcel(Parcel parcel) {
            return AppsSearchFiltersDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsSearchFiltersDto[] newArray(int i) {
            return new AppsSearchFiltersDto[i];
        }
    }

    static {
        AppsSearchFiltersDto appsSearchFiltersDto = new AppsSearchFiltersDto("VK_APPS", 0, "vk_apps");
        VK_APPS = appsSearchFiltersDto;
        AppsSearchFiltersDto appsSearchFiltersDto2 = new AppsSearchFiltersDto("DIRECT_GAMES", 1, "direct_games");
        DIRECT_GAMES = appsSearchFiltersDto2;
        AppsSearchFiltersDto[] appsSearchFiltersDtoArr = {appsSearchFiltersDto, appsSearchFiltersDto2};
        $VALUES = appsSearchFiltersDtoArr;
        $ENTRIES = new asp(appsSearchFiltersDtoArr);
        CREATOR = new a();
    }

    private AppsSearchFiltersDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsSearchFiltersDto valueOf(String str) {
        return (AppsSearchFiltersDto) Enum.valueOf(AppsSearchFiltersDto.class, str);
    }

    public static AppsSearchFiltersDto[] values() {
        return (AppsSearchFiltersDto[]) $VALUES.clone();
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
