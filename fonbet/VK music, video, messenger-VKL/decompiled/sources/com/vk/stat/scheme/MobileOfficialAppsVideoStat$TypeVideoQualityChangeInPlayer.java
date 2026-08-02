package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoQualityChangeInPlayer implements SchemeStat$TypeClick.b {

    @pmi0("quality")
    private final MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityItem quality;

    @pmi0("quality_preset")
    private final MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset qualityPreset;

    @pmi0("screen_mode")
    private final MobileOfficialAppsVideoStat$TypeScreenMode screenMode;

    @pmi0("vsid")
    private final CommonVideoStat$TypeVsidItem vsid;

    public MobileOfficialAppsVideoStat$TypeVideoQualityChangeInPlayer(MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset, CommonVideoStat$TypeVsidItem commonVideoStat$TypeVsidItem, MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityItem mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityItem, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode) {
        this.qualityPreset = mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset;
        this.vsid = commonVideoStat$TypeVsidItem;
        this.quality = mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityItem;
        this.screenMode = mobileOfficialAppsVideoStat$TypeScreenMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoQualityChangeInPlayer)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoQualityChangeInPlayer mobileOfficialAppsVideoStat$TypeVideoQualityChangeInPlayer = (MobileOfficialAppsVideoStat$TypeVideoQualityChangeInPlayer) obj;
        return this.qualityPreset == mobileOfficialAppsVideoStat$TypeVideoQualityChangeInPlayer.qualityPreset && epx.f(this.vsid, mobileOfficialAppsVideoStat$TypeVideoQualityChangeInPlayer.vsid) && this.quality == mobileOfficialAppsVideoStat$TypeVideoQualityChangeInPlayer.quality && this.screenMode == mobileOfficialAppsVideoStat$TypeVideoQualityChangeInPlayer.screenMode;
    }

    public final int hashCode() {
        int a = urd0.a(this.qualityPreset.hashCode() * 31, 31, this.vsid.a);
        MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityItem mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityItem = this.quality;
        int hashCode = (a + (mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityItem == null ? 0 : mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityItem.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode = this.screenMode;
        return hashCode + (mobileOfficialAppsVideoStat$TypeScreenMode != null ? mobileOfficialAppsVideoStat$TypeScreenMode.hashCode() : 0);
    }

    public final String toString() {
        return "TypeVideoQualityChangeInPlayer(qualityPreset=" + this.qualityPreset + ", vsid=" + this.vsid + ", quality=" + this.quality + ", screenMode=" + this.screenMode + ')';
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoQualityChangeInPlayer(MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset, CommonVideoStat$TypeVsidItem commonVideoStat$TypeVsidItem, MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityItem mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityItem, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, int i, zcl zclVar) {
        this(mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset, commonVideoStat$TypeVsidItem, (i & 4) != 0 ? null : mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityItem, (i & 8) != 0 ? null : mobileOfficialAppsVideoStat$TypeScreenMode);
    }
}
