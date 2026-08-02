package com.google.ads.interactivemedia.v3.impl.data;

import defpackage.fn0;
import defpackage.yhk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_MarketAppInfo extends MarketAppInfo {
    private final int appVersion;
    private final String packageName;

    public AutoValue_MarketAppInfo(int i, String str) {
        this.appVersion = i;
        if (str != null) {
            this.packageName = str;
        } else {
            yhk.s("Null packageName");
            throw null;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.MarketAppInfo
    public int appVersion() {
        return this.appVersion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MarketAppInfo) {
            MarketAppInfo marketAppInfo = (MarketAppInfo) obj;
            if (this.appVersion == marketAppInfo.appVersion() && this.packageName.equals(marketAppInfo.packageName())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.appVersion;
        return this.packageName.hashCode() ^ ((i ^ 1000003) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.MarketAppInfo
    public String packageName() {
        return this.packageName;
    }

    public String toString() {
        int i = this.appVersion;
        int length = String.valueOf(i).length();
        String str = this.packageName;
        StringBuilder sb = new StringBuilder(length + 39 + String.valueOf(str).length() + 1);
        fn0.s(i, "MarketAppInfo{appVersion=", ", packageName=", str, sb);
        sb.append("}");
        return sb.toString();
    }
}
