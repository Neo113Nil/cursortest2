package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: GroupsGroupDonutSubscriptionLevelDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupDonutSubscriptionLevelDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGroupDonutSubscriptionLevelDto> CREATOR = new a();

    @pmi0("button")
    private final BaseLinkButtonDto button;

    @pmi0(InAppPurchaseMetaData.KEY_CURRENCY)
    private final String currency;

    @pmi0("description")
    private final String description;

    @pmi0("description_button")
    private final BaseLinkButtonDto descriptionButton;

    @pmi0("dons_count")
    private final Integer donsCount;

    @pmi0("friends_ids")
    private final List<UserId> friendsIds;

    @pmi0("image")
    private final List<BaseImageDto> image;

    @pmi0("is_active")
    private final Boolean isActive;

    @pmi0("next_payment_date")
    private final Integer nextPaymentDate;

    @pmi0("price")
    private final int price;

    @pmi0("statistics")
    private final List<GroupsGroupDonutStatisticDto> statistics;

    @pmi0("title")
    private final String title;

    /* compiled from: GroupsGroupDonutSubscriptionLevelDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupDonutSubscriptionLevelDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupDonutSubscriptionLevelDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean valueOf;
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            while (true) {
                if (i == readInt) {
                    break;
                }
                i = en.a(BaseImageDto.CREATOR, parcel, arrayList2, i, 1);
            }
            int readInt2 = parcel.readInt();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt3);
            int i2 = 0;
            while (i2 != readInt3) {
                i2 = en.a(GroupsGroupDonutStatisticDto.CREATOR, parcel, arrayList3, i2, 1);
            }
            Parcelable.Creator<BaseLinkButtonDto> creator = BaseLinkButtonDto.CREATOR;
            BaseLinkButtonDto createFromParcel = creator.createFromParcel(parcel);
            BaseLinkButtonDto createFromParcel2 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList = new ArrayList(readInt4);
                int i3 = 0;
                while (i3 != readInt4) {
                    i3 = bo.b(GroupsGroupDonutSubscriptionLevelDto.class, parcel, arrayList, i3, 1);
                }
            }
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GroupsGroupDonutSubscriptionLevelDto(readString, arrayList2, readInt2, readString2, readString3, arrayList3, createFromParcel, createFromParcel2, arrayList, valueOf2, valueOf, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupDonutSubscriptionLevelDto[] newArray(int i) {
            return new GroupsGroupDonutSubscriptionLevelDto[i];
        }
    }

    public GroupsGroupDonutSubscriptionLevelDto(String str, List<BaseImageDto> list, int i, String str2, String str3, List<GroupsGroupDonutStatisticDto> list2, BaseLinkButtonDto baseLinkButtonDto, BaseLinkButtonDto baseLinkButtonDto2, List<UserId> list3, Integer num, Boolean bool, Integer num2) {
        this.title = str;
        this.image = list;
        this.price = i;
        this.currency = str2;
        this.description = str3;
        this.statistics = list2;
        this.button = baseLinkButtonDto;
        this.descriptionButton = baseLinkButtonDto2;
        this.friendsIds = list3;
        this.donsCount = num;
        this.isActive = bool;
        this.nextPaymentDate = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupDonutSubscriptionLevelDto)) {
            return false;
        }
        GroupsGroupDonutSubscriptionLevelDto groupsGroupDonutSubscriptionLevelDto = (GroupsGroupDonutSubscriptionLevelDto) obj;
        return epx.f(this.title, groupsGroupDonutSubscriptionLevelDto.title) && epx.f(this.image, groupsGroupDonutSubscriptionLevelDto.image) && this.price == groupsGroupDonutSubscriptionLevelDto.price && epx.f(this.currency, groupsGroupDonutSubscriptionLevelDto.currency) && epx.f(this.description, groupsGroupDonutSubscriptionLevelDto.description) && epx.f(this.statistics, groupsGroupDonutSubscriptionLevelDto.statistics) && epx.f(this.button, groupsGroupDonutSubscriptionLevelDto.button) && epx.f(this.descriptionButton, groupsGroupDonutSubscriptionLevelDto.descriptionButton) && epx.f(this.friendsIds, groupsGroupDonutSubscriptionLevelDto.friendsIds) && epx.f(this.donsCount, groupsGroupDonutSubscriptionLevelDto.donsCount) && epx.f(this.isActive, groupsGroupDonutSubscriptionLevelDto.isActive) && epx.f(this.nextPaymentDate, groupsGroupDonutSubscriptionLevelDto.nextPaymentDate);
    }

    public final int hashCode() {
        int hashCode = (this.button.hashCode() + fw3.a(urd0.a(urd0.a(shy.a(this.price, fw3.a(this.title.hashCode() * 31, 31, this.image), 31), 31, this.currency), 31, this.description), 31, this.statistics)) * 31;
        BaseLinkButtonDto baseLinkButtonDto = this.descriptionButton;
        int hashCode2 = (hashCode + (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode())) * 31;
        List<UserId> list = this.friendsIds;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.donsCount;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isActive;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.nextPaymentDate;
        return hashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGroupDonutSubscriptionLevelDto(title=");
        sb.append(this.title);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", statistics=");
        sb.append(this.statistics);
        sb.append(", button=");
        sb.append(this.button);
        sb.append(", descriptionButton=");
        sb.append(this.descriptionButton);
        sb.append(", friendsIds=");
        sb.append(this.friendsIds);
        sb.append(", donsCount=");
        sb.append(this.donsCount);
        sb.append(", isActive=");
        sb.append(this.isActive);
        sb.append(", nextPaymentDate=");
        return uqi.b(sb, this.nextPaymentDate, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        Iterator a2 = ao.a(parcel, this.image);
        while (a2.hasNext()) {
            ((BaseImageDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.price);
        parcel.writeString(this.currency);
        parcel.writeString(this.description);
        Iterator a3 = ao.a(parcel, this.statistics);
        while (a3.hasNext()) {
            ((GroupsGroupDonutStatisticDto) a3.next()).writeToParcel(parcel, i);
        }
        this.button.writeToParcel(parcel, i);
        BaseLinkButtonDto baseLinkButtonDto = this.descriptionButton;
        if (baseLinkButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLinkButtonDto.writeToParcel(parcel, i);
        }
        List<UserId> list = this.friendsIds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        Integer num = this.donsCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool = this.isActive;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Integer num2 = this.nextPaymentDate;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public /* synthetic */ GroupsGroupDonutSubscriptionLevelDto(String str, List list, int i, String str2, String str3, List list2, BaseLinkButtonDto baseLinkButtonDto, BaseLinkButtonDto baseLinkButtonDto2, List list3, Integer num, Boolean bool, Integer num2, int i2, zcl zclVar) {
        this(str, list, i, str2, str3, list2, baseLinkButtonDto, (i2 & 128) != 0 ? null : baseLinkButtonDto2, (i2 & 256) != 0 ? null : list3, (i2 & 512) != 0 ? null : num, (i2 & 1024) != 0 ? null : bool, (i2 & 2048) != 0 ? null : num2);
    }
}
