package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GroupsGetInviteLinkPreviewResponseDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGetInviteLinkPreviewResponseDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGetInviteLinkPreviewResponseDto> CREATOR = new a();

    @pmi0("group")
    private final GroupsGroupFullDto group;

    @pmi0("hidden_preview_reason")
    private final HiddenPreviewReasonDto hiddenPreviewReason;

    @pmi0("invite_link")
    private final GroupsInviteLinksDto inviteLink;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupsGetInviteLinkPreviewResponseDto.kt */
    public static final class HiddenPreviewReasonDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ HiddenPreviewReasonDto[] $VALUES;

        @pmi0("blacklisted")
        public static final HiddenPreviewReasonDto BLACKLISTED;
        public static final Parcelable.Creator<HiddenPreviewReasonDto> CREATOR;

        @pmi0("geoblocked")
        public static final HiddenPreviewReasonDto GEOBLOCKED;

        @pmi0("invalid_link")
        public static final HiddenPreviewReasonDto INVALID_LINK;
        private final String value;

        /* compiled from: GroupsGetInviteLinkPreviewResponseDto.kt */
        public static final class a implements Parcelable.Creator<HiddenPreviewReasonDto> {
            @Override // android.os.Parcelable.Creator
            public final HiddenPreviewReasonDto createFromParcel(Parcel parcel) {
                return HiddenPreviewReasonDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final HiddenPreviewReasonDto[] newArray(int i) {
                return new HiddenPreviewReasonDto[i];
            }
        }

        static {
            HiddenPreviewReasonDto hiddenPreviewReasonDto = new HiddenPreviewReasonDto("BLACKLISTED", 0, "blacklisted");
            BLACKLISTED = hiddenPreviewReasonDto;
            HiddenPreviewReasonDto hiddenPreviewReasonDto2 = new HiddenPreviewReasonDto("INVALID_LINK", 1, "invalid_link");
            INVALID_LINK = hiddenPreviewReasonDto2;
            HiddenPreviewReasonDto hiddenPreviewReasonDto3 = new HiddenPreviewReasonDto("GEOBLOCKED", 2, "geoblocked");
            GEOBLOCKED = hiddenPreviewReasonDto3;
            HiddenPreviewReasonDto[] hiddenPreviewReasonDtoArr = {hiddenPreviewReasonDto, hiddenPreviewReasonDto2, hiddenPreviewReasonDto3};
            $VALUES = hiddenPreviewReasonDtoArr;
            $ENTRIES = new asp(hiddenPreviewReasonDtoArr);
            CREATOR = new a();
        }

        private HiddenPreviewReasonDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static HiddenPreviewReasonDto valueOf(String str) {
            return (HiddenPreviewReasonDto) Enum.valueOf(HiddenPreviewReasonDto.class, str);
        }

        public static HiddenPreviewReasonDto[] values() {
            return (HiddenPreviewReasonDto[]) $VALUES.clone();
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

    /* compiled from: GroupsGetInviteLinkPreviewResponseDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGetInviteLinkPreviewResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGetInviteLinkPreviewResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            GroupsGroupFullDto groupsGroupFullDto = (GroupsGroupFullDto) parcel.readParcelable(GroupsGetInviteLinkPreviewResponseDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(GroupsGetInviteLinkPreviewResponseDto.class, parcel, arrayList, i, 1);
                }
            }
            return new GroupsGetInviteLinkPreviewResponseDto(groupsGroupFullDto, arrayList, parcel.readInt() == 0 ? null : GroupsInviteLinksDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? HiddenPreviewReasonDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGetInviteLinkPreviewResponseDto[] newArray(int i) {
            return new GroupsGetInviteLinkPreviewResponseDto[i];
        }
    }

    public GroupsGetInviteLinkPreviewResponseDto() {
        this(null, null, null, null, 15, null);
    }

    public final GroupsGroupFullDto d() {
        return this.group;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final GroupsInviteLinksDto e() {
        return this.inviteLink;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGetInviteLinkPreviewResponseDto)) {
            return false;
        }
        GroupsGetInviteLinkPreviewResponseDto groupsGetInviteLinkPreviewResponseDto = (GroupsGetInviteLinkPreviewResponseDto) obj;
        return epx.f(this.group, groupsGetInviteLinkPreviewResponseDto.group) && epx.f(this.profiles, groupsGetInviteLinkPreviewResponseDto.profiles) && epx.f(this.inviteLink, groupsGetInviteLinkPreviewResponseDto.inviteLink) && this.hiddenPreviewReason == groupsGetInviteLinkPreviewResponseDto.hiddenPreviewReason;
    }

    public final List<UsersUserFullDto> f() {
        return this.profiles;
    }

    public final int hashCode() {
        GroupsGroupFullDto groupsGroupFullDto = this.group;
        int hashCode = (groupsGroupFullDto == null ? 0 : groupsGroupFullDto.hashCode()) * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        GroupsInviteLinksDto groupsInviteLinksDto = this.inviteLink;
        int hashCode3 = (hashCode2 + (groupsInviteLinksDto == null ? 0 : groupsInviteLinksDto.hashCode())) * 31;
        HiddenPreviewReasonDto hiddenPreviewReasonDto = this.hiddenPreviewReason;
        return hashCode3 + (hiddenPreviewReasonDto != null ? hiddenPreviewReasonDto.hashCode() : 0);
    }

    public final String toString() {
        return "GroupsGetInviteLinkPreviewResponseDto(group=" + this.group + ", profiles=" + this.profiles + ", inviteLink=" + this.inviteLink + ", hiddenPreviewReason=" + this.hiddenPreviewReason + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.group, i);
        List<UsersUserFullDto> list = this.profiles;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        GroupsInviteLinksDto groupsInviteLinksDto = this.inviteLink;
        if (groupsInviteLinksDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsInviteLinksDto.writeToParcel(parcel, i);
        }
        HiddenPreviewReasonDto hiddenPreviewReasonDto = this.hiddenPreviewReason;
        if (hiddenPreviewReasonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hiddenPreviewReasonDto.writeToParcel(parcel, i);
        }
    }

    public GroupsGetInviteLinkPreviewResponseDto(GroupsGroupFullDto groupsGroupFullDto, List<UsersUserFullDto> list, GroupsInviteLinksDto groupsInviteLinksDto, HiddenPreviewReasonDto hiddenPreviewReasonDto) {
        this.group = groupsGroupFullDto;
        this.profiles = list;
        this.inviteLink = groupsInviteLinksDto;
        this.hiddenPreviewReason = hiddenPreviewReasonDto;
    }

    public /* synthetic */ GroupsGetInviteLinkPreviewResponseDto(GroupsGroupFullDto groupsGroupFullDto, List list, GroupsInviteLinksDto groupsInviteLinksDto, HiddenPreviewReasonDto hiddenPreviewReasonDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : groupsGroupFullDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : groupsInviteLinksDto, (i & 8) != 0 ? null : hiddenPreviewReasonDto);
    }
}
