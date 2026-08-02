package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsMiniappsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMiniappsStat$TypeMiniAppOpenItem implements SchemeStat$TypeAction.b {

    @pmi0("app_id")
    private final MobileOfficialAppsMiniappsStat$AppIdItem appId;

    @pmi0("track_code")
    private final CommonStat$TypeTrackCodeItem trackCode;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsMiniappsStat$TypeMiniAppOpenItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMiniappsStat$TypeMiniAppOpenItem)) {
            return false;
        }
        MobileOfficialAppsMiniappsStat$TypeMiniAppOpenItem mobileOfficialAppsMiniappsStat$TypeMiniAppOpenItem = (MobileOfficialAppsMiniappsStat$TypeMiniAppOpenItem) obj;
        return epx.f(this.appId, mobileOfficialAppsMiniappsStat$TypeMiniAppOpenItem.appId) && epx.f(this.trackCode, mobileOfficialAppsMiniappsStat$TypeMiniAppOpenItem.trackCode);
    }

    public final int hashCode() {
        MobileOfficialAppsMiniappsStat$AppIdItem mobileOfficialAppsMiniappsStat$AppIdItem = this.appId;
        int hashCode = (mobileOfficialAppsMiniappsStat$AppIdItem == null ? 0 : mobileOfficialAppsMiniappsStat$AppIdItem.hashCode()) * 31;
        CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem = this.trackCode;
        return hashCode + (commonStat$TypeTrackCodeItem != null ? commonStat$TypeTrackCodeItem.a.hashCode() : 0);
    }

    public final String toString() {
        return "TypeMiniAppOpenItem(appId=" + this.appId + ", trackCode=" + this.trackCode + ')';
    }

    public MobileOfficialAppsMiniappsStat$TypeMiniAppOpenItem(MobileOfficialAppsMiniappsStat$AppIdItem mobileOfficialAppsMiniappsStat$AppIdItem, CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem) {
        this.appId = mobileOfficialAppsMiniappsStat$AppIdItem;
        this.trackCode = commonStat$TypeTrackCodeItem;
    }

    public /* synthetic */ MobileOfficialAppsMiniappsStat$TypeMiniAppOpenItem(MobileOfficialAppsMiniappsStat$AppIdItem mobileOfficialAppsMiniappsStat$AppIdItem, CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : mobileOfficialAppsMiniappsStat$AppIdItem, (i & 2) != 0 ? null : commonStat$TypeTrackCodeItem);
    }
}
