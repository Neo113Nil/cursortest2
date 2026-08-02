package com.google.ads.interactivemedia.v3.impl.data.customui;

import defpackage.bf3;
import defpackage.me4;
import defpackage.yhk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_JavaScriptUiFallbackImageData extends JavaScriptUiFallbackImageData {
    private final String altText;
    private final int height;
    private final String id;
    private final String program;
    private final String url;
    private final int width;

    public AutoValue_JavaScriptUiFallbackImageData(String str, String str2, String str3, String str4, int i, int i2) {
        if (str == null) {
            yhk.s("Null id");
            throw null;
        }
        this.id = str;
        if (str2 == null) {
            yhk.s("Null program");
            throw null;
        }
        this.program = str2;
        if (str3 == null) {
            yhk.s("Null url");
            throw null;
        }
        this.url = str3;
        if (str4 == null) {
            yhk.s("Null altText");
            throw null;
        }
        this.altText = str4;
        this.width = i;
        this.height = i2;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiFallbackImageData
    public String altText() {
        return this.altText;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof JavaScriptUiFallbackImageData) {
            JavaScriptUiFallbackImageData javaScriptUiFallbackImageData = (JavaScriptUiFallbackImageData) obj;
            if (this.id.equals(javaScriptUiFallbackImageData.id()) && this.program.equals(javaScriptUiFallbackImageData.program()) && this.url.equals(javaScriptUiFallbackImageData.url()) && this.altText.equals(javaScriptUiFallbackImageData.altText()) && this.width == javaScriptUiFallbackImageData.width() && this.height == javaScriptUiFallbackImageData.height()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.height ^ ((((((((((this.id.hashCode() ^ 1000003) * 1000003) ^ this.program.hashCode()) * 1000003) ^ this.url.hashCode()) * 1000003) ^ this.altText.hashCode()) * 1000003) ^ this.width) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiFallbackImageData
    public int height() {
        return this.height;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiFallbackImageData
    public String id() {
        return this.id;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiFallbackImageData
    public String program() {
        return this.program;
    }

    public String toString() {
        String str = this.id;
        int length = String.valueOf(str).length();
        String str2 = this.program;
        int length2 = String.valueOf(str2).length();
        String str3 = this.url;
        int length3 = String.valueOf(str3).length();
        String str4 = this.altText;
        int length4 = String.valueOf(str4).length();
        int i = this.width;
        int length5 = String.valueOf(i).length();
        int i2 = this.height;
        StringBuilder sb = new StringBuilder(length + 43 + length2 + 6 + length3 + 10 + length4 + 8 + length5 + 9 + String.valueOf(i2).length() + 1);
        bf3.v(sb, "JavaScriptUiFallbackImageData{id=", str, ", program=", str2);
        bf3.v(sb, ", url=", str3, ", altText=", str4);
        me4.r(sb, ", width=", i, ", height=", i2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiFallbackImageData
    public String url() {
        return this.url;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiFallbackImageData
    public int width() {
        return this.width;
    }
}
