package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.epx;
import xsna.k73;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CommonVideoAdsStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoAdsStat$TypeOverlayAdRequest implements SchemeStat$TypeAction.b {

    @pmi0("allowed_by_config")
    private final boolean allowedByConfig;

    @pmi0("common_fields")
    private final Object commonFields;

    public CommonVideoAdsStat$TypeOverlayAdRequest(boolean z, Object obj) {
        this.allowedByConfig = z;
        this.commonFields = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoAdsStat$TypeOverlayAdRequest)) {
            return false;
        }
        CommonVideoAdsStat$TypeOverlayAdRequest commonVideoAdsStat$TypeOverlayAdRequest = (CommonVideoAdsStat$TypeOverlayAdRequest) obj;
        return this.allowedByConfig == commonVideoAdsStat$TypeOverlayAdRequest.allowedByConfig && epx.f(this.commonFields, commonVideoAdsStat$TypeOverlayAdRequest.commonFields);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.allowedByConfig) * 31;
        Object obj = this.commonFields;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeOverlayAdRequest(allowedByConfig=");
        sb.append(this.allowedByConfig);
        sb.append(", commonFields=");
        return k73.c(sb, this.commonFields, ')');
    }

    public /* synthetic */ CommonVideoAdsStat$TypeOverlayAdRequest(boolean z, Object obj, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : obj);
    }
}
