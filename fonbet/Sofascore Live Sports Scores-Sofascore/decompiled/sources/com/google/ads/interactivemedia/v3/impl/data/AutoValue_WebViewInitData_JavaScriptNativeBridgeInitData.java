package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.impl.data.WebViewInitData;
import defpackage.bf3;
import defpackage.fn0;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_WebViewInitData_JavaScriptNativeBridgeInitData extends WebViewInitData.JavaScriptNativeBridgeInitData {
    private final Long adTimeUpdateMs;
    private final Long appSetIdTimeoutMs;
    private final WebViewInitData.JavaScriptNativeBridgeInitData.ConsentSettingsConfig consentSettingsConfig;
    private final Boolean disableAppSetId;
    private final Boolean disableJsIdLessEvaluation;
    private final Boolean enableGks;
    private final Boolean enableInstrumentation;
    private final Boolean enableOmidJsManagedSessions;
    private final Boolean enableSeparateWebviewForDai;
    private final Integer espAdapterTimeoutMs;
    private final List<String> espAdapters;
    private final List<String> gksDaiNativeXhrApps;
    private final List<String> gksFirstPartyAdServers;
    private final Integer gksTimeoutMs;
    private final Set<String> jsConsentCheckRequiredParameters;
    private final Integer msParameterTimeoutMs;
    private final Integer platformSignalCollectorTimeoutMs;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder extends WebViewInitData.JavaScriptNativeBridgeInitData.Builder {
        private Long adTimeUpdateMs;
        private Long appSetIdTimeoutMs;
        private WebViewInitData.JavaScriptNativeBridgeInitData.ConsentSettingsConfig consentSettingsConfig;
        private Boolean disableAppSetId;
        private Boolean disableJsIdLessEvaluation;
        private Boolean enableGks;
        private Boolean enableInstrumentation;
        private Boolean enableOmidJsManagedSessions;
        private Boolean enableSeparateWebviewForDai;
        private Integer espAdapterTimeoutMs;
        private List<String> espAdapters;
        private List<String> gksDaiNativeXhrApps;
        private List<String> gksFirstPartyAdServers;
        private Integer gksTimeoutMs;
        private Set<String> jsConsentCheckRequiredParameters;
        private Integer msParameterTimeoutMs;
        private Integer platformSignalCollectorTimeoutMs;

        @Override // com.google.ads.interactivemedia.v3.impl.data.WebViewInitData.JavaScriptNativeBridgeInitData.Builder
        public WebViewInitData.JavaScriptNativeBridgeInitData build() {
            return new AutoValue_WebViewInitData_JavaScriptNativeBridgeInitData(this.adTimeUpdateMs, this.appSetIdTimeoutMs, this.enableInstrumentation, this.enableOmidJsManagedSessions, this.disableAppSetId, this.disableJsIdLessEvaluation, this.enableGks, this.gksFirstPartyAdServers, this.gksDaiNativeXhrApps, this.gksTimeoutMs, this.msParameterTimeoutMs, this.espAdapters, this.espAdapterTimeoutMs, this.platformSignalCollectorTimeoutMs, this.consentSettingsConfig, this.jsConsentCheckRequiredParameters, this.enableSeparateWebviewForDai, null);
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.WebViewInitData.JavaScriptNativeBridgeInitData.Builder
        public WebViewInitData.JavaScriptNativeBridgeInitData.Builder setAdTimeUpdateMs(Long l) {
            this.adTimeUpdateMs = l;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.WebViewInitData.JavaScriptNativeBridgeInitData.Builder
        public WebViewInitData.JavaScriptNativeBridgeInitData.Builder setAppSetIdTimeoutMs(Long l) {
            this.appSetIdTimeoutMs = l;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.WebViewInitData.JavaScriptNativeBridgeInitData.Builder
        public WebViewInitData.JavaScriptNativeBridgeInitData.Builder setConsentSettingsConfig(WebViewInitData.JavaScriptNativeBridgeInitData.ConsentSettingsConfig consentSettingsConfig) {
            this.consentSettingsConfig = consentSettingsConfig;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.WebViewInitData.JavaScriptNativeBridgeInitData.Builder
        public WebViewInitData.JavaScriptNativeBridgeInitData.Builder setDisableAppSetId(Boolean bool) {
            this.disableAppSetId = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.WebViewInitData.JavaScriptNativeBridgeInitData.Builder
        public WebViewInitData.JavaScriptNativeBridgeInitData.Builder setDisableJsIdLessEvaluation(Boolean bool) {
            this.disableJsIdLessEvaluation = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.WebViewInitData.JavaScriptNativeBridgeInitData.Builder
        public WebViewInitData.JavaScriptNativeBridgeInitData.Builder setEnableGks(Boolean bool) {
            this.enableGks = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.WebViewInitData.JavaScriptNativeBridgeInitData.Builder
        public WebViewInitData.JavaScriptNativeBridgeInitData.Builder setEnableInstrumentation(Boolean bool) {
            this.enableInstrumentation = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.WebViewInitData.JavaScriptNativeBridgeInitData.Builder
        public WebViewInitData.JavaScriptNativeBridgeInitData.Builder setEnableOmidJsManagedSessions(Boolean bool) {
            this.enableOmidJsManagedSessions = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.WebViewInitData.JavaScriptNativeBridgeInitData.Builder
        public WebViewInitData.JavaScriptNativeBridgeInitData.Builder setEnableSeparateWebviewForDai(Boolean bool) {
            this.enableSeparateWebviewForDai = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.WebViewInitData.JavaScriptNativeBridgeInitData.Builder
        public WebViewInitData.JavaScriptNativeBridgeInitData.Builder setEspAdapterTimeoutMs(Integer num) {
            this.espAdapterTimeoutMs = num;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.WebViewInitData.JavaScriptNativeBridgeInitData.Builder
        public WebViewInitData.JavaScriptNativeBridgeInitData.Builder setEspAdapters(List<String> list) {
            this.espAdapters = list;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.WebViewInitData.JavaScriptNativeBridgeInitData.Builder
        public WebViewInitData.JavaScriptNativeBridgeInitData.Builder setGksDaiNativeXhrApps(List<String> list) {
            this.gksDaiNativeXhrApps = list;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.WebViewInitData.JavaScriptNativeBridgeInitData.Builder
        public WebViewInitData.JavaScriptNativeBridgeInitData.Builder setGksFirstPartyAdServers(List<String> list) {
            this.gksFirstPartyAdServers = list;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.WebViewInitData.JavaScriptNativeBridgeInitData.Builder
        public WebViewInitData.JavaScriptNativeBridgeInitData.Builder setGksTimeoutMs(Integer num) {
            this.gksTimeoutMs = num;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.WebViewInitData.JavaScriptNativeBridgeInitData.Builder
        public WebViewInitData.JavaScriptNativeBridgeInitData.Builder setJsConsentCheckRequiredParameters(Set<String> set) {
            this.jsConsentCheckRequiredParameters = set;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.WebViewInitData.JavaScriptNativeBridgeInitData.Builder
        public WebViewInitData.JavaScriptNativeBridgeInitData.Builder setMsParameterTimeoutMs(Integer num) {
            this.msParameterTimeoutMs = num;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.WebViewInitData.JavaScriptNativeBridgeInitData.Builder
        public WebViewInitData.JavaScriptNativeBridgeInitData.Builder setPlatformSignalCollectorTimeoutMs(Integer num) {
            this.platformSignalCollectorTimeoutMs = num;
            return this;
        }
    }

    private AutoValue_WebViewInitData_JavaScriptNativeBridgeInitData(Long l, Long l2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, List<String> list, List<String> list2, Integer num, Integer num2, List<String> list3, Integer num3, Integer num4, WebViewInitData.JavaScriptNativeBridgeInitData.ConsentSettingsConfig consentSettingsConfig, Set<String> set, Boolean bool6) {
        this.adTimeUpdateMs = l;
        this.appSetIdTimeoutMs = l2;
        this.enableInstrumentation = bool;
        this.enableOmidJsManagedSessions = bool2;
        this.disableAppSetId = bool3;
        this.disableJsIdLessEvaluation = bool4;
        this.enableGks = bool5;
        this.gksFirstPartyAdServers = list;
        this.gksDaiNativeXhrApps = list2;
        this.gksTimeoutMs = num;
        this.msParameterTimeoutMs = num2;
        this.espAdapters = list3;
        this.espAdapterTimeoutMs = num3;
        this.platformSignalCollectorTimeoutMs = num4;
        this.consentSettingsConfig = consentSettingsConfig;
        this.jsConsentCheckRequiredParameters = set;
        this.enableSeparateWebviewForDai = bool6;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.WebViewInitData.JavaScriptNativeBridgeInitData
    public Long adTimeUpdateMs() {
        return this.adTimeUpdateMs;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.WebViewInitData.JavaScriptNativeBridgeInitData
    public Long appSetIdTimeoutMs() {
        return this.appSetIdTimeoutMs;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.WebViewInitData.JavaScriptNativeBridgeInitData
    public WebViewInitData.JavaScriptNativeBridgeInitData.ConsentSettingsConfig consentSettingsConfig() {
        return this.consentSettingsConfig;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.WebViewInitData.JavaScriptNativeBridgeInitData
    public Boolean disableAppSetId() {
        return this.disableAppSetId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.WebViewInitData.JavaScriptNativeBridgeInitData
    public Boolean disableJsIdLessEvaluation() {
        return this.disableJsIdLessEvaluation;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.WebViewInitData.JavaScriptNativeBridgeInitData
    public Boolean enableGks() {
        return this.enableGks;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.WebViewInitData.JavaScriptNativeBridgeInitData
    public Boolean enableInstrumentation() {
        return this.enableInstrumentation;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.WebViewInitData.JavaScriptNativeBridgeInitData
    public Boolean enableOmidJsManagedSessions() {
        return this.enableOmidJsManagedSessions;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.WebViewInitData.JavaScriptNativeBridgeInitData
    public Boolean enableSeparateWebviewForDai() {
        return this.enableSeparateWebviewForDai;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof WebViewInitData.JavaScriptNativeBridgeInitData) {
            WebViewInitData.JavaScriptNativeBridgeInitData javaScriptNativeBridgeInitData = (WebViewInitData.JavaScriptNativeBridgeInitData) obj;
            Long l = this.adTimeUpdateMs;
            if (l != null ? l.equals(javaScriptNativeBridgeInitData.adTimeUpdateMs()) : javaScriptNativeBridgeInitData.adTimeUpdateMs() == null) {
                Long l2 = this.appSetIdTimeoutMs;
                if (l2 != null ? l2.equals(javaScriptNativeBridgeInitData.appSetIdTimeoutMs()) : javaScriptNativeBridgeInitData.appSetIdTimeoutMs() == null) {
                    Boolean bool = this.enableInstrumentation;
                    if (bool != null ? bool.equals(javaScriptNativeBridgeInitData.enableInstrumentation()) : javaScriptNativeBridgeInitData.enableInstrumentation() == null) {
                        Boolean bool2 = this.enableOmidJsManagedSessions;
                        if (bool2 != null ? bool2.equals(javaScriptNativeBridgeInitData.enableOmidJsManagedSessions()) : javaScriptNativeBridgeInitData.enableOmidJsManagedSessions() == null) {
                            Boolean bool3 = this.disableAppSetId;
                            if (bool3 != null ? bool3.equals(javaScriptNativeBridgeInitData.disableAppSetId()) : javaScriptNativeBridgeInitData.disableAppSetId() == null) {
                                Boolean bool4 = this.disableJsIdLessEvaluation;
                                if (bool4 != null ? bool4.equals(javaScriptNativeBridgeInitData.disableJsIdLessEvaluation()) : javaScriptNativeBridgeInitData.disableJsIdLessEvaluation() == null) {
                                    Boolean bool5 = this.enableGks;
                                    if (bool5 != null ? bool5.equals(javaScriptNativeBridgeInitData.enableGks()) : javaScriptNativeBridgeInitData.enableGks() == null) {
                                        List<String> list = this.gksFirstPartyAdServers;
                                        if (list != null ? list.equals(javaScriptNativeBridgeInitData.gksFirstPartyAdServers()) : javaScriptNativeBridgeInitData.gksFirstPartyAdServers() == null) {
                                            List<String> list2 = this.gksDaiNativeXhrApps;
                                            if (list2 != null ? list2.equals(javaScriptNativeBridgeInitData.gksDaiNativeXhrApps()) : javaScriptNativeBridgeInitData.gksDaiNativeXhrApps() == null) {
                                                Integer num = this.gksTimeoutMs;
                                                if (num != null ? num.equals(javaScriptNativeBridgeInitData.gksTimeoutMs()) : javaScriptNativeBridgeInitData.gksTimeoutMs() == null) {
                                                    Integer num2 = this.msParameterTimeoutMs;
                                                    if (num2 != null ? num2.equals(javaScriptNativeBridgeInitData.msParameterTimeoutMs()) : javaScriptNativeBridgeInitData.msParameterTimeoutMs() == null) {
                                                        List<String> list3 = this.espAdapters;
                                                        if (list3 != null ? list3.equals(javaScriptNativeBridgeInitData.espAdapters()) : javaScriptNativeBridgeInitData.espAdapters() == null) {
                                                            Integer num3 = this.espAdapterTimeoutMs;
                                                            if (num3 != null ? num3.equals(javaScriptNativeBridgeInitData.espAdapterTimeoutMs()) : javaScriptNativeBridgeInitData.espAdapterTimeoutMs() == null) {
                                                                Integer num4 = this.platformSignalCollectorTimeoutMs;
                                                                if (num4 != null ? num4.equals(javaScriptNativeBridgeInitData.platformSignalCollectorTimeoutMs()) : javaScriptNativeBridgeInitData.platformSignalCollectorTimeoutMs() == null) {
                                                                    WebViewInitData.JavaScriptNativeBridgeInitData.ConsentSettingsConfig consentSettingsConfig = this.consentSettingsConfig;
                                                                    if (consentSettingsConfig != null ? consentSettingsConfig.equals(javaScriptNativeBridgeInitData.consentSettingsConfig()) : javaScriptNativeBridgeInitData.consentSettingsConfig() == null) {
                                                                        Set<String> set = this.jsConsentCheckRequiredParameters;
                                                                        if (set != null ? set.equals(javaScriptNativeBridgeInitData.jsConsentCheckRequiredParameters()) : javaScriptNativeBridgeInitData.jsConsentCheckRequiredParameters() == null) {
                                                                            Boolean bool6 = this.enableSeparateWebviewForDai;
                                                                            if (bool6 != null ? bool6.equals(javaScriptNativeBridgeInitData.enableSeparateWebviewForDai()) : javaScriptNativeBridgeInitData.enableSeparateWebviewForDai() == null) {
                                                                                return true;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.WebViewInitData.JavaScriptNativeBridgeInitData
    public Integer espAdapterTimeoutMs() {
        return this.espAdapterTimeoutMs;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.WebViewInitData.JavaScriptNativeBridgeInitData
    public List<String> espAdapters() {
        return this.espAdapters;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.WebViewInitData.JavaScriptNativeBridgeInitData
    public List<String> gksDaiNativeXhrApps() {
        return this.gksDaiNativeXhrApps;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.WebViewInitData.JavaScriptNativeBridgeInitData
    public List<String> gksFirstPartyAdServers() {
        return this.gksFirstPartyAdServers;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.WebViewInitData.JavaScriptNativeBridgeInitData
    public Integer gksTimeoutMs() {
        return this.gksTimeoutMs;
    }

    public int hashCode() {
        Long l = this.adTimeUpdateMs;
        int hashCode = l == null ? 0 : l.hashCode();
        Long l2 = this.appSetIdTimeoutMs;
        int hashCode2 = l2 == null ? 0 : l2.hashCode();
        int i = hashCode ^ 1000003;
        Boolean bool = this.enableInstrumentation;
        int hashCode3 = ((((i * 1000003) ^ hashCode2) * 1000003) ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Boolean bool2 = this.enableOmidJsManagedSessions;
        int hashCode4 = (hashCode3 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
        Boolean bool3 = this.disableAppSetId;
        int hashCode5 = (hashCode4 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
        Boolean bool4 = this.disableJsIdLessEvaluation;
        int hashCode6 = (hashCode5 ^ (bool4 == null ? 0 : bool4.hashCode())) * 1000003;
        Boolean bool5 = this.enableGks;
        int hashCode7 = (hashCode6 ^ (bool5 == null ? 0 : bool5.hashCode())) * 1000003;
        List<String> list = this.gksFirstPartyAdServers;
        int hashCode8 = (hashCode7 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<String> list2 = this.gksDaiNativeXhrApps;
        int hashCode9 = (hashCode8 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Integer num = this.gksTimeoutMs;
        int hashCode10 = (hashCode9 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.msParameterTimeoutMs;
        int hashCode11 = (hashCode10 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        List<String> list3 = this.espAdapters;
        int hashCode12 = (hashCode11 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
        Integer num3 = this.espAdapterTimeoutMs;
        int hashCode13 = (hashCode12 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
        Integer num4 = this.platformSignalCollectorTimeoutMs;
        int hashCode14 = (hashCode13 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
        WebViewInitData.JavaScriptNativeBridgeInitData.ConsentSettingsConfig consentSettingsConfig = this.consentSettingsConfig;
        int hashCode15 = (hashCode14 ^ (consentSettingsConfig == null ? 0 : consentSettingsConfig.hashCode())) * 1000003;
        Set<String> set = this.jsConsentCheckRequiredParameters;
        int hashCode16 = (hashCode15 ^ (set == null ? 0 : set.hashCode())) * 1000003;
        Boolean bool6 = this.enableSeparateWebviewForDai;
        return hashCode16 ^ (bool6 != null ? bool6.hashCode() : 0);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.WebViewInitData.JavaScriptNativeBridgeInitData
    public Set<String> jsConsentCheckRequiredParameters() {
        return this.jsConsentCheckRequiredParameters;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.WebViewInitData.JavaScriptNativeBridgeInitData
    public Integer msParameterTimeoutMs() {
        return this.msParameterTimeoutMs;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.WebViewInitData.JavaScriptNativeBridgeInitData
    public Integer platformSignalCollectorTimeoutMs() {
        return this.platformSignalCollectorTimeoutMs;
    }

    public String toString() {
        Set<String> set = this.jsConsentCheckRequiredParameters;
        WebViewInitData.JavaScriptNativeBridgeInitData.ConsentSettingsConfig consentSettingsConfig = this.consentSettingsConfig;
        List<String> list = this.espAdapters;
        List<String> list2 = this.gksDaiNativeXhrApps;
        String valueOf = String.valueOf(this.gksFirstPartyAdServers);
        String valueOf2 = String.valueOf(list2);
        String valueOf3 = String.valueOf(list);
        String valueOf4 = String.valueOf(consentSettingsConfig);
        String valueOf5 = String.valueOf(set);
        Long l = this.adTimeUpdateMs;
        int length = String.valueOf(l).length();
        Long l2 = this.appSetIdTimeoutMs;
        int length2 = String.valueOf(l2).length();
        Boolean bool = this.enableInstrumentation;
        int length3 = String.valueOf(bool).length();
        Boolean bool2 = this.enableOmidJsManagedSessions;
        int length4 = String.valueOf(bool2).length();
        Boolean bool3 = this.disableAppSetId;
        int length5 = String.valueOf(bool3).length();
        Boolean bool4 = this.disableJsIdLessEvaluation;
        int length6 = String.valueOf(bool4).length();
        Boolean bool5 = this.enableGks;
        int length7 = String.valueOf(bool5).length();
        int length8 = valueOf.length();
        int length9 = valueOf2.length();
        Integer num = this.gksTimeoutMs;
        int length10 = String.valueOf(num).length();
        Integer num2 = this.msParameterTimeoutMs;
        int length11 = String.valueOf(num2).length();
        int length12 = valueOf3.length();
        Integer num3 = this.espAdapterTimeoutMs;
        int length13 = String.valueOf(num3).length();
        Integer num4 = this.platformSignalCollectorTimeoutMs;
        int length14 = String.valueOf(num4).length();
        int length15 = valueOf4.length();
        int length16 = valueOf5.length();
        Boolean bool6 = this.enableSeparateWebviewForDai;
        StringBuilder sb = new StringBuilder(length + 66 + length2 + 24 + length3 + 30 + length4 + 18 + length5 + 28 + length6 + 12 + length7 + 25 + length8 + 22 + length9 + 15 + length10 + 23 + length11 + 14 + length12 + 22 + length13 + 35 + length14 + 24 + length15 + 35 + length16 + 30 + String.valueOf(bool6).length() + 1);
        sb.append("JavaScriptNativeBridgeInitData{adTimeUpdateMs=");
        sb.append(l);
        sb.append(", appSetIdTimeoutMs=");
        sb.append(l2);
        sb.append(", enableInstrumentation=");
        sb.append(bool);
        sb.append(", enableOmidJsManagedSessions=");
        sb.append(bool2);
        sb.append(", disableAppSetId=");
        sb.append(bool3);
        sb.append(", disableJsIdLessEvaluation=");
        sb.append(bool4);
        sb.append(", enableGks=");
        sb.append(bool5);
        sb.append(", gksFirstPartyAdServers=");
        sb.append(valueOf);
        sb.append(", gksDaiNativeXhrApps=");
        sb.append(valueOf2);
        sb.append(", gksTimeoutMs=");
        sb.append(num);
        fn0.x(num2, ", msParameterTimeoutMs=", ", espAdapters=", valueOf3, sb);
        fn0.w(num3, num4, ", espAdapterTimeoutMs=", ", platformSignalCollectorTimeoutMs=", sb);
        bf3.v(sb, ", consentSettingsConfig=", valueOf4, ", jsConsentCheckRequiredParameters=", valueOf5);
        sb.append(", enableSeparateWebviewForDai=");
        sb.append(bool6);
        sb.append("}");
        return sb.toString();
    }

    public /* synthetic */ AutoValue_WebViewInitData_JavaScriptNativeBridgeInitData(Long l, Long l2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, List list, List list2, Integer num, Integer num2, List list3, Integer num3, Integer num4, WebViewInitData.JavaScriptNativeBridgeInitData.ConsentSettingsConfig consentSettingsConfig, Set set, Boolean bool6, byte[] bArr) {
        this(l, l2, bool, bool2, bool3, bool4, bool5, list, list2, num, num2, list3, num3, num4, consentSettingsConfig, set, bool6);
    }
}
