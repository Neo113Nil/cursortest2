package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullMemberStatusDto;
import com.vk.api.generated.groups.dto.GroupsGroupIsClosedDto;
import com.vk.api.generated.groups.dto.GroupsGroupTypeDto;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SuperAppUniversalWidgetActionSubscribeExtraDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetActionSubscribeExtraDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetActionSubscribeExtraDto> CREATOR = new a();

    @pmi0("is_closed")
    private final GroupsGroupIsClosedDto isClosed;

    @pmi0("is_member")
    private final BaseBoolIntDto isMember;

    @pmi0("member_status")
    private final GroupsGroupFullMemberStatusDto memberStatus;

    @pmi0("object_type")
    private final ObjectTypeDto objectType;

    @pmi0("type")
    private final GroupsGroupTypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SuperAppUniversalWidgetActionSubscribeExtraDto.kt */
    public static final class ObjectTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ObjectTypeDto[] $VALUES;
        public static final Parcelable.Creator<ObjectTypeDto> CREATOR;

        @pmi0("group")
        public static final ObjectTypeDto GROUP;
        private final String value;

        /* compiled from: SuperAppUniversalWidgetActionSubscribeExtraDto.kt */
        public static final class a implements Parcelable.Creator<ObjectTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final ObjectTypeDto createFromParcel(Parcel parcel) {
                return ObjectTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ObjectTypeDto[] newArray(int i) {
                return new ObjectTypeDto[i];
            }
        }

        static {
            ObjectTypeDto objectTypeDto = new ObjectTypeDto("GROUP", 0, "group");
            GROUP = objectTypeDto;
            ObjectTypeDto[] objectTypeDtoArr = {objectTypeDto};
            $VALUES = objectTypeDtoArr;
            $ENTRIES = new asp(objectTypeDtoArr);
            CREATOR = new a();
        }

        private ObjectTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ObjectTypeDto valueOf(String str) {
            return (ObjectTypeDto) Enum.valueOf(ObjectTypeDto.class, str);
        }

        public static ObjectTypeDto[] values() {
            return (ObjectTypeDto[]) $VALUES.clone();
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

    /* compiled from: SuperAppUniversalWidgetActionSubscribeExtraDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetActionSubscribeExtraDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetActionSubscribeExtraDto createFromParcel(Parcel parcel) {
            return new SuperAppUniversalWidgetActionSubscribeExtraDto(ObjectTypeDto.CREATOR.createFromParcel(parcel), (GroupsGroupTypeDto) parcel.readParcelable(SuperAppUniversalWidgetActionSubscribeExtraDto.class.getClassLoader()), (BaseBoolIntDto) parcel.readParcelable(SuperAppUniversalWidgetActionSubscribeExtraDto.class.getClassLoader()), (GroupsGroupFullMemberStatusDto) parcel.readParcelable(SuperAppUniversalWidgetActionSubscribeExtraDto.class.getClassLoader()), (GroupsGroupIsClosedDto) parcel.readParcelable(SuperAppUniversalWidgetActionSubscribeExtraDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetActionSubscribeExtraDto[] newArray(int i) {
            return new SuperAppUniversalWidgetActionSubscribeExtraDto[i];
        }
    }

    public SuperAppUniversalWidgetActionSubscribeExtraDto(ObjectTypeDto objectTypeDto, GroupsGroupTypeDto groupsGroupTypeDto, BaseBoolIntDto baseBoolIntDto, GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto, GroupsGroupIsClosedDto groupsGroupIsClosedDto) {
        this.objectType = objectTypeDto;
        this.type = groupsGroupTypeDto;
        this.isMember = baseBoolIntDto;
        this.memberStatus = groupsGroupFullMemberStatusDto;
        this.isClosed = groupsGroupIsClosedDto;
    }

    public final GroupsGroupFullMemberStatusDto d() {
        return this.memberStatus;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ObjectTypeDto e() {
        return this.objectType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppUniversalWidgetActionSubscribeExtraDto)) {
            return false;
        }
        SuperAppUniversalWidgetActionSubscribeExtraDto superAppUniversalWidgetActionSubscribeExtraDto = (SuperAppUniversalWidgetActionSubscribeExtraDto) obj;
        return this.objectType == superAppUniversalWidgetActionSubscribeExtraDto.objectType && this.type == superAppUniversalWidgetActionSubscribeExtraDto.type && this.isMember == superAppUniversalWidgetActionSubscribeExtraDto.isMember && this.memberStatus == superAppUniversalWidgetActionSubscribeExtraDto.memberStatus && this.isClosed == superAppUniversalWidgetActionSubscribeExtraDto.isClosed;
    }

    public final GroupsGroupTypeDto f() {
        return this.type;
    }

    public final GroupsGroupIsClosedDto g() {
        return this.isClosed;
    }

    public final int hashCode() {
        int hashCode = this.objectType.hashCode() * 31;
        GroupsGroupTypeDto groupsGroupTypeDto = this.type;
        int hashCode2 = (hashCode + (groupsGroupTypeDto == null ? 0 : groupsGroupTypeDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.isMember;
        int hashCode3 = (hashCode2 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto = this.memberStatus;
        int hashCode4 = (hashCode3 + (groupsGroupFullMemberStatusDto == null ? 0 : groupsGroupFullMemberStatusDto.hashCode())) * 31;
        GroupsGroupIsClosedDto groupsGroupIsClosedDto = this.isClosed;
        return hashCode4 + (groupsGroupIsClosedDto != null ? groupsGroupIsClosedDto.hashCode() : 0);
    }

    public final BaseBoolIntDto i() {
        return this.isMember;
    }

    public final String toString() {
        return "SuperAppUniversalWidgetActionSubscribeExtraDto(objectType=" + this.objectType + ", type=" + this.type + ", isMember=" + this.isMember + ", memberStatus=" + this.memberStatus + ", isClosed=" + this.isClosed + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.objectType.writeToParcel(parcel, i);
        parcel.writeParcelable(this.type, i);
        parcel.writeParcelable(this.isMember, i);
        parcel.writeParcelable(this.memberStatus, i);
        parcel.writeParcelable(this.isClosed, i);
    }

    public /* synthetic */ SuperAppUniversalWidgetActionSubscribeExtraDto(ObjectTypeDto objectTypeDto, GroupsGroupTypeDto groupsGroupTypeDto, BaseBoolIntDto baseBoolIntDto, GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto, GroupsGroupIsClosedDto groupsGroupIsClosedDto, int i, zcl zclVar) {
        this(objectTypeDto, (i & 2) != 0 ? null : groupsGroupTypeDto, (i & 4) != 0 ? null : baseBoolIntDto, (i & 8) != 0 ? null : groupsGroupFullMemberStatusDto, (i & 16) != 0 ? null : groupsGroupIsClosedDto);
    }
}
