package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.Nullable;
import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import defpackage.a70;
import defpackage.fn0;
import defpackage.q3p;
import defpackage.wt3;
import defpackage.z3p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_TestingConfiguration extends TestingConfiguration {
    private final boolean disableExperiments;
    private final boolean disableOnScreenDetection;
    private final boolean disableSkipFadeTransition;
    private final boolean enableMonitorAppLifecycle;
    private final boolean enableStrictJsonParsing;

    @Nullable
    private final z3p extraParams;
    private final boolean forceAndroidTvMode;

    @Nullable
    private final q3p forceExperimentIds;
    private final boolean forceTvMode;
    private final boolean ignoreStrictModeFalsePositives;
    private final boolean useTestStreamManager;
    private final boolean useVideoElementMock;
    private final float videoElementMockDuration;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder implements TestingConfiguration.Builder {
        private boolean disableExperiments;
        private boolean disableOnScreenDetection;
        private boolean disableSkipFadeTransition;
        private boolean enableMonitorAppLifecycle;
        private boolean enableStrictJsonParsing;
        private z3p extraParams;
        private boolean forceAndroidTvMode;
        private q3p forceExperimentIds;
        private boolean forceTvMode;
        private boolean ignoreStrictModeFalsePositives;
        private short set$0;
        private boolean useTestStreamManager;
        private boolean useVideoElementMock;
        private float videoElementMockDuration;

        @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
        public TestingConfiguration build() {
            if (this.set$0 == 2047) {
                return new AutoValue_TestingConfiguration(this.disableExperiments, this.disableOnScreenDetection, this.disableSkipFadeTransition, this.forceExperimentIds, this.useVideoElementMock, this.videoElementMockDuration, this.useTestStreamManager, this.enableMonitorAppLifecycle, this.forceTvMode, this.forceAndroidTvMode, this.ignoreStrictModeFalsePositives, this.enableStrictJsonParsing, this.extraParams, null);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.set$0 & 1) == 0) {
                sb.append(" disableExperiments");
            }
            if ((this.set$0 & 2) == 0) {
                sb.append(" disableOnScreenDetection");
            }
            if ((this.set$0 & 4) == 0) {
                sb.append(" disableSkipFadeTransition");
            }
            if ((this.set$0 & 8) == 0) {
                sb.append(" useVideoElementMock");
            }
            if ((this.set$0 & 16) == 0) {
                sb.append(" videoElementMockDuration");
            }
            if ((this.set$0 & 32) == 0) {
                sb.append(" useTestStreamManager");
            }
            if ((this.set$0 & 64) == 0) {
                sb.append(" enableMonitorAppLifecycle");
            }
            if ((this.set$0 & 128) == 0) {
                sb.append(" forceTvMode");
            }
            if ((this.set$0 & 256) == 0) {
                sb.append(" forceAndroidTvMode");
            }
            if ((this.set$0 & 512) == 0) {
                sb.append(" ignoreStrictModeFalsePositives");
            }
            if ((this.set$0 & 1024) == 0) {
                sb.append(" enableStrictJsonParsing");
            }
            a70.r("Missing required properties:".concat(sb.toString()));
            return null;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
        public TestingConfiguration.Builder disableExperiments(boolean z) {
            this.disableExperiments = z;
            this.set$0 = (short) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
        public TestingConfiguration.Builder disableOnScreenDetection(boolean z) {
            this.disableOnScreenDetection = z;
            this.set$0 = (short) (this.set$0 | 2);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
        public TestingConfiguration.Builder disableSkipFadeTransition(boolean z) {
            this.disableSkipFadeTransition = z;
            this.set$0 = (short) (this.set$0 | 4);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
        public TestingConfiguration.Builder enableMonitorAppLifecycle(boolean z) {
            this.enableMonitorAppLifecycle = z;
            this.set$0 = (short) (this.set$0 | 64);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
        public TestingConfiguration.Builder enableStrictJsonParsing(boolean z) {
            this.enableStrictJsonParsing = z;
            this.set$0 = (short) (this.set$0 | 1024);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
        public TestingConfiguration.Builder extraParams(z3p z3pVar) {
            this.extraParams = z3pVar;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
        public TestingConfiguration.Builder forceAndroidTvMode(boolean z) {
            this.forceAndroidTvMode = z;
            this.set$0 = (short) (this.set$0 | 256);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
        public TestingConfiguration.Builder forceExperimentIds(q3p q3pVar) {
            this.forceExperimentIds = q3pVar;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
        public TestingConfiguration.Builder forceTvMode(boolean z) {
            this.forceTvMode = z;
            this.set$0 = (short) (this.set$0 | 128);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
        public TestingConfiguration.Builder ignoreStrictModeFalsePositives(boolean z) {
            this.ignoreStrictModeFalsePositives = z;
            this.set$0 = (short) (this.set$0 | 512);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
        public TestingConfiguration.Builder useTestStreamManager(boolean z) {
            this.useTestStreamManager = z;
            this.set$0 = (short) (this.set$0 | 32);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
        public TestingConfiguration.Builder useVideoElementMock(boolean z) {
            this.useVideoElementMock = z;
            this.set$0 = (short) (this.set$0 | 8);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
        public TestingConfiguration.Builder videoElementMockDuration(float f) {
            this.videoElementMockDuration = f;
            this.set$0 = (short) (this.set$0 | 16);
            return this;
        }
    }

    private AutoValue_TestingConfiguration(boolean z, boolean z2, boolean z3, @Nullable q3p q3pVar, boolean z4, float f, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, @Nullable z3p z3pVar) {
        this.disableExperiments = z;
        this.disableOnScreenDetection = z2;
        this.disableSkipFadeTransition = z3;
        this.forceExperimentIds = q3pVar;
        this.useVideoElementMock = z4;
        this.videoElementMockDuration = f;
        this.useTestStreamManager = z5;
        this.enableMonitorAppLifecycle = z6;
        this.forceTvMode = z7;
        this.forceAndroidTvMode = z8;
        this.ignoreStrictModeFalsePositives = z9;
        this.enableStrictJsonParsing = z10;
        this.extraParams = z3pVar;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean disableExperiments() {
        return this.disableExperiments;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean disableOnScreenDetection() {
        return this.disableOnScreenDetection;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean disableSkipFadeTransition() {
        return this.disableSkipFadeTransition;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean enableMonitorAppLifecycle() {
        return this.enableMonitorAppLifecycle;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean enableStrictJsonParsing() {
        return this.enableStrictJsonParsing;
    }

    public boolean equals(Object obj) {
        q3p q3pVar;
        z3p z3pVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof TestingConfiguration) {
            TestingConfiguration testingConfiguration = (TestingConfiguration) obj;
            if (this.disableExperiments == testingConfiguration.disableExperiments() && this.disableOnScreenDetection == testingConfiguration.disableOnScreenDetection() && this.disableSkipFadeTransition == testingConfiguration.disableSkipFadeTransition() && ((q3pVar = this.forceExperimentIds) != null ? q3pVar.equals(testingConfiguration.forceExperimentIds()) : testingConfiguration.forceExperimentIds() == null) && this.useVideoElementMock == testingConfiguration.useVideoElementMock() && Float.floatToIntBits(this.videoElementMockDuration) == Float.floatToIntBits(testingConfiguration.videoElementMockDuration()) && this.useTestStreamManager == testingConfiguration.useTestStreamManager() && this.enableMonitorAppLifecycle == testingConfiguration.enableMonitorAppLifecycle() && this.forceTvMode == testingConfiguration.forceTvMode() && this.forceAndroidTvMode == testingConfiguration.forceAndroidTvMode() && this.ignoreStrictModeFalsePositives == testingConfiguration.ignoreStrictModeFalsePositives() && this.enableStrictJsonParsing == testingConfiguration.enableStrictJsonParsing() && ((z3pVar = this.extraParams) != null ? z3pVar.equals(testingConfiguration.extraParams()) : testingConfiguration.extraParams() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    @Nullable
    public z3p extraParams() {
        return this.extraParams;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean forceAndroidTvMode() {
        return this.forceAndroidTvMode;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    @Nullable
    public q3p forceExperimentIds() {
        return this.forceExperimentIds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean forceTvMode() {
        return this.forceTvMode;
    }

    public int hashCode() {
        q3p q3pVar = this.forceExperimentIds;
        int hashCode = ((((((((((((((((((q3pVar == null ? 0 : q3pVar.hashCode()) ^ (((((((true != this.disableExperiments ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.disableOnScreenDetection ? 1237 : 1231)) * 1000003) ^ (true != this.disableSkipFadeTransition ? 1237 : 1231)) * 1000003)) * 1000003) ^ (true != this.useVideoElementMock ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.videoElementMockDuration)) * 1000003) ^ (true != this.useTestStreamManager ? 1237 : 1231)) * 1000003) ^ (true != this.enableMonitorAppLifecycle ? 1237 : 1231)) * 1000003) ^ (true != this.forceTvMode ? 1237 : 1231)) * 1000003) ^ (true != this.forceAndroidTvMode ? 1237 : 1231)) * 1000003) ^ (true != this.ignoreStrictModeFalsePositives ? 1237 : 1231)) * 1000003) ^ (true != this.enableStrictJsonParsing ? 1237 : 1231)) * 1000003;
        z3p z3pVar = this.extraParams;
        return hashCode ^ (z3pVar != null ? z3pVar.hashCode() : 0);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean ignoreStrictModeFalsePositives() {
        return this.ignoreStrictModeFalsePositives;
    }

    public String toString() {
        z3p z3pVar = this.extraParams;
        String valueOf = String.valueOf(this.forceExperimentIds);
        String valueOf2 = String.valueOf(z3pVar);
        boolean z = this.disableExperiments;
        int length = String.valueOf(z).length();
        boolean z2 = this.disableOnScreenDetection;
        int length2 = String.valueOf(z2).length();
        boolean z3 = this.disableSkipFadeTransition;
        int length3 = String.valueOf(z3).length();
        int length4 = valueOf.length();
        boolean z4 = this.useVideoElementMock;
        int length5 = String.valueOf(z4).length();
        float f = this.videoElementMockDuration;
        int length6 = String.valueOf(f).length();
        boolean z5 = this.useTestStreamManager;
        int length7 = String.valueOf(z5).length();
        boolean z6 = this.enableMonitorAppLifecycle;
        int length8 = String.valueOf(z6).length();
        boolean z7 = this.forceTvMode;
        int length9 = String.valueOf(z7).length();
        boolean z8 = this.forceAndroidTvMode;
        int length10 = String.valueOf(z8).length();
        boolean z9 = this.ignoreStrictModeFalsePositives;
        int length11 = String.valueOf(z9).length();
        boolean z10 = this.enableStrictJsonParsing;
        StringBuilder sb = new StringBuilder(length + 67 + length2 + 28 + length3 + 21 + length4 + 22 + length5 + 27 + length6 + 23 + length7 + 28 + length8 + 14 + length9 + 21 + length10 + 33 + length11 + 26 + String.valueOf(z10).length() + 14 + valueOf2.length() + 1);
        fn0.y("TestingConfiguration{disableExperiments=", ", disableOnScreenDetection=", sb, z, z2);
        sb.append(", disableSkipFadeTransition=");
        sb.append(z3);
        sb.append(", forceExperimentIds=");
        sb.append(valueOf);
        sb.append(", useVideoElementMock=");
        sb.append(z4);
        sb.append(", videoElementMockDuration=");
        sb.append(f);
        fn0.y(", useTestStreamManager=", ", enableMonitorAppLifecycle=", sb, z5, z6);
        fn0.y(", forceTvMode=", ", forceAndroidTvMode=", sb, z7, z8);
        fn0.y(", ignoreStrictModeFalsePositives=", ", enableStrictJsonParsing=", sb, z9, z10);
        return wt3.m(", extraParams=", valueOf2, sb, "}");
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean useTestStreamManager() {
        return this.useTestStreamManager;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean useVideoElementMock() {
        return this.useVideoElementMock;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public float videoElementMockDuration() {
        return this.videoElementMockDuration;
    }

    public /* synthetic */ AutoValue_TestingConfiguration(boolean z, boolean z2, boolean z3, q3p q3pVar, boolean z4, float f, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, z3p z3pVar, byte[] bArr) {
        this(z, z2, z3, q3pVar, z4, f, z5, z6, z7, z8, z9, z10, z3pVar);
    }
}
