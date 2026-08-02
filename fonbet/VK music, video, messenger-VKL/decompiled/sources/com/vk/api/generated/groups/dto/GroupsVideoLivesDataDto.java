package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GroupsVideoLivesDataDto.kt */
/* loaded from: classes14.dex */
public final class GroupsVideoLivesDataDto implements Parcelable {
    public static final Parcelable.Creator<GroupsVideoLivesDataDto> CREATOR = new a();

    @pmi0("badge_type")
    private final BadgeTypeDto badgeType;

    @pmi0("has_badge")
    private final boolean hasBadge;

    @pmi0("has_live_block")
    private final boolean hasLiveBlock;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupsVideoLivesDataDto.kt */
    public static final class BadgeTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BadgeTypeDto[] $VALUES;

        @pmi0("base_live")
        public static final BadgeTypeDto BASE_LIVE;
        public static final Parcelable.Creator<BadgeTypeDto> CREATOR;
        private final String value;

        /* compiled from: GroupsVideoLivesDataDto.kt */
        public static final class a implements Parcelable.Creator<BadgeTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final BadgeTypeDto createFromParcel(Parcel parcel) {
                return BadgeTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final BadgeTypeDto[] newArray(int i) {
                return new BadgeTypeDto[i];
            }
        }

        static {
            BadgeTypeDto badgeTypeDto = new BadgeTypeDto("BASE_LIVE", 0, "base_live");
            BASE_LIVE = badgeTypeDto;
            BadgeTypeDto[] badgeTypeDtoArr = {badgeTypeDto};
            $VALUES = badgeTypeDtoArr;
            $ENTRIES = new asp(badgeTypeDtoArr);
            CREATOR = new a();
        }

        private BadgeTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static BadgeTypeDto valueOf(String str) {
            return (BadgeTypeDto) Enum.valueOf(BadgeTypeDto.class, str);
        }

        public static BadgeTypeDto[] values() {
            return (BadgeTypeDto[]) $VALUES.clone();
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

    /* compiled from: GroupsVideoLivesDataDto.kt */
    public static final class a implements Parcelable.Creator<GroupsVideoLivesDataDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsVideoLivesDataDto createFromParcel(Parcel parcel) {
            return new GroupsVideoLivesDataDto(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : BadgeTypeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsVideoLivesDataDto[] newArray(int i) {
            return new GroupsVideoLivesDataDto[i];
        }
    }

    public GroupsVideoLivesDataDto(boolean z, boolean z2, BadgeTypeDto badgeTypeDto) {
        this.hasLiveBlock = z;
        this.hasBadge = z2;
        this.badgeType = badgeTypeDto;
    }

    public final BadgeTypeDto d() {
        return this.badgeType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.hasBadge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsVideoLivesDataDto)) {
            return false;
        }
        GroupsVideoLivesDataDto groupsVideoLivesDataDto = (GroupsVideoLivesDataDto) obj;
        return this.hasLiveBlock == groupsVideoLivesDataDto.hasLiveBlock && this.hasBadge == groupsVideoLivesDataDto.hasBadge && this.badgeType == groupsVideoLivesDataDto.badgeType;
    }

    public final int hashCode() {
        int b = qoy.b(Boolean.hashCode(this.hasLiveBlock) * 31, 31, this.hasBadge);
        BadgeTypeDto badgeTypeDto = this.badgeType;
        return b + (badgeTypeDto == null ? 0 : badgeTypeDto.hashCode());
    }

    public final String toString() {
        return "GroupsVideoLivesDataDto(hasLiveBlock=" + this.hasLiveBlock + ", hasBadge=" + this.hasBadge + ", badgeType=" + this.badgeType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.hasLiveBlock ? 1 : 0);
        parcel.writeInt(this.hasBadge ? 1 : 0);
        BadgeTypeDto badgeTypeDto = this.badgeType;
        if (badgeTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            badgeTypeDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GroupsVideoLivesDataDto(boolean z, boolean z2, BadgeTypeDto badgeTypeDto, int i, zcl zclVar) {
        this(z, z2, (i & 4) != 0 ? null : badgeTypeDto);
    }
}
