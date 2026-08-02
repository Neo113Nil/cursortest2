package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.billingclient.api.BillingClient;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: DonutGetSubscriptionsResponseDto.kt */
/* loaded from: classes14.dex */
public final class DonutGetSubscriptionsResponseDto implements Parcelable {
    public static final Parcelable.Creator<DonutGetSubscriptionsResponseDto> CREATOR = new a();

    @pmi0("count")
    private final Integer count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("info")
    private final DonutSubscriptionMethodInfoDto info;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0(BillingClient.FeatureType.SUBSCRIPTIONS)
    private final List<DonutDonatorSubscriptionInfoDto> subscriptions;

    /* compiled from: DonutGetSubscriptionsResponseDto.kt */
    public static final class a implements Parcelable.Creator<DonutGetSubscriptionsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutGetSubscriptionsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int readInt = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(DonutDonatorSubscriptionInfoDto.CREATOR, parcel, arrayList3, i2, 1);
            }
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(DonutGetSubscriptionsResponseDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList2 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = bo.b(DonutGetSubscriptionsResponseDto.class, parcel, arrayList2, i, 1);
                }
            }
            return new DonutGetSubscriptionsResponseDto(arrayList3, valueOf, arrayList, arrayList2, (DonutSubscriptionMethodInfoDto) parcel.readParcelable(DonutGetSubscriptionsResponseDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final DonutGetSubscriptionsResponseDto[] newArray(int i) {
            return new DonutGetSubscriptionsResponseDto[i];
        }
    }

    public DonutGetSubscriptionsResponseDto(List<DonutDonatorSubscriptionInfoDto> list, Integer num, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, DonutSubscriptionMethodInfoDto donutSubscriptionMethodInfoDto) {
        this.subscriptions = list;
        this.count = num;
        this.profiles = list2;
        this.groups = list3;
        this.info = donutSubscriptionMethodInfoDto;
    }

    public final List<GroupsGroupFullDto> d() {
        return this.groups;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final DonutSubscriptionMethodInfoDto e() {
        return this.info;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutGetSubscriptionsResponseDto)) {
            return false;
        }
        DonutGetSubscriptionsResponseDto donutGetSubscriptionsResponseDto = (DonutGetSubscriptionsResponseDto) obj;
        return epx.f(this.subscriptions, donutGetSubscriptionsResponseDto.subscriptions) && epx.f(this.count, donutGetSubscriptionsResponseDto.count) && epx.f(this.profiles, donutGetSubscriptionsResponseDto.profiles) && epx.f(this.groups, donutGetSubscriptionsResponseDto.groups) && epx.f(this.info, donutGetSubscriptionsResponseDto.info);
    }

    public final List<UsersUserFullDto> f() {
        return this.profiles;
    }

    public final List<DonutDonatorSubscriptionInfoDto> g() {
        return this.subscriptions;
    }

    public final int hashCode() {
        int hashCode = this.subscriptions.hashCode() * 31;
        Integer num = this.count;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        DonutSubscriptionMethodInfoDto donutSubscriptionMethodInfoDto = this.info;
        return hashCode4 + (donutSubscriptionMethodInfoDto != null ? donutSubscriptionMethodInfoDto.hashCode() : 0);
    }

    public final String toString() {
        return "DonutGetSubscriptionsResponseDto(subscriptions=" + this.subscriptions + ", count=" + this.count + ", profiles=" + this.profiles + ", groups=" + this.groups + ", info=" + this.info + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.subscriptions);
        while (a2.hasNext()) {
            ((DonutDonatorSubscriptionInfoDto) a2.next()).writeToParcel(parcel, i);
        }
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<UsersUserFullDto> list = this.profiles;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<GroupsGroupFullDto> list2 = this.groups;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        parcel.writeParcelable(this.info, i);
    }

    public /* synthetic */ DonutGetSubscriptionsResponseDto(List list, Integer num, List list2, List list3, DonutSubscriptionMethodInfoDto donutSubscriptionMethodInfoDto, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : donutSubscriptionMethodInfoDto);
    }
}
