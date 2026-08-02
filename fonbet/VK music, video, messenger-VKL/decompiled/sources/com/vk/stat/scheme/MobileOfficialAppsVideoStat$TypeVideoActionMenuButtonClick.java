package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoActionMenuButtonClick implements SchemeStat$TypeClick.b {

    @pmi0("client_time")
    private final Long clientTime;

    @pmi0("screen_mode")
    private final MobileOfficialAppsVideoStat$TypeScreenMode screenMode;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsVideoStat$TypeVideoActionMenuButtonClick() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoActionMenuButtonClick)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoActionMenuButtonClick mobileOfficialAppsVideoStat$TypeVideoActionMenuButtonClick = (MobileOfficialAppsVideoStat$TypeVideoActionMenuButtonClick) obj;
        return this.screenMode == mobileOfficialAppsVideoStat$TypeVideoActionMenuButtonClick.screenMode && epx.f(this.clientTime, mobileOfficialAppsVideoStat$TypeVideoActionMenuButtonClick.clientTime);
    }

    public final int hashCode() {
        MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode = this.screenMode;
        int hashCode = (mobileOfficialAppsVideoStat$TypeScreenMode == null ? 0 : mobileOfficialAppsVideoStat$TypeScreenMode.hashCode()) * 31;
        Long l = this.clientTime;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVideoActionMenuButtonClick(screenMode=");
        sb.append(this.screenMode);
        sb.append(", clientTime=");
        return iq.b(sb, this.clientTime, ')');
    }

    public MobileOfficialAppsVideoStat$TypeVideoActionMenuButtonClick(MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, Long l) {
        this.screenMode = mobileOfficialAppsVideoStat$TypeScreenMode;
        this.clientTime = l;
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoActionMenuButtonClick(MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, Long l, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : mobileOfficialAppsVideoStat$TypeScreenMode, (i & 2) != 0 ? null : l);
    }
}
