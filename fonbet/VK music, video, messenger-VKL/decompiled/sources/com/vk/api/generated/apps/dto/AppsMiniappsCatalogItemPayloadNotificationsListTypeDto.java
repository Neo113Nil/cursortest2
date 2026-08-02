package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsMiniappsCatalogItemPayloadNotificationsListTypeDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsCatalogItemPayloadNotificationsListTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsMiniappsCatalogItemPayloadNotificationsListTypeDto[] $VALUES;
    public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadNotificationsListTypeDto> CREATOR;

    @pmi0("notifications_list")
    public static final AppsMiniappsCatalogItemPayloadNotificationsListTypeDto NOTIFICATIONS_LIST;
    private final String value;

    /* compiled from: AppsMiniappsCatalogItemPayloadNotificationsListTypeDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadNotificationsListTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadNotificationsListTypeDto createFromParcel(Parcel parcel) {
            return AppsMiniappsCatalogItemPayloadNotificationsListTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadNotificationsListTypeDto[] newArray(int i) {
            return new AppsMiniappsCatalogItemPayloadNotificationsListTypeDto[i];
        }
    }

    static {
        AppsMiniappsCatalogItemPayloadNotificationsListTypeDto appsMiniappsCatalogItemPayloadNotificationsListTypeDto = new AppsMiniappsCatalogItemPayloadNotificationsListTypeDto("NOTIFICATIONS_LIST", 0, "notifications_list");
        NOTIFICATIONS_LIST = appsMiniappsCatalogItemPayloadNotificationsListTypeDto;
        AppsMiniappsCatalogItemPayloadNotificationsListTypeDto[] appsMiniappsCatalogItemPayloadNotificationsListTypeDtoArr = {appsMiniappsCatalogItemPayloadNotificationsListTypeDto};
        $VALUES = appsMiniappsCatalogItemPayloadNotificationsListTypeDtoArr;
        $ENTRIES = new asp(appsMiniappsCatalogItemPayloadNotificationsListTypeDtoArr);
        CREATOR = new a();
    }

    private AppsMiniappsCatalogItemPayloadNotificationsListTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsMiniappsCatalogItemPayloadNotificationsListTypeDto valueOf(String str) {
        return (AppsMiniappsCatalogItemPayloadNotificationsListTypeDto) Enum.valueOf(AppsMiniappsCatalogItemPayloadNotificationsListTypeDto.class, str);
    }

    public static AppsMiniappsCatalogItemPayloadNotificationsListTypeDto[] values() {
        return (AppsMiniappsCatalogItemPayloadNotificationsListTypeDto[]) $VALUES.clone();
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
