package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.Privacy;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGetMembersFilterDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGetMembersFilterDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGetMembersFilterDto[] $VALUES;
    public static final Parcelable.Creator<GroupsGetMembersFilterDto> CREATOR;

    /* renamed from: CREATOR, reason: collision with other field name */
    @pmi0("creator")
    public static final GroupsGetMembersFilterDto f3CREATOR;

    @pmi0("donut")
    public static final GroupsGetMembersFilterDto DONUT;

    @pmi0("friends")
    public static final GroupsGetMembersFilterDto FRIENDS;

    @pmi0("invites")
    public static final GroupsGetMembersFilterDto INVITES;

    @pmi0("managers")
    public static final GroupsGetMembersFilterDto MANAGERS;

    @pmi0("unsure")
    public static final GroupsGetMembersFilterDto UNSURE;

    @pmi0("unsure_friends")
    public static final GroupsGetMembersFilterDto UNSURE_FRIENDS;
    private final String value;

    /* compiled from: GroupsGetMembersFilterDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGetMembersFilterDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGetMembersFilterDto createFromParcel(Parcel parcel) {
            return GroupsGetMembersFilterDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGetMembersFilterDto[] newArray(int i) {
            return new GroupsGetMembersFilterDto[i];
        }
    }

    static {
        GroupsGetMembersFilterDto groupsGetMembersFilterDto = new GroupsGetMembersFilterDto(SignalingProtocol.KEY_ROLE_CREATOR, 0, "creator");
        f3CREATOR = groupsGetMembersFilterDto;
        GroupsGetMembersFilterDto groupsGetMembersFilterDto2 = new GroupsGetMembersFilterDto("DONUT", 1, "donut");
        DONUT = groupsGetMembersFilterDto2;
        GroupsGetMembersFilterDto groupsGetMembersFilterDto3 = new GroupsGetMembersFilterDto(Privacy.FRIENDS, 2, "friends");
        FRIENDS = groupsGetMembersFilterDto3;
        GroupsGetMembersFilterDto groupsGetMembersFilterDto4 = new GroupsGetMembersFilterDto("INVITES", 3, "invites");
        INVITES = groupsGetMembersFilterDto4;
        GroupsGetMembersFilterDto groupsGetMembersFilterDto5 = new GroupsGetMembersFilterDto("MANAGERS", 4, "managers");
        MANAGERS = groupsGetMembersFilterDto5;
        GroupsGetMembersFilterDto groupsGetMembersFilterDto6 = new GroupsGetMembersFilterDto("UNSURE", 5, "unsure");
        UNSURE = groupsGetMembersFilterDto6;
        GroupsGetMembersFilterDto groupsGetMembersFilterDto7 = new GroupsGetMembersFilterDto("UNSURE_FRIENDS", 6, "unsure_friends");
        UNSURE_FRIENDS = groupsGetMembersFilterDto7;
        GroupsGetMembersFilterDto[] groupsGetMembersFilterDtoArr = {groupsGetMembersFilterDto, groupsGetMembersFilterDto2, groupsGetMembersFilterDto3, groupsGetMembersFilterDto4, groupsGetMembersFilterDto5, groupsGetMembersFilterDto6, groupsGetMembersFilterDto7};
        $VALUES = groupsGetMembersFilterDtoArr;
        $ENTRIES = new asp(groupsGetMembersFilterDtoArr);
        CREATOR = new a();
    }

    private GroupsGetMembersFilterDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsGetMembersFilterDto valueOf(String str) {
        return (GroupsGetMembersFilterDto) Enum.valueOf(GroupsGetMembersFilterDto.class, str);
    }

    public static GroupsGetMembersFilterDto[] values() {
        return (GroupsGetMembersFilterDto[]) $VALUES.clone();
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
