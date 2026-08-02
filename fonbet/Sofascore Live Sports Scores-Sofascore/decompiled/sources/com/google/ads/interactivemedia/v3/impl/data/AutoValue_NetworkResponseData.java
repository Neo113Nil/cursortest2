package com.google.ads.interactivemedia.v3.impl.data;

import defpackage.bf3;
import defpackage.fn0;
import defpackage.wt3;
import defpackage.yhk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_NetworkResponseData extends NetworkResponseData {
    private final String content;
    private final String contentType;
    private final int errorCode;
    private final String id;

    public AutoValue_NetworkResponseData(String str, String str2, String str3, int i) {
        if (str == null) {
            yhk.s("Null id");
            throw null;
        }
        this.id = str;
        if (str2 == null) {
            yhk.s("Null content");
            throw null;
        }
        this.content = str2;
        if (str3 == null) {
            yhk.s("Null contentType");
            throw null;
        }
        this.contentType = str3;
        this.errorCode = i;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.NetworkResponseData
    public String content() {
        return this.content;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.NetworkResponseData
    public String contentType() {
        return this.contentType;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NetworkResponseData) {
            NetworkResponseData networkResponseData = (NetworkResponseData) obj;
            if (this.id.equals(networkResponseData.id()) && this.content.equals(networkResponseData.content()) && this.contentType.equals(networkResponseData.contentType()) && this.errorCode == networkResponseData.errorCode()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.NetworkResponseData
    public int errorCode() {
        return this.errorCode;
    }

    public int hashCode() {
        return this.errorCode ^ ((((((this.id.hashCode() ^ 1000003) * 1000003) ^ this.content.hashCode()) * 1000003) ^ this.contentType.hashCode()) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.NetworkResponseData
    public String id() {
        return this.id;
    }

    public String toString() {
        String str = this.id;
        int length = String.valueOf(str).length();
        String str2 = this.content;
        int length2 = String.valueOf(str2).length();
        String str3 = this.contentType;
        int length3 = String.valueOf(str3).length();
        int i = this.errorCode;
        StringBuilder sb = new StringBuilder(fn0.b(length, 33, length2, 14, length3, 12, String.valueOf(i).length()) + 1);
        bf3.v(sb, "NetworkResponseData{id=", str, ", content=", str2);
        wt3.t(i, ", contentType=", str3, ", errorCode=", sb);
        sb.append("}");
        return sb.toString();
    }
}
