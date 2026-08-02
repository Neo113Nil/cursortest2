package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$MarketAliexpressMiniature {

    @pmi0("ae_id")
    private final String aeId;

    @pmi0("is_shown")
    private final boolean isShown;

    public SchemeStat$MarketAliexpressMiniature(String str, boolean z) {
        this.aeId = str;
        this.isShown = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$MarketAliexpressMiniature)) {
            return false;
        }
        SchemeStat$MarketAliexpressMiniature schemeStat$MarketAliexpressMiniature = (SchemeStat$MarketAliexpressMiniature) obj;
        return epx.f(this.aeId, schemeStat$MarketAliexpressMiniature.aeId) && this.isShown == schemeStat$MarketAliexpressMiniature.isShown;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isShown) + (this.aeId.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketAliexpressMiniature(aeId=");
        sb.append(this.aeId);
        sb.append(", isShown=");
        return defpackage.q0.a(sb, this.isShown, ')');
    }
}
