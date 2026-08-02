package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeHiddenSourceOpenProfile implements SchemeStat$TypeClick.b {

    @pmi0("source_id")
    private final long sourceId;

    public MobileOfficialAppsFeedStat$TypeHiddenSourceOpenProfile(long j) {
        this.sourceId = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsFeedStat$TypeHiddenSourceOpenProfile) && this.sourceId == ((MobileOfficialAppsFeedStat$TypeHiddenSourceOpenProfile) obj).sourceId;
    }

    public final int hashCode() {
        return Long.hashCode(this.sourceId);
    }

    public final String toString() {
        return vu5.a(')', this.sourceId, new StringBuilder("TypeHiddenSourceOpenProfile(sourceId="));
    }
}
