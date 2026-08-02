package com.vk.stat.scheme;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$CancelPublish {

    @pmi0("event_param")
    private final int eventParam;

    @pmi0(CampaignEx.JSON_KEY_VIDEO_LENGTHL)
    private final int videoLength;

    public MobileOfficialAppsClipsStat$CancelPublish(int i, int i2) {
        this.eventParam = i;
        this.videoLength = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$CancelPublish)) {
            return false;
        }
        MobileOfficialAppsClipsStat$CancelPublish mobileOfficialAppsClipsStat$CancelPublish = (MobileOfficialAppsClipsStat$CancelPublish) obj;
        return this.eventParam == mobileOfficialAppsClipsStat$CancelPublish.eventParam && this.videoLength == mobileOfficialAppsClipsStat$CancelPublish.videoLength;
    }

    public final int hashCode() {
        return Integer.hashCode(this.videoLength) + (Integer.hashCode(this.eventParam) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CancelPublish(eventParam=");
        sb.append(this.eventParam);
        sb.append(", videoLength=");
        return vu5.b(sb, this.videoLength, ')');
    }
}
