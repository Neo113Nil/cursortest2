package com.vk.stat.scheme;

import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsMarusiaStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarusiaStat$TypeUniversalWidgetItem {

    @pmi0("action")
    private final String action;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("widget_id")
    private final int widgetId;

    public MobileOfficialAppsMarusiaStat$TypeUniversalWidgetItem(int i, String str, String str2) {
        this.widgetId = i;
        this.trackCode = str;
        this.action = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMarusiaStat$TypeUniversalWidgetItem)) {
            return false;
        }
        MobileOfficialAppsMarusiaStat$TypeUniversalWidgetItem mobileOfficialAppsMarusiaStat$TypeUniversalWidgetItem = (MobileOfficialAppsMarusiaStat$TypeUniversalWidgetItem) obj;
        return this.widgetId == mobileOfficialAppsMarusiaStat$TypeUniversalWidgetItem.widgetId && epx.f(this.trackCode, mobileOfficialAppsMarusiaStat$TypeUniversalWidgetItem.trackCode) && epx.f(this.action, mobileOfficialAppsMarusiaStat$TypeUniversalWidgetItem.action);
    }

    public final int hashCode() {
        int a = urd0.a(Integer.hashCode(this.widgetId) * 31, 31, this.trackCode);
        String str = this.action;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeUniversalWidgetItem(widgetId=");
        sb.append(this.widgetId);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", action=");
        return ho8.a(sb, this.action, ')');
    }

    public /* synthetic */ MobileOfficialAppsMarusiaStat$TypeUniversalWidgetItem(int i, String str, String str2, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : str2);
    }
}
