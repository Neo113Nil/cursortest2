package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.pmi0;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeAutoplayTurnClick implements SchemeStat$TypeClick.b {

    @pmi0("is_on")
    private final boolean isOn;

    public MobileOfficialAppsVideoStat$TypeAutoplayTurnClick(boolean z) {
        this.isOn = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsVideoStat$TypeAutoplayTurnClick) && this.isOn == ((MobileOfficialAppsVideoStat$TypeAutoplayTurnClick) obj).isOn;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isOn);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("TypeAutoplayTurnClick(isOn="), this.isOn, ')');
    }
}
