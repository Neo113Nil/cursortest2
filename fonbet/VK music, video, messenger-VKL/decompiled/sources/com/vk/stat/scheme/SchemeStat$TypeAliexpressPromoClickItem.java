package com.vk.stat.scheme;

import com.ironsource.X3;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeAliexpressPromoClickItem {

    @pmi0(X3.i.L)
    private final Integer position;

    @pmi0("target_url")
    private final String targetUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public SchemeStat$TypeAliexpressPromoClickItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeAliexpressPromoClickItem)) {
            return false;
        }
        SchemeStat$TypeAliexpressPromoClickItem schemeStat$TypeAliexpressPromoClickItem = (SchemeStat$TypeAliexpressPromoClickItem) obj;
        return epx.f(this.position, schemeStat$TypeAliexpressPromoClickItem.position) && epx.f(this.targetUrl, schemeStat$TypeAliexpressPromoClickItem.targetUrl);
    }

    public final int hashCode() {
        Integer num = this.position;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.targetUrl;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeAliexpressPromoClickItem(position=");
        sb.append(this.position);
        sb.append(", targetUrl=");
        return ho8.a(sb, this.targetUrl, ')');
    }

    public SchemeStat$TypeAliexpressPromoClickItem(Integer num, String str) {
        this.position = num;
        this.targetUrl = str;
    }

    public /* synthetic */ SchemeStat$TypeAliexpressPromoClickItem(Integer num, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
