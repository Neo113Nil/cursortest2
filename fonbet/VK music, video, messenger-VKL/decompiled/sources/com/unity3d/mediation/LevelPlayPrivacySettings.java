package com.unity3d.mediation;

import com.ironsource.C4459nb;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;

/* loaded from: classes14.dex */
public final class LevelPlayPrivacySettings {
    public static final LevelPlayPrivacySettings INSTANCE = new LevelPlayPrivacySettings();

    private LevelPlayPrivacySettings() {
    }

    public static final void setCCPA(boolean z) {
        IronLog.API.info("LevelPlayPrivacySettings.setCCPA() value: " + z);
        C4459nb.c.b().a(z);
    }

    public static final void setCOPPA(boolean z) {
        IronLog.API.info("LevelPlayPrivacySettings.setCOPPA() value: " + z);
        C4459nb.c.b().b(z);
    }

    public static final void setGDPRConsents(Map<String, Boolean> map) {
        IronLog.API.info("LevelPlayPrivacySettings.setGDPRConsents() networkConsents: " + map);
        C4459nb.c.b().a(map);
    }
}
