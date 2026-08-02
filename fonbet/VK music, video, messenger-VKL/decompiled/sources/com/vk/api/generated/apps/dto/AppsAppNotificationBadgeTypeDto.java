package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsAppNotificationBadgeTypeDto.kt */
/* loaded from: classes14.dex */
public final class AppsAppNotificationBadgeTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsAppNotificationBadgeTypeDto[] $VALUES;
    public static final Parcelable.Creator<AppsAppNotificationBadgeTypeDto> CREATOR;

    @pmi0("notification_discount")
    public static final AppsAppNotificationBadgeTypeDto NOTIFICATION_DISCOUNT;

    @pmi0("notification_gift")
    public static final AppsAppNotificationBadgeTypeDto NOTIFICATION_GIFT;

    @pmi0("notification_update")
    public static final AppsAppNotificationBadgeTypeDto NOTIFICATION_UPDATE;
    private final String value;

    /* compiled from: AppsAppNotificationBadgeTypeDto.kt */
    public static final class a implements Parcelable.Creator<AppsAppNotificationBadgeTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsAppNotificationBadgeTypeDto createFromParcel(Parcel parcel) {
            return AppsAppNotificationBadgeTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsAppNotificationBadgeTypeDto[] newArray(int i) {
            return new AppsAppNotificationBadgeTypeDto[i];
        }
    }

    static {
        AppsAppNotificationBadgeTypeDto appsAppNotificationBadgeTypeDto = new AppsAppNotificationBadgeTypeDto("NOTIFICATION_GIFT", 0, "notification_gift");
        NOTIFICATION_GIFT = appsAppNotificationBadgeTypeDto;
        AppsAppNotificationBadgeTypeDto appsAppNotificationBadgeTypeDto2 = new AppsAppNotificationBadgeTypeDto("NOTIFICATION_DISCOUNT", 1, "notification_discount");
        NOTIFICATION_DISCOUNT = appsAppNotificationBadgeTypeDto2;
        AppsAppNotificationBadgeTypeDto appsAppNotificationBadgeTypeDto3 = new AppsAppNotificationBadgeTypeDto("NOTIFICATION_UPDATE", 2, "notification_update");
        NOTIFICATION_UPDATE = appsAppNotificationBadgeTypeDto3;
        AppsAppNotificationBadgeTypeDto[] appsAppNotificationBadgeTypeDtoArr = {appsAppNotificationBadgeTypeDto, appsAppNotificationBadgeTypeDto2, appsAppNotificationBadgeTypeDto3};
        $VALUES = appsAppNotificationBadgeTypeDtoArr;
        $ENTRIES = new asp(appsAppNotificationBadgeTypeDtoArr);
        CREATOR = new a();
    }

    private AppsAppNotificationBadgeTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsAppNotificationBadgeTypeDto valueOf(String str) {
        return (AppsAppNotificationBadgeTypeDto) Enum.valueOf(AppsAppNotificationBadgeTypeDto.class, str);
    }

    public static AppsAppNotificationBadgeTypeDto[] values() {
        return (AppsAppNotificationBadgeTypeDto[]) $VALUES.clone();
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
