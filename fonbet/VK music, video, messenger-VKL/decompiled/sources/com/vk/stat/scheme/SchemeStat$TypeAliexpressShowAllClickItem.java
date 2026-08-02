package com.vk.stat.scheme;

import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeAliexpressShowAllClickItem {

    @pmi0("target_url")
    private final String targetUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public SchemeStat$TypeAliexpressShowAllClickItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SchemeStat$TypeAliexpressShowAllClickItem) && epx.f(this.targetUrl, ((SchemeStat$TypeAliexpressShowAllClickItem) obj).targetUrl);
    }

    public final int hashCode() {
        String str = this.targetUrl;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("TypeAliexpressShowAllClickItem(targetUrl="), this.targetUrl, ')');
    }

    public SchemeStat$TypeAliexpressShowAllClickItem(String str) {
        this.targetUrl = str;
    }

    public /* synthetic */ SchemeStat$TypeAliexpressShowAllClickItem(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
