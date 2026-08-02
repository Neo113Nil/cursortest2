package com.unity3d.ads.core.data.model;

import com.unity3d.ads.LogLevel;
import com.unity3d.ads.MediationInfo;
import java.util.Map;
import xsna.epx;
import xsna.jgp;
import xsna.qoy;
import xsna.v11;
import xsna.zcl;

/* compiled from: InitializationConfigurationInternal.kt */
/* loaded from: classes14.dex */
public final class InitializationConfigurationInternal {
    private final Map<String, String> extras;
    private final String gameId;
    private final boolean isTestModeEnabled;
    private final LogLevel logLevel;
    private final MediationInfo mediationInfo;

    public InitializationConfigurationInternal(String str, boolean z, LogLevel logLevel, Map<String, String> map, MediationInfo mediationInfo) {
        this.gameId = str;
        this.isTestModeEnabled = z;
        this.logLevel = logLevel;
        this.extras = map;
        this.mediationInfo = mediationInfo;
    }

    public static /* synthetic */ InitializationConfigurationInternal copy$default(InitializationConfigurationInternal initializationConfigurationInternal, String str, boolean z, LogLevel logLevel, Map map, MediationInfo mediationInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = initializationConfigurationInternal.gameId;
        }
        if ((i & 2) != 0) {
            z = initializationConfigurationInternal.isTestModeEnabled;
        }
        if ((i & 4) != 0) {
            logLevel = initializationConfigurationInternal.logLevel;
        }
        if ((i & 8) != 0) {
            map = initializationConfigurationInternal.extras;
        }
        if ((i & 16) != 0) {
            mediationInfo = initializationConfigurationInternal.mediationInfo;
        }
        MediationInfo mediationInfo2 = mediationInfo;
        LogLevel logLevel2 = logLevel;
        return initializationConfigurationInternal.copy(str, z, logLevel2, map, mediationInfo2);
    }

    public final String component1() {
        return this.gameId;
    }

    public final boolean component2() {
        return this.isTestModeEnabled;
    }

    public final LogLevel component3() {
        return this.logLevel;
    }

    public final Map<String, String> component4() {
        return this.extras;
    }

    public final MediationInfo component5() {
        return this.mediationInfo;
    }

    public final InitializationConfigurationInternal copy(String str, boolean z, LogLevel logLevel, Map<String, String> map, MediationInfo mediationInfo) {
        return new InitializationConfigurationInternal(str, z, logLevel, map, mediationInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitializationConfigurationInternal)) {
            return false;
        }
        InitializationConfigurationInternal initializationConfigurationInternal = (InitializationConfigurationInternal) obj;
        return epx.f(this.gameId, initializationConfigurationInternal.gameId) && this.isTestModeEnabled == initializationConfigurationInternal.isTestModeEnabled && this.logLevel == initializationConfigurationInternal.logLevel && epx.f(this.extras, initializationConfigurationInternal.extras) && epx.f(this.mediationInfo, initializationConfigurationInternal.mediationInfo);
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final String getGameId() {
        return this.gameId;
    }

    public final LogLevel getLogLevel() {
        return this.logLevel;
    }

    public final MediationInfo getMediationInfo() {
        return this.mediationInfo;
    }

    public int hashCode() {
        int a = v11.a((this.logLevel.hashCode() + qoy.b(this.gameId.hashCode() * 31, 31, this.isTestModeEnabled)) * 31, 31, this.extras);
        MediationInfo mediationInfo = this.mediationInfo;
        return a + (mediationInfo == null ? 0 : mediationInfo.hashCode());
    }

    public final boolean isTestModeEnabled() {
        return this.isTestModeEnabled;
    }

    public String toString() {
        return "InitializationConfigurationInternal(gameId=" + this.gameId + ", isTestModeEnabled=" + this.isTestModeEnabled + ", logLevel=" + this.logLevel + ", extras=" + this.extras + ", mediationInfo=" + this.mediationInfo + ')';
    }

    public /* synthetic */ InitializationConfigurationInternal(String str, boolean z, LogLevel logLevel, Map map, MediationInfo mediationInfo, int i, zcl zclVar) {
        this(str, z, (i & 4) != 0 ? LogLevel.INFO : logLevel, (i & 8) != 0 ? jgp.b : map, (i & 16) != 0 ? null : mediationInfo);
    }
}
