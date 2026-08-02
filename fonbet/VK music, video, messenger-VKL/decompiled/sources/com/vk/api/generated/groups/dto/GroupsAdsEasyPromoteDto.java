package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: GroupsAdsEasyPromoteDto.kt */
/* loaded from: classes14.dex */
public final class GroupsAdsEasyPromoteDto implements Parcelable {
    public static final Parcelable.Creator<GroupsAdsEasyPromoteDto> CREATOR = new a();

    @pmi0("addresses")
    private final List<GroupsAddressDto> addresses;

    @pmi0("has_main_screen_button")
    private final Boolean hasMainScreenButton;

    @pmi0("has_promote_post_button")
    private final Boolean hasPromotePostButton;

    @pmi0("link_badge")
    private final Integer linkBadge;

    @pmi0("link_text")
    private final String linkText;

    @pmi0("link_url")
    private final String linkUrl;

    @pmi0("market_available")
    private final Boolean marketAvailable;

    @pmi0("messages")
    private final BaseBoolIntDto messages;

    @pmi0("promote_banner")
    private final GroupsAdsEasyPromoteBannerDto promoteBanner;

    @pmi0("top_posts_ids")
    private final List<Integer> topPostsIds;

    /* compiled from: GroupsAdsEasyPromoteDto.kt */
    public static final class a implements Parcelable.Creator<GroupsAdsEasyPromoteDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsAdsEasyPromoteDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            ArrayList arrayList;
            ArrayList arrayList2;
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            GroupsAdsEasyPromoteBannerDto createFromParcel = parcel.readInt() == 0 ? null : GroupsAdsEasyPromoteBannerDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = pm0.b(parcel, arrayList3, i, 1);
                }
                arrayList = arrayList3;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = en.a(GroupsAddressDto.CREATOR, parcel, arrayList4, i2, 1);
                }
                arrayList2 = arrayList4;
            }
            BaseBoolIntDto createFromParcel2 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GroupsAdsEasyPromoteDto(valueOf, valueOf2, valueOf3, createFromParcel, arrayList, arrayList2, createFromParcel2, readString, readString2, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsAdsEasyPromoteDto[] newArray(int i) {
            return new GroupsAdsEasyPromoteDto[i];
        }
    }

    public GroupsAdsEasyPromoteDto() {
        this(null, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsAdsEasyPromoteDto)) {
            return false;
        }
        GroupsAdsEasyPromoteDto groupsAdsEasyPromoteDto = (GroupsAdsEasyPromoteDto) obj;
        return epx.f(this.hasMainScreenButton, groupsAdsEasyPromoteDto.hasMainScreenButton) && epx.f(this.hasPromotePostButton, groupsAdsEasyPromoteDto.hasPromotePostButton) && epx.f(this.linkBadge, groupsAdsEasyPromoteDto.linkBadge) && epx.f(this.promoteBanner, groupsAdsEasyPromoteDto.promoteBanner) && epx.f(this.topPostsIds, groupsAdsEasyPromoteDto.topPostsIds) && epx.f(this.addresses, groupsAdsEasyPromoteDto.addresses) && this.messages == groupsAdsEasyPromoteDto.messages && epx.f(this.linkUrl, groupsAdsEasyPromoteDto.linkUrl) && epx.f(this.linkText, groupsAdsEasyPromoteDto.linkText) && epx.f(this.marketAvailable, groupsAdsEasyPromoteDto.marketAvailable);
    }

    public final int hashCode() {
        Boolean bool = this.hasMainScreenButton;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.hasPromotePostButton;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.linkBadge;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        GroupsAdsEasyPromoteBannerDto groupsAdsEasyPromoteBannerDto = this.promoteBanner;
        int hashCode4 = (hashCode3 + (groupsAdsEasyPromoteBannerDto == null ? 0 : groupsAdsEasyPromoteBannerDto.hashCode())) * 31;
        List<Integer> list = this.topPostsIds;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsAddressDto> list2 = this.addresses;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.messages;
        int hashCode7 = (hashCode6 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        String str = this.linkUrl;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.linkText;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool3 = this.marketAvailable;
        return hashCode9 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsAdsEasyPromoteDto(hasMainScreenButton=");
        sb.append(this.hasMainScreenButton);
        sb.append(", hasPromotePostButton=");
        sb.append(this.hasPromotePostButton);
        sb.append(", linkBadge=");
        sb.append(this.linkBadge);
        sb.append(", promoteBanner=");
        sb.append(this.promoteBanner);
        sb.append(", topPostsIds=");
        sb.append(this.topPostsIds);
        sb.append(", addresses=");
        sb.append(this.addresses);
        sb.append(", messages=");
        sb.append(this.messages);
        sb.append(", linkUrl=");
        sb.append(this.linkUrl);
        sb.append(", linkText=");
        sb.append(this.linkText);
        sb.append(", marketAvailable=");
        return tn.a(sb, this.marketAvailable, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.hasMainScreenButton;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.hasPromotePostButton;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Integer num = this.linkBadge;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        GroupsAdsEasyPromoteBannerDto groupsAdsEasyPromoteBannerDto = this.promoteBanner;
        if (groupsAdsEasyPromoteBannerDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsAdsEasyPromoteBannerDto.writeToParcel(parcel, i);
        }
        List<Integer> list = this.topPostsIds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeInt(((Number) f.next()).intValue());
            }
        }
        List<GroupsAddressDto> list2 = this.addresses;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((GroupsAddressDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        BaseBoolIntDto baseBoolIntDto = this.messages;
        if (baseBoolIntDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.linkUrl);
        parcel.writeString(this.linkText);
        Boolean bool3 = this.marketAvailable;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
    }

    public GroupsAdsEasyPromoteDto(Boolean bool, Boolean bool2, Integer num, GroupsAdsEasyPromoteBannerDto groupsAdsEasyPromoteBannerDto, List<Integer> list, List<GroupsAddressDto> list2, BaseBoolIntDto baseBoolIntDto, String str, String str2, Boolean bool3) {
        this.hasMainScreenButton = bool;
        this.hasPromotePostButton = bool2;
        this.linkBadge = num;
        this.promoteBanner = groupsAdsEasyPromoteBannerDto;
        this.topPostsIds = list;
        this.addresses = list2;
        this.messages = baseBoolIntDto;
        this.linkUrl = str;
        this.linkText = str2;
        this.marketAvailable = bool3;
    }

    public /* synthetic */ GroupsAdsEasyPromoteDto(Boolean bool, Boolean bool2, Integer num, GroupsAdsEasyPromoteBannerDto groupsAdsEasyPromoteBannerDto, List list, List list2, BaseBoolIntDto baseBoolIntDto, String str, String str2, Boolean bool3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : groupsAdsEasyPromoteBannerDto, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : baseBoolIntDto, (i & 128) != 0 ? null : str, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? null : bool3);
    }
}
