package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeOwnerButtonAppClick implements SchemeStat$TypeClick.b {

    @pmi0("app_id")
    private final int appId;

    public SchemeStat$TypeOwnerButtonAppClick(int i) {
        this.appId = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SchemeStat$TypeOwnerButtonAppClick) && this.appId == ((SchemeStat$TypeOwnerButtonAppClick) obj).appId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.appId);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("TypeOwnerButtonAppClick(appId="), this.appId, ')');
    }
}
