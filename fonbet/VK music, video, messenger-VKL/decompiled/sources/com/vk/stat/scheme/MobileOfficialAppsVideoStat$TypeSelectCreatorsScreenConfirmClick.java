package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick implements SchemeStat$TypeAction.b, SchemeStat$TypeClick.b {

    @pmi0("object_value")
    private final String objectValue;

    public MobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick(String str) {
        this.objectValue = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick) && epx.f(this.objectValue, ((MobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick) obj).objectValue);
    }

    public final int hashCode() {
        return this.objectValue.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("TypeSelectCreatorsScreenConfirmClick(objectValue="), this.objectValue, ')');
    }
}
