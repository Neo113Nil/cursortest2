package com.vk.api.generated.appWidgets.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppWidgetsUpdatePrivacyDto.kt */
/* loaded from: classes14.dex */
public final class AppWidgetsUpdatePrivacyDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppWidgetsUpdatePrivacyDto[] $VALUES;

    @pmi0("0")
    public static final AppWidgetsUpdatePrivacyDto ADMINS;
    public static final Parcelable.Creator<AppWidgetsUpdatePrivacyDto> CREATOR;

    @pmi0("2")
    public static final AppWidgetsUpdatePrivacyDto EVERYONE;

    @pmi0("3")
    public static final AppWidgetsUpdatePrivacyDto NO_ONE;

    @pmi0("1")
    public static final AppWidgetsUpdatePrivacyDto SUBSCRIBERS;
    private final int value;

    /* compiled from: AppWidgetsUpdatePrivacyDto.kt */
    public static final class a implements Parcelable.Creator<AppWidgetsUpdatePrivacyDto> {
        @Override // android.os.Parcelable.Creator
        public final AppWidgetsUpdatePrivacyDto createFromParcel(Parcel parcel) {
            return AppWidgetsUpdatePrivacyDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppWidgetsUpdatePrivacyDto[] newArray(int i) {
            return new AppWidgetsUpdatePrivacyDto[i];
        }
    }

    static {
        AppWidgetsUpdatePrivacyDto appWidgetsUpdatePrivacyDto = new AppWidgetsUpdatePrivacyDto("ADMINS", 0, 0);
        ADMINS = appWidgetsUpdatePrivacyDto;
        AppWidgetsUpdatePrivacyDto appWidgetsUpdatePrivacyDto2 = new AppWidgetsUpdatePrivacyDto("SUBSCRIBERS", 1, 1);
        SUBSCRIBERS = appWidgetsUpdatePrivacyDto2;
        AppWidgetsUpdatePrivacyDto appWidgetsUpdatePrivacyDto3 = new AppWidgetsUpdatePrivacyDto("EVERYONE", 2, 2);
        EVERYONE = appWidgetsUpdatePrivacyDto3;
        AppWidgetsUpdatePrivacyDto appWidgetsUpdatePrivacyDto4 = new AppWidgetsUpdatePrivacyDto("NO_ONE", 3, 3);
        NO_ONE = appWidgetsUpdatePrivacyDto4;
        AppWidgetsUpdatePrivacyDto[] appWidgetsUpdatePrivacyDtoArr = {appWidgetsUpdatePrivacyDto, appWidgetsUpdatePrivacyDto2, appWidgetsUpdatePrivacyDto3, appWidgetsUpdatePrivacyDto4};
        $VALUES = appWidgetsUpdatePrivacyDtoArr;
        $ENTRIES = new asp(appWidgetsUpdatePrivacyDtoArr);
        CREATOR = new a();
    }

    private AppWidgetsUpdatePrivacyDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static AppWidgetsUpdatePrivacyDto valueOf(String str) {
        return (AppWidgetsUpdatePrivacyDto) Enum.valueOf(AppWidgetsUpdatePrivacyDto.class, str);
    }

    public static AppWidgetsUpdatePrivacyDto[] values() {
        return (AppWidgetsUpdatePrivacyDto[]) $VALUES.clone();
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
