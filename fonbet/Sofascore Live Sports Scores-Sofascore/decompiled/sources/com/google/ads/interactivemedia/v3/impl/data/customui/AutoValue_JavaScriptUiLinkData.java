package com.google.ads.interactivemedia.v3.impl.data.customui;

import defpackage.bf3;
import defpackage.fn0;
import defpackage.yhk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_JavaScriptUiLinkData extends JavaScriptUiLinkData {
    private final String clickUrl;
    private final String id;
    private final boolean required;
    private final String text;

    public AutoValue_JavaScriptUiLinkData(String str, boolean z, String str2, String str3) {
        if (str == null) {
            yhk.s("Null id");
            throw null;
        }
        this.id = str;
        this.required = z;
        if (str2 == null) {
            yhk.s("Null text");
            throw null;
        }
        this.text = str2;
        if (str3 != null) {
            this.clickUrl = str3;
        } else {
            yhk.s("Null clickUrl");
            throw null;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiLinkData
    public String clickUrl() {
        return this.clickUrl;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof JavaScriptUiLinkData) {
            JavaScriptUiLinkData javaScriptUiLinkData = (JavaScriptUiLinkData) obj;
            if (this.id.equals(javaScriptUiLinkData.id()) && this.required == javaScriptUiLinkData.required() && this.text.equals(javaScriptUiLinkData.text()) && this.clickUrl.equals(javaScriptUiLinkData.clickUrl())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.clickUrl.hashCode() ^ ((((((this.id.hashCode() ^ 1000003) * 1000003) ^ (true != this.required ? 1237 : 1231)) * 1000003) ^ this.text.hashCode()) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiLinkData
    public String id() {
        return this.id;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiLinkData
    public boolean required() {
        return this.required;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiLinkData
    public String text() {
        return this.text;
    }

    public String toString() {
        String str = this.id;
        int length = String.valueOf(str).length();
        boolean z = this.required;
        int length2 = String.valueOf(z).length();
        String str2 = this.text;
        int length3 = String.valueOf(str2).length();
        String str3 = this.clickUrl;
        StringBuilder sb = new StringBuilder(fn0.b(length, 35, length2, 7, length3, 11, String.valueOf(str3).length()) + 1);
        sb.append("JavaScriptUiLinkData{id=");
        sb.append(str);
        sb.append(", required=");
        sb.append(z);
        bf3.v(sb, ", text=", str2, ", clickUrl=", str3);
        sb.append("}");
        return sb.toString();
    }
}
