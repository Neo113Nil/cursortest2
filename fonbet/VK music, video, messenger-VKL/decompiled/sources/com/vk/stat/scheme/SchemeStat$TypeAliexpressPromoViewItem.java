package com.vk.stat.scheme;

import com.ironsource.X3;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeAliexpressPromoViewItem {

    @pmi0("owner_id")
    private final Long ownerId;

    @pmi0(X3.i.L)
    private final Integer position;

    /* JADX WARN: Multi-variable type inference failed */
    public SchemeStat$TypeAliexpressPromoViewItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeAliexpressPromoViewItem)) {
            return false;
        }
        SchemeStat$TypeAliexpressPromoViewItem schemeStat$TypeAliexpressPromoViewItem = (SchemeStat$TypeAliexpressPromoViewItem) obj;
        return epx.f(this.position, schemeStat$TypeAliexpressPromoViewItem.position) && epx.f(this.ownerId, schemeStat$TypeAliexpressPromoViewItem.ownerId);
    }

    public final int hashCode() {
        Integer num = this.position;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.ownerId;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeAliexpressPromoViewItem(position=");
        sb.append(this.position);
        sb.append(", ownerId=");
        return iq.b(sb, this.ownerId, ')');
    }

    public SchemeStat$TypeAliexpressPromoViewItem(Integer num, Long l) {
        this.position = num;
        this.ownerId = l;
    }

    public /* synthetic */ SchemeStat$TypeAliexpressPromoViewItem(Integer num, Long l, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : l);
    }
}
