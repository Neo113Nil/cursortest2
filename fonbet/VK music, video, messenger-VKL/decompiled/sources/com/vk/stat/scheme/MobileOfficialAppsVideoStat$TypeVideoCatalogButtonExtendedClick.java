package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoCatalogButtonExtendedClick implements SchemeStat$TypeClick.b {

    @pmi0("click_source")
    private final String clickSource;

    public MobileOfficialAppsVideoStat$TypeVideoCatalogButtonExtendedClick(String str) {
        this.clickSource = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsVideoStat$TypeVideoCatalogButtonExtendedClick) && epx.f(this.clickSource, ((MobileOfficialAppsVideoStat$TypeVideoCatalogButtonExtendedClick) obj).clickSource);
    }

    public final int hashCode() {
        return this.clickSource.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("TypeVideoCatalogButtonExtendedClick(clickSource="), this.clickSource, ')');
    }
}
