package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: MobileOfficialAppsNotificationsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsNotificationsStat$TypeNotificationViews implements SchemeStat$TypeView.b {

    @pmi0("notification_ids")
    private final List<String> notificationIds;

    public MobileOfficialAppsNotificationsStat$TypeNotificationViews(List<String> list) {
        this.notificationIds = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsNotificationsStat$TypeNotificationViews) && epx.f(this.notificationIds, ((MobileOfficialAppsNotificationsStat$TypeNotificationViews) obj).notificationIds);
    }

    public final int hashCode() {
        return this.notificationIds.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("TypeNotificationViews(notificationIds="), this.notificationIds);
    }
}
