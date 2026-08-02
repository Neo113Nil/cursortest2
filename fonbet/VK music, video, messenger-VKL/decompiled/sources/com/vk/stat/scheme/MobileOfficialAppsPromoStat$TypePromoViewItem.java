package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.epx;
import xsna.pmi0;

/* compiled from: MobileOfficialAppsPromoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsPromoStat$TypePromoViewItem implements SchemeStat$TypeView.b {

    @pmi0("type_promo_item")
    private final MobileOfficialAppsPromoStat$TypePromoItem typePromoItem;

    public MobileOfficialAppsPromoStat$TypePromoViewItem(MobileOfficialAppsPromoStat$TypePromoItem mobileOfficialAppsPromoStat$TypePromoItem) {
        this.typePromoItem = mobileOfficialAppsPromoStat$TypePromoItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsPromoStat$TypePromoViewItem) && epx.f(this.typePromoItem, ((MobileOfficialAppsPromoStat$TypePromoViewItem) obj).typePromoItem);
    }

    public final int hashCode() {
        return this.typePromoItem.hashCode();
    }

    public final String toString() {
        return "TypePromoViewItem(typePromoItem=" + this.typePromoItem + ')';
    }
}
