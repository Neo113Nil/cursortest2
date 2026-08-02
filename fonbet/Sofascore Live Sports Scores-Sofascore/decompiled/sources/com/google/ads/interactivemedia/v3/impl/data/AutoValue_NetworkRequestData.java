package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.Nullable;
import com.google.ads.interactivemedia.v3.impl.data.NetworkRequestData;
import defpackage.bf3;
import defpackage.fn0;
import defpackage.wt3;
import defpackage.yhk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_NetworkRequestData extends NetworkRequestData {
    private final int connectionTimeoutMs;

    @Nullable
    private final String content;
    private final String id;
    private final int readTimeoutMs;
    private final NetworkRequestData.RequestType requestType;
    private final String url;
    private final String userAgent;

    public AutoValue_NetworkRequestData(NetworkRequestData.RequestType requestType, String str, String str2, @Nullable String str3, String str4, int i, int i2) {
        if (requestType == null) {
            yhk.s("Null requestType");
            throw null;
        }
        this.requestType = requestType;
        if (str == null) {
            yhk.s("Null id");
            throw null;
        }
        this.id = str;
        if (str2 == null) {
            yhk.s("Null url");
            throw null;
        }
        this.url = str2;
        this.content = str3;
        if (str4 == null) {
            yhk.s("Null userAgent");
            throw null;
        }
        this.userAgent = str4;
        this.connectionTimeoutMs = i;
        this.readTimeoutMs = i2;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.NetworkRequestData
    public int connectionTimeoutMs() {
        return this.connectionTimeoutMs;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.NetworkRequestData
    @Nullable
    public String content() {
        return this.content;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof NetworkRequestData) {
            NetworkRequestData networkRequestData = (NetworkRequestData) obj;
            if (this.requestType.equals(networkRequestData.requestType()) && this.id.equals(networkRequestData.id()) && this.url.equals(networkRequestData.url()) && ((str = this.content) != null ? str.equals(networkRequestData.content()) : networkRequestData.content() == null) && this.userAgent.equals(networkRequestData.userAgent()) && this.connectionTimeoutMs == networkRequestData.connectionTimeoutMs() && this.readTimeoutMs == networkRequestData.readTimeoutMs()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.requestType.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.url.hashCode();
        String str = this.content;
        return this.readTimeoutMs ^ (((((((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.userAgent.hashCode()) * 1000003) ^ this.connectionTimeoutMs) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.NetworkRequestData
    public String id() {
        return this.id;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.NetworkRequestData
    public int readTimeoutMs() {
        return this.readTimeoutMs;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.NetworkRequestData
    public NetworkRequestData.RequestType requestType() {
        return this.requestType;
    }

    public String toString() {
        String valueOf = String.valueOf(this.requestType);
        int length = valueOf.length();
        String str = this.id;
        int length2 = String.valueOf(str).length();
        String str2 = this.url;
        int length3 = String.valueOf(str2).length();
        String str3 = this.content;
        int length4 = String.valueOf(str3).length();
        String str4 = this.userAgent;
        int length5 = String.valueOf(str4).length();
        int i = this.connectionTimeoutMs;
        int length6 = String.valueOf(i).length();
        int i2 = this.readTimeoutMs;
        StringBuilder sb = new StringBuilder(length + 36 + length2 + 6 + length3 + 10 + length4 + 12 + length5 + 22 + length6 + 16 + String.valueOf(i2).length() + 1);
        bf3.v(sb, "NetworkRequestData{requestType=", valueOf, ", id=", str);
        bf3.v(sb, ", url=", str2, ", content=", str3);
        wt3.t(i, ", userAgent=", str4, ", connectionTimeoutMs=", sb);
        return fn0.k(i2, ", readTimeoutMs=", "}", sb);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.NetworkRequestData
    public String url() {
        return this.url;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.NetworkRequestData
    public String userAgent() {
        return this.userAgent;
    }
}
