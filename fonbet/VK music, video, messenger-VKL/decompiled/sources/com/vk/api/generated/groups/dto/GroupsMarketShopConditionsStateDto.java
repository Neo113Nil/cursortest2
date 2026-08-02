package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4217a2;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsMarketShopConditionsStateDto.kt */
/* loaded from: classes14.dex */
public final class GroupsMarketShopConditionsStateDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsMarketShopConditionsStateDto[] $VALUES;
    public static final Parcelable.Creator<GroupsMarketShopConditionsStateDto> CREATOR;

    @pmi0(C4217a2.e)
    public static final GroupsMarketShopConditionsStateDto DISABLED;

    @pmi0("enabled")
    public static final GroupsMarketShopConditionsStateDto ENABLED;

    @pmi0("group_enabled")
    public static final GroupsMarketShopConditionsStateDto GROUP_ENABLED;

    @pmi0("integration_enabled")
    public static final GroupsMarketShopConditionsStateDto INTEGRATION_ENABLED;

    @pmi0("ozon_enabled")
    public static final GroupsMarketShopConditionsStateDto OZON_ENABLED;

    @pmi0("product_card_enabled")
    public static final GroupsMarketShopConditionsStateDto PRODUCT_CARD_ENABLED;
    private final String value;

    /* compiled from: GroupsMarketShopConditionsStateDto.kt */
    public static final class a implements Parcelable.Creator<GroupsMarketShopConditionsStateDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsMarketShopConditionsStateDto createFromParcel(Parcel parcel) {
            return GroupsMarketShopConditionsStateDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsMarketShopConditionsStateDto[] newArray(int i) {
            return new GroupsMarketShopConditionsStateDto[i];
        }
    }

    static {
        GroupsMarketShopConditionsStateDto groupsMarketShopConditionsStateDto = new GroupsMarketShopConditionsStateDto("ENABLED", 0, "enabled");
        ENABLED = groupsMarketShopConditionsStateDto;
        GroupsMarketShopConditionsStateDto groupsMarketShopConditionsStateDto2 = new GroupsMarketShopConditionsStateDto("PRODUCT_CARD_ENABLED", 1, "product_card_enabled");
        PRODUCT_CARD_ENABLED = groupsMarketShopConditionsStateDto2;
        GroupsMarketShopConditionsStateDto groupsMarketShopConditionsStateDto3 = new GroupsMarketShopConditionsStateDto("GROUP_ENABLED", 2, "group_enabled");
        GROUP_ENABLED = groupsMarketShopConditionsStateDto3;
        GroupsMarketShopConditionsStateDto groupsMarketShopConditionsStateDto4 = new GroupsMarketShopConditionsStateDto("DISABLED", 3, C4217a2.e);
        DISABLED = groupsMarketShopConditionsStateDto4;
        GroupsMarketShopConditionsStateDto groupsMarketShopConditionsStateDto5 = new GroupsMarketShopConditionsStateDto("OZON_ENABLED", 4, "ozon_enabled");
        OZON_ENABLED = groupsMarketShopConditionsStateDto5;
        GroupsMarketShopConditionsStateDto groupsMarketShopConditionsStateDto6 = new GroupsMarketShopConditionsStateDto("INTEGRATION_ENABLED", 5, "integration_enabled");
        INTEGRATION_ENABLED = groupsMarketShopConditionsStateDto6;
        GroupsMarketShopConditionsStateDto[] groupsMarketShopConditionsStateDtoArr = {groupsMarketShopConditionsStateDto, groupsMarketShopConditionsStateDto2, groupsMarketShopConditionsStateDto3, groupsMarketShopConditionsStateDto4, groupsMarketShopConditionsStateDto5, groupsMarketShopConditionsStateDto6};
        $VALUES = groupsMarketShopConditionsStateDtoArr;
        $ENTRIES = new asp(groupsMarketShopConditionsStateDtoArr);
        CREATOR = new a();
    }

    private GroupsMarketShopConditionsStateDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsMarketShopConditionsStateDto valueOf(String str) {
        return (GroupsMarketShopConditionsStateDto) Enum.valueOf(GroupsMarketShopConditionsStateDto.class, str);
    }

    public static GroupsMarketShopConditionsStateDto[] values() {
        return (GroupsMarketShopConditionsStateDto[]) $VALUES.clone();
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
