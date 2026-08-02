package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$SuperappFintechItem {

    @pmi0("superapp_item")
    private final SchemeStat$SuperappItem superappItem;

    /* JADX WARN: Multi-variable type inference failed */
    public SchemeStat$SuperappFintechItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SchemeStat$SuperappFintechItem) && epx.f(this.superappItem, ((SchemeStat$SuperappFintechItem) obj).superappItem);
    }

    public final int hashCode() {
        SchemeStat$SuperappItem schemeStat$SuperappItem = this.superappItem;
        if (schemeStat$SuperappItem == null) {
            return 0;
        }
        return schemeStat$SuperappItem.hashCode();
    }

    public final String toString() {
        return "SuperappFintechItem(superappItem=" + this.superappItem + ')';
    }

    public SchemeStat$SuperappFintechItem(SchemeStat$SuperappItem schemeStat$SuperappItem) {
        this.superappItem = schemeStat$SuperappItem;
    }

    public /* synthetic */ SchemeStat$SuperappFintechItem(SchemeStat$SuperappItem schemeStat$SuperappItem, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : schemeStat$SuperappItem);
    }
}
