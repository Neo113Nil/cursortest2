package com.vk.sdk.api.donut.dto;

import com.android.billingclient.api.BillingClient;
import com.vk.movika.sdk.base.model.n;
import com.vk.sdk.api.groups.dto.GroupsGroupFullDto;
import com.vk.sdk.api.users.dto.UsersUserFullDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: DonutGetSubscriptionsResponseDto.kt */
/* loaded from: classes5.dex */
public final class DonutGetSubscriptionsResponseDto {

    @pmi0("count")
    private final Integer count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0(BillingClient.FeatureType.SUBSCRIPTIONS)
    private final List<DonutDonatorSubscriptionInfoDto> subscriptions;

    public DonutGetSubscriptionsResponseDto(List<DonutDonatorSubscriptionInfoDto> list, Integer num, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3) {
        this.subscriptions = list;
        this.count = num;
        this.profiles = list2;
        this.groups = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutGetSubscriptionsResponseDto)) {
            return false;
        }
        DonutGetSubscriptionsResponseDto donutGetSubscriptionsResponseDto = (DonutGetSubscriptionsResponseDto) obj;
        return epx.f(this.subscriptions, donutGetSubscriptionsResponseDto.subscriptions) && epx.f(this.count, donutGetSubscriptionsResponseDto.count) && epx.f(this.profiles, donutGetSubscriptionsResponseDto.profiles) && epx.f(this.groups, donutGetSubscriptionsResponseDto.groups);
    }

    public final int hashCode() {
        int hashCode = this.subscriptions.hashCode() * 31;
        Integer num = this.count;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        List<DonutDonatorSubscriptionInfoDto> list = this.subscriptions;
        Integer num = this.count;
        List<UsersUserFullDto> list2 = this.profiles;
        List<GroupsGroupFullDto> list3 = this.groups;
        StringBuilder sb = new StringBuilder("DonutGetSubscriptionsResponseDto(subscriptions=");
        sb.append(list);
        sb.append(", count=");
        sb.append(num);
        sb.append(", profiles=");
        return n.b(sb, list2, ", groups=", list3, ")");
    }

    public /* synthetic */ DonutGetSubscriptionsResponseDto(List list, Integer num, List list2, List list3, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3);
    }
}
