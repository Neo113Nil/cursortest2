package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsGetRecentsScreenDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetRecentsScreenDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetRecentsScreenDto[] $VALUES;

    @pmi0("catalog")
    public static final AppsGetRecentsScreenDto CATALOG;
    public static final Parcelable.Creator<AppsGetRecentsScreenDto> CREATOR;

    @pmi0("search")
    public static final AppsGetRecentsScreenDto SEARCH;
    private final String value;

    /* compiled from: AppsGetRecentsScreenDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetRecentsScreenDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetRecentsScreenDto createFromParcel(Parcel parcel) {
            return AppsGetRecentsScreenDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetRecentsScreenDto[] newArray(int i) {
            return new AppsGetRecentsScreenDto[i];
        }
    }

    static {
        AppsGetRecentsScreenDto appsGetRecentsScreenDto = new AppsGetRecentsScreenDto("CATALOG", 0, "catalog");
        CATALOG = appsGetRecentsScreenDto;
        AppsGetRecentsScreenDto appsGetRecentsScreenDto2 = new AppsGetRecentsScreenDto("SEARCH", 1, "search");
        SEARCH = appsGetRecentsScreenDto2;
        AppsGetRecentsScreenDto[] appsGetRecentsScreenDtoArr = {appsGetRecentsScreenDto, appsGetRecentsScreenDto2};
        $VALUES = appsGetRecentsScreenDtoArr;
        $ENTRIES = new asp(appsGetRecentsScreenDtoArr);
        CREATOR = new a();
    }

    private AppsGetRecentsScreenDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetRecentsScreenDto valueOf(String str) {
        return (AppsGetRecentsScreenDto) Enum.valueOf(AppsGetRecentsScreenDto.class, str);
    }

    public static AppsGetRecentsScreenDto[] values() {
        return (AppsGetRecentsScreenDto[]) $VALUES.clone();
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
