package com.vk.stat.scheme;

import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsConPostingStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPostingStat$PosterInfo {

    @pmi0("background_id")
    private final int backgroundId;

    @pmi0("background_owner_id")
    private final Long backgroundOwnerId;

    public MobileOfficialAppsConPostingStat$PosterInfo(int i, Long l) {
        this.backgroundId = i;
        this.backgroundOwnerId = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPostingStat$PosterInfo)) {
            return false;
        }
        MobileOfficialAppsConPostingStat$PosterInfo mobileOfficialAppsConPostingStat$PosterInfo = (MobileOfficialAppsConPostingStat$PosterInfo) obj;
        return this.backgroundId == mobileOfficialAppsConPostingStat$PosterInfo.backgroundId && epx.f(this.backgroundOwnerId, mobileOfficialAppsConPostingStat$PosterInfo.backgroundOwnerId);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.backgroundId) * 31;
        Long l = this.backgroundOwnerId;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PosterInfo(backgroundId=");
        sb.append(this.backgroundId);
        sb.append(", backgroundOwnerId=");
        return iq.b(sb, this.backgroundOwnerId, ')');
    }

    public /* synthetic */ MobileOfficialAppsConPostingStat$PosterInfo(int i, Long l, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : l);
    }
}
