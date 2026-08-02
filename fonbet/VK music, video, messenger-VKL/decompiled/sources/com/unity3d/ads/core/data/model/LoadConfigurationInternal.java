package com.unity3d.ads.core.data.model;

import com.unity3d.ads.MediationInfo;
import java.util.Map;
import xsna.cjl0;
import xsna.epx;
import xsna.jgp;
import xsna.zcl;

/* compiled from: LoadConfiguration.kt */
/* loaded from: classes14.dex */
public final class LoadConfigurationInternal {
    private final String adMarkup;
    private final Map<String, String> extras;
    private final String mediationAdUnitId;
    private final MediationInfo mediationInfo;
    private final String placementId;

    public LoadConfigurationInternal(String str, String str2, String str3, MediationInfo mediationInfo, Map<String, String> map) {
        this.placementId = str;
        this.adMarkup = str2;
        this.mediationAdUnitId = str3;
        this.mediationInfo = mediationInfo;
        this.extras = map;
    }

    public static /* synthetic */ LoadConfigurationInternal copy$default(LoadConfigurationInternal loadConfigurationInternal, String str, String str2, String str3, MediationInfo mediationInfo, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loadConfigurationInternal.placementId;
        }
        if ((i & 2) != 0) {
            str2 = loadConfigurationInternal.adMarkup;
        }
        if ((i & 4) != 0) {
            str3 = loadConfigurationInternal.mediationAdUnitId;
        }
        if ((i & 8) != 0) {
            mediationInfo = loadConfigurationInternal.mediationInfo;
        }
        if ((i & 16) != 0) {
            map = loadConfigurationInternal.extras;
        }
        Map map2 = map;
        String str4 = str3;
        return loadConfigurationInternal.copy(str, str2, str4, mediationInfo, map2);
    }

    public final String component1() {
        return this.placementId;
    }

    public final String component2() {
        return this.adMarkup;
    }

    public final String component3() {
        return this.mediationAdUnitId;
    }

    public final MediationInfo component4() {
        return this.mediationInfo;
    }

    public final Map<String, String> component5() {
        return this.extras;
    }

    public final LoadConfigurationInternal copy(String str, String str2, String str3, MediationInfo mediationInfo, Map<String, String> map) {
        return new LoadConfigurationInternal(str, str2, str3, mediationInfo, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadConfigurationInternal)) {
            return false;
        }
        LoadConfigurationInternal loadConfigurationInternal = (LoadConfigurationInternal) obj;
        return epx.f(this.placementId, loadConfigurationInternal.placementId) && epx.f(this.adMarkup, loadConfigurationInternal.adMarkup) && epx.f(this.mediationAdUnitId, loadConfigurationInternal.mediationAdUnitId) && epx.f(this.mediationInfo, loadConfigurationInternal.mediationInfo) && epx.f(this.extras, loadConfigurationInternal.extras);
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

    public int hashCode() {
        int hashCode = this.placementId.hashCode() * 31;
        String str = this.adMarkup;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mediationAdUnitId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MediationInfo mediationInfo = this.mediationInfo;
        return this.extras.hashCode() + ((hashCode3 + (mediationInfo != null ? mediationInfo.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LoadConfigurationInternal(placementId=");
        sb.append(this.placementId);
        sb.append(", adMarkup=");
        sb.append(this.adMarkup);
        sb.append(", mediationAdUnitId=");
        sb.append(this.mediationAdUnitId);
        sb.append(", mediationInfo=");
        sb.append(this.mediationInfo);
        sb.append(", extras=");
        return cjl0.a(sb, this.extras, ')');
    }

    public /* synthetic */ LoadConfigurationInternal(String str, String str2, String str3, MediationInfo mediationInfo, Map map, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : mediationInfo, (i & 16) != 0 ? jgp.b : map);
    }
}
