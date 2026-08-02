package com.vk.stat.scheme;

import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsMarusiaStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarusiaStat$TypeDaySummaryAppWidgetItem {

    @pmi0("navigation_source")
    private final String navigationSource;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsMarusiaStat$TypeDaySummaryAppWidgetItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsMarusiaStat$TypeDaySummaryAppWidgetItem) && epx.f(this.navigationSource, ((MobileOfficialAppsMarusiaStat$TypeDaySummaryAppWidgetItem) obj).navigationSource);
    }

    public final int hashCode() {
        String str = this.navigationSource;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("TypeDaySummaryAppWidgetItem(navigationSource="), this.navigationSource, ')');
    }

    public MobileOfficialAppsMarusiaStat$TypeDaySummaryAppWidgetItem(String str) {
        this.navigationSource = str;
    }

    public /* synthetic */ MobileOfficialAppsMarusiaStat$TypeDaySummaryAppWidgetItem(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
