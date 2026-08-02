package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.pmi0;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoShowSimilarsButtonAction implements SchemeStat$TypeAction.b {

    @pmi0("screen_mode")
    private final MobileOfficialAppsVideoStat$TypeScreenMode screenMode;

    public MobileOfficialAppsVideoStat$TypeVideoShowSimilarsButtonAction(MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode) {
        this.screenMode = mobileOfficialAppsVideoStat$TypeScreenMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsVideoStat$TypeVideoShowSimilarsButtonAction) && this.screenMode == ((MobileOfficialAppsVideoStat$TypeVideoShowSimilarsButtonAction) obj).screenMode;
    }

    public final int hashCode() {
        return this.screenMode.hashCode();
    }

    public final String toString() {
        return "TypeVideoShowSimilarsButtonAction(screenMode=" + this.screenMode + ')';
    }
}
