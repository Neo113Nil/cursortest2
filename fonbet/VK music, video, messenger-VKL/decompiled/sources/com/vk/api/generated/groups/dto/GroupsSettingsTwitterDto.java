package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GroupsSettingsTwitterDto.kt */
/* loaded from: classes14.dex */
public final class GroupsSettingsTwitterDto implements Parcelable {
    public static final Parcelable.Creator<GroupsSettingsTwitterDto> CREATOR = new a();

    @pmi0("name")
    private final String name;

    @pmi0("status")
    private final StatusDto status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupsSettingsTwitterDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0("loading")
        public static final StatusDto LOADING;

        @pmi0("sync")
        public static final StatusDto SYNC;
        private final String value;

        /* compiled from: GroupsSettingsTwitterDto.kt */
        public static final class a implements Parcelable.Creator<StatusDto> {
            @Override // android.os.Parcelable.Creator
            public final StatusDto createFromParcel(Parcel parcel) {
                return StatusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StatusDto[] newArray(int i) {
                return new StatusDto[i];
            }
        }

        static {
            StatusDto statusDto = new StatusDto("LOADING", 0, "loading");
            LOADING = statusDto;
            StatusDto statusDto2 = new StatusDto("SYNC", 1, "sync");
            SYNC = statusDto2;
            StatusDto[] statusDtoArr = {statusDto, statusDto2};
            $VALUES = statusDtoArr;
            $ENTRIES = new asp(statusDtoArr);
            CREATOR = new a();
        }

        private StatusDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static StatusDto valueOf(String str) {
            return (StatusDto) Enum.valueOf(StatusDto.class, str);
        }

        public static StatusDto[] values() {
            return (StatusDto[]) $VALUES.clone();
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

    /* compiled from: GroupsSettingsTwitterDto.kt */
    public static final class a implements Parcelable.Creator<GroupsSettingsTwitterDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsSettingsTwitterDto createFromParcel(Parcel parcel) {
            return new GroupsSettingsTwitterDto(StatusDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsSettingsTwitterDto[] newArray(int i) {
            return new GroupsSettingsTwitterDto[i];
        }
    }

    public GroupsSettingsTwitterDto(StatusDto statusDto, String str) {
        this.status = statusDto;
        this.name = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsSettingsTwitterDto)) {
            return false;
        }
        GroupsSettingsTwitterDto groupsSettingsTwitterDto = (GroupsSettingsTwitterDto) obj;
        return this.status == groupsSettingsTwitterDto.status && epx.f(this.name, groupsSettingsTwitterDto.name);
    }

    public final int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        String str = this.name;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsSettingsTwitterDto(status=");
        sb.append(this.status);
        sb.append(", name=");
        return ho8.a(sb, this.name, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.status.writeToParcel(parcel, i);
        parcel.writeString(this.name);
    }

    public /* synthetic */ GroupsSettingsTwitterDto(StatusDto statusDto, String str, int i, zcl zclVar) {
        this(statusDto, (i & 2) != 0 ? null : str);
    }
}
