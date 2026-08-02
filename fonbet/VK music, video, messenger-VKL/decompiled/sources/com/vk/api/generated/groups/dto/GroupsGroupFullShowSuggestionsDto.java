package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGroupFullShowSuggestionsDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupFullShowSuggestionsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGroupFullShowSuggestionsDto[] $VALUES;

    @pmi0("after_subscribe")
    public static final GroupsGroupFullShowSuggestionsDto AFTER_SUBSCRIBE;

    @pmi0("always")
    public static final GroupsGroupFullShowSuggestionsDto ALWAYS;
    public static final Parcelable.Creator<GroupsGroupFullShowSuggestionsDto> CREATOR;

    @pmi0("never")
    public static final GroupsGroupFullShowSuggestionsDto NEVER;
    private final String value;

    /* compiled from: GroupsGroupFullShowSuggestionsDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupFullShowSuggestionsDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupFullShowSuggestionsDto createFromParcel(Parcel parcel) {
            return GroupsGroupFullShowSuggestionsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupFullShowSuggestionsDto[] newArray(int i) {
            return new GroupsGroupFullShowSuggestionsDto[i];
        }
    }

    static {
        GroupsGroupFullShowSuggestionsDto groupsGroupFullShowSuggestionsDto = new GroupsGroupFullShowSuggestionsDto("AFTER_SUBSCRIBE", 0, "after_subscribe");
        AFTER_SUBSCRIBE = groupsGroupFullShowSuggestionsDto;
        GroupsGroupFullShowSuggestionsDto groupsGroupFullShowSuggestionsDto2 = new GroupsGroupFullShowSuggestionsDto("ALWAYS", 1, "always");
        ALWAYS = groupsGroupFullShowSuggestionsDto2;
        GroupsGroupFullShowSuggestionsDto groupsGroupFullShowSuggestionsDto3 = new GroupsGroupFullShowSuggestionsDto("NEVER", 2, "never");
        NEVER = groupsGroupFullShowSuggestionsDto3;
        GroupsGroupFullShowSuggestionsDto[] groupsGroupFullShowSuggestionsDtoArr = {groupsGroupFullShowSuggestionsDto, groupsGroupFullShowSuggestionsDto2, groupsGroupFullShowSuggestionsDto3};
        $VALUES = groupsGroupFullShowSuggestionsDtoArr;
        $ENTRIES = new asp(groupsGroupFullShowSuggestionsDtoArr);
        CREATOR = new a();
    }

    private GroupsGroupFullShowSuggestionsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsGroupFullShowSuggestionsDto valueOf(String str) {
        return (GroupsGroupFullShowSuggestionsDto) Enum.valueOf(GroupsGroupFullShowSuggestionsDto.class, str);
    }

    public static GroupsGroupFullShowSuggestionsDto[] values() {
        return (GroupsGroupFullShowSuggestionsDto[]) $VALUES.clone();
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
