package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.BuildConfig;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGetSuggestionsBlockTypeDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGetSuggestionsBlockTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGetSuggestionsBlockTypeDto[] $VALUES;
    public static final Parcelable.Creator<GroupsGetSuggestionsBlockTypeDto> CREATOR;

    @pmi0(BuildConfig.FLAVOR)
    public static final GroupsGetSuggestionsBlockTypeDto DEFAULT;

    @pmi0("inline")
    public static final GroupsGetSuggestionsBlockTypeDto INLINE;
    private final String value;

    /* compiled from: GroupsGetSuggestionsBlockTypeDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGetSuggestionsBlockTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGetSuggestionsBlockTypeDto createFromParcel(Parcel parcel) {
            return GroupsGetSuggestionsBlockTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGetSuggestionsBlockTypeDto[] newArray(int i) {
            return new GroupsGetSuggestionsBlockTypeDto[i];
        }
    }

    static {
        GroupsGetSuggestionsBlockTypeDto groupsGetSuggestionsBlockTypeDto = new GroupsGetSuggestionsBlockTypeDto("DEFAULT", 0, BuildConfig.FLAVOR);
        DEFAULT = groupsGetSuggestionsBlockTypeDto;
        GroupsGetSuggestionsBlockTypeDto groupsGetSuggestionsBlockTypeDto2 = new GroupsGetSuggestionsBlockTypeDto("INLINE", 1, "inline");
        INLINE = groupsGetSuggestionsBlockTypeDto2;
        GroupsGetSuggestionsBlockTypeDto[] groupsGetSuggestionsBlockTypeDtoArr = {groupsGetSuggestionsBlockTypeDto, groupsGetSuggestionsBlockTypeDto2};
        $VALUES = groupsGetSuggestionsBlockTypeDtoArr;
        $ENTRIES = new asp(groupsGetSuggestionsBlockTypeDtoArr);
        CREATOR = new a();
    }

    private GroupsGetSuggestionsBlockTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsGetSuggestionsBlockTypeDto valueOf(String str) {
        return (GroupsGetSuggestionsBlockTypeDto) Enum.valueOf(GroupsGetSuggestionsBlockTypeDto.class, str);
    }

    public static GroupsGetSuggestionsBlockTypeDto[] values() {
        return (GroupsGetSuggestionsBlockTypeDto[]) $VALUES.clone();
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
