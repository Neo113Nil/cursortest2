package com.vk.stat.scheme;

import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeClipsApplyConstructor {

    @pmi0("markers")
    private final String markers;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsClipsStat$TypeClipsApplyConstructor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsClipsStat$TypeClipsApplyConstructor) && epx.f(this.markers, ((MobileOfficialAppsClipsStat$TypeClipsApplyConstructor) obj).markers);
    }

    public final int hashCode() {
        String str = this.markers;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("TypeClipsApplyConstructor(markers="), this.markers, ')');
    }

    public MobileOfficialAppsClipsStat$TypeClipsApplyConstructor(String str) {
        this.markers = str;
    }

    public /* synthetic */ MobileOfficialAppsClipsStat$TypeClipsApplyConstructor(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
