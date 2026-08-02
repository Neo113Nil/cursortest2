package com.vk.stat.sak.scheme;

import com.vk.stat.sak.scheme.SchemeStatSak$TypeAction;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SchemeStatSak.kt */
/* loaded from: classes11.dex */
public final class SchemeStatSak$TypeDebugStatsItem implements SchemeStatSak$TypeAction.b {

    @pmi0("description")
    private final String description;

    @pmi0("description_numeric")
    private final Float descriptionNumeric;

    @pmi0("event_type")
    private final String eventType;

    @pmi0("json")
    private final String json;

    public SchemeStatSak$TypeDebugStatsItem(String str, String str2, Float f, String str3) {
        this.eventType = str;
        this.description = str2;
        this.descriptionNumeric = f;
        this.json = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStatSak$TypeDebugStatsItem)) {
            return false;
        }
        SchemeStatSak$TypeDebugStatsItem schemeStatSak$TypeDebugStatsItem = (SchemeStatSak$TypeDebugStatsItem) obj;
        return epx.f(this.eventType, schemeStatSak$TypeDebugStatsItem.eventType) && epx.f(this.description, schemeStatSak$TypeDebugStatsItem.description) && epx.f(this.descriptionNumeric, schemeStatSak$TypeDebugStatsItem.descriptionNumeric) && epx.f(this.json, schemeStatSak$TypeDebugStatsItem.json);
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.descriptionNumeric;
        int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        String str2 = this.json;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeDebugStatsItem(eventType=");
        sb.append(this.eventType);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", descriptionNumeric=");
        sb.append(this.descriptionNumeric);
        sb.append(", json=");
        return ho8.a(sb, this.json, ')');
    }

    public /* synthetic */ SchemeStatSak$TypeDebugStatsItem(String str, String str2, Float f, String str3, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : f, (i & 8) != 0 ? null : str3);
    }
}
