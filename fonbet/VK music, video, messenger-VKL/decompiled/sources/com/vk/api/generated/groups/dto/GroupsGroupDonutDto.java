package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GroupsGroupDonutDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupDonutDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGroupDonutDto> CREATOR = new a();

    @pmi0("active_levels_count")
    private final int activeLevelsCount;

    @pmi0("description")
    private final GroupsGroupDonutDescriptionDto description;

    @pmi0("is_don")
    private final boolean isDon;

    @pmi0("payment_link")
    private final BaseLinkButtonActionDto paymentLink;

    @pmi0("status")
    private final StatusDto status;

    @pmi0("wall")
    private final GroupsGroupDonutWallDto wall;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupsGroupDonutDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;

        @pmi0(SignalingProtocol.KEY_ACTIVE)
        public static final StatusDto ACTIVE;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0("expiring")
        public static final StatusDto EXPIRING;
        private final String value;

        /* compiled from: GroupsGroupDonutDto.kt */
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
            StatusDto statusDto = new StatusDto(SignalingProtocol.STATE_ACTIVE, 0, SignalingProtocol.KEY_ACTIVE);
            ACTIVE = statusDto;
            StatusDto statusDto2 = new StatusDto("EXPIRING", 1, "expiring");
            EXPIRING = statusDto2;
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

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: GroupsGroupDonutDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupDonutDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupDonutDto createFromParcel(Parcel parcel) {
            return new GroupsGroupDonutDto(parcel.readInt() != 0, GroupsGroupDonutWallDto.CREATOR.createFromParcel(parcel), parcel.readInt(), (GroupsGroupDonutDescriptionDto) parcel.readParcelable(GroupsGroupDonutDto.class.getClassLoader()), parcel.readInt() == 0 ? null : StatusDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BaseLinkButtonActionDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupDonutDto[] newArray(int i) {
            return new GroupsGroupDonutDto[i];
        }
    }

    public GroupsGroupDonutDto(boolean z, GroupsGroupDonutWallDto groupsGroupDonutWallDto, int i, GroupsGroupDonutDescriptionDto groupsGroupDonutDescriptionDto, StatusDto statusDto, BaseLinkButtonActionDto baseLinkButtonActionDto) {
        this.isDon = z;
        this.wall = groupsGroupDonutWallDto;
        this.activeLevelsCount = i;
        this.description = groupsGroupDonutDescriptionDto;
        this.status = statusDto;
        this.paymentLink = baseLinkButtonActionDto;
    }

    public final int d() {
        return this.activeLevelsCount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final GroupsGroupDonutDescriptionDto e() {
        return this.description;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupDonutDto)) {
            return false;
        }
        GroupsGroupDonutDto groupsGroupDonutDto = (GroupsGroupDonutDto) obj;
        return this.isDon == groupsGroupDonutDto.isDon && epx.f(this.wall, groupsGroupDonutDto.wall) && this.activeLevelsCount == groupsGroupDonutDto.activeLevelsCount && epx.f(this.description, groupsGroupDonutDto.description) && this.status == groupsGroupDonutDto.status && epx.f(this.paymentLink, groupsGroupDonutDto.paymentLink);
    }

    public final BaseLinkButtonActionDto f() {
        return this.paymentLink;
    }

    public final StatusDto g() {
        return this.status;
    }

    public final int hashCode() {
        int a2 = shy.a(this.activeLevelsCount, (this.wall.hashCode() + (Boolean.hashCode(this.isDon) * 31)) * 31, 31);
        GroupsGroupDonutDescriptionDto groupsGroupDonutDescriptionDto = this.description;
        int hashCode = (a2 + (groupsGroupDonutDescriptionDto == null ? 0 : groupsGroupDonutDescriptionDto.hashCode())) * 31;
        StatusDto statusDto = this.status;
        int hashCode2 = (hashCode + (statusDto == null ? 0 : statusDto.hashCode())) * 31;
        BaseLinkButtonActionDto baseLinkButtonActionDto = this.paymentLink;
        return hashCode2 + (baseLinkButtonActionDto != null ? baseLinkButtonActionDto.hashCode() : 0);
    }

    public final GroupsGroupDonutWallDto i() {
        return this.wall;
    }

    public final boolean j() {
        return this.isDon;
    }

    public final String toString() {
        return "GroupsGroupDonutDto(isDon=" + this.isDon + ", wall=" + this.wall + ", activeLevelsCount=" + this.activeLevelsCount + ", description=" + this.description + ", status=" + this.status + ", paymentLink=" + this.paymentLink + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isDon ? 1 : 0);
        this.wall.writeToParcel(parcel, i);
        parcel.writeInt(this.activeLevelsCount);
        parcel.writeParcelable(this.description, i);
        StatusDto statusDto = this.status;
        if (statusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            statusDto.writeToParcel(parcel, i);
        }
        BaseLinkButtonActionDto baseLinkButtonActionDto = this.paymentLink;
        if (baseLinkButtonActionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLinkButtonActionDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GroupsGroupDonutDto(boolean z, GroupsGroupDonutWallDto groupsGroupDonutWallDto, int i, GroupsGroupDonutDescriptionDto groupsGroupDonutDescriptionDto, StatusDto statusDto, BaseLinkButtonActionDto baseLinkButtonActionDto, int i2, zcl zclVar) {
        this(z, groupsGroupDonutWallDto, i, (i2 & 8) != 0 ? null : groupsGroupDonutDescriptionDto, (i2 & 16) != 0 ? null : statusDto, (i2 & 32) != 0 ? null : baseLinkButtonActionDto);
    }
}
