package com.google.ads.interactivemedia.v3.impl.data.customui;

import defpackage.yhk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_JavaScriptUiElementData extends JavaScriptUiElementData {
    private final String id;
    private final boolean required;

    public AutoValue_JavaScriptUiElementData(String str, boolean z) {
        if (str == null) {
            yhk.s("Null id");
            throw null;
        }
        this.id = str;
        this.required = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof JavaScriptUiElementData) {
            JavaScriptUiElementData javaScriptUiElementData = (JavaScriptUiElementData) obj;
            if (this.id.equals(javaScriptUiElementData.id()) && this.required == javaScriptUiElementData.required()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (true != this.required ? 1237 : 1231) ^ ((this.id.hashCode() ^ 1000003) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiElementData
    public String id() {
        return this.id;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiElementData
    public boolean required() {
        return this.required;
    }

    public String toString() {
        String str = this.id;
        int length = String.valueOf(str).length();
        boolean z = this.required;
        StringBuilder sb = new StringBuilder(length + 38 + String.valueOf(z).length() + 1);
        sb.append("JavaScriptUiElementData{id=");
        sb.append(str);
        sb.append(", required=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
