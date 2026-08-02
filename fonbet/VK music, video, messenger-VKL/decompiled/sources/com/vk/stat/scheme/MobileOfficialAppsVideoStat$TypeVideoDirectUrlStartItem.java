package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.epx;
import xsna.pmi0;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoDirectUrlStartItem implements SchemeStat$TypeClick.b {

    @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
    private final CommonStat$TypeCommonEventItem item;

    public MobileOfficialAppsVideoStat$TypeVideoDirectUrlStartItem(CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem) {
        this.item = commonStat$TypeCommonEventItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsVideoStat$TypeVideoDirectUrlStartItem) && epx.f(this.item, ((MobileOfficialAppsVideoStat$TypeVideoDirectUrlStartItem) obj).item);
    }

    public final int hashCode() {
        return this.item.hashCode();
    }

    public final String toString() {
        return "TypeVideoDirectUrlStartItem(item=" + this.item + ')';
    }
}
