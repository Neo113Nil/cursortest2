package com.vk.stat.scheme;

import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsMiniappsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMiniappsStat$AppIdItem {

    @pmi0("app_id")
    private final Long appId;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsMiniappsStat$AppIdItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsMiniappsStat$AppIdItem) && epx.f(this.appId, ((MobileOfficialAppsMiniappsStat$AppIdItem) obj).appId);
    }

    public final int hashCode() {
        Long l = this.appId;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        return iq.b(new StringBuilder("AppIdItem(appId="), this.appId, ')');
    }

    public MobileOfficialAppsMiniappsStat$AppIdItem(Long l) {
        this.appId = l;
    }

    public /* synthetic */ MobileOfficialAppsMiniappsStat$AppIdItem(Long l, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : l);
    }
}
