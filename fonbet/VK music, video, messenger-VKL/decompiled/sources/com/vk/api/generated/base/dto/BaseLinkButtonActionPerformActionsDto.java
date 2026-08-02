package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BaseLinkButtonActionPerformActionsDto.kt */
/* loaded from: classes14.dex */
public final class BaseLinkButtonActionPerformActionsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BaseLinkButtonActionPerformActionsDto[] $VALUES;

    @pmi0("classifieds_hide_bottom_extension_action")
    public static final BaseLinkButtonActionPerformActionsDto CLASSIFIEDS_HIDE_BOTTOM_EXTENSION_ACTION;

    @pmi0("classifieds_post_from_product_action")
    public static final BaseLinkButtonActionPerformActionsDto CLASSIFIEDS_POST_FROM_PRODUCT_ACTION;
    public static final Parcelable.Creator<BaseLinkButtonActionPerformActionsDto> CREATOR;

    @pmi0("open_group_messages")
    public static final BaseLinkButtonActionPerformActionsDto OPEN_GROUP_MESSAGES;

    @pmi0("open_shop_conditions_edit_action")
    public static final BaseLinkButtonActionPerformActionsDto OPEN_SHOP_CONDITIONS_EDIT_ACTION;
    private final String value;

    /* compiled from: BaseLinkButtonActionPerformActionsDto.kt */
    public static final class a implements Parcelable.Creator<BaseLinkButtonActionPerformActionsDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseLinkButtonActionPerformActionsDto createFromParcel(Parcel parcel) {
            return BaseLinkButtonActionPerformActionsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseLinkButtonActionPerformActionsDto[] newArray(int i) {
            return new BaseLinkButtonActionPerformActionsDto[i];
        }
    }

    static {
        BaseLinkButtonActionPerformActionsDto baseLinkButtonActionPerformActionsDto = new BaseLinkButtonActionPerformActionsDto("CLASSIFIEDS_POST_FROM_PRODUCT_ACTION", 0, "classifieds_post_from_product_action");
        CLASSIFIEDS_POST_FROM_PRODUCT_ACTION = baseLinkButtonActionPerformActionsDto;
        BaseLinkButtonActionPerformActionsDto baseLinkButtonActionPerformActionsDto2 = new BaseLinkButtonActionPerformActionsDto("CLASSIFIEDS_HIDE_BOTTOM_EXTENSION_ACTION", 1, "classifieds_hide_bottom_extension_action");
        CLASSIFIEDS_HIDE_BOTTOM_EXTENSION_ACTION = baseLinkButtonActionPerformActionsDto2;
        BaseLinkButtonActionPerformActionsDto baseLinkButtonActionPerformActionsDto3 = new BaseLinkButtonActionPerformActionsDto("OPEN_SHOP_CONDITIONS_EDIT_ACTION", 2, "open_shop_conditions_edit_action");
        OPEN_SHOP_CONDITIONS_EDIT_ACTION = baseLinkButtonActionPerformActionsDto3;
        BaseLinkButtonActionPerformActionsDto baseLinkButtonActionPerformActionsDto4 = new BaseLinkButtonActionPerformActionsDto("OPEN_GROUP_MESSAGES", 3, "open_group_messages");
        OPEN_GROUP_MESSAGES = baseLinkButtonActionPerformActionsDto4;
        BaseLinkButtonActionPerformActionsDto[] baseLinkButtonActionPerformActionsDtoArr = {baseLinkButtonActionPerformActionsDto, baseLinkButtonActionPerformActionsDto2, baseLinkButtonActionPerformActionsDto3, baseLinkButtonActionPerformActionsDto4};
        $VALUES = baseLinkButtonActionPerformActionsDtoArr;
        $ENTRIES = new asp(baseLinkButtonActionPerformActionsDtoArr);
        CREATOR = new a();
    }

    private BaseLinkButtonActionPerformActionsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static BaseLinkButtonActionPerformActionsDto valueOf(String str) {
        return (BaseLinkButtonActionPerformActionsDto) Enum.valueOf(BaseLinkButtonActionPerformActionsDto.class, str);
    }

    public static BaseLinkButtonActionPerformActionsDto[] values() {
        return (BaseLinkButtonActionPerformActionsDto[]) $VALUES.clone();
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
