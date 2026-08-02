package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsSetGroupSettingsMarketViewTypeDto.kt */
/* loaded from: classes14.dex */
public final class GroupsSetGroupSettingsMarketViewTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsSetGroupSettingsMarketViewTypeDto[] $VALUES;

    @pmi0("albums")
    public static final GroupsSetGroupSettingsMarketViewTypeDto ALBUMS;
    public static final Parcelable.Creator<GroupsSetGroupSettingsMarketViewTypeDto> CREATOR;

    @pmi0("items")
    public static final GroupsSetGroupSettingsMarketViewTypeDto ITEMS;

    @pmi0("items_and_albums")
    public static final GroupsSetGroupSettingsMarketViewTypeDto ITEMS_AND_ALBUMS;
    private final String value;

    /* compiled from: GroupsSetGroupSettingsMarketViewTypeDto.kt */
    public static final class a implements Parcelable.Creator<GroupsSetGroupSettingsMarketViewTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsSetGroupSettingsMarketViewTypeDto createFromParcel(Parcel parcel) {
            return GroupsSetGroupSettingsMarketViewTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsSetGroupSettingsMarketViewTypeDto[] newArray(int i) {
            return new GroupsSetGroupSettingsMarketViewTypeDto[i];
        }
    }

    static {
        GroupsSetGroupSettingsMarketViewTypeDto groupsSetGroupSettingsMarketViewTypeDto = new GroupsSetGroupSettingsMarketViewTypeDto("ALBUMS", 0, "albums");
        ALBUMS = groupsSetGroupSettingsMarketViewTypeDto;
        GroupsSetGroupSettingsMarketViewTypeDto groupsSetGroupSettingsMarketViewTypeDto2 = new GroupsSetGroupSettingsMarketViewTypeDto("ITEMS", 1, "items");
        ITEMS = groupsSetGroupSettingsMarketViewTypeDto2;
        GroupsSetGroupSettingsMarketViewTypeDto groupsSetGroupSettingsMarketViewTypeDto3 = new GroupsSetGroupSettingsMarketViewTypeDto("ITEMS_AND_ALBUMS", 2, "items_and_albums");
        ITEMS_AND_ALBUMS = groupsSetGroupSettingsMarketViewTypeDto3;
        GroupsSetGroupSettingsMarketViewTypeDto[] groupsSetGroupSettingsMarketViewTypeDtoArr = {groupsSetGroupSettingsMarketViewTypeDto, groupsSetGroupSettingsMarketViewTypeDto2, groupsSetGroupSettingsMarketViewTypeDto3};
        $VALUES = groupsSetGroupSettingsMarketViewTypeDtoArr;
        $ENTRIES = new asp(groupsSetGroupSettingsMarketViewTypeDtoArr);
        CREATOR = new a();
    }

    private GroupsSetGroupSettingsMarketViewTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsSetGroupSettingsMarketViewTypeDto valueOf(String str) {
        return (GroupsSetGroupSettingsMarketViewTypeDto) Enum.valueOf(GroupsSetGroupSettingsMarketViewTypeDto.class, str);
    }

    public static GroupsSetGroupSettingsMarketViewTypeDto[] values() {
        return (GroupsSetGroupSettingsMarketViewTypeDto[]) $VALUES.clone();
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
