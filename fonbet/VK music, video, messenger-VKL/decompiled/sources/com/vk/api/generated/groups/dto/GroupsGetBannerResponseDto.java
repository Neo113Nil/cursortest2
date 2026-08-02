package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsGetBannerResponseDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGetBannerResponseDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGetBannerResponseDto> CREATOR = new a();

    @pmi0("action")
    private final BaseLinkButtonActionDto action;

    @pmi0(X3.i.F0)
    private final String advertiser;

    @pmi0("banner")
    private final GroupsBannerDto banner;

    @pmi0("community_page_banner")
    private final GroupsCommunityPageBannerDto communityPageBanner;

    @pmi0("description")
    private final String description;

    @pmi0("donut_friends_banner")
    private final GroupsDonutFriendsBannerDto donutFriendsBanner;

    @pmi0("icon")
    private final List<BaseImageDto> icon;

    @pmi0("title")
    private final String title;

    /* compiled from: GroupsGetBannerResponseDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGetBannerResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGetBannerResponseDto createFromParcel(Parcel parcel) {
            GroupsBannerDto groupsBannerDto = (GroupsBannerDto) parcel.readParcelable(GroupsGetBannerResponseDto.class.getClassLoader());
            ArrayList arrayList = null;
            GroupsDonutFriendsBannerDto createFromParcel = parcel.readInt() == 0 ? null : GroupsDonutFriendsBannerDto.CREATOR.createFromParcel(parcel);
            GroupsCommunityPageBannerDto createFromParcel2 = parcel.readInt() == 0 ? null : GroupsCommunityPageBannerDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(GroupsGetBannerResponseDto.class, parcel, arrayList, i, 1);
                }
            }
            return new GroupsGetBannerResponseDto(groupsBannerDto, createFromParcel, createFromParcel2, readString, arrayList, parcel.readString(), (BaseLinkButtonActionDto) parcel.readParcelable(GroupsGetBannerResponseDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGetBannerResponseDto[] newArray(int i) {
            return new GroupsGetBannerResponseDto[i];
        }
    }

    public GroupsGetBannerResponseDto() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final GroupsBannerDto d() {
        return this.banner;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final GroupsDonutFriendsBannerDto e() {
        return this.donutFriendsBanner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGetBannerResponseDto)) {
            return false;
        }
        GroupsGetBannerResponseDto groupsGetBannerResponseDto = (GroupsGetBannerResponseDto) obj;
        return epx.f(this.banner, groupsGetBannerResponseDto.banner) && epx.f(this.donutFriendsBanner, groupsGetBannerResponseDto.donutFriendsBanner) && epx.f(this.communityPageBanner, groupsGetBannerResponseDto.communityPageBanner) && epx.f(this.description, groupsGetBannerResponseDto.description) && epx.f(this.icon, groupsGetBannerResponseDto.icon) && epx.f(this.title, groupsGetBannerResponseDto.title) && epx.f(this.action, groupsGetBannerResponseDto.action) && epx.f(this.advertiser, groupsGetBannerResponseDto.advertiser);
    }

    public final int hashCode() {
        GroupsBannerDto groupsBannerDto = this.banner;
        int hashCode = (groupsBannerDto == null ? 0 : groupsBannerDto.hashCode()) * 31;
        GroupsDonutFriendsBannerDto groupsDonutFriendsBannerDto = this.donutFriendsBanner;
        int hashCode2 = (hashCode + (groupsDonutFriendsBannerDto == null ? 0 : groupsDonutFriendsBannerDto.hashCode())) * 31;
        GroupsCommunityPageBannerDto groupsCommunityPageBannerDto = this.communityPageBanner;
        int hashCode3 = (hashCode2 + (groupsCommunityPageBannerDto == null ? 0 : groupsCommunityPageBannerDto.hashCode())) * 31;
        String str = this.description;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<BaseImageDto> list = this.icon;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.title;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BaseLinkButtonActionDto baseLinkButtonActionDto = this.action;
        int hashCode7 = (hashCode6 + (baseLinkButtonActionDto == null ? 0 : baseLinkButtonActionDto.hashCode())) * 31;
        String str3 = this.advertiser;
        return hashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGetBannerResponseDto(banner=");
        sb.append(this.banner);
        sb.append(", donutFriendsBanner=");
        sb.append(this.donutFriendsBanner);
        sb.append(", communityPageBanner=");
        sb.append(this.communityPageBanner);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", advertiser=");
        return ho8.a(sb, this.advertiser, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.banner, i);
        GroupsDonutFriendsBannerDto groupsDonutFriendsBannerDto = this.donutFriendsBanner;
        if (groupsDonutFriendsBannerDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsDonutFriendsBannerDto.writeToParcel(parcel, i);
        }
        GroupsCommunityPageBannerDto groupsCommunityPageBannerDto = this.communityPageBanner;
        if (groupsCommunityPageBannerDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsCommunityPageBannerDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.description);
        List<BaseImageDto> list = this.icon;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeString(this.title);
        parcel.writeParcelable(this.action, i);
        parcel.writeString(this.advertiser);
    }

    public GroupsGetBannerResponseDto(GroupsBannerDto groupsBannerDto, GroupsDonutFriendsBannerDto groupsDonutFriendsBannerDto, GroupsCommunityPageBannerDto groupsCommunityPageBannerDto, String str, List<BaseImageDto> list, String str2, BaseLinkButtonActionDto baseLinkButtonActionDto, String str3) {
        this.banner = groupsBannerDto;
        this.donutFriendsBanner = groupsDonutFriendsBannerDto;
        this.communityPageBanner = groupsCommunityPageBannerDto;
        this.description = str;
        this.icon = list;
        this.title = str2;
        this.action = baseLinkButtonActionDto;
        this.advertiser = str3;
    }

    public /* synthetic */ GroupsGetBannerResponseDto(GroupsBannerDto groupsBannerDto, GroupsDonutFriendsBannerDto groupsDonutFriendsBannerDto, GroupsCommunityPageBannerDto groupsCommunityPageBannerDto, String str, List list, String str2, BaseLinkButtonActionDto baseLinkButtonActionDto, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : groupsBannerDto, (i & 2) != 0 ? null : groupsDonutFriendsBannerDto, (i & 4) != 0 ? null : groupsCommunityPageBannerDto, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : baseLinkButtonActionDto, (i & 128) != 0 ? null : str3);
    }
}
