package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsAllTrustMarksDto.kt */
/* loaded from: classes14.dex */
public final class GroupsAllTrustMarksDto implements Parcelable {
    public static final Parcelable.Creator<GroupsAllTrustMarksDto> CREATOR = new a();

    @pmi0("addresses")
    private final GroupsAddressesInfoDto addresses;

    @pmi0("date")
    private final GroupsTrustMarksItemDto date;

    @pmi0("delivery_free")
    private final GroupsTrustMarksItemDto deliveryFree;

    @pmi0("delivery_info")
    private final GroupsTrustMarksItemDto deliveryInfo;

    @pmi0("delivery_self")
    private final GroupsTrustMarksItemDto deliverySelf;

    @pmi0("delivery_text")
    private final GroupsTrustMarksItemDto deliveryText;

    @pmi0("docs")
    private final GroupsTrustMarksItemDto docs;

    @pmi0("friends")
    private final GroupsTrustMarksItemDto friends;

    @pmi0("ozon")
    private final GroupsTrustMarksItemDto ozon;

    @pmi0("payment_text")
    private final GroupsTrustMarksItemDto paymentText;

    @pmi0("payment_vkpay")
    private final GroupsTrustMarksItemDto paymentVkpay;

    @pmi0("popular")
    private final GroupsTrustMarksItemDto popular;

    @pmi0("refund")
    private final GroupsTrustMarksItemDto refund;

    @pmi0("y_clients")
    private final GroupsTrustMarksItemDto yClients;

    /* compiled from: GroupsAllTrustMarksDto.kt */
    public static final class a implements Parcelable.Creator<GroupsAllTrustMarksDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsAllTrustMarksDto createFromParcel(Parcel parcel) {
            return new GroupsAllTrustMarksDto(parcel.readInt() == 0 ? null : GroupsAddressesInfoDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GroupsTrustMarksItemDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GroupsTrustMarksItemDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GroupsTrustMarksItemDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GroupsTrustMarksItemDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GroupsTrustMarksItemDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GroupsTrustMarksItemDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GroupsTrustMarksItemDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GroupsTrustMarksItemDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GroupsTrustMarksItemDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GroupsTrustMarksItemDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GroupsTrustMarksItemDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GroupsTrustMarksItemDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? GroupsTrustMarksItemDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsAllTrustMarksDto[] newArray(int i) {
            return new GroupsAllTrustMarksDto[i];
        }
    }

    public GroupsAllTrustMarksDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public final GroupsTrustMarksItemDto B() {
        return this.refund;
    }

    public final GroupsTrustMarksItemDto C() {
        return this.yClients;
    }

    public final GroupsAddressesInfoDto d() {
        return this.addresses;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final GroupsTrustMarksItemDto e() {
        return this.date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsAllTrustMarksDto)) {
            return false;
        }
        GroupsAllTrustMarksDto groupsAllTrustMarksDto = (GroupsAllTrustMarksDto) obj;
        return epx.f(this.addresses, groupsAllTrustMarksDto.addresses) && epx.f(this.docs, groupsAllTrustMarksDto.docs) && epx.f(this.popular, groupsAllTrustMarksDto.popular) && epx.f(this.friends, groupsAllTrustMarksDto.friends) && epx.f(this.date, groupsAllTrustMarksDto.date) && epx.f(this.yClients, groupsAllTrustMarksDto.yClients) && epx.f(this.ozon, groupsAllTrustMarksDto.ozon) && epx.f(this.deliveryText, groupsAllTrustMarksDto.deliveryText) && epx.f(this.deliveryFree, groupsAllTrustMarksDto.deliveryFree) && epx.f(this.deliveryInfo, groupsAllTrustMarksDto.deliveryInfo) && epx.f(this.deliverySelf, groupsAllTrustMarksDto.deliverySelf) && epx.f(this.paymentText, groupsAllTrustMarksDto.paymentText) && epx.f(this.paymentVkpay, groupsAllTrustMarksDto.paymentVkpay) && epx.f(this.refund, groupsAllTrustMarksDto.refund);
    }

    public final GroupsTrustMarksItemDto f() {
        return this.deliveryFree;
    }

    public final GroupsTrustMarksItemDto g() {
        return this.deliveryInfo;
    }

    public final int hashCode() {
        GroupsAddressesInfoDto groupsAddressesInfoDto = this.addresses;
        int hashCode = (groupsAddressesInfoDto == null ? 0 : groupsAddressesInfoDto.hashCode()) * 31;
        GroupsTrustMarksItemDto groupsTrustMarksItemDto = this.docs;
        int hashCode2 = (hashCode + (groupsTrustMarksItemDto == null ? 0 : groupsTrustMarksItemDto.hashCode())) * 31;
        GroupsTrustMarksItemDto groupsTrustMarksItemDto2 = this.popular;
        int hashCode3 = (hashCode2 + (groupsTrustMarksItemDto2 == null ? 0 : groupsTrustMarksItemDto2.hashCode())) * 31;
        GroupsTrustMarksItemDto groupsTrustMarksItemDto3 = this.friends;
        int hashCode4 = (hashCode3 + (groupsTrustMarksItemDto3 == null ? 0 : groupsTrustMarksItemDto3.hashCode())) * 31;
        GroupsTrustMarksItemDto groupsTrustMarksItemDto4 = this.date;
        int hashCode5 = (hashCode4 + (groupsTrustMarksItemDto4 == null ? 0 : groupsTrustMarksItemDto4.hashCode())) * 31;
        GroupsTrustMarksItemDto groupsTrustMarksItemDto5 = this.yClients;
        int hashCode6 = (hashCode5 + (groupsTrustMarksItemDto5 == null ? 0 : groupsTrustMarksItemDto5.hashCode())) * 31;
        GroupsTrustMarksItemDto groupsTrustMarksItemDto6 = this.ozon;
        int hashCode7 = (hashCode6 + (groupsTrustMarksItemDto6 == null ? 0 : groupsTrustMarksItemDto6.hashCode())) * 31;
        GroupsTrustMarksItemDto groupsTrustMarksItemDto7 = this.deliveryText;
        int hashCode8 = (hashCode7 + (groupsTrustMarksItemDto7 == null ? 0 : groupsTrustMarksItemDto7.hashCode())) * 31;
        GroupsTrustMarksItemDto groupsTrustMarksItemDto8 = this.deliveryFree;
        int hashCode9 = (hashCode8 + (groupsTrustMarksItemDto8 == null ? 0 : groupsTrustMarksItemDto8.hashCode())) * 31;
        GroupsTrustMarksItemDto groupsTrustMarksItemDto9 = this.deliveryInfo;
        int hashCode10 = (hashCode9 + (groupsTrustMarksItemDto9 == null ? 0 : groupsTrustMarksItemDto9.hashCode())) * 31;
        GroupsTrustMarksItemDto groupsTrustMarksItemDto10 = this.deliverySelf;
        int hashCode11 = (hashCode10 + (groupsTrustMarksItemDto10 == null ? 0 : groupsTrustMarksItemDto10.hashCode())) * 31;
        GroupsTrustMarksItemDto groupsTrustMarksItemDto11 = this.paymentText;
        int hashCode12 = (hashCode11 + (groupsTrustMarksItemDto11 == null ? 0 : groupsTrustMarksItemDto11.hashCode())) * 31;
        GroupsTrustMarksItemDto groupsTrustMarksItemDto12 = this.paymentVkpay;
        int hashCode13 = (hashCode12 + (groupsTrustMarksItemDto12 == null ? 0 : groupsTrustMarksItemDto12.hashCode())) * 31;
        GroupsTrustMarksItemDto groupsTrustMarksItemDto13 = this.refund;
        return hashCode13 + (groupsTrustMarksItemDto13 != null ? groupsTrustMarksItemDto13.hashCode() : 0);
    }

    public final GroupsTrustMarksItemDto i() {
        return this.deliverySelf;
    }

    public final GroupsTrustMarksItemDto j() {
        return this.deliveryText;
    }

    public final GroupsTrustMarksItemDto k() {
        return this.docs;
    }

    public final GroupsTrustMarksItemDto l() {
        return this.friends;
    }

    public final GroupsTrustMarksItemDto n() {
        return this.ozon;
    }

    public final GroupsTrustMarksItemDto o() {
        return this.paymentText;
    }

    public final GroupsTrustMarksItemDto p() {
        return this.paymentVkpay;
    }

    public final String toString() {
        return "GroupsAllTrustMarksDto(addresses=" + this.addresses + ", docs=" + this.docs + ", popular=" + this.popular + ", friends=" + this.friends + ", date=" + this.date + ", yClients=" + this.yClients + ", ozon=" + this.ozon + ", deliveryText=" + this.deliveryText + ", deliveryFree=" + this.deliveryFree + ", deliveryInfo=" + this.deliveryInfo + ", deliverySelf=" + this.deliverySelf + ", paymentText=" + this.paymentText + ", paymentVkpay=" + this.paymentVkpay + ", refund=" + this.refund + ')';
    }

    public final GroupsTrustMarksItemDto u() {
        return this.popular;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        GroupsAddressesInfoDto groupsAddressesInfoDto = this.addresses;
        if (groupsAddressesInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsAddressesInfoDto.writeToParcel(parcel, i);
        }
        GroupsTrustMarksItemDto groupsTrustMarksItemDto = this.docs;
        if (groupsTrustMarksItemDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTrustMarksItemDto.writeToParcel(parcel, i);
        }
        GroupsTrustMarksItemDto groupsTrustMarksItemDto2 = this.popular;
        if (groupsTrustMarksItemDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTrustMarksItemDto2.writeToParcel(parcel, i);
        }
        GroupsTrustMarksItemDto groupsTrustMarksItemDto3 = this.friends;
        if (groupsTrustMarksItemDto3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTrustMarksItemDto3.writeToParcel(parcel, i);
        }
        GroupsTrustMarksItemDto groupsTrustMarksItemDto4 = this.date;
        if (groupsTrustMarksItemDto4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTrustMarksItemDto4.writeToParcel(parcel, i);
        }
        GroupsTrustMarksItemDto groupsTrustMarksItemDto5 = this.yClients;
        if (groupsTrustMarksItemDto5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTrustMarksItemDto5.writeToParcel(parcel, i);
        }
        GroupsTrustMarksItemDto groupsTrustMarksItemDto6 = this.ozon;
        if (groupsTrustMarksItemDto6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTrustMarksItemDto6.writeToParcel(parcel, i);
        }
        GroupsTrustMarksItemDto groupsTrustMarksItemDto7 = this.deliveryText;
        if (groupsTrustMarksItemDto7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTrustMarksItemDto7.writeToParcel(parcel, i);
        }
        GroupsTrustMarksItemDto groupsTrustMarksItemDto8 = this.deliveryFree;
        if (groupsTrustMarksItemDto8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTrustMarksItemDto8.writeToParcel(parcel, i);
        }
        GroupsTrustMarksItemDto groupsTrustMarksItemDto9 = this.deliveryInfo;
        if (groupsTrustMarksItemDto9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTrustMarksItemDto9.writeToParcel(parcel, i);
        }
        GroupsTrustMarksItemDto groupsTrustMarksItemDto10 = this.deliverySelf;
        if (groupsTrustMarksItemDto10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTrustMarksItemDto10.writeToParcel(parcel, i);
        }
        GroupsTrustMarksItemDto groupsTrustMarksItemDto11 = this.paymentText;
        if (groupsTrustMarksItemDto11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTrustMarksItemDto11.writeToParcel(parcel, i);
        }
        GroupsTrustMarksItemDto groupsTrustMarksItemDto12 = this.paymentVkpay;
        if (groupsTrustMarksItemDto12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTrustMarksItemDto12.writeToParcel(parcel, i);
        }
        GroupsTrustMarksItemDto groupsTrustMarksItemDto13 = this.refund;
        if (groupsTrustMarksItemDto13 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTrustMarksItemDto13.writeToParcel(parcel, i);
        }
    }

    public GroupsAllTrustMarksDto(GroupsAddressesInfoDto groupsAddressesInfoDto, GroupsTrustMarksItemDto groupsTrustMarksItemDto, GroupsTrustMarksItemDto groupsTrustMarksItemDto2, GroupsTrustMarksItemDto groupsTrustMarksItemDto3, GroupsTrustMarksItemDto groupsTrustMarksItemDto4, GroupsTrustMarksItemDto groupsTrustMarksItemDto5, GroupsTrustMarksItemDto groupsTrustMarksItemDto6, GroupsTrustMarksItemDto groupsTrustMarksItemDto7, GroupsTrustMarksItemDto groupsTrustMarksItemDto8, GroupsTrustMarksItemDto groupsTrustMarksItemDto9, GroupsTrustMarksItemDto groupsTrustMarksItemDto10, GroupsTrustMarksItemDto groupsTrustMarksItemDto11, GroupsTrustMarksItemDto groupsTrustMarksItemDto12, GroupsTrustMarksItemDto groupsTrustMarksItemDto13) {
        this.addresses = groupsAddressesInfoDto;
        this.docs = groupsTrustMarksItemDto;
        this.popular = groupsTrustMarksItemDto2;
        this.friends = groupsTrustMarksItemDto3;
        this.date = groupsTrustMarksItemDto4;
        this.yClients = groupsTrustMarksItemDto5;
        this.ozon = groupsTrustMarksItemDto6;
        this.deliveryText = groupsTrustMarksItemDto7;
        this.deliveryFree = groupsTrustMarksItemDto8;
        this.deliveryInfo = groupsTrustMarksItemDto9;
        this.deliverySelf = groupsTrustMarksItemDto10;
        this.paymentText = groupsTrustMarksItemDto11;
        this.paymentVkpay = groupsTrustMarksItemDto12;
        this.refund = groupsTrustMarksItemDto13;
    }

    public /* synthetic */ GroupsAllTrustMarksDto(GroupsAddressesInfoDto groupsAddressesInfoDto, GroupsTrustMarksItemDto groupsTrustMarksItemDto, GroupsTrustMarksItemDto groupsTrustMarksItemDto2, GroupsTrustMarksItemDto groupsTrustMarksItemDto3, GroupsTrustMarksItemDto groupsTrustMarksItemDto4, GroupsTrustMarksItemDto groupsTrustMarksItemDto5, GroupsTrustMarksItemDto groupsTrustMarksItemDto6, GroupsTrustMarksItemDto groupsTrustMarksItemDto7, GroupsTrustMarksItemDto groupsTrustMarksItemDto8, GroupsTrustMarksItemDto groupsTrustMarksItemDto9, GroupsTrustMarksItemDto groupsTrustMarksItemDto10, GroupsTrustMarksItemDto groupsTrustMarksItemDto11, GroupsTrustMarksItemDto groupsTrustMarksItemDto12, GroupsTrustMarksItemDto groupsTrustMarksItemDto13, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : groupsAddressesInfoDto, (i & 2) != 0 ? null : groupsTrustMarksItemDto, (i & 4) != 0 ? null : groupsTrustMarksItemDto2, (i & 8) != 0 ? null : groupsTrustMarksItemDto3, (i & 16) != 0 ? null : groupsTrustMarksItemDto4, (i & 32) != 0 ? null : groupsTrustMarksItemDto5, (i & 64) != 0 ? null : groupsTrustMarksItemDto6, (i & 128) != 0 ? null : groupsTrustMarksItemDto7, (i & 256) != 0 ? null : groupsTrustMarksItemDto8, (i & 512) != 0 ? null : groupsTrustMarksItemDto9, (i & 1024) != 0 ? null : groupsTrustMarksItemDto10, (i & 2048) != 0 ? null : groupsTrustMarksItemDto11, (i & 4096) != 0 ? null : groupsTrustMarksItemDto12, (i & 8192) != 0 ? null : groupsTrustMarksItemDto13);
    }
}
