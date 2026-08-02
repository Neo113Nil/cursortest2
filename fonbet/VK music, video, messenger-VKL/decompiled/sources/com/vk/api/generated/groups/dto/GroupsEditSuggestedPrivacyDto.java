package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsEditSuggestedPrivacyDto.kt */
/* loaded from: classes14.dex */
public final class GroupsEditSuggestedPrivacyDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsEditSuggestedPrivacyDto[] $VALUES;
    public static final Parcelable.Creator<GroupsEditSuggestedPrivacyDto> CREATOR;

    @pmi0("0")
    public static final GroupsEditSuggestedPrivacyDto TYPE_0;

    @pmi0("1")
    public static final GroupsEditSuggestedPrivacyDto TYPE_1;

    @pmi0("2")
    public static final GroupsEditSuggestedPrivacyDto TYPE_2;
    private final int value;

    /* compiled from: GroupsEditSuggestedPrivacyDto.kt */
    public static final class a implements Parcelable.Creator<GroupsEditSuggestedPrivacyDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsEditSuggestedPrivacyDto createFromParcel(Parcel parcel) {
            return GroupsEditSuggestedPrivacyDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsEditSuggestedPrivacyDto[] newArray(int i) {
            return new GroupsEditSuggestedPrivacyDto[i];
        }
    }

    static {
        GroupsEditSuggestedPrivacyDto groupsEditSuggestedPrivacyDto = new GroupsEditSuggestedPrivacyDto("TYPE_0", 0, 0);
        TYPE_0 = groupsEditSuggestedPrivacyDto;
        GroupsEditSuggestedPrivacyDto groupsEditSuggestedPrivacyDto2 = new GroupsEditSuggestedPrivacyDto("TYPE_1", 1, 1);
        TYPE_1 = groupsEditSuggestedPrivacyDto2;
        GroupsEditSuggestedPrivacyDto groupsEditSuggestedPrivacyDto3 = new GroupsEditSuggestedPrivacyDto("TYPE_2", 2, 2);
        TYPE_2 = groupsEditSuggestedPrivacyDto3;
        GroupsEditSuggestedPrivacyDto[] groupsEditSuggestedPrivacyDtoArr = {groupsEditSuggestedPrivacyDto, groupsEditSuggestedPrivacyDto2, groupsEditSuggestedPrivacyDto3};
        $VALUES = groupsEditSuggestedPrivacyDtoArr;
        $ENTRIES = new asp(groupsEditSuggestedPrivacyDtoArr);
        CREATOR = new a();
    }

    private GroupsEditSuggestedPrivacyDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GroupsEditSuggestedPrivacyDto valueOf(String str) {
        return (GroupsEditSuggestedPrivacyDto) Enum.valueOf(GroupsEditSuggestedPrivacyDto.class, str);
    }

    public static GroupsEditSuggestedPrivacyDto[] values() {
        return (GroupsEditSuggestedPrivacyDto[]) $VALUES.clone();
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
