package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoDownloadClick implements SchemeStat$TypeClick.b {

    @pmi0("client_time")
    private final Long clientTime;

    @pmi0("event_source")
    private final MobileOfficialAppsVideoStat$VideoEventSource eventSource;

    @pmi0("screen_mode")
    private final MobileOfficialAppsVideoStat$TypeScreenMode screenMode;

    @pmi0("value")
    private final String value;

    public MobileOfficialAppsVideoStat$TypeVideoDownloadClick() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoDownloadClick)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoDownloadClick mobileOfficialAppsVideoStat$TypeVideoDownloadClick = (MobileOfficialAppsVideoStat$TypeVideoDownloadClick) obj;
        return epx.f(this.value, mobileOfficialAppsVideoStat$TypeVideoDownloadClick.value) && this.screenMode == mobileOfficialAppsVideoStat$TypeVideoDownloadClick.screenMode && epx.f(this.clientTime, mobileOfficialAppsVideoStat$TypeVideoDownloadClick.clientTime) && this.eventSource == mobileOfficialAppsVideoStat$TypeVideoDownloadClick.eventSource;
    }

    public final int hashCode() {
        int hashCode = this.value.hashCode() * 31;
        MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode = this.screenMode;
        int hashCode2 = (hashCode + (mobileOfficialAppsVideoStat$TypeScreenMode == null ? 0 : mobileOfficialAppsVideoStat$TypeScreenMode.hashCode())) * 31;
        Long l = this.clientTime;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        MobileOfficialAppsVideoStat$VideoEventSource mobileOfficialAppsVideoStat$VideoEventSource = this.eventSource;
        return hashCode3 + (mobileOfficialAppsVideoStat$VideoEventSource != null ? mobileOfficialAppsVideoStat$VideoEventSource.hashCode() : 0);
    }

    public final String toString() {
        return "TypeVideoDownloadClick(value=" + this.value + ", screenMode=" + this.screenMode + ", clientTime=" + this.clientTime + ", eventSource=" + this.eventSource + ')';
    }

    public MobileOfficialAppsVideoStat$TypeVideoDownloadClick(String str, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, Long l, MobileOfficialAppsVideoStat$VideoEventSource mobileOfficialAppsVideoStat$VideoEventSource) {
        this.value = str;
        this.screenMode = mobileOfficialAppsVideoStat$TypeScreenMode;
        this.clientTime = l;
        this.eventSource = mobileOfficialAppsVideoStat$VideoEventSource;
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoDownloadClick(String str, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, Long l, MobileOfficialAppsVideoStat$VideoEventSource mobileOfficialAppsVideoStat$VideoEventSource, int i, zcl zclVar) {
        this((i & 1) != 0 ? "click_to_download_button" : str, (i & 2) != 0 ? null : mobileOfficialAppsVideoStat$TypeScreenMode, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : mobileOfficialAppsVideoStat$VideoEventSource);
    }
}
