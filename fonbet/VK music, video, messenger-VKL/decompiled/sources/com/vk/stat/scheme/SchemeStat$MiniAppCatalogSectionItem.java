package com.vk.stat.scheme;

import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$MiniAppCatalogSectionItem {

    @pmi0("track_code")
    private final String trackCode;

    /* JADX WARN: Multi-variable type inference failed */
    public SchemeStat$MiniAppCatalogSectionItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SchemeStat$MiniAppCatalogSectionItem) && epx.f(this.trackCode, ((SchemeStat$MiniAppCatalogSectionItem) obj).trackCode);
    }

    public final int hashCode() {
        String str = this.trackCode;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("MiniAppCatalogSectionItem(trackCode="), this.trackCode, ')');
    }

    public SchemeStat$MiniAppCatalogSectionItem(String str) {
        this.trackCode = str;
    }

    public /* synthetic */ SchemeStat$MiniAppCatalogSectionItem(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
