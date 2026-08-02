package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterSelect implements SchemeStat$TypeAction.b {

    @pmi0("object_value")
    private final String objectValue;

    public MobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterSelect(String str) {
        this.objectValue = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterSelect) && epx.f(this.objectValue, ((MobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterSelect) obj).objectValue);
    }

    public final int hashCode() {
        return this.objectValue.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("TypeVideoKidsAgeFilterSelect(objectValue="), this.objectValue, ')');
    }
}
