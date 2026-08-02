package com.vk.stat.scheme;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MobileOfficialAppsNotificationsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsNotificationsStat$TypeNotificationItemClick implements SchemeStat$TypeClick.b {

    @pmi0("notification_id")
    private final String notificationId;

    @pmi0(TtmlNode.TAG_REGION)
    private final String region;

    public MobileOfficialAppsNotificationsStat$TypeNotificationItemClick(String str, String str2) {
        this.region = str;
        this.notificationId = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsNotificationsStat$TypeNotificationItemClick)) {
            return false;
        }
        MobileOfficialAppsNotificationsStat$TypeNotificationItemClick mobileOfficialAppsNotificationsStat$TypeNotificationItemClick = (MobileOfficialAppsNotificationsStat$TypeNotificationItemClick) obj;
        return epx.f(this.region, mobileOfficialAppsNotificationsStat$TypeNotificationItemClick.region) && epx.f(this.notificationId, mobileOfficialAppsNotificationsStat$TypeNotificationItemClick.notificationId);
    }

    public final int hashCode() {
        return this.notificationId.hashCode() + (this.region.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeNotificationItemClick(region=");
        sb.append(this.region);
        sb.append(", notificationId=");
        return ho8.a(sb, this.notificationId, ')');
    }
}
