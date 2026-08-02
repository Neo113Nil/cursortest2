package com.google.ads.interactivemedia.v3.impl.data.customui;

import defpackage.bf3;
import defpackage.fn0;
import defpackage.me4;
import defpackage.yhk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_JavaScriptUiImageData extends JavaScriptUiImageData {
    private final String altText;
    private final int height;
    private final String url;
    private final int width;

    public AutoValue_JavaScriptUiImageData(String str, String str2, int i, int i2) {
        if (str == null) {
            yhk.s("Null url");
            throw null;
        }
        this.url = str;
        if (str2 == null) {
            yhk.s("Null altText");
            throw null;
        }
        this.altText = str2;
        this.width = i;
        this.height = i2;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiImageData
    public String altText() {
        return this.altText;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof JavaScriptUiImageData) {
            JavaScriptUiImageData javaScriptUiImageData = (JavaScriptUiImageData) obj;
            if (this.url.equals(javaScriptUiImageData.url()) && this.altText.equals(javaScriptUiImageData.altText()) && this.width == javaScriptUiImageData.width() && this.height == javaScriptUiImageData.height()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.height ^ ((((((this.url.hashCode() ^ 1000003) * 1000003) ^ this.altText.hashCode()) * 1000003) ^ this.width) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiImageData
    public int height() {
        return this.height;
    }

    public String toString() {
        String str = this.url;
        int length = String.valueOf(str).length();
        String str2 = this.altText;
        int length2 = String.valueOf(str2).length();
        int i = this.width;
        int length3 = String.valueOf(i).length();
        int i2 = this.height;
        StringBuilder sb = new StringBuilder(fn0.b(length, 36, length2, 8, length3, 9, String.valueOf(i2).length()) + 1);
        bf3.v(sb, "JavaScriptUiImageData{url=", str, ", altText=", str2);
        me4.r(sb, ", width=", i, ", height=", i2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiImageData
    public String url() {
        return this.url;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiImageData
    public int width() {
        return this.width;
    }
}
