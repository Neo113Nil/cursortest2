package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.pmi0;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoOpenDescriptionModalClick implements SchemeStat$TypeClick.b {

    @pmi0("screen_mode")
    private final MobileOfficialAppsVideoStat$TypeScreenMode screenMode;

    public MobileOfficialAppsVideoStat$TypeVideoOpenDescriptionModalClick(MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode) {
        this.screenMode = mobileOfficialAppsVideoStat$TypeScreenMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsVideoStat$TypeVideoOpenDescriptionModalClick) && this.screenMode == ((MobileOfficialAppsVideoStat$TypeVideoOpenDescriptionModalClick) obj).screenMode;
    }

    public final int hashCode() {
        return this.screenMode.hashCode();
    }

    public final String toString() {
        return "TypeVideoOpenDescriptionModalClick(screenMode=" + this.screenMode + ')';
    }
}
