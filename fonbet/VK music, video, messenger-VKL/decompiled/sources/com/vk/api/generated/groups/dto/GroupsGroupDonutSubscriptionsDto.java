package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.users.dto.UsersUserDonatedFriendDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsGroupDonutSubscriptionsDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupDonutSubscriptionsDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGroupDonutSubscriptionsDto> CREATOR = new a();

    @pmi0("about_button")
    private final BaseLinkButtonDto aboutButton;

    @pmi0("admin_button")
    private final BaseLinkButtonDto adminButton;

    @pmi0("description")
    private final String description;

    @pmi0("friends")
    private final List<UsersUserDonatedFriendDto> friends;

    @pmi0("levels")
    private final List<GroupsGroupDonutSubscriptionsLevelDto> levels;

    @pmi0("statistics")
    private final List<GroupsGroupDonutSubscriptionsStatisticDto> statistics;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    /* compiled from: GroupsGroupDonutSubscriptionsDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupDonutSubscriptionsDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupDonutSubscriptionsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            BaseLinkButtonDto createFromParcel = parcel.readInt() == 0 ? null : BaseLinkButtonDto.CREATOR.createFromParcel(parcel);
            BaseLinkButtonDto createFromParcel2 = parcel.readInt() == 0 ? null : BaseLinkButtonDto.CREATOR.createFromParcel(parcel);
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(UsersUserDonatedFriendDto.CREATOR, parcel, arrayList4, i2, 1);
                }
                arrayList = arrayList4;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = en.a(GroupsGroupDonutSubscriptionsStatisticDto.CREATOR, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = en.a(GroupsGroupDonutSubscriptionsLevelDto.CREATOR, parcel, arrayList5, i, 1);
                }
                arrayList3 = arrayList5;
            }
            return new GroupsGroupDonutSubscriptionsDto(readString, readString2, readString3, createFromParcel, createFromParcel2, arrayList, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupDonutSubscriptionsDto[] newArray(int i) {
            return new GroupsGroupDonutSubscriptionsDto[i];
        }
    }

    public GroupsGroupDonutSubscriptionsDto(String str, String str2, String str3, BaseLinkButtonDto baseLinkButtonDto, BaseLinkButtonDto baseLinkButtonDto2, List<UsersUserDonatedFriendDto> list, List<GroupsGroupDonutSubscriptionsStatisticDto> list2, List<GroupsGroupDonutSubscriptionsLevelDto> list3) {
        this.title = str;
        this.subtitle = str2;
        this.description = str3;
        this.aboutButton = baseLinkButtonDto;
        this.adminButton = baseLinkButtonDto2;
        this.friends = list;
        this.statistics = list2;
        this.levels = list3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupDonutSubscriptionsDto)) {
            return false;
        }
        GroupsGroupDonutSubscriptionsDto groupsGroupDonutSubscriptionsDto = (GroupsGroupDonutSubscriptionsDto) obj;
        return epx.f(this.title, groupsGroupDonutSubscriptionsDto.title) && epx.f(this.subtitle, groupsGroupDonutSubscriptionsDto.subtitle) && epx.f(this.description, groupsGroupDonutSubscriptionsDto.description) && epx.f(this.aboutButton, groupsGroupDonutSubscriptionsDto.aboutButton) && epx.f(this.adminButton, groupsGroupDonutSubscriptionsDto.adminButton) && epx.f(this.friends, groupsGroupDonutSubscriptionsDto.friends) && epx.f(this.statistics, groupsGroupDonutSubscriptionsDto.statistics) && epx.f(this.levels, groupsGroupDonutSubscriptionsDto.levels);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BaseLinkButtonDto baseLinkButtonDto = this.aboutButton;
        int hashCode4 = (hashCode3 + (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode())) * 31;
        BaseLinkButtonDto baseLinkButtonDto2 = this.adminButton;
        int hashCode5 = (hashCode4 + (baseLinkButtonDto2 == null ? 0 : baseLinkButtonDto2.hashCode())) * 31;
        List<UsersUserDonatedFriendDto> list = this.friends;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupDonutSubscriptionsStatisticDto> list2 = this.statistics;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<GroupsGroupDonutSubscriptionsLevelDto> list3 = this.levels;
        return hashCode7 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGroupDonutSubscriptionsDto(title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", aboutButton=");
        sb.append(this.aboutButton);
        sb.append(", adminButton=");
        sb.append(this.adminButton);
        sb.append(", friends=");
        sb.append(this.friends);
        sb.append(", statistics=");
        sb.append(this.statistics);
        sb.append(", levels=");
        return ms9.a(')', sb, this.levels);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.description);
        BaseLinkButtonDto baseLinkButtonDto = this.aboutButton;
        if (baseLinkButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLinkButtonDto.writeToParcel(parcel, i);
        }
        BaseLinkButtonDto baseLinkButtonDto2 = this.adminButton;
        if (baseLinkButtonDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLinkButtonDto2.writeToParcel(parcel, i);
        }
        List<UsersUserDonatedFriendDto> list = this.friends;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((UsersUserDonatedFriendDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<GroupsGroupDonutSubscriptionsStatisticDto> list2 = this.statistics;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((GroupsGroupDonutSubscriptionsStatisticDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        List<GroupsGroupDonutSubscriptionsLevelDto> list3 = this.levels;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f3 = dn.f(parcel, list3, 1);
        while (f3.hasNext()) {
            ((GroupsGroupDonutSubscriptionsLevelDto) f3.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GroupsGroupDonutSubscriptionsDto(String str, String str2, String str3, BaseLinkButtonDto baseLinkButtonDto, BaseLinkButtonDto baseLinkButtonDto2, List list, List list2, List list3, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : baseLinkButtonDto, (i & 16) != 0 ? null : baseLinkButtonDto2, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : list2, (i & 128) != 0 ? null : list3);
    }
}
