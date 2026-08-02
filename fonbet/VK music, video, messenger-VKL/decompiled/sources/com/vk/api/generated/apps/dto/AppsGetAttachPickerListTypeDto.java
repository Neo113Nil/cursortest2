package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsGetAttachPickerListTypeDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetAttachPickerListTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetAttachPickerListTypeDto[] $VALUES;
    public static final Parcelable.Creator<AppsGetAttachPickerListTypeDto> CREATOR;

    @pmi0("games")
    public static final AppsGetAttachPickerListTypeDto GAMES;

    @pmi0("mini_apps")
    public static final AppsGetAttachPickerListTypeDto MINI_APPS;
    private final String value;

    /* compiled from: AppsGetAttachPickerListTypeDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetAttachPickerListTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetAttachPickerListTypeDto createFromParcel(Parcel parcel) {
            return AppsGetAttachPickerListTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetAttachPickerListTypeDto[] newArray(int i) {
            return new AppsGetAttachPickerListTypeDto[i];
        }
    }

    static {
        AppsGetAttachPickerListTypeDto appsGetAttachPickerListTypeDto = new AppsGetAttachPickerListTypeDto("GAMES", 0, "games");
        GAMES = appsGetAttachPickerListTypeDto;
        AppsGetAttachPickerListTypeDto appsGetAttachPickerListTypeDto2 = new AppsGetAttachPickerListTypeDto("MINI_APPS", 1, "mini_apps");
        MINI_APPS = appsGetAttachPickerListTypeDto2;
        AppsGetAttachPickerListTypeDto[] appsGetAttachPickerListTypeDtoArr = {appsGetAttachPickerListTypeDto, appsGetAttachPickerListTypeDto2};
        $VALUES = appsGetAttachPickerListTypeDtoArr;
        $ENTRIES = new asp(appsGetAttachPickerListTypeDtoArr);
        CREATOR = new a();
    }

    private AppsGetAttachPickerListTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetAttachPickerListTypeDto valueOf(String str) {
        return (AppsGetAttachPickerListTypeDto) Enum.valueOf(AppsGetAttachPickerListTypeDto.class, str);
    }

    public static AppsGetAttachPickerListTypeDto[] values() {
        return (AppsGetAttachPickerListTypeDto[]) $VALUES.clone();
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
