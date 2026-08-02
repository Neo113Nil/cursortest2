package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsGetScopesTypeDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetScopesTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetScopesTypeDto[] $VALUES;
    public static final Parcelable.Creator<AppsGetScopesTypeDto> CREATOR;

    @pmi0("group")
    public static final AppsGetScopesTypeDto GROUP;

    @pmi0("user")
    public static final AppsGetScopesTypeDto USER;
    private final String value;

    /* compiled from: AppsGetScopesTypeDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetScopesTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetScopesTypeDto createFromParcel(Parcel parcel) {
            return AppsGetScopesTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetScopesTypeDto[] newArray(int i) {
            return new AppsGetScopesTypeDto[i];
        }
    }

    static {
        AppsGetScopesTypeDto appsGetScopesTypeDto = new AppsGetScopesTypeDto("GROUP", 0, "group");
        GROUP = appsGetScopesTypeDto;
        AppsGetScopesTypeDto appsGetScopesTypeDto2 = new AppsGetScopesTypeDto("USER", 1, "user");
        USER = appsGetScopesTypeDto2;
        AppsGetScopesTypeDto[] appsGetScopesTypeDtoArr = {appsGetScopesTypeDto, appsGetScopesTypeDto2};
        $VALUES = appsGetScopesTypeDtoArr;
        $ENTRIES = new asp(appsGetScopesTypeDtoArr);
        CREATOR = new a();
    }

    private AppsGetScopesTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetScopesTypeDto valueOf(String str) {
        return (AppsGetScopesTypeDto) Enum.valueOf(AppsGetScopesTypeDto.class, str);
    }

    public static AppsGetScopesTypeDto[] values() {
        return (AppsGetScopesTypeDto[]) $VALUES.clone();
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
