package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoDescriptionClick implements SchemeStat$TypeClick.b {

    @pmi0("value")
    private final String value;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsVideoStat$TypeVideoDescriptionClick() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final String a() {
        return this.value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsVideoStat$TypeVideoDescriptionClick) && epx.f(this.value, ((MobileOfficialAppsVideoStat$TypeVideoDescriptionClick) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("TypeVideoDescriptionClick(value="), this.value, ')');
    }

    public MobileOfficialAppsVideoStat$TypeVideoDescriptionClick(String str) {
        this.value = str;
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoDescriptionClick(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? "show_more_description" : str);
    }
}
