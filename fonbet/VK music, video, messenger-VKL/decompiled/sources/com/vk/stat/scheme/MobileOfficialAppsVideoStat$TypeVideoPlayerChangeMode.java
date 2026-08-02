package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoPlayerChangeMode implements SchemeStat$TypeAction.b {

    @pmi0("client_time")
    private final Long clientTime;

    @pmi0("current_tvt")
    private final Integer currentTvt;

    @pmi0("position_sec")
    private final int positionSec;

    @pmi0("screen_mode")
    private final MobileOfficialAppsVideoStat$TypeScreenMode screenMode;

    @pmi0("video")
    private final SchemeStat$EventItem video;

    @pmi0("vsid")
    private final CommonVideoStat$TypeVsidItem vsid;

    public MobileOfficialAppsVideoStat$TypeVideoPlayerChangeMode(MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, int i, SchemeStat$EventItem schemeStat$EventItem, CommonVideoStat$TypeVsidItem commonVideoStat$TypeVsidItem, Integer num, Long l) {
        this.screenMode = mobileOfficialAppsVideoStat$TypeScreenMode;
        this.positionSec = i;
        this.video = schemeStat$EventItem;
        this.vsid = commonVideoStat$TypeVsidItem;
        this.currentTvt = num;
        this.clientTime = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoPlayerChangeMode)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoPlayerChangeMode mobileOfficialAppsVideoStat$TypeVideoPlayerChangeMode = (MobileOfficialAppsVideoStat$TypeVideoPlayerChangeMode) obj;
        return this.screenMode == mobileOfficialAppsVideoStat$TypeVideoPlayerChangeMode.screenMode && this.positionSec == mobileOfficialAppsVideoStat$TypeVideoPlayerChangeMode.positionSec && epx.f(this.video, mobileOfficialAppsVideoStat$TypeVideoPlayerChangeMode.video) && epx.f(this.vsid, mobileOfficialAppsVideoStat$TypeVideoPlayerChangeMode.vsid) && epx.f(this.currentTvt, mobileOfficialAppsVideoStat$TypeVideoPlayerChangeMode.currentTvt) && epx.f(this.clientTime, mobileOfficialAppsVideoStat$TypeVideoPlayerChangeMode.clientTime);
    }

    public final int hashCode() {
        int hashCode = (this.video.hashCode() + shy.a(this.positionSec, this.screenMode.hashCode() * 31, 31)) * 31;
        CommonVideoStat$TypeVsidItem commonVideoStat$TypeVsidItem = this.vsid;
        int hashCode2 = (hashCode + (commonVideoStat$TypeVsidItem == null ? 0 : commonVideoStat$TypeVsidItem.a.hashCode())) * 31;
        Integer num = this.currentTvt;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.clientTime;
        return hashCode3 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVideoPlayerChangeMode(screenMode=");
        sb.append(this.screenMode);
        sb.append(", positionSec=");
        sb.append(this.positionSec);
        sb.append(", video=");
        sb.append(this.video);
        sb.append(", vsid=");
        sb.append(this.vsid);
        sb.append(", currentTvt=");
        sb.append(this.currentTvt);
        sb.append(", clientTime=");
        return iq.b(sb, this.clientTime, ')');
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoPlayerChangeMode(MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, int i, SchemeStat$EventItem schemeStat$EventItem, CommonVideoStat$TypeVsidItem commonVideoStat$TypeVsidItem, Integer num, Long l, int i2, zcl zclVar) {
        this(mobileOfficialAppsVideoStat$TypeScreenMode, i, schemeStat$EventItem, (i2 & 8) != 0 ? null : commonVideoStat$TypeVsidItem, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : l);
    }
}
