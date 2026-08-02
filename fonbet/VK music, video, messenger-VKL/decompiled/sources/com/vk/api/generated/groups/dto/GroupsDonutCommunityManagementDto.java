package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.BuildConfig;
import com.vk.api.generated.donut.dto.DonutGroupSettingsDto;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GroupsDonutCommunityManagementDto.kt */
/* loaded from: classes14.dex */
public final class GroupsDonutCommunityManagementDto implements Parcelable {
    public static final Parcelable.Creator<GroupsDonutCommunityManagementDto> CREATOR = new a();

    @pmi0("can_edit")
    private final boolean canEdit;

    @pmi0("settings")
    private final DonutGroupSettingsDto settings;

    @pmi0("unavail_reason")
    private final UnavailReasonDto unavailReason;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupsDonutCommunityManagementDto.kt */
    public static final class UnavailReasonDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ UnavailReasonDto[] $VALUES;

        @pmi0("age_limit")
        public static final UnavailReasonDto AGE_LIMIT;
        public static final Parcelable.Creator<UnavailReasonDto> CREATOR;

        @pmi0(BuildConfig.FLAVOR)
        public static final UnavailReasonDto DEFAULT;

        @pmi0("moderation")
        public static final UnavailReasonDto MODERATION;

        @pmi0("not_main_admin")
        public static final UnavailReasonDto NOT_MAIN_ADMIN;
        private final String value;

        /* compiled from: GroupsDonutCommunityManagementDto.kt */
        public static final class a implements Parcelable.Creator<UnavailReasonDto> {
            @Override // android.os.Parcelable.Creator
            public final UnavailReasonDto createFromParcel(Parcel parcel) {
                return UnavailReasonDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final UnavailReasonDto[] newArray(int i) {
                return new UnavailReasonDto[i];
            }
        }

        static {
            UnavailReasonDto unavailReasonDto = new UnavailReasonDto("AGE_LIMIT", 0, "age_limit");
            AGE_LIMIT = unavailReasonDto;
            UnavailReasonDto unavailReasonDto2 = new UnavailReasonDto("NOT_MAIN_ADMIN", 1, "not_main_admin");
            NOT_MAIN_ADMIN = unavailReasonDto2;
            UnavailReasonDto unavailReasonDto3 = new UnavailReasonDto("MODERATION", 2, "moderation");
            MODERATION = unavailReasonDto3;
            UnavailReasonDto unavailReasonDto4 = new UnavailReasonDto("DEFAULT", 3, BuildConfig.FLAVOR);
            DEFAULT = unavailReasonDto4;
            UnavailReasonDto[] unavailReasonDtoArr = {unavailReasonDto, unavailReasonDto2, unavailReasonDto3, unavailReasonDto4};
            $VALUES = unavailReasonDtoArr;
            $ENTRIES = new asp(unavailReasonDtoArr);
            CREATOR = new a();
        }

        private UnavailReasonDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static UnavailReasonDto valueOf(String str) {
            return (UnavailReasonDto) Enum.valueOf(UnavailReasonDto.class, str);
        }

        public static UnavailReasonDto[] values() {
            return (UnavailReasonDto[]) $VALUES.clone();
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

    /* compiled from: GroupsDonutCommunityManagementDto.kt */
    public static final class a implements Parcelable.Creator<GroupsDonutCommunityManagementDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsDonutCommunityManagementDto createFromParcel(Parcel parcel) {
            return new GroupsDonutCommunityManagementDto(parcel.readInt() != 0, DonutGroupSettingsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UnavailReasonDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsDonutCommunityManagementDto[] newArray(int i) {
            return new GroupsDonutCommunityManagementDto[i];
        }
    }

    public GroupsDonutCommunityManagementDto(boolean z, DonutGroupSettingsDto donutGroupSettingsDto, UnavailReasonDto unavailReasonDto) {
        this.canEdit = z;
        this.settings = donutGroupSettingsDto;
        this.unavailReason = unavailReasonDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsDonutCommunityManagementDto)) {
            return false;
        }
        GroupsDonutCommunityManagementDto groupsDonutCommunityManagementDto = (GroupsDonutCommunityManagementDto) obj;
        return this.canEdit == groupsDonutCommunityManagementDto.canEdit && epx.f(this.settings, groupsDonutCommunityManagementDto.settings) && this.unavailReason == groupsDonutCommunityManagementDto.unavailReason;
    }

    public final int hashCode() {
        int hashCode = (this.settings.hashCode() + (Boolean.hashCode(this.canEdit) * 31)) * 31;
        UnavailReasonDto unavailReasonDto = this.unavailReason;
        return hashCode + (unavailReasonDto == null ? 0 : unavailReasonDto.hashCode());
    }

    public final String toString() {
        return "GroupsDonutCommunityManagementDto(canEdit=" + this.canEdit + ", settings=" + this.settings + ", unavailReason=" + this.unavailReason + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.canEdit ? 1 : 0);
        this.settings.writeToParcel(parcel, i);
        UnavailReasonDto unavailReasonDto = this.unavailReason;
        if (unavailReasonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            unavailReasonDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GroupsDonutCommunityManagementDto(boolean z, DonutGroupSettingsDto donutGroupSettingsDto, UnavailReasonDto unavailReasonDto, int i, zcl zclVar) {
        this(z, donutGroupSettingsDto, (i & 4) != 0 ? null : unavailReasonDto);
    }
}
