package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsSetActionShownActionTypeDto.kt */
/* loaded from: classes14.dex */
public final class AppsSetActionShownActionTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsSetActionShownActionTypeDto[] $VALUES;

    @pmi0("add_to_community")
    public static final AppsSetActionShownActionTypeDto ADD_TO_COMMUNITY;

    @pmi0("add_to_main_screen")
    public static final AppsSetActionShownActionTypeDto ADD_TO_MAIN_SCREEN;
    public static final Parcelable.Creator<AppsSetActionShownActionTypeDto> CREATOR;

    @pmi0("notifications_auto_permission")
    public static final AppsSetActionShownActionTypeDto NOTIFICATIONS_AUTO_PERMISSION;

    @pmi0("personal_discount")
    public static final AppsSetActionShownActionTypeDto PERSONAL_DISCOUNT;

    @pmi0("personal_discount_cashback")
    public static final AppsSetActionShownActionTypeDto PERSONAL_DISCOUNT_CASHBACK;

    @pmi0("recommend")
    public static final AppsSetActionShownActionTypeDto RECOMMEND;

    @pmi0("recommendation_notification")
    public static final AppsSetActionShownActionTypeDto RECOMMENDATION_NOTIFICATION;
    private final String value;

    /* compiled from: AppsSetActionShownActionTypeDto.kt */
    public static final class a implements Parcelable.Creator<AppsSetActionShownActionTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsSetActionShownActionTypeDto createFromParcel(Parcel parcel) {
            return AppsSetActionShownActionTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsSetActionShownActionTypeDto[] newArray(int i) {
            return new AppsSetActionShownActionTypeDto[i];
        }
    }

    static {
        AppsSetActionShownActionTypeDto appsSetActionShownActionTypeDto = new AppsSetActionShownActionTypeDto("ADD_TO_COMMUNITY", 0, "add_to_community");
        ADD_TO_COMMUNITY = appsSetActionShownActionTypeDto;
        AppsSetActionShownActionTypeDto appsSetActionShownActionTypeDto2 = new AppsSetActionShownActionTypeDto("ADD_TO_MAIN_SCREEN", 1, "add_to_main_screen");
        ADD_TO_MAIN_SCREEN = appsSetActionShownActionTypeDto2;
        AppsSetActionShownActionTypeDto appsSetActionShownActionTypeDto3 = new AppsSetActionShownActionTypeDto("NOTIFICATIONS_AUTO_PERMISSION", 2, "notifications_auto_permission");
        NOTIFICATIONS_AUTO_PERMISSION = appsSetActionShownActionTypeDto3;
        AppsSetActionShownActionTypeDto appsSetActionShownActionTypeDto4 = new AppsSetActionShownActionTypeDto("PERSONAL_DISCOUNT", 3, "personal_discount");
        PERSONAL_DISCOUNT = appsSetActionShownActionTypeDto4;
        AppsSetActionShownActionTypeDto appsSetActionShownActionTypeDto5 = new AppsSetActionShownActionTypeDto("PERSONAL_DISCOUNT_CASHBACK", 4, "personal_discount_cashback");
        PERSONAL_DISCOUNT_CASHBACK = appsSetActionShownActionTypeDto5;
        AppsSetActionShownActionTypeDto appsSetActionShownActionTypeDto6 = new AppsSetActionShownActionTypeDto("RECOMMEND", 5, "recommend");
        RECOMMEND = appsSetActionShownActionTypeDto6;
        AppsSetActionShownActionTypeDto appsSetActionShownActionTypeDto7 = new AppsSetActionShownActionTypeDto("RECOMMENDATION_NOTIFICATION", 6, "recommendation_notification");
        RECOMMENDATION_NOTIFICATION = appsSetActionShownActionTypeDto7;
        AppsSetActionShownActionTypeDto[] appsSetActionShownActionTypeDtoArr = {appsSetActionShownActionTypeDto, appsSetActionShownActionTypeDto2, appsSetActionShownActionTypeDto3, appsSetActionShownActionTypeDto4, appsSetActionShownActionTypeDto5, appsSetActionShownActionTypeDto6, appsSetActionShownActionTypeDto7};
        $VALUES = appsSetActionShownActionTypeDtoArr;
        $ENTRIES = new asp(appsSetActionShownActionTypeDtoArr);
        CREATOR = new a();
    }

    private AppsSetActionShownActionTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsSetActionShownActionTypeDto valueOf(String str) {
        return (AppsSetActionShownActionTypeDto) Enum.valueOf(AppsSetActionShownActionTypeDto.class, str);
    }

    public static AppsSetActionShownActionTypeDto[] values() {
        return (AppsSetActionShownActionTypeDto[]) $VALUES.clone();
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
