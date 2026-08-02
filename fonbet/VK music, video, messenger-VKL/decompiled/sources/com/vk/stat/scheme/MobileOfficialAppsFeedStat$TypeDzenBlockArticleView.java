package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeDzenBlockArticleView implements SchemeStat$TypeView.b {

    @pmi0("track_code")
    private final CommonStat$TypeTrackCodeItem trackCode;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsFeedStat$TypeDzenBlockArticleView() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsFeedStat$TypeDzenBlockArticleView) && epx.f(this.trackCode, ((MobileOfficialAppsFeedStat$TypeDzenBlockArticleView) obj).trackCode);
    }

    public final int hashCode() {
        CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem = this.trackCode;
        if (commonStat$TypeTrackCodeItem == null) {
            return 0;
        }
        return commonStat$TypeTrackCodeItem.a.hashCode();
    }

    public final String toString() {
        return "TypeDzenBlockArticleView(trackCode=" + this.trackCode + ')';
    }

    public MobileOfficialAppsFeedStat$TypeDzenBlockArticleView(CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem) {
        this.trackCode = commonStat$TypeTrackCodeItem;
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$TypeDzenBlockArticleView(CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : commonStat$TypeTrackCodeItem);
    }
}
