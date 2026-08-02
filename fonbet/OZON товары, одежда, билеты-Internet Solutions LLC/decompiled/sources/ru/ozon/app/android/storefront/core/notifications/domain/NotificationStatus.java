package ru.ozon.app.android.storefront.core.notifications.domain;

import Ef0.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/storefront/core/notifications/domain/NotificationStatus;", "", "", "isNotificationEnabled", "areChannelsEnabled", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "getAreChannelsEnabled", "notifications_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class NotificationStatus {
    private final boolean areChannelsEnabled;
    private final boolean isNotificationEnabled;

    public NotificationStatus(boolean z11, boolean z12) {
        this.isNotificationEnabled = z11;
        this.areChannelsEnabled = z12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationStatus)) {
            return false;
        }
        NotificationStatus notificationStatus = (NotificationStatus) other;
        return this.isNotificationEnabled == notificationStatus.isNotificationEnabled && this.areChannelsEnabled == notificationStatus.areChannelsEnabled;
    }

    public final boolean getAreChannelsEnabled() {
        return this.areChannelsEnabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.areChannelsEnabled) + (Boolean.hashCode(this.isNotificationEnabled) * 31);
    }

    /* renamed from: isNotificationEnabled, reason: from getter */
    public final boolean getIsNotificationEnabled() {
        return this.isNotificationEnabled;
    }

    @NotNull
    public String toString() {
        return c.c("NotificationStatus(isNotificationEnabled=", ", areChannelsEnabled=", ")", this.isNotificationEnabled, this.areChannelsEnabled);
    }
}
