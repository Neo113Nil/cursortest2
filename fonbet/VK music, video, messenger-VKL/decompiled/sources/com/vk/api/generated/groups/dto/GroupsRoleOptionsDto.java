package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsRoleOptionsDto.kt */
/* loaded from: classes14.dex */
public final class GroupsRoleOptionsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsRoleOptionsDto[] $VALUES;

    @pmi0("administrator")
    public static final GroupsRoleOptionsDto ADMINISTRATOR;
    public static final Parcelable.Creator<GroupsRoleOptionsDto> CREATOR;

    /* renamed from: CREATOR, reason: collision with other field name */
    @pmi0("creator")
    public static final GroupsRoleOptionsDto f4CREATOR;

    @pmi0("editor")
    public static final GroupsRoleOptionsDto EDITOR;

    @pmi0("moderator")
    public static final GroupsRoleOptionsDto MODERATOR;
    private final String value;

    /* compiled from: GroupsRoleOptionsDto.kt */
    public static final class a implements Parcelable.Creator<GroupsRoleOptionsDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsRoleOptionsDto createFromParcel(Parcel parcel) {
            return GroupsRoleOptionsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsRoleOptionsDto[] newArray(int i) {
            return new GroupsRoleOptionsDto[i];
        }
    }

    static {
        GroupsRoleOptionsDto groupsRoleOptionsDto = new GroupsRoleOptionsDto("MODERATOR", 0, "moderator");
        MODERATOR = groupsRoleOptionsDto;
        GroupsRoleOptionsDto groupsRoleOptionsDto2 = new GroupsRoleOptionsDto("EDITOR", 1, "editor");
        EDITOR = groupsRoleOptionsDto2;
        GroupsRoleOptionsDto groupsRoleOptionsDto3 = new GroupsRoleOptionsDto("ADMINISTRATOR", 2, "administrator");
        ADMINISTRATOR = groupsRoleOptionsDto3;
        GroupsRoleOptionsDto groupsRoleOptionsDto4 = new GroupsRoleOptionsDto(SignalingProtocol.KEY_ROLE_CREATOR, 3, "creator");
        f4CREATOR = groupsRoleOptionsDto4;
        GroupsRoleOptionsDto[] groupsRoleOptionsDtoArr = {groupsRoleOptionsDto, groupsRoleOptionsDto2, groupsRoleOptionsDto3, groupsRoleOptionsDto4};
        $VALUES = groupsRoleOptionsDtoArr;
        $ENTRIES = new asp(groupsRoleOptionsDtoArr);
        CREATOR = new a();
    }

    private GroupsRoleOptionsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsRoleOptionsDto valueOf(String str) {
        return (GroupsRoleOptionsDto) Enum.valueOf(GroupsRoleOptionsDto.class, str);
    }

    public static GroupsRoleOptionsDto[] values() {
        return (GroupsRoleOptionsDto[]) $VALUES.clone();
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
