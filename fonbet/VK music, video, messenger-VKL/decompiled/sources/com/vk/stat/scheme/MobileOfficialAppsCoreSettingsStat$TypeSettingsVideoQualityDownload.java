package com.vk.stat.scheme;

import xsna.pmi0;

/* compiled from: MobileOfficialAppsCoreSettingsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityDownload {

    @pmi0("quality")
    private final MobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem quality;

    public MobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityDownload(MobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem mobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem) {
        this.quality = mobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityDownload) && this.quality == ((MobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityDownload) obj).quality;
    }

    public final int hashCode() {
        return this.quality.hashCode();
    }

    public final String toString() {
        return "TypeSettingsVideoQualityDownload(quality=" + this.quality + ')';
    }
}
