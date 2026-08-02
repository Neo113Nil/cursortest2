package com.google.ads.interactivemedia.v3.impl.data.customui;

import defpackage.wt3;
import defpackage.yhk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_JavaScriptUiLabelData extends JavaScriptUiLabelData {
    private final String id;
    private final boolean required;
    private final String text;

    public AutoValue_JavaScriptUiLabelData(String str, boolean z, String str2) {
        if (str == null) {
            yhk.s("Null id");
            throw null;
        }
        this.id = str;
        this.required = z;
        if (str2 != null) {
            this.text = str2;
        } else {
            yhk.s("Null text");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof JavaScriptUiLabelData) {
            JavaScriptUiLabelData javaScriptUiLabelData = (JavaScriptUiLabelData) obj;
            if (this.id.equals(javaScriptUiLabelData.id()) && this.required == javaScriptUiLabelData.required() && this.text.equals(javaScriptUiLabelData.text())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() ^ 1000003;
        return this.text.hashCode() ^ (((hashCode * 1000003) ^ (true != this.required ? 1237 : 1231)) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiLabelData
    public String id() {
        return this.id;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiLabelData
    public boolean required() {
        return this.required;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiLabelData
    public String text() {
        return this.text;
    }

    public String toString() {
        String str = this.id;
        int length = String.valueOf(str).length();
        boolean z = this.required;
        int length2 = String.valueOf(z).length();
        String str2 = this.text;
        StringBuilder sb = new StringBuilder(wt3.h(length, 36, length2, 7, String.valueOf(str2).length()) + 1);
        sb.append("JavaScriptUiLabelData{id=");
        sb.append(str);
        sb.append(", required=");
        sb.append(z);
        return wt3.m(", text=", str2, sb, "}");
    }
}
