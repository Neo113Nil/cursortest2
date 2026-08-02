package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoOpenCommentsClick implements SchemeStat$TypeClick.b {

    @pmi0("client_time")
    private final Long clientTime;

    @pmi0("screen_mode")
    private final MobileOfficialAppsVideoStat$TypeScreenMode screenMode;

    public MobileOfficialAppsVideoStat$TypeVideoOpenCommentsClick(MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, Long l) {
        this.screenMode = mobileOfficialAppsVideoStat$TypeScreenMode;
        this.clientTime = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoOpenCommentsClick)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoOpenCommentsClick mobileOfficialAppsVideoStat$TypeVideoOpenCommentsClick = (MobileOfficialAppsVideoStat$TypeVideoOpenCommentsClick) obj;
        return this.screenMode == mobileOfficialAppsVideoStat$TypeVideoOpenCommentsClick.screenMode && epx.f(this.clientTime, mobileOfficialAppsVideoStat$TypeVideoOpenCommentsClick.clientTime);
    }

    public final int hashCode() {
        int hashCode = this.screenMode.hashCode() * 31;
        Long l = this.clientTime;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVideoOpenCommentsClick(screenMode=");
        sb.append(this.screenMode);
        sb.append(", clientTime=");
        return iq.b(sb, this.clientTime, ')');
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoOpenCommentsClick(MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, Long l, int i, zcl zclVar) {
        this(mobileOfficialAppsVideoStat$TypeScreenMode, (i & 2) != 0 ? null : l);
    }
}
