package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$SuperappRecommendMenuItem {

    @pmi0("id")
    private final int id;

    @pmi0("superapp_item")
    private final SchemeStat$SuperappItem superappItem;

    public SchemeStat$SuperappRecommendMenuItem(int i, SchemeStat$SuperappItem schemeStat$SuperappItem) {
        this.id = i;
        this.superappItem = schemeStat$SuperappItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$SuperappRecommendMenuItem)) {
            return false;
        }
        SchemeStat$SuperappRecommendMenuItem schemeStat$SuperappRecommendMenuItem = (SchemeStat$SuperappRecommendMenuItem) obj;
        return this.id == schemeStat$SuperappRecommendMenuItem.id && epx.f(this.superappItem, schemeStat$SuperappRecommendMenuItem.superappItem);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        SchemeStat$SuperappItem schemeStat$SuperappItem = this.superappItem;
        return hashCode + (schemeStat$SuperappItem == null ? 0 : schemeStat$SuperappItem.hashCode());
    }

    public final String toString() {
        return "SuperappRecommendMenuItem(id=" + this.id + ", superappItem=" + this.superappItem + ')';
    }

    public /* synthetic */ SchemeStat$SuperappRecommendMenuItem(int i, SchemeStat$SuperappItem schemeStat$SuperappItem, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : schemeStat$SuperappItem);
    }
}
