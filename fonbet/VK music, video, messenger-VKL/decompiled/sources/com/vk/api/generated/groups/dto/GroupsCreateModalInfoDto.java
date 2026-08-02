package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.BuildConfig;
import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.zrp;

/* compiled from: GroupsCreateModalInfoDto.kt */
/* loaded from: classes14.dex */
public final class GroupsCreateModalInfoDto implements Parcelable {
    public static final Parcelable.Creator<GroupsCreateModalInfoDto> CREATOR = new a();

    @pmi0("dark_images")
    private final GroupsCreateModalInfoImagesDto darkImages;

    @pmi0("group_type")
    private final GroupTypeDto groupType;

    @pmi0("group_vk_bid_modal_enabled")
    private final boolean groupVkBidModalEnabled;

    @pmi0("images")
    private final GroupsCreateModalInfoImagesDto images;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupsCreateModalInfoDto.kt */
    public static final class GroupTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ GroupTypeDto[] $VALUES;
        public static final Parcelable.Creator<GroupTypeDto> CREATOR;

        @pmi0("group")
        public static final GroupTypeDto GROUP;

        @pmi0(BuildConfig.SDK_BUILD_FLAVOR)
        public static final GroupTypeDto PUBLIC;
        private final String value;

        /* compiled from: GroupsCreateModalInfoDto.kt */
        public static final class a implements Parcelable.Creator<GroupTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final GroupTypeDto createFromParcel(Parcel parcel) {
                return GroupTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final GroupTypeDto[] newArray(int i) {
                return new GroupTypeDto[i];
            }
        }

        static {
            GroupTypeDto groupTypeDto = new GroupTypeDto(Privacy.PUBLIC, 0, BuildConfig.SDK_BUILD_FLAVOR);
            PUBLIC = groupTypeDto;
            GroupTypeDto groupTypeDto2 = new GroupTypeDto("GROUP", 1, "group");
            GROUP = groupTypeDto2;
            GroupTypeDto[] groupTypeDtoArr = {groupTypeDto, groupTypeDto2};
            $VALUES = groupTypeDtoArr;
            $ENTRIES = new asp(groupTypeDtoArr);
            CREATOR = new a();
        }

        private GroupTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static GroupTypeDto valueOf(String str) {
            return (GroupTypeDto) Enum.valueOf(GroupTypeDto.class, str);
        }

        public static GroupTypeDto[] values() {
            return (GroupTypeDto[]) $VALUES.clone();
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

    /* compiled from: GroupsCreateModalInfoDto.kt */
    public static final class a implements Parcelable.Creator<GroupsCreateModalInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsCreateModalInfoDto createFromParcel(Parcel parcel) {
            GroupTypeDto createFromParcel = GroupTypeDto.CREATOR.createFromParcel(parcel);
            boolean z = parcel.readInt() != 0;
            Parcelable.Creator<GroupsCreateModalInfoImagesDto> creator = GroupsCreateModalInfoImagesDto.CREATOR;
            return new GroupsCreateModalInfoDto(createFromParcel, z, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsCreateModalInfoDto[] newArray(int i) {
            return new GroupsCreateModalInfoDto[i];
        }
    }

    public GroupsCreateModalInfoDto(GroupTypeDto groupTypeDto, boolean z, GroupsCreateModalInfoImagesDto groupsCreateModalInfoImagesDto, GroupsCreateModalInfoImagesDto groupsCreateModalInfoImagesDto2) {
        this.groupType = groupTypeDto;
        this.groupVkBidModalEnabled = z;
        this.images = groupsCreateModalInfoImagesDto;
        this.darkImages = groupsCreateModalInfoImagesDto2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsCreateModalInfoDto)) {
            return false;
        }
        GroupsCreateModalInfoDto groupsCreateModalInfoDto = (GroupsCreateModalInfoDto) obj;
        return this.groupType == groupsCreateModalInfoDto.groupType && this.groupVkBidModalEnabled == groupsCreateModalInfoDto.groupVkBidModalEnabled && epx.f(this.images, groupsCreateModalInfoDto.images) && epx.f(this.darkImages, groupsCreateModalInfoDto.darkImages);
    }

    public final int hashCode() {
        return this.darkImages.hashCode() + ((this.images.hashCode() + qoy.b(this.groupType.hashCode() * 31, 31, this.groupVkBidModalEnabled)) * 31);
    }

    public final String toString() {
        return "GroupsCreateModalInfoDto(groupType=" + this.groupType + ", groupVkBidModalEnabled=" + this.groupVkBidModalEnabled + ", images=" + this.images + ", darkImages=" + this.darkImages + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.groupType.writeToParcel(parcel, i);
        parcel.writeInt(this.groupVkBidModalEnabled ? 1 : 0);
        this.images.writeToParcel(parcel, i);
        this.darkImages.writeToParcel(parcel, i);
    }
}
