package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData;
import defpackage.a70;
import defpackage.bf3;
import defpackage.z3p;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_ImaSdkSettingsData extends ImaSdkSettingsData {
    private final boolean autoPlayAdBreaks;
    private final boolean debugMode;
    private final z3p featureFlags;
    private final int numRedirects;
    private final String playerType;
    private final String playerVersion;
    private final String ppid;
    private final String sessionId;
    private final boolean supportsMultipleVideoDisplayChannels;
    private final TestingConfiguration testingConfig;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder extends ImaSdkSettingsData.Builder {
        private boolean autoPlayAdBreaks;
        private boolean debugMode;
        private z3p featureFlags;
        private int numRedirects;
        private String playerType;
        private String playerVersion;
        private String ppid;
        private String sessionId;
        private byte set$0;
        private boolean supportsMultipleVideoDisplayChannels;
        private TestingConfiguration testingConfig;

        @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData.Builder
        public ImaSdkSettingsData build() {
            if (this.set$0 == 15) {
                return new AutoValue_ImaSdkSettingsData(this.supportsMultipleVideoDisplayChannels, this.ppid, this.playerType, this.playerVersion, this.numRedirects, this.autoPlayAdBreaks, this.debugMode, this.sessionId, this.testingConfig, this.featureFlags, null);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.set$0 & 1) == 0) {
                sb.append(" supportsMultipleVideoDisplayChannels");
            }
            if ((this.set$0 & 2) == 0) {
                sb.append(" numRedirects");
            }
            if ((this.set$0 & 4) == 0) {
                sb.append(" autoPlayAdBreaks");
            }
            if ((this.set$0 & 8) == 0) {
                sb.append(" debugMode");
            }
            a70.r("Missing required properties:".concat(sb.toString()));
            return null;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData.Builder
        public ImaSdkSettingsData.Builder setAutoPlayAdBreaks(boolean z) {
            this.autoPlayAdBreaks = z;
            this.set$0 = (byte) (this.set$0 | 4);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData.Builder
        public ImaSdkSettingsData.Builder setDebugMode(boolean z) {
            this.debugMode = z;
            this.set$0 = (byte) (this.set$0 | 8);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData.Builder
        public ImaSdkSettingsData.Builder setFeatureFlags(Map<String, String> map) {
            this.featureFlags = map == null ? null : z3p.c(map);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData.Builder
        public ImaSdkSettingsData.Builder setNumRedirects(int i) {
            this.numRedirects = i;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData.Builder
        public ImaSdkSettingsData.Builder setPlayerType(String str) {
            this.playerType = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData.Builder
        public ImaSdkSettingsData.Builder setPlayerVersion(String str) {
            this.playerVersion = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData.Builder
        public ImaSdkSettingsData.Builder setPpid(String str) {
            this.ppid = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData.Builder
        public ImaSdkSettingsData.Builder setSessionId(String str) {
            this.sessionId = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData.Builder
        public ImaSdkSettingsData.Builder setSupportsMultipleVideoDisplayChannels(boolean z) {
            this.supportsMultipleVideoDisplayChannels = z;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData.Builder
        public ImaSdkSettingsData.Builder setTestingConfig(TestingConfiguration testingConfiguration) {
            this.testingConfig = testingConfiguration;
            return this;
        }
    }

    private AutoValue_ImaSdkSettingsData(boolean z, String str, String str2, String str3, int i, boolean z2, boolean z3, String str4, TestingConfiguration testingConfiguration, z3p z3pVar) {
        this.supportsMultipleVideoDisplayChannels = z;
        this.ppid = str;
        this.playerType = str2;
        this.playerVersion = str3;
        this.numRedirects = i;
        this.autoPlayAdBreaks = z2;
        this.debugMode = z3;
        this.sessionId = str4;
        this.testingConfig = testingConfiguration;
        this.featureFlags = z3pVar;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData
    public boolean autoPlayAdBreaks() {
        return this.autoPlayAdBreaks;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData
    public boolean debugMode() {
        return this.debugMode;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        TestingConfiguration testingConfiguration;
        z3p z3pVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImaSdkSettingsData) {
            ImaSdkSettingsData imaSdkSettingsData = (ImaSdkSettingsData) obj;
            if (this.supportsMultipleVideoDisplayChannels == imaSdkSettingsData.supportsMultipleVideoDisplayChannels() && ((str = this.ppid) != null ? str.equals(imaSdkSettingsData.ppid()) : imaSdkSettingsData.ppid() == null) && ((str2 = this.playerType) != null ? str2.equals(imaSdkSettingsData.playerType()) : imaSdkSettingsData.playerType() == null) && ((str3 = this.playerVersion) != null ? str3.equals(imaSdkSettingsData.playerVersion()) : imaSdkSettingsData.playerVersion() == null) && this.numRedirects == imaSdkSettingsData.numRedirects() && this.autoPlayAdBreaks == imaSdkSettingsData.autoPlayAdBreaks() && this.debugMode == imaSdkSettingsData.debugMode() && ((str4 = this.sessionId) != null ? str4.equals(imaSdkSettingsData.sessionId()) : imaSdkSettingsData.sessionId() == null) && ((testingConfiguration = this.testingConfig) != null ? testingConfiguration.equals(imaSdkSettingsData.testingConfig()) : imaSdkSettingsData.testingConfig() == null) && ((z3pVar = this.featureFlags) != null ? z3pVar.equals(imaSdkSettingsData.featureFlags()) : imaSdkSettingsData.featureFlags() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData
    public z3p featureFlags() {
        return this.featureFlags;
    }

    public int hashCode() {
        String str = this.ppid;
        int hashCode = (str == null ? 0 : str.hashCode()) ^ (((true != this.supportsMultipleVideoDisplayChannels ? 1237 : 1231) ^ 1000003) * 1000003);
        String str2 = this.playerType;
        int hashCode2 = ((hashCode * 1000003) ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.playerVersion;
        int hashCode3 = (((((((hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.numRedirects) * 1000003) ^ (true != this.autoPlayAdBreaks ? 1237 : 1231)) * 1000003) ^ (true != this.debugMode ? 1237 : 1231)) * 1000003;
        String str4 = this.sessionId;
        int hashCode4 = (hashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        TestingConfiguration testingConfiguration = this.testingConfig;
        int hashCode5 = (hashCode4 ^ (testingConfiguration == null ? 0 : testingConfiguration.hashCode())) * 1000003;
        z3p z3pVar = this.featureFlags;
        return hashCode5 ^ (z3pVar != null ? z3pVar.hashCode() : 0);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData
    public int numRedirects() {
        return this.numRedirects;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData
    public String playerType() {
        return this.playerType;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData
    public String playerVersion() {
        return this.playerVersion;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData
    public String ppid() {
        return this.ppid;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData
    public String sessionId() {
        return this.sessionId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData
    public boolean supportsMultipleVideoDisplayChannels() {
        return this.supportsMultipleVideoDisplayChannels;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData
    public TestingConfiguration testingConfig() {
        return this.testingConfig;
    }

    public String toString() {
        z3p z3pVar = this.featureFlags;
        String valueOf = String.valueOf(this.testingConfig);
        String valueOf2 = String.valueOf(z3pVar);
        boolean z = this.supportsMultipleVideoDisplayChannels;
        int length = String.valueOf(z).length();
        String str = this.ppid;
        int length2 = String.valueOf(str).length();
        String str2 = this.playerType;
        int length3 = String.valueOf(str2).length();
        String str3 = this.playerVersion;
        int length4 = String.valueOf(str3).length();
        int i = this.numRedirects;
        int length5 = String.valueOf(i).length();
        boolean z2 = this.autoPlayAdBreaks;
        int length6 = String.valueOf(z2).length();
        boolean z3 = this.debugMode;
        int length7 = String.valueOf(z3).length();
        String str4 = this.sessionId;
        int length8 = String.valueOf(str4).length();
        StringBuilder sb = new StringBuilder(length + 63 + length2 + 13 + length3 + 16 + length4 + 15 + length5 + 19 + length6 + 12 + length7 + 12 + length8 + 16 + valueOf.length() + 15 + valueOf2.length() + 1);
        sb.append("ImaSdkSettingsData{supportsMultipleVideoDisplayChannels=");
        sb.append(z);
        sb.append(", ppid=");
        sb.append(str);
        bf3.v(sb, ", playerType=", str2, ", playerVersion=", str3);
        sb.append(", numRedirects=");
        sb.append(i);
        sb.append(", autoPlayAdBreaks=");
        sb.append(z2);
        sb.append(", debugMode=");
        sb.append(z3);
        sb.append(", sessionId=");
        sb.append(str4);
        bf3.v(sb, ", testingConfig=", valueOf, ", featureFlags=", valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public /* synthetic */ AutoValue_ImaSdkSettingsData(boolean z, String str, String str2, String str3, int i, boolean z2, boolean z3, String str4, TestingConfiguration testingConfiguration, z3p z3pVar, byte[] bArr) {
        this(z, str, str2, str3, i, z2, z3, str4, testingConfiguration, z3pVar);
    }
}
