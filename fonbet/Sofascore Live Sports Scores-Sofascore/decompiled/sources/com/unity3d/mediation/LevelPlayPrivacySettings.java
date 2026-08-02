package com.unity3d.mediation;

import com.ironsource.C4164kb;
import com.ironsource.mediationsdk.logger.IronLog;
import defpackage.wx4;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class LevelPlayPrivacySettings {

    @NotNull
    public static final LevelPlayPrivacySettings INSTANCE = new LevelPlayPrivacySettings();

    private LevelPlayPrivacySettings() {
    }

    public static final void setCCPA(boolean z) {
        IronLog.API.info("LevelPlayPrivacySettings.setCCPA() value: " + z);
        C4164kb.d.a().a(z);
    }

    public static final void setCOPPA(boolean z) {
        IronLog.API.info("LevelPlayPrivacySettings.setCOPPA() value: " + z);
        C4164kb.d.a().b(z);
    }

    public static final void setGDPRConsent(boolean z) {
        IronLog.API.info("LevelPlayPrivacySettings.setGDPRConsent() consent: " + z);
        C4164kb.d.a().c(z);
    }

    @wx4
    public static final void setGDPRConsents(@NotNull Map<String, Boolean> map) {
        map.getClass();
        IronLog.API.info("LevelPlayPrivacySettings.setGDPRConsents() networkConsents: " + map);
        C4164kb.d.a().a(map);
    }
}
