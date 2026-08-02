package com.vk.stat.scheme;

import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsCoreSettingsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityPlayback {

    @pmi0(StatCustomFieldKey.NETWORK_TYPE)
    private final MobileOfficialAppsCoreSettingsStat$SettingNetworkType networkType;

    @pmi0("quality")
    private final MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset quality;

    @pmi0("screen_mode")
    private final MobileOfficialAppsVideoStat$TypeScreenMode screenMode;

    public MobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityPlayback(MobileOfficialAppsCoreSettingsStat$SettingNetworkType mobileOfficialAppsCoreSettingsStat$SettingNetworkType, MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode) {
        this.networkType = mobileOfficialAppsCoreSettingsStat$SettingNetworkType;
        this.quality = mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset;
        this.screenMode = mobileOfficialAppsVideoStat$TypeScreenMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityPlayback)) {
            return false;
        }
        MobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityPlayback mobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityPlayback = (MobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityPlayback) obj;
        return this.networkType == mobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityPlayback.networkType && this.quality == mobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityPlayback.quality && this.screenMode == mobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityPlayback.screenMode;
    }

    public final int hashCode() {
        int hashCode = (this.quality.hashCode() + (this.networkType.hashCode() * 31)) * 31;
        MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode = this.screenMode;
        return hashCode + (mobileOfficialAppsVideoStat$TypeScreenMode == null ? 0 : mobileOfficialAppsVideoStat$TypeScreenMode.hashCode());
    }

    public final String toString() {
        return "TypeSettingsVideoQualityPlayback(networkType=" + this.networkType + ", quality=" + this.quality + ", screenMode=" + this.screenMode + ')';
    }

    public /* synthetic */ MobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityPlayback(MobileOfficialAppsCoreSettingsStat$SettingNetworkType mobileOfficialAppsCoreSettingsStat$SettingNetworkType, MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, int i, zcl zclVar) {
        this(mobileOfficialAppsCoreSettingsStat$SettingNetworkType, mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset, (i & 4) != 0 ? null : mobileOfficialAppsVideoStat$TypeScreenMode);
    }
}
