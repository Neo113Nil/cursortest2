package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsTabContentTypesDto.kt */
/* loaded from: classes14.dex */
public final class GroupsTabContentTypesDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsTabContentTypesDto[] $VALUES;

    @pmi0("albums")
    public static final GroupsTabContentTypesDto ALBUMS;
    public static final Parcelable.Creator<GroupsTabContentTypesDto> CREATOR;

    @pmi0("items")
    public static final GroupsTabContentTypesDto ITEMS;

    @pmi0("playlists")
    public static final GroupsTabContentTypesDto PLAYLISTS;
    private final String value;

    /* compiled from: GroupsTabContentTypesDto.kt */
    public static final class a implements Parcelable.Creator<GroupsTabContentTypesDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsTabContentTypesDto createFromParcel(Parcel parcel) {
            return GroupsTabContentTypesDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsTabContentTypesDto[] newArray(int i) {
            return new GroupsTabContentTypesDto[i];
        }
    }

    static {
        GroupsTabContentTypesDto groupsTabContentTypesDto = new GroupsTabContentTypesDto("ITEMS", 0, "items");
        ITEMS = groupsTabContentTypesDto;
        GroupsTabContentTypesDto groupsTabContentTypesDto2 = new GroupsTabContentTypesDto("ALBUMS", 1, "albums");
        ALBUMS = groupsTabContentTypesDto2;
        GroupsTabContentTypesDto groupsTabContentTypesDto3 = new GroupsTabContentTypesDto("PLAYLISTS", 2, "playlists");
        PLAYLISTS = groupsTabContentTypesDto3;
        GroupsTabContentTypesDto[] groupsTabContentTypesDtoArr = {groupsTabContentTypesDto, groupsTabContentTypesDto2, groupsTabContentTypesDto3};
        $VALUES = groupsTabContentTypesDtoArr;
        $ENTRIES = new asp(groupsTabContentTypesDtoArr);
        CREATOR = new a();
    }

    private GroupsTabContentTypesDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsTabContentTypesDto valueOf(String str) {
        return (GroupsTabContentTypesDto) Enum.valueOf(GroupsTabContentTypesDto.class, str);
    }

    public static GroupsTabContentTypesDto[] values() {
        return (GroupsTabContentTypesDto[]) $VALUES.clone();
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
