package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsMarkBadgeAsClickedTypeDto.kt */
/* loaded from: classes14.dex */
public final class AppsMarkBadgeAsClickedTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsMarkBadgeAsClickedTypeDto[] $VALUES;
    public static final Parcelable.Creator<AppsMarkBadgeAsClickedTypeDto> CREATOR;

    @pmi0("notification_discount")
    public static final AppsMarkBadgeAsClickedTypeDto NOTIFICATION_DISCOUNT;

    @pmi0("notification_gift")
    public static final AppsMarkBadgeAsClickedTypeDto NOTIFICATION_GIFT;

    @pmi0("notification_update")
    public static final AppsMarkBadgeAsClickedTypeDto NOTIFICATION_UPDATE;
    private final String value;

    /* compiled from: AppsMarkBadgeAsClickedTypeDto.kt */
    public static final class a implements Parcelable.Creator<AppsMarkBadgeAsClickedTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMarkBadgeAsClickedTypeDto createFromParcel(Parcel parcel) {
            return AppsMarkBadgeAsClickedTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMarkBadgeAsClickedTypeDto[] newArray(int i) {
            return new AppsMarkBadgeAsClickedTypeDto[i];
        }
    }

    static {
        AppsMarkBadgeAsClickedTypeDto appsMarkBadgeAsClickedTypeDto = new AppsMarkBadgeAsClickedTypeDto("NOTIFICATION_DISCOUNT", 0, "notification_discount");
        NOTIFICATION_DISCOUNT = appsMarkBadgeAsClickedTypeDto;
        AppsMarkBadgeAsClickedTypeDto appsMarkBadgeAsClickedTypeDto2 = new AppsMarkBadgeAsClickedTypeDto("NOTIFICATION_GIFT", 1, "notification_gift");
        NOTIFICATION_GIFT = appsMarkBadgeAsClickedTypeDto2;
        AppsMarkBadgeAsClickedTypeDto appsMarkBadgeAsClickedTypeDto3 = new AppsMarkBadgeAsClickedTypeDto("NOTIFICATION_UPDATE", 2, "notification_update");
        NOTIFICATION_UPDATE = appsMarkBadgeAsClickedTypeDto3;
        AppsMarkBadgeAsClickedTypeDto[] appsMarkBadgeAsClickedTypeDtoArr = {appsMarkBadgeAsClickedTypeDto, appsMarkBadgeAsClickedTypeDto2, appsMarkBadgeAsClickedTypeDto3};
        $VALUES = appsMarkBadgeAsClickedTypeDtoArr;
        $ENTRIES = new asp(appsMarkBadgeAsClickedTypeDtoArr);
        CREATOR = new a();
    }

    private AppsMarkBadgeAsClickedTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsMarkBadgeAsClickedTypeDto valueOf(String str) {
        return (AppsMarkBadgeAsClickedTypeDto) Enum.valueOf(AppsMarkBadgeAsClickedTypeDto.class, str);
    }

    public static AppsMarkBadgeAsClickedTypeDto[] values() {
        return (AppsMarkBadgeAsClickedTypeDto[]) $VALUES.clone();
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
