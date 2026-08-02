package com.vk.api.generated.actionLinks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ActionLinksGetAvailableItemsObjectTypeDto.kt */
/* loaded from: classes14.dex */
public final class ActionLinksGetAvailableItemsObjectTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ActionLinksGetAvailableItemsObjectTypeDto[] $VALUES;
    public static final Parcelable.Creator<ActionLinksGetAvailableItemsObjectTypeDto> CREATOR;

    @pmi0("post")
    public static final ActionLinksGetAvailableItemsObjectTypeDto POST;

    @pmi0("product")
    public static final ActionLinksGetAvailableItemsObjectTypeDto PRODUCT;
    private final String value;

    /* compiled from: ActionLinksGetAvailableItemsObjectTypeDto.kt */
    public static final class a implements Parcelable.Creator<ActionLinksGetAvailableItemsObjectTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final ActionLinksGetAvailableItemsObjectTypeDto createFromParcel(Parcel parcel) {
            return ActionLinksGetAvailableItemsObjectTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ActionLinksGetAvailableItemsObjectTypeDto[] newArray(int i) {
            return new ActionLinksGetAvailableItemsObjectTypeDto[i];
        }
    }

    static {
        ActionLinksGetAvailableItemsObjectTypeDto actionLinksGetAvailableItemsObjectTypeDto = new ActionLinksGetAvailableItemsObjectTypeDto("POST", 0, "post");
        POST = actionLinksGetAvailableItemsObjectTypeDto;
        ActionLinksGetAvailableItemsObjectTypeDto actionLinksGetAvailableItemsObjectTypeDto2 = new ActionLinksGetAvailableItemsObjectTypeDto("PRODUCT", 1, "product");
        PRODUCT = actionLinksGetAvailableItemsObjectTypeDto2;
        ActionLinksGetAvailableItemsObjectTypeDto[] actionLinksGetAvailableItemsObjectTypeDtoArr = {actionLinksGetAvailableItemsObjectTypeDto, actionLinksGetAvailableItemsObjectTypeDto2};
        $VALUES = actionLinksGetAvailableItemsObjectTypeDtoArr;
        $ENTRIES = new asp(actionLinksGetAvailableItemsObjectTypeDtoArr);
        CREATOR = new a();
    }

    private ActionLinksGetAvailableItemsObjectTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ActionLinksGetAvailableItemsObjectTypeDto valueOf(String str) {
        return (ActionLinksGetAvailableItemsObjectTypeDto) Enum.valueOf(ActionLinksGetAvailableItemsObjectTypeDto.class, str);
    }

    public static ActionLinksGetAvailableItemsObjectTypeDto[] values() {
        return (ActionLinksGetAvailableItemsObjectTypeDto[]) $VALUES.clone();
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
