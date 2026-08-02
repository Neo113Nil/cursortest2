package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.Nullable;
import defpackage.bf3;
import defpackage.fn0;
import defpackage.yhk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_IdentifierInfo extends IdentifierInfo {
    private final String adsIdentityToken;
    private final String appSetId;
    private final int appSetIdScope;

    @Nullable
    private final String deviceId;
    private final String idType;
    private final boolean isLimitedAdTracking;

    public AutoValue_IdentifierInfo(@Nullable String str, String str2, boolean z, String str3, int i, String str4) {
        this.deviceId = str;
        if (str2 == null) {
            yhk.s("Null idType");
            throw null;
        }
        this.idType = str2;
        this.isLimitedAdTracking = z;
        if (str3 == null) {
            yhk.s("Null appSetId");
            throw null;
        }
        this.appSetId = str3;
        this.appSetIdScope = i;
        if (str4 != null) {
            this.adsIdentityToken = str4;
        } else {
            yhk.s("Null adsIdentityToken");
            throw null;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.IdentifierInfo
    public String adsIdentityToken() {
        return this.adsIdentityToken;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.IdentifierInfo
    public String appSetId() {
        return this.appSetId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.IdentifierInfo
    public int appSetIdScope() {
        return this.appSetIdScope;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.IdentifierInfo
    @Nullable
    public String deviceId() {
        return this.deviceId;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IdentifierInfo) {
            IdentifierInfo identifierInfo = (IdentifierInfo) obj;
            String str = this.deviceId;
            if (str != null ? str.equals(identifierInfo.deviceId()) : identifierInfo.deviceId() == null) {
                if (this.idType.equals(identifierInfo.idType()) && this.isLimitedAdTracking == identifierInfo.isLimitedAdTracking() && this.appSetId.equals(identifierInfo.appSetId()) && this.appSetIdScope == identifierInfo.appSetIdScope() && this.adsIdentityToken.equals(identifierInfo.adsIdentityToken())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.deviceId;
        return this.adsIdentityToken.hashCode() ^ (((((((((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.idType.hashCode()) * 1000003) ^ (true != this.isLimitedAdTracking ? 1237 : 1231)) * 1000003) ^ this.appSetId.hashCode()) * 1000003) ^ this.appSetIdScope) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.IdentifierInfo
    public String idType() {
        return this.idType;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.IdentifierInfo
    public boolean isLimitedAdTracking() {
        return this.isLimitedAdTracking;
    }

    public String toString() {
        String str = this.deviceId;
        int length = String.valueOf(str).length();
        String str2 = this.idType;
        int length2 = String.valueOf(str2).length();
        boolean z = this.isLimitedAdTracking;
        int length3 = String.valueOf(z).length();
        String str3 = this.appSetId;
        int length4 = String.valueOf(str3).length();
        int i = this.appSetIdScope;
        int length5 = String.valueOf(i).length();
        String str4 = this.adsIdentityToken;
        StringBuilder sb = new StringBuilder(length + 33 + length2 + 22 + length3 + 11 + length4 + 16 + length5 + 19 + String.valueOf(str4).length() + 1);
        bf3.v(sb, "IdentifierInfo{deviceId=", str, ", idType=", str2);
        sb.append(", isLimitedAdTracking=");
        sb.append(z);
        sb.append(", appSetId=");
        sb.append(str3);
        fn0.s(i, ", appSetIdScope=", ", adsIdentityToken=", str4, sb);
        sb.append("}");
        return sb.toString();
    }
}
