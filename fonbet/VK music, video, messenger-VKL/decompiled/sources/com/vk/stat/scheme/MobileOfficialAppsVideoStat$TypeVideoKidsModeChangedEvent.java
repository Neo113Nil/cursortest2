package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.pmi0;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoKidsModeChangedEvent implements SchemeStat$TypeAction.b {

    @pmi0("enabled")
    private final boolean enabled;

    public MobileOfficialAppsVideoStat$TypeVideoKidsModeChangedEvent(boolean z) {
        this.enabled = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsVideoStat$TypeVideoKidsModeChangedEvent) && this.enabled == ((MobileOfficialAppsVideoStat$TypeVideoKidsModeChangedEvent) obj).enabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.enabled);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("TypeVideoKidsModeChangedEvent(enabled="), this.enabled, ')');
    }
}
