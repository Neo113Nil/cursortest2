package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsSetGroupSettingsPhotosContentTypeDto.kt */
/* loaded from: classes14.dex */
public final class GroupsSetGroupSettingsPhotosContentTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsSetGroupSettingsPhotosContentTypeDto[] $VALUES;

    @pmi0("albums")
    public static final GroupsSetGroupSettingsPhotosContentTypeDto ALBUMS;
    public static final Parcelable.Creator<GroupsSetGroupSettingsPhotosContentTypeDto> CREATOR;

    @pmi0("items")
    public static final GroupsSetGroupSettingsPhotosContentTypeDto ITEMS;

    @pmi0("items_and_albums")
    public static final GroupsSetGroupSettingsPhotosContentTypeDto ITEMS_AND_ALBUMS;
    private final String value;

    /* compiled from: GroupsSetGroupSettingsPhotosContentTypeDto.kt */
    public static final class a implements Parcelable.Creator<GroupsSetGroupSettingsPhotosContentTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsSetGroupSettingsPhotosContentTypeDto createFromParcel(Parcel parcel) {
            return GroupsSetGroupSettingsPhotosContentTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsSetGroupSettingsPhotosContentTypeDto[] newArray(int i) {
            return new GroupsSetGroupSettingsPhotosContentTypeDto[i];
        }
    }

    static {
        GroupsSetGroupSettingsPhotosContentTypeDto groupsSetGroupSettingsPhotosContentTypeDto = new GroupsSetGroupSettingsPhotosContentTypeDto("ALBUMS", 0, "albums");
        ALBUMS = groupsSetGroupSettingsPhotosContentTypeDto;
        GroupsSetGroupSettingsPhotosContentTypeDto groupsSetGroupSettingsPhotosContentTypeDto2 = new GroupsSetGroupSettingsPhotosContentTypeDto("ITEMS", 1, "items");
        ITEMS = groupsSetGroupSettingsPhotosContentTypeDto2;
        GroupsSetGroupSettingsPhotosContentTypeDto groupsSetGroupSettingsPhotosContentTypeDto3 = new GroupsSetGroupSettingsPhotosContentTypeDto("ITEMS_AND_ALBUMS", 2, "items_and_albums");
        ITEMS_AND_ALBUMS = groupsSetGroupSettingsPhotosContentTypeDto3;
        GroupsSetGroupSettingsPhotosContentTypeDto[] groupsSetGroupSettingsPhotosContentTypeDtoArr = {groupsSetGroupSettingsPhotosContentTypeDto, groupsSetGroupSettingsPhotosContentTypeDto2, groupsSetGroupSettingsPhotosContentTypeDto3};
        $VALUES = groupsSetGroupSettingsPhotosContentTypeDtoArr;
        $ENTRIES = new asp(groupsSetGroupSettingsPhotosContentTypeDtoArr);
        CREATOR = new a();
    }

    private GroupsSetGroupSettingsPhotosContentTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsSetGroupSettingsPhotosContentTypeDto valueOf(String str) {
        return (GroupsSetGroupSettingsPhotosContentTypeDto) Enum.valueOf(GroupsSetGroupSettingsPhotosContentTypeDto.class, str);
    }

    public static GroupsSetGroupSettingsPhotosContentTypeDto[] values() {
        return (GroupsSetGroupSettingsPhotosContentTypeDto[]) $VALUES.clone();
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
