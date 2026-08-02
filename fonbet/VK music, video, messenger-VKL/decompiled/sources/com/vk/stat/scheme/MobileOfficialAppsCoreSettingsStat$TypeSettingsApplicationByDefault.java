package com.vk.stat.scheme;

import xsna.pmi0;

/* compiled from: MobileOfficialAppsCoreSettingsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCoreSettingsStat$TypeSettingsApplicationByDefault {

    @pmi0("action")
    private final MobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItem action;

    @pmi0("app_name")
    private final MobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem appName;

    public MobileOfficialAppsCoreSettingsStat$TypeSettingsApplicationByDefault(MobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItem mobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItem, MobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem mobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem) {
        this.action = mobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItem;
        this.appName = mobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCoreSettingsStat$TypeSettingsApplicationByDefault)) {
            return false;
        }
        MobileOfficialAppsCoreSettingsStat$TypeSettingsApplicationByDefault mobileOfficialAppsCoreSettingsStat$TypeSettingsApplicationByDefault = (MobileOfficialAppsCoreSettingsStat$TypeSettingsApplicationByDefault) obj;
        return this.action == mobileOfficialAppsCoreSettingsStat$TypeSettingsApplicationByDefault.action && this.appName == mobileOfficialAppsCoreSettingsStat$TypeSettingsApplicationByDefault.appName;
    }

    public final int hashCode() {
        return this.appName.hashCode() + (this.action.hashCode() * 31);
    }

    public final String toString() {
        return "TypeSettingsApplicationByDefault(action=" + this.action + ", appName=" + this.appName + ')';
    }
}
