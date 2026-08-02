package com.unity3d.ads.adplayer;

import java.util.Map;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.zcl;

/* compiled from: AndroidShowOptions.kt */
/* loaded from: classes14.dex */
public final class AndroidShowOptions implements ShowOptions {
    private final boolean isOfferwallAd;
    private final String offerwallPlacementName;
    private final String placementId;
    private final Map<String, Object> unityAdsShowOptions;

    public AndroidShowOptions(Map<String, ? extends Object> map, String str, boolean z, String str2) {
        this.unityAdsShowOptions = map;
        this.placementId = str;
        this.isOfferwallAd = z;
        this.offerwallPlacementName = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AndroidShowOptions copy$default(AndroidShowOptions androidShowOptions, Map map, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            map = androidShowOptions.unityAdsShowOptions;
        }
        if ((i & 2) != 0) {
            str = androidShowOptions.placementId;
        }
        if ((i & 4) != 0) {
            z = androidShowOptions.isOfferwallAd;
        }
        if ((i & 8) != 0) {
            str2 = androidShowOptions.offerwallPlacementName;
        }
        return androidShowOptions.copy(map, str, z, str2);
    }

    public final Map<String, Object> component1() {
        return this.unityAdsShowOptions;
    }

    public final String component2() {
        return this.placementId;
    }

    public final boolean component3() {
        return this.isOfferwallAd;
    }

    public final String component4() {
        return this.offerwallPlacementName;
    }

    public final AndroidShowOptions copy(Map<String, ? extends Object> map, String str, boolean z, String str2) {
        return new AndroidShowOptions(map, str, z, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidShowOptions)) {
            return false;
        }
        AndroidShowOptions androidShowOptions = (AndroidShowOptions) obj;
        return epx.f(this.unityAdsShowOptions, androidShowOptions.unityAdsShowOptions) && epx.f(this.placementId, androidShowOptions.placementId) && this.isOfferwallAd == androidShowOptions.isOfferwallAd && epx.f(this.offerwallPlacementName, androidShowOptions.offerwallPlacementName);
    }

    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final Map<String, Object> getUnityAdsShowOptions() {
        return this.unityAdsShowOptions;
    }

    public int hashCode() {
        Map<String, Object> map = this.unityAdsShowOptions;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        String str = this.placementId;
        int b = qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isOfferwallAd);
        String str2 = this.offerwallPlacementName;
        return b + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isOfferwallAd() {
        return this.isOfferwallAd;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AndroidShowOptions(unityAdsShowOptions=");
        sb.append(this.unityAdsShowOptions);
        sb.append(", placementId=");
        sb.append(this.placementId);
        sb.append(", isOfferwallAd=");
        sb.append(this.isOfferwallAd);
        sb.append(", offerwallPlacementName=");
        return ho8.a(sb, this.offerwallPlacementName, ')');
    }

    public /* synthetic */ AndroidShowOptions(Map map, String str, boolean z, String str2, int i, zcl zclVar) {
        this(map, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str2);
    }
}
