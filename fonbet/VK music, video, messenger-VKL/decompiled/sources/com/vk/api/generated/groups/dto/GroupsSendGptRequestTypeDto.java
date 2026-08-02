package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsSendGptRequestTypeDto.kt */
/* loaded from: classes14.dex */
public final class GroupsSendGptRequestTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsSendGptRequestTypeDto[] $VALUES;

    @pmi0("community_description")
    public static final GroupsSendGptRequestTypeDto COMMUNITY_DESCRIPTION;

    @pmi0("community_post")
    public static final GroupsSendGptRequestTypeDto COMMUNITY_POST;
    public static final Parcelable.Creator<GroupsSendGptRequestTypeDto> CREATOR;
    private final String value;

    /* compiled from: GroupsSendGptRequestTypeDto.kt */
    public static final class a implements Parcelable.Creator<GroupsSendGptRequestTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsSendGptRequestTypeDto createFromParcel(Parcel parcel) {
            return GroupsSendGptRequestTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsSendGptRequestTypeDto[] newArray(int i) {
            return new GroupsSendGptRequestTypeDto[i];
        }
    }

    static {
        GroupsSendGptRequestTypeDto groupsSendGptRequestTypeDto = new GroupsSendGptRequestTypeDto("COMMUNITY_DESCRIPTION", 0, "community_description");
        COMMUNITY_DESCRIPTION = groupsSendGptRequestTypeDto;
        GroupsSendGptRequestTypeDto groupsSendGptRequestTypeDto2 = new GroupsSendGptRequestTypeDto("COMMUNITY_POST", 1, "community_post");
        COMMUNITY_POST = groupsSendGptRequestTypeDto2;
        GroupsSendGptRequestTypeDto[] groupsSendGptRequestTypeDtoArr = {groupsSendGptRequestTypeDto, groupsSendGptRequestTypeDto2};
        $VALUES = groupsSendGptRequestTypeDtoArr;
        $ENTRIES = new asp(groupsSendGptRequestTypeDtoArr);
        CREATOR = new a();
    }

    private GroupsSendGptRequestTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsSendGptRequestTypeDto valueOf(String str) {
        return (GroupsSendGptRequestTypeDto) Enum.valueOf(GroupsSendGptRequestTypeDto.class, str);
    }

    public static GroupsSendGptRequestTypeDto[] values() {
        return (GroupsSendGptRequestTypeDto[]) $VALUES.clone();
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
