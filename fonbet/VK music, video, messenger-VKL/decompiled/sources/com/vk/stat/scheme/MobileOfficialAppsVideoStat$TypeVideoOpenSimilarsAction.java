package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoOpenSimilarsAction implements SchemeStat$TypeAction.b {

    @pmi0("event_source")
    private final MobileOfficialAppsVideoStat$VideoEventSource eventSource;

    @pmi0("screen_mode")
    private final MobileOfficialAppsVideoStat$TypeScreenMode screenMode;

    public MobileOfficialAppsVideoStat$TypeVideoOpenSimilarsAction(MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, MobileOfficialAppsVideoStat$VideoEventSource mobileOfficialAppsVideoStat$VideoEventSource) {
        this.screenMode = mobileOfficialAppsVideoStat$TypeScreenMode;
        this.eventSource = mobileOfficialAppsVideoStat$VideoEventSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoOpenSimilarsAction)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoOpenSimilarsAction mobileOfficialAppsVideoStat$TypeVideoOpenSimilarsAction = (MobileOfficialAppsVideoStat$TypeVideoOpenSimilarsAction) obj;
        return this.screenMode == mobileOfficialAppsVideoStat$TypeVideoOpenSimilarsAction.screenMode && this.eventSource == mobileOfficialAppsVideoStat$TypeVideoOpenSimilarsAction.eventSource;
    }

    public final int hashCode() {
        int hashCode = this.screenMode.hashCode() * 31;
        MobileOfficialAppsVideoStat$VideoEventSource mobileOfficialAppsVideoStat$VideoEventSource = this.eventSource;
        return hashCode + (mobileOfficialAppsVideoStat$VideoEventSource == null ? 0 : mobileOfficialAppsVideoStat$VideoEventSource.hashCode());
    }

    public final String toString() {
        return "TypeVideoOpenSimilarsAction(screenMode=" + this.screenMode + ", eventSource=" + this.eventSource + ')';
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoOpenSimilarsAction(MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, MobileOfficialAppsVideoStat$VideoEventSource mobileOfficialAppsVideoStat$VideoEventSource, int i, zcl zclVar) {
        this(mobileOfficialAppsVideoStat$TypeScreenMode, (i & 2) != 0 ? null : mobileOfficialAppsVideoStat$VideoEventSource);
    }
}
