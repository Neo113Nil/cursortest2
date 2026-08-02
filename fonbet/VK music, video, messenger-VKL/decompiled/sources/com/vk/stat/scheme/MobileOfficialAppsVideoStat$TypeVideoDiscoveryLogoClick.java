package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoDiscoveryLogoClick implements SchemeStat$TypeClick.b {

    @pmi0("video_progress_as_percentage")
    private final int videoProgressAsPercentage;

    public MobileOfficialAppsVideoStat$TypeVideoDiscoveryLogoClick(int i) {
        this.videoProgressAsPercentage = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsVideoStat$TypeVideoDiscoveryLogoClick) && this.videoProgressAsPercentage == ((MobileOfficialAppsVideoStat$TypeVideoDiscoveryLogoClick) obj).videoProgressAsPercentage;
    }

    public final int hashCode() {
        return Integer.hashCode(this.videoProgressAsPercentage);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("TypeVideoDiscoveryLogoClick(videoProgressAsPercentage="), this.videoProgressAsPercentage, ')');
    }
}
