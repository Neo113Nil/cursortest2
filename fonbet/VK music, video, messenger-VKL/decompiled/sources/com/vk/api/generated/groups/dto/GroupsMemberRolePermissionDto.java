package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.b;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsMemberRolePermissionDto.kt */
/* loaded from: classes14.dex */
public final class GroupsMemberRolePermissionDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsMemberRolePermissionDto[] $VALUES;

    @pmi0(b.JSON_KEY_ADS)
    public static final GroupsMemberRolePermissionDto ADS;
    public static final Parcelable.Creator<GroupsMemberRolePermissionDto> CREATOR;
    private final String value;

    /* compiled from: GroupsMemberRolePermissionDto.kt */
    public static final class a implements Parcelable.Creator<GroupsMemberRolePermissionDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsMemberRolePermissionDto createFromParcel(Parcel parcel) {
            return GroupsMemberRolePermissionDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsMemberRolePermissionDto[] newArray(int i) {
            return new GroupsMemberRolePermissionDto[i];
        }
    }

    static {
        GroupsMemberRolePermissionDto groupsMemberRolePermissionDto = new GroupsMemberRolePermissionDto("ADS", 0, b.JSON_KEY_ADS);
        ADS = groupsMemberRolePermissionDto;
        GroupsMemberRolePermissionDto[] groupsMemberRolePermissionDtoArr = {groupsMemberRolePermissionDto};
        $VALUES = groupsMemberRolePermissionDtoArr;
        $ENTRIES = new asp(groupsMemberRolePermissionDtoArr);
        CREATOR = new a();
    }

    private GroupsMemberRolePermissionDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsMemberRolePermissionDto valueOf(String str) {
        return (GroupsMemberRolePermissionDto) Enum.valueOf(GroupsMemberRolePermissionDto.class, str);
    }

    public static GroupsMemberRolePermissionDto[] values() {
        return (GroupsMemberRolePermissionDto[]) $VALUES.clone();
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
