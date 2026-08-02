package com.vk.id.groupsubscription;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/vk/id/groupsubscription/GroupSubscriptionLimit;", "", "maxSubscriptionsToShow", "", "periodInDays", "<init>", "(II)V", "getMaxSubscriptionsToShow", "()I", "getPeriodInDays", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class GroupSubscriptionLimit {
    private final int maxSubscriptionsToShow;
    private final int periodInDays;

    public GroupSubscriptionLimit(int i11, int i12) {
        this.maxSubscriptionsToShow = i11;
        this.periodInDays = i12;
    }

    public final int getMaxSubscriptionsToShow() {
        return this.maxSubscriptionsToShow;
    }

    public final int getPeriodInDays() {
        return this.periodInDays;
    }

    public /* synthetic */ GroupSubscriptionLimit(int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 2 : i11, (i13 & 2) != 0 ? 30 : i12);
    }
}
