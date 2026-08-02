package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoStopRecommendingCreator implements SchemeStat$TypeClick.b {

    @pmi0("client_time")
    private final Long clientTime;

    @pmi0("event_source")
    private final String eventSource;

    @pmi0("screen_mode")
    private final MobileOfficialAppsVideoStat$TypeScreenMode screenMode;

    public MobileOfficialAppsVideoStat$TypeVideoStopRecommendingCreator() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoStopRecommendingCreator)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoStopRecommendingCreator mobileOfficialAppsVideoStat$TypeVideoStopRecommendingCreator = (MobileOfficialAppsVideoStat$TypeVideoStopRecommendingCreator) obj;
        return this.screenMode == mobileOfficialAppsVideoStat$TypeVideoStopRecommendingCreator.screenMode && epx.f(this.clientTime, mobileOfficialAppsVideoStat$TypeVideoStopRecommendingCreator.clientTime) && epx.f(this.eventSource, mobileOfficialAppsVideoStat$TypeVideoStopRecommendingCreator.eventSource);
    }

    public final int hashCode() {
        MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode = this.screenMode;
        int hashCode = (mobileOfficialAppsVideoStat$TypeScreenMode == null ? 0 : mobileOfficialAppsVideoStat$TypeScreenMode.hashCode()) * 31;
        Long l = this.clientTime;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.eventSource;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVideoStopRecommendingCreator(screenMode=");
        sb.append(this.screenMode);
        sb.append(", clientTime=");
        sb.append(this.clientTime);
        sb.append(", eventSource=");
        return ho8.a(sb, this.eventSource, ')');
    }

    public MobileOfficialAppsVideoStat$TypeVideoStopRecommendingCreator(MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, Long l, String str) {
        this.screenMode = mobileOfficialAppsVideoStat$TypeScreenMode;
        this.clientTime = l;
        this.eventSource = str;
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoStopRecommendingCreator(MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, Long l, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : mobileOfficialAppsVideoStat$TypeScreenMode, (i & 2) != 0 ? null : l, (i & 4) != 0 ? "action_menu" : str);
    }
}
