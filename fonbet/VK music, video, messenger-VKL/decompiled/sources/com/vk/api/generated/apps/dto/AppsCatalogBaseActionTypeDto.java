package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsCatalogBaseActionTypeDto.kt */
/* loaded from: classes14.dex */
public final class AppsCatalogBaseActionTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsCatalogBaseActionTypeDto[] $VALUES;
    public static final Parcelable.Creator<AppsCatalogBaseActionTypeDto> CREATOR;

    @pmi0("open_achievement_modal")
    public static final AppsCatalogBaseActionTypeDto OPEN_ACHIEVEMENT_MODAL;

    @pmi0("open_game")
    public static final AppsCatalogBaseActionTypeDto OPEN_GAME;

    @pmi0("open_mini_app")
    public static final AppsCatalogBaseActionTypeDto OPEN_MINI_APP;

    @pmi0("open_url")
    public static final AppsCatalogBaseActionTypeDto OPEN_URL;
    private final String value;

    /* compiled from: AppsCatalogBaseActionTypeDto.kt */
    public static final class a implements Parcelable.Creator<AppsCatalogBaseActionTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsCatalogBaseActionTypeDto createFromParcel(Parcel parcel) {
            return AppsCatalogBaseActionTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsCatalogBaseActionTypeDto[] newArray(int i) {
            return new AppsCatalogBaseActionTypeDto[i];
        }
    }

    static {
        AppsCatalogBaseActionTypeDto appsCatalogBaseActionTypeDto = new AppsCatalogBaseActionTypeDto("OPEN_URL", 0, "open_url");
        OPEN_URL = appsCatalogBaseActionTypeDto;
        AppsCatalogBaseActionTypeDto appsCatalogBaseActionTypeDto2 = new AppsCatalogBaseActionTypeDto("OPEN_MINI_APP", 1, "open_mini_app");
        OPEN_MINI_APP = appsCatalogBaseActionTypeDto2;
        AppsCatalogBaseActionTypeDto appsCatalogBaseActionTypeDto3 = new AppsCatalogBaseActionTypeDto("OPEN_GAME", 2, "open_game");
        OPEN_GAME = appsCatalogBaseActionTypeDto3;
        AppsCatalogBaseActionTypeDto appsCatalogBaseActionTypeDto4 = new AppsCatalogBaseActionTypeDto("OPEN_ACHIEVEMENT_MODAL", 3, "open_achievement_modal");
        OPEN_ACHIEVEMENT_MODAL = appsCatalogBaseActionTypeDto4;
        AppsCatalogBaseActionTypeDto[] appsCatalogBaseActionTypeDtoArr = {appsCatalogBaseActionTypeDto, appsCatalogBaseActionTypeDto2, appsCatalogBaseActionTypeDto3, appsCatalogBaseActionTypeDto4};
        $VALUES = appsCatalogBaseActionTypeDtoArr;
        $ENTRIES = new asp(appsCatalogBaseActionTypeDtoArr);
        CREATOR = new a();
    }

    private AppsCatalogBaseActionTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsCatalogBaseActionTypeDto valueOf(String str) {
        return (AppsCatalogBaseActionTypeDto) Enum.valueOf(AppsCatalogBaseActionTypeDto.class, str);
    }

    public static AppsCatalogBaseActionTypeDto[] values() {
        return (AppsCatalogBaseActionTypeDto[]) $VALUES.clone();
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
