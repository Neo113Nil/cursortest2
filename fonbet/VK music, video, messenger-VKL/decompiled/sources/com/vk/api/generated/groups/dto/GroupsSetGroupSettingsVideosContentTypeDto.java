package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsSetGroupSettingsVideosContentTypeDto.kt */
/* loaded from: classes14.dex */
public final class GroupsSetGroupSettingsVideosContentTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsSetGroupSettingsVideosContentTypeDto[] $VALUES;

    @pmi0("albums")
    public static final GroupsSetGroupSettingsVideosContentTypeDto ALBUMS;
    public static final Parcelable.Creator<GroupsSetGroupSettingsVideosContentTypeDto> CREATOR;

    @pmi0("items")
    public static final GroupsSetGroupSettingsVideosContentTypeDto ITEMS;

    @pmi0("items_and_albums")
    public static final GroupsSetGroupSettingsVideosContentTypeDto ITEMS_AND_ALBUMS;
    private final String value;

    /* compiled from: GroupsSetGroupSettingsVideosContentTypeDto.kt */
    public static final class a implements Parcelable.Creator<GroupsSetGroupSettingsVideosContentTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsSetGroupSettingsVideosContentTypeDto createFromParcel(Parcel parcel) {
            return GroupsSetGroupSettingsVideosContentTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsSetGroupSettingsVideosContentTypeDto[] newArray(int i) {
            return new GroupsSetGroupSettingsVideosContentTypeDto[i];
        }
    }

    static {
        GroupsSetGroupSettingsVideosContentTypeDto groupsSetGroupSettingsVideosContentTypeDto = new GroupsSetGroupSettingsVideosContentTypeDto("ALBUMS", 0, "albums");
        ALBUMS = groupsSetGroupSettingsVideosContentTypeDto;
        GroupsSetGroupSettingsVideosContentTypeDto groupsSetGroupSettingsVideosContentTypeDto2 = new GroupsSetGroupSettingsVideosContentTypeDto("ITEMS", 1, "items");
        ITEMS = groupsSetGroupSettingsVideosContentTypeDto2;
        GroupsSetGroupSettingsVideosContentTypeDto groupsSetGroupSettingsVideosContentTypeDto3 = new GroupsSetGroupSettingsVideosContentTypeDto("ITEMS_AND_ALBUMS", 2, "items_and_albums");
        ITEMS_AND_ALBUMS = groupsSetGroupSettingsVideosContentTypeDto3;
        GroupsSetGroupSettingsVideosContentTypeDto[] groupsSetGroupSettingsVideosContentTypeDtoArr = {groupsSetGroupSettingsVideosContentTypeDto, groupsSetGroupSettingsVideosContentTypeDto2, groupsSetGroupSettingsVideosContentTypeDto3};
        $VALUES = groupsSetGroupSettingsVideosContentTypeDtoArr;
        $ENTRIES = new asp(groupsSetGroupSettingsVideosContentTypeDtoArr);
        CREATOR = new a();
    }

    private GroupsSetGroupSettingsVideosContentTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsSetGroupSettingsVideosContentTypeDto valueOf(String str) {
        return (GroupsSetGroupSettingsVideosContentTypeDto) Enum.valueOf(GroupsSetGroupSettingsVideosContentTypeDto.class, str);
    }

    public static GroupsSetGroupSettingsVideosContentTypeDto[] values() {
        return (GroupsSetGroupSettingsVideosContentTypeDto[]) $VALUES.clone();
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
