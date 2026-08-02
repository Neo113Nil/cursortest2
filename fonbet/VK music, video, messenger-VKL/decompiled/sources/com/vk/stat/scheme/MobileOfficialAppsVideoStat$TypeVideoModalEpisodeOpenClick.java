package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoModalEpisodeOpenClick implements SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final String eventType;

    @pmi0("screen_mode")
    private final MobileOfficialAppsVideoStat$TypeScreenMode screenMode;

    public MobileOfficialAppsVideoStat$TypeVideoModalEpisodeOpenClick(String str, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode) {
        this.eventType = str;
        this.screenMode = mobileOfficialAppsVideoStat$TypeScreenMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoModalEpisodeOpenClick)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoModalEpisodeOpenClick mobileOfficialAppsVideoStat$TypeVideoModalEpisodeOpenClick = (MobileOfficialAppsVideoStat$TypeVideoModalEpisodeOpenClick) obj;
        return epx.f(this.eventType, mobileOfficialAppsVideoStat$TypeVideoModalEpisodeOpenClick.eventType) && this.screenMode == mobileOfficialAppsVideoStat$TypeVideoModalEpisodeOpenClick.screenMode;
    }

    public final int hashCode() {
        return this.screenMode.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        return "TypeVideoModalEpisodeOpenClick(eventType=" + this.eventType + ", screenMode=" + this.screenMode + ')';
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoModalEpisodeOpenClick(String str, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, int i, zcl zclVar) {
        this((i & 1) != 0 ? "modal_episode_open" : str, mobileOfficialAppsVideoStat$TypeScreenMode);
    }
}
