package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsGetRecommendationsScreenDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetRecommendationsScreenDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetRecommendationsScreenDto[] $VALUES;

    @pmi0("catalog")
    public static final AppsGetRecommendationsScreenDto CATALOG;
    public static final Parcelable.Creator<AppsGetRecommendationsScreenDto> CREATOR;

    @pmi0("search")
    public static final AppsGetRecommendationsScreenDto SEARCH;
    private final String value;

    /* compiled from: AppsGetRecommendationsScreenDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetRecommendationsScreenDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetRecommendationsScreenDto createFromParcel(Parcel parcel) {
            return AppsGetRecommendationsScreenDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetRecommendationsScreenDto[] newArray(int i) {
            return new AppsGetRecommendationsScreenDto[i];
        }
    }

    static {
        AppsGetRecommendationsScreenDto appsGetRecommendationsScreenDto = new AppsGetRecommendationsScreenDto("CATALOG", 0, "catalog");
        CATALOG = appsGetRecommendationsScreenDto;
        AppsGetRecommendationsScreenDto appsGetRecommendationsScreenDto2 = new AppsGetRecommendationsScreenDto("SEARCH", 1, "search");
        SEARCH = appsGetRecommendationsScreenDto2;
        AppsGetRecommendationsScreenDto[] appsGetRecommendationsScreenDtoArr = {appsGetRecommendationsScreenDto, appsGetRecommendationsScreenDto2};
        $VALUES = appsGetRecommendationsScreenDtoArr;
        $ENTRIES = new asp(appsGetRecommendationsScreenDtoArr);
        CREATOR = new a();
    }

    private AppsGetRecommendationsScreenDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetRecommendationsScreenDto valueOf(String str) {
        return (AppsGetRecommendationsScreenDto) Enum.valueOf(AppsGetRecommendationsScreenDto.class, str);
    }

    public static AppsGetRecommendationsScreenDto[] values() {
        return (AppsGetRecommendationsScreenDto[]) $VALUES.clone();
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
