package com.vk.stat.scheme;

import xsna.pmi0;
import xsna.vu5;

/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$ContentIdParam {

    @pmi0("content_id")
    private final long contentId;

    public MobileOfficialAppsConPhotosStat$ContentIdParam(long j) {
        this.contentId = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsConPhotosStat$ContentIdParam) && this.contentId == ((MobileOfficialAppsConPhotosStat$ContentIdParam) obj).contentId;
    }

    public final int hashCode() {
        return Long.hashCode(this.contentId);
    }

    public final String toString() {
        return vu5.a(')', this.contentId, new StringBuilder("ContentIdParam(contentId="));
    }
}
