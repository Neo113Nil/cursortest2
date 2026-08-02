package com.google.ads.interactivemedia.v3.impl.data;

import defpackage.bf3;
import defpackage.fn0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_RequestLoadedAssetData extends RequestLoadedAssetData {
    private final String context;
    private final String requestData;
    private final String responseData;
    private final Boolean waitOnMonitoringWebview;

    public AutoValue_RequestLoadedAssetData(String str, String str2, String str3, Boolean bool) {
        this.requestData = str;
        this.responseData = str2;
        this.context = str3;
        this.waitOnMonitoringWebview = bool;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.RequestLoadedAssetData
    public String context() {
        return this.context;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RequestLoadedAssetData) {
            RequestLoadedAssetData requestLoadedAssetData = (RequestLoadedAssetData) obj;
            String str = this.requestData;
            if (str != null ? str.equals(requestLoadedAssetData.requestData()) : requestLoadedAssetData.requestData() == null) {
                String str2 = this.responseData;
                if (str2 != null ? str2.equals(requestLoadedAssetData.responseData()) : requestLoadedAssetData.responseData() == null) {
                    String str3 = this.context;
                    if (str3 != null ? str3.equals(requestLoadedAssetData.context()) : requestLoadedAssetData.context() == null) {
                        Boolean bool = this.waitOnMonitoringWebview;
                        if (bool != null ? bool.equals(requestLoadedAssetData.waitOnMonitoringWebview()) : requestLoadedAssetData.waitOnMonitoringWebview() == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.requestData;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.responseData;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = hashCode ^ 1000003;
        String str3 = this.context;
        int hashCode3 = ((((i * 1000003) ^ hashCode2) * 1000003) ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        Boolean bool = this.waitOnMonitoringWebview;
        return hashCode3 ^ (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.RequestLoadedAssetData
    public String requestData() {
        return this.requestData;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.RequestLoadedAssetData
    public String responseData() {
        return this.responseData;
    }

    public String toString() {
        String str = this.requestData;
        int length = String.valueOf(str).length();
        String str2 = this.responseData;
        int length2 = String.valueOf(str2).length();
        String str3 = this.context;
        int length3 = String.valueOf(str3).length();
        Boolean bool = this.waitOnMonitoringWebview;
        StringBuilder sb = new StringBuilder(fn0.b(length, 50, length2, 10, length3, 26, String.valueOf(bool).length()) + 1);
        bf3.v(sb, "RequestLoadedAssetData{requestData=", str, ", responseData=", str2);
        sb.append(", context=");
        sb.append(str3);
        sb.append(", waitOnMonitoringWebview=");
        sb.append(bool);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.RequestLoadedAssetData
    public Boolean waitOnMonitoringWebview() {
        return this.waitOnMonitoringWebview;
    }
}
