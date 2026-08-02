package com.unity3d.ads;

import java.util.Map;
import xsna.jgp;
import xsna.zcl;

/* compiled from: InitializationConfiguration.kt */
/* loaded from: classes14.dex */
public final class InitializationConfiguration {
    private final Map<String, String> extras;
    private final String gameId;
    private final boolean isTestModeEnabled;
    private final LogLevel logLevel;
    private final MediationInfo mediationInfo;

    /* compiled from: InitializationConfiguration.kt */
    public static final class Builder {
        private final String gameId;
        private boolean isTestModeEnabled;
        private MediationInfo mediationInfo;
        private LogLevel logLevel = LogLevel.INFO;
        private Map<String, String> extras = jgp.b;

        public Builder(String str) {
            this.gameId = str;
        }

        public final InitializationConfiguration build() {
            return new InitializationConfiguration(this.gameId, this.isTestModeEnabled, this.logLevel, this.extras, this.mediationInfo);
        }

        public final Builder withExtras(Map<String, String> map) {
            this.extras = map;
            return this;
        }

        public final Builder withLogLevel(LogLevel logLevel) {
            this.logLevel = logLevel;
            return this;
        }

        public final Builder withMediationInfo(MediationInfo mediationInfo) {
            this.mediationInfo = mediationInfo;
            return this;
        }

        public final Builder withTestMode(boolean z) {
            this.isTestModeEnabled = z;
            return this;
        }
    }

    public InitializationConfiguration(String str, boolean z, LogLevel logLevel, Map<String, String> map, MediationInfo mediationInfo) {
        this.gameId = str;
        this.isTestModeEnabled = z;
        this.logLevel = logLevel;
        this.extras = map;
        this.mediationInfo = mediationInfo;
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

    public final boolean isTestModeEnabled() {
        return this.isTestModeEnabled;
    }

    public /* synthetic */ InitializationConfiguration(String str, boolean z, LogLevel logLevel, Map map, MediationInfo mediationInfo, int i, zcl zclVar) {
        this(str, z, (i & 4) != 0 ? LogLevel.INFO : logLevel, (i & 8) != 0 ? jgp.b : map, (i & 16) != 0 ? null : mediationInfo);
    }
}
