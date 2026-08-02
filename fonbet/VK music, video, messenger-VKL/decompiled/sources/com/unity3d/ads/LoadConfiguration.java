package com.unity3d.ads;

import java.util.Map;
import xsna.jgp;
import xsna.zcl;

/* compiled from: LoadConfiguration.kt */
/* loaded from: classes14.dex */
public final class LoadConfiguration {
    private final String adMarkup;
    private final Map<String, String> extras;
    private final String mediationAdUnitId;
    private final MediationInfo mediationInfo;
    private final String placementId;

    /* compiled from: LoadConfiguration.kt */
    public static final class Builder {
        private String adMarkup;
        private Map<String, String> extras = jgp.b;
        private String mediationAdUnitId;
        private MediationInfo mediationInfo;
        private final String placementId;

        public Builder(String str) {
            this.placementId = str;
        }

        public final LoadConfiguration build() {
            return new LoadConfiguration(this.placementId, this.adMarkup, this.mediationInfo, this.mediationAdUnitId, this.extras, null);
        }

        public final String getPlacementId() {
            return this.placementId;
        }

        public final Builder withAdMarkup(String str) {
            this.adMarkup = str;
            return this;
        }

        public final Builder withExtras(Map<String, String> map) {
            this.extras = map;
            return this;
        }

        public final Builder withMediationAdUnitId(String str) {
            this.mediationAdUnitId = str;
            return this;
        }

        public final Builder withMediationInfo(MediationInfo mediationInfo) {
            this.mediationInfo = mediationInfo;
            return this;
        }
    }

    public /* synthetic */ LoadConfiguration(String str, String str2, MediationInfo mediationInfo, String str3, Map map, zcl zclVar) {
        this(str, str2, mediationInfo, str3, map);
    }

    public final String getAdMarkup() {
        return this.adMarkup;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final String getMediationAdUnitId() {
        return this.mediationAdUnitId;
    }

    public final MediationInfo getMediationInfo() {
        return this.mediationInfo;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    private LoadConfiguration(String str, String str2, MediationInfo mediationInfo, String str3, Map<String, String> map) {
        this.placementId = str;
        this.adMarkup = str2;
        this.mediationInfo = mediationInfo;
        this.mediationAdUnitId = str3;
        this.extras = map;
    }
}
