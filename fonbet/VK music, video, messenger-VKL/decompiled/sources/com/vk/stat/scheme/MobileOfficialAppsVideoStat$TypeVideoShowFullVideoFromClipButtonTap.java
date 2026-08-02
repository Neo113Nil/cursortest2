package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoShowFullVideoFromClipButtonTap implements SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final String eventType;

    @pmi0("object_item")
    private final SchemeStat$EventItem objectItem;

    @pmi0("video_item")
    private final SchemeStat$EventItem videoItem;

    public MobileOfficialAppsVideoStat$TypeVideoShowFullVideoFromClipButtonTap(String str, SchemeStat$EventItem schemeStat$EventItem, SchemeStat$EventItem schemeStat$EventItem2) {
        this.eventType = str;
        this.videoItem = schemeStat$EventItem;
        this.objectItem = schemeStat$EventItem2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoShowFullVideoFromClipButtonTap)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoShowFullVideoFromClipButtonTap mobileOfficialAppsVideoStat$TypeVideoShowFullVideoFromClipButtonTap = (MobileOfficialAppsVideoStat$TypeVideoShowFullVideoFromClipButtonTap) obj;
        return epx.f(this.eventType, mobileOfficialAppsVideoStat$TypeVideoShowFullVideoFromClipButtonTap.eventType) && epx.f(this.videoItem, mobileOfficialAppsVideoStat$TypeVideoShowFullVideoFromClipButtonTap.videoItem) && epx.f(this.objectItem, mobileOfficialAppsVideoStat$TypeVideoShowFullVideoFromClipButtonTap.objectItem);
    }

    public final int hashCode() {
        return this.objectItem.hashCode() + ((this.videoItem.hashCode() + (this.eventType.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TypeVideoShowFullVideoFromClipButtonTap(eventType=" + this.eventType + ", videoItem=" + this.videoItem + ", objectItem=" + this.objectItem + ')';
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoShowFullVideoFromClipButtonTap(String str, SchemeStat$EventItem schemeStat$EventItem, SchemeStat$EventItem schemeStat$EventItem2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "go_to_full_video" : str, schemeStat$EventItem, schemeStat$EventItem2);
    }
}
