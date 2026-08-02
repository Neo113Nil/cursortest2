package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsUpdateCreationOnboardingActionDto.kt */
/* loaded from: classes14.dex */
public final class GroupsUpdateCreationOnboardingActionDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsUpdateCreationOnboardingActionDto[] $VALUES;

    @pmi0("close_onboarding")
    public static final GroupsUpdateCreationOnboardingActionDto CLOSE_ONBOARDING;

    @pmi0("close_screen")
    public static final GroupsUpdateCreationOnboardingActionDto CLOSE_SCREEN;
    public static final Parcelable.Creator<GroupsUpdateCreationOnboardingActionDto> CREATOR;
    private final String value;

    /* compiled from: GroupsUpdateCreationOnboardingActionDto.kt */
    public static final class a implements Parcelable.Creator<GroupsUpdateCreationOnboardingActionDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsUpdateCreationOnboardingActionDto createFromParcel(Parcel parcel) {
            return GroupsUpdateCreationOnboardingActionDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsUpdateCreationOnboardingActionDto[] newArray(int i) {
            return new GroupsUpdateCreationOnboardingActionDto[i];
        }
    }

    static {
        GroupsUpdateCreationOnboardingActionDto groupsUpdateCreationOnboardingActionDto = new GroupsUpdateCreationOnboardingActionDto("CLOSE_ONBOARDING", 0, "close_onboarding");
        CLOSE_ONBOARDING = groupsUpdateCreationOnboardingActionDto;
        GroupsUpdateCreationOnboardingActionDto groupsUpdateCreationOnboardingActionDto2 = new GroupsUpdateCreationOnboardingActionDto("CLOSE_SCREEN", 1, "close_screen");
        CLOSE_SCREEN = groupsUpdateCreationOnboardingActionDto2;
        GroupsUpdateCreationOnboardingActionDto[] groupsUpdateCreationOnboardingActionDtoArr = {groupsUpdateCreationOnboardingActionDto, groupsUpdateCreationOnboardingActionDto2};
        $VALUES = groupsUpdateCreationOnboardingActionDtoArr;
        $ENTRIES = new asp(groupsUpdateCreationOnboardingActionDtoArr);
        CREATOR = new a();
    }

    private GroupsUpdateCreationOnboardingActionDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsUpdateCreationOnboardingActionDto valueOf(String str) {
        return (GroupsUpdateCreationOnboardingActionDto) Enum.valueOf(GroupsUpdateCreationOnboardingActionDto.class, str);
    }

    public static GroupsUpdateCreationOnboardingActionDto[] values() {
        return (GroupsUpdateCreationOnboardingActionDto[]) $VALUES.clone();
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
