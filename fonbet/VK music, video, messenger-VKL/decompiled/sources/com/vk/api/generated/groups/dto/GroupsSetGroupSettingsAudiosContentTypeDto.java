package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsSetGroupSettingsAudiosContentTypeDto.kt */
/* loaded from: classes14.dex */
public final class GroupsSetGroupSettingsAudiosContentTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsSetGroupSettingsAudiosContentTypeDto[] $VALUES;

    @pmi0("albums")
    public static final GroupsSetGroupSettingsAudiosContentTypeDto ALBUMS;
    public static final Parcelable.Creator<GroupsSetGroupSettingsAudiosContentTypeDto> CREATOR;

    @pmi0("items")
    public static final GroupsSetGroupSettingsAudiosContentTypeDto ITEMS;

    @pmi0("items_and_albums")
    public static final GroupsSetGroupSettingsAudiosContentTypeDto ITEMS_AND_ALBUMS;
    private final String value;

    /* compiled from: GroupsSetGroupSettingsAudiosContentTypeDto.kt */
    public static final class a implements Parcelable.Creator<GroupsSetGroupSettingsAudiosContentTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsSetGroupSettingsAudiosContentTypeDto createFromParcel(Parcel parcel) {
            return GroupsSetGroupSettingsAudiosContentTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsSetGroupSettingsAudiosContentTypeDto[] newArray(int i) {
            return new GroupsSetGroupSettingsAudiosContentTypeDto[i];
        }
    }

    static {
        GroupsSetGroupSettingsAudiosContentTypeDto groupsSetGroupSettingsAudiosContentTypeDto = new GroupsSetGroupSettingsAudiosContentTypeDto("ALBUMS", 0, "albums");
        ALBUMS = groupsSetGroupSettingsAudiosContentTypeDto;
        GroupsSetGroupSettingsAudiosContentTypeDto groupsSetGroupSettingsAudiosContentTypeDto2 = new GroupsSetGroupSettingsAudiosContentTypeDto("ITEMS", 1, "items");
        ITEMS = groupsSetGroupSettingsAudiosContentTypeDto2;
        GroupsSetGroupSettingsAudiosContentTypeDto groupsSetGroupSettingsAudiosContentTypeDto3 = new GroupsSetGroupSettingsAudiosContentTypeDto("ITEMS_AND_ALBUMS", 2, "items_and_albums");
        ITEMS_AND_ALBUMS = groupsSetGroupSettingsAudiosContentTypeDto3;
        GroupsSetGroupSettingsAudiosContentTypeDto[] groupsSetGroupSettingsAudiosContentTypeDtoArr = {groupsSetGroupSettingsAudiosContentTypeDto, groupsSetGroupSettingsAudiosContentTypeDto2, groupsSetGroupSettingsAudiosContentTypeDto3};
        $VALUES = groupsSetGroupSettingsAudiosContentTypeDtoArr;
        $ENTRIES = new asp(groupsSetGroupSettingsAudiosContentTypeDtoArr);
        CREATOR = new a();
    }

    private GroupsSetGroupSettingsAudiosContentTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsSetGroupSettingsAudiosContentTypeDto valueOf(String str) {
        return (GroupsSetGroupSettingsAudiosContentTypeDto) Enum.valueOf(GroupsSetGroupSettingsAudiosContentTypeDto.class, str);
    }

    public static GroupsSetGroupSettingsAudiosContentTypeDto[] values() {
        return (GroupsSetGroupSettingsAudiosContentTypeDto[]) $VALUES.clone();
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
