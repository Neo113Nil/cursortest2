package com.unity3d.mediation;

import com.ironsource.C2545mb;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LevelPlayPrivacySettings {
    public static final LevelPlayPrivacySettings INSTANCE = new LevelPlayPrivacySettings();

    private LevelPlayPrivacySettings() {
    }

    @JvmStatic
    public static final void setCCPA(boolean z) {
        IronLog.API.info("LevelPlayPrivacySettings.setCCPA() value: " + z);
        C2545mb.c.b().a(z);
    }

    @JvmStatic
    public static final void setCOPPA(boolean z) {
        IronLog.API.info("LevelPlayPrivacySettings.setCOPPA() value: " + z);
        C2545mb.c.b().b(z);
    }

    @JvmStatic
    public static final void setGDPRConsents(Map<String, Boolean> networkConsents) {
        Intrinsics.checkNotNullParameter(networkConsents, "networkConsents");
        IronLog.API.info("LevelPlayPrivacySettings.setGDPRConsents() networkConsents: " + networkConsents);
        C2545mb.c.b().a(networkConsents);
    }
}
