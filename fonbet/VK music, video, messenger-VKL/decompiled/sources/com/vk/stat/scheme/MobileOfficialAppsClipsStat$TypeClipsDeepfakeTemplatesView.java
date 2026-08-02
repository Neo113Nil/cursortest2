package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeClipsDeepfakeTemplatesView implements SchemeStat$TypeView.b {

    @pmi0("celebrity_name")
    private final String celebrityName;

    public MobileOfficialAppsClipsStat$TypeClipsDeepfakeTemplatesView(String str) {
        this.celebrityName = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsClipsStat$TypeClipsDeepfakeTemplatesView) && epx.f(this.celebrityName, ((MobileOfficialAppsClipsStat$TypeClipsDeepfakeTemplatesView) obj).celebrityName);
    }

    public final int hashCode() {
        return this.celebrityName.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("TypeClipsDeepfakeTemplatesView(celebrityName="), this.celebrityName, ')');
    }
}
