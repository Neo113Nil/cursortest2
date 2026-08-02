package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeClipsGoToAttachedVideoButtonShow implements SchemeStat$TypeView.b {

    @pmi0("event_type")
    private final String eventType;

    @pmi0("object_value")
    private final String objectValue;

    public MobileOfficialAppsVideoStat$TypeClipsGoToAttachedVideoButtonShow(String str, String str2) {
        this.eventType = str;
        this.objectValue = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeClipsGoToAttachedVideoButtonShow)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeClipsGoToAttachedVideoButtonShow mobileOfficialAppsVideoStat$TypeClipsGoToAttachedVideoButtonShow = (MobileOfficialAppsVideoStat$TypeClipsGoToAttachedVideoButtonShow) obj;
        return epx.f(this.eventType, mobileOfficialAppsVideoStat$TypeClipsGoToAttachedVideoButtonShow.eventType) && epx.f(this.objectValue, mobileOfficialAppsVideoStat$TypeClipsGoToAttachedVideoButtonShow.objectValue);
    }

    public final int hashCode() {
        return this.objectValue.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeClipsGoToAttachedVideoButtonShow(eventType=");
        sb.append(this.eventType);
        sb.append(", objectValue=");
        return ho8.a(sb, this.objectValue, ')');
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeClipsGoToAttachedVideoButtonShow(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "go_to_attached_video_button_show" : str, str2);
    }
}
